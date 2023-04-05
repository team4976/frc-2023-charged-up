// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.WaitCommand;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.button.Trigger;
import frc.robot.limelight.commands.aim;
// import frc.robot.limelight.commands.setheightFalse;
// import frc.robot.limelight.commands.setheightTrue;
import frc.robot.limelight.subsystems.LimeLight;
import frc.robot.robotcode.auto.autoCommands.leftGetHighConeAndGetMidCone;
// import frc.robot.robotcode.auto.autoCommands.get1MidAuto;
import frc.robot.robotcode.auto.autoCommands.midGet1HighBalanceAuto;
import frc.robot.robotcode.auto.autoCommands.rightGetConeAndCube;
import frc.robot.robotcode.auto.autoCommands.rightGetHighConeAndGetMidCone;
import frc.robot.robotcode.auto.autoCommands.testGet1HighLeaveAndBalanceAuto;
import frc.robot.robotcode.auto.autoCommands.testLeftGetConeAndCube;
import frc.robot.robotcode.auto.autoSubCommands.autoDriveDis;
import frc.robot.robotcode.auto.autoSubCommands.navXGryoscope;
import frc.robot.robotcode.auto.testAutos.autoDisTEST;
import frc.robot.robotcode.auto.testAutos.autoGetCube;
import frc.robot.robotcode.auto.testAutos.testAuto;
// import frc.robot.robotcode.auto.autoSubCommands.autoDrivePos;
// import frc.robot.robotcode.auto.autoSubCommands.autoNavXGryoscope;
// import frc.robot.robotcode.auto.autoSubCommands.navXGryoscope;
import frc.robot.robotcode.commands.armHighPos;
import frc.robot.robotcode.commands.armHighPosAndScore;
import frc.robot.robotcode.commands.armHomePos;
import frc.robot.robotcode.commands.armPos;
import frc.robot.robotcode.commands.buttonIntakeSTOP;
import frc.robot.robotcode.commands.coneIn;
import frc.robot.robotcode.commands.cubeIn;
import frc.robot.robotcode.commands.engageHighGear;
import frc.robot.robotcode.commands.extendFourBar;
// import frc.robot.robotcode.commands.grabPiece;
import frc.robot.robotcode.commands.handoff_ToScore;
import frc.robot.robotcode.commands.handoff_ToScoreBouns;
import frc.robot.robotcode.commands.holdPosition;
import frc.robot.robotcode.commands.intakeAtStation;
// import frc.robot.robotcode.commands.intakeCone;
import frc.robot.robotcode.commands.intakeSTOP;
import frc.robot.robotcode.commands.intakeSetToBoth;
import frc.robot.robotcode.commands.intakeextend;
import frc.robot.robotcode.commands.resetEncoder;
// import frc.robot.robotcode.commands.releasePiece;
import frc.robot.robotcode.commands.retract;
// import frc.robot.robotcode.commands.retractCone;
// import frc.robot.robotcode.commands.retractCube;
import frc.robot.robotcode.commands.retractFourBar;
import frc.robot.robotcode.commands.reverseIntake;
import frc.robot.robotcode.commands.rotateArmBwd;
import frc.robot.robotcode.commands.rotateArmFwd;
import frc.robot.robotcode.commands.scorePiece;
import frc.robot.robotcode.commands.scorePieceCos;
import frc.robot.robotcode.commands.setArcadeDrive;
import frc.robot.robotcode.subsystems.scoring;
import frc.robot.robotcode.subsystems.statusLight;
import frc.robot.robotcode.subsystems.hand_off;
import frc.robot.robotcode.subsystems.intake;
//import frc.robot.robotcode.subsystems.led;
import frc.robot.robotcode.subsystems.robotDrive;


import java.util.function.BooleanSupplier;



/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  public static final robotDrive _robotDrive = new robotDrive();

  // ONLY FOR TESTING
  public static XboxController _primaryControllerForHandoff = new XboxController(1);
  // ONLY FOR TESTING
  public static final intake _intake = new intake();
  public static final scoring _score = new scoring();
  public static final hand_off _handoff = new hand_off();
  public static final LimeLight _limelight = new LimeLight();

  //LED
  public static final statusLight _statusLight = new statusLight();
  // ONLY FOR TESTING
  // ONLY FOR TESTING

  // The robot's subsystems and commands are defined here...
  //public final XboxController _primaryController = new XboxController(0);

  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    
    _statusLight.register();


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

    _primarycontroller.y().whileTrue((new reverseIntake(_intake)));
    _primarycontroller.b().onTrue(new retract(_intake));
    _primarycontroller.a().onTrue(new intakeextend(_intake));
    _primarycontroller.pov(0).whileTrue(new rotateArmBwd(_score));
    _primarycontroller.pov(180).whileTrue(new rotateArmFwd(_score));
    _primarycontroller.rightBumper().whileTrue(new engageHighGear());
    _primarycontroller.x().whileTrue(new scorePiece(_score));
    //limelight
    _primarycontroller.leftBumper().whileTrue(new aim(_limelight, _robotDrive));

    //test
       
    //
    // //testing intake
    // _primarycontroller.pov(0).onTrue(new intakeCube(_intake));
    // _primarycontroller.pov(90).onTrue(new retractCone(_intake));
    // _primarycontroller.pov(180).onTrue(new retractCube(_intake));
    // _primarycontroller.pov(270).onTrue(new intakeCone(_intake));
    // //testing autoBalance
    _primarycontroller.pov(90).whileTrue(new holdPosition(_robotDrive));

    // _secondarycontroller.pov(0).whileTrue(new setheightTrue(_limelight));
    // _secondarycontroller.pov(180).whileTrue(new setheightFalse(_limelight));


    _secondarycontroller.x().onTrue(new handoff_ToScore(_handoff, _score, _intake).andThen(new handoff_ToScoreBouns()));
    _secondarycontroller.y().whileTrue(new intakeAtStation(_intake));
    _secondarycontroller.leftTrigger().onTrue(new extendFourBar(_score));
    _secondarycontroller.rightTrigger().onTrue(new retractFourBar(_score));
    _secondarycontroller.b().onTrue(new cubeIn());
    _secondarycontroller.a().onTrue(new coneIn());
    //_secondarycontroller.rightBumper().whileTrue(new armHome(_score));
    //_secondarycontroller.y().whileTrue(new retract(_intake));

    _secondarycontroller.pov(0).onTrue(new armHighPos(_score));
    _secondarycontroller.pov(180).onTrue(new armHomePos(_score));




    ////TEST/////
   // _thirdController.a().onTrue(new armHighPosAndScore(_score));
   // _thirdController.x().onTrue(new scorePieceCos(_score));
  }

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand () {
    String autoName = SmartDashboard.getString("Auto Selector", "midGet1HighBalanceAuto");

    switch(autoName){
      case "midGet1HighBalanceAuto":
      return new midGet1HighBalanceAuto(_robotDrive, _score, _limelight);
      case "leftGetHighConeAndGetMidCone":
      return new leftGetHighConeAndGetMidCone(_robotDrive, _score, _limelight, _handoff, _intake);
      case "rightGetHighConeAndGetMidCone":
      return new rightGetHighConeAndGetMidCone(_robotDrive, _score, _limelight, _handoff, _intake);
      case "testLeftGetConeAndCube":
      return new testLeftGetConeAndCube(_robotDrive, _score, _limelight, _handoff, _intake);
      case "rightGetConeAndCube":
      return new rightGetConeAndCube(_robotDrive, _score, _limelight, _handoff, _intake);
      case "testGet1HighLeaveAndBalanceAuto":
      return new testGet1HighLeaveAndBalanceAuto(_robotDrive, _score, _limelight, _intake);
    }
    return null; // new midGet1HighBalanceAuto(_robotDrive, _score, _limelight);
  }
}