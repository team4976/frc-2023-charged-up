package frc.robot.robotcode.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.robotcode.subsystems.hand_off;

public class handoff_ToScore extends CommandBase {
    
    private hand_off _hand_off;
    
    public handoff_ToScore(hand_off handoff) {
        this._hand_off = handoff;
        addRequirements(_hand_off);
    }
    
    @Override
    public void initialize() {
        _hand_off.Handoff_ToScore();
        super.initialize();
    }

    @Override
    public boolean isFinished() {
        return true;
    }
}