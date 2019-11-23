 // Joysticks
package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.DigitalInput;

public class IO {
	Joystick firstInput = new Joystick(0);
    Joystick secondInput = new Joystick(1);
}
Double [] drivingJoysticks() {
	Double [] axisVar = new Double[2];
	axisVar[0] = firstInput.getRawAxis(1);
	axisVar[1] = firstInput.getRawAxis(3);
	axisVar = deadZone(axisVar);    
	return axisVar;
}

Double[] deadZone(Double[] in) {
	if (-.09 < in[0] && in[0] < .09) {
		in[0] = 0.0;
	}
	if (-.09 < in[1] && in[1] < .09) {
		in[1] = 0.0;
	}
	return in;
}