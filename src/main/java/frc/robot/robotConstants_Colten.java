package frc.robot;

import com.ctre.phoenix.motorcontrol.can.TalonFX;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.Solenoid;

public class robotConstants_Colten {

    //Speeds
    public static final double forwardI = 1;
    public static final double backwardI = -1;
 
    //Drive Train Motor
    public static final TalonSRX m_DriveLeftTalon = new TalonSRX(30);
    public static final VictorSPX m_DriveLeftFolowerOne = new VictorSPX(31);
    public static final VictorSPX m_DriveLeftFolowerTwo = new VictorSPX(32);

    public static final TalonSRX m_DriveRightTalon = new TalonSRX(40);
    public static final VictorSPX m_DriveRightFolowerOne = new VictorSPX(41);
    public static final VictorSPX m_DriveRightFollowerTwo = new VictorSPX(42);

    //Intake
    public static final TalonFX m_IntakeRightFalcon = new TalonFX(33); // controls top and middle
    public static final TalonFX m_IntakeLeftFalcon = new TalonFX(43); // controls bottom

    public static final Solenoid S_IntakeRight = new Solenoid(0,PneumaticsModuleType.CTREPCM,0);
    public static final Solenoid S_IntakeLeft = new Solenoid(1,PneumaticsModuleType.CTREPCM,0);

    //Arm
    public static final TalonSRX m_armTalon = new TalonSRX(50);
    public static final Solenoid S_ArmFourBar = new Solenoid(60,PneumaticsModuleType.CTREPCM,4);
    public static final Solenoid S_ArmPincer = new Solenoid(3,PneumaticsModuleType.CTREPCM,0);
    DigitalInput DI_armSensor = new DigitalInput(0);
    

}
