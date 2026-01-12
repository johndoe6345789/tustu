package t;

import com.efiAnalytics.apps.ts.dashboard.f;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Window;
import java.util.ArrayList;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import s.SComponentGolf;

public class TComponentAv extends a implements f {
  JPanel a = new JPanel();

  r b;

  as c;

  aK d;

  be e;

  aA SComponentGolf;

  ay h;

  aO i;

  aF j;

  bi k;

  bn l;

  bn m;

  bn n;

  public TComponentAv(Window paramWindow, ai paramai, String paramString) {
    super(paramWindow, paramString);
    setLayout(new GridLayout(1, 1));
    this.a.setLayout(new BorderLayout());
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new GridLayout(1, 0, 5, 5));
    this.a.add(jPanel1);
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new BoxLayout(jPanel2, 1));
    jPanel1.add(jPanel2);
    this.b = new r(paramWindow, paramai, paramString);
    this.k = new bi(paramWindow, paramai);
    this.SComponentGolf = new aA(paramWindow, paramai);
    this.h = new ay(paramWindow, paramai);
    this.m = new aD(paramWindow, SComponentGolf.b("Font Size Adjustment"));
    this.m.a(paramai);
    this.n = new aw(paramWindow, SComponentGolf.b("Display Digits"));
    this.n.a(paramai);
    this.d = new aK(paramWindow, paramai);
    this.c = new as(paramWindow, paramai);
    this.e = new be(paramWindow, paramai);
    this.l = new b(paramWindow, SComponentGolf.b("Border Size"));
    this.l.a(paramai);
    this.i = new aO(paramWindow, paramai);
    this.j = new aF(paramWindow, paramai);
    jPanel2.add(this.b.a());
    jPanel2.add(this.k.a());
    jPanel2.add(this.SComponentGolf.a());
    jPanel2.add(this.m.a());
    jPanel2.add(this.h.a());
    jPanel2.add(this.d.a());
    jPanel2.add(this.n.a());
    jPanel2.add(this.l.a());
    JPanel jPanel3 = new JPanel();
    jPanel3.setLayout(new BoxLayout(jPanel3, 1));
    jPanel1.add(jPanel3);
    jPanel3.add(this.i.a());
    jPanel3.add(this.j.a());
    jPanel3.add(this.e.a());
    jPanel3.add(this.c.a());
    JScrollPane jScrollPane = new JScrollPane(this.a);
    add(jScrollPane);
    pack();
  }

  public void a(ArrayList paramArrayList) {
    this.b.a(paramArrayList);
    this.c.a(paramArrayList);
    this.d.a(paramArrayList);
    this.e.a(paramArrayList);
    this.SComponentGolf.a(paramArrayList);
    this.i.a(paramArrayList);
    this.j.a(paramArrayList);
    try {
      this.k.a(paramArrayList);
    } catch (Exception exception) {
      exception.printStackTrace();
    }
    this.l.a(paramArrayList);
    this.m.a(paramArrayList);
    this.h.a(paramArrayList);
    this.n.a(paramArrayList);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/t/av.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
