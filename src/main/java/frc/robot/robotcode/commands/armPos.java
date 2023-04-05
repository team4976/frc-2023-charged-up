package frc.robot.robotcode.commands;

import javax.swing.text.StyledEditorKit.BoldAction;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.robotConstants;
import frc.robot.robotcode.subsystems.scoring;
import static frc.robot.RobotContainer._intake;

public class armPos extends CommandBase {
    
    private scoring Scoring;
    double position;

    public armPos(scoring score, double position) {
        this.Scoring = score;
        this.position = position;
        addRequirements(score);
    }
    
    @Override
    public void initialize() {
        super.initialize();
        Scoring.setArmPos(position);
    }

    @Override
    public boolean isFinished() {
        return (Math.abs(robotConstants.m_ArmRotator.getSelectedSensorPosition()) - Math.abs(position) < 200);
    }

    @Override
    public void end(boolean interrupted){
        _intake.retractCone(50);
    }
}