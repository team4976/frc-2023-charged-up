package frc.robot.limelight.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.limelight.subsystems.LimeLight;
import frc.robot.robotConstants;

public class setheightTrue extends CommandBase{

    public setheightTrue(LimeLight limeLight){
        addRequirements(limeLight);
       }

       @Override
       public void initialize(){
        robotConstants.heightSelection = true;
       }

       @Override
       public boolean isFinished(){
        return false;
       }    
   
    
}