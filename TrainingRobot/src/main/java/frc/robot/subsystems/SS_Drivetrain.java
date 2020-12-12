/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.TalonSRXControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class SS_Drivetrain extends SubsystemBase {

  private TalonSRX leftDrive, rightDrive;

  public SS_Drivetrain() {
    leftDrive = new TalonSRX(Constants.LEFT_DRIVE);
    rightDrive = new TalonSRX(Constants.RIGHT_DRIVE);
  }

  public void setPower(double left, double right) {
    leftDrive.set(TalonSRXControlMode.PercentOutput, left);
    rightDrive.set(TalonSRXControlMode.PercentOutput, right);
  }

  public void stop() {
    setPower(0, 0);
  }
}
