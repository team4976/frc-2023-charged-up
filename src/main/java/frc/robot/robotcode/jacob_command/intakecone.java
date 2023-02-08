package frc.robot.robotcode.dev.jacob_command;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.robotcode.subsystems.Jacob_testbot.intake;

public class intakecone extends CommandBase{
    intake Intake;

    public intakecone(intake Intake){
        this.Intake = Intake;
        addRequirements(Intake);
    }

    @Override
    public void initialize(){
        Intake.intakeCone();
        super.initialize();
       
    
    }
@Override
public boolean isFinished() {
    return true;
}
}
