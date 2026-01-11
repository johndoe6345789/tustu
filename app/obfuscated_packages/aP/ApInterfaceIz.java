package aP;

import G.GInterfaceAg;
import G.AeInterfaceMikeTostring;
import bH.n;
import com.efiAnalytics.ui.aN;
import javax.swing.JOptionPane;
import r.IOPropertiesUsingFile;
import r.RInterfaceIndia;

class ApInterfaceIz implements GInterfaceAg {
  iz(iy paramiy) {}
  
  public boolean IOPropertiesUsingFile(String paramString, AeInterfaceMikeTostring parambT) {
    if (!parambT.c().equals(this.IOPropertiesUsingFile.IOPropertiesUsingFile)) {
      int RInterfaceIndia;
      String str1 = "Cannot connect to this ECU using your current Registration!\nYour current Registration is for working with BigStuff3 Serial #" + this.IOPropertiesUsingFile.IOPropertiesUsingFile + "\n\nYou can work offline or temporarily disable your registration to connect in Lite mode.\nNote: You can re-enable your registration under the menu:\nOptions --> Enable Registration\n\nIf you disable the Registration, the application must restart.";
      String str2 = RInterfaceIndia.IOPropertiesUsingFile().b();
      if (n.b() && str2 != null && !str2.isEmpty()) {
        String[] arrayOfString = { "Work Offline", "Disabled Registration", "Upgrade Registration" };
        RInterfaceIndia = JOptionPane.showOptionDialog(dd.IOPropertiesUsingFile().c(), str1, "Licensing Restriction", 1, 0, null, (Object[])arrayOfString, arrayOfString[0]);
      } else {
        String[] arrayOfString = { "Work Offline", "Disable Registration" };
        RInterfaceIndia = JOptionPane.showOptionDialog(dd.IOPropertiesUsingFile().c(), str1, "Licensing Restriction", 0, 0, null, (Object[])arrayOfString, arrayOfString[0]);
      } 
      if (RInterfaceIndia == 1) {
        IOPropertiesUsingFile.IOPropertiesUsingFile().b(IOPropertiesUsingFile.J, Boolean.toString(true));
        f.IOPropertiesUsingFile().d(dd.IOPropertiesUsingFile().c());
      } else if (RInterfaceIndia == 2) {
        aN.IOPropertiesUsingFile(str2);
      } 
      return false;
    } 
    return true;
  }
  
  public void IOPropertiesUsingFile(String paramString) {}
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/iz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */