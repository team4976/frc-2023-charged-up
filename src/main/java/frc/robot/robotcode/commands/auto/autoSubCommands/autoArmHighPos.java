package frc.robot.robotcode.commands.auto.autoSubCommands;

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
        Scoring.setArmPos(robotConstants.positionHigh);
    }
    public void end () {
        System.out.println("end auto arm high");
    }

    @Override
    public boolean isFinished() {
        // System.out.println("EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE");
        return robotConstants.m_ArmRotator.getSelectedSensorPosition() > (robotConstants.positionHigh-100);
    }
}