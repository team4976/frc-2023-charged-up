package frc.robot.robotcode.auto.testAutos;

// import edu.wpi.first.wpilibj2.command.ParallelCommandGroup;
// import edu.wpi.first.wpilibj2.command.ParallelDeadlineGroup;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.robotConstants;
import frc.robot.limelight.commands.AutoAim;
import frc.robot.limelight.commands.aim;
// import frc.robot.limelight.commands.aim;
import frc.robot.limelight.subsystems.LimeLight;
import frc.robot.robotcode.auto.autoSubCommands.autoAim;
import frc.robot.robotcode.auto.autoSubCommands.autoAimPipeLine;
// import frc.robot.robotcode.auto.autoSubCommands.autoAim;
import frc.robot.robotcode.auto.autoSubCommands.autoArmHighPos;
import frc.robot.robotcode.auto.autoSubCommands.autoArmHomePos;
import frc.robot.robotcode.auto.autoSubCommands.autoCuberetract;
import frc.robot.robotcode.auto.autoSubCommands.autoDriveDis;
import frc.robot.robotcode.auto.autoSubCommands.autoDrivePos;
import frc.robot.robotcode.auto.autoSubCommands.autoDrivePosAndRotation;
import frc.robot.robotcode.auto.autoSubCommands.autoDrivePosHighgear;
import frc.robot.robotcode.auto.autoSubCommands.autoDriveSlowPos;
import frc.robot.robotcode.auto.autoSubCommands.autoGrab;
import frc.robot.robotcode.auto.autoSubCommands.autoHandOffCube;
import frc.robot.robotcode.auto.autoSubCommands.autoHoldPosition;
import frc.robot.robotcode.auto.autoSubCommands.autoIntake;
import frc.robot.robotcode.auto.autoSubCommands.autoIntakeRetract;
// import frc.robot.robotcode.auto.autoSubCommands.autoNavXGryoscope;
import frc.robot.robotcode.auto.autoSubCommands.autoRelease;
import frc.robot.robotcode.auto.autoSubCommands.autoRotateOnPos;
import frc.robot.robotcode.auto.autoSubCommands.delay;
import frc.robot.robotcode.auto.autoSubCommands.limelightGryo;
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

public class autoLevel_Cone extends SequentialCommandGroup {

    public autoLevel_Cone (robotDrive _robotDrive, scoring _score,  LimeLight _limelight, hand_off _hand_off, intake _intake)   {
        robotConstants.peiceSelection = true;
        
        addCommands(
        new autoGrab(_score),
        new autoArmHighPos(_score),
        new extendFourBar(_score),
        new autoRelease(_score),
        new retractFourBar(_score),
        new autoArmHomePos(_score),
        new autoDriveSlowPos(_robotDrive, 43000*ratio),
        new autoDriveSlowPos(_robotDrive, -20000*ratio),
        new limelightGryo(_robotDrive, false),
        new autoHoldPosition(_robotDrive)
        
        //     new autoGrab(_score),
        //     new autoArmHighPos(_score),
        //     new extendFourBar(_score),
        //    // new delay(.1),
        //     new autoRelease(_score),
        //     new delay(.1),
        //     new retractFourBar(_score),
        //     new autoArmHomePos(_score),
        //     new autoDrivePosAndRotation(_robotDrive, (50000+1250)*ratio, 45000*ratio),//49000,53+1250
        //     new autoIntake(_intake, false),
        //     new autoDrivePos(_robotDrive, 10000*ratio),
        //     new autoIntakeRetract(_intake, false),
        //     new autoDrivePosAndRotation(_robotDrive, (-6000-2000)*ratio,-1000*ratio),//-8000
        //     new autoDrivePos(_robotDrive, -29000*ratio),//-49000
        //     new autoAimPipeLine(_limelight, _robotDrive, 8),//7 or 8
        //     new autoDrivePos(_robotDrive, -23000*ratio),
        //     new autoCuberetract(_intake),
        //     new autoHandOffCube(_hand_off, _intake),
        //     new delay(0.15),
        //     new autoGrab(_score),
        //     new delay(0.2),//.3
        //     new autoArmHighPos(_score),
        //     new autoIntakeRetract(_intake, false),
        //     new extendFourBar(_score),
        //     new delay(0.5),
        //     new autoRelease(_score),
        //     new delay(.2),
        //     new retractFourBar(_score),
        //     new autoArmHomePos(_score)
        );
        //Right
        //     new autoGrab(_score),
        //     new autoArmHighPos(_score),
        //     new extendFourBar(_score),
        //    // new delay(.1),
        //     new autoRelease(_score),
        //     new delay(.1),
        //     new retractFourBar(_score),
        //     new autoArmHomePos(_score),
        //     new autoDrivePosAndRotation(_robotDrive, 45000*ratio, (50000+1250)*ratio),//49000,54000+1250
        //     new autoIntake(_intake, false),
        //     new autoDrivePos(_robotDrive, 10000*ratio),
        //     new autoIntakeRetract(_intake, false),
        //     new autoDrivePosAndRotation(_robotDrive, -1000*ratio, (-6000-5000)*ratio),//-8000
        //     new autoDrivePos(_robotDrive, -29000*ratio),//-49000
        //     new autoAimPipe7(_limelight, _robotDrive),
        //     new autoDrivePos(_robotDrive, -23000*ratio),
        //     new autoCuberetract(_intake),
        //     new autoHandOffCube(_hand_off, _intake),
        //     new delay(0.15),
        //     new autoGrab(_score),
        //     new delay(0.2),//.3
        //     new autoArmHighPos(_score),
        //     new autoIntakeRetract(_intake, false),
        //     new extendFourBar(_score),
        //     new delay(0.5),
        //     new autoRelease(_score),
        //     new delay(.2),
        //     new retractFourBar(_score),
        //     new autoArmHomePos(_score)
        // );

    }
    
}
