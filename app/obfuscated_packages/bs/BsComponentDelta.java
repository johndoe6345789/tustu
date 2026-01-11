package bs;

import G.R;
import G.GInterfaceAf;
import G.SerializableImpl;
import G.GInterfaceAi;
import G.Manager;
import G.CloneableImplInGPackage;
import G.ManagerUsingArrayList;
import G.GInterfaceDp;
import K.KInterfaceDelta;
import V.ExceptionInVPackage;
import V.ExceptionPrintstacktrace;
import V.ExceptionExtensionGetmessage;
import aP.NInterfaceIndiaImpl;
import bL.TostringInBlPackage;
import bM.ExceptionInVPackage;
import bM.BmInterfaceBravo;
import bM.BmInterfaceCharlie;
import bM.KInterfaceDelta;
import bM.BmInterfaceEcho;
import bt.ManagerBfcomponentcharlie;
import com.efiAnalytics.ui.fh;
import com.efiAnalytics.ui.s;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class BsComponentDelta implements GInterfaceAf {
  private R p = null;
  
  private Manager q = null;
  
  private Manager r = null;
  
  private Manager s = null;
  
  private Manager t = null;
  
  ArrayList ExceptionInVPackage;
  
  GInterfaceDp BmInterfaceBravo = null;
  
  private s u = null;
  
  SerializableImpl BmInterfaceCharlie = null;
  
  SerializableImpl KInterfaceDelta = null;
  
  SerializableImpl BmInterfaceEcho = null;
  
  SerializableImpl f = null;
  
  SerializableImpl ExceptionPrintstacktrace = null;
  
  SerializableImpl h = null;
  
  String i = "";
  
  private int v = 0;
  
  private int w = 0;
  
  private double x = 100.0D;
  
  private double y = Double.NaN;
  
  private double z = Double.NaN;
  
  private boolean A = false;
  
  private boolean B = true;
  
  private boolean C = true;
  
  double[] ExceptionExtensionGetmessage = null;
  
  long TostringInBlPackage = 0L;
  
  E l = new E(this);
  
  BmInterfaceBravo m;
  
  List n = new ArrayList();
  
  KInterfaceDelta o = new KInterfaceDelta();
  
  public BsComponentDelta(R paramR, GInterfaceDp paramdp) {
    this.p = paramR;
    this.BmInterfaceBravo = paramdp;
    this.m = new BmInterfaceBravo(paramR);
    this.q = paramR.BmInterfaceCharlie(paramdp.ExceptionInVPackage());
    this.r = paramR.BmInterfaceCharlie(paramdp.BmInterfaceBravo());
    CloneableImplInGPackage CloneableImplInGPackage = (CloneableImplInGPackage)paramR.BmInterfaceEcho().BmInterfaceCharlie(paramdp.ExceptionPrintstacktrace());
    if (CloneableImplInGPackage == null)
      throw new ExceptionInVPackage("Lambda Temperature compensation CurvePanel not found. " + paramdp.ExceptionPrintstacktrace()); 
    this.s = paramR.BmInterfaceCharlie(CloneableImplInGPackage.BmInterfaceBravo(0));
    if (this.s == null)
      throw new ExceptionInVPackage("Lambda Temperature compensation Parameter not found. " + CloneableImplInGPackage.KInterfaceDelta(0)); 
    this.t = paramR.BmInterfaceCharlie(paramdp.l());
    this.u = ManagerBfcomponentcharlie.ExceptionInVPackage().ExceptionInVPackage(paramR, paramdp.f());
    this.ExceptionInVPackage = BmInterfaceEcho.ExceptionInVPackage().ExceptionInVPackage(paramR, paramdp);
    this.ExceptionExtensionGetmessage = KInterfaceDelta.ExceptionInVPackage(paramR, this.q);
    if (paramdp.h() != null && !paramdp.h().equals(""))
      this.f = paramR.ExceptionPrintstacktrace(paramdp.h()); 
    this.BmInterfaceEcho = paramR.ExceptionPrintstacktrace(paramdp.KInterfaceDelta());
    if (this.BmInterfaceEcho == null)
      throw new ExceptionInVPackage("WUE Analyze can not locate OutputChannel: " + paramdp.KInterfaceDelta() + " in the current Configuration."); 
    if (paramdp.n() == null)
      paramdp.p(this.u.w()); 
    this.BmInterfaceCharlie = paramR.ExceptionPrintstacktrace(paramdp.n());
    if (this.BmInterfaceCharlie == null)
      throw new ExceptionInVPackage("WUE Analyze can not locate AFR Table X Axis OutputChannel: " + paramdp.n() + " in the current Configuration."); 
    if (paramdp.o() == null)
      paramdp.q(this.u.v()); 
    this.KInterfaceDelta = paramR.ExceptionPrintstacktrace(paramdp.o());
    if (this.KInterfaceDelta == null)
      throw new ExceptionInVPackage("WUE Analyze can not locate AFR Table Y Axis OutputChannel: " + paramdp.o() + " in the current Configuration."); 
    this.ExceptionPrintstacktrace = paramR.ExceptionPrintstacktrace(paramdp.BmInterfaceEcho());
    if (this.ExceptionPrintstacktrace == null)
      throw new ExceptionInVPackage("WUE Analyze can not locate OutputChannel: " + paramdp.BmInterfaceEcho() + " in the current Configuration."); 
    this.h = paramR.ExceptionPrintstacktrace(paramdp.TostringInBlPackage());
    if (this.ExceptionPrintstacktrace == null)
      throw new ExceptionInVPackage("WUE Analyze can not locate OutputChannel: " + paramdp.TostringInBlPackage() + " in the current Configuration."); 
    try {
      m();
      n();
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      Logger.getLogger(D.class.getName()).log(Level.SEVERE, (String)null, (Throwable)ExceptionPrintstacktrace);
      throw new ExceptionInVPackage("Failed to start WUE Analyze.\n" + ExceptionPrintstacktrace.getMessage());
    } 
  }
  
  private void ExceptionExtensionGetmessage() {
    for (BmInterfaceEcho BmInterfaceEcho : this.n)
      BmInterfaceEcho.ExceptionInVPackage(this.o); 
  }
  
  public void ExceptionInVPackage(BmInterfaceEcho parame) {
    this.n.add(parame);
  }
  
  public boolean ExceptionInVPackage() {
    return this.A;
  }
  
  public String BmInterfaceBravo() {
    return this.i;
  }
  
  void BmInterfaceCharlie() {
    this.u = ManagerBfcomponentcharlie.ExceptionInVPackage().ExceptionInVPackage(this.p, this.BmInterfaceBravo.f());
  }
  
  public void ExceptionInVPackage(String paramString, byte[] paramArrayOfbyte) {
    if (this.A && System.currentTimeMillis() - this.TostringInBlPackage > 60L) {
      this.TostringInBlPackage = System.currentTimeMillis();
      ExceptionInVPackage ExceptionInVPackage = new ExceptionInVPackage();
      try {
        float f = 40.0F;
        double d1 = this.ExceptionPrintstacktrace.BmInterfaceBravo(paramArrayOfbyte);
        ExceptionInVPackage.BmInterfaceEcho(d1);
        if (Double.isNaN(ExceptionPrintstacktrace())) {
          this.y = this.BmInterfaceEcho.BmInterfaceBravo(paramArrayOfbyte);
        } else {
          this.y = (this.BmInterfaceEcho.BmInterfaceBravo(paramArrayOfbyte) + ExceptionPrintstacktrace() * f) / (f + 1.0F);
        } 
        ExceptionInVPackage.BmInterfaceCharlie(ExceptionPrintstacktrace());
        double d2 = this.BmInterfaceCharlie.BmInterfaceBravo(paramArrayOfbyte);
        double d3 = this.KInterfaceDelta.BmInterfaceBravo(paramArrayOfbyte);
        this.z = fh.ExceptionInVPackage(this.u, d2, d3) + ExceptionInVPackage((int)Math.round(d1));
        ExceptionInVPackage.KInterfaceDelta(h());
        if (this.f != null) {
          if (Double.isNaN(f())) {
            this.x = this.f.BmInterfaceBravo(paramArrayOfbyte);
          } else {
            this.x = (this.f.BmInterfaceBravo(paramArrayOfbyte) + f() * f) / (f + 1.0F);
          } 
          ExceptionInVPackage.BmInterfaceBravo(f());
        } 
        if (this.B) {
          ExceptionInVPackage.ExceptionInVPackage(this.h.BmInterfaceBravo(paramArrayOfbyte));
        } else {
          ExceptionInVPackage.ExceptionInVPackage(ExceptionInVPackage(d1));
        } 
        boolean bool = ExceptionInVPackage(paramArrayOfbyte);
        ExceptionInVPackage.ExceptionInVPackage(bool);
        this.o.ExceptionInVPackage(bool);
        this.m.ExceptionInVPackage(ExceptionInVPackage);
        if (bool) {
          this.v++;
        } else {
          if (Float.isNaN(this.o.f()) || this.o.f() > this.o.BmInterfaceEcho())
            this.o.BmInterfaceEcho(this.o.BmInterfaceEcho()); 
          if (Float.isNaN(this.o.ExceptionPrintstacktrace()) || this.o.ExceptionPrintstacktrace() < this.o.BmInterfaceEcho())
            this.o.f(this.o.BmInterfaceEcho()); 
        } 
        this.w++;
        this.o.BmInterfaceBravo((float)this.y);
        this.o.BmInterfaceCharlie((float)d1);
        this.o.ExceptionInVPackage((float)this.z);
        this.o.BmInterfaceBravo(this.v);
        this.o.ExceptionInVPackage(this.w);
        this.o.KInterfaceDelta(o());
        TostringInBlPackage();
        ExceptionExtensionGetmessage();
      } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
        Logger.getLogger(D.class.getName()).log(Level.SEVERE, (String)null, (Throwable)ExceptionPrintstacktrace);
        NInterfaceIndiaImpl.ExceptionInVPackage().KInterfaceDelta("WUE Analyze Error!! Could not retrieve all data. " + ExceptionPrintstacktrace.getMessage());
      } 
    } 
  }
  
  private void TostringInBlPackage() {
    if (this.o.BmInterfaceEcho() > l())
      try {
        double[][] arrayOfDouble = this.r.i(this.p.h());
        for (byte b1 = 0; b1 < arrayOfDouble.length && (b1 == 0 || arrayOfDouble[b1 - 1][0] <= this.o.BmInterfaceEcho()); b1++) {
          double d1;
          if (i() || arrayOfDouble[b1][0] > this.o.BmInterfaceEcho()) {
            d1 = this.m.ExceptionInVPackage((int)Math.round(arrayOfDouble[b1][0]));
          } else {
            BmInterfaceCharlie BmInterfaceCharlie = this.m.BmInterfaceCharlie((int)Math.round(arrayOfDouble[b1][0]));
            d1 = (BmInterfaceCharlie != null) ? BmInterfaceCharlie.BmInterfaceCharlie() : Double.NaN;
          } 
          try {
            if (!Double.isNaN(d1)) {
              d1 = (d1 < 100.0D || b1 == arrayOfDouble.length - 1) ? 100.0D : d1;
              this.t.ExceptionInVPackage(this.p.h(), d1, b1, 0);
            } 
          } catch (ExceptionExtensionGetmessage ExceptionExtensionGetmessage) {
            Logger.getLogger(D.class.getName()).log(Level.SEVERE, (String)null, (Throwable)ExceptionExtensionGetmessage);
          } 
        } 
      } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
        ExceptionPrintstacktrace.printStackTrace();
      }  
  }
  
  private double l() {
    if (!Float.isNaN(this.o.f()))
      try {
        double[][] arrayOfDouble = this.r.i(this.p.h());
        for (byte b1 = 0; b1 < arrayOfDouble.length; b1++) {
          if (arrayOfDouble[b1][0] > this.o.f())
            return arrayOfDouble[b1][0]; 
        } 
        return Double.NaN;
      } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
        Logger.getLogger(D.class.getName()).log(Level.SEVERE, (String)null, (Throwable)ExceptionPrintstacktrace);
        return Double.NaN;
      }  
    return Double.NaN;
  }
  
  protected boolean ExceptionInVPackage(byte[] paramArrayOfbyte) {
    for (TostringInBlPackage TostringInBlPackage : this.ExceptionInVPackage) {
      if (TostringInBlPackage.ExceptionInVPackage((GInterfaceAi)this.p, paramArrayOfbyte)) {
        this.i = TostringInBlPackage.ExceptionInVPackage();
        return true;
      } 
    } 
    this.i = "";
    return false;
  }
  
  public double ExceptionInVPackage(double paramDouble) {
    double[][] arrayOfDouble1 = this.r.i(this.p.h());
    double[][] arrayOfDouble2 = this.q.i(this.p.h());
    return KInterfaceDelta.ExceptionInVPackage(arrayOfDouble1, arrayOfDouble2, paramDouble);
  }
  
  public double BmInterfaceBravo(double paramDouble) {
    return this.m.ExceptionInVPackage((int)Math.round(paramDouble));
  }
  
  private double ExceptionInVPackage(int paramInt) {
    double[][] arrayOfDouble1 = this.r.i(this.p.h());
    double[][] arrayOfDouble2 = this.s.i(this.p.h());
    return KInterfaceDelta.ExceptionInVPackage(arrayOfDouble1, arrayOfDouble2, paramInt);
  }
  
  public double KInterfaceDelta() {
    double[][] arrayOfDouble = this.r.i(this.p.h());
    return arrayOfDouble[arrayOfDouble.length - 1][0];
  }
  
  public void ExceptionInVPackage(boolean paramBoolean) {
    if (paramBoolean) {
      ManagerUsingArrayList.ExceptionInVPackage().ExceptionInVPackage(this.p.BmInterfaceCharlie(), this.ExceptionPrintstacktrace.aL(), this.l);
      ManagerUsingArrayList.ExceptionInVPackage().ExceptionInVPackage(this.p.BmInterfaceCharlie(), this.BmInterfaceEcho.aL(), this.l);
      ManagerUsingArrayList.ExceptionInVPackage().ExceptionInVPackage(this.p.BmInterfaceCharlie(), this.BmInterfaceCharlie.aL(), this.l);
      ManagerUsingArrayList.ExceptionInVPackage().ExceptionInVPackage(this.p.BmInterfaceCharlie(), this.KInterfaceDelta.aL(), this.l);
      if (this.f != null)
        ManagerUsingArrayList.ExceptionInVPackage().ExceptionInVPackage(this.p.BmInterfaceCharlie(), this.f.aL(), this.l); 
      try {
        m();
      } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
        Logger.getLogger(D.class.getName()).log(Level.SEVERE, (String)null, (Throwable)ExceptionPrintstacktrace);
        ExceptionInVPackage(false);
        throw new ExceptionInVPackage("Failed to start WUE Analyze.\n" + ExceptionPrintstacktrace.getMessage());
      } 
      this.A = paramBoolean;
    } else {
      this.A = paramBoolean;
      ManagerUsingArrayList.ExceptionInVPackage().ExceptionInVPackage(this.l);
    } 
  }
  
  private void m() {
    double[][] arrayOfDouble = this.q.i(this.p.p());
    try {
      this.t.ExceptionInVPackage(this.p.p(), arrayOfDouble);
    } catch (ExceptionExtensionGetmessage ExceptionExtensionGetmessage) {
      Logger.getLogger(D.class.getName()).log(Level.SEVERE, (String)null, (Throwable)ExceptionExtensionGetmessage);
    } 
  }
  
  private void n() {
    this.m.BmInterfaceCharlie();
  }
  
  public void BmInterfaceEcho() {
    double[][] arrayOfDouble = this.t.i(this.p.p());
    try {
      this.q.ExceptionInVPackage(this.p.p(), arrayOfDouble);
    } catch (ExceptionExtensionGetmessage ExceptionExtensionGetmessage) {
      Logger.getLogger(D.class.getName()).log(Level.SEVERE, (String)null, (Throwable)ExceptionExtensionGetmessage);
    } 
  }
  
  public double f() {
    return this.x;
  }
  
  public double ExceptionPrintstacktrace() {
    return this.y;
  }
  
  public double h() {
    return this.z;
  }
  
  private float o() {
    return 0.0F;
  }
  
  public int ExceptionInVPackage(float paramFloat) {
    return this.m.BmInterfaceEcho(Math.round(paramFloat));
  }
  
  public boolean i() {
    return this.C;
  }
  
  public void BmInterfaceBravo(boolean paramBoolean) {
    this.C = paramBoolean;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bs/D.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */