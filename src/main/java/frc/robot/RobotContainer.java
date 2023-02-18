// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.robotcode.commands.coneIn;
import frc.robot.robotcode.commands.cubeIn;
import frc.robot.robotcode.commands.engageHighGear;
import frc.robot.robotcode.commands.extend;
import frc.robot.robotcode.commands.extendFourBar;
import frc.robot.robotcode.commands.grabPiece;
import frc.robot.robotcode.commands.releasePiece;
import frc.robot.robotcode.commands.retract;
import frc.robot.robotcode.commands.retractFourBar;
import frc.robot.robotcode.commands.reverseIntake;
import frc.robot.robotcode.commands.rotateArmBwd;
import frc.robot.robotcode.commands.rotateArmFwd;
import frc.robot.robotcode.commands.scorePiece;
import frc.robot.robotcode.commands.setArcadeDrive;
import frc.robot.robotcode.commands.auto.testAuto;
import frc.robot.robotcode.subsystems.scoring;
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
  public static final scoring _score = new scoring();
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
    // robotConstants.instance.buttonBinding("Intake", new extend(_intake));
    // robotConstants.instance.buttonBinding("Retract Intake", new retract(_intake));
    // robotConstants.instance.buttonBinding("Reverse Intake", new reverseIntake(_intake));
    // robotConstants.instance.buttonBinding("Score", new scorePiece(_score));
    
    

    // ONLY FOR TESTING
    // ONLY FOR TESTING
    CommandXboxController _primarycontroller = new CommandXboxController(0);
    CommandXboxController _secondarycontroller = new CommandXboxController(1);

    _primarycontroller.y().whileTrue(new reverseIntake(_intake));
    _primarycontroller.b().whileTrue(new retract(_intake));
    _primarycontroller.a().whileTrue(new extend(_intake));
    // _primarycontroller.x().onTrue(new Handoff_ToScore(_handoff));
    _primarycontroller.rightBumper().whileTrue(new engageHighGear(_robotDrive));
    
    //TESTING COMMANDS NOT TO BE USED FOR COMP
    
    //  _primarycontroller.b().whileTrue(new cubeIn(_intake));
    //  _primarycontroller.x().whileTrue(new coneIn(_intake));
    //  _primarycontroller.pov(270).whileTrue(new retract(_intake));

    _secondarycontroller.x().whileTrue(new grabPiece(_score));
    _secondarycontroller.y().whileTrue(new releasePiece(_score));
    //TESTING COMMANDS NOT TO BE USED FOR COMP
    _secondarycontroller.pov(180).whileTrue(new rotateArmFwd(_score));
    _secondarycontroller.pov(0).whileTrue(new rotateArmBwd(_score));
    _secondarycontroller.leftTrigger().onTrue(new extendFourBar(_score));
    _secondarycontroller.rightTrigger().onTrue(new retractFourBar(_score));
    _secondarycontroller.b().whileTrue(new cubeIn(_intake));
    _secondarycontroller.a().whileTrue(new coneIn(_intake));
  

  }

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand () {
    return new testAuto(_robotDrive);
  }
}