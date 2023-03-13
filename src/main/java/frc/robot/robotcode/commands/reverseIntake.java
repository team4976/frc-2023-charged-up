package frc.robot.robotcode.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.robotConstants;
import frc.robot.robotcode.subsystems.intake;

import static frc.robot.RobotContainer._statusLight;

public class reverseIntake extends CommandBase {
    
    private intake intake;

    public reverseIntake(intake intake) {
        this.intake = intake;
        addRequirements(intake);
    }
    
    @Override
    public void execute() {
        _statusLight.setRGB(255, 255, 255);

        intake.reverseIntake(robotConstants.conePosition);
        if(robotConstants.peiceSelection == false && Math.abs(robotConstants.conePosition - robotConstants.m_IntakeTalonMain.getSelectedSensorPosition()) < 100){
            intake.coneReverseIntake();
        }    
    }

    @Override
    public boolean isFinished() {
        return false;
    }

    @Override
    public void end(boolean interrupted){
    intake.retractCone(robotConstants.coneRetractedPosition);
    intake.intakeStop();
    }
}