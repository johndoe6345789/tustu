package bt;

import G.D;
import G.R;
import G.T;
import G.aM;
import G.aN;
import G.aR;
import V.a;
import V.g;
import V.j;
import bH.D;
import bH.S;
import bH.p;
import c.d;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.bc;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.FocusAdapter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import q.h;
import r.i;
import s.g;

public class ah extends g implements aN, L, bZ, h, d, bc {
  protected bb a = null;
  
  D b;
  
  R c = null;
  
  y d = null;
  
  private boolean g = false;
  
  List e = new ArrayList();
  
  FocusAdapter f = new ai(this);
  
  public ah(R paramR, D paramD) {
    this.c = paramR;
    this.b = paramD;
    c_(paramD.aJ());
    setLayout(new BorderLayout());
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new BorderLayout(3, 3));
    String str = paramD.l();
    if (str != null)
      str = g.b(str); 
    if (str != null && str.length() == 0)
      str = " "; 
    try {
      this.a = (bb)h.a().a(bb.class);
      this.a.setText(str);
    } catch (Exception exception) {
      this.a = new bb(str);
      D.b("Failed to get SettingsLabel from cache, creating...");
    } 
    jPanel1.add("Center", this.a);
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new GridLayout(1, 0, 2, 2));
    if (i.a().a("lkjfgblkjgdoijre98u")) {
      a a = new a(this.c, paramD.a());
      jPanel2.add(a);
    } 
    l l = new l(this.c, paramD.a());
    jPanel2.add(l);
    jPanel1.add("West", jPanel2);
    try {
      this.d = (y)h.a().a(y.class);
    } catch (Exception exception) {
      this.d = new y();
      D.b("Cache Failed, creating new UI Component");
    } 
    String[] arrayOfString = T.a().d();
    arrayOfString = (String[])S.a((Object[])arrayOfString);
    for (String str1 : arrayOfString) {
      int i = T.a().c(str1).O().x();
      this.d.a(i + "", str1);
    } 
    c();
    jPanel1.add("East", this.d);
    this.d.a(this);
    this.d.addFocusListener(this.f);
    try {
      aR.a().a(paramR.c(), paramD.a(), this);
    } catch (a a) {
      Logger.getLogger(aj.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a);
    } 
    add("North", jPanel1);
  }
  
  public void close() {
    this.d.removeFocusListener(this.f);
    this.d.b(this);
    h.a().a(this.a);
    h.a().a(this.d);
    aR.a().a(this);
  }
  
  public void a(String paramString1, String paramString2) {
    c();
  }
  
  private void c() {
    aM aM = this.c.c(this.b.a());
    try {
      int i = (int)aM.j(this.c.h());
      for (byte b = 0; b < this.d.getItemCount(); b++) {
        int j = Integer.parseInt(this.d.a(b));
        if (i == j) {
          this.d.setSelectedIndex(b);
          return;
        } 
      } 
    } catch (g g1) {
      Logger.getLogger(aj.class.getName()).log(Level.SEVERE, (String)null, (Throwable)g1);
    } 
  }
  
  public void b(String paramString) {
    aM aM = this.c.c(this.b.a());
    int i = Integer.parseInt(paramString);
    try {
      aM.a(this.c.h(), i);
    } catch (g g1) {
      bV.d(g1.getMessage(), this.d);
    } catch (j j) {
      bV.d(j.getMessage(), this.d);
    } 
  }
  
  public void setEnabled(boolean paramBoolean) {
    super.setEnabled(paramBoolean);
    a(this, paramBoolean);
  }
  
  public void setFont(Font paramFont) {
    super.setFont(paramFont);
    if (this.d != null)
      this.d.setFont(paramFont); 
    if (this.a != null)
      this.a.setFont(paramFont); 
  }
  
  private void a(Container paramContainer, boolean paramBoolean) {
    Component[] arrayOfComponent = paramContainer.getComponents();
    for (byte b = 0; b < arrayOfComponent.length; b++) {
      arrayOfComponent[b].setEnabled(paramBoolean);
      if (arrayOfComponent[b] instanceof Container)
        a((Container)arrayOfComponent[b], paramBoolean); 
    } 
  }
  
  public void a() {
    if (a_() != null && this.d != null) {
      boolean bool = true;
      try {
        if (i.a().a("HF;'[PG-05")) {
          bool = p.a(a_(), this.c);
        } else {
          bool = false;
        } 
        setEnabled(bool);
      } catch (Exception exception) {
        if (!this.g) {
          bV.d("Invalid enable condition on field " + this.b.l() + ":\n { " + a_() + " } ", this);
          this.g = true;
        } 
        D.a(exception.getMessage());
      } 
    } 
  }
  
  public R b_() {
    return this.c;
  }
  
  public void a(K paramK) {
    this.e.add(paramK);
  }
  
  public void b(K paramK) {
    this.e.remove(paramK);
  }
  
  private void c(String paramString) {
    for (K k : this.e)
      k.b(paramString); 
  }
  
  private void d(String paramString) {
    for (K k : this.e)
      k.a(paramString); 
  }
  
  public String d() {
    return this.b.a();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/ah.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */