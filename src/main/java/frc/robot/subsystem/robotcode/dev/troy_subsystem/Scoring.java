package frc.robot.subsystem.robotcode.dev.troy_subsystem;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.constant.RobotConstant_Tro;

public class Scoring extends SubsystemBase{

    public Scoring() {
    }

    public void presetHome() {
        RobotConstant_Tro.four_bar.set(false);
        RobotConstant_Tro.pincer.set(false);
        RobotConstant_Tro.m_775pro.set(ControlMode.PercentOutput, 0);

    }

     //scoring high the only one where four bar is true
    public  void RSDOWN() {
        RobotConstant_Tro.pincer.set(true); // Closes pincer //RS= robot scoring

    }

    public  void RSUP() {
        RobotConstant_Tro.pincer.set(false); // opers pincer
    }

    public  void RSLEFT() {
      RobotConstant_Tro.four_bar.set(false); // this retract the piston
    }

    public  void RSRIGHT() {
          RobotConstant_Tro.four_bar.set(true); // this extends the piston
    }

    public static void TogglePlacement() {
//cannot do until we done with encoders 
       //  Setpos = 0;          //rest
        // Setpos = 1;          //low 
        // Setpos = 2;          //medium 
        // Setpos = 3;          //high

    }
}
