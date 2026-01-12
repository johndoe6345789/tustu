package business.binary_transformers;

import G.ArrayList;
import G.ArrayListExceptionprintstacktraceInGPackage;
import G.ExceptionprintstacktraceInGPackage;
import G.R;
import V.ExceptionPrintstacktrace;
import bH.D;
import bH.p;
import com.efiAnalytics.ui.bq;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import s.ExceptionPrintstacktrace;

public class TuningMenuBuilder implements ActionListener {
  private int c = -1;

  List a = new ArrayList();

  w b = new w();

  public bq a(bq parambq, R paramR, int paramInt) {
    this.c = paramInt;
    HashMap<Object, Object> hashMap = new HashMap<>();
    Iterator<ArrayList> iterator = paramR.e().b();
    while (iterator.hasNext()) {
      ArrayList ArrayList = iterator.next();
      try {
        if (!ArrayList.c() && p.a(ArrayList.i(), paramR)) {
          String str = ExceptionPrintstacktrace.b(ArrayList.e());
          JMenu jMenu = (JMenu) hashMap.get(str);
          if (jMenu == null) {
            jMenu = new JMenu(str);
            jMenu.setEnabled(p.a(ArrayList.aJ(), paramR));
            hashMap.put(str, jMenu);
          }
          if (ArrayList.b()) {
            a(paramR, ArrayList.a(), jMenu);
            if (jMenu.getMenuComponentCount() > 0) parambq.add(jMenu);
          }
        }
      } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      }
    }
    return parambq;
  }

  private void a(R paramR, Iterator<ArrayList> paramIterator, JMenu paramJMenu) {
    ArrayList ArrayList = null;
    while (paramIterator.hasNext()) {
      ArrayList aA1 = paramIterator.next();
      try {
        if (!aA1.c() && p.a(aA1.i(), paramR)) {
          ArrayListExceptionprintstacktraceInGPackage ArrayListExceptionprintstacktraceInGPackage =
              paramR.e().c(aA1.d());
          if (a(ArrayListExceptionprintstacktraceInGPackage)) {
            String str = ExceptionPrintstacktrace.b(aA1.e());
            if (aA1.b()) {
              JMenu jMenu = new JMenu(str);
              a(paramR, aA1.a(), jMenu);
              paramJMenu.add(jMenu);
              continue;
            }
            boolean bool = true;
            try {
              bool = p.a(aA1.aJ(), paramR);
            } catch (Exception exception) {
            }
            if (bool) {
              JMenuItem jMenuItem = new JMenuItem(str);
              jMenuItem.addActionListener(this);
              jMenuItem.setActionCommand(aA1.d());
              jMenuItem.setEnabled(p.a(aA1.aJ(), paramR));
              jMenuItem.setIcon(this.b.a(aA1));
              paramJMenu.add(jMenuItem);
              ArrayList = aA1;
            }
            continue;
          }
          if (ArrayListExceptionprintstacktraceInGPackage != null
              && a(paramR, ArrayListExceptionprintstacktraceInGPackage)) {
            String str = ExceptionPrintstacktrace.b(aA1.e());
            JMenu jMenu = new JMenu(str);
            jMenu.setIcon(this.b.a(aA1));
            a(paramR, ArrayListExceptionprintstacktraceInGPackage, jMenu);
            paramJMenu.add(jMenu);
            continue;
          }
          if (ArrayListExceptionprintstacktraceInGPackage == null && a(paramR, aA1)) {
            String str = ExceptionPrintstacktrace.b(aA1.e());
            JMenu jMenu = new JMenu(str);
            a(paramR, aA1.a(), jMenu);
            paramJMenu.add(jMenu);
          }
          continue;
        }
        if (aA1.c() && ArrayList != null && !ArrayList.c() && paramIterator.hasNext()) {
          paramJMenu.addSeparator();
          ArrayList = aA1;
        }
      } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      }
    }
  }

  private void a(R paramR, ArrayListExceptionprintstacktraceInGPackage parambv, JMenu paramJMenu) {
    Iterator<ArrayListExceptionprintstacktraceInGPackage> iterator = parambv.K();
    while (iterator.hasNext()) {
      ArrayListExceptionprintstacktraceInGPackage bv1 = iterator.next();
      if (a(bv1)) {
        try {
          String str = ExceptionprintstacktraceInGPackage.a(paramR, bv1.aL());
          boolean bool = p.a(str, paramR);
          if (bool) {
            JMenuItem jMenuItem =
                new JMenuItem(ExceptionprintstacktraceInGPackage.c(paramR, bv1.aL()));
            jMenuItem.addActionListener(this);
            jMenuItem.setActionCommand(bv1.aL());
            jMenuItem.setIcon(this.b.a(bv1, null, null));
            paramJMenu.add(jMenuItem);
          }
        } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
          D.a("Fail to set enable condition: " + ExceptionPrintstacktrace.getLocalizedMessage());
          Logger.getLogger(Q.class.getName())
              .log(Level.SEVERE, (String) null, (Throwable) ExceptionPrintstacktrace);
        }
        continue;
      }
      if (a(paramR, bv1)) a(paramR, bv1, paramJMenu);
    }
  }

  private boolean a(ArrayListExceptionprintstacktraceInGPackage parambv) {
    byte b = 0;
    if (parambv instanceof G.be) {
      b = 1;
    } else if (parambv instanceof G.bm) {
      b = 2;
    } else if (parambv instanceof ArrayListExceptionprintstacktraceInGPackage
        && parambv.R() == 3
        && parambv.S()) {
      b = 1;
    } else if (parambv instanceof ArrayListExceptionprintstacktraceInGPackage
        && (parambv.R() == 3 || parambv.R() == 4)
        && parambv.T()) {
      b = 2;
    } else {
      b = -1;
    }
    return ((b & this.c) == b);
  }

  private boolean a(R paramR, ArrayList paramaA) {
    ArrayListExceptionprintstacktraceInGPackage ArrayListExceptionprintstacktraceInGPackage =
        paramR.e().c(paramaA.d());
    if (ArrayListExceptionprintstacktraceInGPackage != null
        && (a(ArrayListExceptionprintstacktraceInGPackage)
            || a(paramR, ArrayListExceptionprintstacktraceInGPackage))) return true;
    if (paramaA.b()) {
      Iterator<ArrayList> iterator = paramaA.a();
      while (iterator.hasNext()) {
        ArrayList aA1 = iterator.next();
        ArrayListExceptionprintstacktraceInGPackage = paramR.e().c(aA1.d());
        if (ArrayListExceptionprintstacktraceInGPackage != null
            && (a(ArrayListExceptionprintstacktraceInGPackage)
                || a(paramR, ArrayListExceptionprintstacktraceInGPackage))) return true;
      }
    }
    return false;
  }

  private boolean a(R paramR, ArrayListExceptionprintstacktraceInGPackage parambv) {
    if (parambv.L()) {
      Iterator<ArrayListExceptionprintstacktraceInGPackage> iterator = parambv.K();
      while (iterator.hasNext()) {
        ArrayListExceptionprintstacktraceInGPackage bv1 = iterator.next();
        if (a(bv1))
          try {
            String str = ExceptionprintstacktraceInGPackage.a(paramR, bv1.aL());
            return p.a(str, paramR);
          } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
            return true;
          }
        if (bv1.L() && a(paramR, bv1)) {
          String str = ExceptionprintstacktraceInGPackage.a(paramR, bv1.aL());
          try {
            if (p.a(str, paramR)) return true;
          } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
            D.a(ExceptionPrintstacktrace.getMessage());
            ExceptionPrintstacktrace.printStackTrace();
          }
        }
      }
      return false;
    }
    return false;
  }

  public void a(ActionListener paramActionListener) {
    if (!this.a.contains(paramActionListener)) this.a.add(paramActionListener);
  }

  public void b(ActionListener paramActionListener) {
    this.a.remove(paramActionListener);
  }

  private void a(ActionEvent paramActionEvent) {
    for (ActionListener actionListener : this.a) actionListener.actionPerformed(paramActionEvent);
  }

  public void actionPerformed(ActionEvent paramActionEvent) {
    a(paramActionEvent);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/P.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
