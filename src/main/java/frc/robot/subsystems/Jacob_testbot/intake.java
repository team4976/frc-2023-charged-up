package frc.robot.subsystems.Jacob_testbot;
import static frc.robot.robotconstants.*;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class intake extends SubsystemBase {
    public final TalonSRX moterone = new TalonSRX (43);
    public final TalonSRX motertwo = new TalonSRX (46); 
    public final VictorSPX moterthree = new VictorSPX(53);
    public final Solenoid piston = new Solenoid(null, 0);


public void intakeCone () {
    m_driverleftfalcon.set(ControlMode.PercentOutput,0.8);
    m_driversolenoid.set(true);
}

public void intakeCube (Double temp, double temp2) {
    m_driverCubeFalcon.set(ControlMode.PercentOutput,temp);
    m_cubeintake.set(true);
}

public void extend () {
piston.set(true);
}

public void retract () {
piston.set(false);
}
}