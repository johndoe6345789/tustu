package com.efiAnalytics.tuningwidgets.portEditor;

import G.GInterfaceAn;
import G.Manager;
import G.ManagerUsingConcurrentHashMap;
import G.R;
import V.ExceptionExtensionGetmessage;
import V.ExceptionInVPackage;
import V.ExceptionPrintstacktrace;
import bH.D;
import com.efiAnalytics.ui.bc;
import javax.swing.JCheckBox;

class PortConfigCheckBox extends JCheckBox implements GInterfaceAn, bc {
  R ExceptionInVPackage = null;

  Manager b = null;

  private int d = 0;

  public PortConfigCheckBox(
      OutputPortEditor paramOutputPortEditor, R paramR, String paramString1, String paramString2) {
    super(paramString2);
    this.ExceptionInVPackage = paramR;
    this.b = paramR.c(paramString1);
    ManagerUsingConcurrentHashMap ManagerUsingConcurrentHashMap =
        ManagerUsingConcurrentHashMap.ExceptionInVPackage();
    try {
      ManagerUsingConcurrentHashMap.ExceptionInVPackage(paramR.c(), paramString1, this);
    } catch (ExceptionInVPackage ExceptionInVPackage) {
      D.ExceptionInVPackage(
          "Failed to subscribe " + paramString1 + " for update notification.",
          (Exception) ExceptionInVPackage,
          this);
    }
    addItemListener(new i(this, paramOutputPortEditor));
  }

  public void ExceptionInVPackage(String paramString1, String paramString2) {
    b();
    OutputPortEditor.ExceptionInVPackage(this.c).repaint();
  }

  protected void ExceptionInVPackage() {
    try {
      double[][] arrayOfDouble = this.b.i(this.ExceptionInVPackage.h());
      arrayOfDouble[this.d][0] = isSelected() ? 1.0D : 0.0D;
      this.b.ExceptionInVPackage(this.ExceptionInVPackage.h(), arrayOfDouble);
    } catch (ExceptionExtensionGetmessage ExceptionExtensionGetmessage) {
      D.ExceptionInVPackage("Value Out of Bounds, Attempting to fix value.");
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
      D.ExceptionInVPackage(
          "Failed to set Value for " + this.b.aL() + ", index = " + this.d,
          (Exception) ExceptionPrintstacktrace,
          this);
    }
  }

  public void b() {
    try {
      double d = this.b.i(this.ExceptionInVPackage.h())[this.d][0];
      setSelected((d != 0.0D));
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      D.ExceptionInVPackage(
          "Failed to getValue for " + this.b.aL() + ", index = " + this.d,
          (Exception) ExceptionPrintstacktrace,
          this);
    }
  }

  public void ExceptionInVPackage(int paramInt) {
    this.d = paramInt;
  }

  public void close() {
    ManagerUsingConcurrentHashMap ManagerUsingConcurrentHashMap =
        ManagerUsingConcurrentHashMap.ExceptionInVPackage();
    ManagerUsingConcurrentHashMap.ExceptionInVPackage(this);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tuningwidgets/portEditor/h.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
