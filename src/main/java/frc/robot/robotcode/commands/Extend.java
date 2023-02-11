// INCOMPLETE CODE

package frc.robot.robotcode.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.robotcode.subsystems.intake;
import frc.robot.robotConstants;

public class Extend extends CommandBase{
    
    private intake intake;

    public Extend(intake intake) {
        this.intake = intake;
        addRequirements(intake);
    }
    
    @Override
    public void initialize() {

        if(robotConstants.peiceSelection == false){
            intake.intakeCube();
            super.initialize();
        }

        else{
            intake.intakeCone();
            super.initialize();
        }
        
    }

    @Override
    public boolean isFinished() {
        return true;
    }










}
