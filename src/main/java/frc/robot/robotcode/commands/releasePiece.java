package frc.robot.robotcode.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
// import frc.robot.robotConstants;
import frc.robot.robotcode.subsystems.scoring;

public class releasePiece extends CommandBase {
    
    private scoring Scoring;

    public releasePiece(scoring score) {
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