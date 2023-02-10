package frc.robot.constant;

import edu.wpi.first.wpilibj.Solenoid;
import com.ctre.phoenix.motorcontrol.can.TalonFX;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import edu.wpi.first.wpilibj.PneumaticsModuleType;

public final class RobotConstant_Tro {

    // Left side
    public static final TalonSRX m_TFL = new TalonSRX(30);
    public static final VictorSPX m_DVLF = new VictorSPX(31);
    public static final VictorSPX m_DVLB = new VictorSPX(32);

    // right side
    public static final TalonSRX m_TFR = new TalonSRX(40);
    public static final VictorSPX m_DVRF = new VictorSPX(41);
    public static final VictorSPX m_DVRB = new VictorSPX(42);

    // main intkae

    public static final TalonFX m_43 = new TalonFX(43);
    public static final Solenoid MainIntakePiston = new Solenoid(0, PneumaticsModuleType.CTREPCM, 0);

    // cube intake

    public static final TalonFX m_33 = new TalonFX(33);
    public static final Solenoid CubeIntakePiston = new Solenoid(1, PneumaticsModuleType.CTREPCM, 0);

    // arm
    public static final Solenoid four_bar = new Solenoid(4, PneumaticsModuleType.CTREPCM, 0);
    public static final TalonSRX m_775pro = new TalonSRX(50);
    public static final Solenoid pincer = new Solenoid(3, PneumaticsModuleType.CTREPCM, 0);

}
