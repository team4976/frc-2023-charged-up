package frc.robot.command.robotcode.dev.colten_command;

import java.util.function.DoubleSupplier;


import edu.wpi.first.wpilibj2.command.CommandBase;

import static frc.robot.robot_container.RobotContainer_Colten._robotDrive;

public class setArcadeDrive_Colten extends CommandBase{
    
    private final DoubleSupplier _forward;
    private final DoubleSupplier _reverse;
    private final DoubleSupplier _rotation;

    public setArcadeDrive_Colten(
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
public void execute(){
    _robotDrive.setArcadeDrive(
        _forward.getAsDouble() - _reverse.getAsDouble(),
        _rotation.getAsDouble()
    );
}
}