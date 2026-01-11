package ao;

import W.n;
import com.efiAnalytics.ui.eJ;
import i.a;
import i.b;
import i.c;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class bK extends JPanel implements a, b {
  hz a = new hz();
  
  JPanel b;
  
  JPanel c = new JPanel();
  
  hx d = null;
  
  JLabel e;
  
  int f = -1;
  
  public bK(hx paramhx) {
    this.d = paramhx;
    setLayout(new BorderLayout());
    this.b = a(paramhx);
    add(this.b, "South");
    paramhx.a(this.a);
    c.a().a(this.a);
    Color color = getBackground();
    if (color.getBlue() < 50 && color.getGreen() < 50 && color.getRed() < 50)
      this.a.setBackground(Color.GRAY); 
    this.e = new JLabel();
    this.e.setHorizontalAlignment(0);
    this.e.setBorder(BorderFactory.createLoweredBevelBorder());
    Dimension dimension = eJ.a(110, 16);
    this.e.setMinimumSize(dimension);
    this.e.setPreferredSize(dimension);
  }
  
  private JPanel a(hx paramhx) {
    this.b = new JPanel();
    this.b.setLayout(new BorderLayout());
    this.b.add(this.a, "Center");
    this.c.setLayout(new GridLayout(1, 0, 1, 1));
    this.b.add(this.c, "East");
    Color color1 = new Color(220, 220, 220);
    Color color2 = getBackground();
    if (color2.getBlue() < 50 && color2.getGreen() < 50 && color2.getRed() < 50)
      color1 = Color.GRAY; 
    Dimension dimension = new Dimension(eJ.a(16), eJ.a(16));
    Image image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("resources/stop.gif"));
    image = eJ.a(image);
    ap ap = new ap(null, image, null, dimension);
    ap.setBackground(color1);
    ap.a(new bL(this));
    ap.setToolTipText("Stop Playback - CTRL+S");
    this.c.add(ap);
    image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("resources/pause.gif"));
    image = eJ.a(image);
    ap = new ap(null, image, null, dimension);
    ap.setBackground(color1);
    ap.a(new bO(this));
    ap.setToolTipText("Pause Playback - CTRL+S");
    this.c.add(ap);
    image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("resources/forward.gif"));
    image = eJ.a(image);
    ap = new ap(null, image, null, dimension);
    ap.setBackground(color1);
    ap.a(new bP(this));
    ap.setToolTipText("Start Play back - CTRL+P");
    this.c.add(ap);
    this.c.add(new JPanel());
    image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("resources/zoomout.gif"));
    image = eJ.a(image);
    ap = new ap(null, image, null, dimension);
    ap.setBackground(color1);
    ap.a(new bQ(this));
    ap.setToolTipText("Zoom Out - Down Key");
    this.c.add(ap);
    image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("resources/zoomin.gif"));
    image = eJ.a(image);
    ap = new ap(null, image, null, dimension);
    ap.setBackground(color1);
    ap.a(new bR(this));
    ap.setToolTipText("Zoom In - Up key");
    this.c.add(ap);
    image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("resources/home.gif"));
    image = eJ.a(image);
    ap = new ap(null, image, null, dimension);
    ap.setBackground(color1);
    ap.a(new bS(this));
    ap.setToolTipText("Go to 1st record - Home Key");
    this.c.add(ap);
    image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("resources/rewind.gif"));
    image = eJ.a(image);
    ap = new ap(null, image, null, dimension);
    ap.setBackground(color1);
    ap.a(new bT(this));
    ap.setToolTipText("Page Back - Page Down");
    this.c.add(ap);
    image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("resources/minus.gif"));
    image = eJ.a(image);
    ap = new ap(null, image, null, dimension);
    ap.setBackground(color1);
    ap.a(new bU(this));
    ap.setToolTipText("1 record Back - CTRL+B or Left");
    this.c.add(ap);
    image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("resources/plus.gif"));
    image = eJ.a(image);
    ap = new ap(null, image, null, dimension);
    ap.setBackground(color1);
    ap.a(new bV(this));
    ap.setToolTipText("1 record Forward - CTRL+N or Right");
    this.c.add(ap);
    image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("resources/fastforward.gif"));
    image = eJ.a(image);
    ap = new ap(null, image, null, dimension);
    ap.setBackground(color1);
    ap.a(new bM(this));
    ap.setToolTipText("Page Forward - Page Up");
    this.c.add(ap);
    image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("resources/end.gif"));
    image = eJ.a(image);
    ap = new ap(null, image, null, dimension);
    ap.setBackground(color1);
    ap.a(new bN(this));
    ap.setToolTipText("Jump to last record - End Key");
    this.c.add(ap);
    return this.b;
  }
  
  public void a(boolean paramBoolean) {
    if (paramBoolean) {
      this.b.add("West", this.e);
    } else {
      this.b.remove(this.e);
    } 
    this.b.validate();
  }
  
  public void a(hB paramhB) {
    this.a.a(paramhB);
  }
  
  protected void c() {
    this.d.l();
  }
  
  protected void d() {
    this.d.m();
  }
  
  protected void e() {
    this.d.w();
  }
  
  protected void f() {
    this.d.z();
  }
  
  protected void g() {
    this.d.o();
  }
  
  protected void h() {
    this.d.n();
  }
  
  protected void i() {
    this.d.u();
  }
  
  protected void j() {
    this.d.v();
  }
  
  protected void k() {
    this.d.e();
  }
  
  protected void l() {
    this.d.j();
  }
  
  protected void m() {
    this.d.k();
  }
  
  public void a() {}
  
  public void a(double paramDouble) {}
  
  public void a(n paramn) {}
  
  public void b(n paramn) {}
  
  public void b() {}
  
  public void a(int paramInt) {
    n n = hx.a().r();
    if (n == null) {
      this.f = -1;
    } else {
      this.f = n.d();
    } 
    if (this.f == -1) {
      this.e.setText("");
    } else {
      this.e.setText((paramInt + 1) + " : " + this.f);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/bK.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */