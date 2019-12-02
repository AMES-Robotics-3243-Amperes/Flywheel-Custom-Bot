// Motor stuff goes here
package frc.robot;
// SparkMAX revrobotics Libraries
import com.revrobotics.CANPIDController;
import com.revrobotics.CANSparkMax;
import com.revrobotics.ControlType;
import com.revrobotics.CANEncoder;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import edu.wpi.first.wpilibj.SpeedController;

// Phoenix Libraries
//import com.ctre.phoenix.ILoopable;
//import com.ctre.phoenix.motorcontrol.ControlMode;
//import com.ctre.phoenix.motorcontrol.FeedbackDevice;
//import com.ctre.phoenix.motorcontrol.can.*;

// 12/2/19 - Constructor is undefined. Having problems with object
public class MotorController {
    public static final int leadDeviceID = 1; // static: accesible outside of the obj / final: value cannot be overriden
    CANEncoder m_eEncoder; // Not a clue on what this means
    private CANPIDController leadPIDController; // Calling PID controller
    private CANSparkMax motor  = new CANSparkMax(leadDeviceID, MotorType.kBrushless); // motor object 
    public double maxRPM;

	
}
