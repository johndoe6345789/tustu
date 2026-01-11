package G;

import java.util.ArrayList;

public class cY {
  public static ArrayList a(String paramString, ArrayList<String> paramArrayList) {
    if (paramString.equals("std_injection")) {
      paramArrayList.add("reqFuel");
      paramArrayList.add("alternate");
      paramArrayList.add("nCylinders");
      paramArrayList.add("nInjectors");
      paramArrayList.add("divider");
    } else if (paramString.equals("std_constants")) {
      paramArrayList.add("reqFuel0");
      paramArrayList.add("alternate0");
      paramArrayList.add("nCylinders0");
      paramArrayList.add("nInjectors0");
      paramArrayList.add("divider0");
      paramArrayList.add("injOpen0");
      paramArrayList.add("battFac0");
    } else if (paramString.equals("std_accel")) {
    
    } 
    return paramArrayList;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/cY.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */