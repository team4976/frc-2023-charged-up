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
    public void initialize() {
        intake.intakeCone();
        super.initialize();
    }

    @Override
    public boolean isFinished() {
        return true;
    }
}