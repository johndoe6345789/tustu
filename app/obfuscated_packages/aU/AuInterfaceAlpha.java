package aU;

import G.R;
import G.aM;
import V.ExceptionPrintstacktrace;
import V.ExceptionExtensionGetmessage;
import javax.swing.SwingUtilities;

public class AuInterfaceAlpha implements d {
  public void a(R paramR, int paramInt1, int paramInt2) {
    String str1 = paramR.G().b();
    String str2 = paramR.G().c();
    aM aM1 = paramR.c(str1);
    aM aM2 = paramR.c(str2);
    if (!paramR.C().q());
    try {
      aM1.a(paramR.p(), paramInt1);
      aM2.a(paramR.p(), paramInt2);
      b b = new b(this, paramR);
      SwingUtilities.invokeLater(b);
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      ExceptionPrintstacktrace.printStackTrace();
      throw new V.a("Unable to set TPS Parameter:\n" + ExceptionPrintstacktrace.getMessage());
    } catch (ExceptionExtensionGetmessage ExceptionExtensionGetmessage) {
      ExceptionExtensionGetmessage.printStackTrace();
      throw new V.a("Unable to set TPS Parameter:\n" + ExceptionExtensionGetmessage.getMessage());
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aU/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */