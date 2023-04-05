package frc.robot.robotcode.auto.autoCommands;

// import edu.wpi.first.wpilibj2.command.ParallelCommandGroup;
// import edu.wpi.first.wpilibj2.command.ParallelDeadlineGroup;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
// import frc.robot.limelight.commands.aim;
import frc.robot.limelight.subsystems.LimeLight;
// import frc.robot.robotcode.auto.autoSubCommands.autoAim;
import frc.robot.robotcode.auto.autoSubCommands.autoArmHighPos;
import frc.robot.robotcode.auto.autoSubCommands.autoArmHomePos;
import frc.robot.robotcode.auto.autoSubCommands.autoDrivePos;
import frc.robot.robotcode.auto.autoSubCommands.autoDriveSlowPos;
import frc.robot.robotcode.auto.autoSubCommands.autoGrab;
import frc.robot.robotcode.auto.autoSubCommands.autoHoldPosition;
import frc.robot.robotcode.auto.autoSubCommands.autoIntake;
import frc.robot.robotcode.auto.autoSubCommands.autoIntakeRetract;
// import frc.robot.robotcode.auto.autoSubCommands.autoNavXGryoscope;
import frc.robot.robotcode.auto.autoSubCommands.autoRelease;
import frc.robot.robotcode.auto.autoSubCommands.delay;
// import frc.robot.robotcode.commands.armHighPos;
// import frc.robot.robotcode.commands.armHomePos;
import frc.robot.robotcode.commands.extendFourBar;
import frc.robot.robotcode.commands.retractFourBar;
import frc.robot.robotcode.subsystems.intake;
// import frc.robot.robotcode.commands.scorePiece;
import frc.robot.robotcode.subsystems.robotDrive;
import frc.robot.robotcode.subsystems.scoring;

public class testGet1HighLeaveAndBalanceAuto extends SequentialCommandGroup {

    public testGet1HighLeaveAndBalanceAuto (robotDrive _robotDrive, scoring _score,  LimeLight _limelight, intake _intake)  {
        System.out.println("testGet1HighLeaveAndBalanceAuto");

        addCommands(
            new autoGrab(_score),
            // new delay(0.10),
            new autoArmHighPos(_score),
          //   new delay(0.01),
            new extendFourBar(_score),
             //new delay(.2),
            new autoRelease(_score),
            new delay(0.10),
            new retractFourBar(_score),
             // new delay(0.500),
            new autoArmHomePos(_score),
            new autoDriveSlowPos(_robotDrive, 54000),//54000 was tested
            new autoIntake(_intake, false),
            new autoIntakeRetract(_intake, false),
            new autoDriveSlowPos(_robotDrive, -32500),//24000 was tested
            new autoHoldPosition(_robotDrive)
            // new autoDrivePos(_robotDrive, -12000)

            //new autoNavXGryoscope(_robotDrive, 5)
        );

    }
    
}
