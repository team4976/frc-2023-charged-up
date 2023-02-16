package frc.robot.robotcode.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.robotcode.subsystems.scoring;

public class rotateArmBwd extends CommandBase {
    
    private scoring _scoring;

    public rotateArmBwd(scoring score) {
        _scoring = score;
        addRequirements(_scoring);
    }
    
    @Override
    public void initialize() {
        _scoring.rotateArmBwd();
        super.initialize();
    }

    @Override
    public boolean isFinished() {
        return true;
    }
}