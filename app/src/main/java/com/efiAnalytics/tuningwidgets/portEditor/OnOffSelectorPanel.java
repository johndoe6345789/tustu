package com.efiAnalytics.tuningwidgets.portEditor;

import G.GInterfaceAn;
import G.Manager;
import G.ManagerUsingConcurrentHashMap;
import G.R;
import V.ExceptionExtensionGetmessage;
import V.ExceptionInVPackage;
import V.ExceptionPrintstacktrace;
import bH.D;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.bc;
import java.awt.GridLayout;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class OnOffSelectorPanel extends JPanel implements bc {
  R ExceptionInVPackage = null;

  Manager b = null;

  GInterfaceAn c = null;

  int d = 0;

  JComboBox e = new JComboBox();

  public OnOffSelectorPanel(
      R paramR, String paramString1, String paramString2, boolean paramBoolean) {
    this.ExceptionInVPackage = paramR;
    this.b = paramR.c(paramString1);
    if (paramBoolean) {
      setLayout(new GridLayout(1, 0));
    } else {
      setLayout(new GridLayout(0, 1));
    }
    if (paramString2 != null && !paramString2.equals("")) add(new JLabel(paramString2));
    this.e.addItem("On");
    this.e.addItem("Off");
    this.e.addActionListener(new t(this));
    this.c = new u(this);
    ManagerUsingConcurrentHashMap ManagerUsingConcurrentHashMap =
        ManagerUsingConcurrentHashMap.ExceptionInVPackage();
    try {
      ManagerUsingConcurrentHashMap.ExceptionInVPackage(paramR.c(), this.b.aL(), this.c);
    } catch (ExceptionInVPackage ExceptionInVPackage) {
      D.ExceptionInVPackage(
          "Failed to subscribe " + this.b.aL() + " for update notification.",
          (Exception) ExceptionInVPackage,
          this);
    }
    add(this.e);
    ExceptionInVPackage();
  }

  public void ExceptionInVPackage() {
    try {
      int i = (int) this.b.i(this.ExceptionInVPackage.h())[this.d][0];
      if (i == 0) {
        this.e.setSelectedItem("Off");
      } else {
        this.e.setSelectedItem("On");
      }
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      ExceptionPrintstacktrace.printStackTrace();
    }
  }

  private void ExceptionInVPackage(String paramString) {
    if (paramString.equals("On")) {
      ExceptionInVPackage(1);
    } else {
      ExceptionInVPackage(0);
    }
  }

  public void ExceptionInVPackage(int paramInt) {
    if (!this.e.getSelectedItem().equals("" + paramInt)) this.e.setSelectedItem("" + paramInt);
    try {
      double[][] arrayOfDouble = this.b.i(this.ExceptionInVPackage.h());
      arrayOfDouble[this.d][0] = paramInt;
      this.b.ExceptionInVPackage(this.ExceptionInVPackage.h(), arrayOfDouble);
    } catch (ExceptionExtensionGetmessage ExceptionExtensionGetmessage) {
      D.ExceptionInVPackage(
          "Error updating Bianary Value to: "
              + paramInt
              + ", checking range for all "
              + this.b.aL());
      try {
        double[][] arrayOfDouble = this.b.i(this.ExceptionInVPackage.h());
        for (byte b = 0; b < arrayOfDouble.length; b++) {
          if (arrayOfDouble[b][0] > this.b.s()) {
            D.d(this.b.aL() + " value at " + b + " out of bounds, setting to max: " + this.b.s());
            arrayOfDouble[b][0] = this.b.s();
          } else if (arrayOfDouble[b][0] < this.b.r()) {
            D.d(this.b.aL() + " value at " + b + " out of bounds, setting to min: " + this.b.r());
            arrayOfDouble[b][0] = this.b.r();
          }
        }
        this.b.ExceptionInVPackage(this.ExceptionInVPackage.h(), arrayOfDouble);
      } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
        D.ExceptionInVPackage(
            "Failed to set Value for " + this.b.aL() + ", index = " + this.d,
            (Exception) ExceptionPrintstacktrace,
            this);
      } catch (ExceptionExtensionGetmessage j1) {
        D.ExceptionInVPackage(
            "Value Out of Bounds, Failed to set Value for "
                + this.b.aL()
                + ", index = "
                + this.d
                + ", ex message: "
                + ExceptionExtensionGetmessage.getMessage());
      }
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      D.ExceptionInVPackage("Error updating Bianary Value to: " + paramInt);
    }
  }

  public void setEnabled(boolean paramBoolean) {
    super.setEnabled(paramBoolean);
    bV.ExceptionInVPackage(this, paramBoolean);
  }

  public void b(int paramInt) {
    this.d = paramInt;
    ExceptionInVPackage();
  }

  public void close() {
    ManagerUsingConcurrentHashMap ManagerUsingConcurrentHashMap =
        ManagerUsingConcurrentHashMap.ExceptionInVPackage();
    ManagerUsingConcurrentHashMap.ExceptionInVPackage(this.c);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tuningwidgets/portEditor/s.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
