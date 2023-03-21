package frc.robot.robotcode.auto.autoSubCommands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.robotConstants;
import frc.robot.robotcode.subsystems.robotDrive;

public class autoRotateOnPos extends CommandBase {

    robotDrive _robotDrive;
    double rotation;

    public autoRotateOnPos (robotDrive _robotDrive, double rotation) {
        this._robotDrive=_robotDrive;
        this.rotation=rotation;
        addRequirements(_robotDrive);
    }

    @Override
    public void initialize () {
        System.out.println("begin auto rotate");
        _robotDrive.rotateOnPosition(rotation);
        super.initialize();
    }

    @Override
    public void end (boolean interrupted) {
        System.out.println("end auto drive");

        _robotDrive.setArcadeDrive(0, 0);
        super.end(interrupted);
    }
    public boolean isFinished() {
         return Math.abs(rotation - robotConstants.m_DriveTalonLeft.getSelectedSensorPosition()) < 500 || Math.abs(rotation + robotConstants.m_DriveTalonLeft.getSelectedSensorPosition()) < 500; 

        // double leftError = Math.abs(rotation) - Math.abs(robotConstants.m_DriveTalonLeft.getSelectedSensorPosition());
        // double rightError = Math.abs(rotation) - Math.abs(robotConstants.m_DriveTalonRight.getSelectedSensorPosition());
 
        //  boolean inDeadband = Math.max(leftError, rightError) < 500;
        //  System.out.println(robotConstants.m_DriveTalonLeft.getSelectedSensorVelocity());
        //  boolean hasStopped = Math.abs(robotConstants.m_DriveTalonLeft.getSelectedSensorVelocity()) < 200//1
        //  && Math.abs(robotConstants.m_DriveTalonRight.getSelectedSensorVelocity()) < 200; 
 
 
        //  return inDeadband && hasStopped;
    
}
}
