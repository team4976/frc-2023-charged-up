package frc.robot.robotcode.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.robotcode.subsystems.robotDrive;


public class engageHighGear extends CommandBase {
    
    public void initialize () {
        robotDrive.setHighGear();
    }

    public void end (boolean interupted){
        robotDrive.endHighGear();
    }
    
}
