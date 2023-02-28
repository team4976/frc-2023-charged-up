package frc.robot.robotcode.auto.autoSubCommands;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.robotConstants;
import frc.robot.robotcode.subsystems.robotDrive;
import com.kauailabs.navx.frc.AHRS;
import edu.wpi.first.wpilibj.SPI;

import java.lang.Math;

public class autoNavXGryoscope extends CommandBase {
    robotDrive _robotDrive;
    double duration;
    double multiplier=0.01;

    public autoNavXGryoscope (robotDrive _robotDrive, double duration) {
        this._robotDrive=_robotDrive;
        this.duration=duration;
        addRequirements(_robotDrive);
    }


    public void autoBalance () {
        float yAngle = robotConstants.navX.getRoll();
        
        if (Math.abs(yAngle)>robotConstants.navXDeadBand){
            _robotDrive.setArcadeDrive((multiplier*yAngle), 0);
        }

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
