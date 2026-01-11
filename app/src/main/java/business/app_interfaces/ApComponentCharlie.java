package business.app_interfaces;

import ao.hx;
import bH.D;
import i.IComponentAlpha;
import i.IInterfaceFoxtrot;

public class ApComponentCharlie implements IComponentAlpha, IInterfaceFoxtrot {
  d IComponentAlpha = null;
  
  boolean b = false;
  
  public ApComponentCharlie() {
    i.c.IComponentAlpha().IComponentAlpha(this);
  }
  
  public boolean IComponentAlpha(String paramString1, String paramString2) {
    if (paramString1 != null && paramString1.equals("indexChanged")) {
      int i;
      String[] arrayOfString1 = paramString2.split("[|]");
      if (arrayOfString1.length != 2)
        return true; 
      String str = arrayOfString1[0];
      try {
        i = Integer.parseInt(arrayOfString1[1]);
      } catch (Exception exception) {
        D.IComponentAlpha("PIPE_ACTION_INDEX_CHANGED: Invalid index value: " + arrayOfString1[1]);
        return true;
      } 
      String[] arrayOfString2 = hx.IComponentAlpha().E();
      if (arrayOfString2 != null && arrayOfString2.length == 1) {
        if (arrayOfString2[0] != null && arrayOfString2[0].equals(str)) {
          if (!hx.IComponentAlpha().D() || (hx.IComponentAlpha().D() && Math.abs(hx.IComponentAlpha().p() - i) > 3)) {
            this.b = true;
            hx.IComponentAlpha().c(i);
            this.b = false;
          } 
        } else {
          return true;
        } 
      } else {
        return true;
      } 
      return true;
    } 
    return false;
  }
  
  public void IComponentAlpha(int paramInt) {
    String[] arrayOfString = hx.IComponentAlpha().E();
    if (!this.b && arrayOfString != null && arrayOfString.length == 1) {
      IComponentAlpha().IComponentAlpha(arrayOfString[0]);
      IComponentAlpha().IComponentAlpha(paramInt);
    } 
  }
  
  private d IComponentAlpha() {
    if (this.IComponentAlpha == null || !this.IComponentAlpha.isAlive()) {
      this.IComponentAlpha = new d(this);
      this.IComponentAlpha.start();
    } 
    return this.IComponentAlpha;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ap/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */