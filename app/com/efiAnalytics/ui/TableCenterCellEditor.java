package com.efiAnalytics.ui;

import java.awt.Component;
import javax.swing.DefaultCellEditor;
import javax.swing.JTable;

class TableCenterCellEditor extends DefaultCellEditor {
  TableCenterCellEditor(S paramS) {
    super(new do());
    do do = (do)getComponent();
    do.setHorizontalAlignment(0);
  }
  
  public Component getTableCellEditorComponent(JTable paramJTable, Object paramObject, boolean paramBoolean, int paramInt1, int paramInt2) {
    do do = (do)getComponent();
    do.setFont(this.a.getFont());
    do.setText(paramJTable.getModel().getValueAt(paramInt1, paramInt2).toString());
    return do;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/aa.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */