package frc.robot.command.robotcode.dev.troy_command;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystem.robotcode.dev.troy_subsystem.Scoring;

public class RSRIGHT extends CommandBase {
    public Scoring robot_scoring;
 
    public RSRIGHT(Scoring robot_scoring){      
    
        this.robot_scoring = robot_scoring;
        addRequirements(robot_scoring);
    }
    
    @Override
    public void initialize(){
    
        robot_scoring.RSRIGHT();
        super.initialize();
    }
    
    @Override
    public boolean isFinished(){
        return true;
    }
}

    
