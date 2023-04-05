package frc.robot.robotcode.commands;

import javax.swing.text.StyledEditorKit.BoldAction;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.robotConstants;
import frc.robot.robotcode.subsystems.scoring;
import static frc.robot.RobotContainer._intake;

public class armHighPos extends CommandBase {
    
    private scoring Scoring;

    public armHighPos(scoring score) {
        this.Scoring = score;
        addRequirements(score);
    }
    
    @Override
    public void initialize() {
        super.initialize();
        Scoring.setArmPos(robotConstants.positionHigh);
    }

    @Override
    public boolean isFinished() {
        return (Math.abs(robotConstants.m_ArmRotator.getSelectedSensorPosition()) > 3000);
    }

    @Override
    public void end(boolean interrupted){
        _intake.retractCone(50);
    }
}