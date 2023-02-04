package frc.robot.subsystem.robotcode.dev.prathap_subsystem;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import static frc.robot.constant.robotConstants.*;

public class robotHandOff extends SubsystemBase{

public void handOff(double ht, double hb) {
    m_IntakeFalconTopRoller.set(ControlMode.PercentOutput, ht);
    m_IntakeFalcoBottomRoller.set(ControlMode.PercentOutput, hb);

}

    public void clamp(){
        s_ArmPincer.set(true);
    }
    
    public void retract(){
        s_ArmPincer.set(false); 
    }
}