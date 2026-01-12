package g;

import V.ExceptionInVPackage;
import bH.D;
import com.efiAnalytics.ui.cO;
import java.io.File;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.filechooser.FileView;

public class FileViewExtension extends FileView {
  ImageIcon ExceptionInVPackage = null;

  ImageIcon b = null;

  public FileViewExtension() {
    try {
      cO cO = cO.ExceptionInVPackage();
      this.ExceptionInVPackage = new ImageIcon(cO.ExceptionInVPackage(cO.t));
      this.b = new ImageIcon(cO.ExceptionInVPackage(cO.D));
    } catch (ExceptionInVPackage ExceptionInVPackage) {
      D.ExceptionInVPackage((Exception) ExceptionInVPackage);
    }
  }

  public Icon getIcon(File paramFile) {
    String str = paramFile.getName().toLowerCase();
    return str.endsWith(".msq")
        ? this.ExceptionInVPackage
        : ((str.endsWith(".msl") || str.endsWith(".xls") || str.endsWith(".log")) ? this.b : null);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/g/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
