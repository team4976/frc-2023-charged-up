package frc.robot.robotcode.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.robotcode.subsystems.scoring;
import frc.robot.robotConstants;

public class rotateArmFwd extends CommandBase {
    
    private scoring Scoring;

    public rotateArmFwd(scoring score) {
        this.Scoring = score;
        addRequirements(score);
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
        Scoring.rotateArmFwd();
        System.out.println(robotConstants.m_ArmRotator.getSelectedSensorPosition());
    }
     
   @Override
   public void end(boolean interrupt){
   Scoring.stopRotating();
   } 
   
}