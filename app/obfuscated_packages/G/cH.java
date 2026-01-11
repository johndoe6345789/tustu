package G;

import V.i;
import bH.D;

public class cH implements n {
  public void e() {}
  
  public void a(double paramDouble) {}
  
  public void a(o paramo) {
    R r = (R)paramo.b().v().E();
    if (paramo.a() == 1)
      for (String str : paramo.c().split("~")) {
        int i = str.indexOf("=");
        if (i >= 0) {
          String str1 = str.substring(0, i);
          String str2 = str.substring(i + 1);
          aM aM = r.c(str1);
          if (aM != null)
            try {
              cE.a(r, aM, str2);
            } catch (i i1) {
              D.a("Failed to set PcVariiable Value: " + str + ", Err:" + i1.getLocalizedMessage());
            }  
        } else {
          D.b("Invalid PcVariable line: " + str);
        } 
      }  
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/cH.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */