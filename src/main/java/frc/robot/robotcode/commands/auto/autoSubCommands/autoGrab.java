package frc.robot.robotcode.commands.auto.autoSubCommands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.robotConstants;
import frc.robot.robotcode.subsystems.scoring;

public class autoGrab extends CommandBase {

    private static scoring _scoring;


    public autoGrab (scoring scoring) {
        _scoring = scoring;
        addRequirements(_scoring);
    }

    public void initialize () {
        robotConstants.s_ArmPincer.set(true);
    }

    // public boolean isFinished () {
    //     return true;
    // }
    public boolean isFinished () {
        return true; 
    }
    
}
