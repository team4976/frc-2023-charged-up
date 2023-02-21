package frc.robot.limelight.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.limelight.subsystems.LimeLight;
import frc.robot.robotConstants;

public class setheightFalse extends CommandBase{

    public setheightFalse(LimeLight limeLight){
        addRequirements(limeLight);
       }

       @Override
       public void initialize(){
        robotConstants.heightSelection = false;
       }

       @Override
       public boolean isFinished(){
        return false;
       }    
   
    
}