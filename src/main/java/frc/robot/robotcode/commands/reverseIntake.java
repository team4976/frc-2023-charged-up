package frc.robot.robotcode.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.robotConstants;
import frc.robot.robotcode.subsystems.intake;

public class reverseIntake extends CommandBase {
    
    private intake intake;

    public reverseIntake(intake intake) {
        this.intake = intake;
        addRequirements(intake);
    }
    
    @Override
    public void initialize() {
        intake.reverseIntake(robotConstants.conePosition);
        super.initialize();
    }

    @Override
    public boolean isFinished() {
        if (robotConstants.peiceSelection == false){
        return (Math.abs(robotConstants.conePosition - robotConstants.m_IntakeTalonMain.getSelectedSensorPosition()) < 100);
        }
        else{
        return false;
        }
    }

    @Override
    public void end(boolean interrupted){
        if(robotConstants.peiceSelection == false){
            intake.coneReverseIntake();
        }        
        // Should be better reverse cone
    }
}