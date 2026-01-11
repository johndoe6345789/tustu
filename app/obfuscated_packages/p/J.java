package p;

import bH.ab;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.bc;
import com.efiAnalytics.ui.cO;
import com.efiAnalytics.ui.eJ;
import d.e;
import d.m;
import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.Window;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JToolBar;

public class J extends JPanel implements bc {
  ab a = null;
  
  private List h = new ArrayList();
  
  B b;
  
  R c;
  
  D d;
  
  int e = -1;
  
  JButton f;
  
  JButton g;
  
  public J(B paramB, ab paramab) {
    this.a = paramab;
    this.c = new R(paramab);
    this.b = paramB;
    setBorder(BorderFactory.createEmptyBorder(eJ.a(10), eJ.a(10), eJ.a(10), eJ.a(10)));
    setLayout(new BorderLayout());
    for (m m : paramB.b())
      this.c.a(m); 
    this.c.getSelectionModel().addListSelectionListener(new Q(this, null));
    JScrollPane jScrollPane = new JScrollPane(this.c);
    this.c.setFillsViewportHeight(true);
    jScrollPane.setBorder(BorderFactory.createLoweredBevelBorder());
    jScrollPane.setPreferredSize(eJ.a(320, 180));
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new BorderLayout());
    jPanel.setBorder(BorderFactory.createTitledBorder(a("User Actions")));
    jPanel.add("Center", jScrollPane);
    add("Center", jPanel);
    JToolBar jToolBar = new JToolBar();
    jToolBar.setFloatable(false);
    Image image = cO.a().a(cO.d, this, 24);
    image = eJ.a(image);
    ImageIcon imageIcon = new ImageIcon(image);
    JButton jButton = new JButton(a("New User Action"), imageIcon);
    jButton.addActionListener(new K(this));
    jToolBar.add(jButton);
    image = cO.a().a(cO.e, this, 24);
    image = eJ.a(image);
    imageIcon = new ImageIcon(image);
    this.f = new JButton(a("Delete User Action"), imageIcon);
    this.f.addActionListener(new L(this));
    jToolBar.add(this.f);
    this.f.setEnabled(false);
    image = cO.a().a(cO.A, this, 24);
    image = eJ.a(image);
    imageIcon = new ImageIcon(image);
    this.g = new JButton(a("Test User Action"), imageIcon);
    this.g.addActionListener(new M(this));
    jToolBar.add(this.g);
    this.g.setEnabled(false);
    jPanel.add("North", jToolBar);
    this.d = new D(paramab);
    this.d.setBorder(BorderFactory.createTitledBorder(a("User Action Editor")));
    this.d.a(new N(this));
    add("South", this.d);
  }
  
  private JMenuBar a() {
    JMenuBar jMenuBar = new JMenuBar();
    JMenu jMenu = new JMenu(a("File"));
    jMenuBar.add(jMenu);
    JMenuItem jMenuItem1 = new JMenuItem(a("Export User Actions"));
    jMenuItem1.addActionListener(new O(this));
    jMenu.add(jMenuItem1);
    JMenuItem jMenuItem2 = new JMenuItem(a("Import User Actions"));
    jMenuItem2.addActionListener(new P(this));
    jMenu.add(jMenuItem2);
    return jMenuBar;
  }
  
  private void b() {
    m m = new m();
    this.c.getSelectionModel().clearSelection();
    this.d.a(m);
  }
  
  private void c() {
    if (this.c.getSelectedRow() >= 0) {
      m m = this.c.a(this.c.getSelectedRow());
      try {
        m.a(new Properties());
      } catch (e e) {
        bV.d(a(e.getMessage()), this);
      } 
    } 
  }
  
  private boolean d() {
    m m = this.d.b();
    if (m == null) {
      bV.d(a("Editor returned no Action."), this);
      return false;
    } 
    if (this.d.e() && this.b.b(m.a()) != null) {
      String str = a("A User Action with the name already exists.") + "\n" + a("If you save this Action with this name it will replace the existing Action.") + "\n\n" + a("Are you sure you wish to replace the existing Action?");
      if (!bV.a(str, this, true))
        return false; 
    } 
    try {
      m.k();
    } catch (e e) {
      bV.d(a(e.getMessage()), this);
      return false;
    } 
    this.b.a(m);
    this.d.d();
    this.c.a(m);
    this.c.a();
    m.n();
    return true;
  }
  
  private void e() {
    m m = this.c.b();
    if (m != null) {
      this.c.a(m.a());
      this.b.c(m.a());
      this.c.a();
    } 
  }
  
  private String a(String paramString) {
    return (this.a != null) ? this.a.a(paramString) : paramString;
  }
  
  private void f() {
    this.b.d();
  }
  
  private void g() {
    this.b.c();
  }
  
  private void a(int paramInt) {
    if (this.d.c()) {
      String str = a("The User Action currently being edited has not been saved.") + "\n" + a("Would you like to save it now?");
      if (bV.a(str, this.d, true))
        if (d()) {
          this.d.d();
        } else {
          if (this.e >= 0)
            this.c.getSelectionModel().setSelectionInterval(paramInt, paramInt); 
          return;
        }  
    } 
    this.f.setEnabled(true);
    this.g.setEnabled((this.c.getSelectedRowCount() > 0));
    this.e = paramInt;
    m m = this.c.a(paramInt);
    this.d.b(m);
  }
  
  public void a(Window paramWindow) {
    JDialog jDialog = bV.b(this, paramWindow, a("User Action Editor"), this);
    jDialog.add("North", a());
    jDialog.pack();
    bV.a(paramWindow, jDialog);
    jDialog.setVisible(true);
  }
  
  public void close() {}
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/p/J.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */