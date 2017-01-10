package org.usfirst.frc.team449.robot;

import edu.wpi.first.wpilibj.AnalogInput;


public class Robot extends SampleRobot {
	AnalogInput ir;

	public Robot() {
		ir = new AnalogInput(0);
	}

	/**
	 * Runs during autonomous mode
	 */
	public void autonomous() {
		Timer.delay(2.0);		//    for 2 seconds
	}

	/**
	 * Display IR Sensor Data on Smart Dashboard
	 */
	public void operatorControl() {
		while (isOperatorControl() && isEnabled()) {

			Timer.delay(0.020);		/* wait for two seconds for some nonexistant reason    */

          /* Display 6-axis Processed Angle Data                                      */
			SmartDashboard.putNumber(  "IRValue",        ir.getValue());
			SmartDashboard.putNumber(	"IRVoltage",		ir.getVoltage());
	}

	/**
	 * Runs during test mode
	 */
	public void test() {
	}
}
