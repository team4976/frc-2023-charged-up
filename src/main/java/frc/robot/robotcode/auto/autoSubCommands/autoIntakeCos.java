package frc.robot.robotcode.auto.autoSubCommands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.robotConstants;
import frc.robot.robotcode.subsystems.intake;

public class autoIntakeCos extends CommandBase{
    
    private intake _intake;
    public boolean _peice;

    public autoIntakeCos(intake intake, boolean peice) {
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
        return ((Math.abs(54000) - Math.abs(robotConstants.m_DriveTalonLeft.getSelectedSensorPosition()))<200);
    }
}
