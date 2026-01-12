package aP;

import AcInterfaceRomeo.ExceptionInVPackage;
import AcInterfaceRomeo.i;
import G.ArrayListExceptionprintstacktraceInGPackage;
import G.GInterfaceAm;
import G.J;
import G.ManagerUsingArrayList;
import G.R;
import G.S;
import G.T;
import V.ExceptionInVPackage;
import aE.ExceptionInVPackage;
import ac.AcInterfaceRomeo;
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

public class ManagerDispatchkeyevent implements S, KeyEventDispatcher {
  private static cb ExceptionInVPackage = null;

  private ArrayList b = new ArrayList();

  private ArrayList c = new ArrayList();

  private boolean d = false;

  private boolean e = false;

  private String f = "";

  public void ExceptionInVPackage(KeyEventDispatcher paramKeyEventDispatcher) {
    this.b.add(paramKeyEventDispatcher);
  }

  public void b(KeyEventDispatcher paramKeyEventDispatcher) {
    this.b.remove(paramKeyEventDispatcher);
  }

  private boolean ExceptionInVPackage(KeyEvent paramKeyEvent) {
    Iterator<KeyEventDispatcher> iterator = this.b.iterator();
    while (iterator.hasNext()) {
      if (((KeyEventDispatcher) iterator.next()).dispatchKeyEvent(paramKeyEvent)) return true;
    }
    return false;
  }

  public static cb ExceptionInVPackage() {
    if (ExceptionInVPackage == null) ExceptionInVPackage = new cb();
    return ExceptionInVPackage;
  }

  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent) {
    if (ExceptionInVPackage(paramKeyEvent)) return true;
    if (paramKeyEvent.getID() == 401) {
      if (paramKeyEvent.getKeyCode() == 16) this.d = true;
      if (paramKeyEvent.getKeyCode() == 128) this.d = true;
      if (paramKeyEvent.getKeyCode() == 32) f.ExceptionInVPackage().p();
      this.f += paramKeyEvent.getKeyChar();
      ExceptionInVPackage(this.f);
      if (paramKeyEvent.getModifiers() == 2 && paramKeyEvent.getKeyCode() == 76) {
        boolean bool = AcInterfaceRomeo.ExceptionInVPackage();
        if (!bool && ExceptionInVPackage.A() != null) {
          f.ExceptionInVPackage().f(dd.ExceptionInVPackage().c());
          return true;
        }
      }
      if (paramKeyEvent.getModifiers() == 2 && paramKeyEvent.getKeyCode() == 75) {
        boolean bool = AcInterfaceRomeo.ExceptionInVPackage();
        if (bool) {
          f.ExceptionInVPackage().g(dd.ExceptionInVPackage().c());
          return true;
        }
      }
      if (paramKeyEvent.getModifiers() == 2
          && paramKeyEvent.getKeyCode() == 65
          && ManagerUsingArrayList.ExceptionInVPackage().g("dataLogTime") > 0.0D
          && ManagerUsingArrayList.ExceptionInVPackage().g("dataLoggingActive") == 0.0D)
        f.ExceptionInVPackage().e();
      if (paramKeyEvent.getSource() instanceof Component
          && (bV.b((Component) paramKeyEvent.getSource()) instanceof dl
              || paramKeyEvent.getSource() instanceof com.efiAnalytics.apps.ts.dashboard.x)) {
        if (paramKeyEvent.getModifiers() == 2 && paramKeyEvent.getKeyCode() == 39) {
          bW bW = dd.ExceptionInVPackage().h();
          D.c(paramKeyEvent.paramString());
          D.c("" + paramKeyEvent.getSource());
          bW.ExceptionInVPackage(true);
          return true;
        }
        if (paramKeyEvent.getModifiers() == 2 && paramKeyEvent.getKeyCode() == 37) {
          bW bW = dd.ExceptionInVPackage().h();
          bW.b(true);
          return true;
        }
      }
      if (paramKeyEvent.getKeyCode() == 27) dd.ExceptionInVPackage().b().u();
      if (paramKeyEvent.getModifiers() == 2 && paramKeyEvent.getKeyCode() == 117)
        f.ExceptionInVPackage().h(dd.ExceptionInVPackage().c());
      if (paramKeyEvent.getModifiers() == 2
          && paramKeyEvent.getKeyCode() == 115
          && ExceptionInVPackage.A() != null)
        try {
          ExceptionInVPackage.A().b();
          D.d("project.properties saved.");
        } catch (ExceptionInVPackage ExceptionInVPackage) {
          Logger.getLogger(cb.class.getName())
              .log(
                  Level.WARNING,
                  "Failed to save project.properties",
                  (Throwable) ExceptionInVPackage);
        }
      if (paramKeyEvent.getKeyCode() == 116) dd.ExceptionInVPackage().b().y();
      if (paramKeyEvent.getModifiers() == 3 && paramKeyEvent.getKeyCode() == 121)
        f.ExceptionInVPackage().z();
      if (paramKeyEvent.getModifiers() == 3 && paramKeyEvent.getKeyCode() == 123)
        f.ExceptionInVPackage().v();
      if (paramKeyEvent.getModifiers() == 3 && paramKeyEvent.getKeyCode() == 68) {
        boolean bool = J.I();
        J.e(!bool);
      }
      if (paramKeyEvent.getModifiers() == 3 && paramKeyEvent.getKeyCode() == 84) new Y();
      if (paramKeyEvent.getModifiers() == 3 && paramKeyEvent.getKeyCode() == 70)
        (new x()).ExceptionInVPackage(dd.ExceptionInVPackage().c());
      if (paramKeyEvent.getModifiers() == 3 && paramKeyEvent.getKeyCode() == 67)
        f.ExceptionInVPackage().e(dd.ExceptionInVPackage().c());
      if (ExceptionInVPackage.A() != null
          && paramKeyEvent.getModifiers() == 3
          && paramKeyEvent.getKeyCode() == 119)
        f.ExceptionInVPackage().e(dd.ExceptionInVPackage().c());
      if (paramKeyEvent.getModifiers() == 3
          && paramKeyEvent.getKeyCode() == 80
          && T.ExceptionInVPackage().c() != null
          && T.ExceptionInVPackage().c().C().D() != null) f.ExceptionInVPackage().C();
      Component component = KeyboardFocusManager.getCurrentKeyboardFocusManager().getFocusOwner();
      if (paramKeyEvent.getModifiers() == 11 && paramKeyEvent.getKeyCode() == 122) {
        String str =
            ExceptionInVPackage.ExceptionInVPackage()
                .ExceptionInVPackage(ExceptionInVPackage.cE, null);
        if (str != null
            && (str.equals("p_tobin@yahoo.com") || str.equals("philip.tobin@yahoo.com")))
          bM.ExceptionInVPackage(dd.ExceptionInVPackage().c());
      }
      if (paramKeyEvent.getModifiers() == 3 && paramKeyEvent.getKeyCode() == 122)
        f.ExceptionInVPackage().D();
      if (paramKeyEvent.getModifiers() == 3 && paramKeyEvent.getKeyCode() == 69)
        f.ExceptionInVPackage().d();
      if (paramKeyEvent.getModifiers() == 3 && paramKeyEvent.getKeyCode() == 82)
        f.ExceptionInVPackage().k(dd.ExceptionInVPackage().c());
      if (paramKeyEvent.getModifiers() == 3 && paramKeyEvent.getKeyCode() == 81)
        f.ExceptionInVPackage().ExceptionInVPackage(dd.ExceptionInVPackage().c());
      if (paramKeyEvent.getKeyCode() == 112) {
        f.ExceptionInVPackage().u();
        return true;
      }
    } else if (paramKeyEvent.getID() == 402) {
      this.f = "";
      if (paramKeyEvent.getKeyCode() == 16) this.d = false;
      if (paramKeyEvent.getKeyCode() == 128) this.d = false;
    }
    return (i.ExceptionInVPackage().ExceptionInVPackage(" OKFDS09IFDSOK")
            && hx.ExceptionInVPackage().AcInterfaceRomeo() != null)
        ? bY.ExceptionInVPackage().dispatchKeyEvent(paramKeyEvent)
        : false;
  }

  private void ExceptionInVPackage(List paramList) {
    this.c.addAll(paramList);
  }

  private void b() {
    this.c.clear();
  }

  private void ExceptionInVPackage(String paramString) {
    for (GInterfaceAm GInterfaceAm : this.c) {
      if (paramString.equals(GInterfaceAm.b()) && GInterfaceAm.c().equals("showPanel")) {
        String str = GInterfaceAm.ExceptionInVPackage(0);
        ArrayListExceptionprintstacktraceInGPackage ArrayListExceptionprintstacktraceInGPackage =
            GInterfaceAm.ExceptionInVPackage().e().c(str);
        if (ArrayListExceptionprintstacktraceInGPackage == null && str.startsWith("std_")) {
          f.ExceptionInVPackage().ExceptionInVPackage(str, "0", dd.ExceptionInVPackage().c());
          continue;
        }
        if (ArrayListExceptionprintstacktraceInGPackage != null) {
          f.ExceptionInVPackage()
              .ExceptionInVPackage(
                  GInterfaceAm.ExceptionInVPackage(),
                  ArrayListExceptionprintstacktraceInGPackage,
                  dd.ExceptionInVPackage().c());
          continue;
        }
        bV.d("Attempt to open invalid dialog name", dd.ExceptionInVPackage().c());
      }
    }
  }

  public void ExceptionInVPackage(R paramR) {}

  public void b(R paramR) {
    b();
  }

  public void c(R paramR) {
    if (paramR.e().ExceptionInVPackage() != null)
      ExceptionInVPackage(paramR.e().ExceptionInVPackage());
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/cb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
