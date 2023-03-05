package frc.robot.robotcode.commands;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.robotConstants;
import frc.robot.robotcode.subsystems.intake;

public class retract extends CommandBase{
    private intake intake;

    public retract(intake intake) {
        this.intake = intake;
        addRequirements(intake);
    }
    
    @Override
    public void initialize() {
        super.initialize();
        if(robotConstants.peiceSelection){
            intake.retractCube(robotConstants.cubeRetractedPosition);
        }
        else {
            intake.retractCone(robotConstants.coneRetractedPosition);
        } 
        intake.intakeStop();
    }
    @Override
    public boolean isFinished() {
        return (robotConstants.m_IntakeTalonMain.getStatorCurrent() > 20);
    }

    @Override
    public void end (boolean interrupted) {
        robotConstants.m_IntakeTalonMain.set(ControlMode.PercentOutput, 0);
    }
}
