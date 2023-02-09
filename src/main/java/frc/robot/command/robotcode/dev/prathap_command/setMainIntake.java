package frc.robot.command.robotcode.dev.prathap_command;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystem.robotcode.dev.prathap_subsystem.robotIntake;

public class setMainIntake extends CommandBase {

    private final robotIntake robot_intake;

    public setMainIntake(robotIntake robot_intake) {
        this.robot_intake = robot_intake;
        addRequirements(robot_intake);
    }

    @Override
    public void initialize() {
        super.initialize();
        robot_intake.spinIntake(0.7, -0.7);
    }


    @Override
    public boolean isFinished() {
        return true;
    }

}
