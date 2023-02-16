package frc.robot.robotcode.commands.auto;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class delay extends CommandBase {

    long startTime;

    double duration;

    public delay (double duration){
    this.duration=duration;
    }

    @Override
    public void initialize () {
        startTime = System.currentTimeMillis();
    }

    @Override
    public boolean isFinished () {
        return System.currentTimeMillis() - startTime >= duration;
    }
    
}
