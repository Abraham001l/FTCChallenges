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

public class HardwareMap{
   public <T> T get(Class<? extends T> classOrInterface, String deviceName) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException{
     return classOrInterface.getConstructor().newInstance();
   }
}