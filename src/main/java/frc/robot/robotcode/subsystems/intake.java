package frc.robot.robotcode.subsystems;
import static frc.robot.robotConstants.*;

import com.ctre.phoenix.motorcontrol.ControlMode;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class intake extends SubsystemBase{

    public void intakeCube(double position){
        m_IntakeTalonMain.configMotionCruiseVelocity(2000);
        m_IntakeTalonMain.configMotionAcceleration(2000);
        m_IntakeTalonMain.set(ControlMode.MotionMagic, position);
        m_IntakeFalconTopRoller.set(ControlMode.PercentOutput, forwardI);
        //top motor spin clockwise
        m_IntakeFalcoBottomRoller.set(ControlMode.PercentOutput, forwardI);
        //botom motor spin counter clockwise
    }

    public void intakeCone(double position){
        m_IntakeTalonMain.configMotionCruiseVelocity(2000);
        m_IntakeTalonMain.configMotionAcceleration(2000);
        m_IntakeTalonMain.set(ControlMode.MotionMagic, position);
        m_IntakeFalcoBottomRoller.set(ControlMode.PercentOutput, forwardI);
        //botom motor spin counter clockwise

        m_IntakeFalconTopRoller.set(ControlMode.PercentOutput, forwardI);
        //top motor spin clockwise
    }

    public void retractCube (double position) {
        m_IntakeTalonMain.configMotionCruiseVelocity(2000);
        m_IntakeTalonMain.configMotionAcceleration(2000);
        m_IntakeTalonMain.set(ControlMode.MotionMagic, position);
    }
    public void retractCone (double position) {
        m_IntakeTalonMain.configMotionCruiseVelocity(2000);
        m_IntakeTalonMain.configMotionAcceleration(2000);
        m_IntakeTalonMain.set(ControlMode.MotionMagic, position);

    }
    public void intakeStop () {
        m_IntakeFalcoBottomRoller.set(ControlMode.PercentOutput, stop);
        m_IntakeFalconTopRoller.set(ControlMode.PercentOutput, stop);
    }

    // public void retract(){
    //     m_IntakeFalconTopRoller.set(ControlMode.PercentOutput, stop);
    //     //top motor stop
    //     m_IntakeFalcoBottomRoller.set(ControlMode.PercentOutput, stop);
    //     //botom motor stop
    //     s_MainIntake.set(false);
    //     s_CubeIntake.set(false);
    // }

    public void reverseIntake(){
        m_IntakeFalcoBottomRoller.set(ControlMode.PercentOutput, backwardI);
        m_IntakeFalconTopRoller.set(ControlMode.PercentOutput, backwardI);
    }

}
