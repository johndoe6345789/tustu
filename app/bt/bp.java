package bt;

import G.R;
import G.aM;
import G.aN;
import G.aR;
import G.bw;
import G.bx;
import V.a;
import V.g;
import V.j;
import bH.D;
import bH.p;
import com.efiAnalytics.ui.bc;
import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import s.g;

public class bp extends JPanel implements aN, bZ, ca, h, bc {
  private R a = null;
  
  private bx b = null;
  
  private y c = new y();
  
  private static String d = g.b("Custom");
  
  private ArrayList e = null;
  
  private boolean f = false;
  
  private String g = null;
  
  public bp(R paramR, bx parambx) {
    this.a = paramR;
    this.b = parambx;
    setLayout(new BorderLayout());
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new BorderLayout(3, 3));
    bb bb = new bb(g.b(parambx.l()));
    jPanel.add("Center", bb);
    jPanel.add("East", this.c);
    this.c.addItem(d);
    null = parambx.a();
    while (null.hasNext())
      this.c.addItem(g.b(((bw)null.next()).a())); 
    this.c.a(this);
    add("North", jPanel);
    this.e = a(parambx);
    for (String str : this.e) {
      aR aR = aR.a();
      try {
        aR.a(paramR.c(), str, this);
      } catch (a a) {
        a.printStackTrace();
        D.a("SettingSelector, Error subscribing to ParameterValue Changes. Parameter:" + str, (Exception)a, this);
      } 
    } 
    c();
  }
  
  private void c() {
    if (this.f)
      return; 
    bw bw = this.b.a(g.c(this.c.a()));
    if (bw != null && a(bw))
      return; 
    if (this.g != null) {
      bw = this.b.a(this.g);
      if (bw != null && a(bw))
        return; 
    } 
    Iterator<bw> iterator = this.b.a();
    while (iterator.hasNext()) {
      bw bw1 = iterator.next();
      boolean bool = a(bw1);
      if (bool)
        return; 
    } 
    this.c.a(d);
  }
  
  private boolean a(bw parambw) {
    Iterator<String> iterator = parambw.b();
    while (iterator.hasNext()) {
      String str = iterator.next();
      double d = parambw.a(str);
      aM aM = this.a.c(str);
      try {
        if (Math.abs(aM.j(this.a.h()) - d) > 1.0E-8D)
          return false; 
        if (!iterator.hasNext()) {
          this.c.setSelectedItem(g.b(parambw.a()));
          return true;
        } 
      } catch (g g) {
        return false;
      } 
    } 
    return false;
  }
  
  private void b(bw parambw) {
    this.f = true;
    Iterator<String> iterator = parambw.b();
    while (iterator.hasNext()) {
      String str = iterator.next();
      double d = parambw.a(str);
      aM aM = this.a.c(str);
      try {
        aM.a(this.a.h(), d);
      } catch (g g) {
        D.c("Unable to set parameter value for " + str);
        g.printStackTrace();
      } catch (j j) {
        D.b("Invalid value set in settingSelector '" + this.b.l() + "' for parameter:" + str);
      } 
    } 
    this.f = false;
    c();
  }
  
  private ArrayList a(bx parambx) {
    ArrayList<String> arrayList = new ArrayList();
    Iterator<bw> iterator = parambx.a();
    while (iterator.hasNext()) {
      bw bw = iterator.next();
      Iterator<String> iterator1 = bw.b();
      while (iterator1.hasNext()) {
        String str = iterator1.next();
        if (!arrayList.contains(str))
          arrayList.add(str); 
      } 
    } 
    return arrayList;
  }
  
  public void close() {
    aR aR = aR.a();
    aR.a(this);
  }
  
  public void a(String paramString1, String paramString2) {
    c();
  }
  
  public void b(String paramString) {
    if (!paramString.equals(d)) {
      bw bw = this.b.a(g.c(paramString));
      if (bw != null)
        b(bw); 
      this.g = paramString;
    } 
  }
  
  public void a() {
    if (this.b != null && this.b.aJ() != null && !this.b.aJ().isEmpty())
      try {
        boolean bool = p.a(this.b.aJ(), this.a);
        if (bool ^ this.c.isEnabled())
          this.c.setEnabled(bool); 
      } catch (g g) {
        Logger.getLogger(bp.class.getName()).log(Level.SEVERE, "Bad enable expresstion  on settingSelector", (Throwable)g);
      }  
  }
  
  public void b() {
    if (this.b != null && this.b.m() != null && !this.b.m().isEmpty())
      try {
        boolean bool = p.a(this.b.m(), this.a);
        if (bool ^ this.c.isVisible())
          this.c.setVisible(bool); 
      } catch (g g) {
        Logger.getLogger(bp.class.getName()).log(Level.SEVERE, "Bad enable expresstion  on settingSelector", (Throwable)g);
      }  
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/bp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */