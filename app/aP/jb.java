package aP;

import java.awt.Component;
import java.awt.Container;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import n.a;
import n.g;
import n.n;

public class jb implements ChangeListener {
  n a;
  
  Component b = null;
  
  public jb(n paramn) {
    this.a = paramn;
  }
  
  public void stateChanged(ChangeEvent paramChangeEvent) {
    Component component = this.a.getSelectedComponent();
    if (this.b != null && !this.b.equals(component))
      b(this.b); 
    this.b = component;
    a(component);
  }
  
  private void a(Component paramComponent) {
    if (paramComponent instanceof a && !((a)paramComponent).a() && this.a.getTabCount() > 0)
      this.a.setSelectedIndex(0); 
    if (paramComponent instanceof Container) {
      Container container = (Container)paramComponent;
      for (byte b = 0; b < container.getComponentCount(); b++)
        a(container.getComponent(b)); 
    } 
  }
  
  private void b(Component paramComponent) {
    if (paramComponent instanceof g)
      ((g)paramComponent).b(); 
    if (paramComponent instanceof Container) {
      Container container = (Container)paramComponent;
      for (byte b = 0; b < container.getComponentCount(); b++)
        b(container.getComponent(b)); 
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/jb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */