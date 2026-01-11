package com.efiAnalytics.tuningwidgets.portEditor;

import G.R;
import G.aM;
import G.aN;
import G.aR;
import V.a;
import V.g;
import V.j;
import bH.D;
import com.efiAnalytics.ui.bc;
import javax.swing.JCheckBox;

class h extends JCheckBox implements aN, bc {
  R a = null;
  
  aM b = null;
  
  private int d = 0;
  
  public h(OutputPortEditor paramOutputPortEditor, R paramR, String paramString1, String paramString2) {
    super(paramString2);
    this.a = paramR;
    this.b = paramR.c(paramString1);
    aR aR = aR.a();
    try {
      aR.a(paramR.c(), paramString1, this);
    } catch (a a) {
      D.a("Failed to subscribe " + paramString1 + " for update notification.", (Exception)a, this);
    } 
    addItemListener(new i(this, paramOutputPortEditor));
  }
  
  public void a(String paramString1, String paramString2) {
    b();
    OutputPortEditor.a(this.c).repaint();
  }
  
  protected void a() {
    try {
      double[][] arrayOfDouble = this.b.i(this.a.h());
      arrayOfDouble[this.d][0] = isSelected() ? 1.0D : 0.0D;
      this.b.a(this.a.h(), arrayOfDouble);
    } catch (j j) {
      D.a("Value Out of Bounds, Attempting to fix value.");
      try {
        double[][] arrayOfDouble = this.b.i(this.a.h());
        for (byte b = 0; b < arrayOfDouble.length; b++) {
          if (arrayOfDouble[b][0] > this.b.s()) {
            D.d(this.b.aL() + " value at " + b + " out of bounds, setting to max: " + this.b.s());
            arrayOfDouble[b][0] = this.b.s();
          } else if (arrayOfDouble[b][0] < this.b.r()) {
            D.d(this.b.aL() + " value at " + b + " out of bounds, setting to min: " + this.b.r());
            arrayOfDouble[b][0] = this.b.r();
          } 
        } 
        this.b.a(this.a.h(), arrayOfDouble);
      } catch (g g) {
        D.a("Failed to set Value for " + this.b.aL() + ", index = " + this.d, (Exception)g, this);
      } catch (j j1) {
        D.a("Value Out of Bounds, Failed to set Value for " + this.b.aL() + ", index = " + this.d + ", ex message: " + j.getMessage());
      } 
    } catch (g g) {
      D.a("Failed to set Value for " + this.b.aL() + ", index = " + this.d, (Exception)g, this);
    } 
  }
  
  public void b() {
    try {
      double d = this.b.i(this.a.h())[this.d][0];
      setSelected((d != 0.0D));
    } catch (g g) {
      D.a("Failed to getValue for " + this.b.aL() + ", index = " + this.d, (Exception)g, this);
    } 
  }
  
  public void a(int paramInt) {
    this.d = paramInt;
  }
  
  public void close() {
    aR aR = aR.a();
    aR.a(this);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tuningwidgets/portEditor/h.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */