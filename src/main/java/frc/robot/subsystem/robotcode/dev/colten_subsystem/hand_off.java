

//THIS CODE IS NOT COMPLETE

/*
package frc.robot.subsystem.robotcode.dev.colten_subsystem;
import static frc.robot.robotConstants_Colten.*;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class hand_off extends SubsystemBase{
    

    public final TalonSRX m_leftTalon = new TalonSRX(43);
    //top motor

    public final TalonSRX m_rightTalon = new TalonSRX(46);
    //middle motor

    public final VictorSPX m_leftVictor = new VictorSPX(52);
    // botom motor

    public void grabPiece(){
        m_leftVictor.set(ControlMode.PercentOutput, 100);
        //botom motor spin counter clockwise

        m_rightTalon.setNeutralMode(NeutralMode.Coast);
        //middle motor spin clockwise

        m_leftTalon.set(ControlMode.PercentOutput, -100);
        //top motor spin clockwise
    }




}
*/