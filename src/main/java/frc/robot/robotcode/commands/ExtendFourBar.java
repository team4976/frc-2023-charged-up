package frc.robot.robotcode.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.robotcode.subsystems.scoring;

public class extendFourBar extends CommandBase{
    
    private scoring Scoring;

    public extendFourBar(scoring score) {
        this.Scoring = score;
        addRequirements(score);
    }
    
    @Override
    public void initialize() {
        Scoring.ExtendFourBar();
        super.initialize();
    }

    @Override
    public boolean isFinished() {
        return true;
    }





}
