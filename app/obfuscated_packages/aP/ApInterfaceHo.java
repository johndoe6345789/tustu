package aP;

import G.GInterfaceAf;
import javax.swing.SwingUtilities;

class ApInterfaceHo implements GInterfaceAf {
  boolean a = false;
  
  long b = System.currentTimeMillis();
  
  int c = 750;
  
  ho(hg paramhg) {}
  
  public void a(String paramString, byte[] paramArrayOfbyte) {
    if (System.currentTimeMillis() - this.b > this.c) {
      SwingUtilities.invokeLater(this.d.m);
      this.b = System.currentTimeMillis();
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/ho.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */