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
        robotConstants.s_ArmPincer.set(false);
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void end (boolean interupted) {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        robotConstants.s_ArmPincer.set(true);
    }
    
}
