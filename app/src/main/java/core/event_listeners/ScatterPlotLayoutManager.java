package ao;

import com.efiAnalytics.ui.eJ;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;

class gj implements LayoutManager {
  Dimension a = new Dimension(400, 400);

  gj(fK paramfK) {}

  public void addLayoutComponent(String paramString, Component paramComponent) {}

  public void layoutContainer(Container paramContainer) {
    this.b.t.setBounds(this.b.i().getWidth() - eJ.a(35), 0, eJ.a(20), eJ.a(20));
    this.b.y.setBounds(0, 0, eJ.a(20), eJ.a(20));
    this.b.v.setBounds(
        this.b.i().getWidth() - eJ.a(35), this.b.i().getHeight() - eJ.a(35), eJ.a(24), eJ.a(24));
  }

  public Dimension minimumLayoutSize(Container paramContainer) {
    return this.a;
  }

  public Dimension preferredLayoutSize(Container paramContainer) {
    return this.a;
  }

  public void removeLayoutComponent(Component paramComponent) {}
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/gj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
