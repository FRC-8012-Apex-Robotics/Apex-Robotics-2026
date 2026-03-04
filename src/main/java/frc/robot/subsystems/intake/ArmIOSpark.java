package frc.robot.subsystems.intake;

import com.revrobotics.spark.SparkMax;

import edu.wpi.first.math.geometry.Rotation2d;

public class ArmIOSpark implements ArmIO {
    
    private final SparkMax armSpark;

    @Override
    public void setArmPosition(Rotation2d rotation) {
        armSpark.setVoltage(0);
    }
}
