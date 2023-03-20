// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.cameraserver.CameraServer;
import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableInstance;
// import edu.wpi.first.wpilibj.DigitalInput;
// import edu.wpi.first.wpilibj.SPI;
import edu.wpi.first.wpilibj.TimedRobot;
import frc.robot.robotcode.commands.buttonIntakeSTOP;
import frc.robot.robotcode.commands.resetEncoder;
// import edu.wpi.first.wpilibj.GenericHID.RumbleType;
// import frc.robot.robotConstants;
// import frc.robot.robotcode.auto.autoSubCommands.autoNavXGryoscope;
// import frc.robot.robotcode.subsystems.robotDrive;
import frc.robot.shuffleboard.shuffleBoard;
// import pabeles.concurrency.ConcurrencyOps.Reset;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
//import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.CommandScheduler;
import edu.wpi.first.wpilibj2.command.button.Trigger;

import static frc.robot.RobotContainer._statusLight;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

import static frc.robot.RobotContainer._intake;
/**
 * The VM is configured to automatically run this class, and to call the functions corresponding to
 * each mode, as described in the TimedRobot documentation. If you change the name of this class or
 * the package after creating this project, you must also update the build.gradle file in the
 * project.
 */
public class Robot extends TimedRobot {

  private Command m_autonomousCommand;
  //private RobotContainer m_RobotContainer;
  private static final String kDefaultAuto = "Default";
  private static final String kCustomAuto = "My Auto";
  private String m_autoSelected;
  private final SendableChooser<String> m_chooser = new SendableChooser<>();
  public static NetworkTable table = NetworkTableInstance.getDefault().getTable("limelight");
  // public robotDrive _robotDrive = new robotDrive ();//TESTING
  public RobotContainer m_robotContainer;
  public File encoderOutFile;
  public PrintStream encoderOutStream;

  public Robot(){
  try {
    encoderOutFile = new File("/home/lvuser/Encoder_Value-"+System.currentTimeMillis()+".log");
    System.out.println("*\n*\n*\n*\n*\n*\n*\n*\n*\n*\n");
    System.out.println("Created file handle");
    if (encoderOutFile.createNewFile()) {
    System.out.println("*\n*\n*\n*\n*\n*\n*\n*\n*\n*\n");
    System.out.println("Created file");
    } else {
      System.out.println("*\n*\n*\n*\n*\n*\n*\n*\n*\n*\n");
      System.out.println("Failed to create file");
    }
  } catch (IOException e) {
    System.out.println("*\n*\n*\n*\n*\n*\n*\n*\n*\n*\n");
    System.out.println("Failed to make file handle and file");
    e.printStackTrace();
  }
  try {
    encoderOutStream = new PrintStream(encoderOutFile);
  } 
  catch (FileNotFoundException e) {
    System.out.println("*\n*\n*\n*\n*\n*\n*\n*\n*\n*\n");
    System.out.println("Failed To Print");
    e.printStackTrace();
   }
  }

  /**
   * This function is run when the robot is first started up and should be used for any
   * initialization code.
   */
  @Override
  public void robotInit() {
    robotConstants.m_DriveTalonLeft.setSelectedSensorPosition(0);
    robotConstants.m_DriveTalonRight.setSelectedSensorPosition(0);
    robotConstants.m_ArmRotator.setSelectedSensorPosition(0);
    robotConstants.m_IntakeTalonMain.setSelectedSensorPosition(0);
    robotConstants.instance.init();
    // Reast var
    robotConstants.peiceSelection = false;
    robotConstants.heightSelection = false;

    robotConstants.goalPosition = 0;
    robotConstants.buttonIntakePOS = 200;
    //Camera
    CameraServer.startAutomaticCapture();
    m_robotContainer = new RobotContainer();
    // m_chooser.setDefaultOption("Default Auto", kDefaultAuto);
    // m_chooser.addOption("My Auto", kCustomAuto);
    // SmartDashboard.putData("Auto choices", m_chooser);
  }

  /**
   * This function is called every 20 ms, no matter the mode. Use this for items like diagnostics
   * that you want ran during disabled, autonomous, teleoperated and test.
   *
   * <p>This runs after the mode specific periodic functions, but before LiveWindow and
   * SmartDashboard integrated updating.
   */
  @Override
  public void robotPeriodic() {
    shuffleBoard.instance.tick();
    CommandScheduler.getInstance().run();

    // (CRTL /) to uncomment
    // Drive

    // System.out.println(robotConstants.m_DriveTalonLeft.getSelectedSensorPosition() + "*****" + robotConstants.m_DriveTalonRight.getSelectedSensorPosition() + " Drive Train Left/Right Encoder");
    // System.out.println(robotConstants.m_DriveTalonLeft.getSupplyCurrent() + " Drive LEFT Current");
    // System.out.println(robotConstants.m_DriveTalonRight.getSupplyCurrent() + " Drive Right Current");
    // System.out.println();
    // System.out.println();

    //
    // Arm

    // System.out.println(robotConstants.m_ArmRotator.getSelectedSensorPosition() + " Arm Encoder" + robotConstants.m_ArmRotator.getSupplyCurrent() + " Arm Current");
    // System.out.println();
    // System.out.println();
    
    //
    // Intake

    // System.out.println(robotConstants.m_IntakeTalonMain.getSelectedSensorPosition() + " Intake Encoder " + robotConstants.m_IntakeTalonMain.getSupplyCurrent() + " Intake Current");
    // System.out.println();
    // System.out.println();

    //
    // NavX

    // System.out.println(robotConstants.navX.getYaw() + " *** " + robotConstants.navX.getPitch() + " *** " + robotConstants.navX.getRoll() + " YAW :: PITCH :: ROLL");
    // System.out.println();
    // System.out.println();

    //
    // NavX TEST

    // System.out.println(robotConstants.navX.getVelocityX() + " *** " + robotConstants.navX.getVelocityY() + " *** " + robotConstants.navX.getVelocityZ() + " X :: Y :: Z");
    // System.out.println();
    // System.out.println();

    // 
    // Rumble

    // if (robotConstants.m_IntakeBottom.getStatorCurrent()>10){
    //   robotConstants._primaryControllerNotCommand.setRumble(RumbleType.kBothRumble, 1);
    // }
    // else {
    //   robotConstants._primaryControllerNotCommand.setRumble(RumbleType.kBothRumble, 0);
    // }

    //

  }

  /**
   * This autonomous (along with the chooser code above) shows how to select between different
   * autonomous modes using the dashboard. The sendable chooser code works with the Java
   * SmartDashboard. If you prefer the LabVIEW Dashboard, remove all of the chooser code and
   * uncomment the getString line to get the auto name from the text box below the Gyro
   *
   * <p>You can add additional auto modes by adding additional comparisons to the switch structure
   * below with additional strings. If using the SendableChooser make sure to add them to the
   * chooser code above as well.
   */
  @Override
  public void autonomousInit() {
    _statusLight.setTEAM();
    robotConstants.m_DriveTalonLeft.setSensorPhase(false);
    robotConstants.m_DriveTalonRight.setSensorPhase(false);
    // m_autoSelected = m_chooser.getSelected();

    // // m_autoSelected = SmartDashboard.getString("Auto Selector", kDefaultAuto);
    // System.out.println("Auto selected: " + m_autoSelected);
    m_autonomousCommand = m_robotContainer.getAutonomousCommand();

    if (m_autonomousCommand != null)
    m_autonomousCommand.schedule();
  }

  /** This function is called periodically during autonomous. */
  @Override
  public void autonomousPeriodic() {
    encoderOutStream.println("Motor LEFT "+robotConstants.m_DriveTalonLeft.getSelectedSensorPosition() + "      Motor  Right " +robotConstants.m_DriveTalonRight.getSelectedSensorPosition());
  

    // switch (m_autoSelected) {
    //   case kCustomAuto:
    //     // Put custom auto code here
    //     break;
    //   case kDefaultAuto:
    //   default:
    //     // Put default auto code here
    //     break;
    // }
  }

  /** This function is called once when teleop is enabled. */
  @Override
  public void teleopInit() {
    robotConstants.navX.zeroYaw();
    robotConstants.m_DriveTalonLeft.setSensorPhase(false);
    robotConstants.m_DriveTalonRight.setSensorPhase(false);

    Trigger exampleTrigger = new Trigger(robotConstants.cubeInIntake::get);
       exampleTrigger.whileFalse(new buttonIntakeSTOP(_intake));

    //LED
    _statusLight.setTEAM();
  }

  /** This function is called periodically during operator control. */
  @Override
  public void teleopPeriodic() {}

  /** This function is called once when the robot is disabled. */
  @Override
  public void disabledInit() {}

  /** This function is called periodically when disabled. */
  @Override
  public void disabledPeriodic() {}

  /** This function is called once when test mode is enabled. */
  @Override
  public void testInit() {}

  /** This function is called periodically during test mode. */
  @Override
  public void testPeriodic() {}

  /** This function is called once when the robot is first started up. */
  @Override
  public void simulationInit() {}

  /** This function is called periodically whilst in simulation. */
  @Override
  public void simulationPeriodic() {}
}
