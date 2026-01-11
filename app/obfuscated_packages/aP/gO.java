package aP;

import bA.e;
import bq.a;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JMenuItem;
import r.n;
import s.g;

class gO extends a {
  gO(dB paramdB) {
    super(g.b("Recent Vehicle Projects"));
  }
  
  public void setPopupMenuVisible(boolean paramBoolean) {
    if (paramBoolean) {
      j();
    } else {
      removeAll();
    } 
    super.setPopupMenuVisible(paramBoolean);
  }
  
  private void j() {
    ArrayList arrayList = (new n()).a();
    if (arrayList.size() > 0)
      for (String str1 : arrayList) {
        String str2 = str1.substring(str1.lastIndexOf(File.separator) + 1);
        e e = new e();
        e.setText(str2);
        e.setActionCommand(str1);
        e.addActionListener(new gP(this));
        add((JMenuItem)e);
      }  
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/gO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */