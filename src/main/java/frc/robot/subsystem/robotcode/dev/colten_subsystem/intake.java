package frc.robot.subsystem.robotcode.dev.colten_subsystem;
import static frc.robot.constant.robotConstants_Colten.*;

import com.ctre.phoenix.motorcontrol.ControlMode;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class intake extends SubsystemBase{

    public void intakeCube(){
        S_IntakeMain.set(true);
        S_IntakeCube.set(false); // retracted
        m_IntakeTopFalcon.set(ControlMode.PercentOutput, forwardI);
        //top motor spin clockwise
        m_IntakeBottomFalcon.set(ControlMode.PercentOutput, backwardI);
        //botom motor spin counter clockwise
    }

    public void intakeCone(){
        S_IntakeMain.set(true);
        S_IntakeCube.set(true);
        m_IntakeBottomFalcon.set(ControlMode.PercentOutput, forwardI);
        //botom motor spin counter clockwise

        m_IntakeTopFalcon.set(ControlMode.PercentOutput, forwardI);
        //top motor spin clockwise
    }

    public void retract(){
        S_IntakeMain.set(false);
        S_IntakeCube.set(false);
        m_IntakeTopFalcon.set(ControlMode.PercentOutput, stop);
        //top motor stop
        m_IntakeBottomFalcon.set(ControlMode.PercentOutput, stop);
        //botom motor stop
    }

}
