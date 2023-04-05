package frc.robot.robotcode.commands;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.Commands;
import frc.robot.robotConstants;
import frc.robot.robotcode.subsystems.hand_off;
import frc.robot.robotcode.subsystems.intake;
import frc.robot.robotcode.subsystems.scoring;

import static frc.robot.RobotContainer._intake;
import static frc.robot.RobotContainer._score;
import static frc.robot.RobotContainer._primaryControllerForHandoff;

public class handoff_ToScoreBouns extends CommandBase {
    
    public handoff_ToScoreBouns() {
    }

    @Override
    public void initialize() {
        if(robotConstants.peiceSelection == false){
        _intake.setIntake(0);
        }
    }
    
    @Override
    public void execute() {
        if(Math.abs(robotConstants.m_IntakeTalonMain.getSelectedSensorPosition()) < 200){
            _score.grabPiece();
        }
    }

    @Override
    public boolean isFinished() {
        return (robotConstants.m_IntakeTalonMain.getSelectedSensorPosition() < 50 || robotConstants.peiceSelection == true);
    }

    @Override
    public void end(boolean interrupted) {
    }
}