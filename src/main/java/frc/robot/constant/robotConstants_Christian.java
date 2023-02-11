package frc.robot.constant;

import java.util.HashMap;
import java.util.Map;

import com.ctre.phoenix.motorcontrol.can.TalonFX;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj2.command.button.Trigger;

public final class robotConstants_Christian {
  public static robotConstants_Christian instance = new robotConstants_Christian();


    // DriveTrain

    public static final TalonSRX m_DriveTalonLeft = new TalonSRX(30);
    public static final TalonSRX m_DriveTalonRight = new TalonSRX(40);

    public static final VictorSPX m_DriveVictorRightFwd = new VictorSPX(42);
    public static final VictorSPX m_DriveVictorLeftFwd = new VictorSPX(31);
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

    public Map<String,Trigger> buttonsMap = new HashMap<String,Trigger> ();
    

    public void init () {
      
        
    }
}
