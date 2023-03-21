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
import frc.robot.robotcode.auto.autoSubCommands.autoDrivePos;
import frc.robot.robotcode.auto.autoSubCommands.autoDrivePosAndRotRotation;
import frc.robot.robotcode.auto.autoSubCommands.autoGrab;
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

public class testAuto2 extends SequentialCommandGroup {

    public testAuto2 (robotDrive _robotDrive, scoring _score,  LimeLight _limelight, hand_off _hand_off, intake _intake)  {
        
        addCommands(
        //     new autoGrab(_score),
        //    // new delay(0.10),
        //     new autoArmHighPos(_score),
        //  //   new delay(0.01),
        //     new extendFourBar(_score),
        //     //new delay(.2),
        //     new autoRelease(_score),
        // //  new delay(0.10),
        //     new retractFourBar(_score),
        //     // new delay(0.500),
         //   new autoArmHomePos(_score),
            new autoDrivePosAndRotRotation(_robotDrive, 20000, 25000),
           // new autoIntake(_intake, false),
           // new autoRotateOnPos(_robotDrive, 750), // unknow
            new autoDrivePos(_robotDrive, 5000),
           // new delay(.2),
           // new autoIntakeRetract(_intake, false),
            new autoDrivePosAndRotRotation(_robotDrive, -5000, -10000),
           // new autoDrivePos(_robotDrive, -2000),
           // new autoAim(_limelight, _robotDrive), // LimeLight
            new autoDrivePos(_robotDrive, -15000)//24000 was tested
        //     new autoGrab(_score),
        //    // new delay(0.10),
        //     new autoArmHighPos(_score),
        //     //   new delay(0.01),
        //     new extendFourBar(_score),
        //     //new delay(.2),
        //     new autoRelease(_score),
        //   //  new delay(0.10),
        //     new retractFourBar(_score),
        //     // new delay(0.500),
        //     new autoArmHomePos(_score)


            //new autoNavXGryoscope(_robotDrive, 5)
        );

    }
    
}
