package frc.robot.robotcode.subsystems;

import edu.wpi.first.util.sendable.Sendable;
import edu.wpi.first.wpilibj.AddressableLED;
import edu.wpi.first.wpilibj.AddressableLEDBuffer;
import edu.wpi.first.wpilibj.DriverStation.Alliance;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotContainer;
import frc.robot.robotConstants;

import static edu.wpi.first.wpilibj.DriverStation.getAlliance;

import java.util.Random;

public class StatusLight extends SubsystemBase implements Sendable  {

    public AddressableLED addressableLED = new AddressableLED(0);//port 0
    public AddressableLEDBuffer buffer = new AddressableLEDBuffer(24*2);

    int lastHue = 0;
    int lastSaturation = 0;
    int lastValue = 0;

    public boolean breathing = true;

    Random rand = new Random();

    public StatusLight() {
        addressableLED.setLength(buffer.getLength());
        addressableLED.start();
    }

    public void setRGB(int r, int g, int b) {
        //System.out.println("h:" + hue + " s:" + saturation + " v:" + value);
        //if (lastHue == hue && lastSaturation == saturation && lastValue == value) return;

//        lastHue = hue;
//        lastSaturation = saturation;
//        lastValue = value;

        for (int i = 0; i < buffer.getLength(); i++)
            buffer.setRGB(
                i,
                r,
                g,
                b
            );

        addressableLED.setData(buffer);
    }

    public void setTEAM() {
        //System.out.println("h:" + hue + " s:" + saturation + " v:" + value);
        //if (lastHue == hue && lastSaturation == saturation && lastValue == value) return;

//        lastHue = hue;
//        lastSaturation = saturation;
//        lastValue = value;

if(getAlliance() == Alliance.Blue){
        for (int i = 0; i < buffer.getLength(); i++)
            buffer.setRGB(
                i,
                0,
                0,
                255
                
            );
       addressableLED.setData(buffer);
        
    }
   else{
       for (int i = 0; i < buffer.getLength(); i++)
       buffer.setRGB(
           i,
           255,
           0,
           0
       );
   addressableLED.setData(buffer);
       
   }
   }

    public void runBreathing(int hue, int saturation) {
        final int adjust = (int) (Math.sin(System.currentTimeMillis() / 1000f) * 20);


        setRGB(
            hue,
            saturation,
            20 + adjust
        );
    }

//     @Override
//     public void periodic() {


//         if (!breathing) return;
// //
// //        System.out.println("Hello?");

//         RobotContainer._statusLight.runBreathing(0, 0);
//     }
}
