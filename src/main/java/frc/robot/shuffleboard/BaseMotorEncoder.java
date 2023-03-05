package frc.robot.shuffleboard;

import com.ctre.phoenix.motorcontrol.can.BaseMotorController;
import com.ctre.phoenix.motorcontrol.can.TalonFX;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;
import edu.wpi.first.wpilibj.shuffleboard.ShuffleboardTab;

public class BaseMotorEncoder {

    String name;
    public BaseMotorController controller;
    // private boolean type;
    // ShuffleboardTab tab = shuffleBoard.instance.addTabs("Encoder");

    public BaseMotorEncoder(String name, VictorSPX victorSPX) {
        this.name = name;
        controller = victorSPX;
        initShuffle();
    }

    public BaseMotorEncoder(String name, TalonSRX talonSRX) {
        this.name = name;
        controller = talonSRX;
        initShuffle();
    }

    public BaseMotorEncoder(String name, TalonFX talonfx) {
        this.name = name;
        controller = talonfx;
        initShuffle();
    }

    public void initShuffle() {
        ShuffleboardTab tab = Shuffleboard.getTab("Encoder");

        if (name.contains("_Encoder")) {
            tab.addDouble(name + "_Distance", this::getDistance);
            tab.addDouble(name + "_Speed", this::getRate);
            tab.addDouble(name + "_Voltage", this::getVoltage);
        } else {
            tab.addDouble(name + "_Voltage", this::getVoltage);
        }

    }

    public double getVoltage() {
        // ((VictorSPX)controller).getSelectedSensorPosition();
        return controller.getBusVoltage();
    }

    public double getRate() {
        return controller.getSelectedSensorVelocity();
    }

    public double getDistance() {
        return controller.getSelectedSensorPosition();// test
    }

    // public double getCurrent(){
    //     return controller.getStatorCurrent();
    // }

}
