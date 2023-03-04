// INCOMPLETE CODE

package frc.robot.robotcode.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.robotcode.auto.autoSubCommands.delay;
import frc.robot.robotcode.subsystems.intake;
import frc.robot.robotConstants;

public class intakeextend extends CommandBase{
    
    private intake _intake;

    public intakeextend(intake intake) {
        _intake = intake;
        addRequirements(_intake);
    }
    @Override
    public void execute() {

        if(robotConstants.peiceSelection == true){
                _intake.intakeCube(robotConstants.cubePosition);
        }

        else{
            _intake.intakeCone(robotConstants.conePosition);
        }
        
    }

    @Override
    public boolean isFinished(){
        // if(Math.abs(robotConstants.conePosition-robotConstants.m_IntakeTalonMain.getSelectedSensorPosition()) < 100){
        // return (robotConstants.m_IntakeTop.getStatorCurrent() > 1200);
        // }
        return false;
    }

    @Override
    public void end(boolean interrupted){
        // _intake.intakeStop();
        // _intake.retractCone(robotConstants.coneRetractedPosition);
    }
}
