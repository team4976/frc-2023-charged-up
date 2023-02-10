// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.robot_container;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.subsystem.robotcode.dev.troy_subsystem.RobotIntake_Tro;
import frc.robot.subsystem.robotcode.dev.troy_subsystem.Scoring;

/**
 * This class is where the bulk of the robot should be declared. Since
 * Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in
 * the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of
 * the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {

  // The robot's subsystems and commands are defined here...
  public final XboxController _primaryController = new XboxController(0);

  public static final RobotIntake_Tro robot_intake = new RobotIntake_Tro();
  public static final Scoring Scoring = new Scoring();

  /**
   * The container for the robot. Contains subsystems, OI devices, and commands.
   */
  public RobotContainer() {

    // Configure the button bindings
    configureButtonBindings();

    /*
     * robotDrive.setDefaultCommand(
     * new TeleopDrive_Anthony(
     * _primaryController::getLeftX,
     * _primaryController::getRightTriggerAxis,
     * _primaryController::getLeftTriggerAxis
     * 
     * 
     * )
     * );
     */

  }

  /**
   * Use this method to define your button->command mappings. Buttons can be
   * created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing
   * it to a {@link
   * edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {

    new JoystickButton(_primaryController, XboxController.Button.kB.value)
        .onTrue(getAutonomousCommand());

    CommandXboxController _primaryController = new CommandXboxController(0);
    // _primaryController.a().ontrue(new INTAKE_CUBE(robot_intake));
    // _primaryController.b().onTrue(new INTAKE_CONE(robot_intake));
    // _primaryController.x().onTrue(new retraction(robot_intake));
    // _primaryController.y().onTrue(new TogglePlacement(robot_intake));

    // new POVButton(_secondaryController, 270).Trigger.onTrue(new
    // PresetLeft(scoring));
    // new POVButton(_secondaryController, 90).Trigger.onTrue(new
    // PresetRight(scoring));
    // new POVButton(_secondaryController, 180).Trigger.onTrue(new
    // PresetDown(scoring));
    // new POVButton(_secondaryController, 0).Trigger.onTrue(new PresetUp(scoring));
  }

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    return null;
  }

}