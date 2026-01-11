package ap;

import ao.hx;
import bH.D;
import i.a;
import i.f;

public class c implements a, f {
  d a = null;
  
  boolean b = false;
  
  public c() {
    i.c.a().a(this);
  }
  
  public boolean a(String paramString1, String paramString2) {
    if (paramString1 != null && paramString1.equals("indexChanged")) {
      int i;
      String[] arrayOfString1 = paramString2.split("[|]");
      if (arrayOfString1.length != 2)
        return true; 
      String str = arrayOfString1[0];
      try {
        i = Integer.parseInt(arrayOfString1[1]);
      } catch (Exception exception) {
        D.a("PIPE_ACTION_INDEX_CHANGED: Invalid index value: " + arrayOfString1[1]);
        return true;
      } 
      String[] arrayOfString2 = hx.a().E();
      if (arrayOfString2 != null && arrayOfString2.length == 1) {
        if (arrayOfString2[0] != null && arrayOfString2[0].equals(str)) {
          if (!hx.a().D() || (hx.a().D() && Math.abs(hx.a().p() - i) > 3)) {
            this.b = true;
            hx.a().c(i);
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
  
  public void a(int paramInt) {
    String[] arrayOfString = hx.a().E();
    if (!this.b && arrayOfString != null && arrayOfString.length == 1) {
      a().a(arrayOfString[0]);
      a().a(paramInt);
    } 
  }
  
  private d a() {
    if (this.a == null || !this.a.isAlive()) {
      this.a = new d(this);
      this.a.start();
    } 
    return this.a;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ap/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */