package frc.robot.robotcode.auto.autoSubCommands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.robotConstants;
import frc.robot.robotcode.subsystems.scoring;

public class autoArmHighPos extends CommandBase {
    
    private scoring Scoring;

    public autoArmHighPos(scoring score) {
        this.Scoring = score;
        addRequirements(score);
    }
    
    @Override
    public void initialize() {
        System.out.println("begin auto arm high");

        super.initialize();
        // System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        Scoring.autoSetArmPos(robotConstants.positionHigh);
    }
    public void end () {
        System.out.println("end auto arm high");
    }

    @Override
    public boolean isFinished() {
        // System.out.println("EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE");
        return robotConstants.m_ArmRotator.getSelectedSensorPosition() > 4500; //(robotConstants.positionHigh-100);
    }
}