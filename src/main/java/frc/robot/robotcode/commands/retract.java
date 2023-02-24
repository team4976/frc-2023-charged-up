package frc.robot.robotcode.commands;

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
    public void execute() {
        if(robotConstants.peiceSelection){
            intake.retractCube(robotConstants.cubeRetractedPosition);
        }
        else {
            intake.retractCone(robotConstants.coneRetractedPosition);
        } 
    }
    @Override
    public boolean isFinished() {
        return true;
    }

    @Override
    public void end (boolean interrupted) {
        intake.intakeStop();
    }
}
