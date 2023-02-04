package frc.robot.subsystem.robotcode.dev.colten_subsystem;
import static frc.robot.robotConstants_Colten.*;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Scoring extends SubsystemBase{

    public void rotateArmFwd(){
        m_armTalon.set(ControlMode.PercentOutput, 1);
    }

    public void rotateArmBwd(){
        m_armTalon.set(ControlMode.PercentOutput, -1);
    }

    public void grabPiece(){
        S_ArmPincer.set(true);

    }

    public void releasePiece(){
        S_ArmPincer.set(false);
    }
}
