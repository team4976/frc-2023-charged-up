package frc.robot.robotcode.commands;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.robotConstants;

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
    if(Math.abs(robotConstants.m_ArmRotator.getSelectedSensorPosition() - robotConstants.positionHigh)<100){
        _robotDrive.setArcadeDrive(
            _forward.getAsDouble() - _reverse.getAsDouble(), 
            _rotation.getAsDouble()*robotConstants.rotationSpeed // rotation speed
            );
    }
    else if(Math.abs(_rotation.getAsDouble()) >.05){
    _robotDrive.setArcadeDrive(
        _forward.getAsDouble() - _reverse.getAsDouble(), 
        _rotation.getAsDouble() // rotation speed
    );
    }
    // System.out.println(_forward.getAsDouble());
    else{
        _robotDrive.setArcadeDrive(
            _forward.getAsDouble() - _reverse.getAsDouble(),
              0);

    }
}
}
