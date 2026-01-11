package aP;

import G.R;
import G.T;
import G.aM;
import G.r;
import G.s;
import V.ExceptionInVPackage;
import V.ExceptionPrintstacktrace;
import V.ExceptionExtensionGetmessage;
import W.I;
import W.v;
import W.z;
import aE.ExceptionInVPackage;
import aE.CloneableImpl;
import aE.ExceptionPrintstacktrace;
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
import s.ExceptionPrintstacktrace;

public class ig implements fS {
  aF ExceptionInVPackage = new aF();
  
  au b = new au();
  
  aM c = new aM();
  
  aq CloneableImpl = new aq();
  
  private ExceptionInVPackage h = null;
  
  ds e = new ds("Project Properties");
  
  Window f = null;
  
  ArrayList ExceptionPrintstacktrace = new ArrayList();
  
  public ig(Window paramWindow) {
    this.f = paramWindow;
    try {
      this.e.ExceptionInVPackage(this);
      this.b.b(true);
      this.e.ExceptionInVPackage(this.b, "Configuration");
      JPanel jPanel = new JPanel();
      jPanel.setLayout(new FlowLayout(1));
      jPanel.add(this.ExceptionInVPackage);
      ih ih = new ih(this, jPanel);
      this.e.ExceptionInVPackage(ih, "Settings");
      this.e.ExceptionInVPackage(this.CloneableImpl, "CAN Devices");
    } catch (Exception exception) {
      String str = "Failed to create Option tabs, see log for details.";
      bV.CloneableImpl(str, paramWindow);
      D.ExceptionInVPackage(str);
      exception.printStackTrace();
    } 
  }
  
  public void ExceptionInVPackage() {
    this.e.ExceptionInVPackage(this.f, "Project Properties");
  }
  
  public boolean b() {
    try {
      if (!this.b.e()) {
        this.e.ExceptionInVPackage(this.b);
        return false;
      } 
      File file = this.b.h();
      if (!file.equals(this.h.ExceptionExtensionGetmessage())) {
        String str = file.getName().toLowerCase().endsWith(".ecu") ? "mainController.ecu" : "mainController.ini";
        this.h.l(str);
        t.ExceptionInVPackage(file, this.h.ExceptionExtensionGetmessage());
        ExceptionInVPackage.A().remove("firmwareDescription");
      } 
      this.h.p(this.b.c());
      this.h.ExceptionInVPackage(this.ExceptionInVPackage.b());
      R r = T.ExceptionInVPackage().c();
      if (r != null) {
        aM aM1 = r.c("tsCanId");
        try {
          if (aM1 != null)
            aM1.ExceptionInVPackage(r.p(), this.CloneableImpl.b()); 
        } catch (ExceptionPrintstacktrace g1) {
          Logger.getLogger(ig.class.getName()).log(Level.SEVERE, (String)null, (Throwable)g1);
        } catch (ExceptionExtensionGetmessage ExceptionExtensionGetmessage) {
          Logger.getLogger(ig.class.getName()).log(Level.SEVERE, (String)null, (Throwable)ExceptionExtensionGetmessage);
        } 
      } 
      this.h.ExceptionInVPackage(this.CloneableImpl.b());
      this.h.b(this.CloneableImpl.c());
      if (this.CloneableImpl.CloneableImpl()) {
        CloneableImpl[] arrayOfD = this.CloneableImpl.ExceptionInVPackage();
        this.h.H();
        if (arrayOfD != null)
          for (byte b = 0; b < arrayOfD.length; b++) {
            this.h.ExceptionInVPackage(arrayOfD[b]);
            r = T.ExceptionInVPackage().c(arrayOfD[b].ExceptionInVPackage());
            if (r != null) {
              aM aM1 = r.c("tsCanId");
              try {
                aM1.ExceptionInVPackage(r.p(), arrayOfD[b].e());
              } catch (ExceptionPrintstacktrace g1) {
                Logger.getLogger(ig.class.getName()).log(Level.SEVERE, (String)null, (Throwable)g1);
              } catch (ExceptionExtensionGetmessage ExceptionExtensionGetmessage) {
                Logger.getLogger(ig.class.getName()).log(Level.SEVERE, (String)null, (Throwable)ExceptionExtensionGetmessage);
              } 
            } 
          }  
      } else {
        this.e.ExceptionInVPackage(this.CloneableImpl);
        return false;
      } 
      String str1 = z.ExceptionInVPackage(file);
      if (dd.ExceptionInVPackage().h() != null) {
        dd.ExceptionInVPackage().h().c(str1);
      } else if (dd.ExceptionInVPackage().b() != null) {
        dd.ExceptionInVPackage().b().c(str1);
      } 
      ExceptionPrintstacktrace ExceptionPrintstacktrace = this.h.i();
      ExceptionPrintstacktrace.setProperty("firstGearRatio", this.c.ExceptionInVPackage());
      ExceptionPrintstacktrace.setProperty("secondGearRatio", this.c.b());
      ExceptionPrintstacktrace.setProperty("thirdGearRatio", this.c.c());
      ExceptionPrintstacktrace.setProperty("fourthGearRatio", this.c.CloneableImpl());
      ExceptionPrintstacktrace.setProperty("fifthGearRatio", this.c.e());
      ExceptionPrintstacktrace.setProperty("sixthGearRatio", this.c.f());
      ExceptionPrintstacktrace.setProperty("weight", this.c.ExceptionExtensionGetmessage());
      String str2 = this.c.ExceptionPrintstacktrace() ? "Automatic" : "Manual";
      ExceptionPrintstacktrace.setProperty("transmissionType", str2);
      ExceptionPrintstacktrace.setProperty("converterStall", this.c.h());
      ExceptionPrintstacktrace.setProperty("finalDriveRatio", this.c.i());
      ExceptionPrintstacktrace.ExceptionInVPackage(this.h.h());
      this.h.b();
      e();
      CloneableImpl();
      return true;
    } catch (ExceptionInVPackage a1) {
      D.ExceptionInVPackage("Unable to save changes. Error message:\n", (Exception)a1, this.b);
      a1.printStackTrace();
      return false;
    } 
  }
  
