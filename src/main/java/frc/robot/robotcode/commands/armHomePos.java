package frc.robot.robotcode.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.robotConstants;
import frc.robot.robotcode.subsystems.scoring;

public class armHomePos extends CommandBase {
    
    private scoring Scoring;

    public armHomePos(scoring score) {
        this.Scoring = score;
        addRequirements(score);
    }
    
    @Override
    public void initialize() {
        super.initialize();
        Scoring.releasePiece();
        Scoring.RetractFourBar();
        Scoring.setArmPos(robotConstants.positionHome);
    }

    @Override
    public boolean isFinished() {
        return true;
    }
}