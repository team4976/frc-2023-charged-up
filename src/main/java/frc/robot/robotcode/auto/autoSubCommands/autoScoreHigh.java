package frc.robot.robotcode.auto.autoSubCommands;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.robotcode.subsystems.scoring;
import frc.robot.robotcode.auto.autoSubCommands.autoGrab;
import frc.robot.robotcode.commands.extendFourBar;
import frc.robot.robotcode.commands.retractFourBar;

public class autoScoreHigh extends CommandBase {
    public static scoring _scoring;

    public autoScoreHigh (scoring scoring) {
        _scoring = scoring;
        addRequirements(_scoring);
    }

    @Override
    public void initialize () {
            super.initialize();
            new autoGrab(_scoring);
            new delay(3.00);
            new autoArmHighPos(_scoring);
            new delay(3.00);
            new extendFourBar(_scoring);
            new delay(3.000);
            new autoRelease(_scoring);
            new delay(3.000);
            new retractFourBar(_scoring);
            new delay(3.000);
            new autoArmHomePos(_scoring);
            
    }

    @Override
    public void execute () {} 
}
