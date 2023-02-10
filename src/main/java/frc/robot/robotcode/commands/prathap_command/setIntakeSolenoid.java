package frc.robot.robotcode.commands.prathap_command;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.robotcode.subsystems.prathap_subsystem.robotIntake;


public class setIntakeSolenoid extends CommandBase {
    private final robotIntake robot_intake;

    public setIntakeSolenoid(robotIntake robot_intake) {
        this.robot_intake = robot_intake;
        addRequirements(robot_intake);
    }
  private boolean isExtended = false;

    @Override
    public void initialize() {
        super.initialize();
        isExtended = !isExtended;
        robot_intake.extendMainIntake(isExtended);
    }

    @Override
    public boolean isFinished() {
        return true;
    }

}
