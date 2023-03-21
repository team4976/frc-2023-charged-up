package frc.robot.robotcode.auto.autoSubCommands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.robotConstants;
import frc.robot.robotcode.subsystems.hand_off;
import frc.robot.robotcode.subsystems.intake;

public class autoHandOffCube extends CommandBase{

    hand_off _Hand_off;
    intake _Intake;
    long startTime;
    
    public autoHandOffCube(hand_off hand_off, intake intake) {
        _Hand_off = hand_off;
        _Intake = intake;
        addRequirements(_Hand_off);
    }
    @Override
    public void initialize() {
        startTime = System.currentTimeMillis();
        _Hand_off.Handoff_Cube();
    }

    @Override
    public boolean isFinished(){
        if(System.currentTimeMillis() - startTime > 1000){
            return true;
        }
        return false;
    }

    @Override
    public void end(boolean interrupted) {
        _Intake.intakeStop();
    }
}
