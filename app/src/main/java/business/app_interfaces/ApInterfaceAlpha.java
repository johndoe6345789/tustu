package business.app_interfaces;

import ao.bq;
import bH.D;
import i.IInterfaceFoxtrot;
import java.io.File;

public class ApInterfaceAlpha implements IInterfaceFoxtrot {
  public boolean a(String paramString1, String paramString2) {
    if (paramString1 != null && paramString1.equals("openLog")) {
      File file = new File(paramString2);
      if (file.exists()) {
        bq.a().b().b(file.getAbsolutePath(), false);
        bq.a().b().c();
      } else {
        D.a("Log File not found: " + file.getAbsolutePath());
      } 
      return true;
    } 
    return false;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ap/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */