package frc.robot.subsystem.robotcode.dev.prathap_subsystem;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import static frc.robot.constant.robotConstants.*;

public class robotDrive extends SubsystemBase {


    public robotDrive() {
        m_DriveVictorLeftBack.follow(m_DriveTalonLeft);
        m_DriveVictorLeftFwd.follow(m_DriveTalonLeft);
        m_DriveVictorRightBack.follow(m_DriveTalonRight);
        m_DriveVictorRightFwd.follow(m_DriveTalonRight);

        m_DriveTalonRight.setInverted(true);
    }

    public void setArcadeDrive(double forward, double rotation) {
        m_DriveTalonLeft.set(ControlMode.PercentOutput, forward + rotation);
        m_DriveTalonRight.set(ControlMode.PercentOutput, forward + rotation);
    }

    public void driveToPosition(double position) {// position in pulses(2048) per...

    }
}
