package frc.robot.robotcode.subsystems;
import static frc.robot.robotConstants.*;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.robotConstants;

public class scoring extends SubsystemBase{

    public scoring(){
        m_ArmRotator.setInverted(true);
        m_ArmRotator.setSensorPhase(true);
        m_ArmRotator.configPeakOutputForward(1);
        m_ArmRotator.configPeakOutputReverse(-0.4);
    }

    public void rotateArmFwd(){
        m_ArmRotator.set(ControlMode.PercentOutput, forwardS);
    }

    public void rotateArmBwd(){
        m_ArmRotator.set(ControlMode.PercentOutput, backwardS);
    }
    public void stopRotating () {
        m_ArmRotator.set(ControlMode.PercentOutput, 0);
    }

    public void ExtendFourBar(){
        robotConstants.heightSelection = true;
        s_FourBarArm.set(true);
    }

    public void RetractFourBar(){
        robotConstants.heightSelection = false;
        s_FourBarArm.set(false);
    }

    public void grabPiece(){
        s_ArmPincer.set(true);

    }

    public void releasePiece(){
        s_ArmPincer.set(false);
    }



    public void setArmPos(double position) {
        m_ArmRotator.configMotionCruiseVelocity(8000);
        m_ArmRotator.configMotionAcceleration(2000);
        m_ArmRotator.set(ControlMode.MotionMagic, position);
    }

    public void autoSetArmPos(double position) {
        m_ArmRotator.configMotionCruiseVelocity(6000);
        m_ArmRotator.configMotionAcceleration(2000);
        m_ArmRotator.set(ControlMode.MotionMagic, position);
    }

}