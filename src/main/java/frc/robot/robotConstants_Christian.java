package frc.robot;

import com.ctre.phoenix.motorcontrol.can.TalonFX;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.Solenoid;

public class robotConstants_Christian {
    public static robotConstants_Christian _robotConstants = new robotConstants_Christian();
    
    //Drive Train Motors
    public static final TalonSRX m_DriveTalonLeft = new TalonSRX (30);
    public static final TalonSRX m_DriveTalonRight = new TalonSRX (40);
    //public static final Encoder

    public static final VictorSPX m_DriveVictorRightForward = new VictorSPX (41);
    public static final VictorSPX m_DriveVictorLeftForward = new VictorSPX (31);
    public static final VictorSPX m_DriveVictorRightBack = new VictorSPX (42);
    public static final VictorSPX m_DriveVictorLeftBack = new VictorSPX (42);

    //Main Intake
    public static final TalonFX m_MainIntakeFalcon = new TalonFX(43);
    public static final Solenoid s_MainIntakeSol = new Solenoid(0, PneumaticsModuleType.CTREPCM, 3);//Ask electrical for channel number

    //Cube Intake
    public static final TalonFX m_CubeIntakeFalcon = new TalonFX(33);
    public static final Solenoid s_CubeIntakeSol = new Solenoid(0, PneumaticsModuleType.CTREPCM, 4);//Ask electrical for channel number

    //Arm 
    public static final Solenoid s_ArmFourBar = new Solenoid(0, PneumaticsModuleType.CTREPCM, 5);//Ask electrical for channel number
    public static final Solenoid s_Pincer = new Solenoid(0, PneumaticsModuleType.CTREPCM, 5);//Ask electrical for channel number

    public static final TalonFX m_ArmTalon = new TalonFX(50);

    //Digital Input
    public static final DigitalInput ArmZero = new DigitalInput(0);





    void init(){

    }


}
