// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.robot_container;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.command.robotcode.dev.anthony_command.*;
import frc.robot.subsystem.robotcode.dev.ant_subsystem.*;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer_ant {

  // The robot's subsystems and commands are defined here... 
  public final XboxController _primaryController = new XboxController(0);

  public static final Drive_train robotDrive = new Drive_train();


 


  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer_ant() {

    // Configure the button bindings
    configureButtonBindings();

    robotDrive.setDefaultCommand(
            new TeleopDrive_Anthony(
                _primaryController::getLeftX,
                _primaryController::getRightTriggerAxis,
                _primaryController::getLeftTriggerAxis

               
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
   
  }

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */

}