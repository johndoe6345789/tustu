package aP;

import G.aG;
import G.bT;
import bH.n;
import com.efiAnalytics.ui.aN;
import javax.swing.JOptionPane;
import r.a;
import r.i;

class iz implements aG {
  iz(iy paramiy) {}
  
  public boolean a(String paramString, bT parambT) {
    if (!parambT.c().equals(this.a.a)) {
      int i;
      String str1 = "Cannot connect to this ECU using your current Registration!\nYour current Registration is for working with BigStuff3 Serial #" + this.a.a + "\n\nYou can work offline or temporarily disable your registration to connect in Lite mode.\nNote: You can re-enable your registration under the menu:\nOptions --> Enable Registration\n\nIf you disable the Registration, the application must restart.";
      String str2 = i.a().b();
      if (n.b() && str2 != null && !str2.isEmpty()) {
        String[] arrayOfString = { "Work Offline", "Disabled Registration", "Upgrade Registration" };
        i = JOptionPane.showOptionDialog(dd.a().c(), str1, "Licensing Restriction", 1, 0, null, (Object[])arrayOfString, arrayOfString[0]);
      } else {
        String[] arrayOfString = { "Work Offline", "Disable Registration" };
        i = JOptionPane.showOptionDialog(dd.a().c(), str1, "Licensing Restriction", 0, 0, null, (Object[])arrayOfString, arrayOfString[0]);
      } 
      if (i == 1) {
        a.a().b(a.J, Boolean.toString(true));
        f.a().d(dd.a().c());
      } else if (i == 2) {
        aN.a(str2);
      } 
      return false;
    } 
    return true;
  }
  
  public void a(String paramString) {}
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/iz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */