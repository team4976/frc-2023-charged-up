package frc.robot.robotcode.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.robotConstants;
import frc.robot.robotcode.subsystems.scoring;

public class scorePieceCos extends CommandBase {

    private static scoring _scoring;

    public scorePieceCos (scoring scoring) {
        _scoring = scoring;
        addRequirements(_scoring);
    }

    public void initialize () {
        _scoring.setArmPos(robotConstants.positionHigh+200);
    }

    @Override
    public void execute() {
        
    }

    public void end (boolean interupted) {
        robotConstants.s_ArmPincer.set(false);
    }
    
}
