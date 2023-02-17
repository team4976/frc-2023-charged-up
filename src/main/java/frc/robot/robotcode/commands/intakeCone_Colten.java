package frc.robot.robotcode.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.robotcode.subsystems.intake;

public class intakeCone_Colten extends CommandBase {
    
    private intake intake;

    public intakeCone_Colten(intake intake) {
        this.intake = intake;
        addRequirements(intake);
    }
    
    @Override
    public void execute() {
        intake.intakeCone();
        super.initialize();
    }

    @Override
    public boolean isFinished() {
        return false;
    }

    @Override
    public void end (boolean interrupted) {
        intake.retract();
    }
}