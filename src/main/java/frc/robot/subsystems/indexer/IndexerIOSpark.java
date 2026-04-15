package frc.robot.subsystems.indexer;

import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.SparkMax;
import frc.robot.generated.IndexerConstants;

public class IndexerIOSpark implements IndexerIO {

  private final SparkMax indexerSpark;

  public IndexerIOSpark(int deviceId, MotorType motorType) {
    indexerSpark = new SparkMax(deviceId, motorType);
  }

  @Override
  public void spindexer() {
    indexerSpark.set(IndexerConstants.kIndexerSpeed);
  }

  @Override
  public void stopdexer() {
    indexerSpark.stopMotor();
  }
}
