package bt;

import G.R;
import G.T;
import G.aA;
import G.aj;
import G.bv;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class w {
  String[] a = new String[] { "resources/wrench.png", "resources/tools.gif", "resources/hammer.gif" };
  
  int b = 0;
  
  public Icon a(aA paramaA) {
    R r = T.a().c();
    bv bv = r.e().c(paramaA.d());
    aj aj = r.e().b(paramaA.d());
    return a(bv, aj, paramaA);
  }
  
  public Icon a(bv parambv, aj paramaj, aA paramaA) {
    if (paramaA != null && paramaA.b()) {
      Image image1 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("resources/folder16.png"));
      return new ImageIcon(image1);
    } 
    if (parambv instanceof G.be || (parambv != null && parambv.S())) {
      Image image1 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("resources/table.png"));
      return new ImageIcon(image1);
    } 
    if (parambv instanceof G.bm || (parambv != null && parambv.T())) {
      Image image1 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("resources/curve.png"));
      return new ImageIcon(image1);
    } 
    if (paramaj instanceof aj) {
      Image image1 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("resources/help16.gif"));
      return new ImageIcon(image1);
    } 
    if (parambv instanceof G.bi) {
      Image image1 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("resources/table3d.png"));
      return new ImageIcon(image1);
    } 
    Image image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("resources/settings.gif"));
    return new ImageIcon(image);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/w.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */