package frc.robot.util;

public class Conversions {
  public static double degreesToRadians(double degrees) {
    return (degrees * Math.PI / 180);
  }

  public static double radiansToDegrees(double radians) {
    return (radians * 180 / Math.PI);
  }
}
