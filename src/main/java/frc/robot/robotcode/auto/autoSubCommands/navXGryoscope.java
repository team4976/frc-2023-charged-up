package frc.robot.robotcode.auto.autoSubCommands;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.robotConstants;
import frc.robot.robotcode.subsystems.robotDrive;
// import com.kauailabs.navx.frc.AHRS;
// import edu.wpi.first.wpilibj.SPI;

import java.lang.Math;

public class navXGryoscope extends CommandBase {
    robotDrive _robotDrive;
    double multiplier=0.005, output=0;;
    float yAngle=0;
    public static float startAngle=0;

    public float startTime;

    public navXGryoscope (robotDrive _robotDrive) {
        this._robotDrive=_robotDrive;
        addRequirements(_robotDrive);
    }


    public void autoBalance () {
        getCurrentYAngle();
        if (Math.abs(yAngle)>robotConstants.navXDeadBand){
            _robotDrive.setArcadeDrive(output, 0);
           
        }
        // test
        // if (yAngle>robotConstants.navXDeadBandTEST+20){
        //     _robotDrive.setArcadeDrive((-0.3), 0);
        // }
        // else if(yAngle<-robotConstants.navXDeadBand-20){
        //     _robotDrive.setArcadeDrive((.3), 0);
        // }
        // else{
        //     _robotDrive.setArcadeDrive(0, 0);
        // }

    }

    // public static void zeroYAngle () {
    //     startAngle = robotConstants.navX.getRoll();
    // }

    public void getCurrentYAngle () {
        yAngle = -robotConstants.navX.getYaw();
    }

    @Override
    public void execute () {
        autoBalance();
        //System.out.println(yAngle);
    }

    //TEST
    @Override 
    public boolean isFinished () {
        if(Math.abs(yAngle) < 10){  
            if(Math.abs(startTime - System.currentTimeMillis())>1000 ){
                return true;
            }
        }
        else{
            startTime = System.currentTimeMillis();
        }
        return false;
    }

    
}
