package frc.robot.robotcode.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.robotConstants;
import frc.robot.robotcode.subsystems.hand_off;
import frc.robot.robotcode.subsystems.scoring;

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
            _hand_off.Handoff_Cube();
        }
        else{
        _hand_off.Handoff_ToScore();
        }
    }

    // @Override
    // public boolean isFinished() {
    //     return true;
    // }

    @Override
    public void end(boolean interrupted){
        _scoring.grabPiece();
    }
}