package frc.robot.robotcode.commands;

import javax.swing.text.StyledEditorKit.BoldAction;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.robotConstants;
import frc.robot.robotcode.subsystems.scoring;
import static frc.robot.RobotContainer._intake;

public class armHighPosAndScore extends CommandBase {
    
    private scoring Scoring;

    public armHighPosAndScore(scoring score) {
        this.Scoring = score;
        addRequirements(score);
    }
    
    @Override
    public void initialize() {
        super.initialize();
        Scoring.setArmPos(robotConstants.positionHigh);
    }
    @Override
    public void execute() {
        if(robotConstants.m_ArmRotator.getSelectedSensorPosition() > 4500){
            Scoring.ExtendFourBar();
        }
    }

    @Override
    public boolean isFinished() {
        return (Math.abs(robotConstants.m_ArmRotator.getSelectedSensorPosition() - robotConstants.positionHigh) < 200);
    }

    @Override
    public void end(boolean interrupted){
        Scoring.releasePiece();
        _intake.retractCone(50);
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Scoring.RetractFourBar();
        Scoring.setArmPos(robotConstants.positionHome);
    }
}