package ao;

import ax.ExceptionInAxPackage;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JCheckBoxMenuItem;
import k.KComponentDelta;

class cW extends Thread {
  cW(cd paramcd, List paramList) {}
  
  public void run() {
    for (JCheckBoxMenuItem jCheckBoxMenuItem : this.a) {
      try {
        HashSet<String> hashSet = new HashSet();
        String str = jCheckBoxMenuItem.getActionCommand();
        for (String str1 : KComponentDelta.a().a(str).b())
          hashSet.add(str1); 
        jCheckBoxMenuItem.setToolTipText("Required fields :" + Arrays.toString(hashSet.toArray()).replace("Field.", ""));
      } catch (ExceptionInAxPackage u) {
        Logger.getLogger(cd.class.getName()).log(Level.SEVERE, (String)null, (Throwable)u);
      } 
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/cW.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */