package frc.robot.command.robotcode.dev.troy_command;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystem.robotcode.dev.troy_subsystem.RobotIntake_Tro;

public class RobotCUBE extends CommandBase {

    private final RobotIntake_Tro robot_intake;
    private boolean isExtended = false;

    public RobotCUBE(RobotIntake_Tro robot_intake) {
        this.robot_intake = robot_intake;
        addRequirements(robot_intake);
    }

    @Override
    public void initialize() {
        isExtended = !isExtended;
        robot_intake.INTAKE_CUBE(!isExtended);
        super.initialize();
    }

    @Override
    public boolean isFinished() {
        return true;
    }
}
