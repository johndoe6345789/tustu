package business.buffer_utilities.bU_components;

import G.GInterfaceCe;
import G.Manager;
import G.R;
import bN.BnInterfaceOscar;
import bN.BnInterfaceTango;
import bN.BnInterfaceUniform;
import bN.TostringInBnPackage;
import bS.BnInterfaceOscar;
import bS.ExceptionInBsPackage;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BuInterfaceGolf implements ExceptionInBsPackage {
  public static int a = 0;

  public static int b = 1;

  public int a() {
    return 160;
  }

  public void a(BnInterfaceOscar paramo, BnInterfaceTango paramt) {
    byte[] arrayOfByte = paramt.c();
    try {
      if (arrayOfByte.length < 1) {
        TostringInBnPackage TostringInBnPackage = BnInterfaceUniform.a().b();
        TostringInBnPackage.a(254);
        String str = "Missing Command code, message too short.";
        TostringInBnPackage.b(str.getBytes());
        paramo.a((BnInterfaceTango) TostringInBnPackage);
      }
      byte b = arrayOfByte[0];
      byte[] arrayOfByte1 = new byte[arrayOfByte.length - 1];
      System.arraycopy(arrayOfByte, 1, arrayOfByte1, 0, arrayOfByte1.length);
      if (b == a) {
        String str = new String(arrayOfByte1);
        R r = paramo.f();
        Manager Manager = r.c(str);
        if (Manager != null) {
          String str1 = GInterfaceCe.a(r, Manager);
          if (str1 != null) {
            str1 = Manager.aL() + "=" + str1;
            TostringInBnPackage TostringInBnPackage = BnInterfaceUniform.a().b();
            TostringInBnPackage.a(255);
            TostringInBnPackage.b(str1.getBytes());
            paramo.a((BnInterfaceTango) TostringInBnPackage);
          } else {
            TostringInBnPackage TostringInBnPackage = BnInterfaceUniform.a().b();
            TostringInBnPackage.a(254);
            String str2 = "Parameter does not exist in our configuration " + str;
            TostringInBnPackage.b(str2.getBytes());
            paramo.a((BnInterfaceTango) TostringInBnPackage);
          }
        } else {
          TostringInBnPackage TostringInBnPackage = BnInterfaceUniform.a().b();
          TostringInBnPackage.a(254);
          String str1 = "Parameter does not exist in our configuration " + str;
          TostringInBnPackage.b(str1.getBytes());
          paramo.a((BnInterfaceTango) TostringInBnPackage);
        }
      } else if (b == b) {
        R r = paramo.f();
        try {
          String str = GInterfaceCe.a(r);
          TostringInBnPackage TostringInBnPackage = BnInterfaceUniform.a().b();
          TostringInBnPackage.a(255);
          TostringInBnPackage.b(str.getBytes());
          paramo.a((BnInterfaceTango) TostringInBnPackage);
        } catch (Exception exception) {
          TostringInBnPackage TostringInBnPackage = BnInterfaceUniform.a().b();
          TostringInBnPackage.a(254);
          String str = "Failed to get all PcVariable values:  " + exception.getLocalizedMessage();
          TostringInBnPackage.b(str.getBytes());
          paramo.a((BnInterfaceTango) TostringInBnPackage);
        }
      } else {
        TostringInBnPackage TostringInBnPackage = BnInterfaceUniform.a().b();
        TostringInBnPackage.a(254);
        String str = "unknown sub command code ";
        TostringInBnPackage.b(str.getBytes());
        paramo.a((BnInterfaceTango) TostringInBnPackage);
      }
    } catch (BnInterfaceOscar o1) {
      Logger.getLogger(getClass().getName()).log(Level.SEVERE, (String) null, (Throwable) o1);
      throw new ExceptionInBsPackage(o1.getLocalizedMessage());
    }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bU/g.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
