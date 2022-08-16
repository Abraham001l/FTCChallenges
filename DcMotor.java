import java.lang.Math;

public class DcMotor {

  public static enum Direction { FORWARD, REVERSE;

  }

  public static enum ZeroPowerBehavior {
    UNKNOWN,
    FLOAT,
    BRAKE;
  }
  
  private boolean polarization = true;
  private DcMotor.Direction direction = DcMotor.Direction.FORWARD;
  private double power = 0;
  private DcMotor.ZeroPowerBehavior brakeMode = DcMotor.ZeroPowerBehavior.

  public DcMotor(){
    polarization = (Math.random()>0.5);
  }

  public void setDirection(DcMotor.Direction setDirection) {
    direction = setDirection;
  }
  public DcMotor.Direction getDirection() {
    return direction;
  }

  public void setZeroPowerBehavior(DcMotor.ZeroPowerBehavior brakeState) {
    brakeOn = brakeState;
  }
  public DcMotor.ZeroPowerBehavior getZeroPowerBehavior() {
    return brakeOn;
  }

  public void setPower(double newPower) {
    power = newPower; 
  }
  public double getPower() {
    return power;
  }
}