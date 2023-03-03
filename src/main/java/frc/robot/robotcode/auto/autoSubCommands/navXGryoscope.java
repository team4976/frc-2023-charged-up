package frc.robot.robotcode.auto.autoSubCommands;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.robotConstants;
import frc.robot.robotcode.subsystems.robotDrive;
import com.kauailabs.navx.frc.AHRS;
import edu.wpi.first.wpilibj.SPI;

import java.lang.Math;

public class navXGryoscope extends CommandBase {
    robotDrive _robotDrive;
    double multiplier=0.05;
    float yAngle=0;
    public static float startAngle=0;

    public navXGryoscope (robotDrive _robotDrive) {
        this._robotDrive=_robotDrive;
        addRequirements(_robotDrive);
    }


    public void autoBalance () {
        getCurrentYAngle();
        if (Math.abs(yAngle)>robotConstants.navXDeadBand){
            _robotDrive.setArcadeDrive((multiplier*yAngle), 0);
            // System.out.println(multiplier*yAngle);
        }

    }

    // public static void zeroYAngle () {
    //     startAngle = robotConstants.navX.getRoll();
    // }

    public void getCurrentYAngle () {
        yAngle = robotConstants.navX.getYaw();
    }

    @Override
    public void execute () {
        autoBalance();
    }

    // @Override 
    // public boolean isFinished () {
    //     return true;
    // }

    
}
