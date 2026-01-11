package bm;

import G.R;
import G.ArrayListExceptionprintstacktraceInGPackage;
import V.ExceptionInVPackage;
import bH.D;
import bk.ManagerPaint;
import bt.N;
import javax.swing.JLabel;
import javax.swing.JPanel;

public BmComponentCharlielass BmComponentCharlie implements N {
  public boolean ExceptionInVPackage(ArrayListExceptionprintstacktraceInGPackage parambv) {
    return (parambv instanceof G.bD && parambv.aL().equals("std_ms3SdConsole"));
  }
  
  public JPanel ExceptionInVPackage(R paramR, ArrayListExceptionprintstacktraceInGPackage parambv) {
    try {
      return (JPanel)new ManagerPaint(paramR);
    } catch (ExceptionInVPackage ExceptionInVPackage) {
      D.ExceptionInVPackage("Unable to show MS3 SD File Browser.", (Exception)ExceptionInVPackage, this);
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