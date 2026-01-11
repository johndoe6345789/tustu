package aO;

import V.a;
import W.n;
import bH.D;
import com.efiAnalytics.ui.cp;
import com.efiAnalytics.ui.do;
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

class q extends JPanel {
  JScrollBar a = new JScrollBar(0);
  
  JLabel b = new JLabel("  0", 0);
  
  do c = new do("  0", 0);
  
  public q(k paramk) {
    JPanel jPanel = new JPanel();
    Color color = jPanel.getBackground();
    if (color.getBlue() < 50 && color.getGreen() < 50 && color.getRed() < 50)
      jPanel.setBackground(Color.GRAY); 
    setLayout(new BorderLayout());
    add(this.a, "Center");
    this.a.addAdjustmentListener(new r(this, paramk));
    jPanel.setLayout(new GridLayout(1, 0));
    add(jPanel, "East");
    Image image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("zoomout.gif"));
    cp cp = new cp(null, image, null, new Dimension(16, 16));
    cp.a(new s(this, paramk));
    jPanel.add((Component)cp);
    image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("zoomin.gif"));
    cp = new cp(null, image);
    cp.a(new t(this, paramk));
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
    cp.a(new w(this, paramk));
    jPanel.add((Component)cp);
    image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("rewind.gif"));
    cp = new cp(null, image);
    cp.a(new x(this, paramk));
    jPanel.add((Component)cp);
    image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("fastforward.gif"));
    cp = new cp(null, image);
    cp.a(new y(this, paramk));
    jPanel.add((Component)cp);
    image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("end.gif"));
    cp = new cp(null, image);
    cp.a(new z(this, paramk));
    jPanel.add((Component)cp);
  }
  
  public void a() {
    if (this.d.h()) {
      try {
        int i = (int)Double.parseDouble(this.c.getText()) - 1;
        n n = this.d.e.a(i);
        k.a(this.d, n);
      } catch (a a) {
        String str = (this.d.e.c() + 1) + "";
        this.c.setText(str);
      } 
    } else {
      this.c.setText("0");
    } 
  }
  
  public void b() {
    int i = this.d.r - k.b(this.d);
    this.a.setMaximum(i);
    this.a.setMinimum(0);
  }
  
  public void a(double paramDouble) {
    if (paramDouble >= 0.0D && paramDouble <= 1.0D) {
      double d = this.a.getMinimum() + (this.a.getMaximum() + k.b(this.d) - this.a.getMinimum()) * paramDouble;
      this.a.setValue((int)d);
    } else if (paramDouble < 0.0D) {
      this.a.setValue(this.a.getMinimum());
    } else {
      D.c("Invalid Percent:" + paramDouble);
    } 
  }
  
  public double c() {
    return (this.a.getValue() - this.a.getMinimum()) / (this.a.getMaximum() + k.b(this.d) - this.a.getMinimum());
  }
  
  public int d() {
    return this.a.getValue();
  }
  
  public void a(int paramInt) {
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