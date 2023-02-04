package frc.robot;
<<<<<<< HEAD

import com.ctre.phoenix.motorcontrol.can.TalonFX;
=======
>>>>>>> 6273f697c4de67ea29b12093fac08ce46cd34307
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.Solenoid;

<<<<<<< HEAD
public final class robotConstants {

    // DriveTrain

    public static final TalonSRX m_DriveTalonLeft = new TalonSRX(30);
    public static final TalonSRX m_DriveTalonRight = new TalonSRX(40);

    public static final VictorSPX m_DriveVictorRightForward = new VictorSPX(42);
    public static final VictorSPX m_DriveVictorLeftForward = new VictorSPX(31);
    public static final VictorSPX m_DriveVictorRightBack = new VictorSPX(41);
    public static final VictorSPX m_DriveVictorLeftBack = new VictorSPX(32);

    // MainIntake

    public static final TalonFX m_IntakeFalcoBottomRoller = new TalonFX(43);

    public static final Solenoid s_MainIntake = new Solenoid(0, PneumaticsModuleType.CTREPCM, 3);

    // CubeIntake

    public static final TalonFX m_IntakeFalconTopRoller = new TalonFX(33);

    public static final Solenoid s_CubeIntake = new Solenoid(1, PneumaticsModuleType.CTREPCM, 3);

    // Arm

    public static final Solenoid s_FourBarArm = new Solenoid(4, PneumaticsModuleType.CTREPCM, 3);

    public static final Solenoid s_ArmPincer = new Solenoid(3, PneumaticsModuleType.CTREPCM, 3);

    public static final TalonSRX m_ArmRotator = new TalonSRX(50);
=======
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

>>>>>>> 6273f697c4de67ea29b12093fac08ce46cd34307

}
