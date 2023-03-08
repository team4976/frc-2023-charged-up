package frc.robot.robotcode.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.robotConstants;
import frc.robot.robotcode.subsystems.hand_off;
import frc.robot.robotcode.subsystems.scoring;

import static frc.robot.RobotContainer._intake;

public class handoff_ToScore extends CommandBase {
    
    private hand_off _hand_off;
    private scoring _scoring;
    
    public handoff_ToScore(hand_off handoff, scoring scoring) {
        this._hand_off = handoff;
        this._scoring = scoring;
        addRequirements(_hand_off, _scoring);
    }
    
    @Override
    public void execute() {
        if(robotConstants.peiceSelection){
<<<<<<< HEAD
        _intake.retractCube(robotConstants.cubeRetractedPosition);
        if(Math.abs(robotConstants.m_IntakeTalonMain.getSelectedSensorPosition() - robotConstants.cubeRetractedPosition) < 100){
        _hand_off.Handoff_Cube();
        }
=======
        _hand_off.Handoff_Cube();
>>>>>>> 559d6d586b759439516be2ede02a6cffabd947f4
        }
        else{
        _hand_off.Handoff_Cone();
        }
    }

    // @Override
    // public boolean isFinished() {
    //     return true;
    // }

    @Override
    public void end(boolean interrupted){
        _scoring.grabPiece();
        _intake.intakeStop();
    }
}