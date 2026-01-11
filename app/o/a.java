package o;

import com.efiAnalytics.apps.ts.dashboard.s;
import com.efiAnalytics.ui.cY;
import d.b;
import d.c;
import d.g;
import d.i;
import d.j;
import d.k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Properties;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class a extends JMenu {
  List a = new ArrayList();
  
  ArrayList b;
  
  c c = new g();
  
  public a(String paramString, ArrayList paramArrayList) {
    setText(paramString);
    this.b = paramArrayList;
    a();
  }
  
  private void a() {
    boolean bool = true;
    if (bool) {
      e e = new e(this, this.c, null);
      d d = new d(this, this.c);
      e.addActionListener(d);
      add((JMenuItem)e);
      addSeparator();
    } 
    b b = new b(this);
    List<?> list = g.a().a(b);
    Collections.sort(list, new c(this));
    for (c c1 : list) {
      if (c1 instanceof cY) {
        if (c1.d()) {
          cY cY = (cY)c1;
          d d1 = new d(this, c1);
          List list1 = cY.a(d1);
          for (JMenu jMenu : list1)
            add(jMenu); 
        } 
        continue;
      } 
      if (c1.f()) {
        e e1 = new e(this, c1, c1.e());
        d d1 = new d(this, c1);
        e1.addActionListener(d1);
        add((JMenuItem)e1);
        continue;
      } 
      e e = new e(this, c1, null);
      d d = new d(this, c1);
      e.addActionListener(d);
      add((JMenuItem)e);
    } 
  }
  
  public String a(c paramc) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(paramc.a());
    k k = paramc.e();
    if (k != null && !k.isEmpty()) {
      stringBuilder.append("?");
      for (i i : k) {
        if (i.d() == null)
          for (s s : this.b) {
            if (s instanceof j) {
              j j = (j)s;
              String str = j.getParameterValue(i.c());
              if (str != null && !str.isEmpty())
                i.b(str); 
            } 
          }  
      } 
      Properties properties = k.a();
      stringBuilder.append(b.a(properties));
    } 
    return stringBuilder.toString();
  }
  
  public void a(f paramf) {
    if (!this.a.contains(paramf))
      this.a.add(paramf); 
  }
  
  private void a(String paramString) {
    for (f f : this.a)
      f.a(paramString); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/o/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */