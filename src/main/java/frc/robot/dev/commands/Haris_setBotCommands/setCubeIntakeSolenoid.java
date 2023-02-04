package frc.robot.dev.commands.Haris_setBotCommands;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.dev.subsystems.Haris_testBot.robotIntake;

public class setCubeIntakeSolenoid extends CommandBase{
    private final robotIntake robot_intake;
    private boolean isExtended = false;

    public setCubeIntakeSolenoid(robotIntake robot_intake) {
        this.robot_intake = robot_intake;
        addRequirements(robot_intake); 
    }
    public void initialize() {
        super.initialize();
        isExtended = !isExtended;//toggle extend
        robot_intake.extendCubeIntake(isExtended);
    }
}
