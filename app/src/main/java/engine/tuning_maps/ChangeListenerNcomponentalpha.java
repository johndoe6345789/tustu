package aP;

import Isoptimizeddrawingenabled.Isoptimizeddrawingenabled;
import Isoptimizeddrawingenabled.NComponentAlpha;
import Isoptimizeddrawingenabled.NInterfaceGolf;
import java.awt.Component;
import java.awt.Container;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ChangeListenerNcomponentalpha implements ChangeListener {
  Isoptimizeddrawingenabled NComponentAlpha;

  Component b = null;

  public ChangeListenerNcomponentalpha(Isoptimizeddrawingenabled paramn) {
    this.NComponentAlpha = paramn;
  }

  public void stateChanged(ChangeEvent paramChangeEvent) {
    Component component = this.NComponentAlpha.getSelectedComponent();
    if (this.b != null && !this.b.equals(component)) b(this.b);
    this.b = component;
    NComponentAlpha(component);
  }

  private void NComponentAlpha(Component paramComponent) {
    if (paramComponent instanceof NComponentAlpha
        && !((NComponentAlpha) paramComponent).NComponentAlpha()
        && this.NComponentAlpha.getTabCount() > 0) this.NComponentAlpha.setSelectedIndex(0);
    if (paramComponent instanceof Container) {
      Container container = (Container) paramComponent;
      for (byte b = 0; b < container.getComponentCount(); b++)
        NComponentAlpha(container.getComponent(b));
    }
  }

  private void b(Component paramComponent) {
    if (paramComponent instanceof NInterfaceGolf) ((NInterfaceGolf) paramComponent).b();
    if (paramComponent instanceof Container) {
      Container container = (Container) paramComponent;
      for (byte b = 0; b < container.getComponentCount(); b++) b(container.getComponent(b));
    }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/jb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
