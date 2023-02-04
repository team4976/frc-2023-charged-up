package frc.robot;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.Solenoid;

import com.ctre.phoenix.motorcontrol.can.TalonFX;

public final class robotConstants {
    //Declaring Drive Train Motors
    public static final TalonSRX m_driveTalonLeft = new TalonSRX(30);
    public static final TalonSRX m_driveTalonRight = new TalonSRX(40);
    public static final VictorSPX m_driveVictorLeftFwd = new VictorSPX(31);
    public static final VictorSPX m_driveVictorRightFwd = new VictorSPX(41);
    public static final VictorSPX m_driveVictorLeftBack = new VictorSPX(32);
    public static final VictorSPX m_driveVictorRightBack = new VictorSPX(42);

    //Declaring Main Intake Motor/Solenoid
    public static final TalonFX m_IntakeFalconBottomRoller = new TalonFX(43);
    public static final Solenoid s_intakeSol = new Solenoid(0, PneumaticsModuleType.CTREPCM, 3);//ask electrical for channel

    //Declaring Cube Intake Motor
    public static final TalonFX m_IntakeFalconTopRoller = new TalonFX(33);
    public static final Solenoid s_cubeIntake = new Solenoid(0, PneumaticsModuleType.CTREPCM, 3);

    //Declaring Arm Motor/Solenoid
    public static final Solenoid s_armFourBar = new Solenoid(0, PneumaticsModuleType.CTREPCM, 4);//ask electrical for channel
    public static final Solenoid s_armPincer = new Solenoid(0, PneumaticsModuleType.CTREPCM, 4);//ask electrical for channel


}
