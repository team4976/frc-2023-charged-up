package frc.robot.robotcode.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.robotConstants;
import frc.robot.robotcode.subsystems.intake;

public class intakeCone extends CommandBase {
    
    private intake intake;

    public intakeCone(intake intake) {
        this.intake = intake;
        addRequirements(intake);
    }
    
    @Override
    public void initialize() {
        intake.intakeCone(robotConstants.conePosition);
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