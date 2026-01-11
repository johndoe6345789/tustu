package br;

import java.awt.Component;
import java.awt.Container;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import n.a;

class M implements ChangeListener {
  M(K paramK) {}
  
  public void stateChanged(ChangeEvent paramChangeEvent) {
    Component component = this.a.getSelectedComponent();
    a(component);
  }
  
  private void a(Component paramComponent) {
    if (paramComponent instanceof a)
      ((a)paramComponent).a(); 
    if (paramComponent instanceof Container) {
      Container container = (Container)paramComponent;
      for (byte b = 0; b < container.getComponentCount(); b++)
        a(container.getComponent(b)); 
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/br/M.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */