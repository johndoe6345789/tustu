package br;

import G.R;
import G.cq;
import G.cu;
import V.a;
import bH.D;
import com.efiAnalytics.ui.cA;
import java.util.ArrayList;
import java.util.Iterator;

class H implements cq {
  ArrayList a = new ArrayList();
  
  H(s params, R paramR, String paramString) {
    try {
      cu.a().a(paramR.c(), paramString, this);
    } catch (a a) {
      D.a("Paint updates disabled for Component. " + a.getMessage());
      a.printStackTrace();
    } 
  }
  
  public void setCurrentOutputChannelValue(String paramString, double paramDouble) {
    Iterator<cA> iterator = this.a.iterator();
    while (iterator.hasNext())
      ((cA)iterator.next()).a(); 
  }
  
  public void a(cA paramcA) {
    this.a.add(paramcA);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/br/H.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */