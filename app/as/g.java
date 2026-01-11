package as;

import ay.a;
import ay.c;
import ay.p;
import bH.ac;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.bc;
import h.i;
import java.awt.BorderLayout;
import java.awt.Window;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.swing.JDialog;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class g extends JDialog implements p, bc {
  i a;
  
  List b = new ArrayList();
  
  private a c = null;
  
  private List d = new ArrayList();
  
  public g(Window paramWindow, a parama) {
    this(paramWindow, parama, true);
  }
  
  public g(Window paramWindow, a parama, boolean paramBoolean) {
    super(paramWindow, "Remote File Browser");
    setDefaultCloseOperation(2);
    this.c = parama;
    setLayout(new BorderLayout());
    this.a = new i(this);
    add("Center", this.a);
    a.c().a(this);
    for (c c : a.c().d())
      a(c); 
    if (paramBoolean) {
      JMenuBar jMenuBar = new JMenuBar();
      JMenu jMenu = new JMenu(a("Options"));
      jMenuBar.add(jMenu);
      JMenuItem jMenuItem = new JMenuItem(a("Preferences"));
      jMenu.add(jMenuItem);
      jMenuItem.addActionListener(new h(this));
      setJMenuBar(jMenuBar);
    } 
  }
  
  private void a() {
    j j = new j(this);
    j.pack();
    bV.a(this, j);
    j.setVisible(true);
  }
  
  public void a(bc parambc) {
    this.d.add(parambc);
  }
  
  public void a(c paramc) {
    int j = f(paramc);
    if (j < 0) {
      b b = new b(paramc);
      b.a(this.c);
      this.b.add(b);
      this.a.add(b, e(paramc));
    } else {
      this.a.setEnabledAt(j, true);
    } 
  }
  
  private String e(c paramc) {
    String str = "";
    Set set = paramc.b();
    for (String str1 : set) {
      if (str1.equalsIgnoreCase("name")) {
        str = paramc.a(str1) + " - ";
        break;
      } 
    } 
    return str + paramc.c();
  }
  
  public void b(c paramc) {
    int j = f(paramc);
    if (j >= 0)
      this.a.setEnabledAt(j, false); 
  }
  
  private int f(c paramc) {
    for (byte b = 0; b < this.b.size(); b++) {
      if (paramc.c().equals(((b)this.b.get(b)).b().c()))
        return b; 
    } 
    return -1;
  }
  
  public void dispose() {
    if (isVisible()) {
      i.c(i.am, getWidth() + "");
      i.c(i.an, getHeight() + "");
    } 
    close();
    super.dispose();
  }
  
  public void setVisible(boolean paramBoolean) {
    if (isVisible()) {
      i.c(i.am, getWidth() + "");
      i.c(i.an, getHeight() + "");
    } 
    super.setVisible(paramBoolean);
  }
  
  public void close() {
    a.c().b(this);
    for (b b : this.b)
      b.close(); 
    for (bc bc1 : this.d)
      bc1.close(); 
  }
  
  public void c(c paramc) {
    b(paramc);
  }
  
  public void d(c paramc) {
    a(paramc);
  }
  
  private String a(String paramString) {
    return ac.a().a(paramString);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/as/g.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */