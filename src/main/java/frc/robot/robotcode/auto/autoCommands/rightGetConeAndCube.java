package frc.robot.robotcode.auto.autoCommands;

// import edu.wpi.first.wpilibj2.command.ParallelCommandGroup;
// import edu.wpi.first.wpilibj2.command.ParallelDeadlineGroup;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.robotConstants;
// import frc.robot.limelight.commands.aim;
import frc.robot.limelight.subsystems.LimeLight;
import frc.robot.robotcode.auto.autoSubCommands.autoAim;
// import frc.robot.robotcode.auto.autoSubCommands.autoAim;
import frc.robot.robotcode.auto.autoSubCommands.autoArmHighPos;
import frc.robot.robotcode.auto.autoSubCommands.autoArmHomePos;
import frc.robot.robotcode.auto.autoSubCommands.autoCuberetract;
import frc.robot.robotcode.auto.autoSubCommands.autoDrivePos;
import frc.robot.robotcode.auto.autoSubCommands.autoDrivePosAndRotation;
import frc.robot.robotcode.auto.autoSubCommands.autoGrab;
import frc.robot.robotcode.auto.autoSubCommands.autoHandOffCube;
import frc.robot.robotcode.auto.autoSubCommands.autoIntake;
import frc.robot.robotcode.auto.autoSubCommands.autoIntakeRetract;
// import frc.robot.robotcode.auto.autoSubCommands.autoNavXGryoscope;
import frc.robot.robotcode.auto.autoSubCommands.autoRelease;
import frc.robot.robotcode.auto.autoSubCommands.autoRotateOnPos;
import frc.robot.robotcode.auto.autoSubCommands.delay;
// import frc.robot.robotcode.commands.armHighPos;
// import frc.robot.robotcode.commands.armHomePos;
import frc.robot.robotcode.commands.extendFourBar;
import frc.robot.robotcode.commands.retract;
import frc.robot.robotcode.commands.retractFourBar;
import frc.robot.robotcode.subsystems.hand_off;
import frc.robot.robotcode.subsystems.intake;
// import frc.robot.robotcode.commands.scorePiece;
import frc.robot.robotcode.subsystems.robotDrive;
import frc.robot.robotcode.subsystems.scoring;

public class rightGetConeAndCube extends SequentialCommandGroup {

    public rightGetConeAndCube (robotDrive _robotDrive, scoring _score,  LimeLight _limelight, hand_off _hand_off, intake _intake)  {
        
        addCommands(
            new autoGrab(_score),
            new autoArmHighPos(_score),
            new extendFourBar(_score),
            new autoRelease(_score),
            new retractFourBar(_score),
            new autoArmHomePos(_score),
            new autoDrivePosAndRotation(_robotDrive, 50000, 54000),//24000 was tested //24750
            new autoIntake(_intake, true),
            new autoDrivePos(_robotDrive, 7000),
            new autoIntakeRetract(_intake, true),
            new autoDrivePosAndRotation(_robotDrive, -8000, -12600),
            new autoDrivePos(_robotDrive, -49000),//24000 was tested
            new autoCuberetract(_intake),
            new autoHandOffCube(_hand_off, _intake),
            new delay(0.3),
            new autoGrab(_score),
            new delay(0.3),
            new autoIntakeRetract(_intake, false),
            new autoArmHighPos(_score),
            new extendFourBar(_score),
            new delay(0.5),
            new autoRelease(_score),
            new delay(.2),
            new retractFourBar(_score),
            new autoArmHomePos(_score)
        );

    }
    
}
