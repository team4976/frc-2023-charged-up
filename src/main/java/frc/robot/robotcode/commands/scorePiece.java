package frc.robot.robotcode.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.robotConstants;
import frc.robot.robotcode.subsystems.scoring;

public class scorePiece extends CommandBase {

    private static scoring _scoring;

    public scorePiece (scoring scoring) {
        _scoring = scoring;
        addRequirements(_scoring);
    }

    public void initialize () {
        robotConstants.s_ArmPincer.set(true);
    }

    public void end (boolean interupted) {
        super.end(interupted);
        robotConstants.s_ArmPincer.set(false);
    }
    
}
