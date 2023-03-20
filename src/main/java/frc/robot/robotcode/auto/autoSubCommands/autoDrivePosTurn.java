package frc.robot.robotcode.auto.autoSubCommands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.robotConstants;
import frc.robot.robotcode.subsystems.robotDrive;


public class autoDrivePosTurn extends CommandBase {
    robotDrive _robotDrive;
    robotConstants _robotConstants;
    double position;
    int duration;
    long startTime;
    double rotation;
    boolean turnLeft;

    double value;
    public autoDrivePosTurn(robotDrive _robotDrive, double position, double rotation, boolean left){
        this._robotDrive=_robotDrive;
        addRequirements(_robotDrive);
        this.position=position;
        this.rotation=rotation;
        this.turnLeft=left;
        value = rotation+position;

    }
    @Override
    public void initialize() {
        super.initialize();
        if(turnLeft){
        _robotDrive.dirveAndRotateLEFT(position, rotation);
        }
        else{
            _robotDrive.dirveAndRotateRight(position, rotation);
            }
    }
    @Override
    public void end(boolean interrupted) {
        System.out.println("end auto drive");
        _robotDrive.setArcadeDrive(0, 0);
    }
    @Override
    public boolean isFinished() {
        if(turnLeft){
        return Math.abs(value - robotConstants.m_DriveTalonLeft.getSelectedSensorPosition()) < 500 || Math.abs(value + robotConstants.m_DriveTalonLeft.getSelectedSensorPosition()) < 500; 
        }
        else{
            return Math.abs(value - robotConstants.m_DriveTalonRight.getSelectedSensorPosition()) < 500 || Math.abs(value + robotConstants.m_DriveTalonRight.getSelectedSensorPosition()) < 500; 
        }
        // && Math.abs(position - robotConstants.m_DriveTalonRight.getSelectedSensorPosition()) < 500;

        // double leftError = Math.abs(position - robotConstants.m_DriveTalonLeft.getSelectedSensorPosition());
        // double rightError = Math.abs(position - robotConstants.m_DriveTalonRight.getSelectedSensorPosition());

        // boolean inDeadband = Math.max(leftError, rightError) < 200;

        // boolean hasStopped = Math.abs(robotConstants.m_DriveTalonLeft.getSelectedSensorVelocity()) < 1 
        // && Math.abs(robotConstants.m_DriveTalonRight.getSelectedSensorVelocity()) < 1; 



        // return inDeadband && hasStopped;
    }
    

    
}
