package frc.robot.robotcode.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.robotConstants;
// import frc.robot.robotConstants;
import frc.robot.robotcode.subsystems.intake;

import static frc.robot.RobotContainer._statusLight;

public class buttonIntakeSTOP extends CommandBase {
    
    private intake intake;

    public buttonIntakeSTOP(intake intake) {
        this.intake = intake;
        addRequirements(intake);
    }

    @Override
    public void initialize(){

        if(robotConstants.peiceSelection){
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        intake.retractCone(robotConstants.coneRetractedPosition);
        _statusLight.setRGB(0, 255, 0);
        //62°, 85%, 93%
    }
    else{
        intake.retractCone(robotConstants.coneRetractedPosition);
        _statusLight.setRGB(0, 255, 0);
        intake.intakeStop();
    }
}

    // @Override
    // public void execute() {
        
    //     }

    @Override
    public boolean isFinished() {
        return ((robotConstants.m_IntakeTalonMain.getSelectedSensorPosition() - robotConstants.coneRetractedPosition < 100));
    }

    @Override
    public void end (boolean interrupted) {
        //robotConstants.buttonIntakePOS = 200;
        intake.intakeStop();
    }
}