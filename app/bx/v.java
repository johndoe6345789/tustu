package bx;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class v implements ListSelectionListener {
  private v(t paramt) {}
  
  public void valueChanged(ListSelectionEvent paramListSelectionEvent) {
    if (paramListSelectionEvent.getValueIsAdjusting())
      return; 
    this.a.a(this.a.getSelectedRow());
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bx/v.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */