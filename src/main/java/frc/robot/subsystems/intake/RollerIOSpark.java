package frc.robot.subsystems.intake;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;

public class RollerIOSpark implements RollerIO{

    private final SparkMax rollerSpark;

    public RollerIOSpark(int deviceId, MotorType type) {
        rollerSpark = new SparkMax(deviceId, type);
    }
    
    @Override
    public void setRollerVelocity(double velocityRadPerSec) {
        rollerSpark.set(velocityRadPerSec);
    }
}
