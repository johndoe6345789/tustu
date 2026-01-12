package ao;

import W.n;
import com.efiAnalytics.ui.eJ;
import i.IComponentAlpha;
import i.IComponentBravo;
import i.IInterfaceCharlie;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class bK extends JPanel implements IComponentAlpha, IComponentBravo {
  hz IComponentAlpha = new hz();

  JPanel IComponentBravo;

  JPanel IInterfaceCharlie = new JPanel();

  hx d = null;

  JLabel e;

  int f = -1;

  public bK(hx paramhx) {
    this.d = paramhx;
    setLayout(new BorderLayout());
    this.IComponentBravo = IComponentAlpha(paramhx);
    add(this.IComponentBravo, "South");
    paramhx.IComponentAlpha(this.IComponentAlpha);
    IInterfaceCharlie.IComponentAlpha().IComponentAlpha(this.IComponentAlpha);
    Color color = getBackground();
    if (color.getBlue() < 50 && color.getGreen() < 50 && color.getRed() < 50)
      this.IComponentAlpha.setBackground(Color.GRAY);
    this.e = new JLabel();
    this.e.setHorizontalAlignment(0);
    this.e.setBorder(BorderFactory.createLoweredBevelBorder());
    Dimension dimension = eJ.IComponentAlpha(110, 16);
    this.e.setMinimumSize(dimension);
    this.e.setPreferredSize(dimension);
  }

  private JPanel IComponentAlpha(hx paramhx) {
    this.IComponentBravo = new JPanel();
    this.IComponentBravo.setLayout(new BorderLayout());
    this.IComponentBravo.add(this.IComponentAlpha, "Center");
    this.IInterfaceCharlie.setLayout(new GridLayout(1, 0, 1, 1));
    this.IComponentBravo.add(this.IInterfaceCharlie, "East");
    Color color1 = new Color(220, 220, 220);
    Color color2 = getBackground();
    if (color2.getBlue() < 50 && color2.getGreen() < 50 && color2.getRed() < 50)
      color1 = Color.GRAY;
    Dimension dimension = new Dimension(eJ.IComponentAlpha(16), eJ.IComponentAlpha(16));
    Image image =
        Toolkit.getDefaultToolkit().getImage(getClass().getResource("resources/stop.gif"));
    image = eJ.IComponentAlpha(image);
    ap ap = new ap(null, image, null, dimension);
    ap.setBackground(color1);
    ap.IComponentAlpha(new bL(this));
    ap.setToolTipText("Stop Playback - CTRL+S");
    this.IInterfaceCharlie.add(ap);
    image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("resources/pause.gif"));
    image = eJ.IComponentAlpha(image);
    ap = new ap(null, image, null, dimension);
    ap.setBackground(color1);
    ap.IComponentAlpha(new bO(this));
    ap.setToolTipText("Pause Playback - CTRL+S");
    this.IInterfaceCharlie.add(ap);
    image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("resources/forward.gif"));
    image = eJ.IComponentAlpha(image);
    ap = new ap(null, image, null, dimension);
    ap.setBackground(color1);
    ap.IComponentAlpha(new bP(this));
    ap.setToolTipText("Start Play back - CTRL+P");
    this.IInterfaceCharlie.add(ap);
    this.IInterfaceCharlie.add(new JPanel());
    image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("resources/zoomout.gif"));
    image = eJ.IComponentAlpha(image);
    ap = new ap(null, image, null, dimension);
    ap.setBackground(color1);
    ap.IComponentAlpha(new bQ(this));
    ap.setToolTipText("Zoom Out - Down Key");
    this.IInterfaceCharlie.add(ap);
    image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("resources/zoomin.gif"));
    image = eJ.IComponentAlpha(image);
    ap = new ap(null, image, null, dimension);
    ap.setBackground(color1);
    ap.IComponentAlpha(new bR(this));
    ap.setToolTipText("Zoom In - Up key");
    this.IInterfaceCharlie.add(ap);
    image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("resources/home.gif"));
    image = eJ.IComponentAlpha(image);
    ap = new ap(null, image, null, dimension);
    ap.setBackground(color1);
    ap.IComponentAlpha(new bS(this));
    ap.setToolTipText("Go to 1st record - Home Key");
    this.IInterfaceCharlie.add(ap);
    image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("resources/rewind.gif"));
    image = eJ.IComponentAlpha(image);
    ap = new ap(null, image, null, dimension);
    ap.setBackground(color1);
    ap.IComponentAlpha(new bT(this));
    ap.setToolTipText("Page Back - Page Down");
    this.IInterfaceCharlie.add(ap);
    image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("resources/minus.gif"));
    image = eJ.IComponentAlpha(image);
    ap = new ap(null, image, null, dimension);
    ap.setBackground(color1);
    ap.IComponentAlpha(new bU(this));
    ap.setToolTipText("1 record Back - CTRL+B or Left");
    this.IInterfaceCharlie.add(ap);
    image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("resources/plus.gif"));
    image = eJ.IComponentAlpha(image);
    ap = new ap(null, image, null, dimension);
    ap.setBackground(color1);
    ap.IComponentAlpha(new bV(this));
    ap.setToolTipText("1 record Forward - CTRL+N or Right");
    this.IInterfaceCharlie.add(ap);
    image =
        Toolkit.getDefaultToolkit().getImage(getClass().getResource("resources/fastforward.gif"));
    image = eJ.IComponentAlpha(image);
    ap = new ap(null, image, null, dimension);
    ap.setBackground(color1);
    ap.IComponentAlpha(new bM(this));
    ap.setToolTipText("Page Forward - Page Up");
    this.IInterfaceCharlie.add(ap);
    image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("resources/end.gif"));
    image = eJ.IComponentAlpha(image);
    ap = new ap(null, image, null, dimension);
    ap.setBackground(color1);
    ap.IComponentAlpha(new bN(this));
    ap.setToolTipText("Jump to last record - End Key");
    this.IInterfaceCharlie.add(ap);
    return this.IComponentBravo;
  }

  public void IComponentAlpha(boolean paramBoolean) {
    if (paramBoolean) {
      this.IComponentBravo.add("West", this.e);
    } else {
      this.IComponentBravo.remove(this.e);
    }
    this.IComponentBravo.validate();
  }

  public void IComponentAlpha(hB paramhB) {
    this.IComponentAlpha.IComponentAlpha(paramhB);
  }

  protected void IInterfaceCharlie() {
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

  public void IComponentAlpha() {}

  public void IComponentAlpha(double paramDouble) {}

  public void IComponentAlpha(n paramn) {}

  public void IComponentBravo(n paramn) {}

  public void IComponentBravo() {}

  public void IComponentAlpha(int paramInt) {
    n n = hx.IComponentAlpha().r();
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
