package frc.robot.robotcode.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.robotcode.subsystems.Scoring;

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