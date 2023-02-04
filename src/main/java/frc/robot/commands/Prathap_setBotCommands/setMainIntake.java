package frc.robot.commands.Prathap_setBotCommands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Dev.robotIntake;

public class setMainIntake extends CommandBase {

    private final robotIntake Robot_Intake;

    public setMainIntake(robotIntake Robot_Intake) {
        this.Robot_Intake = Robot_Intake;
        addRequirements(Robot_Intake);
    }

    @Override
    public void initialize() {
        super.initialize();
        Robot_Intake.spinIntake(0.7, -0.7);
    }


    @Override
    public boolean isFinished() {
        return true;
    }

}
