package frc.robot.robotcode.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.robotConstants;
import frc.robot.robotcode.subsystems.robotDrive;


public class AutoDrivePos extends CommandBase {
    robotDrive _robotDrive;
    robotConstants _robotConstants;
    double position;
    int duration;
    long startTime;
    int rotation;
    public AutoDrivePos(robotDrive _robotDrive, double position){
        this._robotDrive=_robotDrive;
        addRequirements(_robotDrive);
        this.position=position;
    }
    @Override
    public void initialize() {
        System.out.println("begin auto drive");
        _robotDrive.driveToPosition(position);// position
        //startTime=System.currentTimeMillis();// wheel to wheel distance ~ 2 feet
        // TODO Auto-generated method stub
        super.initialize();
    }
    @Override
    public void end(boolean interrupted) {
        System.out.println("end auto drive");
        _robotDrive.setArcadeDrive(0, 0);
        // TODO Auto-generated method stub
        super.end(interrupted);
    }
    @Override
    public boolean isFinished() {

        double leftError = Math.abs(position - _robotConstants.m_DriveTalonLeft.getSelectedSensorPosition());
        double rightError = Math.abs(position - _robotConstants.m_DriveTalonRight.getSelectedSensorPosition());

        boolean inDeadband = Math.max(leftError, rightError) < 200;

        boolean hasStopped = Math.abs(_robotConstants.m_DriveTalonLeft.getSelectedSensorVelocity()) < 1 
        && Math.abs(_robotConstants.m_DriveTalonRight.getSelectedSensorVelocity()) < 1; 



        return inDeadband && hasStopped;
    }
    

    
}
