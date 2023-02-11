package frc.robot.robotcode.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.robotcode.subsystems.hand_off;

public class Handoff_ToScore extends CommandBase {
    
    public Handoff_ToScore(hand_off handoff) {
        addRequirements(handoff);
    }
    
    @Override
    public void initialize() {
        hand_off.Handoff_ToScore();
        super.initialize();
    }

    @Override
    public boolean isFinished() {
        return true;
    }
}