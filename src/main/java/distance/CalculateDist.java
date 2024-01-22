package distance;

//CalculateDist.java
public class CalculateDist implements InterfaceCalculateDistance {
 @Override
 public double calculate(double x1, double y1, double x2, double y2) {
     // Implementation of distance calculation
     return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
 }
}