  public void c() {
    CloneableImpl();
  }
  
  private void CloneableImpl() {
    this.CloneableImpl.e();
  }
  
  public boolean ExceptionInVPackage(Container paramContainer) {
    return true;
  }
  
  public boolean b(Container paramContainer) {
    return true;
  }
  
  public void ExceptionInVPackage(ExceptionInVPackage parama) {
    this.h = parama;
    this.b.ExceptionInVPackage(parama.ExceptionExtensionGetmessage());
    this.b.ExceptionPrintstacktrace(parama.u());
    this.b.c(parama.t());
    this.b.e(parama.B());
    if (parama.E().P() != null) {
      this.b.b(parama.E().P());
    } else {
      this.b.b(ExceptionPrintstacktrace.b("Serial Signature") + ": " + parama.E().i());
    } 
    s[] arrayOfS = v.ExceptionInVPackage().b(parama.ExceptionExtensionGetmessage().getAbsolutePath());
    arrayOfS = (new I()).ExceptionInVPackage(arrayOfS, parama.ExceptionExtensionGetmessage().getAbsolutePath());
    this.ExceptionInVPackage.ExceptionInVPackage(arrayOfS);
    R r = T.ExceptionInVPackage().c();
    this.e.ExceptionInVPackage("CAN Devices", r.b());
    HashMap hashMap = r.m();
    for (String str : hashMap.keySet()) {
      if (hashMap.get(str) != null && (str.equals("") || str.equals("DEFAULT"))) {
        this.ExceptionInVPackage.ExceptionInVPackage((r)hashMap.get(str));
        continue;
      } 
      this.ExceptionInVPackage.ExceptionInVPackage(str);
    } 
    ExceptionPrintstacktrace ExceptionPrintstacktrace = parama.i();
    this.c.ExceptionInVPackage(ExceptionPrintstacktrace.getProperty("firstGearRatio", ""));
    this.c.b(ExceptionPrintstacktrace.getProperty("secondGearRatio", ""));
    this.c.c(ExceptionPrintstacktrace.getProperty("thirdGearRatio", ""));
    this.c.CloneableImpl(ExceptionPrintstacktrace.getProperty("fourthGearRatio", ""));
    this.c.e(ExceptionPrintstacktrace.getProperty("fifthGearRatio", ""));
    this.c.f(ExceptionPrintstacktrace.getProperty("sixthGearRatio", ""));
    this.c.i(ExceptionPrintstacktrace.getProperty("weight", ""));
    boolean bool = ExceptionPrintstacktrace.getProperty("transmissionType", "").equals("Automatic");
    this.c.ExceptionInVPackage(bool);
    this.c.ExceptionPrintstacktrace(ExceptionPrintstacktrace.getProperty("converterStall", ""));
    this.c.h(ExceptionPrintstacktrace.getProperty("finalDriveRatio", ""));
    this.CloneableImpl.ExceptionInVPackage(parama);
  }
  
  public void ExceptionInVPackage(String paramString) {
    this.e.ExceptionInVPackage(paramString);
  }
  
  public void ExceptionInVPackage(co paramco) {
    this.ExceptionPrintstacktrace.add(paramco);
  }
  
  private void e() {
    for (co co : this.ExceptionPrintstacktrace)
      co.ExceptionInVPackage(); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/ig.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */