package com.efiAnalytics.ui;

import bH.X;
import java.util.EventObject;
import javax.swing.DefaultCellEditor;

class BinTableCellEditor extends DefaultCellEditor {
  BinTableCellEditor(BinTableView paramBinTableView) {
    super(new NumericTextField());
    NumericTextField numericTextField = (NumericTextField) getComponent();
    numericTextField.setFont(paramBinTableView.getFont());
    numericTextField.setHorizontalAlignment(0);
    numericTextField.addKeyListener(new aC(this, paramBinTableView));
  }

  public boolean shouldSelectCell(EventObject paramEventObject) {
    boolean bool = super.shouldSelectCell(paramEventObject);
    if (bool) a();
    return bool;
  }

  public void a() {
    NumericTextField numericTextField = (NumericTextField) getComponent();
    numericTextField.setText(X.b(numericTextField.getText(), this.a.a));
    numericTextField.selectAll();
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/aB.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
