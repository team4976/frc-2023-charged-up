package frc.robot.command.robotcode.dev.anthony_command;

import static frc.robot.RobotContainer.robotDrive;

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
}
