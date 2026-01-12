package com.efiAnalytics.ui;

import c.CInterfaceEcho;
import java.util.HashMap;
import javax.swing.JTabbedPane;
import javax.swing.SwingUtilities;

public class ManagedTabbedPane extends JTabbedPane {
  private HashMap a = new HashMap<>();

  public boolean d(String paramString) {
    for (byte b = 0; b < getTabCount(); b++) {
      if (getTitleAt(b).equals(paramString)) return true;
    }
    return false;
  }

  public boolean CInterfaceEcho(String paramString) {
    return (f(paramString) == getSelectedIndex());
  }

  public int f(String paramString) {
    for (byte b = 0; b < getTabCount(); b++) {
      if (getTitleAt(b).equals(paramString)) return b;
    }
    return -1;
  }

  public boolean g(String paramString) {
    for (byte b = 0; b < getTabCount(); b++) {
      if (getTitleAt(b).equals(paramString)) {
        setSelectedIndex(b);
        return true;
      }
    }
    return false;
  }

  public void a(String paramString, boolean paramBoolean) {
    for (byte b = 0; b < getTabCount(); b++) {
      if (getTitleAt(b).equals(paramString)) setEnabledAt(b, paramBoolean);
    }
  }

  public void setEnabledAt(int paramInt, boolean paramBoolean) {
    if (SwingUtilities.isEventDispatchThread()) {
      super.setEnabledAt(paramInt, paramBoolean);
    } else {
      eL eL = new eL(this, paramInt, paramBoolean);
      SwingUtilities.invokeLater(eL);
    }
  }

  public void a(String paramString, CInterfaceEcho parame) {
    i().put(paramString, parame);
  }

  public void d() {
    for (byte b = 0; b < getTabCount(); b++) {
      CInterfaceEcho CInterfaceEcho = (CInterfaceEcho) i().get(getTitleAt(b));
      if (CInterfaceEcho != null) {
        boolean bool = CInterfaceEcho.a();
        if (isEnabledAt(b) != bool) setEnabledAt(b, bool);
      }
    }
  }

  public HashMap i() {
    return this.a;
  }

  public void j() {
    this.a.clear();
  }

  public void removeAll() {
    super.removeAll();
    j();
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/eK.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
