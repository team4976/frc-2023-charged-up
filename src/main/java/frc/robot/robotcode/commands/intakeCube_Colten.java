package frc.robot.robotcode.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.robotcode.subsystems.intake;

public class intakeCube_Colten extends CommandBase {
    
    private intake intake;

    public intakeCube_Colten(intake intake) {
        this.intake = intake;
        addRequirements(intake);
    }
    
    @Override
    public void initialize() {
        intake.intakeCube();
        super.initialize();
    }

    @Override
    public boolean isFinished() {
        return true;
    }
}