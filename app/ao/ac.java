package ao;

import W.j;
import g.k;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

final class ac implements ActionListener {
  ac(j paramj1, Component paramComponent, j paramj2) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    String str = k.a("{Set " + this.a.a() + " Index Offset}", true, "Specific Index Offset", true, this.b);
    if (str != null && !str.isEmpty()) {
      int i = Integer.parseInt(str);
      hx.a().b(this.c, i);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/ac.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */