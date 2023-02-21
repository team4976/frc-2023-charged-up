package frc.robot.limelight.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.limelight.subsystems.LimeLight;
import frc.robot.robotcode.subsystems.robotDrive;

import static frc.robot.RobotContainer._limelight;
import static frc.robot.RobotContainer._robotDrive;

public class aim extends CommandBase{

    LimeLight _limeLight;
    robotDrive _robotDrive;

    public aim(LimeLight _limeLight, robotDrive _robotDrive){
     this._limeLight = _limeLight;
     this._robotDrive = _robotDrive;
     addRequirements(_limeLight, _robotDrive);
    }

    @Override
    public boolean isFinished(){
        return false;
    }

    @Override
    public void execute(){
        _limeLight.aim(_robotDrive);
    }
    
}
