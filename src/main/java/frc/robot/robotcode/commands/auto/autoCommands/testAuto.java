package frc.robot.robotcode.commands.auto.autoCommands;

import edu.wpi.first.wpilibj2.command.ParallelCommandGroup;
import edu.wpi.first.wpilibj2.command.ParallelDeadlineGroup;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.limelight.commands.aim;
import frc.robot.limelight.subsystems.LimeLight;
import frc.robot.robotcode.commands.armHighPos;
import frc.robot.robotcode.commands.armHomePos;
import frc.robot.robotcode.commands.extendFourBar;
import frc.robot.robotcode.commands.retractFourBar;
import frc.robot.robotcode.commands.scorePiece;
import frc.robot.robotcode.commands.auto.autoSubCommands.autoAim;
import frc.robot.robotcode.commands.auto.autoSubCommands.autoArmHighPos;
import frc.robot.robotcode.commands.auto.autoSubCommands.autoArmHomePos;
import frc.robot.robotcode.commands.auto.autoSubCommands.autoDrivePos;
import frc.robot.robotcode.commands.auto.autoSubCommands.autoGrab;
import frc.robot.robotcode.commands.auto.autoSubCommands.autoRelease;
import frc.robot.robotcode.commands.auto.autoSubCommands.delay;
import frc.robot.robotcode.subsystems.robotDrive;
import frc.robot.robotcode.subsystems.scoring;

public class testAuto extends SequentialCommandGroup {

    public testAuto (robotDrive _robotDrive, scoring _score,  LimeLight _limelight)  {
        
        addCommands(
            new autoDrivePos(_robotDrive, 3000),
            new delay(1000),
            //new autoRotateOnPos(_robotDrive, 3000),
            new autoAim(_limelight, _robotDrive),//duration in millis
            new delay(3000),
            new autoGrab(_score),
            new delay(800),
            new autoArmHighPos(_score),
            new delay(3000),
            new extendFourBar(_score),
            new delay(3000),
            // new ParallelDeadlineGroup(new AutoScorePiece(_score), new delay (1500)),
            new autoRelease(_score),
            new delay(3000),
            new retractFourBar(_score),
            new delay(3000),
            new autoArmHomePos(_score),
            new delay(3000),
            new autoDrivePos(_robotDrive, 1000)
        );

    }
    
}
