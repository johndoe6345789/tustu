package p;

import G.T;
import G.q;
import S.a;
import S.e;
import S.l;
import S.n;
import bH.ab;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.bc;
import com.efiAnalytics.ui.cO;
import com.efiAnalytics.ui.eJ;
import d.e;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JToolBar;

public class p extends JPanel implements bc, C {
  ab a = null;
  
  l b;
  
  v c;
  
  g d;
  
  int e = -1;
  
  JButton f;
  
  JButton g;
  
  public p(l paraml, ab paramab) {
    this.a = paramab;
    this.c = new v(paramab);
    this.b = paraml;
    setBorder(BorderFactory.createEmptyBorder(eJ.a(10), eJ.a(10), eJ.a(10), eJ.a(10)));
    setLayout(new BorderLayout());
    for (n n : paraml.b())
      this.c.a(n); 
    this.c.getSelectionModel().addListSelectionListener(new u(this, null));
    JScrollPane jScrollPane = new JScrollPane(this.c);
    this.c.setFillsViewportHeight(true);
    jScrollPane.setBorder(BorderFactory.createLoweredBevelBorder());
    jScrollPane.setPreferredSize(eJ.a(320, 180));
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new BorderLayout());
    jPanel.setBorder(BorderFactory.createTitledBorder(a("Action Triggers")));
    jPanel.add("Center", jScrollPane);
    add("Center", jPanel);
    JToolBar jToolBar = new JToolBar();
    jToolBar.setFloatable(false);
    Image image = cO.a().a(cO.d, this, 24);
    image = eJ.a(image);
    ImageIcon imageIcon = new ImageIcon(image);
    JButton jButton = new JButton(a("New Action Trigger"), imageIcon);
    jButton.addActionListener(new q(this));
    jToolBar.add(jButton);
    image = cO.a().a(cO.e, this, 24);
    image = eJ.a(image);
    imageIcon = new ImageIcon(image);
    this.f = new JButton(a("Delete Trigger"), imageIcon);
    this.f.addActionListener(new r(this));
    jToolBar.add(this.f);
    this.f.setEnabled(false);
    image = cO.a().a(cO.A, this, 24);
    image = eJ.a(image);
    imageIcon = new ImageIcon(image);
    this.g = new JButton(a("Test User Action"), imageIcon);
    this.g.addActionListener(new s(this));
    this.g.setEnabled(false);
    jPanel.add("North", jToolBar);
    this.d = new g(paramab);
    this.d.a(T.a().c());
    this.d.setBorder(BorderFactory.createTitledBorder(a("Action Trigger Editor")));
    this.d.a(new t(this));
    add("South", (Component)this.d);
  }
  
  public void a() {
    this.d.j();
  }
  
  private void b() {
    n n = new n();
    this.c.getSelectionModel().clearSelection();
    this.d.a(n);
    this.d.a(true);
  }
  
  private void c() {
    if (this.c.getSelectedRow() >= 0)
      n n = this.c.a(this.c.getSelectedRow()); 
  }
  
  private boolean d() {
    try {
      n n = this.d.f();
      if (n == null) {
        bV.d(a("Editor returned no Action Trigger."), this);
        return false;
      } 
      if (this.d.g() && this.b.a(n.a()) != null) {
        String str = a("An Action Trigger with the name already exists.") + "\n" + a("If you save this Action Trigger with this name it will replace the existing Action Trigger.") + "\n\n" + a("Are you sure you wish to replace the existing Action Trigger?");
        if (!bV.a(str, this, true))
          return false; 
      } 
      this.b.a(n);
      this.d.h();
      this.c.a(n);
      this.c.a();
      if (n.c()) {
        try {
          String str = T.a().c().c();
          n.b(false);
          e.a().a(str, (a)n);
        } catch (q q) {
          Logger.getLogger(p.class.getName()).log(Level.WARNING, "Failed to restart monitoring of Action Trigger", (Throwable)q);
        } 
      } else {
        String str = T.a().c().c();
        n.b(false);
        e.a().a(str, n.a());
      } 
      return true;
    } catch (e e) {
      bV.d(e.getLocalizedMessage(), this);
      return false;
    } 
  }
  
  private void e() {
    n n = this.c.b();
    if (n != null) {
      this.c.a(n.a());
      this.b.b(n.a());
      this.c.a();
    } 
  }
  
  private String a(String paramString) {
    return (this.a != null) ? this.a.a(paramString) : paramString;
  }
  
  private void a(int paramInt) {
    if (this.d.i()) {
      String str = a("The Action Trigger currently being edited has not been saved.") + "\n" + a("Would you like to save it now?");
      if (bV.a(str, (Component)this.d, true))
        if (d()) {
          this.d.h();
        } else {
          if (this.e >= 0)
            this.c.getSelectionModel().setSelectionInterval(paramInt, paramInt); 
          return;
        }  
    } 
    this.f.setEnabled(true);
    this.g.setEnabled((this.c.getSelectedRowCount() > 0));
    this.e = paramInt;
    n n = this.c.a(paramInt);
    this.d.b(n);
  }
  
  public void close() {}
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/p/p.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */