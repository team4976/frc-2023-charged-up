package frc.robot.dev.commands.Haris_setBotCommands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.dev.subsystems.Haris_testBot.robotIntake;

public class setMainIntake extends CommandBase{

    private final robotIntake robot_intake;
 
    public setMainIntake(robotIntake robot_intake) {
        this.robot_intake = robot_intake;
        addRequirements(robot_intake); 
    }

    @Override
    public void initialize() {
        super.initialize();
        robot_intake.spinIntake(1, 1);
    }

}
