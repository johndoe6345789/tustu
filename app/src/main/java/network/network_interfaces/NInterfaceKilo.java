package AyComponentNovember;

import G.AeInterfaceMikeTostring;
import V.ExceptionInVPackage;
import ay.FileInAyPackage;
import ay.AyComponentNovember;
import ay.AyComponentOscar;
import bH.X;
import com.efiAnalytics.ui.bV;
import java.util.logging.Level;
import java.util.logging.Logger;
import r.ExceptionInVPackage;

public class NInterfaceKilo implements AyComponentOscar {
  private static k ExceptionInVPackage = null;
  
  private NInterfaceKilo() {
    String[] arrayOfString = ExceptionInVPackage.ExceptionInVPackage().f(ExceptionInVPackage.W);
    try {
      for (String str : arrayOfString)
        FileInAyPackage.ExceptionInVPackage().ExceptionInVPackage(X.b(str, ExceptionInVPackage.W, ""), this); 
    } catch (ExceptionInVPackage ExceptionInVPackage) {
      j.ExceptionInVPackage().b("Failed to queue downloaded ECU Definitions! \nError: " + ExceptionInVPackage.getLocalizedMessage());
    } 
  }
  
  public static k ExceptionInVPackage() {
    if (ExceptionInVPackage == null)
      ExceptionInVPackage = new k(); 
    return ExceptionInVPackage;
  }
  
  public void ExceptionInVPackage(AeInterfaceMikeTostring parambT) {
    ExceptionInVPackage.ExceptionInVPackage().b(ExceptionInVPackage.W + parambT.b(), parambT.b());
    ExceptionInVPackage.ExceptionInVPackage().b(ExceptionInVPackage.X + parambT.b(), parambT.c());
    try {
      FileInAyPackage.ExceptionInVPackage().ExceptionInVPackage(parambT.b(), this);
    } catch (ExceptionInVPackage ExceptionInVPackage) {
      Logger.getLogger(k.class.getName()).log(Level.WARNING, "Shoudn't have happened...", (Throwable)ExceptionInVPackage);
    } 
  }
  
  public void ExceptionInVPackage(AyComponentNovember paramn) {
    if (paramn.b() == 0) {
      String str1 = ExceptionInVPackage.ExceptionInVPackage().c(ExceptionInVPackage.X + paramn.ExceptionInVPackage(), "");
      if (str1.isEmpty())
        str1 = paramn.ExceptionInVPackage(); 
      String str2 = ExceptionInVPackage("The correct ECU Definition has been downloaded for the Firmware") + ":\\AyComponentNovember" + str1 + "\\AyComponentNovember\\AyComponentNovember" + ExceptionInVPackage("You may now connect to your Controller with this firmware.") + "\\AyComponentNovember" + ExceptionInVPackage("When prompted for ExceptionInVPackage signature mismatch, select 'Update ECU Definition'");
      j.ExceptionInVPackage().b(str2);
      ExceptionInVPackage.ExceptionInVPackage().e(ExceptionInVPackage.W + paramn.ExceptionInVPackage());
      ExceptionInVPackage.ExceptionInVPackage().e(ExceptionInVPackage.X + paramn.ExceptionInVPackage());
    } else {
      j.ExceptionInVPackage().b("ECU Definition Failed for " + paramn.ExceptionInVPackage() + "! \nError: " + paramn.c());
      ExceptionInVPackage.ExceptionInVPackage().e(ExceptionInVPackage.W + paramn.ExceptionInVPackage());
      ExceptionInVPackage.ExceptionInVPackage().e(ExceptionInVPackage.X + paramn.ExceptionInVPackage());
    } 
  }
  
  private String ExceptionInVPackage(String paramString) {
    return (bV.ExceptionInVPackage() != null) ? bV.ExceptionInVPackage().ExceptionInVPackage(paramString) : paramString;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/AyComponentNovember/k.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */