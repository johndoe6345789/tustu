package aP;

import W.U;
import aE.a;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.File;
import java.util.List;
import javax.swing.TransferHandler;

final class dx extends TransferHandler {
  dx(dl paramdl) {}
  
  public boolean canImport(TransferHandler.TransferSupport paramTransferSupport) {
    for (DataFlavor dataFlavor : paramTransferSupport.getDataFlavors()) {
      if (dataFlavor.isFlavorJavaFileListType()) {
        if (a.A() != null)
          return true; 
        try {
          List<File> list = (List)paramTransferSupport.getTransferable().getTransferData(DataFlavor.javaFileListFlavor);
          return (list.size() > 0 && !U.c(list.get(0)));
        } catch (Exception exception) {
          return true;
        } 
      } 
    } 
    return false;
  }
  
  public boolean importData(TransferHandler.TransferSupport paramTransferSupport) {
    if (!canImport(paramTransferSupport))
      return false; 
    try {
      List<File> list = (List)paramTransferSupport.getTransferable().getTransferData(DataFlavor.javaFileListFlavor);
      if (list != null && list.size() > 0)
        f.a().a(dd.a().c(), list.get(0)); 
    } catch (UnsupportedFlavorException|java.io.IOException unsupportedFlavorException) {
      return false;
    } 
    return true;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/dx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */