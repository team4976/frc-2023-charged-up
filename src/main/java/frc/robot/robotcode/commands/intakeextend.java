// INCOMPLETE CODE

package frc.robot.robotcode.commands;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.robotcode.auto.autoSubCommands.delay;
import frc.robot.robotcode.subsystems.intake;
import frc.robot.robotConstants;

public class intakeextend extends CommandBase{
    
    private intake _intake;

    public intakeextend(intake intake) {
        _intake = intake;
        addRequirements(_intake);
    }
    @Override
    public void execute() {

        if(robotConstants.peiceSelection == true){
                _intake.intakeCube(robotConstants.cubePosition);
        }

        else{
            _intake.intakeCone(robotConstants.conePosition);
        }
        
    }

    @Override
    public boolean isFinished(){
        return (robotConstants.m_IntakeTalonMain.getStatorCurrent() > 20);
    }

    @Override
    public void end(boolean interrupted){
        robotConstants.m_IntakeTalonMain.set(ControlMode.PercentOutput, 0);
        // _intake.intakeStop();
        // _intake.retractCone(robotConstants.coneRetractedPosition);
    }
}
