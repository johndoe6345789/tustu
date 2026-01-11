package br;

import G.aI;
import G.i;
import V.g;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.fy;
import java.awt.Component;

class c implements fy {
  Component a = null;
  
  public c(a parama, Component paramComponent) {
    this.a = paramComponent;
  }
  
  public boolean a(String paramString) {
    if (paramString.equals(""))
      return true; 
    try {
      double d = i.a((aI)this.b.a, " " + paramString + " ");
    } catch (g g) {
      bV.d("Error:" + g.getMessage(), this.a);
      return false;
    } 
    return true;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/br/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */