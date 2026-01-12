package com.efiAnalytics.tuningwidgets.portEditor;

import G.GComponentBq;
import G.R;
import bt.ExceptionUsingComponent;
import com.efiAnalytics.ui.bV;
import java.awt.Container;

class EnableableValueEditor extends ExceptionUsingComponent {
  GComponentBq a;

  public EnableableValueEditor(
      OutputPortEditor paramOutputPortEditor, R paramR, GComponentBq parambq) {
    super(paramR, parambq);
    this.a = parambq;
  }

  public void b(String paramString) {
    super.b(paramString);
  }

  public void setEnabled(boolean paramBoolean) {
    super.setEnabled(paramBoolean);
    bV.a((Container) this, paramBoolean);
  }

  public void c(int paramInt) {
    h();
    this.a.a(paramInt);
    f();
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tuningwidgets/portEditor/g.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
