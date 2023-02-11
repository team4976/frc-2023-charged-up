package frc.robot.robotcode.subsystems;
import static frc.robot.robotConstants.*;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Scoring extends SubsystemBase{

    public void rotateArmFwd(){
        m_ArmRotator.set(ControlMode.PercentOutput, forwardS);
    }

    public void rotateArmBwd(){
        m_ArmRotator.set(ControlMode.PercentOutput, backwardS);
    }

    public void ExtendFourBar(){
        s_FourBarArm.set(true);
    }

    public void RetractFourBar(){
        s_FourBarArm.set(false);
    }

    public void grabPiece(){
        s_ArmPincer.set(true);

    }

    public void releasePiece(){
        s_ArmPincer.set(false);
    }
}