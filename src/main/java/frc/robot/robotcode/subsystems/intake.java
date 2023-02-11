package frc.robot.robotcode.subsystems;
import static frc.robot.robotConstants.*;

import com.ctre.phoenix.motorcontrol.ControlMode;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class intake extends SubsystemBase{

    public void intakeCube(){
        s_MainIntake.set(true);
        s_CubeIntake.set(false); // retracted
        m_IntakeFalconTopRoller.set(ControlMode.PercentOutput, forwardI);
        //top motor spin clockwise
        m_IntakeFalcoBottomRoller.set(ControlMode.PercentOutput, backwardI);
        //botom motor spin counter clockwise
    }

    public void intakeCone(){
        s_MainIntake.set(true);
        s_CubeIntake.set(true);
        m_IntakeFalcoBottomRoller.set(ControlMode.PercentOutput, forwardI);
        //botom motor spin counter clockwise

        m_IntakeFalconTopRoller.set(ControlMode.PercentOutput, forwardI);
        //top motor spin clockwise
    }

    public void retract(){
        m_IntakeFalconTopRoller.set(ControlMode.PercentOutput, stop);
        //top motor stop
        m_IntakeFalcoBottomRoller.set(ControlMode.PercentOutput, stop);
        //botom motor stop
        s_MainIntake.set(false);
        s_CubeIntake.set(false);
    }

    public void reverseIntake(){
        m_IntakeFalcoBottomRoller.set(ControlMode.PercentOutput, forwardI);
        m_IntakeFalconTopRoller.set(ControlMode.PercentOutput, backwardI);
    }

}
