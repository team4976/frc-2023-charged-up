package frc.robot;

import com.ctre.phoenix.motorcontrol.can.TalonFX;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.Solenoid;

public class robotconstants {
    
//drivetrain
 public static final TalonSRX m_drivelefttalon =new TalonSRX(30);
 public static final TalonSRX m_driverighttalon =new TalonSRX(40);

 public static final VictorSPX m_driverleftvictorrv =new VictorSPX(31);
 public static final VictorSPX m_driverleftvictorfw =new VictorSPX(32);

 public static final VictorSPX m_driverrighttvictorrv =new VictorSPX(41);
 public static final VictorSPX m_driverrightvictorfw =new VictorSPX(42);

public static final TalonFX m_driverleftfalcon =new TalonFX(43);
public static final Solenoid m_driversolenoid =new Solenoid(0, PneumaticsModuleType.CTREPCM,3); // get number from electrical

public static final Solenoid m_cubeintake =new Solenoid(0, PneumaticsModuleType.CTREPCM,6); // get number from electrical
public static final TalonFX m_driverCubeFalcon =new TalonFX(33);


public static final Solenoid m_ArmSolenoid4B =new Solenoid(0, PneumaticsModuleType.CTREPCM,2); // get number from electrical

public static final TalonSRX m_ArmTalon =new TalonSRX(30);

public static final Solenoid m_ArmSolenoidPincer =new Solenoid(0, PneumaticsModuleType.CTREPCM,4); // get number from electrical

public static final DigitalInput ArmHome =new DigitalInput(0



)






}
