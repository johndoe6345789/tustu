package business.box_extensions;

import bH.ab;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.bc;
import com.efiAnalytics.ui.eJ;
import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.Window;
import java.util.Iterator;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.JToolBar;

public JPanelExtensionInBxPackagelass JPanelExtensionInBxPackage extends JPanel implements l, bc {
  ab a = null;
  
  o b = null;
  
  m c = null;
  
  b d;
  
  int e = -1;
  
  JButton f;
  
  public JPanelExtensionInBxPackage(b paramb, ab paramab) {
    this.a = paramab;
    this.d = paramb;
    paramb.a(this);
    setBorder(BorderFactory.createEmptyBorder(eJ.a(10), eJ.a(10), eJ.a(10), eJ.a(10)));
    setLayout(new BorderLayout());
    this.b = new o(paramab);
    Iterator<j> iterator = paramb.d().iterator();
    while (iterator.hasNext())
      this.b.a(iterator.next()); 
    this.b.getSelectionModel().addListSelectionListener(new i(this, null));
    JScrollPane jScrollPane = new JScrollPane(this.b);
    this.b.setFillsViewportHeight(true);
    jScrollPane.setBorder(BorderFactory.createLoweredBevelBorder());
    jScrollPane.setPreferredSize(eJ.a(320, 180));
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new BorderLayout());
    jPanel.setBorder(BorderFactory.createTitledBorder(c("Data Filters")));
    jPanel.add("Center", jScrollPane);
    add("Center", jPanel);
    JToolBar jToolBar = new JToolBar();
    jToolBar.setFloatable(false);
    Image image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("add24.png"));
    image = eJ.a(image);
    ImageIcon imageIcon = new ImageIcon(image);
    JButton jButton = new JButton(c("New Data Filter"), imageIcon);
    jButton.addActionListener(new d(this));
    jToolBar.add(jButton);
    image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("delete24.png"));
    image = eJ.a(image);
    imageIcon = new ImageIcon(image);
    this.f = new JButton(c("Delete Data Filter"), imageIcon);
    this.f.addActionListener(new e(this));
    jToolBar.add(this.f);
    this.f.setEnabled(false);
    jPanel.add("North", jToolBar);
    this.c = new m(paramab);
    this.c.setBorder(BorderFactory.createTitledBorder(c("Filter Editor")));
    this.c.a(new f(this));
    add("South", this.c);
  }
  
  private JMenuBar e() {
    JMenuBar jMenuBar = new JMenuBar();
    JMenu jMenu = new JMenu("File");
    jMenuBar.add(jMenu);
    JMenuItem jMenuItem1 = new JMenuItem("Export Filters");
    jMenuItem1.addActionListener(new g(this));
    jMenu.add(jMenuItem1);
    JMenuItem jMenuItem2 = new JMenuItem("Import Filters");
    jMenuItem2.addActionListener(new h(this));
    jMenu.add(jMenuItem2);
    return jMenuBar;
  }
  
  private void f() {
    this.d.c();
  }
  
  private void g() {
    this.d.b();
  }
  
  private void a(int paramInt) {
    if (this.c.d()) {
      String str = c("The Filter currently being edited has not been saved.") + "\n" + c("Would you like to save it now?");
      if (bV.a(str, this.c, true))
        if (a()) {
          this.c.b();
        } else {
          if (this.e >= 0)
            this.b.getSelectionModel().setSelectionInterval(paramInt, paramInt); 
          return;
        }  
    } 
    this.f.setEnabled(true);
    this.e = paramInt;
    j j = this.b.a(paramInt);
    this.c.a(j);
  }
  
  public boolean a() {
    j j = this.c.a();
    try {
      if (this.d.a(j)) {
        this.d.b(j);
        this.c.b();
        return true;
      } 
      return false;
    } catch (x x) {
      String str = c(x.getLocalizedMessage());
      bV.d(str, this);
      return false;
    } 
  }
  
  public void b() {
    j j = new j();
    this.c.b(j);
  }
  
  public void b(String paramString) {
    this.d.a(paramString);
  }
  
  public void c() {
    j j = this.c.a();
    if (this.c != null) {
      b(j.a());
      this.f.setEnabled(false);
    } 
  }
  
  private String c(String paramString) {
    return (this.a != null) ? this.a.a(paramString) : paramString;
  }
  
  public void a(Window paramWindow) {
    JDialog jDialog = bV.b(this, paramWindow, c("Data Filter Editor"), this);
    jDialog.add("North", e());
    jDialog.pack();
    bV.a(paramWindow, jDialog);
    jDialog.setVisible(true);
  }
  
  public void a(k paramk) {
    this.c.a(paramk);
  }
  
  public void close() {
    if (this.c.d())
      a(); 
  }
  
  public void a(j paramj) {
    this.b.b(paramj);
  }
  
  public void a(String paramString) {
    this.b.a(paramString);
  }
  
  public void b(j paramj) {
    this.b.b(paramj);
  }
  
  public JTextPane d() {
    return this.c.e();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bx/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */