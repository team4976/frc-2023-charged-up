package frc.robot.robotcode.commands.jacob_command;
import java.util.function.DoubleSupplier;
import edu.wpi.first.wpilibj2.command.CommandBase;
public class setarcarde_Jacob extends CommandBase{
    private final DoubleSupplier _foward;
    private final DoubleSupplier _reverse;
    private final DoubleSupplier _rotation;

    public setarcarde_Jacob(
    DoubleSupplier rotation,
    DoubleSupplier forward,
    DoubleSupplier reverse
    ){
        _rotation = rotation;
        _reverse = reverse;
        _foward = forward;

        addRequirements(drive_test);
    }

    @Override
public void execute() {
    drive_test.setArcadeDrive(
    _foward.getAsDouble() - _reverse.getAsDouble(),
    _rotation.getAsDouble()

    );
}
}
