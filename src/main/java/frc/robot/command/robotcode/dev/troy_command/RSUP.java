package frc.robot.command.robotcode.dev.troy_command;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystem.robotcode.dev.troy_subsystem.Scoring;

public class RSUP extends CommandBase {
    public Scoring robot_scoring;
 
    public RSUP(Scoring robot_scoring){       
        this.robot_scoring = robot_scoring;
        addRequirements(robot_scoring);
    }
    
    @Override
    public void initialize(){
    
        robot_scoring.RSUP();
        super.initialize();
    }
    
    @Override
    public boolean isFinished(){
        return true;
    }
}

    

