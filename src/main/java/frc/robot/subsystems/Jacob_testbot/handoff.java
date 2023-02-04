package frc.robot.subsystems.Jacob_testbot;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import edu.wpi.first.wpilibj.Solenoid;

public class handoff extends SubsystemBase{
    public final TalonSRX moterone = new TalonSRX (43);
    public final TalonSRX motertwo = new TalonSRX (46); 
    public final VictorSPX moterthree = new VictorSPX(53);
    public final Solenoid hand = new Solenoid(null, 0);

    public handoff (){
moterone.set (ControlMode.PercentOutput,0.2);
motertwo.set (ControlMode.PercentOutput,0.6);
moterthree.set (ControlMode.PercentOutput,0.5);
hand.set (true);
    }
}
