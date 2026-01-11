package aO;

import V.ExceptionInVPackage;
import W.n;
import bH.D;
import com.efiAnalytics.ui.cp;
import com.efiAnalytics.ui.NumericTextField;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;

class UIInAoPackage extends JPanel {
  JScrollBar ExceptionInVPackage = new JScrollBar(0);
  
  JLabel b = new JLabel("  0", 0);
  
  do c = new NumericTextField("  0", 0);
  
  public UIInAoPackage(k paramk) {
    JPanel jPanel = new JPanel();
    Color color = jPanel.getBackground();
    if (color.getBlue() < 50 && color.getGreen() < 50 && color.getRed() < 50)
      jPanel.setBackground(Color.GRAY); 
    setLayout(new BorderLayout());
    add(this.ExceptionInVPackage, "Center");
    this.ExceptionInVPackage.addAdjustmentListener(new r(this, paramk));
    jPanel.setLayout(new GridLayout(1, 0));
    add(jPanel, "East");
    Image image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("zoomout.gif"));
    cp cp = new cp(null, image, null, new Dimension(16, 16));
    cp.ExceptionInVPackage(new s(this, paramk));
    jPanel.add((Component)cp);
    image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("zoomin.gif"));
    cp = new cp(null, image);
    cp.ExceptionInVPackage(new t(this, paramk));
    jPanel.add((Component)cp);
    jPanel.add(new JLabel(""));
    jPanel.add((Component)this.c);
    jPanel.add(new JLabel("of", 0));
    jPanel.add(this.b);
    jPanel.add(new JLabel(""));
    this.c.addFocusListener(new u(this, paramk));
    this.c.addKeyListener(new v(this, paramk));
    image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("home.gif"));
    cp = new cp(null, image);
    cp.ExceptionInVPackage(new w(this, paramk));
    jPanel.add((Component)cp);
    image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("rewind.gif"));
    cp = new cp(null, image);
    cp.ExceptionInVPackage(new x(this, paramk));
    jPanel.add((Component)cp);
    image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("fastforward.gif"));
    cp = new cp(null, image);
    cp.ExceptionInVPackage(new y(this, paramk));
    jPanel.add((Component)cp);
    image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("end.gif"));
    cp = new cp(null, image);
    cp.ExceptionInVPackage(new z(this, paramk));
    jPanel.add((Component)cp);
  }
  
  public void ExceptionInVPackage() {
    if (this.d.h()) {
      try {
        int i = (int)Double.parseDouble(this.c.getText()) - 1;
        n n = this.d.e.ExceptionInVPackage(i);
        k.ExceptionInVPackage(this.d, n);
      } catch (ExceptionInVPackage ExceptionInVPackage) {
        String str = (this.d.e.c() + 1) + "";
        this.c.setText(str);
      } 
    } else {
      this.c.setText("0");
    } 
  }
  
  public void b() {
    int i = this.d.r - k.b(this.d);
    this.ExceptionInVPackage.setMaximum(i);
    this.ExceptionInVPackage.setMinimum(0);
  }
  
  public void ExceptionInVPackage(double paramDouble) {
    if (paramDouble >= 0.0D && paramDouble <= 1.0D) {
      double d = this.ExceptionInVPackage.getMinimum() + (this.ExceptionInVPackage.getMaximum() + k.b(this.d) - this.ExceptionInVPackage.getMinimum()) * paramDouble;
      this.ExceptionInVPackage.setValue((int)d);
    } else if (paramDouble < 0.0D) {
      this.ExceptionInVPackage.setValue(this.ExceptionInVPackage.getMinimum());
    } else {
      D.c("Invalid Percent:" + paramDouble);
    } 
  }
  
  public double c() {
    return (this.ExceptionInVPackage.getValue() - this.ExceptionInVPackage.getMinimum()) / (this.ExceptionInVPackage.getMaximum() + k.b(this.d) - this.ExceptionInVPackage.getMinimum());
  }
  
  public int d() {
    return this.ExceptionInVPackage.getValue();
  }
  
  public void ExceptionInVPackage(int paramInt) {
    this.b.setText("" + paramInt);
  }
  
  public void b(int paramInt) {
    this.c.setText("" + paramInt);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aO/q.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */