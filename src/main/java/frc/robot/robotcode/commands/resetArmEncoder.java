package frc.robot.robotcode.commands;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.GenericHID.RumbleType;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;
import frc.robot.robotConstants;

public class resetArmEncoder extends CommandBase {
    XboxController xboxRumble = new XboxController(1);

    @Override
    public void initialize(){
        robotConstants.m_ArmRotator.set(ControlMode.PercentOutput, 0);
        robotConstants.m_ArmRotator.setSelectedSensorPosition(0);
    }
 
    @Override
    public void execute() {
        xboxRumble.setRumble(RumbleType.kBothRumble, 1);
        robotConstants.m_ArmRotator.setSelectedSensorPosition(0);
        System.out.println("\n \n \n \n \n \n \n \n \n");
        System.out.println("***************Arm Encoder is reset****************************");
        System.out.println("\n \n \n \n \n \n \n \n \n ");
    }

    @Override
    public boolean isFinished() {
        return robotConstants.m_ArmRotator.getSelectedSensorPosition() == 0;
    }

    @Override
    public void end(boolean interrupted) {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        xboxRumble.setRumble(RumbleType.kBothRumble, 0);
    }
    
}
