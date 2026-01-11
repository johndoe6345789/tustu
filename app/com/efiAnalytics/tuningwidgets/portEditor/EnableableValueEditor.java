package com.efiAnalytics.tuningwidgets.portEditor;

import G.R;
import G.bq;
import bt.aV;
import com.efiAnalytics.ui.bV;
import java.awt.Container;

class EnableableValueEditor extends aV {
  bq a;
  
  public EnableableValueEditor(OutputPortEditor paramOutputPortEditor, R paramR, bq parambq) {
    super(paramR, parambq);
    this.a = parambq;
  }
  
  public void b(String paramString) {
    super.b(paramString);
  }
  
  public void setEnabled(boolean paramBoolean) {
    super.setEnabled(paramBoolean);
    bV.a((Container)this, paramBoolean);
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