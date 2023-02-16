//THIS CODE IS NOT COMPLETE

package frc.robot.robotcode.subsystems;
import static frc.robot.robotConstants.*;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class hand_off extends SubsystemBase{
    

    public void Handoff_ToScore(){
        m_IntakeFalcoBottomRoller.set(ControlMode.PercentOutput, forwardH);
        //botom motor spin counter clockwise

    /*    this is code for neutral mode UNSURE IF IT WORKS
    m_IntakeTopFalcon.setNeutralMode(NeutralMode.Coast);
        //middle motor spin clockwise
    */
        m_IntakeFalconTopRoller.set(ControlMode.PercentOutput, backwardH);
        //top motor spin clockwise
    }

    public void Handoff_ToIntake(){
        m_IntakeFalcoBottomRoller.set(ControlMode.PercentOutput, forwardH);
        //botom motor spin counter clockwise

        m_IntakeFalconTopRoller.set(ControlMode.PercentOutput, backwardH);
        //top motor spin clockwise
    }




}
