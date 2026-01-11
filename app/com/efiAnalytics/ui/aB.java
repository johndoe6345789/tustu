package com.efiAnalytics.ui;

import bH.X;
import java.util.EventObject;
import javax.swing.DefaultCellEditor;

class aB extends DefaultCellEditor {
  aB(BinTableView paramBinTableView) {
    super(new do());
    do do = (do)getComponent();
    do.setFont(paramBinTableView.getFont());
    do.setHorizontalAlignment(0);
    do.addKeyListener(new aC(this, paramBinTableView));
  }
  
  public boolean shouldSelectCell(EventObject paramEventObject) {
    boolean bool = super.shouldSelectCell(paramEventObject);
    if (bool)
      a(); 
    return bool;
  }
  
  public void a() {
    do do = (do)getComponent();
    do.setText(X.b(do.getText(), this.a.a));
    do.selectAll();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/aB.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */