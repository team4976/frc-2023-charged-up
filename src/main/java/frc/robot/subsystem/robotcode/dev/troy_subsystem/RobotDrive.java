package frc.robot.subsystem.robotcode.dev.troy_subsystem;
import com.ctre.phoenix.motorcontrol.ControlMode;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.constant.RobotConstant_Tro;
public class RobotDrive extends SubsystemBase{

    public RobotDrive(){
        
        RobotConstant_Tro.m_DVLF.follow(RobotConstant_Tro.m_TFL);
        RobotConstant_Tro.m_DVLB.follow(RobotConstant_Tro.m_TFL);

        RobotConstant_Tro.m_DVRF.follow(RobotConstant_Tro.m_TFR);
        RobotConstant_Tro.m_DVRB.follow(RobotConstant_Tro.m_TFR);

        RobotConstant_Tro.m_TFL.setInverted(true);
        
    }

    public void setArcadeDrive(double forward, double rotation){
        
        RobotConstant_Tro. m_TFL.set(ControlMode.PercentOutput, forward - rotation);
        RobotConstant_Tro.m_TFR.set(ControlMode.PercentOutput, forward + rotation);
    }

}
