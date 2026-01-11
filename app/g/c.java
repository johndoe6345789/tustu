package g;

import V.a;
import bH.D;
import com.efiAnalytics.ui.cO;
import java.io.File;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.filechooser.FileView;

public class c extends FileView {
  ImageIcon a = null;
  
  ImageIcon b = null;
  
  public c() {
    try {
      cO cO = cO.a();
      this.a = new ImageIcon(cO.a(cO.t));
      this.b = new ImageIcon(cO.a(cO.D));
    } catch (a a) {
      D.a((Exception)a);
    } 
  }
  
  public Icon getIcon(File paramFile) {
    String str = paramFile.getName().toLowerCase();
    return str.endsWith(".msq") ? this.a : ((str.endsWith(".msl") || str.endsWith(".xls") || str.endsWith(".log")) ? this.b : null);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/g/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */