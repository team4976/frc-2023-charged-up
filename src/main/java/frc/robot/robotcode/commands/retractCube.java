package frc.robot.robotcode.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.robotConstants;
import frc.robot.robotcode.subsystems.intake;

public class retractCube extends CommandBase {
    
    private intake intake;

    public retractCube (intake intake) {
        this.intake = intake;
        addRequirements(intake);
    }
    
    @Override
    public void initialize() {
        intake.retractCube(robotConstants.cubeRetractedPosition);
        super.initialize();
    }

    @Override
    public boolean isFinished() {
        return true;
    }

    @Override
    public void end (boolean interrupted) {
        intake.intakeStop();
    }
}