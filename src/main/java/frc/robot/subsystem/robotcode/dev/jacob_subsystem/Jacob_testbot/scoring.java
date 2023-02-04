package frc.robot.subsystem.robotcode.dev.jacob_subsystem.Jacob_testbot;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class scoring extends SubsystemBase{
    public final VictorSPX arm = new VictorSPX(53);
    public final Solenoid hand = new Solenoid(null, 0);
    
    public scoring (){
arm.set (ControlMode.PercentOutput,0.8);
hand.set (true);
    }

}


