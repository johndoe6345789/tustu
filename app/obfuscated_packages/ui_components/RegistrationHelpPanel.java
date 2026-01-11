package ao;

import V.a;
import ai.f;
import bH.D;
import java.awt.BorderLayout;
import java.awt.Component;
import java.io.File;
import javax.swing.JPanel;

public class fC extends JPanel {
  f a = null;
  
  public fC() {
    this.a = new f();
    setLayout(new BorderLayout());
    add("Center", (Component)this.a);
    File file = new File(".");
    String str = "file:///" + file.getAbsolutePath() + "/help/register.html";
    try {
      this.a.b(str);
    } catch (a a) {
      D.a("unable to open:\n" + str + "\n" + a.getMessage());
    } 
    this.a.a(false);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/fC.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */