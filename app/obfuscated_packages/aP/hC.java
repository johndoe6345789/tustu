package aP;

import A.AInterfaceCharlie;
import G.J;
import G.R;
import G.T;
import G.aI;
import G.bT;
import G.cR;
import G.cV;
import G.cu;
import G.h;
import G.i;
import G.l;
import G.r;
import G.s;
import J.ExceptionInVPackage;
import J.JPanelExtensionInRPackage;
import V.ExceptionInVPackage;
import W.I;
import W.ab;
import W.v;
import W.z;
import aD.ExceptionInVPackage;
import aE.ExceptionInVPackage;
import aV.AvInterfaceWhiskey;
import bH.D;
import bH.t;
import com.efiAnalytics.apps.ts.dashboard.Z;
import com.efiAnalytics.apps.ts.dashboard.aa;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.fL;
import com.efiAnalytics.ui.fS;
import java.awt.Component;
import java.awt.Container;
import java.awt.Window;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import r.ExceptionInVPackage;
import r.JPanelExtensionInRPackage;
import r.ThreadedFile;
import r.RInterfaceOscar;
import r.RInterfacePapa;
import s.SComponentGolf;
import v.AInterfaceCharlie;
import z.AInterfaceCharlie;

public class hC implements fS {
  aF ExceptionInVPackage = new aF();
  
  au JPanelExtensionInRPackage = new au();
  
  JPanelExtensionInRPackage AInterfaceCharlie = new JPanelExtensionInRPackage();
  
  ad d = new ad();
  
  aG e = null;
  
  hE f = null;
  
  fL SComponentGolf = null;
  
  Window h = null;
  
  R i = null;
  
  public hC(Window paramWindow) {
    this.h = paramWindow;
    hD hD = new hD(this);
    this.SComponentGolf = new fL("New " + ExceptionInVPackage.JPanelExtensionInRPackage + " Project", hD);
    try {
      this.SComponentGolf.e(this.JPanelExtensionInRPackage);
      this.JPanelExtensionInRPackage.ExceptionInVPackage(false);
      this.f = new hE(this, this.ExceptionInVPackage);
      this.SComponentGolf.e(this.f);
      this.SComponentGolf.e(this.d);
      this.SComponentGolf.e((Container)this.AInterfaceCharlie);
      this.AInterfaceCharlie.ExceptionInVPackage();
      this.SComponentGolf.ExceptionInVPackage(this);
    } catch (Exception exception) {
      String str = "Failed to build New Project Wizard, see log for details.";
      bV.d(str, paramWindow);
      D.ExceptionInVPackage(str);
      exception.printStackTrace();
    } 
  }
  
  public void ExceptionInVPackage() {
    JDialog jDialog = this.SComponentGolf.ExceptionInVPackage(this.h, SComponentGolf.JPanelExtensionInRPackage("Create New Project"));
    if (T.ExceptionInVPackage().AInterfaceCharlie() != null)
      T.ExceptionInVPackage().AInterfaceCharlie().C().AInterfaceCharlie(); 
    jDialog.setVisible(true);
  }
  
