package frc.robot.robotcode.subsystems.colten_subsystem;
import static frc.robot.constant.robotConstants_Colten.*;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Scoring extends SubsystemBase{

    public void rotateArmFwd(){
        m_armTalon.set(ControlMode.PercentOutput, forwardS);
    }

    public void rotateArmBwd(){
        m_armTalon.set(ControlMode.PercentOutput, backwardS);
    }

    public void grabPiece(){
        S_ArmPincer.set(true);

    }

    public void releasePiece(){
        S_ArmPincer.set(false);
    }
}