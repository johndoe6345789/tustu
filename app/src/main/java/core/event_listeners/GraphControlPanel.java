package ao;

import com.efiAnalytics.ui.eJ;
import i.IComponentAlpha;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import javax.swing.JPanel;

public class m extends JPanel implements l, IComponentAlpha {
  fs IComponentAlpha = new fs("", 5);

  hx b = null;

  int c = 0;

  boolean d = true;

  ArrayList e = new ArrayList();

  hg f = new hg();

  public m(hx paramhx) {
    this.b = paramhx;
    setLayout(new BorderLayout());
    this.f.IComponentAlpha(this);
    add(this.f, "Center");
    JPanel jPanel = new JPanel();
    Image image =
        Toolkit.getDefaultToolkit().getImage(getClass().getResource("resources/down.gif"));
    ap ap = new ap(null, image, null, eJ.IComponentAlpha(16, 16));
    ap.setBackground(Color.GRAY);
    ap.IComponentAlpha(new n(this));
    jPanel.add(ap);
    this.IComponentAlpha.addKeyListener(new o(this));
    jPanel.add(this.IComponentAlpha);
    image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("resources/up.gif"));
    ap = new ap(null, image, null, eJ.IComponentAlpha(16, 16));
    ap.setBackground(Color.GRAY);
    ap.IComponentAlpha(new p(this));
    jPanel.add(ap);
    image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("resources/compare.gif"));
    ap = new ap(null, image, null, eJ.IComponentAlpha(16, 16));
    ap.IComponentAlpha(new q(this));
    jPanel.add(ap);
    add(jPanel, "East");
  }

  public void IComponentAlpha(String paramString) {
    if (paramString == null || paramString.equals("")) paramString = "0";
    c(Integer.parseInt(paramString));
  }

  public void c(int paramInt) {
    this.c = paramInt;
    this.IComponentAlpha.setText("" + paramInt);
    this.f.c(paramInt);
    f(paramInt);
  }

  public int IComponentAlpha() {
    return this.c;
  }

  public void b() {
    c(++this.c);
  }

  public void c() {
    c(--this.c);
  }

  public void IComponentAlpha(l paraml) {
    this.e.add(paraml);
  }

  public void d() {
    b(this.d = !this.d);
  }

  public void IComponentAlpha(int paramInt) {
    c(paramInt);
  }

  public void b(int paramInt) {
    IComponentAlpha(paramInt);
  }

  public void IComponentAlpha(boolean paramBoolean) {}

  public void d(int paramInt) {
    this.f.IComponentAlpha(paramInt);
  }

  public void e(int paramInt) {
    this.f.b(paramInt);
  }

  protected void b(boolean paramBoolean) {
    for (l l1 : this.e) {
      if (l1 != null) l1.IComponentAlpha(paramBoolean);
    }
  }

  protected void f(int paramInt) {
    for (l l1 : this.e) {
      if (l1 != null) l1.b(paramInt);
    }
  }

  public void addKeyListener(KeyListener paramKeyListener) {
    Component[] arrayOfComponent = getComponents();
    for (byte b = 0; b < arrayOfComponent.length; b++)
      arrayOfComponent[b].addKeyListener(paramKeyListener);
  }

  public void setBackground(Color paramColor) {
    Component[] arrayOfComponent = getComponents();
    for (byte b = 0; b < arrayOfComponent.length; b++)
      arrayOfComponent[b].setBackground(paramColor);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/m.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
