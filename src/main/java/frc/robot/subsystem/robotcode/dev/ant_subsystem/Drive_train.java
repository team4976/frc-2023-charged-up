package frc.robot.subsystem.robotcode.dev.ant_subsystem;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Drive_train extends SubsystemBase{

    public final TalonSRX m_LeftTal = new TalonSRX(10);
    public final TalonSRX m_rightTal = new TalonSRX(11);

    public final VictorSPX m_leftVic = new VictorSPX(12);
    public final VictorSPX m_rightVic = new VictorSPX(13);

    public Drive_train(){
        m_leftVic.follow(m_LeftTal);
        m_rightVic.follow(m_rightTal);
        m_rightTal.setInverted(true);
    }

    public void setArcadeDrive(double throttle, double rotation){
        m_LeftTal.set(ControlMode.PercentOutput, throttle - rotation);
        m_rightTal.set(ControlMode.PercentOutput, throttle + rotation);

    }
}
