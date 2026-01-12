package business.binary_mappers;

import G.ArrayListExceptionprintstacktraceInGPackage;
import G.R;
import V.ExceptionInVPackage;
import bH.D;
import bk.ExceptionInVPackage;
import bt.N;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BmComponentBravo implements N {
  public boolean ExceptionInVPackage(ArrayListExceptionprintstacktraceInGPackage parambv) {
    return (parambv instanceof G.bD && parambv.aL().equals("std_ms3Rtc"));
  }

  public JPanel ExceptionInVPackage(R paramR, ArrayListExceptionprintstacktraceInGPackage parambv) {
    try {
      return (JPanel) new ExceptionInVPackage(paramR);
    } catch (ExceptionInVPackage ExceptionInVPackage) {
      D.ExceptionInVPackage(
          "Unable to show MS3 Real-Time Clock Interface.", (Exception) ExceptionInVPackage, this);
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
