package aP;

import G.R;
import G.T;
import G.aM;
import G.r;
import G.s;
import V.a;
import V.g;
import V.j;
import W.I;
import W.v;
import W.z;
import aE.a;
import aE.d;
import aE.g;
import bH.D;
import bH.t;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.co;
import com.efiAnalytics.ui.ds;
import com.efiAnalytics.ui.fS;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Window;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import s.g;

public class ig implements fS {
  aF a = new aF();
  
  au b = new au();
  
  aM c = new aM();
  
  aq d = new aq();
  
  private a h = null;
  
  ds e = new ds("Project Properties");
  
  Window f = null;
  
  ArrayList g = new ArrayList();
  
  public ig(Window paramWindow) {
    this.f = paramWindow;
    try {
      this.e.a(this);
      this.b.b(true);
      this.e.a(this.b, "Configuration");
      JPanel jPanel = new JPanel();
      jPanel.setLayout(new FlowLayout(1));
      jPanel.add(this.a);
      ih ih = new ih(this, jPanel);
      this.e.a(ih, "Settings");
      this.e.a(this.d, "CAN Devices");
    } catch (Exception exception) {
      String str = "Failed to create Option tabs, see log for details.";
      bV.d(str, paramWindow);
      D.a(str);
      exception.printStackTrace();
    } 
  }
  
  public void a() {
    this.e.a(this.f, "Project Properties");
  }
  
  public boolean b() {
    try {
      if (!this.b.e()) {
        this.e.a(this.b);
        return false;
      } 
      File file = this.b.h();
      if (!file.equals(this.h.j())) {
        String str = file.getName().toLowerCase().endsWith(".ecu") ? "mainController.ecu" : "mainController.ini";
        this.h.l(str);
        t.a(file, this.h.j());
        a.A().remove("firmwareDescription");
      } 
      this.h.p(this.b.c());
      this.h.a(this.a.b());
      R r = T.a().c();
      if (r != null) {
        aM aM1 = r.c("tsCanId");
        try {
          if (aM1 != null)
            aM1.a(r.p(), this.d.b()); 
        } catch (g g1) {
          Logger.getLogger(ig.class.getName()).log(Level.SEVERE, (String)null, (Throwable)g1);
        } catch (j j) {
          Logger.getLogger(ig.class.getName()).log(Level.SEVERE, (String)null, (Throwable)j);
        } 
      } 
      this.h.a(this.d.b());
      this.h.b(this.d.c());
      if (this.d.d()) {
        d[] arrayOfD = this.d.a();
        this.h.H();
        if (arrayOfD != null)
          for (byte b = 0; b < arrayOfD.length; b++) {
            this.h.a(arrayOfD[b]);
            r = T.a().c(arrayOfD[b].a());
            if (r != null) {
              aM aM1 = r.c("tsCanId");
              try {
                aM1.a(r.p(), arrayOfD[b].e());
              } catch (g g1) {
                Logger.getLogger(ig.class.getName()).log(Level.SEVERE, (String)null, (Throwable)g1);
              } catch (j j) {
                Logger.getLogger(ig.class.getName()).log(Level.SEVERE, (String)null, (Throwable)j);
              } 
            } 
          }  
      } else {
        this.e.a(this.d);
        return false;
      } 
      String str1 = z.a(file);
      if (dd.a().h() != null) {
        dd.a().h().c(str1);
      } else if (dd.a().b() != null) {
        dd.a().b().c(str1);
      } 
      g g = this.h.i();
      g.setProperty("firstGearRatio", this.c.a());
      g.setProperty("secondGearRatio", this.c.b());
      g.setProperty("thirdGearRatio", this.c.c());
      g.setProperty("fourthGearRatio", this.c.d());
      g.setProperty("fifthGearRatio", this.c.e());
      g.setProperty("sixthGearRatio", this.c.f());
      g.setProperty("weight", this.c.j());
      String str2 = this.c.g() ? "Automatic" : "Manual";
      g.setProperty("transmissionType", str2);
      g.setProperty("converterStall", this.c.h());
      g.setProperty("finalDriveRatio", this.c.i());
      g.a(this.h.h());
      this.h.b();
      e();
      d();
      return true;
    } catch (a a1) {
      D.a("Unable to save changes. Error message:\n", (Exception)a1, this.b);
      a1.printStackTrace();
      return false;
    } 
  }
  
  public void c() {
    d();
  }
  
  private void d() {
    this.d.e();
  }
  
  public boolean a(Container paramContainer) {
    return true;
  }
  
  public boolean b(Container paramContainer) {
    return true;
  }
  
  public void a(a parama) {
    this.h = parama;
    this.b.a(parama.j());
    this.b.g(parama.u());
    this.b.c(parama.t());
    this.b.e(parama.B());
    if (parama.E().P() != null) {
      this.b.b(parama.E().P());
    } else {
      this.b.b(g.b("Serial Signature") + ": " + parama.E().i());
    } 
    s[] arrayOfS = v.a().b(parama.j().getAbsolutePath());
    arrayOfS = (new I()).a(arrayOfS, parama.j().getAbsolutePath());
    this.a.a(arrayOfS);
    R r = T.a().c();
    this.e.a("CAN Devices", r.b());
    HashMap hashMap = r.m();
    for (String str : hashMap.keySet()) {
      if (hashMap.get(str) != null && (str.equals("") || str.equals("DEFAULT"))) {
        this.a.a((r)hashMap.get(str));
        continue;
      } 
      this.a.a(str);
    } 
    g g = parama.i();
    this.c.a(g.getProperty("firstGearRatio", ""));
    this.c.b(g.getProperty("secondGearRatio", ""));
    this.c.c(g.getProperty("thirdGearRatio", ""));
    this.c.d(g.getProperty("fourthGearRatio", ""));
    this.c.e(g.getProperty("fifthGearRatio", ""));
    this.c.f(g.getProperty("sixthGearRatio", ""));
    this.c.i(g.getProperty("weight", ""));
    boolean bool = g.getProperty("transmissionType", "").equals("Automatic");
    this.c.a(bool);
    this.c.g(g.getProperty("converterStall", ""));
    this.c.h(g.getProperty("finalDriveRatio", ""));
    this.d.a(parama);
  }
  
  public void a(String paramString) {
    this.e.a(paramString);
  }
  
  public void a(co paramco) {
    this.g.add(paramco);
  }
  
  private void e() {
    for (co co : this.g)
      co.a(); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/ig.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */