// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
<<<<<<< HEAD
import frc.robot.command.robotcode.dev.anthony_command.*;
import frc.robot.subsystem.robotcode.dev.ant_subsystem.*;
=======
import frc.robot.commands.roy_testbot.intakecone;
import frc.robot.commands.roy_testbot.intakecube;
import frc.robot.subsystems.Roy_testBot.intake;
>>>>>>> 903b3fb (jacob)

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  intake Intake = new intake ();


  // The robot's subsystems and commands are defined here... 
  public final XboxController _primaryController = new XboxController(0);

  public static final Drive_train robotDrive = new Drive_train();


 


  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {

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
<<<<<<< HEAD

    new JoystickButton(_primaryController, XboxController.Button.kB.value)
    .onTrue(getAutonomousCommand());
    
  
    CommandXboxController _primaryController = new CommandXboxController(0);
    _primaryController.a().onFalse(getAutonomousCommand());
    _primaryController.b().onTrue(getAutonomousCommand());
   
=======
   new CommandXboxController(0)
   .b(new intakecone(Intake))
>>>>>>> 903b3fb (jacob)
  }

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
return new intakecube(Intake)
  }

}