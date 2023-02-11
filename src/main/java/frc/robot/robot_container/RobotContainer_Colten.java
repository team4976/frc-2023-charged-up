// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.robot_container;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.robotcode.commands.colten_command.intakeCone_Colten;
import frc.robot.robotcode.commands.colten_command.intakeCube_Colten;
import frc.robot.robotcode.commands.colten_command.setArcadeDrive_Colten;
import frc.robot.robotcode.subsystems.colten_subsystem.intake;
import frc.robot.robotcode.subsystems.colten_subsystem.robotDrive;


/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer_Colten {
  public static final robotDrive _robotDrive = new robotDrive();

  // The robot's subsystems and commands are defined here...
  public final XboxController _primaryController = new XboxController(0);

  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer_Colten() {

   final intake _intake = new intake();

    // Configure the button bindings
    configureButtonBindings();

    _robotDrive.setDefaultCommand(
      new setArcadeDrive_Colten(
        _primaryController::getLeftX, 
        _primaryController::getLeftTriggerAxis,
        _primaryController::getRightTriggerAxis
        )
    );



  }

  /**
   * Use this method to define your button->command mappings. Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a {@link
   * edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {
   
    CommandXboxController _primarycontroller = new CommandXboxController(0);
    _primarycontroller.a().onTrue(new intakeCone_Colten(null));
    _primarycontroller.b().onTrue(new intakeCube_Colten(null));
    
    // help me

  }

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
}