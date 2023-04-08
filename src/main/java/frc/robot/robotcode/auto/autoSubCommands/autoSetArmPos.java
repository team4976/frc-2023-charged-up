package frc.robot.robotcode.auto.autoSubCommands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.robotConstants;
import frc.robot.robotcode.subsystems.scoring;

public class autoSetArmPos extends CommandBase {
    
    private scoring Scoring;
    double pos;
    double next; // 4500

    public autoSetArmPos(scoring score, double pos, double allowNextCommand) {
        this.Scoring = score;
        this.pos = pos;
        this.next = allowNextCommand;
        addRequirements(score);
    }
    
    @Override
    public void initialize() {
        Scoring.autoSetArmPos(pos);
    }
    public void end () {
    }

    @Override
    public boolean isFinished() {
        return robotConstants.m_ArmRotator.getSelectedSensorPosition() > next; //(robotConstants.positionHigh-100);
    }
}