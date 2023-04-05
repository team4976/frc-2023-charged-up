package frc.robot.robotcode.auto.autoSubCommands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.robotConstants;
import frc.robot.robotcode.subsystems.robotDrive;


public class autoDrivePosHighgear extends CommandBase {
    robotDrive _robotDrive;
    robotConstants _robotConstants;
    double position;
    int duration;
    long startTime;

    public autoDrivePosHighgear(robotDrive _robotDrive, double position){
        this._robotDrive=_robotDrive;
        addRequirements(_robotDrive);
        this.position=position;
    }
    @Override
    public void initialize() {
        super.initialize();
        // robotConstants.m_DriveTalonLeft.setInverted(true);
        //robotConstants.m_DriveTalonRight.setInverted(true);
        _robotDrive.driveToPosition(position);// position
        //startTime=System.currentTimeMillis();// wheel to wheel distance ~ 2 feet
        // TODO Auto-generated method stub
    }

    @Override
    public void execute() {
        System.out.println(robotConstants.m_DriveTalonLeft.getSelectedSensorVelocity());
        if(robotConstants.m_DriveTalonLeft.getSelectedSensorPosition() > position-5000){
            robotConstants.s_gearbox.set(false);
        }
        else if (Math.abs(robotConstants.m_DriveTalonLeft.getSelectedSensorVelocity()) >2000){
            robotConstants.s_gearbox.set(true);
        }
        else{
            robotConstants.s_gearbox.set(false);
        }
    }
    @Override
    public void end(boolean interrupted) {
        robotConstants.s_gearbox.set(false);
        robotConstants.m_DriveTalonRight.setSelectedSensorPosition(0);
        robotConstants.m_DriveTalonLeft.setSelectedSensorPosition(0);
        // robotConstants.m_DriveTalonLeft.setInverted(false);
        // robotConstants.m_DriveTalonRight.setInverted(false);
        _robotDrive.setArcadeDrive(0, 0);
    }
    @Override
    public boolean isFinished() {
        // return Math.abs(position - robotConstants.m_DriveTalonLeft.getSelectedSensorPosition()) < 500 || Math.abs(position + robotConstants.m_DriveTalonLeft.getSelectedSensorPosition()) < 500; 
        // return Math.abs(position)-Math.abs(robotConstants.m_DriveTalonLeft.getSelectedSensorPosition()) < 500;
         double leftError = Math.abs(position) - Math.abs(robotConstants.m_DriveTalonLeft.getSelectedSensorPosition());
         double rightError = Math.abs(position) - Math.abs(robotConstants.m_DriveTalonRight.getSelectedSensorPosition());
 
         boolean inDeadband = Math.max(leftError, rightError) < 500;
        System.out.println(robotConstants.m_DriveTalonLeft.getSelectedSensorVelocity());
         boolean hasStopped = Math.abs(robotConstants.m_DriveTalonLeft.getSelectedSensorVelocity()) < 200//1
         && Math.abs(robotConstants.m_DriveTalonRight.getSelectedSensorVelocity()) < 200; 
 
 
         return inDeadband && hasStopped;
    }
    

    
}
