package bt;

import G.C;
import G.R;
import G.aG;
import G.aM;
import G.aN;
import G.aR;
import G.bT;
import V.a;
import V.g;
import V.j;
import aH.b;
import bH.D;
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
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPanel;
import q.h;
import r.i;
import s.g;

public class ac extends g implements aG, aN, L, h, d, bc, ItemListener {
  protected bb a = null;
  
  C b;
  
  R c = null;
  
  y d = null;
  
  private boolean i = false;
  
  DefaultComboBoxModel e = null;
  
  private final Vector j = new Vector();
  
  af f = new af(this);
  
  List g = new ArrayList();
  
  FocusAdapter h = new ad(this);
  
  public ac(R paramR, C paramC) {
    this.c = paramR;
    this.b = paramC;
    c_(paramC.aJ());
    setLayout(new BorderLayout());
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new BorderLayout(3, 3));
    String str = paramC.l();
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
      a a = new a(this.c, paramC.a());
      jPanel2.add(a);
    } 
    l l = new l(this.c, paramC.a());
    jPanel2.add(l);
    jPanel1.add("West", jPanel2);
    this.d = new y();
    this.d.b(2);
    for (byte b = 0; b < 15; b++) {
      ae ae = new ae(this, b);
      if (b != paramR.O().x())
        this.j.add(ae); 
    } 
    this.e = new DefaultComboBoxModel(this.j);
    this.d.setModel(this.e);
    this.d.addFocusListener(this.h);
    e();
    jPanel1.add("East", this.d);
    this.d.addItemListener(this);
    try {
      aR.a().a(paramR.c(), paramC.a(), this);
    } catch (a a) {
      Logger.getLogger(aj.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a);
    } 
    add("North", jPanel1);
    paramR.C().a(this);
    b.a().a(this.f);
    c();
  }
  
  public void close() {
    this.d.removeItemListener(this);
    this.d.removeFocusListener(this.h);
    h.a().a(this.a);
    aR.a().a(this);
    b.a().b(this.f);
    this.c.C().b(this);
  }
  
  public void a(String paramString1, String paramString2) {
    e();
  }
  
  private void e() {
    aM aM = this.c.c(this.b.a());
    try {
      int i = (int)aM.j(this.c.h());
      ae ae = a(i);
      this.d.setSelectedItem(ae);
    } catch (g g1) {
      Logger.getLogger(aj.class.getName()).log(Level.SEVERE, (String)null, (Throwable)g1);
    } 
  }
  
  public void itemStateChanged(ItemEvent paramItemEvent) {
    if (paramItemEvent.getStateChange() == 1) {
      ae ae = (ae)paramItemEvent.getItem();
      aM aM = this.c.c(this.b.a());
      int i = ae.a();
      try {
        aM.a(this.c.h(), i);
      } catch (g g1) {
        bV.d(g1.getMessage(), this.d);
      } catch (j j) {
        bV.d(j.getMessage(), this.d);
      } 
    } 
  }
  
  public void c() {
    b.a().a(this.c);
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
    if (a_() != null && this.d != null)
      try {
        boolean bool = p.a(a_(), this.c);
        setEnabled(bool);
      } catch (Exception exception) {
        if (!this.i) {
          bV.d("Invalid enable condition on field " + this.b.l() + ":\n { " + a_() + " } ", this);
          this.i = true;
        } 
        D.a(exception.getMessage());
      }  
  }
  
  public R b_() {
    return this.c;
  }
  
  public boolean a(String paramString, bT parambT) {
    c();
    return true;
  }
  
  public void a(String paramString) {}
  
  private ae a(int paramInt) {
    for (ae ae : this.j) {
      if (ae.a() == paramInt)
        return ae; 
    } 
    return null;
  }
  
  public void a(K paramK) {
    this.g.add(paramK);
  }
  
  public void b(K paramK) {
    this.g.remove(paramK);
  }
  
  private void b(String paramString) {
    for (K k : this.g)
      k.b(paramString); 
  }
  
  private void c(String paramString) {
    for (K k : this.g)
      k.a(paramString); 
  }
  
  public String d() {
    return this.b.a();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/ac.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */