package frc.robot.robotcode.auto.testAutos;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.limelight.subsystems.LimeLight;
import frc.robot.robotcode.auto.autoSubCommands.autoArmHighPos;
import frc.robot.robotcode.auto.autoSubCommands.autoArmHomePos;
import frc.robot.robotcode.auto.autoSubCommands.autoDrivePos;
import frc.robot.robotcode.auto.autoSubCommands.autoDrivePosAndRotation;
import frc.robot.robotcode.auto.autoSubCommands.autoDriveSlowPos;
import frc.robot.robotcode.auto.autoSubCommands.autoDriveSlowPosCos;
import frc.robot.robotcode.auto.autoSubCommands.autoGrab;
import frc.robot.robotcode.auto.autoSubCommands.autoIntake;
import frc.robot.robotcode.auto.autoSubCommands.autoIntakeCos;
import frc.robot.robotcode.auto.autoSubCommands.autoIntakeRetract;
import frc.robot.robotcode.auto.autoSubCommands.autoRelease;
import frc.robot.robotcode.auto.autoSubCommands.delay;
import frc.robot.robotcode.commands.armHomePos;
import frc.robot.robotcode.commands.armPos;
import frc.robot.robotcode.commands.extendFourBar;
import frc.robot.robotcode.commands.grabPiece;
import frc.robot.robotcode.commands.retractFourBar;
import frc.robot.robotcode.commands.scorePiece;
import frc.robot.robotcode.subsystems.hand_off;
import frc.robot.robotcode.subsystems.intake;
import frc.robot.robotcode.subsystems.robotDrive;
import frc.robot.robotcode.subsystems.scoring;

public class testAutoMidConeAndMidConeAndChange extends SequentialCommandGroup{
    
    public testAutoMidConeAndMidConeAndChange (robotDrive _robotDrive, LimeLight limeLight, intake _Intake, scoring _score, hand_off _Hand_off)  {
        
        addCommands(
            new grabPiece(_score),
            new armPos(_score, 1000),
            new autoRelease(_score),
            new delay(.1),
            new armHomePos(_score),
            new autoDrivePosAndRotation(_robotDrive, 50000, 57500),
            new autoIntake(_Intake, false),
            new autoDriveSlowPos(_robotDrive, -10000),
            new autoIntakeRetract(_Intake, false),
            new autoDrivePosAndRotation(_robotDrive, 5000, 12500),
            new autoDrivePos(_robotDrive, 50000),
            new autoGrab(_score),
            new autoArmHighPos(_score),
            new extendFourBar(_score),
            new autoRelease(_score),
            new delay(.1),
            new retractFourBar(_score),
            new autoArmHomePos(_score),
            new autoDriveSlowPos(_robotDrive, 24750)
        );

    }
    
}
