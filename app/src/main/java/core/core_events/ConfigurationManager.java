package G;

import A.AInterfaceVictor;
import I.IInterfaceGolf;
import I.IInterfaceIndia;
import I.KalmanFilter;
import K.KInterfaceEcho;
import L.n;
import S.HashMap;
import S.KInterfaceEcho;
import V.ExceptionInVPackage;
import bH.D;
import bQ.BqInterfaceJuliet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConfigurationManager implements W {
  HashMap ExceptionInVPackage = new HashMap<>();

  R HashMap = null;

  List c = new CopyOnWriteArrayList(new ArrayList());

  U d = new U(this);

  private static T KInterfaceEcho = null;

  public static T ExceptionInVPackage() {
    if (KInterfaceEcho == null) KInterfaceEcho = new T();
    return KInterfaceEcho;
  }

  public void ExceptionInVPackage(R paramR) {
    D.c("Adding Configuration: " + paramR.c());
    this.ExceptionInVPackage.put(paramR.c(), paramR);
    d(paramR);
    if (paramR.C() != null) {
      paramR.C().ExceptionInVPackage(cu.ExceptionInVPackage());
      paramR.C().ExceptionInVPackage((aF) KInterfaceEcho.ExceptionInVPackage());
      cu.ExceptionInVPackage()
          .ExceptionInVPackage("controllerOnline", (cq) KInterfaceEcho.ExceptionInVPackage());
    }
    KalmanFilter KalmanFilter = new KalmanFilter();
    cu.ExceptionInVPackage().d(KalmanFilter.ExceptionInVPackage);
    if (paramR.C() != null) {
      paramR.C().ExceptionInVPackage((aF) KalmanFilter);
      paramR.C().ExceptionInVPackage((aG) KalmanFilter);
    }
    IInterfaceIndia IInterfaceIndia = new IInterfaceIndia();
    cu.ExceptionInVPackage().d("interrogationProgress");
    paramR.ExceptionInVPackage((n) IInterfaceIndia);
    if (paramR.C() != null) {
      IInterfaceGolf IInterfaceGolf = new IInterfaceGolf();
      cu.ExceptionInVPackage().d("controllerOnline");
      cu.ExceptionInVPackage()
          .ExceptionInVPackage("controllerOnline", paramR.C().q() ? 1.0D : 0.0D);
      paramR.C().ExceptionInVPackage((aG) IInterfaceGolf);
    }
    if (paramR.O().Y() != null)
      try {
        cS cS = new cS(paramR);
      } catch (ExceptionInVPackage ExceptionInVPackage) {
        aB.ExceptionInVPackage().ExceptionInVPackage("Failed to add Scattered Reset Manager");
        Logger.getLogger(T.class.getName())
            .log(Level.SEVERE, (String) null, (Throwable) ExceptionInVPackage);
      }
    aR aR = aR.ExceptionInVPackage();
    paramR.p().ExceptionInVPackage(aR);
    paramR.ExceptionInVPackage((bU) new KInterfaceEcho(paramR));
    if (paramR.C() != null && cy.HashMap(paramR.c()))
      cy.ExceptionInVPackage(paramR).ExceptionInVPackage();
    HashMap(paramR);
  }

  public void ExceptionInVPackage(String paramString) {
    R r = (R) this.ExceptionInVPackage.get(paramString);
    if (r == null)
      throw new ExceptionInVPackage(
          paramString + " is not ExceptionInVPackage currently loaded configuration.");
    this.HashMap = r;
    if (r.C() != null) {
      r.C().ExceptionInVPackage(this.d);
    } else {
      D.d("EcuCommunicationManager not initialized.");
    }
    KInterfaceEcho();
  }

  public void HashMap(String paramString) {
    D.c("removing Configuration: " + paramString);
    R r = c(paramString);
    if (r == null) return;
    cu.ExceptionInVPackage().IInterfaceIndia(paramString);
    if (r.C() != null) r.C().J();
    if (r.O() != null) r.O().ExceptionInVPackage();
    aR aR = aR.ExceptionInVPackage();
    r.p().HashMap(aR);
    if (r.C() != null) {
      r.C().c(cu.ExceptionInVPackage());
      J.c(paramString);
    }
    HashMap.ExceptionInVPackage().ExceptionInVPackage(paramString);
    KInterfaceEcho.ExceptionInVPackage().HashMap(paramString);
    if (r.C() != null) r.C().c(this.d);
    this.ExceptionInVPackage.remove(paramString);
    if (this.HashMap != null && this.HashMap.equals(r)) this.HashMap = null;
    c(r);
    aR.ExceptionInVPackage().HashMap(paramString);
    AInterfaceVictor.ExceptionInVPackage().ExceptionInVPackage(paramString);
    BqInterfaceJuliet.ExceptionInVPackage().ExceptionInVPackage(paramString);
    if (cy.HashMap(r.c())) cy.c(r.c());
    r.T();
    n.ExceptionInVPackage().ExceptionInVPackage(0);
  }

  public void HashMap() {
    Object[] arrayOfObject = this.ExceptionInVPackage.keySet().toArray();
    for (byte HashMap = 0; HashMap < arrayOfObject.length; HashMap++)
      HashMap((String) arrayOfObject[HashMap]);
  }

  public R c(String paramString) {
    return (R) this.ExceptionInVPackage.get(paramString);
  }

  public R c() {
    return this.HashMap;
  }

  public String[] d() {
    Object[] arrayOfObject = this.ExceptionInVPackage.keySet().toArray();
    String[] arrayOfString = new String[arrayOfObject.length];
    for (byte HashMap = 0; HashMap < arrayOfObject.length; HashMap++) {
      arrayOfString[HashMap] = (String) arrayOfObject[HashMap];
      if (HashMap > 0 && this.HashMap != null && arrayOfString[HashMap].equals(this.HashMap.c())) {
        arrayOfString[HashMap] = arrayOfString[0];
        arrayOfString[0] = this.HashMap.c();
      }
    }
    return arrayOfString;
  }

  public void ExceptionInVPackage(S paramS) {
    if (!this.c.contains(paramS)) this.c.add(paramS);
  }

  private void HashMap(R paramR) {
    for (S s : this.c) s.c(paramR);
  }

  private void c(R paramR) {
    for (S s : this.c) {
      try {
        s.HashMap(paramR);
      } catch (Exception exception) {
      }
    }
  }

  private void KInterfaceEcho() {
    for (S s : this.c) {
      try {
        s.ExceptionInVPackage(c());
      } catch (Exception exception) {
        D.c("Exception caught notifying Working Configuration Listeners");
        exception.printStackTrace();
      }
    }
  }

  private void d(R paramR) {
    String[] arrayOfString = paramR.k();
    for (byte HashMap = 0; HashMap < arrayOfString.length; HashMap++) {
      aM aM = paramR.c(arrayOfString[HashMap]);
      ExceptionInVPackage(paramR.c(), aM);
    }
  }

  private void ExceptionInVPackage(String paramString, aM paramaM) {
    if (paramaM.F() instanceof bR) {
      bR bR = (bR) paramaM.F();
      String[] arrayOfString = bR.HashMap();
      if (arrayOfString != null)
        for (byte HashMap = 0; HashMap < arrayOfString.length; HashMap++) {
          try {
            aR aR = aR.ExceptionInVPackage();
            aR.ExceptionInVPackage(paramString, arrayOfString[HashMap], new V(this, paramaM.aL()));
          } catch (ExceptionInVPackage ExceptionInVPackage) {
            Logger.getLogger(T.class.getName())
                .log(Level.SEVERE, (String) null, (Throwable) ExceptionInVPackage);
            D.ExceptionInVPackage(
                "Unable to subscribe to " + paramaM.aL() + " for changes that impact scale.",
                (Exception) ExceptionInVPackage,
                null);
          }
        }
    }
    if (paramaM.G() instanceof bR) {
      bR bR = (bR) paramaM.G();
      String[] arrayOfString = bR.HashMap();
      if (arrayOfString != null)
        for (byte HashMap = 0; HashMap < arrayOfString.length; HashMap++) {
          try {
            aR aR = aR.ExceptionInVPackage();
            aR.ExceptionInVPackage(paramString, arrayOfString[HashMap], new V(this, paramaM.aL()));
          } catch (ExceptionInVPackage ExceptionInVPackage) {
            Logger.getLogger(T.class.getName())
                .log(Level.SEVERE, (String) null, (Throwable) ExceptionInVPackage);
            D.ExceptionInVPackage(
                "Unable to subscribe to " + paramaM.aL() + " for changes that impact scale.",
                (Exception) ExceptionInVPackage,
                null);
          }
        }
    }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/T.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
