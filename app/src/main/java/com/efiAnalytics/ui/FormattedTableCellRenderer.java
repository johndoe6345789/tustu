package com.efiAnalytics.ui;

import bH.X;
import javax.swing.table.DefaultTableCellRenderer;

class FormattedTableCellRenderer extends DefaultTableCellRenderer {
  public FormattedTableCellRenderer(S paramS) {
    setHorizontalAlignment(0);
  }

  public String getText() {
    String str = super.getText();
    return (str != null) ? X.a(str, this.a.a ? this.a.e.q() : this.a.e.r()) : str;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/ab.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
