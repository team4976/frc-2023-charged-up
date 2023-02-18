// INCOMPLETE CODE

package frc.robot.robotcode.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.robotcode.subsystems.intake;
import frc.robot.robotConstants;

public class extend extends CommandBase{
    
    private intake _intake;

    public extend(intake intake) {
        _intake = intake;
        addRequirements(_intake);
    }
    
    @Override
    public void execute() {

        if(robotConstants.peiceSelection == true){
            _intake.intakeCube();
            super.initialize();
        }

        else{
            _intake.intakeCone();
            super.initialize();
        }
        
    }

    @Override
    public boolean isFinished() {
        return true;
    }










}
