package business.binary_mappers;

import G.ArrayListExceptionprintstacktraceInGPackage;
import G.R;
import bH.D;
import bp.UIInBpPackage;
import bt.N;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BmComponentEcho implements N {
  public boolean UIInBpPackage(ArrayListExceptionprintstacktraceInGPackage parambv) {
    return (parambv instanceof G.bD && parambv.aL().equals("std_trigwiz"));
  }

  public JPanel UIInBpPackage(R paramR, ArrayListExceptionprintstacktraceInGPackage parambv) {
    try {
      return (JPanel) new UIInBpPackage(paramR);
    } catch (Exception exception) {
      D.UIInBpPackage("Unable to show TriggerWizard.", exception, this);
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
