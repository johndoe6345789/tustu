package G;

import A.v;
import I.f;
import I.g;
import I.i;
import K.e;
import L.n;
import S.b;
import S.e;
import V.a;
import bH.D;
import bQ.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class T implements W {
  HashMap a = new HashMap<>();
  
  R b = null;
  
  List c = new CopyOnWriteArrayList(new ArrayList());
  
  U d = new U(this);
  
  private static T e = null;
  
  public static T a() {
    if (e == null)
      e = new T(); 
    return e;
  }
  
  public void a(R paramR) {
    D.c("Adding Configuration: " + paramR.c());
    this.a.put(paramR.c(), paramR);
    d(paramR);
    if (paramR.C() != null) {
      paramR.C().a(cu.a());
      paramR.C().a((aF)e.a());
      cu.a().a("controllerOnline", (cq)e.a());
    } 
    f f = new f();
    cu.a().d(f.a);
    if (paramR.C() != null) {
      paramR.C().a((aF)f);
      paramR.C().a((aG)f);
    } 
    i i = new i();
    cu.a().d("interrogationProgress");
    paramR.a((n)i);
    if (paramR.C() != null) {
      g g = new g();
      cu.a().d("controllerOnline");
      cu.a().a("controllerOnline", paramR.C().q() ? 1.0D : 0.0D);
      paramR.C().a((aG)g);
    } 
    if (paramR.O().Y() != null)
      try {
        cS cS = new cS(paramR);
      } catch (a a) {
        aB.a().a("Failed to add Scattered Reset Manager");
        Logger.getLogger(T.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a);
      }  
    aR aR = aR.a();
    paramR.p().a(aR);
    paramR.a((bU)new e(paramR));
    if (paramR.C() != null && cy.b(paramR.c()))
      cy.a(paramR).a(); 
    b(paramR);
  }
  
  public void a(String paramString) {
    R r = (R)this.a.get(paramString);
    if (r == null)
      throw new a(paramString + " is not a currently loaded configuration."); 
    this.b = r;
    if (r.C() != null) {
      r.C().a(this.d);
    } else {
      D.d("EcuCommunicationManager not initialized.");
    } 
    e();
  }
  
  public void b(String paramString) {
    D.c("removing Configuration: " + paramString);
    R r = c(paramString);
    if (r == null)
      return; 
    cu.a().i(paramString);
    if (r.C() != null)
      r.C().J(); 
    if (r.O() != null)
      r.O().a(); 
    aR aR = aR.a();
    r.p().b(aR);
    if (r.C() != null) {
      r.C().c(cu.a());
      J.c(paramString);
    } 
    b.a().a(paramString);
    e.a().b(paramString);
    if (r.C() != null)
      r.C().c(this.d); 
    this.a.remove(paramString);
    if (this.b != null && this.b.equals(r))
      this.b = null; 
    c(r);
    aR.a().b(paramString);
    v.a().a(paramString);
    j.a().a(paramString);
    if (cy.b(r.c()))
      cy.c(r.c()); 
    r.T();
    n.a().a(0);
  }
  
  public void b() {
    Object[] arrayOfObject = this.a.keySet().toArray();
    for (byte b = 0; b < arrayOfObject.length; b++)
      b((String)arrayOfObject[b]); 
  }
  
  public R c(String paramString) {
    return (R)this.a.get(paramString);
  }
  
  public R c() {
    return this.b;
  }
  
  public String[] d() {
    Object[] arrayOfObject = this.a.keySet().toArray();
    String[] arrayOfString = new String[arrayOfObject.length];
    for (byte b = 0; b < arrayOfObject.length; b++) {
      arrayOfString[b] = (String)arrayOfObject[b];
      if (b > 0 && this.b != null && arrayOfString[b].equals(this.b.c())) {
        arrayOfString[b] = arrayOfString[0];
        arrayOfString[0] = this.b.c();
      } 
    } 
    return arrayOfString;
  }
  
  public void a(S paramS) {
    if (!this.c.contains(paramS))
      this.c.add(paramS); 
  }
  
  private void b(R paramR) {
    for (S s : this.c)
      s.c(paramR); 
  }
  
  private void c(R paramR) {
    for (S s : this.c) {
      try {
        s.b(paramR);
      } catch (Exception exception) {}
    } 
  }
  
  private void e() {
    for (S s : this.c) {
      try {
        s.a(c());
      } catch (Exception exception) {
        D.c("Exception caught notifying Working Configuration Listeners");
        exception.printStackTrace();
      } 
    } 
  }
  
  private void d(R paramR) {
    String[] arrayOfString = paramR.k();
    for (byte b = 0; b < arrayOfString.length; b++) {
      aM aM = paramR.c(arrayOfString[b]);
      a(paramR.c(), aM);
    } 
  }
  
  private void a(String paramString, aM paramaM) {
    if (paramaM.F() instanceof bR) {
      bR bR = (bR)paramaM.F();
      String[] arrayOfString = bR.b();
      if (arrayOfString != null)
        for (byte b = 0; b < arrayOfString.length; b++) {
          try {
            aR aR = aR.a();
            aR.a(paramString, arrayOfString[b], new V(this, paramaM.aL()));
          } catch (a a) {
            Logger.getLogger(T.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a);
            D.a("Unable to subscribe to " + paramaM.aL() + " for changes that impact scale.", (Exception)a, null);
          } 
        }  
    } 
    if (paramaM.G() instanceof bR) {
      bR bR = (bR)paramaM.G();
      String[] arrayOfString = bR.b();
      if (arrayOfString != null)
        for (byte b = 0; b < arrayOfString.length; b++) {
          try {
            aR aR = aR.a();
            aR.a(paramString, arrayOfString[b], new V(this, paramaM.aL()));
          } catch (a a) {
            Logger.getLogger(T.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a);
            D.a("Unable to subscribe to " + paramaM.aL() + " for changes that impact scale.", (Exception)a, null);
          } 
        }  
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/T.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */