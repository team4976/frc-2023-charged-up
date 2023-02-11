// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import frc.robot.robotcode.commands.intakeCone_Colten;
import frc.robot.robotcode.commands.intakeCube_Colten;
import frc.robot.robotcode.commands.setArcadeDrive;
import frc.robot.robotcode.subsystems.intake;
import frc.robot.robotcode.subsystems.robotDrive;


/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  public static final robotDrive _robotDrive = new robotDrive();
  public static final intake _intake = new intake();

  // The robot's subsystems and commands are defined here...
  //public final XboxController _primaryController = new XboxController(0);

  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {


    // Configure the button bindings
    configureButtonBindings();
    _robotDrive.setDefaultCommand(
      new setArcadeDrive(
        robotConstants.instance._primaryController::getLeftX, 
        robotConstants.instance._primaryController::getLeftTriggerAxis,
        robotConstants.instance._primaryController::getRightTriggerAxis
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
   

    //Driver Controller
    robotConstants.instance.buttonBinding("a", new intakeCube_Colten(_intake));
    robotConstants.instance.buttonBinding("b", new intakeCone_Colten(_intake));
    

    

  }

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
}