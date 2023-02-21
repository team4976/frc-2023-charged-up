package frc.robot.robotcode.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.robotConstants;
import frc.robot.robotcode.subsystems.intake;

public class intakeCube extends CommandBase {
    
    private intake intake;

    public intakeCube(intake intake) {
        this.intake = intake;
        addRequirements(intake);
    }
    
    @Override
    public void execute() {
        intake.intakeCube(robotConstants.cubePosition);
        super.initialize();
    }

    @Override
    public boolean isFinished() {
        return false;
    }

    @Override
    public void end (boolean interrupted) {
        intake.intakeStop();
    }
}