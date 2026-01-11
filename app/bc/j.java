package bc;

import ae.t;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.swing.JPanel;

public class j extends JPanel implements m {
  HashMap a = new HashMap<>();
  
  List b = new ArrayList();
  
  public j() {
    setLayout(new GridLayout(0, 1));
  }
  
  public void a(List<t> paramList) {
    a();
    for (byte b = 0; b < paramList.size(); b++) {
      a a = new a(paramList.get(b));
      a.a(this);
      add(a);
      this.a.put(((t)paramList.get(b)).a(), a);
    } 
  }
  
  public void a() {
    this.a.clear();
    removeAll();
  }
  
  public void a(m paramm) {
    this.b.add(paramm);
  }
  
  private void b(String paramString, Object paramObject) {
    for (m m1 : this.b)
      m1.a(paramString, paramObject); 
  }
  
  public boolean b() {
    boolean bool = true;
    for (a a : this.a.values()) {
      if (!a.d()) {
        bool = false;
        a.b();
      } 
    } 
    return bool;
  }
  
  public void c() {
    for (a a : this.a.values())
      b(a.getName(), a.a()); 
  }
  
  public void a(String paramString, Object paramObject) {
    b(paramString, paramObject);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bc/j.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */