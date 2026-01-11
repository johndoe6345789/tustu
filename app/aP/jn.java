package aP;

import bH.I;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.table.TableCellEditor;

class jn implements FocusListener {
  jn(jj paramjj) {}
  
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


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/jn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */