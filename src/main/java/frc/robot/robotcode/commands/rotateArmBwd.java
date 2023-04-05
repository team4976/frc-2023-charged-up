package frc.robot.robotcode.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.robotConstants;
import frc.robot.robotcode.subsystems.scoring;

public class rotateArmBwd extends CommandBase {
    
    private scoring _scoring;

    public rotateArmBwd(scoring score) {
        _scoring = score;
        addRequirements(_scoring);
    }
  /*   @Override
    public void initialize() {
        Scoring.rotateArmFwd();
        super.initialize();
    } */

    @Override
    public boolean isFinished() {
        return false;
    }
    
    @Override
    public void execute(){
            _scoring.rotateArmBwd();
    }
     
   @Override
   public void end(boolean interrupt){
   _scoring.setArmPos(robotConstants.m_ArmRotator.getSelectedSensorPosition());
   } 
}