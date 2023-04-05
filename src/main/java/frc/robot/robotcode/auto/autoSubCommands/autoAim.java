package frc.robot.robotcode.auto.autoSubCommands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.robotConstants;
import frc.robot.limelight.commands.aim;
import frc.robot.limelight.subsystems.LimeLight;
import frc.robot.robotcode.commands.cubeIn;
import frc.robot.robotcode.subsystems.robotDrive;

// import static frc.robot.RobotContainer._limelight;
// import static frc.robot.RobotContainer._robotDrive;

public class autoAim extends CommandBase{

    LimeLight _limeLight;
    robotDrive _robotDrive;
    boolean cube;
    long startTime;
    long totalTime;

    public autoAim(LimeLight _limeLight, robotDrive _robotDrive, boolean cube){
     this._limeLight = _limeLight;
     this._robotDrive = _robotDrive;
     this.cube = cube;
     addRequirements(_limeLight, _robotDrive);
    }

    @Override
    public boolean isFinished(){

        if(LimeLight.isVaildTagret()){
            if(LimeLight.angleOff() < 2){
                // to allow the timer start
            }
            else{
                startTime = System.currentTimeMillis(); 
            }
        }
        else{
            startTime = System.currentTimeMillis();
        }
        return System.currentTimeMillis() - startTime > 1000 || totalTime - 2000 > 100;
    }

    @Override
    public void end (boolean interrupted){
        _robotDrive.setArcadeDrive(0, 0);
    }

    @Override
    public void execute(){
        _limeLight.aim(_robotDrive);
    }

    @Override
    public void initialize() {
        robotConstants.peiceSelection = cube;
        totalTime = System.currentTimeMillis();
    }
    
}
