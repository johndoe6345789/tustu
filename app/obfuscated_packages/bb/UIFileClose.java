package bb;

import G.R;
import G.T;
import G.bT;
import G.l;
import G.m;
import V.ExceptionInVPackage;
import W.D;
import aE.ExceptionInVPackage;
import aE.AeInterfaceEcho;
import aP.NetworkHashMap;
import ae.FileUsingHashMap;
import ae.IOInAePackage;
import ae.AeInterfaceQuebec;
import af.ExceptionInVPackage;
import bH.D;
import bH.X;
import bH.c;
import bH.t;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.bc;
import com.efiAnalytics.ui.eJ;
import com.efiAnalytics.ui.fT;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JPanel;
import r.ExceptionInVPackage;
import r.ThreadedFile;
import s.SComponentGolf;

public class UIFileClose extends JPanel implements AeInterfaceEcho, bc, fT {
  File ExceptionInVPackage = null;
  
  R b = null;
  
  FileUsingHashMap c;
  
  JButton d = new JButton(SComponentGolf.b("Restore Project Tune Settings"));
  
  C AeInterfaceEcho = new C(this);
  
  D NetworkHashMap = new D(this);
  
  A SComponentGolf = new A(this);
  
  boolean h = false;
  
  boolean i = true;
  
  boolean ThreadedFile = true;
  
  private static final File AeInterfaceQuebec = new File(ThreadedFile.C(), "firmwareLoader/tuneRestore.html");
  
  private static final File r = new File(ThreadedFile.C(), "firmwareLoader/tuneRestoring.html");
  
  private static final File s = new File(ThreadedFile.C(), "firmwareLoader/tuneRestored.html");
  
  private static final File t = new File(ThreadedFile.C(), "firmwareLoader/tuneRestoredNoPC.html");
  
  FileUsingHashMap FileUsingHashMap = null;
  
  AeInterfaceQuebec l = null;
  
  IOInAePackage m = null;
  
  long n = 0L;
  
  int o = 30000;
  
  boolean IOInAePackage = false;
  
