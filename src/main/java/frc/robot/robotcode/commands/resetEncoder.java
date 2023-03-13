package frc.robot.robotcode.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.robotConstants;

public class resetEncoder extends CommandBase {

    @Override
    public void initialize(){
        robotConstants.m_ArmRotator.setSelectedSensorPosition(0);
        robotConstants.m_DriveTalonLeft.setSelectedSensorPosition(0);
        robotConstants.m_DriveTalonRight.setSelectedSensorPosition(0);

        robotConstants.m_IntakeTalonMain.setSelectedSensorPosition(0);
    }
    
}
