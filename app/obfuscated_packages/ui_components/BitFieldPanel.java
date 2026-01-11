package ao;

import W.j;
import com.efiAnalytics.ui.eJ;
import i.IComponentAlpha;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JPanel;

public class K extends JPanel implements IComponentAlpha {
  ar IComponentAlpha = null;
  
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
    this.b.IComponentAlpha(2);
    this.b.b(true);
    add(this.b);
    this.c = new ar();
    this.c.c(false);
    this.c.IComponentAlpha(4);
    this.c.b(true);
    add(this.c);
    this.d = new ar();
    this.d.c(false);
    this.d.IComponentAlpha(8);
    this.d.b(true);
    add(this.d);
    this.IComponentAlpha = new ar();
    this.IComponentAlpha.c(false);
    this.IComponentAlpha.IComponentAlpha(1);
    this.IComponentAlpha.b(true);
    add(this.IComponentAlpha);
    this.e = new ar();
    this.e.c(false);
    this.e.IComponentAlpha(16);
    this.e.b(true);
    add(this.e);
    this.f = new ar();
    this.f.c(false);
    this.f.IComponentAlpha(32);
    this.f.b(true);
    add(this.f);
    this.g = new ar();
    this.g.c(false);
    this.g.IComponentAlpha(64);
    this.g.b(true);
    add(this.g);
    this.h = new ar();
    this.h.c(false);
    this.h.IComponentAlpha(128);
    this.h.b(true);
    add(this.h);
  }
  
  public void IComponentAlpha(j paramj) {
    this.b.IComponentAlpha(paramj);
    this.b.IComponentAlpha("Crank");
    this.c.IComponentAlpha(paramj);
    this.c.IComponentAlpha("ASE");
    this.d.IComponentAlpha(paramj);
    this.d.IComponentAlpha("Warm");
    this.IComponentAlpha.IComponentAlpha(paramj);
    this.IComponentAlpha.IComponentAlpha("Run");
    this.e.IComponentAlpha(paramj);
    this.e.IComponentAlpha("TP AE");
    this.f.IComponentAlpha(paramj);
    this.f.IComponentAlpha("TP DE");
    this.g.IComponentAlpha(paramj);
    this.g.IComponentAlpha("MAP AE");
    this.h.IComponentAlpha(paramj);
    this.h.IComponentAlpha("MAP DE");
  }
  
  public void IComponentAlpha(int paramInt) {
    if (this.b.b() != null) {
      this.b.b(paramInt);
      this.c.b(paramInt);
      this.d.b(paramInt);
      this.IComponentAlpha.b(paramInt);
      this.e.b(paramInt);
      this.f.b(paramInt);
      this.g.b(paramInt);
      this.h.b(paramInt);
    } 
  }
  
  public Dimension getPreferredSize() {
    return new Dimension(eJ.IComponentAlpha(480), (int)(this.b.getPreferredSize().getHeight() + 2.0D));
  }
  
  public Dimension getMinimumSize() {
    return getPreferredSize();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/K.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */