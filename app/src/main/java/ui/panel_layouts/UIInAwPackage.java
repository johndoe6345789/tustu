package aW;

import A.AInterfaceRomeo;
import bt.j;
import java.awt.BorderLayout;
import java.awt.Component;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import s.SComponentGolf;

class UIInAwPackage extends JPanel {
  AInterfaceRomeo a = null;

  n b = null;

  JPanel c = new JPanel();

  h d = null;

  List e = new ArrayList();

  a f = null;

  public UIInAwPackage(a parama, AInterfaceRomeo paramr) {
    this.a = paramr;
    this.f = parama;
    setLayout(new BorderLayout());
    k k = new k(this, SComponentGolf.b(this.a.c()) + ": ");
    if (this.a.d() != null && !this.a.d().isEmpty()) {
      j j = new j(SComponentGolf.b(this.a.d()));
      j.setOpaque(false);
      JPanel jPanel1 = new JPanel();
      jPanel1.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
      jPanel1.setLayout(new BorderLayout());
      jPanel1.add("North", (Component) j);
      add(jPanel1, "East");
    }
    JPanel jPanel = new JPanel();
    jPanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
    jPanel.setLayout(new BorderLayout());
    jPanel.add("North", k);
    add("West", jPanel);
    if (this.a.a() == 2 || this.a.a() == 0 || this.a.a() == 4) {
      l l = new l(this);
      l.setEditable((this.a.a() == 0));
      this.b = l;
      List<E> list = this.a.b();
      for (byte b = 0; b < list.size(); b++) l.addItem(list.get(b));
      a(l);
      l.addActionListener(new f(this));
    } else if (this.a.a() == 3) {
      j j = new j(this);
      this.b = j;
      a((Component) j);
    } else if (this.a.a() == 1) {
      m m = new m(this);
      this.b = m;
      a(m);
    } else if (this.a.a() == 6) {
      i i = new i(this, SComponentGolf.b(this.a.c()));
      i.setToolTipText(k.getToolTipText());
      k.setText("");
      this.b = i;
      a(i);
    } else if (this.a.a() == 5 && AInterfaceRomeo.a().a(this.a.c())) {
      JButton jButton = new JButton(SComponentGolf.b(this.a.d()));
      jButton.addActionListener(new SComponentGolf(this, parama));
      a(jButton);
    } else {
      JLabel jLabel = new JLabel(SComponentGolf.b("Unknown Setting Type."));
      a(jLabel);
    }
  }

  private void a(Component paramComponent) {
    this.c.setBorder(BorderFactory.createEmptyBorder(5, 15, 5, 15));
    this.c.setLayout(new BorderLayout());
    this.c.add("North", paramComponent);
    add("Center", this.c);
  }

  public Object a() {
    return (this.b != null) ? this.b.a() : null;
  }

  public void a(Object paramObject) {
    if (this.b != null && (a() == null || !a().equals(paramObject))) this.b.a(paramObject);
  }

  public void b() {
    c();
    this.d = new h(this);
    this.d.start();
  }

  public void c() {
    if (this.d != null) {
      this.d.a();
      this.d = null;
    }
  }

  public void a(p paramp) {
    this.e.add(paramp);
  }

  private void a(String paramString1, String paramString2) {
    for (p p : this.e) p.a(paramString1, paramString2);
  }

  public boolean d() {
    return (this.b != null) ? this.b.b() : ((this.a != null && this.a.a() == 5));
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aW/e.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
