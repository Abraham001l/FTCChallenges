<<<<<<< HEAD
// import java.lang.Math;

// public class DcMotor {

// public static enum Direction { FORWARD, REVERSE;

// }

// public static enum ZeroPowerBehavior {
// UNKNOWN,
// FLOAT,
// BRAKE;
// }

// private boolean polarization = true;
// private DcMotor.Direction direction = DcMotor.Direction.FORWARD;
// private double power = 0;
// private DcMotor.ZeroPowerBehavior brakeMode = DcMotor.ZeroPowerBehavior.

// public DcMotor(){
// polarization = (Math.random()>0.5);
// }

// public void setDirection(DcMotor.Direction setDirection) {
// direction = setDirection;
// }
// public DcMotor.Direction getDirection() {
// return direction;
// }

// public void setZeroPowerBehavior(DcMotor.ZeroPowerBehavior brakeState) {
// brakeOn = brakeState;
// }
// public DcMotor.ZeroPowerBehavior getZeroPowerBehavior() {
// return brakeOn;
// }

// public void setPower(double newPower) {
// power = newPower;
// }
// public double getPower() {
// return power;
// }
// }
=======
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
  private DcMotor.ZeroPowerBehavior brakeMode = DcMotor.ZeroPowerBehavior.FLOAT;

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
    brakeMode = brakeState;
  }
  public DcMotor.ZeroPowerBehavior getZeroPowerBehavior() {
    return brakeMode;
  }

  public void setPower(double newPower) {
    power = clamp(newPower, 0,1); 
  }
  public double getPower() {
    return power;
  }
  double clamp(double val, double min, double max){
    return Math.max(min,Math.min(max, val));
  }
}
>>>>>>> 164a68e51025685d0096f0697f4ff1e88a121a3c
