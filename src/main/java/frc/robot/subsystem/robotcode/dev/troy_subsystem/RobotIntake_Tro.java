package frc.robot.subsystem.robotcode.dev.troy_subsystem;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.constant.RobotConstant_Tro;
public class RobotIntake_Tro extends SubsystemBase {



    public void RobotRetraction(boolean isIntakeExtended) {

        RobotConstant_Tro.MainIntakePiston.set(false);
        RobotConstant_Tro.CubeIntakePiston.set(false);

    }

    public void INTAKE_CONE(boolean isConeExtended) {

        RobotConstant_Tro.MainIntakePiston.set(isConeExtended);
        RobotConstant_Tro.m_43.follow( RobotConstant_Tro.m_33);
        RobotConstant_Tro. m_43.setInverted(true);
    }

    public void INTAKE_CUBE(boolean isCubeExtended) {

        RobotConstant_Tro.MainIntakePiston.set(isCubeExtended);
        RobotConstant_Tro.CubeIntakePiston.set(isCubeExtended);
        RobotConstant_Tro.m_43.follow( RobotConstant_Tro.m_33);
        RobotConstant_Tro.m_43.setInverted(true);
        
        //.set(isCubeExtended);  this is the toggle function?
    }

   

    //private void set(boolean isCubeExtended) {} this is the toggle function?
    
}
