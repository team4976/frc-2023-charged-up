package frc.robot.robotcode.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.robotConstants;
import frc.robot.robotcode.subsystems.intake;

public class coneIn extends CommandBase{

    private intake _intake;

    public coneIn(intake intake) {
        _intake = intake;
        addRequirements(_intake);
    }
    
    @Override
    public void initialize() {
        robotConstants.peiceSelection = false;
    }

    @Override
    public boolean isFinished() {
        return false;
    }
}