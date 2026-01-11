package ao;

import V.a;
import W.j;
import com.efiAnalytics.ui.bq;
import com.efiAnalytics.ui.br;
import com.efiAnalytics.ui.cO;
import com.efiAnalytics.ui.eJ;
import h.b;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Image;
import javax.swing.GrayFilter;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class ag extends JButton {
  private String b = null;
  
  int a = 14;
  
  private static Image c = null;
  
  private static Image d = null;
  
  public ag() {
    c = b();
    d = c();
    if (c != null) {
      ImageIcon imageIcon = new ImageIcon(b());
      setIcon(imageIcon);
    } else {
      setText("...");
    } 
    if (d != null) {
      ImageIcon imageIcon = new ImageIcon(c());
      setDisabledIcon(imageIcon);
    } 
    addActionListener(new ah(this));
    Dimension dimension = eJ.a(this.a * 2 / 3 + 8, this.a + 6);
    setPreferredSize(dimension);
    setMinimumSize(dimension);
    setEnabled(false);
  }
  
  private void a() {
    if (b.a().a("searchLogFiles")) {
      j j = hx.a().r().a(this.b);
      br br = new br();
      S.a((bq)br, j, this);
      add((Component)br);
      br.show(this, 0, getHeight());
    } 
  }
  
  void a(String paramString) {
    this.b = paramString;
    setEnabled((paramString != null && !paramString.trim().isEmpty()));
  }
  
  private Image b() {
    if (c == null)
      try {
        c = cO.a().a(cO.y, this, this.a);
      } catch (a a) {
        a.printStackTrace();
      }  
    return c;
  }
  
  private Image c() {
    if (d == null)
      d = GrayFilter.createDisabledImage(b()); 
    return d;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/ag.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */