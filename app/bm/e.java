package bm;

import G.R;
import G.bv;
import bH.D;
import bp.a;
import bt.N;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class e implements N {
  public boolean a(bv parambv) {
    return (parambv instanceof G.bD && parambv.aL().equals("std_trigwiz"));
  }
  
  public JPanel a(R paramR, bv parambv) {
    try {
      return (JPanel)new a(paramR);
    } catch (Exception exception) {
      D.a("Unable to show TriggerWizard.", exception, this);
      JPanel jPanel = new JPanel();
      jPanel.add(new JLabel("Error"));
      return jPanel;
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bm/e.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */