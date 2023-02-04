package frc.robot.dev.commands.Haris_setBotCommands;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.dev.subsystems.Haris_testBot.robotDrive;

public class setArcadeDrive extends CommandBase{
    
    private final DoubleSupplier _forward;
    private final DoubleSupplier _reverse;
    private final DoubleSupplier _rotation;

    private final robotDrive drive_test = new robotDrive();

    public setArcadeDrive(
        DoubleSupplier forward,
        DoubleSupplier reverse,
        DoubleSupplier rotation
    ){
        _forward = forward;
        _reverse = reverse;
        _rotation = rotation;

        addRequirements(drive_test);
    }

    @Override
    public void execute(){
        drive_test.setArcadeDrive(
            _forward.getAsDouble() - _reverse.getAsDouble(),
            _rotation.getAsDouble()
        );
    
    }
}
