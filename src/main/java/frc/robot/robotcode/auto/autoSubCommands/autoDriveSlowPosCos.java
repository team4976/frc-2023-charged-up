package frc.robot.robotcode.auto.autoSubCommands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.robotConstants;
import frc.robot.robotcode.subsystems.robotDrive;


public class autoDriveSlowPosCos extends CommandBase {
    robotDrive _robotDrive;
    robotConstants _robotConstants;
    double position;
    int duration;
    long startTime;
    int rotation;
    public autoDriveSlowPosCos(robotDrive _robotDrive, double position){
        this._robotDrive=_robotDrive;
        addRequirements(_robotDrive);
        this.position=position;
    }
    @Override
    public void initialize() {
        super.initialize();
        // robotConstants.m_DriveTalonLeft.setInverted(true);
        //robotConstants.m_DriveTalonRight.setInverted(true);
        _robotDrive.precisionDrive(position);// position
        //startTime=System.currentTimeMillis();// wheel to wheel distance ~ 2 feet
        // TODO Auto-generated method stub
    }
    
    @Override
    public boolean isFinished() {
        // return Math.abs(position - robotConstants.m_DriveTalonLeft.getSelectedSensorPosition()) < 500 || Math.abs(position + robotConstants.m_DriveTalonLeft.getSelectedSensorPosition()) < 500; 
        // return Math.abs(position)-Math.abs(robotConstants.m_DriveTalonLeft.getSelectedSensorPosition()) < 500;
 
         return (Math.abs(position-7000) - Math.abs(robotConstants.m_DriveTalonLeft.getSelectedSensorPosition()) < 200);
    }
    

    
}
