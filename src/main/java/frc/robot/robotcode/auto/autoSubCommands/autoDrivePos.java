package frc.robot.robotcode.auto.autoSubCommands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.robotConstants;
import frc.robot.robotcode.subsystems.robotDrive;


public class autoDrivePos extends CommandBase {
    robotDrive _robotDrive;
    robotConstants _robotConstants;
    double position;
    int duration;
    long startTime;
    int rotation;
    public autoDrivePos(robotDrive _robotDrive, double position){
        this._robotDrive=_robotDrive;
        addRequirements(_robotDrive);
        this.position=position;
    }
    @Override
    public void initialize() {
        super.initialize();
        // robotConstants.m_DriveTalonLeft.setInverted(true);
        //robotConstants.m_DriveTalonRight.setInverted(true);
        System.out.println("begin auto drive************************");
        _robotDrive.driveToPosition(position);// position
        //startTime=System.currentTimeMillis();// wheel to wheel distance ~ 2 feet
        // TODO Auto-generated method stub
    }
    @Override
    public void end(boolean interrupted) {
        System.out.println("end auto drive");
        // robotConstants.m_DriveTalonLeft.setInverted(false);
        // robotConstants.m_DriveTalonRight.setInverted(false);
        _robotDrive.setArcadeDrive(0, 0);
        // TODO Auto-generated method stub
        super.end(interrupted);
    }
    @Override
    public boolean isFinished() {
        return Math.abs(position - robotConstants.m_DriveTalonLeft.getSelectedSensorPosition()) < 500; 
        // && Math.abs(position - robotConstants.m_DriveTalonRight.getSelectedSensorPosition()) < 500;

        // double leftError = Math.abs(position - robotConstants.m_DriveTalonLeft.getSelectedSensorPosition());
        // double rightError = Math.abs(position - robotConstants.m_DriveTalonRight.getSelectedSensorPosition());

        // boolean inDeadband = Math.max(leftError, rightError) < 200;

        // boolean hasStopped = Math.abs(robotConstants.m_DriveTalonLeft.getSelectedSensorVelocity()) < 1 
        // && Math.abs(robotConstants.m_DriveTalonRight.getSelectedSensorVelocity()) < 1; 



        // return inDeadband && hasStopped;
    }
    

    
}
