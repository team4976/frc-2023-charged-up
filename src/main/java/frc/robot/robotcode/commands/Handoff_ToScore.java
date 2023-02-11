package frc.robot.robotcode.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.robotcode.subsystems.hand_off;

public class Handoff_ToScore extends CommandBase {
    
    private hand_off Handoff;

    public Handoff_ToScore(hand_off handoff) {
        this.Handoff = handoff;
        addRequirements(handoff);
    }
    
    @Override
    public void initialize() {
        Handoff.Handoff_ToScore();
        super.initialize();
    }

    @Override
    public boolean isFinished() {
        return true;
    }
}