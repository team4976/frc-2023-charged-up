package frc.robot.robotcode.auto.autoSubCommands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.robotConstants;
import frc.robot.robotcode.subsystems.scoring;

public class autoPlacePiece extends CommandBase {

    private static scoring _scoring;


    public autoPlacePiece (scoring scoring) {
        _scoring = scoring;
        addRequirements(_scoring);
    }

    public void initialize () {
        System.out.println("begin auto score");
        robotConstants.s_ArmPincer.set(false);
    }

    public void end (boolean interupted) {
        System.out.println("end auto score");
        super.end(interupted);
        robotConstants.s_ArmPincer.set(true);
    }
    // public boolean isFinished () {
    //     return true;
    // }
    public boolean isFinished () {
        return new delay(0.500).isFinished(); 
    }
    
}
