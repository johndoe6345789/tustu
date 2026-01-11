package aP;

import G.J;
import G.R;
import G.S;
import G.T;
import G.am;
import G.bv;
import G.cu;
import V.a;
import aE.a;
import ac.r;
import ao.bY;
import ao.hx;
import bH.D;
import bH.Y;
import bH.x;
import com.efiAnalytics.ui.bV;
import java.awt.Component;
import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import r.a;
import r.i;

public class cb implements S, KeyEventDispatcher {
  private static cb a = null;
  
  private ArrayList b = new ArrayList();
  
  private ArrayList c = new ArrayList();
  
  private boolean d = false;
  
  private boolean e = false;
  
  private String f = "";
  
  public void a(KeyEventDispatcher paramKeyEventDispatcher) {
    this.b.add(paramKeyEventDispatcher);
  }
  
  public void b(KeyEventDispatcher paramKeyEventDispatcher) {
    this.b.remove(paramKeyEventDispatcher);
  }
  
  private boolean a(KeyEvent paramKeyEvent) {
    Iterator<KeyEventDispatcher> iterator = this.b.iterator();
    while (iterator.hasNext()) {
      if (((KeyEventDispatcher)iterator.next()).dispatchKeyEvent(paramKeyEvent))
        return true; 
    } 
    return false;
  }
  
  public static cb a() {
    if (a == null)
      a = new cb(); 
    return a;
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent) {
    if (a(paramKeyEvent))
      return true; 
    if (paramKeyEvent.getID() == 401) {
      if (paramKeyEvent.getKeyCode() == 16)
        this.d = true; 
      if (paramKeyEvent.getKeyCode() == 128)
        this.d = true; 
      if (paramKeyEvent.getKeyCode() == 32)
        f.a().p(); 
      this.f += paramKeyEvent.getKeyChar();
      a(this.f);
      if (paramKeyEvent.getModifiers() == 2 && paramKeyEvent.getKeyCode() == 76) {
        boolean bool = r.a();
        if (!bool && a.A() != null) {
          f.a().f(dd.a().c());
          return true;
        } 
      } 
      if (paramKeyEvent.getModifiers() == 2 && paramKeyEvent.getKeyCode() == 75) {
        boolean bool = r.a();
        if (bool) {
          f.a().g(dd.a().c());
          return true;
        } 
      } 
      if (paramKeyEvent.getModifiers() == 2 && paramKeyEvent.getKeyCode() == 65 && cu.a().g("dataLogTime") > 0.0D && cu.a().g("dataLoggingActive") == 0.0D)
        f.a().e(); 
      if (paramKeyEvent.getSource() instanceof Component && (bV.b((Component)paramKeyEvent.getSource()) instanceof dl || paramKeyEvent.getSource() instanceof com.efiAnalytics.apps.ts.dashboard.x)) {
        if (paramKeyEvent.getModifiers() == 2 && paramKeyEvent.getKeyCode() == 39) {
          bW bW = dd.a().h();
          D.c(paramKeyEvent.paramString());
          D.c("" + paramKeyEvent.getSource());
          bW.a(true);
          return true;
        } 
        if (paramKeyEvent.getModifiers() == 2 && paramKeyEvent.getKeyCode() == 37) {
          bW bW = dd.a().h();
          bW.b(true);
          return true;
        } 
      } 
      if (paramKeyEvent.getKeyCode() == 27)
        dd.a().b().u(); 
      if (paramKeyEvent.getModifiers() == 2 && paramKeyEvent.getKeyCode() == 117)
        f.a().h(dd.a().c()); 
      if (paramKeyEvent.getModifiers() == 2 && paramKeyEvent.getKeyCode() == 115 && a.A() != null)
        try {
          a.A().b();
          D.d("project.properties saved.");
        } catch (a a) {
          Logger.getLogger(cb.class.getName()).log(Level.WARNING, "Failed to save project.properties", (Throwable)a);
        }  
      if (paramKeyEvent.getKeyCode() == 116)
        dd.a().b().y(); 
      if (paramKeyEvent.getModifiers() == 3 && paramKeyEvent.getKeyCode() == 121)
        f.a().z(); 
      if (paramKeyEvent.getModifiers() == 3 && paramKeyEvent.getKeyCode() == 123)
        f.a().v(); 
      if (paramKeyEvent.getModifiers() == 3 && paramKeyEvent.getKeyCode() == 68) {
        boolean bool = J.I();
        J.e(!bool);
      } 
      if (paramKeyEvent.getModifiers() == 3 && paramKeyEvent.getKeyCode() == 84)
        new Y(); 
      if (paramKeyEvent.getModifiers() == 3 && paramKeyEvent.getKeyCode() == 70)
        (new x()).a(dd.a().c()); 
      if (paramKeyEvent.getModifiers() == 3 && paramKeyEvent.getKeyCode() == 67)
        f.a().e(dd.a().c()); 
      if (a.A() != null && paramKeyEvent.getModifiers() == 3 && paramKeyEvent.getKeyCode() == 119)
        f.a().e(dd.a().c()); 
      if (paramKeyEvent.getModifiers() == 3 && paramKeyEvent.getKeyCode() == 80 && T.a().c() != null && T.a().c().C().D() != null)
        f.a().C(); 
      Component component = KeyboardFocusManager.getCurrentKeyboardFocusManager().getFocusOwner();
      if (paramKeyEvent.getModifiers() == 11 && paramKeyEvent.getKeyCode() == 122) {
        String str = a.a().a(a.cE, null);
        if (str != null && (str.equals("p_tobin@yahoo.com") || str.equals("philip.tobin@yahoo.com")))
          bM.a(dd.a().c()); 
      } 
      if (paramKeyEvent.getModifiers() == 3 && paramKeyEvent.getKeyCode() == 122)
        f.a().D(); 
      if (paramKeyEvent.getModifiers() == 3 && paramKeyEvent.getKeyCode() == 69)
        f.a().d(); 
      if (paramKeyEvent.getModifiers() == 3 && paramKeyEvent.getKeyCode() == 82)
        f.a().k(dd.a().c()); 
      if (paramKeyEvent.getModifiers() == 3 && paramKeyEvent.getKeyCode() == 81)
        f.a().a(dd.a().c()); 
      if (paramKeyEvent.getKeyCode() == 112) {
        f.a().u();
        return true;
      } 
    } else if (paramKeyEvent.getID() == 402) {
      this.f = "";
      if (paramKeyEvent.getKeyCode() == 16)
        this.d = false; 
      if (paramKeyEvent.getKeyCode() == 128)
        this.d = false; 
    } 
    return (i.a().a(" OKFDS09IFDSOK") && hx.a().r() != null) ? bY.a().dispatchKeyEvent(paramKeyEvent) : false;
  }
  
  private void a(List paramList) {
    this.c.addAll(paramList);
  }
  
  private void b() {
    this.c.clear();
  }
  
  private void a(String paramString) {
    for (am am : this.c) {
      if (paramString.equals(am.b()) && am.c().equals("showPanel")) {
        String str = am.a(0);
        bv bv = am.a().e().c(str);
        if (bv == null && str.startsWith("std_")) {
          f.a().a(str, "0", dd.a().c());
          continue;
        } 
        if (bv != null) {
          f.a().a(am.a(), bv, dd.a().c());
          continue;
        } 
        bV.d("Attempt to open invalid dialog name", dd.a().c());
      } 
    } 
  }
  
  public void a(R paramR) {}
  
  public void b(R paramR) {
    b();
  }
  
  public void c(R paramR) {
    if (paramR.e().a() != null)
      a(paramR.e().a()); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/cb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */