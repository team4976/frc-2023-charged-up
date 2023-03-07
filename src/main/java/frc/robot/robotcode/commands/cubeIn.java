package frc.robot.robotcode.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.robotConstants;
import frc.robot.robotcode.subsystems.intake;

public class cubeIn extends CommandBase{


    public cubeIn() {
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
