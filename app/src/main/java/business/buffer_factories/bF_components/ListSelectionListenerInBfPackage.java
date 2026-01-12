package business.buffer_factories.bF_components;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class ListSelectionListenerInBfPackage implements ListSelectionListener {
  ListSelectionListenerInBfPackage(v paramv) {}

  public void valueChanged(ListSelectionEvent paramListSelectionEvent) {
    this.a.c.getTableHeader().repaint();
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bF/w.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
