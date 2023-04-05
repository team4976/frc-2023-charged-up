package frc.robot.robotcode.auto.autoSubCommands;

import javax.swing.text.html.HTMLDocument.RunElement;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.robotConstants;
import frc.robot.robotcode.subsystems.intake;
import frc.robot.robotcode.subsystems.robotDrive;

public class autoCubeAtIntake extends CommandBase{
    
    private intake _intake;
    public boolean _peice;
    private robotDrive _robotDrive;
    public long startTime;

    public autoCubeAtIntake(intake intake, robotDrive robotDrive) {
        _intake = intake;
        _robotDrive = robotDrive;
        addRequirements(_intake);
    }
    @Override
    public void initialize() {
        startTime = System.currentTimeMillis();
        _robotDrive.setArcadeDrive(.2, 0);
        super.initialize();
    }
    @Override
    public boolean isFinished(){
        if (robotConstants.cubeInIntake.get() == false){
            return true;
        }
        else if (System.currentTimeMillis() - startTime > 3000){
            return true;
        }
        return false;
}

@Override 
public void end(boolean interupted){
    _intake.intakeStop();
    _robotDrive.setArcadeDrive(0, 0);
}
}
