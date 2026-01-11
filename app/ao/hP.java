package ao;

import h.i;
import javax.swing.JOptionPane;

class hP implements he {
  hP(hE paramhE) {}
  
  public void a(String paramString1, String paramString2) {
    if (paramString2 != null && !paramString2.equals("")) {
      i.c(paramString1, paramString2);
    } else {
      i.d(paramString1);
    } 
    if (0 == JOptionPane.showConfirmDialog(this.a.k, "Must reload Tune Settings to take effect.\nReload now?", "Reload Tune Settings?", 0, 3)) {
      this.a.l();
      this.a.d();
    } 
  }
  
  public String a(String paramString) {
    return i.e(paramString, "");
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/hP.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */