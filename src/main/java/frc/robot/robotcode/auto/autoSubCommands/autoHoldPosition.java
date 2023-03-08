package frc.robot.robotcode.auto.autoSubCommands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.robotConstants;
import frc.robot.robotcode.subsystems.robotDrive;

public class autoHoldPosition extends CommandBase {
robotDrive _robotDrive;

    public autoHoldPosition (robotDrive _robotDrive) {
        this._robotDrive=_robotDrive;
        addRequirements(_robotDrive);
        
    }
    @Override
    public void initialize () {
        robotConstants.m_DriveTalonLeft.setSelectedSensorPosition(0);
        robotConstants.m_DriveTalonRight.setSelectedSensorPosition(0);
    }

    @Override
    public void execute () {
        _robotDrive.holdAPosition();
    }

    @Override
    public void end (boolean interrupted) { 
        _robotDrive.setArcadeDrive(0, 0);
    }
    
    
}
