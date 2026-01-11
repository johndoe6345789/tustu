package ao;

import bH.J;
import com.efiAnalytics.ui.s;
import com.efiAnalytics.ui.w;
import g.k;
import h.i;
import java.awt.Component;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;

public class hZ extends w implements TableModelListener {
  private he w = null;
  
  public hZ() {
    b(false);
    f().addMouseListener(new ic(this));
  }
  
  void a(hP paramhP) {
    this.w = paramhP;
  }
  
  public void a(hY paramhY) {
    int i = paramhY.g();
    h().a(i);
    h().b(paramhY.h());
    b(paramhY.i());
    if (this.w != null) {
      String str = this.w.a("yAxis_" + paramhY.z());
      if (str != null && !str.equals(""))
        paramhY.d(str); 
    } 
    a(paramhY);
    h().c(b(paramhY));
  }
  
  private boolean b(hY paramhY) {
    return ((int)Math.log10(paramhY.F()) + paramhY.i() <= 3 && paramhY.h() < 1 && J.a() && (int)Math.log10(paramhY.B()) + paramhY.g() <= 3);
  }
  
  public void a(int paramInt1, int paramInt2) {
    JPopupMenu jPopupMenu = new JPopupMenu();
    s s = (s)h().getModel();
    String str = (this.w != null) ? this.w.a("yAxis_" + s.z()) : "";
    if (str == null || str.equals("")) {
      JMenuItem jMenuItem = new JMenuItem("Set Y-Axis Override");
      jMenuItem.setFont(this.a.getFont());
      jMenuItem.addActionListener(new ia(this));
      jPopupMenu.add(jMenuItem);
    } else {
      JMenuItem jMenuItem = new JMenuItem("Clear Y-Axis Override");
      jMenuItem.setFont(this.a.getFont());
      jMenuItem.addActionListener(new ib(this));
      jPopupMenu.add(jMenuItem);
    } 
    jPopupMenu.show((Component)this, paramInt1, paramInt2);
  }
  
  public void a() {
    s s = (s)h().getModel();
    String str = i.a("yAxisField", "MAP");
    s.d(str);
    if (this.w != null)
      this.w.a("yAxis_" + s.z(), ""); 
  }
  
  public void b() {
    s s = (s)h().getModel();
    String str = k.a("{Y-Axis Override for " + s.z() + "}", false, "Override Y-Axis Field.", true, (Component)this);
    if (str != null && !str.equals("")) {
      s.d(str);
      if (this.w != null)
        this.w.a("yAxis_" + s.z(), str); 
    } 
  }
  
  public void tableChanged(TableModelEvent paramTableModelEvent) {
    repaint();
    super.tableChanged(paramTableModelEvent);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/hZ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */