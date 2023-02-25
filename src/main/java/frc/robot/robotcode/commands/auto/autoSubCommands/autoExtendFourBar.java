package frc.robot.robotcode.commands.auto.autoSubCommands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.robotcode.subsystems.scoring;

public class autoExtendFourBar extends CommandBase{
    
    private scoring Scoring;
    double duration;

    public autoExtendFourBar(scoring score, double duration) {
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
        return new delay(duration).isFinished();
    }





}
