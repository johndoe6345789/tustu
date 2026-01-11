package com.efiAnalytics.ui;

import bH.I;
import bH.X;
import javax.swing.BorderFactory;
import javax.swing.JTextField;
import javax.swing.text.AbstractDocument;

public class do extends JTextField {
  double c = Double.NaN;
  
  private int a = -1;
  
  private boolean b = false;
  
  dp d = null;
  
  public do() {
    this("");
  }
  
  public do(String paramString) {
    this(paramString, 5);
  }
  
  public do(String paramString, int paramInt) {
    super(paramString, paramInt);
    a();
    setBorder(BorderFactory.createBevelBorder(1));
  }
  
  private void a() {
    this.d = new dp(this);
    ((AbstractDocument)getDocument()).setDocumentFilter(this.d);
  }
  
  public void a(double paramDouble) {
    if (f()) {
      setText(Integer.toHexString((int)paramDouble));
    } else if (this.a >= 0) {
      setText(X.b(paramDouble, this.a));
    } else {
      setText(X.a(paramDouble));
    } 
  }
  
  public void d() {
    this.c = Double.NaN;
  }
  
  public double e() {
    if (Double.isNaN(this.c))
      try {
        if (f()) {
          this.c = Integer.parseInt(getText(), 16);
        } else {
          this.c = Double.parseDouble(getText());
        } 
      } catch (NumberFormatException numberFormatException) {
        return Double.NaN;
      }  
    return this.c;
  }
  
  public void setText(String paramString) {
    paramString = X.i(paramString);
    if (f()) {
      if (paramString.startsWith("0x"))
        paramString = paramString.substring(2); 
      if (this.a > 0)
        paramString = X.a(paramString, '0', this.a); 
      paramString = "0x" + paramString;
    } else if (this.a >= 0 && I.a(paramString)) {
      paramString = X.a(paramString, this.a);
    } 
    super.setText(paramString);
  }
  
  public void a(String paramString) {
    this.d.a(false);
    super.setText(paramString);
    this.d.a(true);
  }
  
  public void b(int paramInt) {
    double d = e();
    this.a = paramInt;
    a(d);
  }
  
  public boolean f() {
    return this.b;
  }
  
  public void a(boolean paramBoolean) {
    this.b = paramBoolean;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/do.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */