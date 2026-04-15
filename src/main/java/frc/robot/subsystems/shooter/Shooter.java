package frc.robot.subsystems.shooter;

import frc.robot.generated.ShooterConstants;

public class Shooter {

  private final ShooterIO shooterIO;

  public Shooter(ShooterIO shooterIO) {
    this.shooterIO = shooterIO;
  }

  public void shoot() {
    shooterIO.spinAtPercent(ShooterConstants.kSpinPercent);
  }

  public void stop() {
    shooterIO.stopShooter();
  }
}
