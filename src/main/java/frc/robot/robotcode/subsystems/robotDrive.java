package frc.robot.robotcode.subsystems;

import static frc.robot.robotConstants.*;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.robotConstants;

public class robotDrive extends SubsystemBase {


    public robotDrive(){
        m_DriveTalonLeft.setSensorPhase(false);
        m_DriveTalonRight.setSensorPhase(false);
        m_DriveVictorLeftFwd.follow(m_DriveTalonLeft);
        m_DriveVictorLeftBack.follow(m_DriveTalonLeft);
        m_DriveVictorRightFwd.follow(m_DriveTalonRight);
        m_DriveVictorRightBack.follow(m_DriveTalonRight);
        
        m_DriveTalonRight.setInverted(true);
        m_DriveVictorRightBack.setInverted(true);
        m_DriveVictorRightFwd.setInverted(true);
        m_DriveTalonLeft.configPeakOutputForward(1);
        m_DriveTalonRight.configPeakOutputForward(1);

        m_DriveTalonLeft.configPeakOutputReverse(-1);
        m_DriveTalonRight.configPeakOutputReverse(-1);

        m_DriveVictorLeftBack.setNeutralMode(NeutralMode.Coast);
        m_DriveVictorRightBack.setNeutralMode(NeutralMode.Coast);

    }

    public void setHighGear () {
        s_gearbox.set(true);
    }
    public void endHighGear () {
        s_gearbox.set(false);
    }

    public void setArcadeDrive(double foward, double rotation){
        m_DriveTalonLeft.configPeakOutputForward(1);
        m_DriveTalonRight.configPeakOutputForward(1);

        m_DriveTalonLeft.configPeakOutputReverse(-1);
        m_DriveTalonRight.configPeakOutputReverse(-1);
        m_DriveTalonLeft.set(ControlMode.PercentOutput, foward - rotation);
        m_DriveTalonRight.set(ControlMode.PercentOutput, foward + rotation);
    }

    public void driveToPosition (double position){
        m_DriveTalonRight.setSelectedSensorPosition(0);
        m_DriveTalonLeft.setSelectedSensorPosition(0);
        
        m_DriveTalonRight.configMotionCruiseVelocity(6000);//same from last year - MUST be tested
        m_DriveTalonLeft.configMotionCruiseVelocity(6000);
        
        m_DriveTalonRight.configMotionAcceleration(2800*1.40);//2800
        m_DriveTalonLeft.configMotionAcceleration(2800*1.40);//2800

        m_DriveTalonLeft.configPeakOutputForward(1);
        m_DriveTalonRight.configPeakOutputForward(1);

        m_DriveTalonLeft.configPeakOutputReverse(-1);
        m_DriveTalonRight.configPeakOutputReverse(-1);
        
        m_DriveTalonRight.set(ControlMode.MotionMagic, -position);
        m_DriveTalonLeft.set(ControlMode.MotionMagic, -position);
    }
    public void MidDriveToPosition (double position){
        m_DriveTalonRight.setSelectedSensorPosition(0);
        m_DriveTalonLeft.setSelectedSensorPosition(0);
        
        m_DriveTalonRight.configMotionCruiseVelocity(6000);//same from last year - MUST be tested
        m_DriveTalonLeft.configMotionCruiseVelocity(6000);
        
        m_DriveTalonRight.configMotionAcceleration(2800*1.40);//2800
        m_DriveTalonLeft.configMotionAcceleration(2800*1.40);//2800

        m_DriveTalonLeft.configPeakOutputForward(1);
        m_DriveTalonRight.configPeakOutputForward(1);

        m_DriveTalonLeft.configPeakOutputReverse(-1);
        m_DriveTalonRight.configPeakOutputReverse(-1);
        
        m_DriveTalonRight.set(ControlMode.MotionMagic, -position);
        m_DriveTalonLeft.set(ControlMode.MotionMagic, -position);
    }

    public void precisionDrive (double position){
        m_DriveTalonRight.setSelectedSensorPosition(0);
        m_DriveTalonLeft.setSelectedSensorPosition(0);
        
        m_DriveTalonRight.configMotionCruiseVelocity(2800);//same from last year - MUST be tested
        m_DriveTalonLeft.configMotionCruiseVelocity(2800);
        
        m_DriveTalonRight.configMotionAcceleration(2800);
        m_DriveTalonLeft.configMotionAcceleration(2800);

        m_DriveTalonLeft.configPeakOutputForward(.5);
        m_DriveTalonRight.configPeakOutputForward(.5);

        m_DriveTalonLeft.configPeakOutputReverse(-.5);
        m_DriveTalonRight.configPeakOutputReverse(-.5);
        
        m_DriveTalonRight.set(ControlMode.MotionMagic, -position);
        m_DriveTalonLeft.set(ControlMode.MotionMagic, -position);
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
    public void holdAPosition () {
        m_DriveTalonRight.configMotionCruiseVelocity(2800);//same from last year - MUST be tested
        m_DriveTalonLeft.configMotionCruiseVelocity(2800);
        
        m_DriveTalonRight.configMotionAcceleration(2800);
        m_DriveTalonLeft.configMotionAcceleration(2800);
        
        m_DriveTalonRight.set(ControlMode.MotionMagic, 0);
        m_DriveTalonLeft.set(ControlMode.MotionMagic, 0);
    }

public void driveAndRotate(double positionL, double positionR){
    m_DriveTalonRight.setSelectedSensorPosition(0);
    m_DriveTalonLeft.setSelectedSensorPosition(0);
    
    m_DriveTalonRight.configMotionCruiseVelocity(6000);//same from last year - MUST be tested
    m_DriveTalonLeft.configMotionCruiseVelocity(6000);
    
    m_DriveTalonRight.configMotionAcceleration(2800);
    m_DriveTalonLeft.configMotionAcceleration(2800);

    m_DriveTalonLeft.configPeakOutputForward(1);
    m_DriveTalonRight.configPeakOutputForward(1);

    m_DriveTalonLeft.configPeakOutputReverse(-1);
    m_DriveTalonRight.configPeakOutputReverse(-1);
    
    m_DriveTalonRight.set(ControlMode.MotionMagic, -positionR);
    m_DriveTalonLeft.set(ControlMode.MotionMagic, -positionL);
}

}