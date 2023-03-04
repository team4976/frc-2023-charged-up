package frc.robot.robotcode.subsystems;
import static frc.robot.robotConstants.backwardI;
import static frc.robot.robotConstants.forwardI;
import static frc.robot.robotConstants.m_ArmRotator;
import static frc.robot.robotConstants.m_IntakeTop;
import static frc.robot.robotConstants.m_IntakeBottom;
import static frc.robot.robotConstants.m_IntakeTalonMain;
import static frc.robot.robotConstants.stop;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.robotConstants;

public class intake extends SubsystemBase{

    public intake(){
        m_IntakeTalonMain.setInverted(false);
        m_IntakeTalonMain.setSensorPhase(true);
        m_IntakeTalonMain.configPeakOutputForward(0.4);
        m_IntakeTalonMain.configPeakOutputReverse(-0.4);
    }


    public void intakeextend(){
    }

    public void retract(){
    }

    public boolean cubeAtIntake(){
        return robotConstants.cubeInIntake.get() == true;
    }

    public void intakeCube(double position){
        m_IntakeTalonMain.configMotionCruiseVelocity(2000);
        m_IntakeTalonMain.configMotionAcceleration(2000);
        m_IntakeTalonMain.set(ControlMode.MotionMagic, position);
        if(cubeAtIntake()){
        m_IntakeTop.set(ControlMode.PercentOutput, .1);
        //top motor spin clockwise
        m_IntakeBottom.set(ControlMode.PercentOutput, forwardI);
        //botom motor spin counter clockwise
        }
        else{
            m_IntakeTop.set(ControlMode.PercentOutput, 0);
        //top motor spin clockwise
        m_IntakeBottom.set(ControlMode.PercentOutput, 0);
        //botom motor spin counter clockwise
        }
    }

    public void intakeCone(double position){
        m_IntakeTalonMain.configMotionCruiseVelocity(2500);
        m_IntakeTalonMain.configMotionAcceleration(2000);
        m_IntakeTalonMain.set(ControlMode.MotionMagic, position);
        m_IntakeBottom.set(ControlMode.PercentOutput, .6);
        //botom motor spin counter clockwise

        m_IntakeTop.set(ControlMode.PercentOutput, backwardI);
        //top motor spin clockwise
    }

    public void retractCube (double position) {
        m_IntakeTalonMain.configMotionCruiseVelocity(2500);
        m_IntakeTalonMain.configMotionAcceleration(2000);
        m_IntakeTalonMain.set(ControlMode.MotionMagic, position);
    }
    public void retractCone (double position) {
        m_IntakeTalonMain.configMotionCruiseVelocity(2500);
        m_IntakeTalonMain.configMotionAcceleration(2000);
        m_IntakeTalonMain.set(ControlMode.MotionMagic, position);

    }
    public void intakeStop () {
        m_IntakeBottom.set(ControlMode.PercentOutput, stop);
        m_IntakeTop.set(ControlMode.PercentOutput, stop);
    }

    public void reverseIntake(double position){
        if(robotConstants.peiceSelection){
        m_IntakeBottom.set(ControlMode.PercentOutput, backwardI);
        m_IntakeTop.set(ControlMode.PercentOutput, forwardI);
        }
        else {
        m_IntakeTalonMain.configMotionCruiseVelocity(2500);
        m_IntakeTalonMain.configMotionAcceleration(2000);
        m_IntakeTalonMain.set(ControlMode.MotionMagic, position);
        }
    }
    public void coneReverseIntake(){
        m_IntakeBottom.set(ControlMode.PercentOutput, forwardI);
        //botom motor spin counter clockwise

        m_IntakeTop.set(ControlMode.PercentOutput, forwardI);
        //top motor spin clockwise
    }
    // public void currentDraw () {
    //     System.out.println(m_IntakeBottom.getStatorCurrent() + m_IntakeBottom.getStatorCurrent());
    // }

}
