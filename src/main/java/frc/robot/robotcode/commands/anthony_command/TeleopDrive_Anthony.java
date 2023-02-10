<<<<<<< HEAD:src/main/java/frc/robot/command/robotcode/dev/anthony_command/TeleopDrive_Anthony.java
/*package frc.robot.command.robotcode.dev.anthony_command;

import frc.robot.robot_container.robotDrive;
=======
package frc.robot.robotcode.commands.anthony_command;

import static frc.robot.robot_container.RobotContainer.robotDrive;
>>>>>>> a94f1af846d4597c05d38ebd5f3d970582a13521:src/main/java/frc/robot/robotcode/commands/anthony_command/TeleopDrive_Anthony.java

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class TeleopDrive_Anthony extends CommandBase{

    private final DoubleSupplier _forward;
    private final DoubleSupplier _reverse;
    private final DoubleSupplier _rotation;


    public TeleopDrive_Anthony(
      DoubleSupplier rotation,
      DoubleSupplier forward, 
      DoubleSupplier reverse 
    ) {
      _rotation = rotation;
      _reverse = reverse;
      _forward = forward;
  
      addRequirements(robotDrive);
    }

    
  @Override
  public void execute() {
    robotDrive.setArcadeDrive(
      _forward.getAsDouble() - _reverse.getAsDouble(),
      _rotation.getAsDouble()
    );
  }
}*/

