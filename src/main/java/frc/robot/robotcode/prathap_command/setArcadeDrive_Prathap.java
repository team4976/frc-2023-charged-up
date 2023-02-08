package frc.robot.robotcode.dev.prathap_command;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.robotcode.subsystems.prathap_subsystem.robotDrive;

public class setArcadeDrive_Prathap extends CommandBase {
    public final DoubleSupplier _forward;
    public final DoubleSupplier _reverse;
    public final DoubleSupplier _rotation;

    public final robotDrive drive_test = new robotDrive();

    public setArcadeDrive_Prathap(
            DoubleSupplier rotation,
            DoubleSupplier forward,
            DoubleSupplier reverse) {
        _rotation = rotation;
        _reverse = reverse;
        _forward = forward;

        addRequirements(drive_test);

    }

    @Override
    public void execute() {
        drive_test.setArcadeDrive(
                _forward.getAsDouble() - _reverse.getAsDouble(),
                _rotation.getAsDouble());
    }

}