  public boolean JPanelExtensionInRPackage() {
    ExceptionInVPackage ExceptionInVPackage = new ExceptionInVPackage();
    ExceptionInVPackage.h(this.JPanelExtensionInRPackage.SComponentGolf().getAbsolutePath());
    ExceptionInVPackage.i(this.JPanelExtensionInRPackage.f());
    if (ExceptionInVPackage.A() != null) {
      f.ExceptionInVPackage().SComponentGolf();
      if (this.i != null)
        try {
          h.ExceptionInVPackage().ExceptionInVPackage((aI)this.i);
          T.ExceptionInVPackage().ExceptionInVPackage(this.i);
          T.ExceptionInVPackage().ExceptionInVPackage(this.i.AInterfaceCharlie());
        } catch (ExceptionInVPackage a1) {
          Logger.getLogger(hC.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a1);
        }  
    } 
    try {
      ExceptionInVPackage.ExceptionInVPackage();
      File file1 = this.JPanelExtensionInRPackage.h();
      String str1 = file1.getName().toLowerCase().endsWith(".ecu") ? "mainController.ecu" : "mainController.ini";
      ExceptionInVPackage.l(str1);
      ExceptionInVPackage.remove("firmwareDescription");
      t.ExceptionInVPackage(file1, ExceptionInVPackage.ThreadedFile());
      ExceptionInVPackage.RInterfacePapa(this.JPanelExtensionInRPackage.AInterfaceCharlie());
      ExceptionInVPackage.ExceptionInVPackage(this.ExceptionInVPackage.JPanelExtensionInRPackage());
      File file2 = this.AInterfaceCharlie.JPanelExtensionInRPackage();
      Z z = this.AInterfaceCharlie.e();
      t.ExceptionInVPackage(file2, ExceptionInVPackage.l());
      String str2 = z.ExceptionInVPackage(file1);
      z.JPanelExtensionInRPackage(str2);
      AInterfaceCharlie AInterfaceCharlie = new AInterfaceCharlie(ThreadedFile.G());
      AInterfaceCharlie.ExceptionInVPackage(ExceptionInVPackage.l().getAbsolutePath(), z);
      ExceptionInVPackage.RInterfaceOscar(ExceptionInVPackage.n());
      try {
        if (this.e != null)
          this.e.AInterfaceCharlie(); 
      } catch (ExceptionInVPackage a1) {
        D.ExceptionInVPackage("Error saving throttle calibration.", (Exception)a1, this.e);
      } 
      try {
        String str = (this.d.f() == null) ? "" : this.d.f();
        ExceptionInVPackage.ExceptionInVPackage(ExceptionInVPackage.u(), this.d.d());
        ExceptionInVPackage.JPanelExtensionInRPackage(ExceptionInVPackage.u(), str);
        this.d.ExceptionInVPackage(ExceptionInVPackage);
      } catch (Exception exception) {}
      this.d.ExceptionInVPackage(ExceptionInVPackage);
      ExceptionInVPackage.JPanelExtensionInRPackage();
      T.ExceptionInVPackage().JPanelExtensionInRPackage();
      this.AInterfaceCharlie.d();
      AInterfaceCharlie();
      f.ExceptionInVPackage().ExceptionInVPackage(dd.ExceptionInVPackage().AInterfaceCharlie(), this.JPanelExtensionInRPackage.SComponentGolf().getAbsolutePath());
    } catch (ExceptionInVPackage a1) {
      bV.d("Error creating Project " + this.JPanelExtensionInRPackage.f() + "\nProject Location:" + this.JPanelExtensionInRPackage.SComponentGolf().getAbsolutePath() + "\nError Message:\n" + a1.getMessage() + "\nSee log for more detail.\nBy restarting " + ExceptionInVPackage.JPanelExtensionInRPackage + " and opening this project,\n all will most likely be fine.", (Component)this.AInterfaceCharlie);
      a1.printStackTrace();
      return false;
    } 
    return true;
  }
  
  public void AInterfaceCharlie() {
    this.AInterfaceCharlie.d();
    R r = this.i;
    if (r != null) {
      J ThreadedFile = r.C();
      if (ThreadedFile != null)
        ThreadedFile.AInterfaceCharlie(); 
      T.ExceptionInVPackage().JPanelExtensionInRPackage(r.AInterfaceCharlie());
    } 
    if (T.ExceptionInVPackage().AInterfaceCharlie() != null)
      try {
        T.ExceptionInVPackage().AInterfaceCharlie().C().d();
      } catch (l l) {} 
    i.ExceptionInVPackage();
  }
  
  public boolean ExceptionInVPackage(Container paramContainer) {
    if (paramContainer instanceof au) {
      boolean bool = ((au)paramContainer).e();
      if (!bool)
        return false; 
      try {
        s[] arrayOfS = v.ExceptionInVPackage().JPanelExtensionInRPackage(this.JPanelExtensionInRPackage.h().getAbsolutePath());
        arrayOfS = (new I()).ExceptionInVPackage(arrayOfS, this.JPanelExtensionInRPackage.h().getAbsolutePath());
        this.ExceptionInVPackage.ExceptionInVPackage(arrayOfS);
      } catch (ExceptionInVPackage ExceptionInVPackage) {
        bV.d(ExceptionInVPackage.getMessage(), this.h);
      } 
      return true;
    } 
    if (paramContainer instanceof aF)
      return ((aF)paramContainer).e(); 
    if (paramContainer instanceof JPanelExtensionInRPackage)
      return ((JPanelExtensionInRPackage)paramContainer).f(); 
    if (paramContainer instanceof aG) {
      cu cu = cu.ExceptionInVPackage();
      cu.ExceptionInVPackage((aG)paramContainer);
    } 
    return true;
  }
  
  private R d() {
    if (this.i != null) {
      this.i.q(this.JPanelExtensionInRPackage.JPanelExtensionInRPackage());
      return this.i;
    } 
    if (this.JPanelExtensionInRPackage.h() == null)
      return null; 
    R r = new R();
    r.ExceptionInVPackage(this.JPanelExtensionInRPackage.f());
    r.q(this.JPanelExtensionInRPackage.JPanelExtensionInRPackage());
    r[] arrayOfR = this.ExceptionInVPackage.JPanelExtensionInRPackage();
    for (byte b1 = 0; b1 < arrayOfR.length; b1++)
      r.ExceptionInVPackage(arrayOfR[b1]); 
    ab ab = new ab();
    try {
      if (r.AInterfaceCharlie("tsCanId") == null)
        r = ab.ExceptionInVPackage(r, ThreadedFile.G, false); 
      r = ab.ExceptionInVPackage(r, this.JPanelExtensionInRPackage.h().getCanonicalPath());
      r.q(this.JPanelExtensionInRPackage.SComponentGolf().getAbsolutePath());
      r.AInterfaceCharlie(AInterfaceCharlie.ExceptionInVPackage().ExceptionInVPackage(r, ExceptionInVPackage.ba, AvInterfaceWhiskey.AInterfaceCharlie(), null, null));
      T.ExceptionInVPackage().ExceptionInVPackage(r);
      if (ExceptionInVPackage.JPanelExtensionInRPackage.equals(ExceptionInVPackage.as)) {
        ExceptionInVPackage ExceptionInVPackage = new ExceptionInVPackage();
        r.O().ExceptionInVPackage((cR)ExceptionInVPackage);
        JPanelExtensionInRPackage b2 = new JPanelExtensionInRPackage();
        r.O().ExceptionInVPackage((cV)b2);
        r.O().d(true);
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
      bV.d("Error loading ECU configuration.\nMessage:\n" + exception.getMessage(), this.d);
      return null;
    } 
    this.i = r;
    return this.i;
  }
  
  public boolean JPanelExtensionInRPackage(Container paramContainer) {
    if (paramContainer.equals(this.f)) {
      aF aF1 = this.ExceptionInVPackage;
      s[] arrayOfS = aF1.AInterfaceCharlie();
      if (arrayOfS == null || arrayOfS.length == 0)
        this.SComponentGolf.ExceptionInVPackage(); 
    } else if (paramContainer instanceof ad) {
      ad ad1 = (ad)paramContainer;
      R r = d();
      try {
        String str = this.JPanelExtensionInRPackage.i();
        List<AInterfaceCharlie> list = this.JPanelExtensionInRPackage.ThreadedFile();
        bT bT = this.JPanelExtensionInRPackage.k();
        ad1.k();
        ad1.ExceptionInVPackage(r);
        if (list != null && str != null) {
          ad1.ExceptionInVPackage("DetectedDevice", str, list, bT);
          ad1.AInterfaceCharlie();
        } else {
          list = new ArrayList();
          list.add(new AInterfaceCharlie("Baud Rate", ExceptionInVPackage.AInterfaceCharlie));
          ad1.ExceptionInVPackage("DetectedDevice", ExceptionInVPackage.d, list, new bT());
        } 
      } catch (ExceptionInVPackage ExceptionInVPackage) {
        D.ExceptionInVPackage("Error setting configuration to comm settings.", (Exception)ExceptionInVPackage, ad1);
      } 
    } else if (paramContainer instanceof JPanelExtensionInRPackage) {
      R r = d();
      aa aa = new aa();
      try {
        Z z;
        if (r.i().startsWith("MS3 Format") && (r.i().endsWith("P") || r.i().endsWith("E") || r.i().endsWith("U"))) {
          File file = new File(ThreadedFile.h(), "AMPMS3_Pro_Default.dash");
          z = (new AInterfaceCharlie(ThreadedFile.G())).ExceptionInVPackage(file.getAbsolutePath());
        } else if (r.i().startsWith("MS2Extra") && r.i().endsWith("P")) {
          File file = new File(ThreadedFile.h(), "AMP_MS2_PNP.dash");
          z = (new AInterfaceCharlie(ThreadedFile.G())).ExceptionInVPackage(file.getAbsolutePath());
        } else {
          z = aa.ExceptionInVPackage(r, "FrontPage", 2, 4);
        } 
        this.AInterfaceCharlie.ExceptionInVPackage(this.JPanelExtensionInRPackage.f(), z);
      } catch (Exception exception) {
        bV.d("Error in Front Page definition.", paramContainer);
      } 
      RInterfaceOscar RInterfaceOscar = RInterfacePapa.ExceptionInVPackage().JPanelExtensionInRPackage();
      String[] arrayOfString = new String[1];
      arrayOfString[0] = r.i();
      this.AInterfaceCharlie.ExceptionInVPackage(arrayOfString, RInterfaceOscar);
    } else if (paramContainer instanceof aG) {
      R r = d();
      aG aG1 = (aG)paramContainer;
      aG1.ExceptionInVPackage(r);
    } 
    return true;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/hC.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */