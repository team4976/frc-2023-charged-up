package frc.robot.dev.subsystems.Haris_testBot;

import static frc.robot.robotConstants.*;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class robotDrive extends SubsystemBase{

    public robotDrive(){
        m_driveVictorLeftBack.follow(m_driveTalonLeft);
        m_driveVictorLeftFwd.follow(m_driveTalonLeft);
        m_driveVictorRightBack.follow(m_driveVictorRightFwd);
        m_driveVictorRightFwd.follow(m_driveVictorRightFwd);

        m_driveTalonRight.setInverted(true);
    }

    public void setArcadeDrive(double forward, double rotation){
        m_driveVictorLeftBack.follow(m_driveTalonLeft);
        m_driveVictorLeftFwd.follow(m_driveTalonLeft);
        m_driveVictorRightBack.follow(m_driveVictorRightFwd);
        m_driveVictorRightFwd.follow(m_driveVictorRightFwd);

        m_driveTalonRight.setInverted(true);
    }
    public void driveToPosition(double position){
        
    }

}
