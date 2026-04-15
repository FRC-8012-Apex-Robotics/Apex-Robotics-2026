package frc.robot.subsystems.intake;

public interface RollerIO {

  public default void setRollerVelocity(double velocityRadPerSec) {}

  public default void setRollerPercent(double percent) {}

  public default void stopRoller() {}
}
