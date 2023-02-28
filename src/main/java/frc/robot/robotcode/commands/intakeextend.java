// INCOMPLETE CODE

package frc.robot.robotcode.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
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
                super.initialize();
        }

        else{
            _intake.intakeCone(robotConstants.conePosition);
            super.initialize();
        }
        
    }

    @Override
    public boolean isFinished(){
        return false;
    }
}
