package frc.robot.robotcode.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.robotConstants;


import static frc.robot.RobotContainer._statusLight;
// import frc.robot.robotcode.subsystems.intake;

public class cubeIn extends CommandBase{


    public cubeIn() {
    }
    
    @Override
    public void initialize() {
        robotConstants.peiceSelection = true;
        _statusLight.setRGB(100, 0, 100);
    }

    @Override
    public boolean isFinished() {
        return true;
    }
}
