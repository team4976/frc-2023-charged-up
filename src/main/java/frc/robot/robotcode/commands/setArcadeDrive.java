package frc.robot.robotcode.commands;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj2.command.CommandBase;
import static frc.robot.RobotContainer._robotDrive;

public class setArcadeDrive extends CommandBase {

    private final DoubleSupplier _forward;
    private final DoubleSupplier _reverse;
    private final DoubleSupplier _rotation;

    //private final robotDrive _robotDrive = new robotDrive();

    public setArcadeDrive(
        DoubleSupplier rotation,
        DoubleSupplier forward,
        DoubleSupplier reverse
    ){
        _rotation = rotation;
        _reverse = reverse;
        _forward = forward;
        

        addRequirements(_robotDrive);
    }

@Override
public void execute() {
    _robotDrive.setArcadeDrive(
        _forward.getAsDouble() - _reverse.getAsDouble(), 
        _rotation.getAsDouble()*.5 //AHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH
    );
}
}
