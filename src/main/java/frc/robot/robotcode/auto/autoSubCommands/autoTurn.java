package frc.robot.robotcode.auto.autoSubCommands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.robotConstants;
import frc.robot.robotcode.subsystems.robotDrive;

public class autoTurn extends CommandBase {
    robotDrive robotDrive;
    double position;
    int duration;
    long startTime;
    int rotation;
    public autoTurn(robotDrive robotDrive, double position){
        this.robotDrive=robotDrive;
        addRequirements(robotDrive);
        this.position=position;
    }
    @Override
    public void initialize() {
        System.out.println("begin auto drive");
        robotDrive.rotateOnPosition(position);// position
        //startTime=System.currentTimeMillis();// wheel to wheel distance ~ 2 feet
        // TODO Auto-generated method stub
        super.initialize();
    }
    @Override
    public void end(boolean interrupted) {
        System.out.println("end auto drive");
        robotDrive.setArcadeDrive(0, 0);
        // TODO Auto-generated method stub
        super.end(interrupted);
    }
    @Override
    public boolean isFinished() {

        double leftError = Math.abs(position - robotConstants.m_DriveTalonLeft.getSelectedSensorPosition());
        double rightError = Math.abs(-position - robotConstants.m_DriveTalonRight.getSelectedSensorPosition());

        boolean inDeadband = Math.max(leftError, rightError) < 500;

        boolean hasStopped = Math.abs(robotConstants.m_DriveTalonLeft.getSelectedSensorVelocity()) < 10
        && Math.abs(robotConstants.m_DriveTalonRight.getSelectedSensorVelocity()) < 10;



        return inDeadband && hasStopped;
    }
}
