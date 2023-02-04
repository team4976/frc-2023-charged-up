package frc.robot.command.robotcode.dev.colten_command;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystem.robotcode.dev.colten_subsystem.Scoring;

public class releasePiece extends CommandBase {
    
    private Scoring Scoring;

    public releasePiece(Scoring score) {
        this.Scoring = score;
        addRequirements(score);
    }
    
    @Override
    public void initialize() {
        Scoring.releasePiece();
        super.initialize();
    }

    @Override
    public boolean isFinished() {
        return true;
    }
}