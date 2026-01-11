package o;

import bA.e;
import d.c;
import d.k;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import s.g;

class e extends e implements ActionListener {
  c a;
  
  k b;
  
  public e(a parama, c paramc, k paramk) {
    this.a = paramc;
    this.b = paramk;
    String str = g.b(paramc.b());
    setText(str);
  }
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    a.a(this.c, this.c.a(this.a));
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/o/e.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */