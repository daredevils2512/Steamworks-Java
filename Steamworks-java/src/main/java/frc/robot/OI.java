/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

import frc.robot.TriggerButton;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
  //// CREATING BUTTONS
  // One type of button is a joystick button which is any button on a
  //// joystick.
  // You create one by telling it which joystick it's on and which button
  // number it is.
  // Joystick stick = new Joystick(port);
  // Button button = new JoystickButton(stick, buttonNumber);

  // There are a few additional built in buttons you can use. Additionally,
  // by subclassing Button you can create custom triggers and bind those to
  // commands the same as any other Button.

  //// TRIGGERING COMMANDS WITH BUTTONS
  // Once you have a button, it's trivial to bind it to a button in one of
  // three ways:

  // Start the command when the button is pressed and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenPressed(new ExampleCommand());

  // Run the command while the button is being held down and interrupt it once
  // the button is released.
  // button.whileHeld(new ExampleCommand());

  // Start the command when the button is released and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenReleased(new ExampleCommand());

  private int driverPort = 0;
  private int coDriverPort = 1;
  private int buttonBoxPort = 2;
  //Joysticks
  public Joystick driver = new Joystick(this.driverPort);
  public Joystick extreme = new Joystick(this.coDriverPort);
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

  Button triggerBoi = new JoystickButton(extreme, 1);
  Button sideButton = new JoystickButton(extreme, 2);
  Button bottomLeft = new JoystickButton(extreme, 3);
  Button bottomRight = new JoystickButton(extreme, 4);
  Button topLeft = new JoystickButton(extreme, 5);
  Button topRight = new JoystickButton(extreme, 6);
  Button frontLeft = new JoystickButton(extreme, 7);
  Button frontRight = new JoystickButton(extreme, 8);
  Button midLeft = new JoystickButton(extreme, 9);
  Button midRight = new JoystickButton(extreme, 10);
  Button backLeft = new JoystickButton(extreme, 11);
  Button backRight = new JoystickButton(extreme, 12);

  Button topWhite = new JoystickButton(buttonBox, 2);
  Button bigWhite = new JoystickButton(buttonBox, 3);
  Button midRed = new JoystickButton(buttonBox, 4);
  Button bottomWhite = new JoystickButton(buttonBox, 5);
  Button topRed = new JoystickButton(buttonBox, 6);
  Button greenBoi = new JoystickButton(buttonBox, 7);
  Button midWhite = new JoystickButton(buttonBox, 8);
  Button bigRed = new JoystickButton(buttonBox, 14);
  Button yellowBoi = new JoystickButton(buttonBox, 15);
  Button bottomRed = new JoystickButton(buttonBox, 16); 

}
