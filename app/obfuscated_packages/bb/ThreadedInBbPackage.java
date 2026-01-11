package bb;

import ae.FileUsingHashMap;
import ae.AeInterfaceLima;
import ae.AeInterfaceXray;
import com.efiAnalytics.ui.bV;
import java.io.File;
import java.io.IOException;
import javax.swing.JDialog;
import javax.swing.SwingUtilities;
import r.IOPropertiesUsingFile;
import s.SComponentGolf;

class ThreadedInBbPackage extends Thread {
  I(E paramE, File paramFile, JDialog paramJDialog) {}
  
  public void run() {
    try {
      FileUsingHashMap FileUsingHashMap = AeInterfaceLima.IOPropertiesUsingFile(this.IOPropertiesUsingFile);
      if (FileUsingHashMap != null && FileUsingHashMap.IOPropertiesUsingFile()) {
        this.c.f.setSelected(true);
        this.c.e.setText(this.IOPropertiesUsingFile.getAbsolutePath());
        this.c.e.setEnabled(true);
        this.c.IOPropertiesUsingFile(FileUsingHashMap);
        IOPropertiesUsingFile.IOPropertiesUsingFile().b(IOPropertiesUsingFile.E, this.IOPropertiesUsingFile.getParentFile().getAbsolutePath());
      } else {
        bV.d(SComponentGolf.b("The selected file does not appear to be IOPropertiesUsingFile firmware file."), this.b);
        this.c.f.setSelected(false);
        this.c.e.setText("");
        this.c.e.setEnabled(false);
      } 
    } catch (AeInterfaceXray AeInterfaceXray) {
      bV.d(SComponentGolf.b(AeInterfaceXray.getMessage()), this.b);
      this.c.f.setSelected(false);
      this.c.e.setText("");
      this.c.e.setEnabled(false);
    } catch (IOException iOException) {
      bV.d(SComponentGolf.b("Error Reading File.") + "\n" + iOException.getLocalizedMessage(), this.b);
      this.c.f.setSelected(false);
      this.c.e.setText("");
      this.c.e.setEnabled(false);
    } catch (NullPointerException nullPointerException) {
      bV.d(SComponentGolf.b("Unhandled Error"), this.b);
      this.c.f.setSelected(false);
      this.c.e.setText("");
      this.c.e.setEnabled(false);
      nullPointerException.printStackTrace();
    } catch (Exception exception) {
      bV.d(SComponentGolf.b("Error") + ":\n" + exception.getLocalizedMessage(), this.b);
      this.c.f.setSelected(false);
      this.c.e.setText("");
      this.c.e.setEnabled(false);
      exception.printStackTrace();
    } finally {
      J j = new J(this);
      SwingUtilities.invokeLater(j);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bb/I.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */