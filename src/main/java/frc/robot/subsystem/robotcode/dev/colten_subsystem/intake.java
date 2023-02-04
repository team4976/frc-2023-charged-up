package frc.robot.subsystem.robotcode.dev.colten_subsystem;
import static frc.robot.robotConstants_Colten.*;

import com.ctre.phoenix.motorcontrol.ControlMode;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class intake extends SubsystemBase{

    public void intakeCube(){
        S_IntakeLeft.set(false); // retracted
        m_IntakeRightFalcon.set(ControlMode.PercentOutput, forwardI);
        //top and middle motor spin clockwise
    }

    public void intakeCone(){
        S_IntakeLeft.set(true);
        m_IntakeLeftFalcon.set(ControlMode.PercentOutput, -1);
        //botom motor spin counter clockwise

        m_IntakeRightFalcon.set(ControlMode.PercentOutput, forwardI);
        //top and middle motor spin clockwise
    }

    public void retract(){
        S_IntakeLeft.set(false);
        S_IntakeRight.set(false);

    }

}
