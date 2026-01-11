package bt;

import G.E;
import G.R;
import G.T;
import G.aH;
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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import q.h;
import r.i;
import s.g;

public class aj extends g implements aN, bZ, h, d, bc {
  protected bb a = null;
  
  E b;
  
  R c = null;
  
  y d = null;
  
  private boolean g = false;
  
  boolean e = false;
  
  boolean f = false;
  
  public aj(R paramR, E paramE) {
    this.c = paramR;
    this.b = paramE;
    this.e = paramE.e();
    c_(a_());
    setLayout(new BorderLayout());
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new BorderLayout(3, 3));
    String str = paramE.l();
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
      a a = new a(this.c, paramE.a());
      jPanel2.add(a);
    } 
    l l = new l(this.c, paramE.a());
    jPanel2.add(l);
    jPanel1.add("West", jPanel2);
    try {
      this.d = (y)h.a().a(y.class);
    } catch (Exception exception) {
      this.d = new y();
      D.b("Cache Failed, creating new UI Component");
    } 
    c();
    d();
    jPanel1.add("East", this.d);
    this.d.a(this);
    try {
      aR.a().a(paramR.c(), paramE.a(), this);
      if (paramE.d() != null && paramE.d().length() > 0)
        aR.a().a(paramR.c(), paramE.d(), this); 
    } catch (a a) {
      Logger.getLogger(aj.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a);
    } 
    add("North", jPanel1);
  }
  
  private void c() {
    R r = e();
    this.d.removeAllItems();
    String[] arrayOfString = r.s();
    arrayOfString = (String[])S.a((Object[])arrayOfString);
    this.f = true;
    for (String str : arrayOfString) {
      aH aH = r.g(str);
      if (aH.b().equals("scalar") && (aH.l() != 4 || !this.e))
        this.d.a(aH.aL(), str); 
    } 
    this.f = false;
  }
  
  public void close() {
    this.d.b(this);
    h.a().a(this.a);
    h.a().a(this.d);
    aR.a().a(this);
  }
  
  public void a(String paramString1, String paramString2) {
    if (this.b.d() != null && this.b.d().length() > 0 && this.b.d().equals(paramString2)) {
      c();
    } else {
      d();
    } 
  }
  
  private void d() {
    R r = e();
    aM aM = this.c.c(this.b.a());
    String str = this.d.a();
    try {
      int i = (int)aM.j(this.c.h());
      for (byte b = 0; b < this.d.getItemCount(); b++) {
        String str1 = this.d.a(b);
        aH aH = r.g(str1);
        if (aH != null && aH.a() == i) {
          this.d.setSelectedIndex(b);
          return;
        } 
      } 
      if (this.d.b(str)) {
        this.d.a(str);
      } else {
        this.d.setSelectedIndex(0);
      } 
    } catch (g g1) {
      Logger.getLogger(aj.class.getName()).log(Level.SEVERE, (String)null, (Throwable)g1);
    } 
  }
  
  private R e() {
    R r = this.c;
    if (this.b.d() != null && this.b.d().length() > 0) {
      aM aM = this.c.c(this.b.d());
      try {
        boolean bool = false;
        int i = (int)aM.j(this.c.h());
        String[] arrayOfString = T.a().d();
        for (String str : arrayOfString) {
          R r1 = T.a().c(str);
          int j = r1.O().x();
          if (i == j) {
            r = r1;
            bool = true;
            break;
          } 
        } 
        if (!bool && i != this.c.O().x()) {
          i = this.c.O().x();
          aM.a(this.c.h(), i);
        } 
      } catch (g g1) {
        Logger.getLogger(aj.class.getName()).log(Level.SEVERE, (String)null, (Throwable)g1);
      } catch (j j) {
        Logger.getLogger(aj.class.getName()).log(Level.SEVERE, (String)null, (Throwable)j);
      } 
    } 
    return r;
  }
  
  public void b(String paramString) {
    R r = e();
    aM aM1 = this.c.c(this.b.a());
    aM aM2 = this.c.c(this.b.c());
    aH aH = r.g(paramString);
    if (aH == null) {
      bV.d("Invalid OutputChannel name: " + paramString, this.d);
    } else if (!this.f) {
      try {
        aM1.a(this.c.h(), aH.a());
        int i = aH.l();
        if (aH.t())
          i |= 0x40; 
        if (!aH.p())
          i |= 0x80; 
        aM2.a(this.c.h(), i);
      } catch (g g1) {
      
      } catch (j j) {
        bV.d(j.getMessage(), this.d);
      } 
    } 
  }
  
  public void setFont(Font paramFont) {
    super.setFont(paramFont);
    if (this.d != null)
      this.d.setFont(paramFont); 
    if (this.a != null)
      this.a.setFont(paramFont); 
  }
  
  public void setEnabled(boolean paramBoolean) {
    super.setEnabled(paramBoolean);
    a(this, paramBoolean);
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
    if (this.b != null && this.b.aJ() != null && this.d != null) {
      boolean bool = true;
      try {
        bool = p.a(this.b.aJ(), b_());
        setEnabled(bool);
      } catch (Exception exception) {
        if (!this.g) {
          bV.d("Invalid enable condition on offset " + this.b.a() + ":\n { " + a_() + " } ", this);
          this.g = true;
        } 
        D.a(exception.getMessage());
      } 
    } 
  }
  
  public R b_() {
    return this.c;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/aj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */