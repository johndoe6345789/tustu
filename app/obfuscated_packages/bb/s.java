package bb;

import V.a;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.cO;
import com.efiAnalytics.ui.eJ;
import java.awt.BorderLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

class s extends JPanel {
  JLabel a = new JLabel();
  
  JLabel b = new JLabel("", 4);
  
  Image c = null;
  
  Image d = null;
  
  boolean e = false;
  
  s(p paramp) {
    setLayout(new BorderLayout(eJ.a(10), eJ.a(10)));
    add("Center", this.b);
    add("East", this.a);
    try {
      this.c = cO.a().a(cO.L);
      this.d = cO.a().a(cO.M);
    } catch (a a) {
      bV.d("Error Loading Images:\n" + a.getLocalizedMessage(), this);
    } 
    ImageIcon imageIcon = new ImageIcon(this.c);
    this.a.setIcon(imageIcon);
    t t = new t(this, paramp);
    this.a.addMouseListener(t);
    this.b.addMouseListener(t);
  }
  
  public void a(String paramString) {
    this.b.setText(paramString);
  }
  
  public void a() {
    if (!this.e) {
      ImageIcon imageIcon = new ImageIcon(this.d);
      this.a.setIcon(imageIcon);
      this.a.validate();
      synchronized (this.f.a) {
        this.f.a.notifyAll();
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