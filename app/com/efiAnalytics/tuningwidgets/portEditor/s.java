package com.efiAnalytics.tuningwidgets.portEditor;

import G.R;
import G.aM;
import G.aN;
import G.aR;
import V.a;
import V.g;
import V.j;
import bH.D;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.bc;
import java.awt.GridLayout;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class s extends JPanel implements bc {
  R a = null;
  
  aM b = null;
  
  aN c = null;
  
  int d = 0;
  
  JComboBox e = new JComboBox();
  
  public s(R paramR, String paramString1, String paramString2, boolean paramBoolean) {
    this.a = paramR;
    this.b = paramR.c(paramString1);
    if (paramBoolean) {
      setLayout(new GridLayout(1, 0));
    } else {
      setLayout(new GridLayout(0, 1));
    } 
    if (paramString2 != null && !paramString2.equals(""))
      add(new JLabel(paramString2)); 
    this.e.addItem("On");
    this.e.addItem("Off");
    this.e.addActionListener(new t(this));
    this.c = new u(this);
    aR aR = aR.a();
    try {
      aR.a(paramR.c(), this.b.aL(), this.c);
    } catch (a a) {
      D.a("Failed to subscribe " + this.b.aL() + " for update notification.", (Exception)a, this);
    } 
    add(this.e);
    a();
  }
  
  public void a() {
    try {
      int i = (int)this.b.i(this.a.h())[this.d][0];
      if (i == 0) {
        this.e.setSelectedItem("Off");
      } else {
        this.e.setSelectedItem("On");
      } 
    } catch (g g) {
      g.printStackTrace();
    } 
  }
  
  private void a(String paramString) {
    if (paramString.equals("On")) {
      a(1);
    } else {
      a(0);
    } 
  }
  
  public void a(int paramInt) {
    if (!this.e.getSelectedItem().equals("" + paramInt))
      this.e.setSelectedItem("" + paramInt); 
    try {
      double[][] arrayOfDouble = this.b.i(this.a.h());
      arrayOfDouble[this.d][0] = paramInt;
      this.b.a(this.a.h(), arrayOfDouble);
    } catch (j j) {
      D.a("Error updating Bianary Value to: " + paramInt + ", checking range for all " + this.b.aL());
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
      D.a("Error updating Bianary Value to: " + paramInt);
    } 
  }
  
  public void setEnabled(boolean paramBoolean) {
    super.setEnabled(paramBoolean);
    bV.a(this, paramBoolean);
  }
  
  public void b(int paramInt) {
    this.d = paramInt;
    a();
  }
  
  public void close() {
    aR aR = aR.a();
    aR.a(this.c);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tuningwidgets/portEditor/s.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */