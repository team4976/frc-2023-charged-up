package frc.robot.robotcode.commands;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.CommandScheduler;
import edu.wpi.first.wpilibj2.command.Commands;
import frc.robot.robotConstants;
import frc.robot.robotcode.subsystems.hand_off;
import frc.robot.robotcode.subsystems.intake;
import frc.robot.robotcode.subsystems.scoring;

import static frc.robot.RobotContainer._intake;
import static frc.robot.RobotContainer._primaryControllerForHandoff;

public class handoff_ToScore extends CommandBase {
    
    private hand_off _hand_off;
    private scoring _scoring;
    private intake _intake;
    
    public handoff_ToScore(hand_off handoff, scoring scoring, intake intake) {
        this._hand_off = handoff;
        this._scoring = scoring;
        this._intake = intake;
        addRequirements(_hand_off, _scoring);
    }

    @Override
    public void initialize() {
        if(robotConstants.peiceSelection == false){
        _intake.setIntake(1000);
        }
    }
    
    @Override
    public void execute() {
        if(robotConstants.peiceSelection){
        _intake.retractCube(robotConstants.cubeRetractedPosition);
        if(Math.abs(robotConstants.m_IntakeTalonMain.getSelectedSensorPosition() - robotConstants.cubeRetractedPosition) < 100){
        _hand_off.Handoff_Cube();
        }
        }

        else{
        if(Math.abs(1000-robotConstants.m_IntakeTalonMain.getSelectedSensorPosition())<200){
            _hand_off.Handoff_Cone();
        }
        }
    }

    @Override
    public boolean isFinished() {
        return _primaryControllerForHandoff.getXButton() == false;
    }

    @Override
    public void end(boolean interrupted){
        _intake.intakeStop();
        if(robotConstants.peiceSelection == false){
        }
        else{
        _scoring.grabPiece();
        }
    }
}