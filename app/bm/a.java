package bm;

import G.R;
import G.bo;
import G.bv;
import bH.D;
import bt.N;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class a implements N {
  public boolean a(bv parambv) {
    return parambv instanceof bo;
  }
  
  public JPanel a(R paramR, bv parambv) {
    try {
      return (JPanel)new bj.a(paramR, (bo)parambv);
    } catch (V.a a1) {
      D.a("Unable to show FTP File Browser.", (Exception)a1, this);
      JPanel jPanel = new JPanel();
      jPanel.add(new JLabel("Error"));
      return jPanel;
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bm/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */