package ao;

import V.ExceptionInVPackage;
import ai.JPanelExtensionInAiPackage;
import bH.D;
import java.awt.BorderLayout;
import java.awt.Component;
import java.io.File;
import javax.swing.JPanel;

public class fC extends JPanel {
  JPanelExtensionInAiPackage ExceptionInVPackage = null;

  public fC() {
    this.ExceptionInVPackage = new JPanelExtensionInAiPackage();
    setLayout(new BorderLayout());
    add("Center", (Component) this.ExceptionInVPackage);
    File file = new File(".");
    String str = "file:///" + file.getAbsolutePath() + "/help/register.html";
    try {
      this.ExceptionInVPackage.b(str);
    } catch (ExceptionInVPackage ExceptionInVPackage) {
      D.ExceptionInVPackage("unable to open:\n" + str + "\n" + ExceptionInVPackage.getMessage());
    }
    this.ExceptionInVPackage.ExceptionInVPackage(false);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/fC.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
