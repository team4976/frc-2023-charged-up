package frc.robot.constant;

import com.ctre.phoenix.motorcontrol.can.TalonFX;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.Solenoid;

public class robotConstants_Colten {

    //Intake speeds
    public static final double forwardI = 1;
    public static final double backwardI = -1;
    
    //Scoring speeds
    public static final double forwardS = 1;
    public static final double backwardS = -1;

    //Handoff speeds
    public static final double forwardH = 1;
    public static final double backwardH = -1;

    public static final double stop = 0;
    
    //Drive Train Motor
    public static final TalonSRX m_DriveLeftTalon = new TalonSRX(30);
    public static final VictorSPX m_DriveLeftFolowerOne = new VictorSPX(31);
    public static final VictorSPX m_DriveLeftFolowerTwo = new VictorSPX(32);

    public static final TalonSRX m_DriveRightTalon = new TalonSRX(40);
    public static final VictorSPX m_DriveRightFolowerOne = new VictorSPX(41);
    public static final VictorSPX m_DriveRightFollowerTwo = new VictorSPX(42);

    //Intake
    public static final TalonFX m_IntakeTopFalcon = new TalonFX(33); //controls top roller
    public static final TalonFX m_IntakeBottomFalcon = new TalonFX(43); //controls bottom roller

    public static final Solenoid S_IntakeMain = new Solenoid(0,PneumaticsModuleType.CTREPCM,0);
    public static final Solenoid S_IntakeCube = new Solenoid(1,PneumaticsModuleType.CTREPCM,0);

    //Arm
    public static final TalonSRX m_armTalon = new TalonSRX(50);
    public static final Solenoid S_ArmFourBar = new Solenoid(60,PneumaticsModuleType.CTREPCM,4);
    public static final Solenoid S_ArmPincer = new Solenoid(3,PneumaticsModuleType.CTREPCM,0);
    DigitalInput DI_armSensor = new DigitalInput(0);
    

}
