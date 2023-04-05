package frc.robot.limelight.subsystems;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.robotConstants;
import frc.robot.robotcode.subsystems.robotDrive;

public class LimeLight extends SubsystemBase{
    //NEED CHANGE THE VALUE
    public static PIDController controller = new PIDController(0.1, 0.000, 0.0);
    public static PIDController controller2 = new PIDController(0.1, 0.002, 0.0);
                                                                //.05//0.01/0.0


static NetworkTable table = NetworkTableInstance.getDefault().getTable("limelight");

static NetworkTableEntry tv = table.getEntry("tv");
NetworkTableEntry ty = table.getEntry("ty");
static NetworkTableEntry tx = table.getEntry("tx");
//double limeLightArray[] = table.getEntry("botpose").getDoubleArray(new double[6]);
    
    
    // keys
// double x = tx.getDouble(0.0);  
// double y = ty.getDouble(0.0); 
// double v = tv.getDouble(0.0); 

    
    public static boolean isVaildTagret(){  
        return (tv.getDouble(0.0) > 0); 
    }


    // public void aimLowCone(robotDrive _robotDrive){
    //     table.getEntry("pipeline").setValue(0);
    //     if(isVaildTagret()){
    //        double x = tx.getDouble(0.0);
    //        double horizontalAdjust = controller.calculate(x,0);

    //        _robotDrive.setArcadeDrive(0, -horizontalAdjust);
           
    //     }
    //     else{
    //         System.out.println("ahhhhhhhhhhh");
    //     }
    // }
    // public void aimCone(robotDrive _robotDrive) {
    //     table.getEntry("pipeline").setValue(1);
    //     if(isVaildTagret()){
    //         double x = tx.getDouble(0.0);
    //         double horizontalAdjust = controller.calculate(x,0);
 
    //         _robotDrive.setArcadeDrive(0, -horizontalAdjust);
    //         System.out.println(table.getEntry("ts0").getDouble(0.0));
    //      }
    //      else{
    //          System.out.println("ahhhhhhhhhhh");
    //      }
    // }
    // public void aimCube(robotDrive _robotDrive) {
    //     table.getEntry("pipeline").setValue(3);
    //     if(isVaildTagret()){
    //         double x = tx.getDouble(0.0);
    //         double horizontalAdjust = controller2.calculate(x,0);
 
    //         _robotDrive.setArcadeDrive(0, -horizontalAdjust);
    //      }
    //      else{
    //          System.out.println("ahhhhhhhhhhh");
    //      }

    //     }


         public void aim(robotDrive _robotDrive){
           // table.getEntry("pipeline").setValue(0);
           // if(isVaildTagret()){
                
                if(robotConstants.peiceSelection){
                    table.getEntry("pipeline").setValue(3);
                    double x = tx.getDouble(0.0);
                    double horizontalAdjust = controller2.calculate(x,0);
         
                    _robotDrive.setArcadeDrive(0, -horizontalAdjust);
                    System.out.println("Cube");
                }
                else if(robotConstants.heightSelection){
                    table.getEntry("pipeline").setValue(1);
                    double x = tx.getDouble(0.0);
                    double horizontalAdjust = controller2.calculate(x,0);
         
                    _robotDrive.setArcadeDrive(0, -horizontalAdjust);
                    System.out.println("High Cone");
                }
                else if(robotConstants.heightSelection == false){
                    table.getEntry("pipeline").setValue(0);
                    double x = tx.getDouble(0.0);
                    double horizontalAdjust = controller2.calculate(x,0);
         
                    _robotDrive.setArcadeDrive(0, -horizontalAdjust);
                    System.out.println("Low cone");
                }
                
                
            // }
             else{
                 System.out.println("*\n*\n*\n*\n*\n");
                 System.out.println("**************************LIMELIGHT HAS FAILED PLS INFORM THE TEC*******************************");
                 System.out.println("*\n*\n*\n*\n*\n");
             }
    }

    public void limeLightON(){
        table.getEntry("ledMode").setValue(3);
    }
    public void limelightOFF(){
        table.getEntry("ledMode").setValue(1);
    }

    public static double angleOff(){
        return tx.getDouble(0.0);
    }

    public void swapLimeLight(int pipeline){
        table.getEntry("pipeline").setValue(pipeline);
    }
}