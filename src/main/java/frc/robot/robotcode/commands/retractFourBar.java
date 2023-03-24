package frc.robot.robotcode.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.robotConstants;
// import frc.robot.robotConstants;
import frc.robot.robotcode.subsystems.scoring;

public class retractFourBar extends CommandBase{
    
    private scoring Scoring;

    public retractFourBar(scoring score) {
        this.Scoring = score;
        addRequirements(score);
    }
    
    @Override
    public void initialize() {
        //System.out.println("begin auto retract fourbar");
        Scoring.setArmPos(robotConstants.positionHigh);
        Scoring.RetractFourBar();
        super.initialize();
    }
    @Override
    public void end(boolean interrupted) {
        //System.out.println("end auto retract fourbar");
        
    }

    @Override
    public boolean isFinished() {
        return true;
    }
}
