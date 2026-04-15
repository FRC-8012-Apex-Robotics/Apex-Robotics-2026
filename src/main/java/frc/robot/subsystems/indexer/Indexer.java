package frc.robot.subsystems.indexer;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Indexer extends SubsystemBase {

  private final IndexerIO indexerIO;

  public Indexer(IndexerIO indexerIO) {
    this.indexerIO = indexerIO;
  }

  public void spinIndexer() {
    indexerIO.spindexer();
  }

  public void stopIndexer() {
    indexerIO.stopdexer();
  }
}
