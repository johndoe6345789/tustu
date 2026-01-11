package aU;

import G.R;
import G.Manager;
import V.ExceptionInVPackage;
import V.ExceptionPrintstacktrace;
import V.ExceptionExtensionGetmessage;
import W.E;
import java.io.File;
import r.ExceptionExtensionGetmessage;

public class AuInterfaceCharlie implements d {
  public void ExceptionInVPackage(R paramR, int paramInt1, int paramInt2) {
    String str1 = paramR.F() + File.separatorChar + ExceptionExtensionGetmessage.h;
    E e = new E();
    e.ExceptionInVPackage(str1, paramInt1, paramInt2);
    String str2 = paramR.G().b();
    String str3 = paramR.G().c();
    Manager aM1 = paramR.c(str2);
    Manager aM2 = paramR.c(str3);
    try {
      if (aM1 != null)
        aM1.ExceptionInVPackage(paramR.p(), paramInt1); 
      if (aM2 != null)
        aM2.ExceptionInVPackage(paramR.p(), paramInt2); 
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      throw new ExceptionInVPackage("Error setting throttle ADC values to controller, file saved fine.\n" + ExceptionPrintstacktrace.getMessage());
    } catch (ExceptionExtensionGetmessage ExceptionExtensionGetmessage) {
      throw new ExceptionInVPackage("Error setting throttle ADC values to controller, file saved fine.\n" + ExceptionExtensionGetmessage.getMessage());
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aU/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */