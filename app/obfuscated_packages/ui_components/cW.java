package ao;

import ax.U;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JCheckBoxMenuItem;
import k.d;

class cW extends Thread {
  cW(cd paramcd, List paramList) {}
  
  public void run() {
    for (JCheckBoxMenuItem jCheckBoxMenuItem : this.a) {
      try {
        HashSet<String> hashSet = new HashSet();
        String str = jCheckBoxMenuItem.getActionCommand();
        for (String str1 : d.a().a(str).b())
          hashSet.add(str1); 
        jCheckBoxMenuItem.setToolTipText("Required fields :" + Arrays.toString(hashSet.toArray()).replace("Field.", ""));
      } catch (U u) {
        Logger.getLogger(cd.class.getName()).log(Level.SEVERE, (String)null, (Throwable)u);
      } 
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/cW.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */