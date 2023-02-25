package frc.robot.robotcode.commands.auto.autoSubCommands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.robotConstants;
import frc.robot.robotcode.subsystems.scoring;

public class autoArmHomePos extends CommandBase {
    
    private scoring Scoring;

    public autoArmHomePos(scoring score) {
        this.Scoring = score;
        addRequirements(score);
    }
    
    @Override
    public void initialize() {
        System.out.println("begin auto armHome");
        super.initialize();
        Scoring.releasePiece();
        Scoring.RetractFourBar();
        Scoring.setArmPos(robotConstants.positionHome);
    }
    @Override
    public void end(boolean interrupted) {
        System.out.println("end auto armHome");
    }

    @Override
    public boolean isFinished() {
        return robotConstants.m_ArmRotator.getSelectedSensorPosition() < (robotConstants.positionHome+100);
    }
}