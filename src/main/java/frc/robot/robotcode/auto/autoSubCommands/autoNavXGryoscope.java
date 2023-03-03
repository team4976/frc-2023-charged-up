package frc.robot.robotcode.auto.autoSubCommands;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.robotConstants;
import frc.robot.robotcode.subsystems.robotDrive;
import com.kauailabs.navx.frc.AHRS;
import edu.wpi.first.wpilibj.SPI;

import java.lang.Math;

public class autoNavXGryoscope extends CommandBase {
    robotDrive _robotDrive;
    double multiplier=0.0005;
    float yAngle=0;
    public static float startAngle=0;
    double duration;

    public autoNavXGryoscope (robotDrive _robotDrive, double duration) {
        this._robotDrive=_robotDrive;
        this.duration=duration;
        addRequirements(_robotDrive);
    }


    public void autoBalance () {
        getCurrentYAngle();
        if (Math.abs(yAngle)>robotConstants.navXDeadBand){
            _robotDrive.setArcadeDrive(Math.min(0.005, multiplier*yAngle), 0);
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

    @Override 
    public boolean isFinished () {
        return new delay(duration).isFinished();
    }

    
}
