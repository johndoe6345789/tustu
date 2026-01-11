package aR;

import G.G;
import G.R;
import G.T;
import G.m;
import bH.D;
import com.efiAnalytics.ui.cY;
import d.c;
import d.e;
import d.i;
import d.k;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Properties;
import javax.swing.JMenu;
import s.g;

public class b implements cY, c {
  k a = new k();
  
  public String a() {
    return "sendControllerCommand";
  }
  
  public String b() {
    return "Send Controller Command";
  }
  
  public String c() {
    return "Settings Dialogs";
  }
  
  public boolean d() {
    return (T.a().c() != null && T.a().c().O().b());
  }
  
  public void a(Properties paramProperties) {
    R r;
    String str1 = paramProperties.getProperty("ecuConfig");
    if (str1 == null || str1.isEmpty()) {
      r = T.a().c();
    } else {
      r = T.a().c(str1);
    } 
    if (r == null) {
      D.a("Failed to send Controller command as the EcuConfiguration name was not found. Name: " + str1);
      throw new e("EcuConfiguration not found with the provided name.");
    } 
    String str2 = paramProperties.getProperty("commandName");
    if (str2 == null || str2.isEmpty())
      throw new e("Missing required parameter commandName"); 
    List<m> list = m.b(r.O(), str2);
    m m = null;
    if (list.size() > 1) {
      m = m.a(r.O(), list);
    } else if (list.size() == 1) {
      m = list.get(0);
    } else {
      throw new e("Command " + str2 + " not found in current configuration.");
    } 
    r.C().b(m);
  }
  
  public void b(Properties paramProperties) {
    R r;
    String str1 = paramProperties.getProperty("ecuConfig");
    if (str1 == null || str1.isEmpty()) {
      r = T.a().c();
    } else {
      r = T.a().c(str1);
    } 
    if (r == null) {
      D.a("Failed to send Controller command as the EcuConfiguration name was not found. Name: " + str1);
      throw new e("EcuConfiguration not found with the provided name.");
    } 
    String str2 = paramProperties.getProperty("commandName");
    if (str2 == null || str2.isEmpty())
      throw new e("Missing required parameter commandName"); 
  }
  
  public k e() {
    R r = T.a().c();
    this.a.clear();
    List list = r.O().d();
    ArrayList<Comparable> arrayList = new ArrayList();
    arrayList.addAll(list);
    Collections.sort(arrayList);
    i i = new i("commandName", "");
    i.a(0);
    i.a(arrayList);
    i.c("These are Controller Commands defined and implemented by the firmware developers. Each command will trigger the ECU to perform a specific function. Use CAUTION!!! Some commands are intended to for use in a specific order or sequence. Insure you understand what the command does and how it works.");
    this.a.a(i);
    return this.a;
  }
  
  public boolean f() {
    return true;
  }
  
  public List a(ActionListener paramActionListener) {
    ArrayList<JMenu> arrayList = new ArrayList();
    String str = T.a().c().c();
    d d = new d(this, str, paramActionListener);
    JMenu jMenu = new JMenu(g.b("Send Controller Command"));
    for (String str1 : T.a().d()) {
      boolean bool = str1.equals(str);
      String str2 = bool ? "" : (str + " - ");
      R r = T.a().c(str1);
      if (r.O().b())
        for (G g : r.O().c()) {
          String str3 = str2 + g.b();
          c c1 = new c(this, str3, str1);
          jMenu.add(c1);
          c1.addActionListener(d);
        }  
    } 
    arrayList.add(jMenu);
    return arrayList;
  }
  
  public boolean g() {
    return true;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aR/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */