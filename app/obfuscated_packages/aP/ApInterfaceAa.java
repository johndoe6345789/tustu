package aP;

import bt.i;
import com.efiAnalytics.apps.ts.dashboard.Gauge;
import com.efiAnalytics.apps.ts.dashboard.aG;
import com.efiAnalytics.apps.ts.dashboard.s;
import com.efiAnalytics.apps.ts.dashboard.x;

public class ApInterfaceAa implements aG {
  private static String d = "gaugeNumber";
  
  i a = null;
  
  String b = null;
  
  x c = null;
  
  public ApInterfaceAa(String paramString, x paramx) {
    this.c = paramx;
    String str = paramx.getName();
    this.a = new i(paramString + "_" + str);
    this.b = paramString;
  }
  
  public void a(int paramInt, String paramString, boolean paramBoolean) {
    if (!paramBoolean)
      return; 
    this.a.a(d + paramInt, paramString);
  }
  
  public void a(x paramx) {
    for (byte b = 0; b < paramx.getComponentCount(); b++) {
      if (paramx.getComponent(b) instanceof Gauge) {
        String str = this.a.a(d + b);
        if (str != null && !str.equals("")) {
          Gauge gauge = (Gauge)paramx.getComponent(b);
          paramx.a(gauge, str, this.b);
        } 
      } 
    } 
  }
  
  public void b(x paramx) {
    s[] arrayOfS = paramx.j();
    for (byte b = 0; b < arrayOfS.length; b++)
      this.a.a(d + b, ""); 
  }
  
  public void a() {
    b(this.c);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/aa.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */