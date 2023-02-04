package frc.robot.subsystem.robotcode.dev.colten_subsystem;
import static frc.robot.robotConstants_Colten.*;


import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class robotDrive extends SubsystemBase{

    public robotDrive(){
        
        m_DriveLeftFolowerOne.follow(m_DriveLeftTalon);
        m_DriveLeftFolowerTwo.follow(m_DriveLeftTalon);

        m_DriveRightFolowerOne.follow(m_DriveRightTalon);
        m_DriveRightFollowerTwo.follow(m_DriveRightTalon);

        m_DriveRightTalon.setInverted(true);
        
    }

    public void setArcadeDrive(double forward, double rotation){
        
        m_DriveLeftTalon.set(ControlMode.PercentOutput, forward - rotation);
        m_DriveRightTalon.set(ControlMode.PercentOutput, forward + rotation);
    }

}