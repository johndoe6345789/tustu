package be;

import G.R;
import G.aH;
import V.g;
import com.efiAnalytics.ui.fp;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import r.i;
import s.g;

public class c extends JPanel implements o {
  static String a = "Advanced";
  
  static String b = "Simple";
  
  CardLayout c = new CardLayout();
  
  JPanel d = new JPanel();
  
  M e;
  
  w f;
  
  JRadioButton g;
  
  JRadioButton h;
  
  R i;
  
  aH j = null;
  
  private boolean k = true;
  
  public c(R paramR) {
    this.i = paramR;
    setLayout(new BorderLayout());
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new FlowLayout(1));
    d d = new d(this);
    ButtonGroup buttonGroup = new ButtonGroup();
    this.g = new JRadioButton(g.b(b));
    this.g.setActionCommand(b);
    buttonGroup.add(this.g);
    this.g.addActionListener(d);
    jPanel1.add(this.g);
    this.h = new JRadioButton(g.b(a));
    this.h.setActionCommand(a);
    buttonGroup.add(this.h);
    this.h.setEnabled(i.a().a("09ggdslkmkgoiu"));
    this.h.addActionListener(d);
    jPanel1.add(this.h);
    add(jPanel1, "North");
    this.d.setLayout(this.c);
    this.e = new M();
    this.e.a(paramR);
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new FlowLayout(1));
    jPanel2.add(this.e);
    this.d.add(jPanel2, b);
    this.f = new w(paramR);
    this.d.add(this.f, a);
    add(this.d, "Center");
    this.f.b(new f(this));
    this.f.a(new e(this));
    if (!i.a().a("09ggdslkmkgoiu"))
      fp.a(this.f, false); 
    this.g.setSelected(true);
  }
  
  private void a(String paramString) {
    this.c.show(this.d, paramString);
    if (paramString.equals(a)) {
      this.f.a(this.e.b(), d());
      this.f.b(this.e.e());
      try {
        String str = this.e.d();
        if (str.endsWith("- 0.0 )/( 0.0 - 0.0 ))"))
          str = ""; 
        this.f.a(str);
      } catch (Exception exception) {}
    } else {
      this.e.a(this.f.b(), d());
      this.e.a(this.f.e());
    } 
  }
  
  public void a(R paramR) {
    this.e.a(paramR);
    this.f.a(paramR);
    this.i = paramR;
  }
  
  public boolean a() {
    return this.g.isSelected() ? this.e.a() : this.f.a();
  }
  
  public aH b() {
    if (this.j == null)
      this.j = new aH(this.i.ac()); 
    this.j.a("formula");
    if (this.g.isSelected()) {
      this.j.v(this.e.b());
      this.j.e(this.e.d());
      this.j.c(this.e.e());
    } else {
      this.j.v(this.f.b());
      this.j.e(this.f.d());
      this.j.c(this.f.e());
    } 
    return this.j;
  }
  
  public void a(aH paramaH) {
    this.j = paramaH;
    if (paramaH.b() == null) {
      a(true);
      try {
        this.j.a("formula");
      } catch (g g) {
        Logger.getLogger(c.class.getName()).log(Level.SEVERE, (String)null, (Throwable)g);
      } 
    } else {
      a(false);
    } 
    if (this.j.k() != null && !this.e.b(this.j.k())) {
      this.h.setSelected(true);
      a(a);
    } else {
      this.g.setSelected(true);
      a(b);
    } 
    if (this.g.isSelected()) {
      if (this.j.k() != null)
        this.e.a(this.j.k(), this.j.e()); 
      this.e.a(this.j.aL(), d());
    } else {
      this.f.a(this.j.aL(), d());
      this.f.a(this.j.k());
      this.f.b(this.j.e());
    } 
    this.e.f();
    this.f.f();
  }
  
  public boolean c() {
    return (this.f.c() || this.e.c());
  }
  
  public boolean d() {
    return this.k;
  }
  
  public void a(boolean paramBoolean) {
    this.k = paramBoolean;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/be/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */