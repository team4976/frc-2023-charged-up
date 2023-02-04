package frc.robot.subsystems.Jacob_testbot;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class robotDrive extends SubsystemBase{
 public final TalonSRX m_leftTalon = new TalonSRX (43);
 public final TalonSRX m_rightTalon = new TalonSRX (46);

public final VictorSPX m_leftVictor = new VictorSPX(52);
public final VictorSPX m_rightVictor = new VictorSPX(51);

public robotDrive() {

    m_leftVictor.follow(m_leftVictor);
m_rightVictor.follow(m_rightVictor);
m_rightTalon.setInverted(true);
}

public void setArcadeDrive (double foward, double rotation) {

    m_leftTalon.set(ControlMode.PercentOutput, foward - rotation);
m_rightTalon.set(ControlMode.PercentOutput, foward + rotation);

}



}
