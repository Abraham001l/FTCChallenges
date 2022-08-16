import java.util.*;

public class Telemetry {
    Hashtable<String,Object> dat = new Hashtable<String,Object>();


    public void addData(String caption, Object val){
        dat.put(caption,val);
    }
    public void update(){
        for(Map.Entry m:dat.entrySet()){
            System.out.println(m.getKey()+", "+ m.getValue());
        }
        dat.clear();
    }
}

