package H;

import G.ArrayListInGPackage;
import G.R;
import G.SerializableExtension;
import G.SerializableImpl;
import G.T;
import V.ExceptionPrintstacktrace;
import bH.D;

public class HInterfaceBravo implements SerializableExtension {
  public boolean a(String paramString, byte[] paramArrayOfbyte) {
    R r = T.a().c(paramString);
    SerializableImpl SerializableImpl = r.ExceptionPrintstacktrace("Vbatt");
    if (SerializableImpl != null)
      try {
        if (SerializableImpl.b(paramArrayOfbyte) < 4.0D) {
          ArrayListInGPackage.a().a("Key Turned off, disconnecting");
          return false;
        }
      } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
        D.a("Unable to get value for Vbatt OutputChannel.");
      }
    return true;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/H/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
