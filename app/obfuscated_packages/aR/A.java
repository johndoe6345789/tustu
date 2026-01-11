package aR;

import G.R;
import G.T;
import G.bM;
import V.a;
import V.g;
import aE.a;
import br.J;
import br.f;
import com.efiAnalytics.ui.cY;
import d.c;
import d.e;
import d.i;
import d.k;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import r.i;
import s.g;

public class A implements cY, c {
  public static String a = "toggleAutoTune";
  
  public static String b = "tableName";
  
  k c = new k();
  
  String d = null;
  
  public A() {
    i i = new i(b, "");
    i.a(0);
    ArrayList<String> arrayList = new ArrayList();
    for (String str : f.a().c())
      arrayList.add(str); 
    i.a(arrayList);
    i.c("This is the name of the Table in which you wish to toggle Auto Tune active state. If autotune is running, it will stop it, if not running will start it on this table.");
    this.c.a(i);
    h();
  }
  
  private void h() {
    if (T.a().c() == null) {
      this.d = null;
    } else {
      this.d = T.a().c().c();
    } 
  }
  
  public String a() {
    return a;
  }
  
  public String b() {
    return g.b("Toggle Auto Tune");
  }
  
  public String c() {
    return "Settings Dialogs";
  }
  
  public boolean d() {
    return (T.a().c() != null && a.A() != null);
  }
  
  public void a(Properties paramProperties) {
    String str = paramProperties.getProperty(b);
    if (str == null)
      throw new e("Table name is required."); 
    try {
      f.a().a(str);
    } catch (a a) {
      throw new e(a.getLocalizedMessage());
    } 
  }
  
  public void b(Properties paramProperties) {
    String str = paramProperties.getProperty(b);
    if (str == null)
      throw new e("Table name is required."); 
    List list = j();
    if (!list.contains(str) && i.a().a("poij  fdsz poi9ure895 ms7("))
      throw new e("Invalid Table Index: " + str); 
  }
  
  public k e() {
    if (this.c.isEmpty() || this.d == null || (i() != null && !this.d.equals(i()))) {
      List list = j();
      i i = new i(b, "");
      ArrayList<String> arrayList = new ArrayList();
      for (String str : list)
        arrayList.add(str); 
      i.a(arrayList);
      this.c.a(i);
      this.d = i();
    } 
    return this.c;
  }
  
  private String i() {
    R r = T.a().c();
    return (r == null) ? null : r.c();
  }
  
  public boolean f() {
    return true;
  }
  
  public boolean g() {
    return true;
  }
  
  public List a(ActionListener paramActionListener) {
    ArrayList<JMenu> arrayList = new ArrayList();
    JMenu jMenu = new JMenu(b());
    arrayList.add(jMenu);
    B b = new B(this, paramActionListener);
    List list = j();
    for (String str : list) {
      JMenuItem jMenuItem = new JMenuItem(bM.c(T.a().c(), str));
      jMenuItem.setActionCommand(str);
      jMenuItem.addActionListener(b);
      jMenu.add(jMenuItem);
    } 
    return arrayList;
  }
  
  private List j() {
    try {
      return J.a().a(T.a().c());
    } catch (g g) {
      Logger.getLogger(A.class.getName()).log(Level.SEVERE, (String)null, (Throwable)g);
      return new ArrayList();
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aR/A.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */