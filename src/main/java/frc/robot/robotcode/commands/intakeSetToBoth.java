package frc.robot.robotcode.commands;

// import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.robotConstants;
import frc.robot.robotcode.subsystems.intake;

public class intakeSetToBoth extends CommandBase {
    
    private intake intake;

    public intakeSetToBoth(intake intake) {
        this.intake = intake;
        addRequirements(intake);
    }
    
    @Override
    public void initialize() {
        intake.setIntakeToBoth();
    }

    @Override
    public boolean isFinished() {
        return false;
    }

    @Override
    public void end (boolean interrupted) {
        intake.setIntakeToNONE();
    }
}