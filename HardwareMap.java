import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.InvocationTargetException;

public class HardwareMap {

  public <T> T get(Class<? extends T> classOrInterface, String deviceName) {
    T Object = null;
    try {
      return classOrInterface.getConstructor().newInstance();
    } catch (NoSuchMethodException e) {
      System.out.println(e);
      return Object;
    } catch (InvocationTargetException e) {
      System.out.println(e);
      return Object;
    } catch (InstantiationException e) {
      System.out.println(e);
      return Object;
    } catch (IllegalAccessException e) {
      System.out.println(e);
      return Object;
    }
  }
}