package frc.robot.robotcode.dev.colten_command;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.robotcode.subsystems.colten_subsystem.Scoring;
import frc.robot.robotcode.subsystems.colten_subsystem.hand_off;

public class Handoff_ToScore extends CommandBase {
    
    private hand_off Handoff;

    public Handoff_ToScore(hand_off handoff) {
        this.Handoff = handoff;
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