package bc;

import ae.c;
import ae.q;
import ae.s;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import s.g;

public class k extends JPanel {
  q a = null;
  
  ArrayList b = new ArrayList();
  
  public k() {
    setBorder(BorderFactory.createTitledBorder(g.b("Firmware Loader Options")));
    setLayout(new BoxLayout(this, 1));
  }
  
  public void a(q paramq, ae.k paramk, boolean paramBoolean) {
    List list;
    this.a = paramq;
    b();
    if (paramBoolean) {
      List list1 = paramq.c();
      list = c.a(list1, paramk);
    } else {
      List list1 = paramq.d();
      list = c.b(list1, paramk);
    } 
    for (s s : list) {
      j j = new j();
      if (paramBoolean) {
        j.a(s.a(paramk));
      } else {
        j.a(s.b(paramk));
      } 
      l l = new l(this, s);
      j.a(l);
      this.b.add(j);
      add(j);
    } 
  }
  
  private void b() {
    removeAll();
    this.b.clear();
  }
  
  public boolean a() {
    for (j j : this.b) {
      if (!j.b())
        return false; 
    } 
    for (j j : this.b)
      j.c(); 
    return true;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bc/k.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */