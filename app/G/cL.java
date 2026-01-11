package G;

import java.util.HashMap;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

public class cL {
  private static cL b = null;
  
  HashMap a = new HashMap<>();
  
  public static cL a() {
    if (b == null)
      b = new cL(); 
    return b;
  }
  
  public void a(cM paramcM) {
    this.a.put(paramcM.c(), paramcM);
  }
  
  public cV a(String paramString) {
    cM cM = (cM)this.a.get(paramString);
    if (cM.b() != null) {
      try {
        return cM.b().newInstance();
      } catch (InstantiationException instantiationException) {
        Logger.getLogger(cL.class.getName()).log(Level.SEVERE, (String)null, instantiationException);
      } catch (IllegalAccessException illegalAccessException) {
        Logger.getLogger(cL.class.getName()).log(Level.SEVERE, (String)null, illegalAccessException);
      } 
      return null;
    } 
    return (cV)null;
  }
  
  public cR b(String paramString) {
    cM cM = (cM)this.a.get(paramString);
    if (cM.b() != null) {
      try {
        return cM.a().newInstance();
      } catch (InstantiationException instantiationException) {
        Logger.getLogger(cL.class.getName()).log(Level.SEVERE, (String)null, instantiationException);
      } catch (IllegalAccessException illegalAccessException) {
        Logger.getLogger(cL.class.getName()).log(Level.SEVERE, (String)null, illegalAccessException);
      } 
      return null;
    } 
    return (cR)null;
  }
  
  public Iterator b() {
    return this.a.values().iterator();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/cL.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */