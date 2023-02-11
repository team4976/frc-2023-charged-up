package frc.robot.robotcode.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.robotcode.subsystems.intake;

public class retract extends CommandBase{



    private intake intake;

    public retract(intake intake) {
        this.intake = intake;
        addRequirements(intake);
    }
    
    @Override
    public void initialize() {
        intake.retract();
        super.initialize();
    }

    @Override
    public boolean isFinished() {
        return true;
    }
}
