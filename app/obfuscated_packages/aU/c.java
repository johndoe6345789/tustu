package aU;

import G.R;
import G.aM;
import V.a;
import V.g;
import V.j;
import W.E;
import java.io.File;
import r.j;

public class c implements d {
  public void a(R paramR, int paramInt1, int paramInt2) {
    String str1 = paramR.F() + File.separatorChar + j.h;
    E e = new E();
    e.a(str1, paramInt1, paramInt2);
    String str2 = paramR.G().b();
    String str3 = paramR.G().c();
    aM aM1 = paramR.c(str2);
    aM aM2 = paramR.c(str3);
    try {
      if (aM1 != null)
        aM1.a(paramR.p(), paramInt1); 
      if (aM2 != null)
        aM2.a(paramR.p(), paramInt2); 
    } catch (g g) {
      throw new a("Error setting throttle ADC values to controller, file saved fine.\n" + g.getMessage());
    } catch (j j) {
      throw new a("Error setting throttle ADC values to controller, file saved fine.\n" + j.getMessage());
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aU/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */