package frc.robot.subsystems.intake;

import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.SparkMax;

public class RollerIOSpark implements RollerIO {

  private final SparkMax rollerSpark;

  public RollerIOSpark(int deviceId, MotorType type) {
    rollerSpark = new SparkMax(deviceId, type);
  }

  @Override
  public void setRollerVelocity(double velocityRadPerSec) {
    rollerSpark.set(velocityRadPerSec);
  }

  @Override
  public void setRollerPercent(double percent) {
    rollerSpark.set(percent);
  }

  @Override
  public void stopRoller() {
    rollerSpark.stopMotor();
  }
}
