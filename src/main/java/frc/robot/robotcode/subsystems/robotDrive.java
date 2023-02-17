package frc.robot.robotcode.subsystems;

import static frc.robot.robotConstants.*;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class robotDrive extends SubsystemBase {


    public robotDrive(){
        m_DriveVictorLeftFwd.follow(m_DriveTalonLeft);
        m_DriveVictorLeftBack.follow(m_DriveTalonLeft);
        m_DriveVictorRightFwd.follow(m_DriveTalonRight);
        m_DriveVictorRightBack.follow(m_DriveTalonRight);
        m_DriveTalonRight.setInverted(true);
        m_DriveVictorRightBack.setInverted(true);
        m_DriveVictorRightFwd.setInverted(true);

    }

    public static void setHighGear () {
        s_gearbox.set(true);
    }
    public static void endHighGear () {
        s_gearbox.set(false);
    }

    public void setArcadeDrive(double foward, double rotation){
    m_DriveTalonLeft.set(ControlMode.PercentOutput, foward - rotation);
    m_DriveTalonRight.set(ControlMode.PercentOutput, foward + rotation);
    }

    public void driveToPosition (double position){
        m_DriveTalonRight.setSelectedSensorPosition(0);
        m_DriveTalonRight.configMotionCruiseVelocity(2800);//same from last year - MUST be tested
        m_DriveTalonRight.configMotionAcceleration(2800);
        m_DriveTalonRight.set(ControlMode.MotionMagic, position);
        m_DriveTalonLeft.setSelectedSensorPosition(0);
        m_DriveTalonLeft.configMotionCruiseVelocity(2800);
        m_DriveTalonLeft.configMotionAcceleration(2800);
        m_DriveTalonLeft.set(ControlMode.MotionMagic, position);
    }

    public void rotateOnPosition(double rotation) {
        m_DriveTalonRight.setSelectedSensorPosition(0);
        m_DriveTalonRight.configMotionCruiseVelocity(2000);//same here
        m_DriveTalonRight.configMotionAcceleration(2000);
        m_DriveTalonRight.set(ControlMode.MotionMagic, -rotation);
        m_DriveTalonLeft.setSelectedSensorPosition(0);
        m_DriveTalonLeft.configMotionCruiseVelocity(2000);
        m_DriveTalonLeft.configMotionAcceleration(2000);
        m_DriveTalonLeft.set(ControlMode.MotionMagic, rotation);
    }
    
}
