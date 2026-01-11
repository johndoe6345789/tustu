package be;

import G.Q;
import G.R;
import G.aH;
import G.ac;
import G.ah;
import s.g;

public class r {
  public static String a = g.b("Output Channel");
  
  public static String b = g.b("Gauge Template");
  
  public static String c = g.b("Data Log Field");
  
  public static Q a(String paramString, R paramR) {
    return (Q)(paramString.equals(a) ? new aH(paramR.ac()) : (paramString.equals(b) ? new ah() : (paramString.equals(c) ? new ac() : null)));
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/be/r.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */