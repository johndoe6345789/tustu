package com.efiAnalytics.ui;

import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;

class ScaledTableModelListener implements TableModelListener {
  ScaledTableModelListener(ScaledTableModel paramec) {}
  
  public void tableChanged(TableModelEvent paramTableModelEvent) {
    int i = paramTableModelEvent.getColumn();
    for (int j = paramTableModelEvent.getFirstRow(); j <= paramTableModelEvent.getLastRow(); j++) {
      if (i >= 0 && j >= 0)
        this.a.setValueAt(ec.a(this.a).getValueAt(j, i), j, i); 
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/ed.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */