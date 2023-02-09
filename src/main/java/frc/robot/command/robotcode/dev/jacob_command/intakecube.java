package frc.robot.command.robotcode.dev.jacob_command;
 

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Jacob_testbot.intake;

public class intakecube extends CommandBase{
    
    intake Intake;

    public intakecube(intake Intake){
this.Intake = Intake;
addRequirements(Intake);


    }
    
    @Override 
public void initialize(){
    Intake.intakeCube(0.8,.9);
    super.initialize();
   

}
@Override
public boolean isFinished() {
    return true;
}
}
