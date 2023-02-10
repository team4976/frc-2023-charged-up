package frc.robot.command.robotcode.dev.troy_command;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystem.robotcode.dev.troy_subsystem.RobotIntake_Tro;

public class RobotScoringCOMM extends CommandBase {
    int TogglePlacement = 0;

    public RobotScoringCOMM(RobotIntake_Tro robot_intak) {
        TogglePlacement++;
        TogglePlacement = TogglePlacement % 3;

    }

}
