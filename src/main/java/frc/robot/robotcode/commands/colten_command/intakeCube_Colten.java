package frc.robot.robotcode.commands.colten_command;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.robotcode.subsystems.colten_subsystem.intake;

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