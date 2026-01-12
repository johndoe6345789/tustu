package com.efiAnalytics.ui;

import java.awt.Component;
import javax.swing.DefaultCellEditor;
import javax.swing.JTable;

class TableCenterCellEditor extends DefaultCellEditor {
  TableCenterCellEditor(S paramS) {
    super(new NumericTextField());
    NumericTextField numericTextField = (NumericTextField) getComponent();
    numericTextField.setHorizontalAlignment(0);
  }

  public Component getTableCellEditorComponent(
      JTable paramJTable, Object paramObject, boolean paramBoolean, int paramInt1, int paramInt2) {
    NumericTextField numericTextField = (NumericTextField) getComponent();
    numericTextField.setFont(this.a.getFont());
    numericTextField.setText(paramJTable.getModel().getValueAt(paramInt1, paramInt2).toString());
    return numericTextField;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/aa.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
