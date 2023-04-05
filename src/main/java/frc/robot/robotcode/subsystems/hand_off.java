//THIS CODE IS NOT COMPLETE

package frc.robot.robotcode.subsystems;
import static frc.robot.robotConstants.*;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
// import frc.robot.robotConstants;
// import frc.robot.robotcode.auto.autoSubCommands.delay;

public class hand_off extends SubsystemBase{
    

    public void Handoff_ToScore(){
        s_ArmPincer.set(true);
        // old code
        //m_IntakeBottom.set(ControlMode.PercentOutput, forwardH);
        //botom motor spin counter clockwise

    /*    this is code for neutral mode UNSURE IF IT WORKS
    m_IntakeTopFalcon.setNeutralMode(NeutralMode.Coast);
        //middle motor spin clockwise
    */
        // m_IntakeTop.set(ControlMode.PercentOutput, backwardH);
        //top motor spin clockwise
    }

    public void Handoff_Cube(){
        m_IntakeBottom.set(ControlMode.PercentOutput, -.9);
        m_IntakeTop.set(ControlMode.PercentOutput, .9);
    }

    public void Handoff_Cone(){
        m_IntakeBottom.set(ControlMode.PercentOutput, -.06);
        m_IntakeTop.set(ControlMode.PercentOutput, -.06);
    }

    public void Handoff_ToIntake(){
        m_IntakeBottom.set(ControlMode.PercentOutput, forwardH);
        //botom motor spin counter clockwise

        m_IntakeTop.set(ControlMode.PercentOutput, backwardH);
        //top motor spin clockwise
    }




}
