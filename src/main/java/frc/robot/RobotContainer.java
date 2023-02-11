// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.robotcode.commands.Extend;
import frc.robot.robotcode.commands.ExtendFourBar;
import frc.robot.robotcode.commands.Handoff_ToScore;
import frc.robot.robotcode.commands.RetractFourBar;
import frc.robot.robotcode.commands.coneIn;
import frc.robot.robotcode.commands.cubeIn;
import frc.robot.robotcode.commands.grabPiece;
import frc.robot.robotcode.commands.intakeCone_Colten;
import frc.robot.robotcode.commands.intakeCube_Colten;
import frc.robot.robotcode.commands.releasePiece;
import frc.robot.robotcode.commands.retract;
import frc.robot.robotcode.commands.reverseIntake;
import frc.robot.robotcode.commands.rotateArmBwd;
import frc.robot.robotcode.commands.rotateArmFwd;
import frc.robot.robotcode.commands.setArcadeDrive;
import frc.robot.robotcode.subsystems.Scoring;
import frc.robot.robotcode.subsystems.hand_off;
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

  // ONLY FOR TESTING
  // ONLY FOR TESTING
  public static final intake _intake = new intake();
  public static final Scoring _score = new Scoring();
  public static final hand_off _handoff = new hand_off();
  // ONLY FOR TESTING
  // ONLY FOR TESTING

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
   
    // _primarycontroller.b().onTrue(new intakeCube_Colten(null));
    robotConstants.instance.buttonBinding("a", new intakeCube_Colten(null));
    robotConstants.instance.buttonBinding("b", new intakeCone_Colten(null));
    

    // ONLY FOR TESTING
    // ONLY FOR TESTING
    CommandXboxController _primarycontroller = new CommandXboxController(0);
    CommandXboxController _secondarycontroller = new CommandXboxController(1);

    _primarycontroller.y().onTrue(new reverseIntake(_intake));
    _primarycontroller.b().onTrue(new retract(_intake));
    _primarycontroller.a().onTrue(new Extend(_intake));
    _primarycontroller.x().onTrue(new Handoff_ToScore(_handoff));
    _primarycontroller.pov(0).onTrue(new rotateArmFwd(_score));
    _primarycontroller.pov(180).onTrue(new rotateArmBwd(_score));
    
    
    _secondarycontroller.leftTrigger().onTrue(new ExtendFourBar(_score));
    _secondarycontroller.rightTrigger().onTrue(new RetractFourBar(_score));
    _secondarycontroller.b().onTrue(new cubeIn(_intake));
    _secondarycontroller.a().onTrue(new coneIn(_intake));
    // ONLY FOR TESTING
    // ONLY FOR TESTING

  }

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
}