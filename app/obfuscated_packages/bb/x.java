package bb;

import G.R;
import G.T;
import G.bT;
import G.l;
import G.m;
import V.a;
import W.D;
import aE.a;
import aE.e;
import aP.f;
import ae.k;
import ae.p;
import ae.q;
import af.a;
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
import r.a;
import r.j;
import s.g;

public class x extends JPanel implements e, bc, fT {
  File a = null;
  
  R b = null;
  
  k c;
  
  JButton d = new JButton(g.b("Restore Project Tune Settings"));
  
  C e = new C(this);
  
  D f = new D(this);
  
  A g = new A(this);
  
  boolean h = false;
  
  boolean i = true;
  
  boolean j = true;
  
  private static final File q = new File(j.C(), "firmwareLoader/tuneRestore.html");
  
  private static final File r = new File(j.C(), "firmwareLoader/tuneRestoring.html");
  
  private static final File s = new File(j.C(), "firmwareLoader/tuneRestored.html");
  
  private static final File t = new File(j.C(), "firmwareLoader/tuneRestoredNoPC.html");
  
  k k = null;
  
  q l = null;
  
  p m = null;
  
  long n = 0L;
  
  int o = 30000;
  
  boolean p = false;
  
  public x() {
    setLayout(new BorderLayout());
    this.c = new k("", false);
    this.c.a(true);
    add("Center", this.c);
    this.c.setPreferredSize(eJ.a(600, 250));
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new FlowLayout(2));
    jPanel.add(this.d);
    add("South", jPanel);
    this.d.addActionListener(new y(this));
  }
  
  private void a(File paramFile) {
    try {
      this.c.a(paramFile);
    } catch (a a) {
      Logger.getLogger(x.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a);
      bV.d(a.getMessage(), this);
    } 
  }
  
  public void close() {
    f.a().b(this);
    a.a().b(a.bu, Boolean.toString(this.i));
    a.a().b(a.bw, Boolean.toString(this.j));
    f.a().c(false);
    if (this.b != null) {
      this.b.b(this.e);
      this.b.b(this.f);
      this.b.C().b(this.g);
    } 
  }
  
  public boolean a() {
    a a = a.A();
    if (a == null) {
      D.c("No Project Loaded, can not save calibration.");
      return false;
    } 
    this.b = T.a().c();
    if (this.b == null) {
      D.d("No Main Configuration, can not save calibration.");
      return false;
    } 
    if (this.b.h().h()) {
      D.d("No Calibration Loaded, can not save calibration.");
      return false;
    } 
    this.a = new File(a.t(), "PreFirmwareUpgrade_" + X.a(new Date()) + "." + a.cw);
    f.a().e(this.b, this.a.getAbsolutePath());
    this.a.deleteOnExit();
    D.a().a(this.a);
    return true;
  }
  
  private void a(k paramk, bT parambT) {
    File file1 = paramk.a(parambT);
    if (file1 == null) {
      String str = "Unable to update project ECU Definition file. No proper match found in this firmware package.\nThe proper ECU Definition will be required on connect before reloading your tune.";
      bV.d(str, this);
      return;
    } 
    a a = a.A();
    if (a == null)
      throw new a("Unable to update project ECU Definition file. No Project open."); 
    File file2 = new File(a.v());
    t.a(file1, file2);
    for (File file3 : paramk.c()) {
      File file4 = new File(j.c(), file3.getName());
      t.a(file3, file4);
    } 
  }
  
  private void f() {
    this.i = a.a().c(a.bu, a.bv);
    a.a().b(a.bu, Boolean.toString(false));
    this.j = a.a().c(a.bw, true);
    a.a().b(a.bw, Boolean.toString(true));
    f.a().c(true);
    a.c(false);
    f.a().z();
  }
  
  public void c() {
    this.d.setEnabled(false);
    a(t);
  }
  
  private void g() {
    this.b.C().a(this.g);
    f.a().c(false);
    f.a().a(bV.b(this), this.b, this.a.getAbsolutePath());
  }
  
  public void a(k paramk, q paramq, p paramp) {
    this.k = paramk;
    this.l = paramq;
    this.m = paramp;
    this.c.a(paramq);
    a(q);
  }
  
  private void h() {
    a(r);
    this.d.setEnabled(false);
    if (this.l.g())
      c(); 
    z z = new z(this);
    z.start();
  }
  
  private boolean i() {
    if (!this.l.g())
      this.n = System.currentTimeMillis(); 
    this.p = true;
    f.a().a(this);
    if (this.a == null)
      throw new a("There is no saved calibration, can not load it."); 
    if (this.b == null)
      throw new a("There is no Main Configuration set, can not load calibration."); 
    this.b.C().a(this.g);
    this.b.O().b(false);
    bT bT = null;
    try {
      if (this.m.a().k() != 3)
        this.m.a().f(); 
      byte b = 0;
      while (b < 3) {
        bT = this.l.a(this.m);
        if (bT == null || (bT.a()).length == 3) {
          bV.d(g.b("Is your Controller powered and boot jumper removed?") + "\n" + g.b("If so, try power cycling your controller."), this);
          b++;
        } 
      } 
    } catch (IOException iOException) {
      Logger.getLogger(x.class.getName()).log(Level.SEVERE, (String)null, iOException);
      throw new a("Unable to read serial signature, can not restore calibration.");
    } catch (l l) {
      Logger.getLogger(x.class.getName()).log(Level.SEVERE, (String)null, (Throwable)l);
      throw new a("Unable to open connection, can not restore calibration.");
    } finally {
      if (this.m.a().k() == 3)
        this.m.a().g(); 
    } 
    if (bT == null)
      throw new a("Unable to read serial signature, can not restore calibration."); 
    a(this.k, bT);
    if (T.a().c() != null)
      T.a().c().C().c(); 
    f();
    return true;
  }
  
  public boolean g_() {
    return true;
  }
  
  public boolean d() {
    return (System.currentTimeMillis() - this.n < this.o);
  }
  
  private void a(R paramR) {
    if (this.b != null) {
      this.b.b(this.e);
      this.b.b(this.f);
    } 
    this.b = paramR;
    if (paramR != null) {
      paramR.a(this.e);
      this.b.a(this.f);
    } 
  }
  
  public synchronized void a(a parama, R paramR) {
    a(paramR);
    notify();
  }
  
  public void e_() {}
  
  public void a(a parama) {}
  
  public boolean e() {
    return this.p;
  }
  
  private void j() {
    String str = this.b.i();
    if (str.startsWith("MS2Extra") || str.startsWith("MS3 Format")) {
      this.b.C().d(System.currentTimeMillis() + 2000L);
      byte[] arrayOfByte = a.a;
      int[] arrayOfInt1 = c.b(arrayOfByte);
      m m1 = m.a(this.b.O(), arrayOfInt1);
      m1.a(true);
      m1.b(0);
      int[] arrayOfInt2 = { 13 };
      m m2 = m.a(this.b.O(), arrayOfInt2);
      m2.a(true);
      m2.b(3);
      m2.i(50);
      m2.a(1000);
      int[] arrayOfInt3 = { 180 };
      m m3 = m.a(this.b.O(), arrayOfInt3);
      m3.a(true);
      m3.b(0);
      this.b.C().b(m1);
      this.b.C().b(m2);
      this.b.C().b(m3);
      a(t);
    } else {
      a(s);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bb/x.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */