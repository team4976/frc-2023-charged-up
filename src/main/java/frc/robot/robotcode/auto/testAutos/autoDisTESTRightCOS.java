package frc.robot.robotcode.auto.testAutos;

import edu.wpi.first.wpilibj2.command.ParallelCommandGroup;
import edu.wpi.first.wpilibj2.command.ParallelRaceGroup;
// import edu.wpi.first.wpilibj2.command.ParallelCommandGroup;
// import edu.wpi.first.wpilibj2.command.ParallelDeadlineGroup;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.robotConstants;
import frc.robot.limelight.commands.AutoAim;
import frc.robot.limelight.commands.aim;
// import frc.robot.limelight.commands.aim;
import frc.robot.limelight.subsystems.LimeLight;
import frc.robot.robotcode.auto.autoSubCommands.autoAim;
// import frc.robot.robotcode.auto.autoSubCommands.autoAim;
import frc.robot.robotcode.auto.autoSubCommands.autoArmHighPos;
import frc.robot.robotcode.auto.autoSubCommands.autoArmHomePos;
import frc.robot.robotcode.auto.autoSubCommands.autoCuberetract;
import frc.robot.robotcode.auto.autoSubCommands.autoDriveDis;
import frc.robot.robotcode.auto.autoSubCommands.autoDrivePos;
import frc.robot.robotcode.auto.autoSubCommands.autoDrivePosAndRotation;
import frc.robot.robotcode.auto.autoSubCommands.autoDrivePosHighgear;
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
import frc.robot.robotcode.commands.retractFourBar;
import frc.robot.robotcode.subsystems.hand_off;
import frc.robot.robotcode.subsystems.intake;
// import frc.robot.robotcode.commands.scorePiece;
import frc.robot.robotcode.subsystems.robotDrive;
import frc.robot.robotcode.subsystems.scoring;
import static frc.robot.robotConstants.ratio;

public class autoDisTESTRightCOS extends SequentialCommandGroup {

    public autoDisTESTRightCOS (robotDrive _robotDrive, scoring _score,  LimeLight _limelight, hand_off _hand_off, intake _intake)   {
        robotConstants.peiceSelection = true;
        
        addCommands(
            new autoGrab(_score),
            new autoArmHighPos(_score),
            new extendFourBar(_score),
           // new delay(.1),
            new autoRelease(_score),
            new delay(.1),
            new retractFourBar(_score),
            new autoArmHomePos(_score),
            new autoDrivePosAndRotation(_robotDrive, 49000*ratio, (53500)*ratio),//24000 was tested //54000
            new autoIntake(_intake, true),
            new autoDrivePos(_robotDrive, 7000*ratio),
            new autoIntakeRetract(_intake, true),
            new autoDrivePosAndRotation(_robotDrive, -3000*ratio, (-6500)*ratio),//-8000
            new autoDrivePos(_robotDrive, -38000*ratio),//-49000
            new ParallelCommandGroup(new AutoAim(_limelight, _robotDrive),new autoHandOffCube(_hand_off, _intake)),
            new autoGrab(_score),  
            new autoDrivePos(_robotDrive, -17000*ratio),
           // new autoCuberetract(_intake),
           // new delay(0.15),
            new delay(0.2),//.3
            new autoArmHighPos(_score),
            new autoIntakeRetract(_intake, false),
            new extendFourBar(_score),
            new delay(0.5),
            new autoRelease(_score),
            new delay(.2),
            new retractFourBar(_score),
            new autoArmHomePos(_score)
        );

    }
    
}
