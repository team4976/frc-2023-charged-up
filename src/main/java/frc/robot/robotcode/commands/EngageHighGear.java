package frc.robot.robotcode.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
// import frc.robot.robotcode.subsystems.robotDrive;
import static frc.robot.RobotContainer._robotDrive;


public class engageHighGear extends CommandBase {


    public engageHighGear(){
    }

    @Override
    public boolean isFinished(){
        return false;
    }

    public void initialize () {
        _robotDrive.setHighGear();
    }

    public void end (boolean interupted){
        _robotDrive.endHighGear();
    }
    
}
