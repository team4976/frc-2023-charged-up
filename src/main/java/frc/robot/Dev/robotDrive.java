package frc.robot.Dev;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class robotDrive extends SubsystemBase {

    public final TalonSRX m_leftTalon = new TalonSRX(43);
    public final TalonSRX m_rightTalon = new TalonSRX(45);

    public final VictorSPX m_rightVictor = new VictorSPX(52);
    public final VictorSPX m_leftVictor = new VictorSPX(51);

    public robotDrive() {
        m_leftVictor.follow(m_leftTalon);
        m_rightVictor.follow(m_rightTalon);
        m_rightTalon.setInverted(true);
    }

    public void setArcadeDrive(double forward, double rotation) {
        m_leftTalon.set(ControlMode.PercentOutput, forward + rotation);
        m_rightTalon.set(ControlMode.PercentOutput, -forward - rotation);
    }

    public void driveToPosition(double position) {// position in pulses(2048) per...
        m_rightTalon.setSelectedSensorPosition(0);
        m_rightTalon.configMotionCruiseVelocity(2800);
        m_rightTalon.configMotionAcceleration(2800);
        m_rightTalon.set(ControlMode.MotionMagic, position);
        m_leftTalon.setSelectedSensorPosition(0);
        m_leftTalon.configMotionCruiseVelocity(2800);
        m_leftTalon.configMotionAcceleration(2800);
        m_leftTalon.set(ControlMode.MotionMagic, position);

    }
}
