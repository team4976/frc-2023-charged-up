package frc.robot.dev.subsystems.Haris_testBot;

import static frc.robot.robotConstants.*;

import com.ctre.phoenix.motorcontrol.ControlMode;
import edu.wpi.first.wpilibj2.command.SubsystemBase;


public class robotIntake extends SubsystemBase{

    public void spinIntake(double bottomRollerSpeed, double topRollerSpeed){//spins rollers
        m_IntakeFalconBottomRoller.set(ControlMode.PercentOutput, bottomRollerSpeed);
        m_IntakeFalconTopRoller.set(ControlMode.PercentOutput, topRollerSpeed);
    }
    public void extendMainIntake(boolean isMainExtended){//extends or retracts main intake rollers
        s_intakeSol.set(isMainExtended);
    }
    public void extendCubeIntake(boolean isCubeExtended){
        s_cubeIntake.set(isCubeExtended);
    }
}


