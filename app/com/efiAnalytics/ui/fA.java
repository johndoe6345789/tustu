package com.efiAnalytics.ui;

import java.awt.Color;
import java.util.ArrayList;

public class fA {
  ArrayList a = new ArrayList();
  
  private Color b = Color.WHITE;
  
  public Color a(double paramDouble) {
    Color color1 = a();
    Color color2 = null;
    double d = 0.5D;
    int i;
    for (i = 0; i < this.a.size(); i++) {
      if (paramDouble < fB.a(this.a.get(i))) {
        color2 = ((fB)this.a.get(i)).b();
        if (i > 0) {
          color1 = ((fB)this.a.get(i - 1)).b();
          d = (paramDouble - ((fB)this.a.get(i - 1)).a()) / (((fB)this.a.get(i)).a() - ((fB)this.a.get(i - 1)).a());
        } 
        break;
      } 
    } 
    if (color2 == null)
      return ((fB)this.a.get(this.a.size() - 1)).b(); 
    i = (int)(color2.getRed() * d + color1.getRed() * (1.0D - d));
    int j = (int)(color2.getGreen() * d + color1.getGreen() * (1.0D - d));
    int k = (int)(color2.getBlue() * d + color1.getBlue() * (1.0D - d));
    return new Color(i, j, k);
  }
  
  public void a(double paramDouble, Color paramColor) {
    fB fB = new fB(this);
    fB.a(paramDouble);
    fB.a(paramColor);
    if (this.a.size() > 0) {
      for (int i = this.a.size(); i > 0; i++) {
        if (paramDouble > fB.a(this.a.get(i - 1))) {
          this.a.add(i, fB);
          break;
        } 
      } 
    } else {
      this.a.add(fB);
    } 
  }
  
  public Color a() {
    return this.b;
  }
  
  public static fA a(Color paramColor) {
    fA fA1 = new fA();
    fA1.a(0.0D, paramColor);
    fA1.a(8.0D, Color.yellow);
    fA1.a(50.0D, Color.GREEN);
    fA1.a(200.0D, Color.GREEN.darker());
    return fA1;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/fA.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */