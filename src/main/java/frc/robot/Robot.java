// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.XboxController;

public class Robot extends TimedRobot {

  // Name our motors
  TalonFX motorLeft = new TalonFX(0);
  TalonFX motorRight = new TalonFX(1);

  // Name our controller
  XboxController controller = new XboxController(0);

  public Robot() {
    
  }

  @Override
  public void robotPeriodic() {
    double leftStickInput = controller.getLeftY();
    double rightStickInput = -controller.getRightY();

    motorLeft.set(leftStickInput);
    motorRight.set(rightStickInput);
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
