package business.binding_generators;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class ListSelectionListenerInBgPackage implements ListSelectionListener {
  p(o paramo) {}
  
  public void valueChanged(ListSelectionEvent paramListSelectionEvent) {
    if (!paramListSelectionEvent.getValueIsAdjusting())
      o.a(this.a); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bg/p.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */