package frc.robot.robotcode.commands;

// import com.ctre.phoenix.motorcontrol.ControlMode;

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
    public void initialize(){
        intake.intakeStop();
    }
    
    @Override
    public void execute() {
        if(robotConstants.peiceSelection){
            robotConstants.goalPosition = robotConstants.cubeRetractedPosition;
            intake.retractCube(robotConstants.cubeRetractedPosition);
        }
        else {
            robotConstants.goalPosition = robotConstants.coneRetractedPosition;
            intake.retractCone(robotConstants.coneRetractedPosition);
        } 
    }

    @Override
    public boolean isFinished() {
        return (robotConstants.m_IntakeTalonMain.getStatorCurrent() > 20 || Math.abs(robotConstants.goalPosition-robotConstants.m_IntakeTalonMain.getSelectedSensorPosition())<100);
    }

    @Override
    public void end (boolean interrupted) {
        intake.holdIntakePosition();
        robotConstants.goalPosition = 0;
    }
}
