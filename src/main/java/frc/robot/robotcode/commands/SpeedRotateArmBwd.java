package frc.robot.robotcode.commands;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.robotConstants;
import frc.robot.robotcode.subsystems.scoring;

public class SpeedRotateArmBwd extends CommandBase {
    
    private scoring _scoring;

    public SpeedRotateArmBwd(scoring score) {
        _scoring = score;
        addRequirements(_scoring);
    }
     @Override
    public void initialize() {
        _scoring.RetractFourBar();
    } 

    @Override
    public boolean isFinished() {
        return false;
    }
    
    @Override
    public void execute(){
            _scoring.SpeedRotateArmBwd();
    }
     
   @Override
   public void end(boolean interrupt){
   robotConstants.m_ArmRotator.set(ControlMode.PercentOutput, 0);
   } 
}