package frc.robot.robotcode.auto.autoCommands;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.limelight.subsystems.LimeLight;
import frc.robot.robotcode.auto.autoSubCommands.autoAim;
import frc.robot.robotcode.auto.autoSubCommands.autoArmHighPos;
import frc.robot.robotcode.auto.autoSubCommands.autoArmHomePos;
import frc.robot.robotcode.auto.autoSubCommands.autoDrivePos;
import frc.robot.robotcode.auto.autoSubCommands.autoGrab;
import frc.robot.robotcode.auto.autoSubCommands.autoRelease;
import frc.robot.robotcode.auto.autoSubCommands.delay;
import frc.robot.robotcode.commands.extendFourBar;
import frc.robot.robotcode.commands.retractFourBar;
import frc.robot.robotcode.subsystems.robotDrive;
import frc.robot.robotcode.subsystems.scoring;

public class get1MidAuto extends SequentialCommandGroup {

    public get1MidAuto (robotDrive _robotDrive, scoring _score,  LimeLight _limelight) {
        addCommands(
            new autoDrivePos(_robotDrive, 3.000),
            new delay(1.000),
            //new autoRotateOnPos(_robotDrive, 3000),
            new autoAim(_limelight, _robotDrive),//duration in millis
            new delay(3.000),
            new autoGrab(_score),
            new delay(0.800),
            new autoArmHighPos(_score),
            new delay(3.000),
            new extendFourBar(_score),
            new delay(3.000),
            // new ParallelDeadlineGroup(new AutoScorePiece(_score), new delay (1500)),
            new autoRelease(_score),
            new delay(3.000),
            new retractFourBar(_score),
            new delay(3.000),
            new autoArmHomePos(_score),
            new delay(3.000),
            new autoDrivePos(_robotDrive, 1.000)
        );
    }
    
}
