package y;

import G.GInterfaceBu;
import G.R;
import V.ExceptionPrintstacktrace;
import ae.AeInterfaceMike;
import ae.AeInterfaceOscar;
import bH.D;
import bH.n;
import bI.BiInterfaceIndia;
import bI.IOInBiPackage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Properties;
import r.IOInBiPackage;

public class IOInYPackage implements GInterfaceBu {
  R IOInBiPackage;

  public IOInYPackage(R paramR) {
    this.IOInBiPackage = paramR;
  }

  public void IOInBiPackage() {}

  public void IOInBiPackage(boolean paramBoolean) {
    if (paramBoolean
        && this.IOInBiPackage.c("inpshare_test1") != null
        && this.IOInBiPackage.c("inpshare_test2") != null)
      try {
        int BiInterfaceIndia =
            (int) this.IOInBiPackage.c("inpshare_test2").j(this.IOInBiPackage.h());
        int j = (int) this.IOInBiPackage.c("inpshare_test1").j(this.IOInBiPackage.h());
        d d = new d();
        d.IOInBiPackage(BiInterfaceIndia);
        d.b(j);
        d.c(this.IOInBiPackage.BiInterfaceIndia());
        AeInterfaceMike AeInterfaceMike = AeInterfaceOscar.IOInBiPackage(BiInterfaceIndia);
        if (AeInterfaceMike != null) d.b(AeInterfaceMike.IOInBiPackage());
        IOInBiPackage.IOInBiPackage().b(IOInBiPackage.r, d.IOInBiPackage());
        e e = new e(this);
        e.start();
      } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
        D.IOInBiPackage((Exception) ExceptionPrintstacktrace);
      }
  }

  public static void b() {
    String str1 = IOInBiPackage.IOInBiPackage().c(IOInBiPackage.s, "");
    String str2 = IOInBiPackage.IOInBiPackage().c(IOInBiPackage.r, "");
    if (str2 != null && !str2.equals("") && !str2.equals(str1) && n.IOInBiPackage())
      try {
        d d = d.IOInBiPackage(str2);
        String str3 = "https://www.efianalytics.com/register/HwLog?payload=" + IOInBiPackage(d);
        String str4 = n.IOInBiPackage(str3);
        IOInBiPackage.IOInBiPackage().b(IOInBiPackage.s, d.IOInBiPackage());
      } catch (IOException iOException) {
        D.IOInBiPackage(iOException);
      }
  }

  public static String IOInBiPackage(d paramd) {
    Properties properties = new Properties();
    properties.setProperty("iId", IOInBiPackage.IOInBiPackage().c(IOInBiPackage.aN, ""));
    properties.setProperty("mId", paramd.b() + "");
    properties.setProperty("s", paramd.c() + "");
    properties.setProperty("hw", paramd.d());
    properties.setProperty("sig", paramd.e());
    properties.setProperty("rk", IOInBiPackage.IOInBiPackage().c(IOInBiPackage.cF, ""));
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    properties.store(byteArrayOutputStream, "");
    byte[] arrayOfByte = BiInterfaceIndia.IOInBiPackage(byteArrayOutputStream.toByteArray());
    return IOInBiPackage.IOInBiPackage(arrayOfByte, 16);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/y/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
