package frc.robot.robotcode.auto.autoSubCommands;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class delay extends CommandBase {

    long startTime;

    double duration;

    public delay (double duration){
    this.duration=duration;//duration in millis
    }

    @Override
    public void initialize () {
        startTime = System.currentTimeMillis();
    }

    @Override
    public boolean isFinished () {
        return System.currentTimeMillis() - startTime >= (duration*1000);
    }
    
}
