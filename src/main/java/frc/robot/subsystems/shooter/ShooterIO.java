package frc.robot.subsystems.shooter;

public interface ShooterIO {

  public default void spinAtVelocity(double velocityRadPerSec) {}

  public default void spinAtPercent(double percent) {}

  public default void stopShooter() {}
}
