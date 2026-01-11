package z;

import A.IO;
import A.AInterfaceIndia;
import A.ClassType;
import A.IOFile;
import A.AInterfaceVictor;
import B.AInterfaceIndia;
import G.J;
import G.R;
import bH.D;
import bQ.BqInterfaceJuliet;
import bQ.IOHashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

public ArrayListInZPackagelass ArrayListInZPackage {
  public static String a = "MegaSquirtRs232CommManager";
  
  public static String b = "MegaSquirtRs232CommManagerAlternate";
  
  public static String c = "Agressive Reinitialize CommManager";
  
  public static String d = "K-Line Echo Filtering CommManager";
  
  public static String e = "Multi Interface MegaSquirt Driver";
  
  public static String IO = IOHashMap.a;
  
  private static c h = null;
  
  private ArrayList AInterfaceIndia = new ArrayList();
  
  HashMap g = new HashMap<>();
  
  public static c a() {
    if (h == null)
      h = new c(); 
    return h;
  }
  
  public J a(R paramR, String paramString1, AInterfaceIndia parami, AInterfaceIndia parami1, String paramString2) {
    if (paramString1 != null && paramString1.equals(e)) {
      IOFile t1 = AInterfaceVictor.a().a(paramR);
      String str = AInterfaceVictor.a().b(paramR);
      if (t1.a() == null && str != null) {
        IO IO = null;
        try {
          IO = parami.a(str, paramString2);
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
        if (IO == null) {
          ClassType q1 = parami.b();
          try {
            IO = parami.a(q1.a(), paramString2);
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
            AInterfaceVictor.a().b(paramR.c(), IO);
          } catch (Exception exception) {
            D.a("failed to load Comms Driver: " + exception.getLocalizedMessage());
          } catch (Error error) {
            Logger.getLogger(c.class.getName()).log(Level.SEVERE, "Failed to set ControllerInterface settings", error);
          } 
        } 
        if (IO != null)
          t1.a(IO); 
      } 
      return (J)t1;
    } 
    if (paramString1 != null && paramString1.equals(IO)) {
      IOHashMap IOHashMap = BqInterfaceJuliet.a().a(paramR);
      String str = BqInterfaceJuliet.a().b(paramR);
      if (str == null)
        str = parami.b().a(); 
      if (IOHashMap.a() == null && str != null) {
        IO IO = null;
        try {
          IO = parami.a(str, parami1, paramString2);
          BqInterfaceJuliet.a().b(paramR.c(), IO);
        } catch (InstantiationException instantiationException) {
          Logger.getLogger(c.class.getName()).log(Level.SEVERE, "Failed to instantiate ControllerInterface", instantiationException);
        } catch (IllegalAccessException illegalAccessException) {
          Logger.getLogger(c.class.getName()).log(Level.SEVERE, "Failed to instantiate ControllerInterface, IllegalAccess", illegalAccessException);
        } 
        if (IO == null) {
          ClassType q1 = parami.b();
          try {
            IO = parami.a(q1.a(), paramString2);
          } catch (InstantiationException instantiationException) {
            Logger.getLogger(c.class.getName()).log(Level.SEVERE, "Failed to instantiate ControllerInterface", instantiationException);
          } catch (IllegalAccessException illegalAccessException) {
            Logger.getLogger(c.class.getName()).log(Level.SEVERE, "Failed to instantiate ControllerInterface, IllegalAccess", illegalAccessException);
          } 
        } else {
          try {
            BqInterfaceJuliet.a().b(paramR.c(), IO);
          } catch (Exception exception) {
            D.a("failed to load Comms Driver: " + exception.getLocalizedMessage());
          } catch (Error error) {
            D.a("failed to load Comms Driver: " + error.getLocalizedMessage());
          } 
        } 
        if (IO != null)
          IOHashMap.a(IO); 
      } 
      return (J)IOHashMap;
    } 
    IOFile IOFile = AInterfaceVictor.a().a(paramR);
    ClassType ClassType = parami.b();
    try {
      IO IO = parami.a(ClassType.a(), paramString2);
      IOFile.a(IO);
      AInterfaceVictor.a().b(paramR.c(), IO);
      return (J)IOFile;
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
    this.AInterfaceIndia.add(paramd);
  }
  
  public Iterator b() {
    return this.AInterfaceIndia.iterator();
  }
  
  public boolean a(String paramString) {
    for (d d : this.AInterfaceIndia) {
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