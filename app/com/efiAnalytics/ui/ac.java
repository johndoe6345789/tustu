package com.efiAnalytics.ui;

import java.awt.datatransfer.Transferable;
import javax.swing.JComponent;
import javax.swing.JTable;
import javax.swing.TransferHandler;
import javax.swing.plaf.UIResource;

class ac extends TransferHandler implements UIResource {
  ac(S paramS) {}
  
  protected Transferable createTransferable(JComponent paramJComponent) {
    if (paramJComponent instanceof JTable) {
      int[] arrayOfInt1;
      int[] arrayOfInt2;
      JTable jTable = (JTable)paramJComponent;
      if (!jTable.getRowSelectionAllowed() && !jTable.getColumnSelectionAllowed())
        return null; 
      if (!jTable.getRowSelectionAllowed()) {
        int i = jTable.getRowCount();
        arrayOfInt1 = new int[i];
        for (byte b1 = 0; b1 < i; b1++)
          arrayOfInt1[b1] = b1; 
      } else {
        arrayOfInt1 = jTable.getSelectedRows();
      } 
      if (!jTable.getColumnSelectionAllowed()) {
        int i = jTable.getColumnCount();
        arrayOfInt2 = new int[i];
        for (byte b1 = 0; b1 < i; b1++)
          arrayOfInt2[b1] = b1; 
      } else {
        arrayOfInt2 = jTable.getSelectedColumns();
      } 
      if (arrayOfInt1 == null || arrayOfInt2 == null || arrayOfInt1.length == 0 || arrayOfInt2.length == 0)
        return null; 
      StringBuilder stringBuilder = new StringBuilder();
      for (byte b = 0; b < arrayOfInt1.length; b++) {
        for (byte b1 = 0; b1 < arrayOfInt2.length; b1++) {
          Object object = jTable.getValueAt(arrayOfInt1[b], arrayOfInt2[b1]);
          String str = (object == null) ? "" : object.toString();
          stringBuilder.append(str).append("\t");
        } 
        stringBuilder.deleteCharAt(stringBuilder.length() - 1).append("\n");
      } 
      stringBuilder.deleteCharAt(stringBuilder.length() - 1);
      return new ad(this, stringBuilder);
    } 
    return null;
  }
  
  public int getSourceActions(JComponent paramJComponent) {
    return 1;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/ac.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */