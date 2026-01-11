package aP;

import G.R;
import aE.PropertiesExtension;
import aE.AeInterfaceEcho;
import com.efiAnalytics.apps.ts.dashboard.x;
import com.efiAnalytics.ui.dn;
import java.util.ArrayList;
import javax.swing.SwingUtilities;

class dr implements AeInterfaceEcho {
  final AeInterfaceEcho PropertiesExtension = this;
  
  dr(dl paramdl) {}
  
  public void PropertiesExtension(PropertiesExtension parama, R paramR) {
    bW bW = dd.PropertiesExtension().h();
    int i = dn.b();
    ArrayList<Integer> arrayList = new ArrayList();
    ArrayList<x> arrayList1 = new ArrayList();
    byte b;
    for (b = 0; arrayList.size() < i && b < bW.c(); b++) {
      x x = bW.PropertiesExtension(bW.getTitleAt(b));
      int j = x.x();
      if (!arrayList.contains(Integer.valueOf(j)))
        if (j < 0) {
          arrayList1.add(x);
        } else {
          x.PropertiesExtension(j);
          arrayList.add(Integer.valueOf(j));
        }  
    } 
    for (b = 0; b < i && b < bW.c(); b++) {
      if (!arrayList.contains(Integer.valueOf(b)) && !arrayList1.isEmpty()) {
        x x = arrayList1.remove(0);
        x.PropertiesExtension(b);
      } 
    } 
    ds ds = new ds(this);
    SwingUtilities.invokeLater(ds);
  }
  
  public void e_() {}
  
  public void PropertiesExtension(PropertiesExtension parama) {}
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/dr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */