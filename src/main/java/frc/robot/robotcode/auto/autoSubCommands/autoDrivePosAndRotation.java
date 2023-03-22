package frc.robot.robotcode.auto.autoSubCommands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.robotConstants;
import frc.robot.robotcode.subsystems.robotDrive;


public class autoDrivePosAndRotation extends CommandBase {
    robotDrive _robotDrive;
    robotConstants _robotConstants;
    double positionR;
    int duration;
    long startTime;
    double positionL;

    double value;
    public autoDrivePosAndRotation(robotDrive _robotDrive, double positionL, double positionR){
        this._robotDrive=_robotDrive;
        addRequirements(_robotDrive);
        this.positionL=positionL;
        this.positionR=positionR;

    }
    @Override
    public void initialize() {
        super.initialize();
        _robotDrive.driveAndRotate(positionL, positionR);
    }
    @Override
    public void end(boolean interrupted) {
        robotConstants.m_DriveTalonRight.setSelectedSensorPosition(0);
        robotConstants.m_DriveTalonLeft.setSelectedSensorPosition(0);
        _robotDrive.setArcadeDrive(0, 0);
    }
    @Override
    public boolean isFinished() {

        double leftError = Math.abs(positionL) - Math.abs(robotConstants.m_DriveTalonLeft.getSelectedSensorPosition());
        double rightError = Math.abs(positionR) - Math.abs(robotConstants.m_DriveTalonRight.getSelectedSensorPosition());

        boolean inDeadband = Math.max(leftError, rightError) < 500;
       System.out.println(robotConstants.m_DriveTalonLeft.getSelectedSensorVelocity());
        boolean hasStopped = Math.abs(robotConstants.m_DriveTalonLeft.getSelectedSensorVelocity()) < 200//1
        && Math.abs(robotConstants.m_DriveTalonRight.getSelectedSensorVelocity()) < 200; 


        return inDeadband && hasStopped;
    }
    

    
}
