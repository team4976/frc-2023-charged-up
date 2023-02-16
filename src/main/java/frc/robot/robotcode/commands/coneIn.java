package frc.robot.robotcode.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.robotConstants;
import frc.robot.robotcode.subsystems.intake;

public class coneIn extends CommandBase{

    private intake intake;

    public coneIn(intake intake) {
        this.intake = intake;
        addRequirements(intake);
    }
    
    @Override
    public void initialize() {
        robotConstants.peiceSelection = true;
    }

    @Override
    public boolean isFinished() {
        return true;
    }
}