import java.util.*;

public class ElapsedTime {
  private long start;
  private final long SECOND_IN_NANO = 1000000000;

  public ElapsedTime(){
    start = System.nanoTime();
  }
  public void reset(){
    start = System.nanoTime();
  }


  public String toString() {
    return String.valueOf((System.nanoTime()-start)/SECOND_IN_NANO) + " seconds";
  }
}