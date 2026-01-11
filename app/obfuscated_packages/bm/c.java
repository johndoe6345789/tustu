package bm;

import G.R;
import G.bv;
import V.a;
import bH.D;
import bk.d;
import bt.N;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class c implements N {
  public boolean a(bv parambv) {
    return (parambv instanceof G.bD && parambv.aL().equals("std_ms3SdConsole"));
  }
  
  public JPanel a(R paramR, bv parambv) {
    try {
      return (JPanel)new d(paramR);
    } catch (a a) {
      D.a("Unable to show MS3 SD File Browser.", (Exception)a, this);
      JPanel jPanel = new JPanel();
      jPanel.add(new JLabel("Error"));
      return jPanel;
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bm/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */