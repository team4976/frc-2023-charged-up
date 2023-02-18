package frc.robot;

import java.util.HashMap;
import java.util.Map;

import com.ctre.phoenix.motorcontrol.can.TalonFX;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.button.Trigger;

public final class robotConstants {
  public static robotConstants instance = new robotConstants();
  public CommandXboxController _primaryController;
  public CommandXboxController _secondaryController;


    // DriveTrain

    public static final TalonSRX m_DriveTalonLeft = new TalonSRX(30);
    public static final TalonSRX m_DriveTalonRight = new TalonSRX(40);

    public static final VictorSPX m_DriveVictorRightFwd = new VictorSPX(42);
    public static final VictorSPX m_DriveVictorLeftFwd = new VictorSPX(31);

    public static final VictorSPX m_DriveVictorRightBack = new VictorSPX(41);
    public static final VictorSPX m_DriveVictorLeftBack = new VictorSPX(32);

    public static final Solenoid s_gearbox = new Solenoid(3, PneumaticsModuleType.CTREPCM, 2);

    // MainIntake

    public static final TalonFX m_IntakeFalcoBottomRoller = new TalonFX(43);

    public static final Solenoid s_MainIntake = new Solenoid(3, PneumaticsModuleType.CTREPCM, 0);

    // CubeIntake

    public static final TalonFX m_IntakeFalconTopRoller = new TalonFX(33);

    public static final Solenoid s_CubeIntake = new Solenoid(3, PneumaticsModuleType.CTREPCM, 1);

    // Arm

    public static final Solenoid s_FourBarArm = new Solenoid(3, PneumaticsModuleType.CTREPCM, 4);

    public static final Solenoid s_ArmPincer = new Solenoid(3, PneumaticsModuleType.CTREPCM, 3);

    public static final TalonSRX m_ArmRotator = new TalonSRX(50);

    //motor output
    public static final double forwardI = -0.3;//intake
    public static final double backwardI = 0.3;

    public static final double forwardS = 0.1;//scoring
    public static final double backwardS = -0.1;

    public static final double forwardH = 0.3;//handoff
    public static final double backwardH = -0.3; 

    public static final double stop = 0;

    //public booleans
    public static boolean peiceSelection = true;//differentiation between coneIn and cubeIn



    public Map<String,Trigger> buttonsMap = new HashMap<String,Trigger> ();
    

    public void init () {
      _primaryController = new CommandXboxController(0);
      _secondaryController = new CommandXboxController(1);

      /*
      buttonsMap.put("Intake", _primaryController.a());
      buttonsMap.put("Retract Intake", _primaryController.b());
      buttonsMap.put("Reverse Intake", _primaryController.y());
      buttonsMap.put("Score", _primaryController.x());



      buttonsMap.put("O-a", _secondaryController.a()); //O prefix is for operator's controller
      */
        
    }

  public void buttonBinding (String button, Command output) {
    buttonsMap.get(button).onTrue(output);
  }



}
