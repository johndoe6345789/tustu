package ao;

import W.j;
import com.efiAnalytics.ui.eJ;
import i.a;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JPanel;

public class K extends JPanel implements a {
  ar a = null;
  
  ar b = null;
  
  ar c = null;
  
  ar d = null;
  
  ar e = null;
  
  ar f = null;
  
  ar g = null;
  
  ar h = null;
  
  j i = null;
  
  public K() {
    setLayout(new GridLayout(1, 0, 2, 2));
    this.b = new ar();
    this.b.c(false);
    this.b.a(2);
    this.b.b(true);
    add(this.b);
    this.c = new ar();
    this.c.c(false);
    this.c.a(4);
    this.c.b(true);
    add(this.c);
    this.d = new ar();
    this.d.c(false);
    this.d.a(8);
    this.d.b(true);
    add(this.d);
    this.a = new ar();
    this.a.c(false);
    this.a.a(1);
    this.a.b(true);
    add(this.a);
    this.e = new ar();
    this.e.c(false);
    this.e.a(16);
    this.e.b(true);
    add(this.e);
    this.f = new ar();
    this.f.c(false);
    this.f.a(32);
    this.f.b(true);
    add(this.f);
    this.g = new ar();
    this.g.c(false);
    this.g.a(64);
    this.g.b(true);
    add(this.g);
    this.h = new ar();
    this.h.c(false);
    this.h.a(128);
    this.h.b(true);
    add(this.h);
  }
  
  public void a(j paramj) {
    this.b.a(paramj);
    this.b.a("Crank");
    this.c.a(paramj);
    this.c.a("ASE");
    this.d.a(paramj);
    this.d.a("Warm");
    this.a.a(paramj);
    this.a.a("Run");
    this.e.a(paramj);
    this.e.a("TP AE");
    this.f.a(paramj);
    this.f.a("TP DE");
    this.g.a(paramj);
    this.g.a("MAP AE");
    this.h.a(paramj);
    this.h.a("MAP DE");
  }
  
  public void a(int paramInt) {
    if (this.b.b() != null) {
      this.b.b(paramInt);
      this.c.b(paramInt);
      this.d.b(paramInt);
      this.a.b(paramInt);
      this.e.b(paramInt);
      this.f.b(paramInt);
      this.g.b(paramInt);
      this.h.b(paramInt);
    } 
  }
  
  public Dimension getPreferredSize() {
    return new Dimension(eJ.a(480), (int)(this.b.getPreferredSize().getHeight() + 2.0D));
  }
  
  public Dimension getMinimumSize() {
    return getPreferredSize();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/K.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */