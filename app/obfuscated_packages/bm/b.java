package bm;

import G.R;
import G.bv;
import V.a;
import bH.D;
import bk.a;
import bt.N;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class b implements N {
  public boolean a(bv parambv) {
    return (parambv instanceof G.bD && parambv.aL().equals("std_ms3Rtc"));
  }
  
  public JPanel a(R paramR, bv parambv) {
    try {
      return (JPanel)new a(paramR);
    } catch (a a) {
      D.a("Unable to show MS3 Real-Time Clock Interface.", (Exception)a, this);
      JPanel jPanel = new JPanel();
      jPanel.add(new JLabel("Error"));
      return jPanel;
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bm/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */