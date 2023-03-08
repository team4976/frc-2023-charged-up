// package frc.robot.subsystems;

// import edu.wpi.first.util.sendable.Sendable;
// import edu.wpi.first.wpilibj.AddressableLED;
// import edu.wpi.first.wpilibj.AddressableLEDBuffer;
// import edu.wpi.first.wpilibj2.command.SubsystemBase;
// import frc.robot.RobotContainer;

// import static edu.wpi.first.wpilibj.DriverStation.getAlliance;

// public class led extends SubsystemBase{

//     public AddressableLED addressableLED = new AddressableLED(0);//port 0
//     public AddressableLEDBuffer buffer = new AddressableLEDBuffer(24);

//     int lastHue = 0;
//     int lastSaturation = 0;
//     int lastValue = 0;

//     public boolean breathing = true;

//     public void StatusLight() {
//         addressableLED.setLength(buffer.getLength());
//         addressableLED.start();
//     }

//     public void setHSV(int hue, int saturation, int value) {
//        // System.out.println("h:" + hue + " s:" + saturation + " v:" + value);
//         //if (lastHue == hue && lastSaturation == saturation && lastValue == value) return;

// //        lastHue = hue;
// //        lastSaturation = saturation;
// //        lastValue = value;

//         for (int i = 0; i < buffer.getLength(); i++)
//             buffer.setHSV(
//                 i,
//                 hue / 2,
//                 saturation,
//                 value
//             );

//         addressableLED.setData(buffer);
//     }

//     public void runBreathing(int hue, int saturation) {
//         final int adjust = (int) (Math.sin(System.currentTimeMillis() / 1000f) * 20);


//         setHSV(
//             hue,
//             saturation,
//             20 + adjust
//         );
//     }

//     @Override
//     public void periodic() {


//         if (!breathing) return;
// //
// //        System.out.println("Hello?");

//         RobotContainer.statusLight.runBreathing(0, 0);
//     }
// }