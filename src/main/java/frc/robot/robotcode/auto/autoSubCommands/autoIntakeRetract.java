package frc.robot.robotcode.auto.autoSubCommands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.robotConstants;
import frc.robot.robotcode.subsystems.intake;

public class autoIntakeRetract extends CommandBase{
    
    private intake _intake;
    public boolean _peice;

    public autoIntakeRetract(intake intake, boolean peice) {
        _peice = peice;
        _intake = intake;
        addRequirements(_intake);
    }
    @Override
    public void initialize() {
        _intake.intakeStop();

        if(_peice == true){
                _intake.retractCube(robotConstants.cubeRetractedPosition);
        }

        else{
            _intake.retractCone(robotConstants.coneRetractedPosition);
        }
        
    }


    @Override
    public boolean isFinished(){
        if(_peice == true){
            return (Math.abs(robotConstants.m_IntakeTalonMain.getSelectedSensorPosition()-robotConstants.cubePosition)>1000);
    }

    else{
        return (Math.abs(robotConstants.m_IntakeTalonMain.getSelectedSensorPosition()-robotConstants.conePosition)>1000);
    }
    }
}
