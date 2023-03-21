package frc.robot.robotcode.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.robotConstants;
// import frc.robot.robotConstants;
import frc.robot.robotcode.subsystems.scoring;

public class extendFourBar extends CommandBase{
    
    private scoring Scoring;

    public extendFourBar(scoring score) {
        this.Scoring = score;
        addRequirements(score);
    }
    
    @Override
    public void initialize() {
        System.out.println("begin auto extend fourbar");

        Scoring.ExtendFourBar();
        super.initialize();
    }
    @Override
    public void end (boolean interrupted){
        System.out.println("end auto extend fourbar");
    }

    @Override
    public boolean isFinished() {
        return Math.abs(robotConstants.positionHigh - robotConstants.m_ArmRotator.getSelectedSensorPosition()) < 100;
    }





}
