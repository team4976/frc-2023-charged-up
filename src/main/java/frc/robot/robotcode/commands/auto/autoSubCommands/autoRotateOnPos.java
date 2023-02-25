package frc.robot.robotcode.commands.auto.autoSubCommands;

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

        double leftError = Math.abs(rotation - robotConstants.m_DriveTalonLeft.getSelectedSensorPosition());
        double rightError = Math.abs(rotation - robotConstants.m_DriveTalonRight.getSelectedSensorPosition());

        boolean inDeadband = Math.max(leftError, rightError) < 200;

        boolean hasStopped = Math.abs(robotConstants.m_DriveTalonLeft.getSelectedSensorVelocity()) < 1 
        && Math.abs(robotConstants.m_DriveTalonRight.getSelectedSensorVelocity()) < 1; 



        return inDeadband && hasStopped;
    }
    
}