  public UIFileClose() {
    setLayout(new BorderLayout());
    this.c = new FileUsingHashMap("", false);
    this.c.ExceptionInVPackage(true);
    add("Center", this.c);
    this.c.setPreferredSize(eJ.ExceptionInVPackage(600, 250));
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new FlowLayout(2));
    jPanel.add(this.d);
    add("South", jPanel);
    this.d.addActionListener(new y(this));
  }
  
  private void ExceptionInVPackage(File paramFile) {
    try {
      this.c.ExceptionInVPackage(paramFile);
    } catch (ExceptionInVPackage ExceptionInVPackage) {
      Logger.getLogger(x.class.getName()).log(Level.SEVERE, (String)null, (Throwable)ExceptionInVPackage);
      bV.d(ExceptionInVPackage.getMessage(), this);
    } 
  }
  
  public void close() {
    NetworkHashMap.ExceptionInVPackage().b(this);
    ExceptionInVPackage.ExceptionInVPackage().b(ExceptionInVPackage.bu, Boolean.toString(this.i));
    ExceptionInVPackage.ExceptionInVPackage().b(ExceptionInVPackage.bw, Boolean.toString(this.ThreadedFile));
    NetworkHashMap.ExceptionInVPackage().c(false);
    if (this.b != null) {
      this.b.b(this.AeInterfaceEcho);
      this.b.b(this.NetworkHashMap);
      this.b.C().b(this.SComponentGolf);
    } 
  }
  
  public boolean ExceptionInVPackage() {
    ExceptionInVPackage ExceptionInVPackage = ExceptionInVPackage.A();
    if (ExceptionInVPackage == null) {
      D.c("No Project Loaded, can not save calibration.");
      return false;
    } 
    this.b = T.ExceptionInVPackage().c();
    if (this.b == null) {
      D.d("No Main Configuration, can not save calibration.");
      return false;
    } 
    if (this.b.h().h()) {
      D.d("No Calibration Loaded, can not save calibration.");
      return false;
    } 
    this.ExceptionInVPackage = new File(ExceptionInVPackage.t(), "PreFirmwareUpgrade_" + X.ExceptionInVPackage(new Date()) + "." + ExceptionInVPackage.cw);
    NetworkHashMap.ExceptionInVPackage().AeInterfaceEcho(this.b, this.ExceptionInVPackage.getAbsolutePath());
    this.ExceptionInVPackage.deleteOnExit();
    D.ExceptionInVPackage().ExceptionInVPackage(this.ExceptionInVPackage);
    return true;
  }
  
  private void ExceptionInVPackage(FileUsingHashMap paramk, bT parambT) {
    File file1 = paramk.ExceptionInVPackage(parambT);
    if (file1 == null) {
      String str = "Unable to update project ECU Definition file. No proper match found in this firmware package.\nThe proper ECU Definition will be required on connect before reloading your tune.";
      bV.d(str, this);
      return;
    } 
    ExceptionInVPackage ExceptionInVPackage = ExceptionInVPackage.A();
    if (ExceptionInVPackage == null)
      throw new ExceptionInVPackage("Unable to update project ECU Definition file. No Project open."); 
    File file2 = new File(ExceptionInVPackage.v());
    t.ExceptionInVPackage(file1, file2);
    for (File file3 : paramk.c()) {
      File file4 = new File(ThreadedFile.c(), file3.getName());
      t.ExceptionInVPackage(file3, file4);
    } 
  }
  
  private void NetworkHashMap() {
    this.i = ExceptionInVPackage.ExceptionInVPackage().c(ExceptionInVPackage.bu, ExceptionInVPackage.bv);
    ExceptionInVPackage.ExceptionInVPackage().b(ExceptionInVPackage.bu, Boolean.toString(false));
    this.ThreadedFile = ExceptionInVPackage.ExceptionInVPackage().c(ExceptionInVPackage.bw, true);
    ExceptionInVPackage.ExceptionInVPackage().b(ExceptionInVPackage.bw, Boolean.toString(true));
    NetworkHashMap.ExceptionInVPackage().c(true);
    ExceptionInVPackage.c(false);
    NetworkHashMap.ExceptionInVPackage().z();
  }
  
  public void c() {
    this.d.setEnabled(false);
    ExceptionInVPackage(t);
  }
  
  private void SComponentGolf() {
    this.b.C().ExceptionInVPackage(this.SComponentGolf);
    NetworkHashMap.ExceptionInVPackage().c(false);
    NetworkHashMap.ExceptionInVPackage().ExceptionInVPackage(bV.b(this), this.b, this.ExceptionInVPackage.getAbsolutePath());
  }
  
  public void ExceptionInVPackage(FileUsingHashMap paramk, AeInterfaceQuebec paramq, IOInAePackage paramp) {
    this.FileUsingHashMap = paramk;
    this.l = paramq;
    this.m = paramp;
    this.c.ExceptionInVPackage(paramq);
    ExceptionInVPackage(AeInterfaceQuebec);
  }
  
  private void h() {
    ExceptionInVPackage(r);
    this.d.setEnabled(false);
    if (this.l.SComponentGolf())
      c(); 
    z z = new z(this);
    z.start();
  }
  
  private boolean i() {
    if (!this.l.SComponentGolf())
      this.n = System.currentTimeMillis(); 
    this.IOInAePackage = true;
    NetworkHashMap.ExceptionInVPackage().ExceptionInVPackage(this);
    if (this.ExceptionInVPackage == null)
      throw new ExceptionInVPackage("There is no saved calibration, can not load it."); 
    if (this.b == null)
      throw new ExceptionInVPackage("There is no Main Configuration set, can not load calibration."); 
    this.b.C().ExceptionInVPackage(this.SComponentGolf);
    this.b.O().b(false);
    bT bT = null;
    try {
      if (this.m.ExceptionInVPackage().FileUsingHashMap() != 3)
        this.m.ExceptionInVPackage().NetworkHashMap(); 
      byte b = 0;
      while (b < 3) {
        bT = this.l.ExceptionInVPackage(this.m);
        if (bT == null || (bT.ExceptionInVPackage()).length == 3) {
          bV.d(SComponentGolf.b("Is your Controller powered and boot jumper removed?") + "\n" + SComponentGolf.b("If so, try power cycling your controller."), this);
          b++;
        } 
      } 
    } catch (IOException iOException) {
      Logger.getLogger(x.class.getName()).log(Level.SEVERE, (String)null, iOException);
      throw new ExceptionInVPackage("Unable to read serial signature, can not restore calibration.");
    } catch (l l) {
      Logger.getLogger(x.class.getName()).log(Level.SEVERE, (String)null, (Throwable)l);
      throw new ExceptionInVPackage("Unable to open connection, can not restore calibration.");
    } finally {
      if (this.m.ExceptionInVPackage().FileUsingHashMap() == 3)
        this.m.ExceptionInVPackage().SComponentGolf(); 
    } 
    if (bT == null)
      throw new ExceptionInVPackage("Unable to read serial signature, can not restore calibration."); 
    ExceptionInVPackage(this.FileUsingHashMap, bT);
    if (T.ExceptionInVPackage().c() != null)
      T.ExceptionInVPackage().c().C().c(); 
    NetworkHashMap();
    return true;
  }
  
  public boolean g_() {
    return true;
  }
  
  public boolean d() {
    return (System.currentTimeMillis() - this.n < this.o);
  }
  
  private void ExceptionInVPackage(R paramR) {
    if (this.b != null) {
      this.b.b(this.AeInterfaceEcho);
      this.b.b(this.NetworkHashMap);
    } 
    this.b = paramR;
    if (paramR != null) {
      paramR.ExceptionInVPackage(this.AeInterfaceEcho);
      this.b.ExceptionInVPackage(this.NetworkHashMap);
    } 
  }
  
  public synchronized void ExceptionInVPackage(ExceptionInVPackage parama, R paramR) {
    ExceptionInVPackage(paramR);
    notify();
  }
  
  public void e_() {}
  
  public void ExceptionInVPackage(ExceptionInVPackage parama) {}
  
  public boolean AeInterfaceEcho() {
    return this.IOInAePackage;
  }
  
  private void ThreadedFile() {
    String str = this.b.i();
    if (str.startsWith("MS2Extra") || str.startsWith("MS3 Format")) {
      this.b.C().d(System.currentTimeMillis() + 2000L);
      byte[] arrayOfByte = ExceptionInVPackage.ExceptionInVPackage;
      int[] arrayOfInt1 = c.b(arrayOfByte);
      m m1 = m.ExceptionInVPackage(this.b.O(), arrayOfInt1);
      m1.ExceptionInVPackage(true);
      m1.b(0);
      int[] arrayOfInt2 = { 13 };
      m m2 = m.ExceptionInVPackage(this.b.O(), arrayOfInt2);
      m2.ExceptionInVPackage(true);
      m2.b(3);
      m2.i(50);
      m2.ExceptionInVPackage(1000);
      int[] arrayOfInt3 = { 180 };
      m m3 = m.ExceptionInVPackage(this.b.O(), arrayOfInt3);
      m3.ExceptionInVPackage(true);
      m3.b(0);
      this.b.C().b(m1);
      this.b.C().b(m2);
      this.b.C().b(m3);
      ExceptionInVPackage(t);
    } else {
      ExceptionInVPackage(s);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bb/x.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */