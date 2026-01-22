// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.XboxController;

public class Robot extends TimedRobot {

  // Name our motors
  TalonFX motorLeft = new TalonFX(1);
  TalonFX motorRight = new TalonFX(3);

  // Name our controller
  XboxController controller = new XboxController(0);

  @SuppressWarnings("removal")
  public Robot() {

    // Invert the Right Motor
    motorRight.setInverted(true);

    /*
     * motor.setInverted() is being removed, here's the new way of doing it
     * 
     * MotorOutputConfigs motorRightConfigs = new MotorOutputConfigs();
     * motorRightConfigs.Inverted = InvertedValue.CounterClockwise_Positive;
     * motorRight.getConfigurator().apply(motorRightConfigs);
     */
  }

  @Override
  public void robotPeriodic() {
    
    // Get the stick values from the controller
    double leftStickInput = controller.getLeftY();
    double rightStickInput = controller.getRightY();

    // If the left stick is moved at all...
    if (Math.abs(leftStickInput) > 0.1) {
      // Move the left motor by the amount that the stick is pushed by
      motorLeft.set(leftStickInput);
    } 

    // If the left stick is not moved at all...
    else {
      // Dont move the left motor
      motorLeft.set(0.0);
    }



    // If the right stick is not moved at all...
    if (Math.abs(rightStickInput) > 0.1) {
      // Move the right motor by the amount that the stick is pushed by
      motorRight.set(rightStickInput);
    } 

    // If the right stick is not moved at all...
    else {
      // Dont move the right motor
      motorRight.set(0.0);
    }
  }

  @Override
  public void autonomousInit() {
    
  }

  @Override
  public void autonomousPeriodic() {
    
  }

  @Override
  public void teleopInit() {}

  @Override
  public void teleopPeriodic() {}

  @Override
  public void disabledInit() {}

  @Override
  public void disabledPeriodic() {}

  @Override
  public void testInit() {}

  @Override
  public void testPeriodic() {}

  @Override
  public void simulationInit() {}

  @Override
  public void simulationPeriodic() {}
}
