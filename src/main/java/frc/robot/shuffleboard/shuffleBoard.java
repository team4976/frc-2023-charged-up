package frc.robot.shuffleboard;

import java.util.ArrayList;

import com.fasterxml.jackson.core.sym.Name;

import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;
import edu.wpi.first.wpilibj.shuffleboard.ShuffleboardTab;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import static frc.robot.robotConstants.*;

public class shuffleBoard {
    public static shuffleBoard instance = new shuffleBoard();
    ShuffleboardTab tab = Shuffleboard.getTab("Encoder");

    BaseMotorEncoder DriveTalonLeft = new BaseMotorEncoder("m_DriveTalonLeft_Encoder", m_DriveTalonLeft);
    BaseMotorEncoder DriveTalonRight = new BaseMotorEncoder("m_DriveTalonRight_Encoder", m_DriveTalonRight);

    BaseMotorEncoder DriveVictorRightFwd = new BaseMotorEncoder("m_DriveVictorRightFwd", m_DriveVictorRightFwd);
    BaseMotorEncoder DriveVictorLeftFwd = new BaseMotorEncoder("m_DriveVictorLeftFwd", m_DriveVictorLeftFwd);
    BaseMotorEncoder DriveVictorRightBack = new BaseMotorEncoder("m_DriveVictorRightBack", m_DriveVictorRightBack);
    BaseMotorEncoder DriveVictorLeftBack = new BaseMotorEncoder("m_DriveVictorLeftBack", m_DriveVictorLeftBack);

    BaseMotorEncoder IntakeTop = new BaseMotorEncoder("m_IntakeTop", m_IntakeTop);
    BaseMotorEncoder IntakeTalonMain = new BaseMotorEncoder("m_IntakeTalonMain_Encoder", m_IntakeTalonMain);
    BaseMotorEncoder IntakeBottom = new BaseMotorEncoder("m_IntakeBottom", m_IntakeBottom);
    BaseMotorEncoder ArmRotator = new BaseMotorEncoder("m_ArmRotator_Encoder", m_ArmRotator);

    ShuffleboardTab addTabs(String name) {
        return Shuffleboard.getTab(name);
    }

    public void tick() {
        Shuffleboard.update();
    }

    public void shuffleBoardSetup() {
    }
}
