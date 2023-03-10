package frc.robot.robotcode.commands;

import static frc.robot.RobotContainer._statusLight;
// import frc.robot.robotcode.subsystems.intake;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.robotConstants;

public class coneIn extends CommandBase{

    public coneIn() {
    }
    
    @Override
    public void initialize() {
        robotConstants.peiceSelection = false;
        _statusLight.setRGB(100, 100, 0);
        //62°, 85%, 93%
    }

    @Override
    public boolean isFinished() {
        return true;
    }
}