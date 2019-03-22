/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import frc.robot.TriggerButton;
import frc.robot.commands.*;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {

  private int driverPort = 0;
  private int coDriverPort = 1;
  private int buttonBoxPort = 2;
  //Joysticks
  public Joystick driver = new Joystick(this.driverPort);
  public Joystick coDriver = new Joystick(this.coDriverPort);
  public Joystick buttonBox = new Joystick(this.buttonBoxPort);

  //All buttons
  Button aButton = new JoystickButton(driver, 1);
  Button bButton = new JoystickButton(driver, 2);
  Button xButton = new JoystickButton(driver, 3);
  Button yButton = new JoystickButton(driver, 4);
  Button leftBumper = new JoystickButton(driver, 5);
  Button rightBumper = new JoystickButton(driver, 6);
  Button select = new JoystickButton(driver, 7);
  Button start = new JoystickButton(driver, 8);
  Button leftStick = new JoystickButton(driver, 9);
  Button rightStick = new JoystickButton(driver, 10);
  TriggerButton leftTrigger = new TriggerButton(driver, 2);
  TriggerButton rightTrigger = new TriggerButton(driver, 3);

  Button triggerBoi = new JoystickButton(coDriver, 1);
  Button sideButton = new JoystickButton(coDriver, 2);
  Button bottomLeft = new JoystickButton(coDriver, 3);
  Button bottomRight = new JoystickButton(coDriver, 4);
  Button topLeft = new JoystickButton(coDriver, 5);
  Button topRight = new JoystickButton(coDriver, 6);
  Button frontLeft = new JoystickButton(coDriver, 7);
  Button frontRight = new JoystickButton(coDriver, 8);
  Button midLeft = new JoystickButton(coDriver, 9);
  Button midRight = new JoystickButton(coDriver, 10);
  Button backLeft = new JoystickButton(coDriver, 11);
  Button backRight = new JoystickButton(coDriver, 12);

  public OI() {
    
  }

  public double desensitize(double val) {
    double result = val;
    if (Math.abs(result) < 0.15) {
			result = 0.0;
		}
		return result;
  }

  public Double getMove() {
    return desensitize(driver.getRawAxis(1));
  }

  public Double getTurn() {
    return desensitize(-driver.getRawAxis(4));
  }

  public double getTurretControl() {
    return desensitize(coDriver.getRawAxis(2));
  }
}