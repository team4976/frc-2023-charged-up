package frc.robot.limelight.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.limelight.subsystems.LimeLight;
import frc.robot.robotcode.subsystems.robotDrive;

public class aim extends CommandBase{

    LimeLight _limeLight;
    robotDrive _robotDrive;
    long startTime;

    public aim(LimeLight _limeLight, robotDrive _robotDrive){
     this._limeLight = _limeLight;
     this._robotDrive = _robotDrive;
     addRequirements(_limeLight, _robotDrive);
    }

    @Override
    public void initialize(){
        _limeLight.limeLightON();
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
        return System.currentTimeMillis() - startTime > 1000;
    }

    @Override
    public void execute(){
        _limeLight.aim(_robotDrive);
    }

    @Override 
    public void end(boolean interupted){
         _limeLight.limelightOFF();
    }
    
}
