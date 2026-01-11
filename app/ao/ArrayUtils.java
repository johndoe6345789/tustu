package ao;

import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.File;
import java.util.List;
import javax.swing.TransferHandler;

final class eb extends TransferHandler {
  eb(cd paramcd) {}
  
  public boolean canImport(TransferHandler.TransferSupport paramTransferSupport) {
    for (DataFlavor dataFlavor : paramTransferSupport.getDataFlavors()) {
      if (dataFlavor.isFlavorJavaFileListType())
        return true; 
    } 
    return false;
  }
  
  public boolean importData(TransferHandler.TransferSupport paramTransferSupport) {
    if (!canImport(paramTransferSupport))
      return false; 
    try {
      List<File> list = (List)paramTransferSupport.getTransferable().getTransferData(DataFlavor.javaFileListFlavor);
      String[] arrayOfString = new String[list.size()];
      for (byte b = 0; b < list.size(); b++) {
        File file = list.get(b);
        boolean bool = false;
        for (String str : cd.g(this.a)) {
          if (file.getName().toLowerCase().endsWith(str)) {
            bool = true;
            break;
          } 
        } 
        if (bool) {
          arrayOfString[b] = file.getAbsolutePath();
        } else {
          return false;
        } 
      } 
      this.a.a(arrayOfString);
    } catch (UnsupportedFlavorException|java.io.IOException unsupportedFlavorException) {
      return false;
    } 
    return true;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/eb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */