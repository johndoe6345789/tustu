package br;

import G.R;
import G.GComponentCq;
import G.ManagerUsingArrayList;
import V.ExceptionInVPackage;
import bH.D;
import com.efiAnalytics.ui.cA;
import java.util.ArrayList;
import java.util.Iterator;

class BrInterfaceHotel implements GComponentCq {
  ArrayList ExceptionInVPackage = new ArrayList();
  
  BrInterfaceHotel(s params, R paramR, String paramString) {
    try {
      ManagerUsingArrayList.ExceptionInVPackage().ExceptionInVPackage(paramR.c(), paramString, this);
    } catch (ExceptionInVPackage ExceptionInVPackage) {
      D.ExceptionInVPackage("Paint updates disabled for Component. " + ExceptionInVPackage.getMessage());
      ExceptionInVPackage.printStackTrace();
    } 
  }
  
  public void setCurrentOutputChannelValue(String paramString, double paramDouble) {
    Iterator<cA> iterator = this.ExceptionInVPackage.iterator();
    while (iterator.hasNext())
      ((cA)iterator.next()).ExceptionInVPackage(); 
  }
  
  public void ExceptionInVPackage(cA paramcA) {
    this.ExceptionInVPackage.add(paramcA);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/br/H.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */