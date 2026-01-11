package ao;

import V.ExceptionInVPackage;
import W.j;
import com.efiAnalytics.ui.bq;
import com.efiAnalytics.ui.br;
import com.efiAnalytics.ui.cO;
import com.efiAnalytics.ui.eJ;
import h.ClassTypeInHPackage;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Image;
import javax.swing.GrayFilter;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class ag extends JButton {
  private String ClassTypeInHPackage = null;
  
  int ExceptionInVPackage = 14;
  
  private static Image c = null;
  
  private static Image d = null;
  
  public ag() {
    c = ClassTypeInHPackage();
    d = c();
    if (c != null) {
      ImageIcon imageIcon = new ImageIcon(ClassTypeInHPackage());
      setIcon(imageIcon);
    } else {
      setText("...");
    } 
    if (d != null) {
      ImageIcon imageIcon = new ImageIcon(c());
      setDisabledIcon(imageIcon);
    } 
    addActionListener(new ah(this));
    Dimension dimension = eJ.ExceptionInVPackage(this.ExceptionInVPackage * 2 / 3 + 8, this.ExceptionInVPackage + 6);
    setPreferredSize(dimension);
    setMinimumSize(dimension);
    setEnabled(false);
  }
  
  private void ExceptionInVPackage() {
    if (ClassTypeInHPackage.ExceptionInVPackage().ExceptionInVPackage("searchLogFiles")) {
      j j = hx.ExceptionInVPackage().r().ExceptionInVPackage(this.ClassTypeInHPackage);
      br br = new br();
      S.ExceptionInVPackage((bq)br, j, this);
      add((Component)br);
      br.show(this, 0, getHeight());
    } 
  }
  
  void ExceptionInVPackage(String paramString) {
    this.ClassTypeInHPackage = paramString;
    setEnabled((paramString != null && !paramString.trim().isEmpty()));
  }
  
  private Image ClassTypeInHPackage() {
    if (c == null)
      try {
        c = cO.ExceptionInVPackage().ExceptionInVPackage(cO.y, this, this.ExceptionInVPackage);
      } catch (ExceptionInVPackage ExceptionInVPackage) {
        ExceptionInVPackage.printStackTrace();
      }  
    return c;
  }
  
  private Image c() {
    if (d == null)
      d = GrayFilter.createDisabledImage(ClassTypeInHPackage()); 
    return d;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/ag.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */