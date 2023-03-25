package frc.robot.shuffleboard;

import java.util.ArrayList;

import com.fasterxml.jackson.core.sym.Name;

import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;
import edu.wpi.first.wpilibj.shuffleboard.ShuffleboardTab;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import pabeles.concurrency.ConcurrencyOps.Reset;

import static frc.robot.robotConstants.*;

public class shuffleBoard {
    public static shuffleBoard instance = new shuffleBoard();

    ShuffleboardTab tab = Shuffleboard.getTab("Encoder");

    baseMotorEncoder DriveTalonLeft = new baseMotorEncoder("m_DriveTalonLeft_Encoder", m_DriveTalonLeft);
    baseMotorEncoder DriveTalonRight = new baseMotorEncoder("m_DriveTalonRight_Encoder", m_DriveTalonRight);

    baseMotorEncoder DriveVictorRightFwd = new baseMotorEncoder("m_DriveVictorRightFwd", m_DriveVictorRightFwd);
    baseMotorEncoder DriveVictorLeftFwd = new baseMotorEncoder("m_DriveVictorLeftFwd", m_DriveVictorLeftFwd);
    baseMotorEncoder DriveVictorRightBack = new baseMotorEncoder("m_DriveVictorRightBack", m_DriveVictorRightBack);
    baseMotorEncoder DriveVictorLeftBack = new baseMotorEncoder("m_DriveVictorLeftBack", m_DriveVictorLeftBack);

    baseMotorEncoder IntakeTop = new baseMotorEncoder("m_IntakeTop", m_IntakeTop);
    baseMotorEncoder IntakeTalonMain = new baseMotorEncoder("m_IntakeTalonMain_Encoder", m_IntakeTalonMain);
    baseMotorEncoder IntakeBottom = new baseMotorEncoder("m_IntakeBottom", m_IntakeBottom);
    baseMotorEncoder ArmRotator = new baseMotorEncoder("m_ArmRotator_Encoder", m_ArmRotator);

    public void tick() {
        Shuffleboard.update();
    }

    public void shuffleBoardSetup() {
    }
}
