package frc.robot.robotcode.auto.autoSubCommands;
import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.robotConstants;
import frc.robot.limelight.subsystems.LimeLight;
import frc.robot.robotcode.subsystems.robotDrive;
// import com.kauailabs.navx.frc.AHRS;
// import edu.wpi.first.wpilibj.SPI;

public class limelightGryo extends CommandBase {
    robotDrive _robotDrive;
    double multiplier=0.0005;
    float yAngle=0;
    double angleOff;
    double speed;

    public limelightGryo (robotDrive _robotDrive, Boolean intakeSide) {
        this._robotDrive=_robotDrive;
        addRequirements(_robotDrive);
        if(intakeSide){
            speed = -.15;
        }
        else{
            speed = .15;
        }
    }

    @Override
    public void execute () {
        _robotDrive.setArcadeDrive(speed, 0);
    }

    @Override 
    public boolean isFinished () {
       // return (LimeLight.isVaildPipe7());
       return (LimeLight.angleYOff() >-15 && LimeLight.angleYOff()<0);
    }

    
}
