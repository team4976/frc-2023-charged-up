package frc.robot.robotcode.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.robotcode.subsystems.robotDrive;


public class engageHighGear extends CommandBase {

    private robotDrive RobotDrive;

    public engageHighGear(robotDrive robotDrive){
        this.RobotDrive = robotDrive;
        addRequirements(robotDrive);
    }

    @Override
    public boolean isFinished(){
        return false;
    }

    public void initialize () {
        RobotDrive.setHighGear();
    }

    public void end (boolean interupted){
        RobotDrive.endHighGear();
    }
    
}
