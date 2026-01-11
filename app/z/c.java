package z;

import A.f;
import A.i;
import A.q;
import A.t;
import A.v;
import B.i;
import G.J;
import G.R;
import bH.D;
import bQ.j;
import bQ.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

public class c {
  public static String a = "MegaSquirtRs232CommManager";
  
  public static String b = "MegaSquirtRs232CommManagerAlternate";
  
  public static String c = "Agressive Reinitialize CommManager";
  
  public static String d = "K-Line Echo Filtering CommManager";
  
  public static String e = "Multi Interface MegaSquirt Driver";
  
  public static String f = l.a;
  
  private static c h = null;
  
  private ArrayList i = new ArrayList();
  
  HashMap g = new HashMap<>();
  
  public static c a() {
    if (h == null)
      h = new c(); 
    return h;
  }
  
  public J a(R paramR, String paramString1, i parami, i parami1, String paramString2) {
    if (paramString1 != null && paramString1.equals(e)) {
      t t1 = v.a().a(paramR);
      String str = v.a().b(paramR);
      if (t1.a() == null && str != null) {
        f f = null;
        try {
          f = parami.a(str, paramString2);
        } catch (InstantiationException instantiationException) {
          Logger.getLogger(c.class.getName()).log(Level.SEVERE, "Failed to instantiate ControllerInterface", instantiationException);
        } catch (IllegalAccessException illegalAccessException) {
          Logger.getLogger(c.class.getName()).log(Level.SEVERE, "Failed to instantiate ControllerInterface, IllegalAccess", illegalAccessException);
        } catch (UnsatisfiedLinkError unsatisfiedLinkError) {
          Logger.getLogger(c.class.getName()).log(Level.SEVERE, "Failed to instantiate ControllerInterface, UnsatisfiedLinkError", unsatisfiedLinkError);
        } catch (NoClassDefFoundError noClassDefFoundError) {
          Logger.getLogger(c.class.getName()).log(Level.SEVERE, "Failed to instantiate ControllerInterface, NoClassDefFoundError", noClassDefFoundError);
        } catch (Error error) {
          Logger.getLogger(c.class.getName()).log(Level.SEVERE, "Failed to instantiate ControllerInterface, Other", error);
        } 
        if (f == null) {
          q q1 = parami.b();
          try {
            f = parami.a(q1.a(), paramString2);
          } catch (InstantiationException instantiationException) {
            Logger.getLogger(c.class.getName()).log(Level.SEVERE, "Failed to instantiate ControllerInterface", instantiationException);
          } catch (IllegalAccessException illegalAccessException) {
            Logger.getLogger(c.class.getName()).log(Level.SEVERE, "Failed to instantiate ControllerInterface, IllegalAccess", illegalAccessException);
          } catch (UnsatisfiedLinkError unsatisfiedLinkError) {
            Logger.getLogger(c.class.getName()).log(Level.SEVERE, "Failed to instantiate ControllerInterface, UnsatisfiedLinkError", unsatisfiedLinkError);
          } catch (NoClassDefFoundError noClassDefFoundError) {
            Logger.getLogger(c.class.getName()).log(Level.SEVERE, "Failed to instantiate ControllerInterface, NoClassDefFoundError", noClassDefFoundError);
          } catch (Exception exception) {
            Logger.getLogger(c.class.getName()).log(Level.SEVERE, "Failed to instantiate ControllerInterface, Other", exception);
          } catch (Error error) {
            Logger.getLogger(c.class.getName()).log(Level.SEVERE, "Failed to instantiate ControllerInterface, Other", error);
          } 
        } else {
          try {
            v.a().b(paramR.c(), f);
          } catch (Exception exception) {
            D.a("failed to load Comms Driver: " + exception.getLocalizedMessage());
          } catch (Error error) {
            Logger.getLogger(c.class.getName()).log(Level.SEVERE, "Failed to set ControllerInterface settings", error);
          } 
        } 
        if (f != null)
          t1.a(f); 
      } 
      return (J)t1;
    } 
    if (paramString1 != null && paramString1.equals(f)) {
      l l = j.a().a(paramR);
      String str = j.a().b(paramR);
      if (str == null)
        str = parami.b().a(); 
      if (l.a() == null && str != null) {
        f f = null;
        try {
          f = parami.a(str, parami1, paramString2);
          j.a().b(paramR.c(), f);
        } catch (InstantiationException instantiationException) {
          Logger.getLogger(c.class.getName()).log(Level.SEVERE, "Failed to instantiate ControllerInterface", instantiationException);
        } catch (IllegalAccessException illegalAccessException) {
          Logger.getLogger(c.class.getName()).log(Level.SEVERE, "Failed to instantiate ControllerInterface, IllegalAccess", illegalAccessException);
        } 
        if (f == null) {
          q q1 = parami.b();
          try {
            f = parami.a(q1.a(), paramString2);
          } catch (InstantiationException instantiationException) {
            Logger.getLogger(c.class.getName()).log(Level.SEVERE, "Failed to instantiate ControllerInterface", instantiationException);
          } catch (IllegalAccessException illegalAccessException) {
            Logger.getLogger(c.class.getName()).log(Level.SEVERE, "Failed to instantiate ControllerInterface, IllegalAccess", illegalAccessException);
          } 
        } else {
          try {
            j.a().b(paramR.c(), f);
          } catch (Exception exception) {
            D.a("failed to load Comms Driver: " + exception.getLocalizedMessage());
          } catch (Error error) {
            D.a("failed to load Comms Driver: " + error.getLocalizedMessage());
          } 
        } 
        if (f != null)
          l.a(f); 
      } 
      return (J)l;
    } 
    t t = v.a().a(paramR);
    q q = parami.b();
    try {
      f f = parami.a(q.a(), paramString2);
      t.a(f);
      v.a().b(paramR.c(), f);
      return (J)t;
    } catch (InstantiationException instantiationException) {
      Logger.getLogger(c.class.getName()).log(Level.SEVERE, "Failed to instantiate ControllerInterface", instantiationException);
    } catch (IllegalAccessException illegalAccessException) {
      Logger.getLogger(c.class.getName()).log(Level.SEVERE, "Failed to instantiate ControllerInterface, IllegalAccess", illegalAccessException);
    } catch (Exception exception) {
      Logger.getLogger(c.class.getName()).log(Level.SEVERE, "Failed to instantiate ControllerInterface, Generl Exception", exception);
    } catch (Error error) {
      Logger.getLogger(c.class.getName()).log(Level.SEVERE, "Failed to instantiate ControllerInterface, Error", error);
    } 
    return null;
  }
  
  public void a(d paramd) {
    this.i.add(paramd);
  }
  
  public Iterator b() {
    return this.i.iterator();
  }
  
  public boolean a(String paramString) {
    for (d d : this.i) {
      if (d.a().equals(paramString))
        return true; 
    } 
    return false;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/z/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */