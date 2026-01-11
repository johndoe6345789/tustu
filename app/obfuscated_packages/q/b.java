package q;

import bt.y;
import com.efiAnalytics.ui.fp;
import java.awt.Color;
import java.awt.Component;
import javax.swing.UIManager;

public class b implements i {
  public void a(Component paramComponent) {
    y y = (y)paramComponent;
    y.removeAllItems();
    y.b();
    fp.a((Component)y, true);
  }
  
  public void b(Component paramComponent) {
    y y = (y)paramComponent;
    y.removeAllItems();
    y.b();
    fp.a((Component)y, true);
    Color color1 = UIManager.getColor("ComboBox.background");
    if (color1 != null)
      y.setBackground(color1); 
    Color color2 = UIManager.getColor("ComboBox.foreground");
    if (color2 != null)
      y.setForeground(color2); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/q/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */