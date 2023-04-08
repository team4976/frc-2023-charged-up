package frc.robot.robotcode.auto.autoSubCommands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.robotConstants;
import frc.robot.robotcode.subsystems.intake;

public class autoIntake extends CommandBase{
    
    private intake _intake;
    public boolean _peice;

    public autoIntake(intake intake, boolean peice) {
        _peice = peice;
        _intake = intake;
        addRequirements(_intake);
    }
    @Override
    public void initialize() {

        if(_peice == true){
                _intake.intakeCube(robotConstants.cubePosition);
        }

        else{
            _intake.intakeCone(robotConstants.conePosition);
        }
        
    }

    @Override
    public boolean isFinished(){
        return (robotConstants.m_IntakeTalonMain.getSelectedSensorPosition() > 500);
    //     if(_peice == true){
    //         return (Math.abs(robotConstants.m_IntakeTalonMain.getSelectedSensorPosition()-robotConstants.cubePosition)<100);
    // }

    // else{
    //     return (Math.abs(robotConstants.m_IntakeTalonMain.getSelectedSensorPosition()-robotConstants.conePosition)<100);
    // }
    // }
}
}
