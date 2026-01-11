package bt;

import G.R;
import G.aG;
import G.be;
import G.bi;
import G.db;
import G.i;
import V.a;
import V.g;
import bH.D;
import bH.p;
import c.d;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.bc;
import com.efiAnalytics.ui.et;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.KeyboardFocusManager;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import s.g;

public class bd extends JPanel implements h, p, d, bc {
  R a = null;
  
  bi b = null;
  
  be c = null;
  
  bu d = null;
  
  W e = null;
  
  JPanel f = new JPanel();
  
  bO g = null;
  
  private String k = null;
  
  JCheckBox h;
  
  JLabel i = new JLabel("", 2);
  
  et j = null;
  
  private bP l = null;
  
  private static String m = "checked3D";
  
  public bd(R paramR, bi parambi, be parambe) {
    this(paramR, parambi, parambe, new i("Multiview_" + parambe.aL()));
  }
  
  public bd(R paramR, bi parambi, be parambe, et paramet) {
    this.a = paramR;
    this.b = parambi;
    this.c = parambe;
    this.k = parambe.aJ();
    setLayout(new BorderLayout());
    this.j = paramet;
    boolean bool = a(m, "false").equals("true");
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new BorderLayout());
    this.h = new JCheckBox(g.b("3D View"));
    this.h.setFocusable(false);
    this.h.setSelected(bool);
    this.h.setMnemonic('D');
    this.h.addActionListener(new be(this));
    jPanel.add("East", this.h);
    db db = parambe.N();
    if (db != null) {
      String str;
      try {
        str = g.b(db.a());
      } catch (g g) {
        str = db.toString();
      } 
      this.i.setText(str);
      jPanel.add("West", this.i);
    } 
    bf bf = new bf(this, db);
    try {
      i.a(paramR.c(), db, bf);
    } catch (a a) {
      bV.d("Invalid Title Defined: " + db.toString() + "\nError: " + a.getLocalizedMessage(), this);
    } 
    add("North", jPanel);
    add("Center", this.f);
    a(this.h.isSelected());
    addFocusListener(new bg(this));
    bX bX = new bX(paramR, parambe, (e()).f, this);
    paramR.C().a(bX);
    this.l = bX;
    if (this.d != null) {
      this.d.e();
      this.d.a(this.l);
    } 
    if (this.e != null) {
      this.e.d();
      this.e.a(this.l);
    } 
  }
  
  private String a(String paramString1, String paramString2) {
    String str = null;
    if (this.j != null)
      str = this.j.a(paramString1); 
    return (str == null) ? paramString2 : str;
  }
  
  public void d() {
    if (this.e != null) {
      this.e.requestFocusInWindow();
    } else if (this.d != null) {
      this.d.requestFocusInWindow();
    } 
  }
  
  public void a(boolean paramBoolean) {
    if (paramBoolean) {
      this.e = f();
      a(this.e);
      this.g = new bO(this, this.e.b());
      KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(this.g);
    } else {
      if (this.c == null) {
        bV.d(this.b.a() + " 2D Table not found in configuration.", this);
        return;
      } 
      if (this.g != null) {
        KeyboardFocusManager.getCurrentKeyboardFocusManager().removeKeyEventDispatcher(this.g);
        this.g = null;
      } 
      this.d = e();
      a(this.d);
    } 
    d();
  }
  
  private void a(bu parambu) {
    this.f.removeAll();
    this.f.setLayout(new GridLayout());
    this.f.add(parambu);
    this.f.repaint();
    validate();
  }
  
  private void a(W paramW) {
    this.f.removeAll();
    this.f.setLayout(new BorderLayout());
    this.f.add("Center", paramW);
    this.f.repaint();
    validate();
  }
  
  public bu e() {
    if (this.d == null) {
      this.d = new bu(this.a, this.c);
      if (this.l != null)
        this.d.e(); 
    } 
    return this.d;
  }
  
  public W f() {
    if (this.e == null) {
      this.e = new W(this.a, this.b, false);
      if (this.l != null) {
        this.e.d();
        this.e.a(this.l);
      } 
    } 
    return this.e;
  }
  
  public void close() {
    Component[] arrayOfComponent = getComponents();
    for (byte b = 0; b < arrayOfComponent.length; b++) {
      if (arrayOfComponent[b] instanceof bc) {
        bc bc1 = (bc)arrayOfComponent[b];
        bc1.close();
      } 
    } 
    if (this.l != null) {
      this.l.b();
      if (this.l instanceof aG)
        this.a.C().b((aG)this.l); 
    } 
    if (this.g != null) {
      KeyboardFocusManager.getCurrentKeyboardFocusManager().removeKeyEventDispatcher(this.g);
      this.g = null;
    } 
    if (this.d != null) {
      this.d.close();
      this.d = null;
    } 
    if (this.e != null) {
      this.e.close();
      this.e = null;
    } 
  }
  
  public void a() {
    if (a_() != null) {
      boolean bool = true;
      try {
        bool = p.a(a_(), this.a);
        setEnabled(bool);
      } catch (Exception exception) {
        D.a(exception.getMessage());
        exception.printStackTrace();
      } 
    } 
  }
  
  public String a_() {
    return this.k;
  }
  
  public void c_(String paramString) {
    this.k = paramString;
  }
  
  public void setEnabled(boolean paramBoolean) {
    super.setEnabled(paramBoolean);
    if (this.d != null)
      this.d.setEnabled(paramBoolean); 
    if (this.e != null)
      this.e.setEnabled(paramBoolean); 
    this.h.setEnabled(paramBoolean);
  }
  
  public void a(bP parambP) {
    if (this.l != null) {
      this.l.b();
      if (this.l instanceof aG)
        this.a.C().b((aG)this.l); 
    } 
    this.l = parambP;
    if (this.d != null) {
      this.d.a(parambP);
      parambP.a();
    } 
    if (this.e != null) {
      this.e.a(parambP);
      parambP.a();
    } 
  }
  
  public void a(double paramDouble1, double paramDouble2) {
    if (this.h.isSelected()) {
      this.e.a(paramDouble1, paramDouble2);
    } else {
      this.d.a(paramDouble1, paramDouble2);
    } 
  }
  
  public int c() {
    return this.h.isSelected() ? 1 : this.d.f();
  }
  
  public R b_() {
    return this.a;
  }
  
  public be g() {
    return this.c;
  }
  
  public void a(float[] paramArrayOffloat1, float[] paramArrayOffloat2) {
    this.d.a(paramArrayOffloat1, paramArrayOffloat2);
    if (this.e != null && paramArrayOffloat2.length > 0 && paramArrayOffloat1.length > 0)
      this.e.a(paramArrayOffloat1[0], paramArrayOffloat2[0]); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/bd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */