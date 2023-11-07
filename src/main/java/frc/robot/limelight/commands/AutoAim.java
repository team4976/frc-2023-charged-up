package frc.robot.limelight.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.robotConstants;
import frc.robot.limelight.subsystems.LimeLight;
import frc.robot.robotcode.subsystems.robotDrive;

public class AutoAim extends CommandBase{

    LimeLight _limeLight;
    robotDrive _robotDrive;
    long startTime;
    long endTime;

    public  AutoAim(LimeLight _limeLight, robotDrive _robotDrive){
     this._limeLight = _limeLight;
     this._robotDrive = _robotDrive;
     addRequirements(_limeLight, _robotDrive);
    }

    @Override
    public void initialize(){
        startTime = System.currentTimeMillis();
        _limeLight.limeLightON();
    }
    @Override
    public boolean isFinished(){
        // if(LimeLight.isVaildTagret()){
            if(Math.abs(LimeLight.angleOff()) > 3.3){
                startTime = System.currentTimeMillis(); 
                System.out.println("TIME RESET***********************"+LimeLight.angleOff());
            }
        // }
        // else{
            // startTime = System.currentTimeMillis();
        // }
        // if(Math.abs(Math.abs(robotConstants.m_DriveTalonLeft.getSelectedSensorPosition())-Math.abs(robotConstants.m_DriveTalonRight.getSelectedSensorPosition()))< 50000){
            return ((System.currentTimeMillis() - startTime) > 500);
        // }
       // return false;
    }

    @Override
    public void execute(){
        // if(Math.abs(Math.abs(robotConstants.m_DriveTalonLeft.getSelectedSensorPosition())-Math.abs(robotConstants.m_DriveTalonRight.getSelectedSensorPosition()))< 50000){
        if(LimeLight.isVaildTagret()){
        _limeLight.aim(_robotDrive);
        // System.out.println("******************************************************");
        // System.out.println(System.currentTimeMillis() - startTime);
        }
        else {
            _robotDrive.setArcadeDrive(0,0);
            System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        }
    }
    // else{
    //     _robotDrive.setArcadeDrive(0,0);
    // }
    // }

    @Override 
    public void end(boolean interupted){
        System.out.println("******END******");
         _limeLight.limelightOFF();
         _robotDrive.setArcadeDrive(0, 0);
        }
    }