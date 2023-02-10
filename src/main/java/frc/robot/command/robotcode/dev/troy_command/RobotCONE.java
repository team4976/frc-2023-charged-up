package frc.robot.command.robotcode.dev.troy_command;

import edu.wpi.first.wpilibj2.command.CommandBase;

import frc.robot.subsystem.robotcode.dev.troy_subsystem.RobotIntake_Tro;

public class RobotCONE extends CommandBase {
    private boolean isExtended = false;
    private final RobotIntake_Tro robot_intake;

    public RobotCONE(RobotIntake_Tro robot_intake) {
        this.robot_intake = robot_intake;
         addRequirements(robot_intake);
    }

    @Override
    public void initialize() {

        isExtended = !isExtended;
        robot_intake.INTAKE_CONE(isExtended);
        super.initialize();
    }

    @Override
    public boolean isFinished() {
        return true;
    }
}
