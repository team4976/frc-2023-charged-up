package frc.robot.robotcode.auto.autoSubCommands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.robotConstants;
import frc.robot.robotcode.subsystems.intake;

public class autoCuberetract extends CommandBase{
    
    private intake _intake;
    public boolean _peice;

    public autoCuberetract(intake intake) {
        _intake = intake;
        addRequirements(_intake);
    }
    @Override
    public void initialize() {
        _intake.retractCube(robotConstants.cubeRetractedPosition);
    }


    @Override
    public boolean isFinished(){
        return (Math.abs(robotConstants.cubeRetractedPosition-robotConstants.m_IntakeTalonMain.getSelectedSensorPosition())<100);
    //     if(_peice == true){
    //         return (Math.abs(robotConstants.m_IntakeTalonMain.getSelectedSensorPosition()-robotConstants.cubePosition)>1000);
    // }

    // else{
    //     return (Math.abs(robotConstants.m_IntakeTalonMain.getSelectedSensorPosition()-robotConstants.conePosition)>1000);
    // }
    }
}
