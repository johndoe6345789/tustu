package com.efiAnalytics.ui;

import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;

class StringTransferable implements Transferable {
  StringTransferable(TableTransferHandler paramac, StringBuilder paramStringBuilder) {}

  public DataFlavor[] getTransferDataFlavors() {
    return new DataFlavor[] {DataFlavor.stringFlavor};
  }

  public boolean isDataFlavorSupported(DataFlavor paramDataFlavor) {
    return DataFlavor.stringFlavor.equals(paramDataFlavor);
  }

  public Object getTransferData(DataFlavor paramDataFlavor) {
    if (!DataFlavor.stringFlavor.equals(paramDataFlavor))
      throw new UnsupportedOperationException("Not supported yet.");
    return this.a.toString();
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/ad.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
