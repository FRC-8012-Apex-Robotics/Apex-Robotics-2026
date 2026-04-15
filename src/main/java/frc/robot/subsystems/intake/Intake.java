package frc.robot.subsystems.intake;

import edu.wpi.first.math.geometry.Rotation2d;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.generated.IntakeConstants;
import frc.robot.util.Conversions;

public class Intake extends SubsystemBase {

  private final ArmIO armIO;
  private final RollerIO rollerIO;
  private final double outAngle;
  private final double inAngle;

  public Intake(ArmIO armIO, RollerIO rollerIO) {
    this.armIO = armIO;
    this.rollerIO = rollerIO;
    outAngle = Conversions.degreesToRadians(IntakeConstants.kOutPosition);
    inAngle = Conversions.degreesToRadians(IntakeConstants.kInPosition);
  }

  public void extendArm() {
    armIO.setArmPosition(new Rotation2d(outAngle));
  }

  public void retractArm() {
    armIO.setArmPosition(new Rotation2d(inAngle));
  }

  public void spinRoller() {
    rollerIO.setRollerPercent(IntakeConstants.kRollerPercent);
  }

  public void spinRollerAtPercent(double percent) {
    rollerIO.setRollerPercent(percent);
  }

  public void spinArmAtPercent(double percent) {
    armIO.setArmPercent(percent);
  }

  public void stopRoller() {
    rollerIO.stopRoller();
  }
}
