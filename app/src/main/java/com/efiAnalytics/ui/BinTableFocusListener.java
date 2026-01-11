package com.efiAnalytics.ui;

import bH.I;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.table.TableCellEditor;

class BinTableFocusListener implements FocusListener {
  BinTableFocusListener(BinTableView paramBinTableView) {}
  
  public void focusGained(FocusEvent paramFocusEvent) {}
  
  public void focusLost(FocusEvent paramFocusEvent) {
    TableCellEditor tableCellEditor = this.a.getCellEditor();
    if (tableCellEditor != null)
      if (I.a(tableCellEditor.getCellEditorValue().toString())) {
        tableCellEditor.stopCellEditing();
      } else {
        tableCellEditor.cancelCellEditing();
      }  
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/ay.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */