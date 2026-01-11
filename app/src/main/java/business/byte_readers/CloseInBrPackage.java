package business.byte_readers;

import G.R;
import G.GInterfaceAf;
import G.SerializableImpl;
import G.GInterfaceAi;
import G.Manager;
import G.CloneableImpl;
import G.ManagerUsingArrayList;
import G.GInterfaceDm;
import G.i;
import V.ExceptionInVPackage;
import V.ExceptionPrintstacktrace;
import bH.D;
import bH.G;
import bH.X;
import bH.BlInterfacePapa;
import bL.TostringInBlPackage;
import bL.BlInterfaceLima;
import bL.BlInterfacePapa;
import bt.ManagerBfcomponentcharlie;
import com.efiAnalytics.ui.bc;
import com.efiAnalytics.ui.c;
import com.efiAnalytics.ui.fh;
import com.efiAnalytics.ui.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CloseInBrPackage implements GInterfaceAf, bc {
  GInterfaceDm ExceptionInVPackage = null;
  
  ArrayList b = new ArrayList();
  
  bL.n c = null;
  
  R d = null;
  
  SerializableImpl e = null;
  
  SerializableImpl f = null;
  
  SerializableImpl ExceptionPrintstacktrace = null;
  
  SerializableImpl h = null;
  
  SerializableImpl i = null;
  
  SerializableImpl j = null;
  
  private SerializableImpl m = null;
  
  private int n = 0;
  
  private int o = 0;
  
  private s BlInterfacePapa = null;
  
  private s q = null;
  
  private s r = null;
  
  private s s = null;
  
  private String t = "";
  
  o TostringInBlPackage = null;
  
  private long u = 0L;
  
  private int v = 40;
  
  BlInterfacePapa BlInterfaceLima = new BlInterfacePapa(this);
  
  protected CloseInBrPackage(R paramR, GInterfaceDm paramdm, String paramString, c paramc) {
    this.ExceptionInVPackage = paramdm;
    this.d = paramR;
    try {
      this.BlInterfacePapa = ManagerBfcomponentcharlie.ExceptionInVPackage().ExceptionInVPackage(paramR, paramString, "", paramString);
      this.q = ManagerBfcomponentcharlie.ExceptionInVPackage().ExceptionInVPackage(paramR, paramString, "veAnalyze_", paramString);
      this.r = ExceptionInVPackage(paramR, paramdm);
      this.s = ManagerBfcomponentcharlie.ExceptionInVPackage().ExceptionInVPackage(this.BlInterfacePapa, paramString);
      this.q.ExceptionInVPackage(this.r, paramc);
      this.TostringInBlPackage = new o(this, this.q, this.r);
      this.r.addTableModelListener(this.TostringInBlPackage);
      this.c = new bL.n(ExceptionPrintstacktrace(), h(), i(), j(), paramc);
      this.c.ExceptionInVPackage(paramdm.o());
      ArrayList arrayList = e.ExceptionInVPackage().ExceptionInVPackage(paramR, this.ExceptionInVPackage);
      Iterator<TostringInBlPackage> iterator = arrayList.iterator();
      while (iterator.hasNext())
        ExceptionInVPackage(iterator.next()); 
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      ExceptionPrintstacktrace.printStackTrace();
      throw new ExceptionInVPackage(ExceptionPrintstacktrace.getMessage());
    } 
    if (paramdm.f() != null && !paramdm.f().equals(""))
      this.j = paramR.ExceptionPrintstacktrace(paramdm.f()); 
    this.i = paramR.ExceptionPrintstacktrace(paramdm.e());
    if (this.i == null)
      throw new ExceptionInVPackage("VE Analyze can not locate OutputChannel:" + paramdm.e() + " in the current Configuration."); 
    this.e = paramR.ExceptionPrintstacktrace(paramdm.ExceptionPrintstacktrace());
    if (this.e == null)
      throw new ExceptionInVPackage("VE Analyze can not locate OutputChannel:" + paramdm.ExceptionPrintstacktrace() + " in the current Configuration."); 
    this.f = paramR.ExceptionPrintstacktrace(paramdm.h());
    if (this.f == null)
      throw new ExceptionInVPackage("VE Analyze can not locate OutputChannel:" + paramdm.h() + " in the current Configuration."); 
    this.ExceptionPrintstacktrace = paramR.ExceptionPrintstacktrace(paramdm.BlInterfacePapa());
    if (this.ExceptionPrintstacktrace == null)
      throw new ExceptionInVPackage("VE Analyze can not locate OutputChannel:" + paramdm.BlInterfacePapa() + " in the current Configuration."); 
    this.h = paramR.ExceptionPrintstacktrace(paramdm.q());
    if (this.h == null)
      throw new ExceptionInVPackage("VE Analyze can not locate OutputChannel:" + paramdm.q() + " in the current Configuration."); 
    this.m = paramR.ExceptionPrintstacktrace(paramdm.r());
    if (this.m == null);
    paramR.C().ExceptionInVPackage(this);
  }
  
  public void ExceptionInVPackage() {
    try {
      this.r = ExceptionInVPackage(this.d, this.ExceptionInVPackage);
      this.c.ExceptionInVPackage(this.r);
      this.q.ExceptionInVPackage(this.r, this.c.f());
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      Logger.getLogger(n.class.getName()).log(Level.SEVERE, (String)null, (Throwable)ExceptionPrintstacktrace);
    } 
  }
  
  private s ExceptionInVPackage(R paramR, GInterfaceDm paramdm) {
    s s1 = ManagerBfcomponentcharlie.ExceptionInVPackage().ExceptionInVPackage(paramR, paramdm.c(), paramdm.b());
    if (ManagerBfcomponentcharlie.ExceptionInVPackage().b(paramdm.c()))
      return s1; 
    CloneableImpl CloneableImpl = (CloneableImpl)paramR.e().c(paramdm.c());
    if (CloneableImpl == null)
      return null; 
    Manager Manager = paramR.c(CloneableImpl.c());
    if (Manager.BlInterfacePapa() != null && Manager.BlInterfacePapa().equalsIgnoreCase("Volts")) {
      s s2 = new s();
      s2.ExceptionInVPackage(s1.getRowCount(), s1.getColumnCount());
      fh.ExceptionInVPackage(s1, s2);
      SerializableImpl aH1 = paramR.ExceptionPrintstacktrace(paramdm.e());
      if (aH1 == null)
        throw new ExceptionPrintstacktrace("Unable to calculate AFR based on current sensor configuration."); 
      String str = aH1.TostringInBlPackage();
      for (byte b = 0; b < s2.getRowCount(); b++) {
        for (byte b1 = 0; b1 < s2.getColumnCount(); b1++) {
          double d = s2.d(b, b1).doubleValue();
          int i = (int)Math.round(d * 255.0D / 5.0D);
          String str1 = X.b(str, "egoADC", i + "");
          str1 = X.b(str1, "egoVoltage", d + "");
          str1 = i.c(str1, (GInterfaceAi)paramR);
          try {
            double d1 = G.ExceptionPrintstacktrace(str1);
            s2.setValueAt(Double.valueOf(d1), b, b1);
          } catch (Exception exception) {
            throw new ExceptionPrintstacktrace("Error calculating target AFR with formula:\n" + str + "\nUsing input values of:\n" + str1);
          } 
        } 
      } 
      s2.ExceptionInVPackage(false);
      s1.addTableModelListener(new q(this, str, s2, s1));
      return s2;
    } 
    return s1;
  }
  
  protected boolean ExceptionInVPackage(byte[] paramArrayOfbyte) {
    for (TostringInBlPackage TostringInBlPackage : this.b) {
      if (TostringInBlPackage.ExceptionInVPackage((GInterfaceAi)this.d, paramArrayOfbyte)) {
        this.t = TostringInBlPackage.ExceptionInVPackage();
        this.o++;
        return true;
      } 
    } 
    this.t = "";
    return false;
  }
  
  public void ExceptionInVPackage(BlInterfaceLima paraml) {
    this.c.ExceptionInVPackage(paraml);
  }
  
  public void b(BlInterfaceLima paraml) {
    this.c.b(paraml);
  }
  
  public void ExceptionInVPackage(String paramString, byte[] paramArrayOfbyte) {
    if (!b() || !f() || !paramString.equals(this.d.c()) || System.currentTimeMillis() - this.u < this.v)
      return; 
    BlInterfacePapa p1 = null;
    if (p1 == null) {
      p1 = new BlInterfacePapa();
      p1.ExceptionInVPackage(System.currentTimeMillis());
      if (this.j == null)
        p1.c(100.0D); 
    } 
    try {
      if (this.j != null) {
        double d1 = this.j.b(paramArrayOfbyte);
        p1.c(d1);
      } 
      double d = this.e.b(paramArrayOfbyte);
      p1.ExceptionInVPackage(d);
      d = this.f.b(paramArrayOfbyte);
      p1.b(d);
      d = this.ExceptionPrintstacktrace.b(paramArrayOfbyte);
      p1.e(d);
      d = this.h.b(paramArrayOfbyte);
      p1.f(d);
      d = this.i.b(paramArrayOfbyte);
      p1.d(d);
      if (this.m != null) {
        d = this.m.b(paramArrayOfbyte);
        p1.ExceptionPrintstacktrace(d);
      } 
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      ExceptionPrintstacktrace.printStackTrace();
      e();
    } 
    if (p1.f()) {
      p1.ExceptionInVPackage(ExceptionInVPackage(paramArrayOfbyte));
      this.n++;
      this.u = System.currentTimeMillis();
      p1.ExceptionInVPackage(this.u);
      this.c.ExceptionInVPackage(p1);
      p1 = null;
    } 
  }
  
  public void ExceptionInVPackage(TostringInBlPackage paramk) {
    this.b.add(paramk);
  }
  
  public boolean b() {
    return (this.c != null && this.c.e());
  }
  
  public void c() {
    ManagerUsingArrayList.ExceptionInVPackage().ExceptionInVPackage(this.d.c(), this.i.aL(), this.BlInterfaceLima);
    ManagerUsingArrayList.ExceptionInVPackage().ExceptionInVPackage(this.d.c(), this.e.aL(), this.BlInterfaceLima);
    ManagerUsingArrayList.ExceptionInVPackage().ExceptionInVPackage(this.d.c(), this.f.aL(), this.BlInterfaceLima);
    ManagerUsingArrayList.ExceptionInVPackage().ExceptionInVPackage(this.d.c(), this.ExceptionPrintstacktrace.aL(), this.BlInterfaceLima);
    ManagerUsingArrayList.ExceptionInVPackage().ExceptionInVPackage(this.d.c(), this.h.aL(), this.BlInterfaceLima);
    if (this.j != null)
      ManagerUsingArrayList.ExceptionInVPackage().ExceptionInVPackage(this.d.c(), this.j.aL(), this.BlInterfaceLima); 
    this.c.b();
    ExceptionInVPackage();
    this.c.c();
  }
  
  public void d() {
    this.c.b();
  }
  
  public void e() {
    this.c.d();
    ManagerUsingArrayList.ExceptionInVPackage().ExceptionInVPackage(this.BlInterfaceLima);
  }
  
  public boolean f() {
    if (this.ExceptionInVPackage.d() == null || this.ExceptionInVPackage.d().equals(""))
      return true; 
    try {
      String str = i.d(this.ExceptionInVPackage.d(), (GInterfaceAi)this.d);
      return BlInterfacePapa.ExceptionInVPackage(str, this.d);
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      D.c("VE Analyze Live is Unable to evaluate TableActiveCondition :\n\t" + this.ExceptionInVPackage.d() + "\n\tAssuming the table is active");
      return true;
    } catch (Exception exception) {
      D.c("VE Analyze Live is Unable to evaluate TableActiveCondition :\n\t" + this.ExceptionInVPackage.d() + "\n\tAssuming the table is active");
      exception.printStackTrace();
      return true;
    } 
  }
  
  public s ExceptionPrintstacktrace() {
    return this.BlInterfacePapa;
  }
  
  public s h() {
    return this.q;
  }
  
  public s i() {
    return this.r;
  }
  
  public s j() {
    return this.s;
  }
  
  public String TostringInBlPackage() {
    return this.t;
  }
  
  public void close() {
    this.r.removeTableModelListener(this.TostringInBlPackage);
  }
  
  public void ExceptionInVPackage(SerializableImpl paramaH) {
    this.m = paramaH;
  }
  
  public void ExceptionInVPackage(String paramString) {
    SerializableImpl aH1 = this.d.ExceptionPrintstacktrace(paramString);
    if (aH1 == null)
      throw new ExceptionPrintstacktrace(paramString + " is not ExceptionInVPackage valid channel in configuration " + this.d.c()); 
    this.i = aH1;
  }
  
  public void b(String paramString) {
    SerializableImpl aH1 = this.d.ExceptionPrintstacktrace(paramString);
    if (aH1 == null)
      throw new ExceptionPrintstacktrace(paramString + " is no ExceptionInVPackage valid channel in configuration " + this.d.c()); 
    this.j = aH1;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/br/n.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */