package ar;

import V.a;
import ao.bq;
import bH.D;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.cO;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTabbedPane;
import javax.swing.SwingUtilities;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class g extends JTabbedPane implements ChangeListener {
  int a = -1;
  
  Icon b;
  
  Icon c;
  
  boolean d = true;
  
  boolean e = false;
  
  public g() {
    super(1, 1);
    try {
      this.b = new ImageIcon(cO.a().a(cO.A, this, 12));
      Image image = cO.a().a(cO.I, this, 16);
      this.c = new ImageIcon(image);
    } catch (a a) {
      Logger.getLogger(g.class.getName()).log(Level.WARNING, "Failed to create Dirty Icon", (Throwable)a);
    } 
    a();
    setSelectedIndex(0);
    addMouseListener(new k(this));
    addChangeListener(this);
    f.a().a(new j(this));
  }
  
  private void a() {
    List list = f.a().b();
    for (c c : list)
      addTab(c.b(), (Icon)null, c(), c.a()); 
    if (this.d)
      addTab("", this.c, c(), "New Quick View"); 
  }
  
  private void b() {
    boolean bool = false;
    while (true) {
      String str = bV.a(this, false, "New Quick View Name", "");
      if (str == null || str.trim().isEmpty())
        return; 
      str = str.trim();
      if (f.a().c(str) != null) {
        bV.d("A Quick View with that name already exists, the name must be unique.", this);
      } else {
        bool = true;
      } 
      if (bool) {
        if (bq.a().c().j()) {
          String str1 = f.a().g();
          D.c("Current Log View: " + str1);
          if (str1 != null && !str1.isEmpty()) {
            c c1 = f.a().c(str1);
            c c2 = bq.a().c().B();
            if (bq.a().c().j()) {
              D.c("View Changed: " + bq.a().c().j());
              c2.a(c1.b());
              f.a().a(c2);
            } 
          } 
        } 
        f.a().d(str);
        return;
      } 
    } 
  }
  
  private JPanel c() {
    JPanel jPanel = new JPanel();
    jPanel.setMinimumSize(new Dimension(10, 1));
    jPanel.setPreferredSize(new Dimension(10, 1));
    jPanel.setMaximumSize(new Dimension(10, 1));
    return jPanel;
  }
  
  public void stateChanged(ChangeEvent paramChangeEvent) {
    h h = new h(this);
    SwingUtilities.invokeLater(h);
  }
  
  public Dimension getMinimumSize() {
    return super.getMinimumSize();
  }
  
  public Dimension getPreferredSize() {
    return super.getPreferredSize();
  }
  
  public int a(String paramString) {
    for (byte b = 0; b < getTabCount(); b++) {
      if (paramString.equals(getTitleAt(b)))
        return b; 
    } 
    return -1;
  }
  
  private void b(String paramString) {
    c c = f.a().c(paramString);
    if (c.f() || bV.a("Are you sure you want to delete " + paramString + "?", this, true)) {
      f.a().b(paramString);
      f.a().c(c);
    } 
  }
  
  protected void a(MouseEvent paramMouseEvent) {
    String str2;
    String str1 = null;
    for (byte b = 0; b < getTabCount(); b++) {
      Rectangle rectangle = getBoundsAt(b);
      if (rectangle.contains(paramMouseEvent.getPoint())) {
        str1 = getTitleAt(b);
        if (b != getSelectedIndex())
          f.a().a(str1); 
        break;
      } 
    } 
    if (str1 == null || str1.isEmpty())
      return; 
    JPopupMenu jPopupMenu = new JPopupMenu();
    c c = f.a().c(str1);
    if (c != null && c.f()) {
      str2 = "Restore Default Fields";
    } else {
      str2 = "Delete Quick View";
    } 
    JMenuItem jMenuItem = new JMenuItem(str2);
    jMenuItem.setActionCommand(str1);
    jMenuItem.addActionListener(new i(this));
    jPopupMenu.add(jMenuItem);
    jPopupMenu.show(this, paramMouseEvent.getX(), paramMouseEvent.getY());
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ar/g.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */