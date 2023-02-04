// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.dev.commands.Haris_setBotCommands.setMainIntakeSolenoid;
import frc.robot.dev.commands.Haris_setBotCommands.setCubeIntakeSolenoid;
import frc.robot.dev.commands.Haris_setBotCommands.setMainIntake;
import frc.robot.dev.subsystems.Haris_testBot.robotDrive;
import frc.robot.dev.subsystems.Haris_testBot.robotHandOff;
import frc.robot.dev.subsystems.Haris_testBot.robotIntake;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {

  private static final robotDrive drive_test = new robotDrive();
  private static final robotIntake robot_intake = new robotIntake();
  private static final robotHandOff hand_off = new robotHandOff();
  

  // The robot's subsystems and commands are defined here...


  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {

    // Configure the button bindings
    configureButtonBindings();

  }

  /**
   * Use this method to define your button->command mappings. Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a {@link
   * edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {
    new  CommandXboxController(0).a().onTrue(new setMainIntake(robot_intake));
    new  CommandXboxController(0).rightBumper().onTrue(new setMainIntakeSolenoid(robot_intake));
    new  CommandXboxController(0).b().onTrue(new setCubeIntakeSolenoid(robot_intake));

  
  }

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    return new setMainIntake(robot_intake);
  }



}