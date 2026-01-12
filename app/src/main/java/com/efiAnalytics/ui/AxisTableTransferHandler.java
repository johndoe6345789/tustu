package com.efiAnalytics.ui;

import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import javax.swing.TransferHandler;

class Y extends ac {
  Y(S paramS, w paramw, boolean paramBoolean) {
    super(paramS);
  }

  public boolean canImport(TransferHandler.TransferSupport paramTransferSupport) {
    return paramTransferSupport.isDataFlavorSupported(DataFlavor.stringFlavor);
  }

  public boolean importData(TransferHandler.TransferSupport paramTransferSupport) {
    if (!canImport(paramTransferSupport)) return false;
    try {
      String str =
          (String) paramTransferSupport.getTransferable().getTransferData(DataFlavor.stringFlavor);
      str = str.replace("\n", " ").replace("\t", " ").replace("  ", " ");
      String[] arrayOfString = str.split(" ");
      if (arrayOfString == null
          || arrayOfString.length == 0
          || arrayOfString[0] == null
          || arrayOfString[0].trim().isEmpty()) return false;
      int i = this.b ? this.c.getSelectedRow() : this.c.getSelectedColumn();
      int j = arrayOfString.length + i;
      int k = this.b ? this.c.getRowCount() : this.c.getColumnCount();
      if (j > k) j = k;
      byte b = 0;
      for (int m = i; m < j; m++) {
        String str1 = arrayOfString[b].trim();
        this.c
            .getModel()
            .setValueAt(Double.valueOf(Double.parseDouble(str1)), this.b ? m : 0, this.b ? 0 : m);
        b++;
      }
    } catch (IOException iOException) {
      return false;
    } catch (UnsupportedFlavorException unsupportedFlavorException) {
      return false;
    }
    return true;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/Y.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
