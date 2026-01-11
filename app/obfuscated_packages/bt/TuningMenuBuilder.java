package bt;

import G.R;
import G.aA;
import G.bM;
import G.bv;
import V.g;
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
import s.g;

public class P implements ActionListener {
  private int c = -1;
  
  List a = new ArrayList();
  
  w b = new w();
  
  public bq a(bq parambq, R paramR, int paramInt) {
    this.c = paramInt;
    HashMap<Object, Object> hashMap = new HashMap<>();
    Iterator<aA> iterator = paramR.e().b();
    while (iterator.hasNext()) {
      aA aA = iterator.next();
      try {
        if (!aA.c() && p.a(aA.i(), paramR)) {
          String str = g.b(aA.e());
          JMenu jMenu = (JMenu)hashMap.get(str);
          if (jMenu == null) {
            jMenu = new JMenu(str);
            jMenu.setEnabled(p.a(aA.aJ(), paramR));
            hashMap.put(str, jMenu);
          } 
          if (aA.b()) {
            a(paramR, aA.a(), jMenu);
            if (jMenu.getMenuComponentCount() > 0)
              parambq.add(jMenu); 
          } 
        } 
      } catch (g g) {}
    } 
    return parambq;
  }
  
  private void a(R paramR, Iterator<aA> paramIterator, JMenu paramJMenu) {
    aA aA = null;
    while (paramIterator.hasNext()) {
      aA aA1 = paramIterator.next();
      try {
        if (!aA1.c() && p.a(aA1.i(), paramR)) {
          bv bv = paramR.e().c(aA1.d());
          if (a(bv)) {
            String str = g.b(aA1.e());
            if (aA1.b()) {
              JMenu jMenu = new JMenu(str);
              a(paramR, aA1.a(), jMenu);
              paramJMenu.add(jMenu);
              continue;
            } 
            boolean bool = true;
            try {
              bool = p.a(aA1.aJ(), paramR);
            } catch (Exception exception) {}
            if (bool) {
              JMenuItem jMenuItem = new JMenuItem(str);
              jMenuItem.addActionListener(this);
              jMenuItem.setActionCommand(aA1.d());
              jMenuItem.setEnabled(p.a(aA1.aJ(), paramR));
              jMenuItem.setIcon(this.b.a(aA1));
              paramJMenu.add(jMenuItem);
              aA = aA1;
            } 
            continue;
          } 
          if (bv != null && a(paramR, bv)) {
            String str = g.b(aA1.e());
            JMenu jMenu = new JMenu(str);
            jMenu.setIcon(this.b.a(aA1));
            a(paramR, bv, jMenu);
            paramJMenu.add(jMenu);
            continue;
          } 
          if (bv == null && a(paramR, aA1)) {
            String str = g.b(aA1.e());
            JMenu jMenu = new JMenu(str);
            a(paramR, aA1.a(), jMenu);
            paramJMenu.add(jMenu);
          } 
          continue;
        } 
        if (aA1.c() && aA != null && !aA.c() && paramIterator.hasNext()) {
          paramJMenu.addSeparator();
          aA = aA1;
        } 
      } catch (g g) {}
    } 
  }
  
  private void a(R paramR, bv parambv, JMenu paramJMenu) {
    Iterator<bv> iterator = parambv.K();
    while (iterator.hasNext()) {
      bv bv1 = iterator.next();
      if (a(bv1)) {
        try {
          String str = bM.a(paramR, bv1.aL());
          boolean bool = p.a(str, paramR);
          if (bool) {
            JMenuItem jMenuItem = new JMenuItem(bM.c(paramR, bv1.aL()));
            jMenuItem.addActionListener(this);
            jMenuItem.setActionCommand(bv1.aL());
            jMenuItem.setIcon(this.b.a(bv1, null, null));
            paramJMenu.add(jMenuItem);
          } 
        } catch (g g) {
          D.a("Fail to set enable condition: " + g.getLocalizedMessage());
          Logger.getLogger(Q.class.getName()).log(Level.SEVERE, (String)null, (Throwable)g);
        } 
        continue;
      } 
      if (a(paramR, bv1))
        a(paramR, bv1, paramJMenu); 
    } 
  }
  
  private boolean a(bv parambv) {
    byte b = 0;
    if (parambv instanceof G.be) {
      b = 1;
    } else if (parambv instanceof G.bm) {
      b = 2;
    } else if (parambv instanceof bv && parambv.R() == 3 && parambv.S()) {
      b = 1;
    } else if (parambv instanceof bv && (parambv.R() == 3 || parambv.R() == 4) && parambv.T()) {
      b = 2;
    } else {
      b = -1;
    } 
    return ((b & this.c) == b);
  }
  
  private boolean a(R paramR, aA paramaA) {
    bv bv = paramR.e().c(paramaA.d());
    if (bv != null && (a(bv) || a(paramR, bv)))
      return true; 
    if (paramaA.b()) {
      Iterator<aA> iterator = paramaA.a();
      while (iterator.hasNext()) {
        aA aA1 = iterator.next();
        bv = paramR.e().c(aA1.d());
        if (bv != null && (a(bv) || a(paramR, bv)))
          return true; 
      } 
    } 
    return false;
  }
  
  private boolean a(R paramR, bv parambv) {
    if (parambv.L()) {
      Iterator<bv> iterator = parambv.K();
      while (iterator.hasNext()) {
        bv bv1 = iterator.next();
        if (a(bv1))
          try {
            String str = bM.a(paramR, bv1.aL());
            return p.a(str, paramR);
          } catch (g g) {
            return true;
          }  
        if (bv1.L() && a(paramR, bv1)) {
          String str = bM.a(paramR, bv1.aL());
          try {
            if (p.a(str, paramR))
              return true; 
          } catch (g g) {
            D.a(g.getMessage());
            g.printStackTrace();
          } 
        } 
      } 
      return false;
    } 
    return false;
  }
  
  public void a(ActionListener paramActionListener) {
    if (!this.a.contains(paramActionListener))
      this.a.add(paramActionListener); 
  }
  
  public void b(ActionListener paramActionListener) {
    this.a.remove(paramActionListener);
  }
  
  private void a(ActionEvent paramActionEvent) {
    for (ActionListener actionListener : this.a)
      actionListener.actionPerformed(paramActionEvent); 
  }
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    a(paramActionEvent);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/P.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */