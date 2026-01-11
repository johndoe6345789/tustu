package p;

import G.R;
import G.T;
import G.aI;
import G.i;
import G.q;
import S.a;
import S.e;
import S.h;
import S.n;
import ax.U;
import bH.X;
import bH.ab;
import bt.bh;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.bc;
import com.efiAnalytics.ui.cF;
import com.efiAnalytics.ui.eJ;
import com.efiAnalytics.ui.fp;
import d.c;
import d.e;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class g extends bh implements bc {
  private String p = "Define the name of this Event Trigger. It must be unique to all Event based triggers. Should not contain spaces or special characters.";
  
  private String q = "The target Action that will be triggered based on your Trigger conditions.";
  
  private String r = "When this condition becomes true, the Target Action will be triggered and run. The target Action is only executed 1 time until the reset condition is met.";
  
  private String s = "After trigger condition becomes true and fires the target action, the target action will not be fired again until this Reset condition is met. Once the reset condition is met, it will fire again upon the trigger condition being met";
  
  public static String a = "TimedResetSeconds:";
  
  R b = null;
  
  n c;
  
  List d = new ArrayList();
  
  JCheckBox e = new JCheckBox(s.g.b("Enabled"));
  
  JComboBox f = new JComboBox();
  
  JTextField g = new JTextField("", 12);
  
  JPanel h = new JPanel();
  
  JButton i = null;
  
  m j;
  
  m k;
  
  JDialog l = null;
  
  ab m = null;
  
  public g(ab paramab) {
    this.m = paramab;
    this.b = T.a().c();
    q();
  }
  
  private void q() {
    setLayout(new BorderLayout());
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new BorderLayout());
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new BoxLayout(jPanel2, 0));
    jPanel1.add("North", jPanel2);
    jPanel2.add(this.e);
    jPanel2.add(new JLabel("  "));
    this.g.setEditable(false);
    this.e.setEnabled(false);
    this.f.setEnabled(false);
    jPanel2.add(a(s.g.b("Trigger Name"), this.g, this.p));
    jPanel2.add(a(s.g.b("Target Action"), this.f, this.q));
    j();
    this.e.addActionListener(new h(this));
    this.h.setLayout(new BoxLayout(this.h, 1));
    JPanel jPanel3 = new JPanel();
    this.h.add(jPanel3);
    jPanel3.setLayout(new BorderLayout());
    this.j = new m(this, this.b, false, b(this.r));
    this.j.setBorder(BorderFactory.createTitledBorder(s.g.b("Trigger Action When")));
    jPanel3.add("Center", this.j);
    cF cF = new cF(this.r, this.m);
    JPanel jPanel4 = new JPanel();
    jPanel4.setLayout(new BorderLayout());
    jPanel4.add("North", (Component)cF);
    jPanel3.add("East", jPanel4);
    JPanel jPanel5 = new JPanel();
    this.h.add(jPanel5);
    jPanel5.setLayout(new BorderLayout());
    this.k = new m(this, this.b, true, b(this.s));
    this.k.setBorder(BorderFactory.createTitledBorder(s.g.b("Reset Condition")));
    jPanel5.add("Center", this.k);
    cF = new cF(this.s, this.m);
    jPanel4 = new JPanel();
    jPanel4.setLayout(new BorderLayout());
    jPanel4.add("North", (Component)cF);
    jPanel5.add("East", jPanel4);
    jPanel1.add("Center", this.h);
    add("Center", jPanel1);
    this.i = new JButton(b("Save"));
    this.i.addActionListener(new i(this));
    JPanel jPanel6 = new JPanel();
    jPanel6.setLayout(new FlowLayout(2));
    jPanel6.add(this.i);
    add("South", jPanel6);
    r();
  }
  
  private JPanel a(String paramString1, JComponent paramJComponent, String paramString2) {
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new BorderLayout());
    JLabel jLabel = new JLabel(paramString1 + ":");
    jLabel.setHorizontalAlignment(4);
    jLabel.setPreferredSize(eJ.a(100, 20));
    jPanel1.add("West", jLabel);
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new FlowLayout(0));
    jPanel2.add(paramJComponent);
    jPanel1.add("Center", jPanel2);
    if (paramString2 != null && !paramString2.isEmpty()) {
      cF cF = new cF(paramString2, this.m);
      jPanel1.add("East", (Component)cF);
    } 
    return jPanel1;
  }
  
  private String b(String paramString) {
    return (this.m != null) ? this.m.a(paramString) : paramString;
  }
  
  private void r() {
    if (this.e.isSelected()) {
      fp.a((Component)this, true);
      this.j.b();
      this.k.b();
    } else {
      fp.a((Component)this, false);
    } 
    this.e.setEnabled(true);
    this.i.setEnabled((this.c != null));
  }
  
  public void close() {
    e.a().a(this.b.c(), this.c.a());
    if (this.e.isSelected())
      try {
        e.a().a(this.b.c(), (a)this.c);
      } catch (q q) {
        bV.d("No Configuration Found: " + this.b.c(), this.e);
      }  
    super.close();
  }
  
  public void c() {
    a(e());
  }
  
  public void a(h paramh) {
    String str = "";
    if (paramh.a() == null || paramh.a().trim().isEmpty())
      str = str + s.g.b("Name is required.") + "\n"; 
    if (X.f(paramh.a()) || paramh.a().contains(" "))
      str = str + s.g.b("Name cannot contain special characters!") + "\n"; 
    try {
      i.a(paramh.d(), (aI)this.b);
    } catch (U u) {
      str = str + s.g.b("Invalid Trigger Expression") + ":" + this.j.a() + "\n";
      if (u.getMessage() != null && !u.getMessage().isEmpty())
        str = str + "     Err: " + s.g.b(u.getLocalizedMessage()) + "\n"; 
    } 
    if (!paramh.f())
      try {
        i.a(paramh.e(), (aI)this.b);
      } catch (U u) {
        str = str + s.g.b("Invalid Reset Expression") + ":" + this.k.a() + "\n";
        if (u.getMessage() != null && !u.getMessage().isEmpty())
          str = str + "     Err: " + s.g.b(u.getLocalizedMessage()) + "\n"; 
      }  
    if (!str.isEmpty())
      throw new e(str); 
  }
  
  public void a(f paramf) {
    this.d.add(paramf);
  }
  
  public boolean d() {
    for (f f : this.d) {
      if (!f.a())
        return false; 
    } 
    return true;
  }
  
  public h e() {
    h h = new h();
    h.g(this.g.getText());
    h.a(this.e.isSelected());
    h.e(this.j.a());
    if (this.k.a().contains(a)) {
      int i = Integer.parseInt(X.b(this.k.a(), a, ""));
      h.a(i * 1000);
    } else {
      h.f(this.k.a());
    } 
    return h;
  }
  
  public n f() {
    c();
    this.c.g(this.g.getText());
    this.c.a(this.e.isSelected());
    this.c.e(this.j.a());
    this.c.f(this.k.a());
    if (this.k.a().contains(a)) {
      int i = Integer.parseInt(X.b(this.k.a(), a, ""));
      this.c.a(i * 1000);
    } else {
      this.c.f(this.k.a());
    } 
    this.c.j(((l)this.f.getSelectedItem()).a().a());
    return this.c;
  }
  
  void a(n paramn) {
    paramn.g("TriggeredEvent");
    this.c = paramn;
    this.g.setText(paramn.a());
    this.g.setEditable(true);
    this.e.setEnabled(true);
    this.f.setEnabled(true);
    this.j.a(paramn.d());
    this.k.a(paramn.e());
    this.e.setSelected(paramn.c());
    r();
    this.g.selectAll();
    this.g.requestFocus();
  }
  
  boolean g() {
    return this.g.isEditable();
  }
  
  void h() {
    this.c = null;
    this.g.setEditable(false);
    this.g.setText("");
    this.e.setEnabled(false);
    this.f.setEnabled(false);
    this.j.a("");
    this.k.a("");
    r();
  }
  
  boolean i() {
    return (this.c != null && (!this.c.a().equals(this.g.getText()) || !this.c.d().equals(this.j.a()) || !this.c.e().equals(this.k.a()) || !this.c.i().equals(((l)this.f.getSelectedItem()).a().a()) || this.c.c() != this.e.isSelected()));
  }
  
  void b(n paramn) {
    this.c = paramn;
    if (paramn != null) {
      this.g.setText(paramn.a());
      this.g.setEditable(false);
      this.e.setEnabled(true);
      this.f.setEnabled(true);
      c c = d.g.a().b(paramn.i());
      if (c != null)
        for (byte b = 0; b < this.f.getItemCount(); b++) {
          l l = this.f.getItemAt(b);
          if (l != null && l.a() != null && l.a().a().equals(c.a())) {
            this.f.setSelectedIndex(b);
            break;
          } 
        }  
      this.j.a(paramn.d());
      if (paramn.f()) {
        m.a(this.k, paramn.g() / 1000);
      } else {
        this.k.a(paramn.e());
      } 
      this.e.setSelected(paramn.c());
      r();
    } else {
      h();
    } 
  }
  
  public void j() {
    l l = (l)this.f.getSelectedItem();
    this.f.removeAllItems();
    List<?> list = d.g.a().a(new j(this));
    Collections.sort(list, new k(this));
    for (c c : list) {
      l l1 = new l(this, c);
      this.f.addItem(l1);
    } 
    if (l != null)
      for (byte b = 0; b < this.f.getItemCount(); b++) {
        l l1 = this.f.getItemAt(b);
        if (l1.a().a().equals(l.a().a())) {
          this.f.setSelectedIndex(b);
          break;
        } 
      }  
  }
  
  void a(boolean paramBoolean) {
    this.e.setSelected(paramBoolean);
    r();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/p/g.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */