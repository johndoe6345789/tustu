package com.efiAnalytics.ui;

import java.awt.Component;
import java.awt.event.FocusEvent;
import javax.swing.table.TableCellEditor;

class X implements Runnable {
  X(W paramW, FocusEvent paramFocusEvent) {}
  
  public void run() {
    TableCellEditor tableCellEditor = this.b.b.getCellEditor();
    if (tableCellEditor != null)
      tableCellEditor.stopCellEditing(); 
    Component component = this.a.getOppositeComponent();
    if (this.b.b.d) {
      this.b.b.d = false;
    } else if (!this.b.b.equals(component)) {
      this.b.b.clearSelection();
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/X.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */