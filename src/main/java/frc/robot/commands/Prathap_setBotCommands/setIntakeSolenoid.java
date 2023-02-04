package frc.robot.commands.Prathap_setBotCommands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Dev.robotIntake;

public class setIntakeSolenoid extends CommandBase {
    private final robotIntake Robot_Intake;

    public setIntakeSolenoid(robotIntake Robot_Intake) {
        this.Robot_Intake = Robot_Intake;
        addRequirements(Robot_Intake);
    }
  private boolean isExtended = false;

    @Override
    public void initialize() {
        super.initialize();
        isExtended = !isExtended;
        Robot_Intake.extendMainIntake(isExtended);
    }

    @Override
    public boolean isFinished() {
        return true;
    }

}
