package frc.robot.subsystems.intake;

import edu.wpi.first.math.geometry.Rotation2d;

public interface ArmIO {

  public default void setArmPosition(Rotation2d rotation) {}
}
