package frc.robot.robotcode.commands.auto;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.robotcode.subsystems.robotDrive;

public class testAuto extends SequentialCommandGroup {

    public testAuto (robotDrive _robotDrive)  {
        addCommands(
            new autoDrivePos(_robotDrive, 0),
            new autoRotateOnPos(_robotDrive, 0),
            new delay(3),
            new autoDrivePos(_robotDrive, 0)
        );

    }
    
}
