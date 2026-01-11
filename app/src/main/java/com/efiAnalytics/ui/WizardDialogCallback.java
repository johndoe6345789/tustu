package com.efiAnalytics.ui;

import java.awt.Container;
import javax.swing.JDialog;

class WizardDialogCallback implements fS {
  JDialog a = null;
  
  public WizardDialogCallback(fL paramfL, JDialog paramJDialog) {
    this.a = paramJDialog;
  }
  
  public boolean b() {
    this.a.dispose();
    this.b.g = true;
    return true;
  }
  
  public void c() {
    this.a.dispose();
    this.b.g = true;
  }
  
  public boolean a(Container paramContainer) {
    return true;
  }
  
  public boolean b(Container paramContainer) {
    return true;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/fP.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */