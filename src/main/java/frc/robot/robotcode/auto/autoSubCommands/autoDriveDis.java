package frc.robot.robotcode.auto.autoSubCommands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.robotConstants;
import frc.robot.limelight.subsystems.LimeLight;
import frc.robot.robotcode.subsystems.robotDrive;


public class autoDriveDis extends CommandBase {
    robotDrive _robotDrive;
    robotConstants _robotConstants;
    LimeLight LimeLight;
    double dis;


    double value;
    public autoDriveDis(robotDrive _robotDrive, LimeLight limeLight){
        this._robotDrive=_robotDrive;
        this.LimeLight=limeLight;
        addRequirements(_robotDrive);

    }
    @Override
    public void initialize() {
        super.initialize();
         //dis = LimeLight.limelightDisY()*1000;
        _robotDrive.driveToPosition(dis);
    }
    @Override
    public void end(boolean interrupted) {
        _robotDrive.setArcadeDrive(0, 0);
    }
    @Override
    public boolean isFinished() {

        double leftError = Math.abs(dis) - Math.abs(robotConstants.m_DriveTalonLeft.getSelectedSensorPosition());
        double rightError = Math.abs(dis) - Math.abs(robotConstants.m_DriveTalonRight.getSelectedSensorPosition());

        boolean inDeadband = Math.max(leftError, rightError) < 500;
        boolean hasStopped = Math.abs(robotConstants.m_DriveTalonLeft.getSelectedSensorVelocity()) < 200//1
        && Math.abs(robotConstants.m_DriveTalonRight.getSelectedSensorVelocity()) < 200; 


        return inDeadband && hasStopped;
    }
    

    
}
