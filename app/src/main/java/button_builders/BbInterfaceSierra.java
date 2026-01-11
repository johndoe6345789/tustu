package bb;

import V.ExceptionInVPackage;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.cO;
import com.efiAnalytics.ui.eJ;
import java.awt.BorderLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

class BbInterfaceSierra extends JPanel {
  JLabel ExceptionInVPackage = new JLabel();
  
  JLabel b = new JLabel("", 4);
  
  Image c = null;
  
  Image d = null;
  
  boolean e = false;
  
  s(p paramp) {
    setLayout(new BorderLayout(eJ.ExceptionInVPackage(10), eJ.ExceptionInVPackage(10)));
    add("Center", this.b);
    add("East", this.ExceptionInVPackage);
    try {
      this.c = cO.ExceptionInVPackage().ExceptionInVPackage(cO.L);
      this.d = cO.ExceptionInVPackage().ExceptionInVPackage(cO.M);
    } catch (ExceptionInVPackage ExceptionInVPackage) {
      bV.d("Error Loading Images:\n" + ExceptionInVPackage.getLocalizedMessage(), this);
    } 
    ImageIcon imageIcon = new ImageIcon(this.c);
    this.ExceptionInVPackage.setIcon(imageIcon);
    t t = new t(this, paramp);
    this.ExceptionInVPackage.addMouseListener(t);
    this.b.addMouseListener(t);
  }
  
  public void ExceptionInVPackage(String paramString) {
    this.b.setText(paramString);
  }
  
  public void ExceptionInVPackage() {
    if (!this.e) {
      ImageIcon imageIcon = new ImageIcon(this.d);
      this.ExceptionInVPackage.setIcon(imageIcon);
      this.ExceptionInVPackage.validate();
      synchronized (this.f.ExceptionInVPackage) {
        this.f.ExceptionInVPackage.notifyAll();
      } 
      this.e = true;
      this.f.e.setVisible(false);
      this.f.e.repaint();
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bb/s.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */