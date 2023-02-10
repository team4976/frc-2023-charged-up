package frc.robot.robotcode.subsystems.prathap_subsystem;

import static frc.robot.constants.robotConstants.*;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class robotIntake extends SubsystemBase {


    public void spinIntake(double mt, double mb) {
        m_IntakeFalconTopRoller.set(ControlMode.PercentOutput, mt);
        m_IntakeFalcoBottomRoller.set(ControlMode.PercentOutput, mb);
    }



    public void extendCubeIntake(boolean isExtended) {
        s_CubeIntake.set(isExtended);
    }

    public void extendMainIntake(boolean isExtended) {
        s_MainIntake.set(isExtended);
    }

}