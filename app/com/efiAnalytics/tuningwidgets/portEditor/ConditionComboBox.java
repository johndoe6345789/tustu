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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import s.g;

public class ConditionComboBox extends JComboBox implements bc {
  R a = null;
  
  aM b = null;
  
  aN c = null;
  
  String[] d = null;
  
  int e = 0;
  
  int f = 0;
  
  public ConditionComboBox(R paramR, String paramString, String[] paramArrayOfString) {
    this.a = paramR;
    this.b = paramR.c(paramString);
    for (byte b = 0; b < paramArrayOfString.length; b++)
      addItem((E)b(paramArrayOfString[b])); 
    addActionListener(new w(this));
    this.c = new x(this);
    aR aR = aR.a();
    try {
      aR.a(this.a.c(), this.b.aL(), this.c);
    } catch (a a) {
      D.a("Failed to subscribe " + this.b.aL() + " for update notification.", (Exception)a, this);
    } 
    b();
  }
  
  public boolean a() {
    y y = (y)getSelectedItem();
    return !(y.a().getBytes()[0] == 32);
  }
  
  private y b(String paramString) {
    y y = new y(this);
    y.a(paramString);
    if (paramString.equals(" ")) {
      y.b(g.b("No additional Condition"));
    } else if (paramString.equals("&")) {
      y.b(g.b("And"));
    } else if (paramString.equals("|")) {
      y.b(g.b("Or"));
    } else if (paramString.equals("t")) {
      y.b(g.b("Time True"));
    } else {
      y.b(paramString);
    } 
    return y;
  }
  
  public void a(int paramInt) {
    this.f = paramInt;
  }
  
  public void b(int paramInt) {
    this.e = paramInt;
    b();
  }
  
  private void c(String paramString) {
    a(paramString);
    try {
      double[][] arrayOfDouble = this.b.i(this.a.h());
      if ((arrayOfDouble[0]).length == 1) {
        arrayOfDouble[this.e][0] = paramString.charAt(0);
      } else {
        arrayOfDouble[this.f][this.e] = paramString.charAt(0);
      } 
      this.b.a(this.a.h(), arrayOfDouble);
    } catch (j j) {
      D.a("Value Out of Bounds?? validating all values for " + this.b.aL());
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
        D.a("Error updating: operator to " + paramString);
      } catch (j j1) {
        D.a("Value Out of Bounds?? vFailed to fix: " + this.b.aL());
        Logger.getLogger(v.class.getName()).log(Level.SEVERE, (String)null, (Throwable)j);
      } 
    } catch (g g) {
      D.a("Error updating: operator to " + paramString);
    } 
  }
  
  public void a(String paramString) {
    for (byte b = 0; b < getItemCount(); b++) {
      y y = (y)getItemAt(b);
      if (paramString.equals(y.a())) {
        setSelectedItem(y);
        return;
      } 
    } 
  }
  
  public void b() {
    try {
      double[][] arrayOfDouble = this.b.i(this.a.h());
      byte b = a(arrayOfDouble, this.f, this.e);
      for (byte b1 = 0; b1 < getItemCount(); b1++) {
        if (((y)getItemAt(b1)).a().getBytes()[0] == b) {
          setSelectedItem(getItemAt(b1));
          break;
        } 
      } 
    } catch (g g) {
      g.printStackTrace();
    } 
  }
  
  private byte a(double[][] paramArrayOfdouble, int paramInt1, int paramInt2) {
    return ((paramArrayOfdouble[0]).length == 1) ? (byte)(int)paramArrayOfdouble[paramInt2][0] : (byte)(int)paramArrayOfdouble[paramInt1][paramInt2];
  }
  
  public void close() {
    aR aR = aR.a();
    aR.a(this.c);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tuningwidgets/portEditor/v.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */