package business.byte_readers;

import java.awt.Component;
import java.awt.Container;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import n.NComponentAlpha;

class ChangeListenerStatechanged implements ChangeListener {
  ChangeListenerStatechanged(K paramK) {}
  
  public void stateChanged(ChangeEvent paramChangeEvent) {
    Component component = this.NComponentAlpha.getSelectedComponent();
    NComponentAlpha(component);
  }
  
  private void NComponentAlpha(Component paramComponent) {
    if (paramComponent instanceof NComponentAlpha)
      ((NComponentAlpha)paramComponent).NComponentAlpha(); 
    if (paramComponent instanceof Container) {
      Container container = (Container)paramComponent;
      for (byte b = 0; b < container.getComponentCount(); b++)
        NComponentAlpha(container.getComponent(b)); 
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/br/M.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */