package frc.robot.subsystems.shooter;

import static frc.robot.util.PhoenixUtil.tryUntilOk;

import com.ctre.phoenix6.configs.TalonFXConfiguration;
import com.ctre.phoenix6.controls.Follower;
import com.ctre.phoenix6.controls.VelocityVoltage;
import com.ctre.phoenix6.hardware.TalonFX;
import com.ctre.phoenix6.signals.InvertedValue;
import com.ctre.phoenix6.signals.MotorAlignmentValue;
import com.ctre.phoenix6.signals.NeutralModeValue;

public class ShooterIOTalonFX implements ShooterIO{
    
    private final TalonFX leftTalon;
    private final TalonFX rightTalon;

    public ShooterIOTalonFX(int leftTalonId, int rightTalonId) {
        leftTalon = new TalonFX(leftTalonId);
        rightTalon = new TalonFX(rightTalonId);

        var leftTalonConfig = new TalonFXConfiguration();
        leftTalonConfig.MotorOutput.Inverted = InvertedValue.Clockwise_Positive;
        leftTalonConfig.MotorOutput.NeutralMode = NeutralModeValue.Coast;
        tryUntilOk(5, () -> leftTalon.getConfigurator().apply(leftTalonConfig, 0.25));

        var rightTalonConfig = new TalonFXConfiguration();
        rightTalonConfig.MotorOutput.Inverted = InvertedValue.CounterClockwise_Positive;
        rightTalonConfig.MotorOutput.NeutralMode = NeutralModeValue.Coast;
        tryUntilOk(5, () -> rightTalon.getConfigurator().apply(rightTalonConfig, 0.25));
        
        rightTalon.setControl(new Follower(leftTalonId, MotorAlignmentValue.Aligned));
    }

    @Override
    public void spinAtVelocity(double velocityRadPerSec) {
        leftTalon.setControl(new VelocityVoltage(velocityRadPerSec));
    }
}
