package frc.robot.robotcode.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.robotConstants;
import frc.robot.robotcode.subsystems.intake;

public class retractCone extends CommandBase {
    
    private intake intake;

    public retractCone(intake intake) {
        this.intake = intake;
        addRequirements(intake);
    }
    
    @Override
    public void initialize() {
        intake.retractCone(robotConstants.coneRetractedPosition);
        super.initialize();
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