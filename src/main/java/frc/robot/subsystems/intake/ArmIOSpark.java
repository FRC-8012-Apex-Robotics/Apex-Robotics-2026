package frc.robot.subsystems.intake;

import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.SparkMax;
import edu.wpi.first.math.geometry.Rotation2d;

public class ArmIOSpark implements ArmIO {

  private final SparkMax armSpark;

  public ArmIOSpark(int deviceId, MotorType type) {
    armSpark = new SparkMax(deviceId, type);
  }

  @Override
  public void setArmPosition(Rotation2d rotation) {
    armSpark.setVoltage(0);
  }

  @Override
  public void setArmPercent(double percent) {
    armSpark.set(percent);
  }
}
