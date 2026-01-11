package bQ;

import A.IO;
import A.AInterfaceGolf;
import A.AInterfaceHotel;
import G.F;
import G.J;
import G.N;
import G.R;
import G.T;
import G.ArrayListInGPackage;
import G.GInterfaceAf;
import G.AeInterfaceMikeTostring;
import G.GInterfaceCf;
import G.GInterfaceCg;
import G.ManagerUsingArrayList;
import G.m;
import G.BnInterfaceNovember;
import G.BnInterfaceOscar;
import J.AInterfaceHotel;
import J.JInterfaceJuliet;
import V.VInterfaceBravo;
import V.AInterfaceGolf;
import ac.AInterfaceHotel;
import bH.D;
import bH.TostringInBoPackage;
import bN.VInterfaceBravo;
import bN.BnInterfaceKilo;
import bN.BnInterfaceNovember;
import bN.BnInterfaceOscar;
import bN.BnInterfaceTango;
import bO.TostringInBoPackage;
import bO.JInterfaceJuliet;
import bO.BnInterfaceKilo;
import bU.VInterfaceBravo;
import com.efiAnalytics.xcp.master.responseProcessors.CrcProcessor;
import com.efiAnalytics.xcp.master.responseProcessors.a;
import com.efiAnalytics.xcp.master.responseProcessors.VInterfaceBravo;
import com.efiAnalytics.xcp.master.responseProcessors.d;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class IOHashMap extends J implements AInterfaceGolf, AInterfaceHotel {
  private IO ap = null;
  
  public static String a = "XCP Master Driver";
  
  BnInterfaceNovember VInterfaceBravo = null;
  
  final BnInterfaceKilo TostringInBoPackage = new BnInterfaceKilo();
  
  final IO d = new IO(this.TostringInBoPackage);
  
  final m e = new m(this);
  
  final VInterfaceBravo IO = new VInterfaceBravo();
  
  final CrcProcessor AInterfaceGolf = new CrcProcessor();
  
  final List AInterfaceHotel = new ArrayList();
  
  final JInterfaceJuliet i = new JInterfaceJuliet();
  
  BnInterfaceOscar JInterfaceJuliet = null;
  
  a BnInterfaceKilo;
  
  long l = -1L;
  
  long m = 0L;
  
  double BnInterfaceNovember = -1.0D;
  
  p BnInterfaceOscar = null;
  
  public static int al = 1;
  
  int am = 0;
  
  static int an = 0;
  
  float ao = 0.0F;
  
  private static final HashMap aq = new HashMap<>();
  
  public IOHashMap(F paramF) {
    super(paramF);
    IO(paramF);
    IO(false);
    this.d.a(new q(this));
    this.d.a(this.i);
    this.BnInterfaceKilo = new a(this, this.i);
    this.BnInterfaceKilo.a();
    this.BnInterfaceOscar = new p(this);
    AInterfaceHotel.a(this.BnInterfaceOscar);
  }
  
  private void IO(F paramF) {
    int i = paramF.AInterfaceGolf();
    String[] arrayOfString = new String[i];
    for (byte b1 = 0; b1 < arrayOfString.length; b1++)
      arrayOfString[b1] = "XCP"; 
    try {
      paramF.IO(arrayOfString);
      paramF.e(null);
      paramF.VInterfaceBravo(arrayOfString);
      paramF.AInterfaceHotel(arrayOfString);
      paramF.TostringInBoPackage(arrayOfString);
      paramF.AInterfaceGolf(arrayOfString);
    } catch (AInterfaceGolf g1) {
      Logger.getLogger(l.class.getName()).log(Level.SEVERE, (String)null, (Throwable)g1);
    } 
    e e = new e(paramF.u(), this.TostringInBoPackage);
    a(e.IO());
    this.AInterfaceHotel.add(e);
    VInterfaceBravo b2 = new VInterfaceBravo(paramF.E(), this, e);
    this.d.a(b2);
  }
  
  protected void VInterfaceBravo(F paramF) {
    super.VInterfaceBravo(paramF);
  }
  
  public void VInterfaceBravo(GInterfaceAf paramaF) {
    a(paramaF);
  }
  
  public AInterfaceHotel D() {
    return (AInterfaceHotel)this.i;
  }
  
  public String BnInterfaceNovember() {
    return a;
  }
  
  public u a(String paramString) {
    for (e e : this.AInterfaceHotel) {
      if (e.IO().a().equals(paramString))
        return e.IO(); 
    } 
    return null;
  }
  
  public void TostringInBoPackage() {
    if (this.VInterfaceBravo != null) {
      BnInterfaceNovember.a(this.VInterfaceBravo);
      this.VInterfaceBravo.a(true);
    } 
    try {
      if (a() != null)
        a().AInterfaceGolf(); 
    } catch (Exception exception) {}
  }
  
  private BnInterfaceTango T() {
    bN.l l1 = BnInterfaceTango.a().VInterfaceBravo();
    BnInterfaceTango BnInterfaceTango = this.d.a((BnInterfaceTango)l1, this.TostringInBoPackage.q() / 4);
    if (BnInterfaceTango == null || BnInterfaceTango.a() != 255)
      throw new VInterfaceBravo("Connect Failed"); 
    if ((BnInterfaceTango.TostringInBoPackage()).length != 7) {
      D.d("Valid Connect response code, but invalid packet size.");
      throw new VInterfaceBravo("Connect Failed, Invalid packet size");
    } 
    return BnInterfaceTango;
  }
  
  public void IO() {
    if (this.F)
      try {
        m();
        bN.l l1 = BnInterfaceTango.a().TostringInBoPackage();
        BnInterfaceKilo k1 = new BnInterfaceKilo();
        k1.a((BnInterfaceTango)l1);
        this.d.a(k1);
        a(100L);
      } catch (Exception exception) {
        Logger.getLogger(l.class.getName()).log(Level.SEVERE, (String)null, exception);
      }  
  }
  
  protected InputStream i() {
    return a().i();
  }
  
  public boolean VInterfaceBravo() {
    return (this.VInterfaceBravo != null && BnInterfaceNovember.VInterfaceBravo(this.VInterfaceBravo));
  }
  
  public void d() {
    if (this.VInterfaceBravo == null || !this.VInterfaceBravo.isAlive() || BnInterfaceNovember.VInterfaceBravo(this.VInterfaceBravo)) {
      this.VInterfaceBravo = new BnInterfaceNovember(this);
      this.VInterfaceBravo.start();
    } 
    this.m = System.currentTimeMillis();
  }
  
  public void a(boolean paramBoolean) {}
  
  protected BnInterfaceOscar a(m paramm) {
    BnInterfaceOscar o1 = new BnInterfaceOscar();
    try {
      this.ap.IO();
      this.TostringInBoPackage.VInterfaceBravo(this.ap.s());
      bN.l l1 = BnInterfaceTango.a().VInterfaceBravo();
      BnInterfaceTango BnInterfaceTango = this.d.a((BnInterfaceTango)l1);
      D.TostringInBoPackage("Test: " + this.ap.BnInterfaceNovember());
      if (BnInterfaceTango == null || BnInterfaceTango.a() != 255) {
        o1.a(3);
      } else {
        o1.a(1);
        o1.a("Received valid connect response.");
        bN.l l2 = BnInterfaceTango.a().TostringInBoPackage();
        BnInterfaceKilo k1 = new BnInterfaceKilo();
        k1.a((BnInterfaceTango)l2);
        this.d.a(k1);
        a(100L);
      } 
    } catch (Exception exception) {
      if (!(exception instanceof VInterfaceBravo)) {
        Logger.getLogger(l.class.getName()).log(Level.SEVERE, (String)null, exception);
      } else {
        D.d("Test Timed out, failed.");
      } 
      o1.a(3);
    } finally {
      TostringInBoPackage();
    } 
    return o1;
  }
  
  protected byte[] a(byte[] paramArrayOfbyte, long paramLong1, long paramLong2, int paramInt, m paramm, InputStream paramInputStream) {
    throw new UnsupportedOperationException("Not supported in this implementation.");
  }
  
  protected void d(m paramm) {
    F f1 = paramm.v();
    if (f1 == null)
      f1 = e(); 
    if (paramm.BnInterfaceOscar() == -2)
      paramm.e(f1.A()); 
    if (paramm.BnInterfaceOscar() < 0) {
      D.VInterfaceBravo("Burn requested for page:" + paramm.BnInterfaceOscar());
      return;
    } 
    BnInterfaceOscar o1 = new BnInterfaceOscar();
    o1.a(paramm);
    byte b1 = 3;
    paramm.TostringInBoPackage(paramm.AInterfaceHotel() + 1);
    try {
      TostringInBoPackage(true);
    } catch (G.l|VInterfaceBravo|BnInterfaceOscar l1) {
      o1.a(3);
      o1.a(l1.getLocalizedMessage());
      paramm.VInterfaceBravo(1.0D);
      paramm.VInterfaceBravo(o1);
      TostringInBoPackage(f1.u(), paramm.BnInterfaceOscar());
      return;
    } 
    BnInterfaceTango BnInterfaceTango = BnInterfaceTango.a().a(this.TostringInBoPackage);
    try {
      long l1 = System.currentTimeMillis();
      BnInterfaceTango t1 = this.d.a(BnInterfaceTango);
      if (t1.a() != 255 && paramm.AInterfaceHotel() <= b1) {
        D.VInterfaceBravo("Burn failed! Try Count: " + paramm.AInterfaceHotel() + ", trying again.");
        TostringInBoPackage(this.TostringInBoPackage.r());
        this.i.BnInterfaceTango();
        d(paramm);
        return;
      } 
      if (t1.a() != 255) {
        this.i.BnInterfaceTango();
        o1.a(3);
        o1.a("Store to flash failed!");
        paramm.VInterfaceBravo(1.0D);
        paramm.VInterfaceBravo(o1);
        TostringInBoPackage(f1.u(), paramm.BnInterfaceOscar());
        return;
      } 
      o1.a(1);
      a a1 = new a();
      this.d.JInterfaceJuliet().a((d)a1);
      synchronized (a1) {
        try {
          a1.wait(4000L);
          D.TostringInBoPackage("Burn time: " + (System.currentTimeMillis() - l1));
        } catch (InterruptedException interruptedException) {
          Logger.getLogger(l.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
        } finally {
          this.d.JInterfaceJuliet().VInterfaceBravo((d)a1);
        } 
        if (a1.a()) {
          this.i.r();
        } else {
          this.i.BnInterfaceTango();
        } 
      } 
    } catch (VInterfaceBravo|BnInterfaceOscar b2) {
      if (paramm.AInterfaceHotel() <= b1) {
        D.VInterfaceBravo("Burn failed! Try Count: " + paramm.AInterfaceHotel() + ", trying again.");
        TostringInBoPackage(this.TostringInBoPackage.r());
        d(paramm);
        return;
      } 
      o1.a(3);
      o1.a(b2.getLocalizedMessage());
      paramm.VInterfaceBravo(1.0D);
      paramm.VInterfaceBravo(o1);
      TostringInBoPackage(f1.u(), paramm.BnInterfaceOscar());
      return;
    } 
    this.l = -1L;
    f1.BnInterfaceTango(-2);
    f1.u(-2);
    o1.a(1);
    o1.VInterfaceBravo(f1.u());
    D.TostringInBoPackage("burned page " + (paramm.BnInterfaceOscar() + 1));
    paramm.VInterfaceBravo(1.0D);
    paramm.VInterfaceBravo(o1);
    TostringInBoPackage(f1.u(), paramm.BnInterfaceOscar());
  }
  
  protected void TostringInBoPackage(boolean paramBoolean) {
    BnInterfaceTango t1 = null;
    byte b1 = 0;
    String str = "Unknown";
    BnInterfaceTango t2 = BnInterfaceTango.a().a(this.TostringInBoPackage, paramBoolean);
    do {
      try {
        b1++;
        t1 = this.d.a(t2);
        if (t1.a() != 255) {
          D.a("SET_SEGMENT_MODE Error!");
          str = "None";
          if ((t1.TostringInBoPackage()).length > 0) {
            int i = TostringInBoPackage.a(t1.TostringInBoPackage()[0]);
            D.d("Error Code: " + TostringInBoPackage.d(t1.TostringInBoPackage()));
            str = BnInterfaceNovember.a(t1.TostringInBoPackage()[0]);
            if (i == 32 || i == 33 || i == 39 || i == 40) {
              G.l l1 = new G.l("Fatal Error " + str);
              l1.a(i);
              l1.a(false);
              throw l1;
            } 
            D.VInterfaceBravo("Error setting address: " + str);
            TostringInBoPackage(this.TostringInBoPackage.s());
          } 
        } 
      } catch (VInterfaceBravo b2) {
        AInterfaceGolf();
      } 
    } while ((t1 == null || t1.a() != 255) && b1 < 3);
    if (t1.a() != 255) {
      G.l l1 = new G.l("Error: " + str);
      throw l1;
    } 
  }
  
  private void U() {
    this.am = 0;
  }
  
  protected void TostringInBoPackage(m paramm) {
    byte b1 = (paramm.BnInterfaceNovember() == 5) ? 5 : 2;
    boolean bool = false;
    U();
    do {
      try {
        this.am++;
        super.TostringInBoPackage(paramm);
        if (paramm.JInterfaceJuliet() == null || paramm.JInterfaceJuliet().a() == 1 || paramm.JInterfaceJuliet().a() == -1)
          bool = true; 
        if (this.am > 1)
          this.i.i(); 
      } catch (G.l l1) {
        if (this.am > 1)
          this.i.AInterfaceHotel(); 
        if (l1.a() == 16 || l1.a() == 18) {
          this.am = 0;
          a(this.TostringInBoPackage.r());
          this.i.u();
        } else {
          if (!l1.VInterfaceBravo() || this.am >= b1)
            throw l1; 
          D.d("Command failed, performing sync and retry: " + this.am);
          try {
            AInterfaceGolf();
          } catch (VInterfaceBravo b2) {
            this.i.AInterfaceHotel();
            D.a("Sync Failed");
            throw new G.l("Sync Timeout on retry");
          } catch (BnInterfaceOscar o1) {
            Logger.getLogger(l.class.getName()).log(Level.INFO, "Sync failed on retry do to format exception", (Throwable)o1);
            throw new G.l("Sync Formate error on retry");
          } 
        } 
      } catch (VInterfaceBravo b2) {
        if (this.am > 1)
          this.i.AInterfaceHotel(); 
        D.d("Timeout, sync and retry: " + this.am);
        try {
          AInterfaceGolf();
        } catch (Exception exception) {
          D.VInterfaceBravo("SYNC Failed");
          try {
            AInterfaceGolf();
          } catch (Exception exception1) {
            D.VInterfaceBravo("SYNC Failed again");
            this.i.AInterfaceHotel();
            throw new G.l("Controller did not respond after 3 attempts, assumed not connected");
          } 
        } 
      } 
    } while (!bool && this.am < b1);
    if (!bool && this.am >= b1) {
      String str = "Instruction failed after " + this.am + " attempts... Giving up.";
      D.a(str);
      throw new G.l(str);
    } 
    U();
  }
  
  protected void a(F paramF, int paramInt) {
    if (paramF.A() == paramInt)
      return; 
    try {
      BnInterfaceTango t1;
      if (this.H && paramF.A() >= 0 && paramF.B() >= 0 && paramF.x(paramF.A()) && paramF.A() != paramInt) {
        D.TostringInBoPackage("Activate Page, burn page " + (paramF.A() + 1) + " new active page=" + (paramInt + 1));
        m m1 = m.a(paramF, paramF.A());
        d(m1);
      } 
      paramF.BnInterfaceTango(paramInt);
      D.TostringInBoPackage("Activate Page: " + (paramInt + 1));
      this.l = -1L;
      BnInterfaceTango t2 = BnInterfaceTango.a().a(paramInt);
      byte b1 = 0;
      do {
        b1++;
        t1 = this.d.VInterfaceBravo(t2, 3);
        if (t1.a() != 255) {
          D.a("SET_CAL_PAGE Error!");
          String str = "None";
          if ((t1.TostringInBoPackage()).length > 0) {
            int i = TostringInBoPackage.a(t1.TostringInBoPackage()[0]);
            D.d("Error Code: " + TostringInBoPackage.d(t1.TostringInBoPackage()));
            str = BnInterfaceNovember.a(t1.TostringInBoPackage()[0]);
            if (i == 32 || i == 33 || i == 39 || i == 40 || i == 33 || i == 38) {
              G.l l1 = new G.l("Fatal Error " + str);
              l1.a(i);
              l1.a(false);
              throw l1;
            } 
            D.VInterfaceBravo("Error setting cal page: " + str);
          } else if (b1 > 2) {
            G.l l1 = new G.l("Unknown Error");
            l1.a(false);
            throw l1;
          } 
        } 
        paramF.BnInterfaceTango(paramInt);
      } while (t1.a() != 255 && b1 < 3);
      if (t1.a() != 255) {
        G.l l1 = new G.l("Unknown Error");
        l1.a(false);
        throw l1;
      } 
    } catch (G.l l1) {
      throw l1;
    } catch (Exception exception) {
      D.TostringInBoPackage("Failed to activate Page: " + paramInt);
      throw new G.l("Activating page" + paramInt + ": " + exception.getMessage());
    } 
  }
  
  protected void l(m paramm) {
    F f1 = paramm.v();
    int[][] arrayOfInt = new int[f1.AInterfaceGolf()][0];
    paramm.VInterfaceBravo(0.0D);
    m m1 = new m(f1);
    GInterfaceCg GInterfaceCg = new GInterfaceCg(f1, paramm);
    m1.VInterfaceBravo((BnInterfaceNovember)GInterfaceCg);
    m();
    try {
      for (byte b1 = 0; b1 < arrayOfInt.length; b1++) {
        GInterfaceCg.a(b1);
        long l1 = System.currentTimeMillis();
        arrayOfInt[b1] = a(f1, b1, m1);
        D.TostringInBoPackage("Read page time: " + (System.currentTimeMillis() - l1) + "ms.");
      } 
      BnInterfaceOscar o1 = new BnInterfaceOscar();
      o1.a(1);
      o1.a(arrayOfInt);
      paramm.VInterfaceBravo(o1);
    } finally {
      l();
    } 
  }
  
  protected void AInterfaceGolf() {
    BnInterfaceTango t1 = BnInterfaceTango.a().d();
    BnInterfaceTango t2 = this.d.a(t1, 1000);
    if (t2.a() != 255) {
      this.i.BnInterfaceNovember();
      if ((t2.TostringInBoPackage()).length > 0) {
        int i = TostringInBoPackage.a(t2.TostringInBoPackage()[0]);
        String str = BnInterfaceNovember.a(t2.TostringInBoPackage()[0]);
        if (i == 0) {
          if (e().aw() > 0 && O() && System.currentTimeMillis() - this.m > 3000L) {
            Q();
          } else if (!O() && (e().aw() == 0 || System.currentTimeMillis() - this.m < 500L)) {
            P();
          } 
        } else {
          if (i == 32 || i == 33) {
            D.d("Error Code: " + TostringInBoPackage.d(t2.TostringInBoPackage()));
            G.l l2 = new G.l("Fatal Error " + str);
            l2.a(i);
            l2.a(false);
            throw l2;
          } 
          G.l l1 = new G.l("Error getting sync: " + str);
          l1.a(i);
          l1.a(true);
          throw l1;
        } 
      } 
    } 
  }
  
  protected void IO(m paramm) {
    D.a("Write Value, should not be called with this protocol!!!");
  }
  
  public synchronized void d(long paramLong) {
    if (AInterfaceHotel()) {
      long l1 = paramLong - System.currentTimeMillis();
      if (l1 > 1000000L)
        l1 = 60000L; 
      D.TostringInBoPackage("Client: Ignore runtime reads for: " + (paramLong - System.currentTimeMillis()));
      BnInterfaceTango BnInterfaceTango = BnInterfaceTango.a().IO(this.TostringInBoPackage, (int)l1);
      try {
        BnInterfaceTango t1 = this.d.a(BnInterfaceTango);
        if (t1.a() != 255)
          D.TostringInBoPackage("IgnoreRuntimeUntil failed.."); 
      } catch (VInterfaceBravo b1) {
        Logger.getLogger(l.class.getName()).log(Level.SEVERE, "Stop runtime for failed", (Throwable)b1);
      } catch (BnInterfaceOscar o1) {
        Logger.getLogger(l.class.getName()).log(Level.SEVERE, "Stop runtime for failed", (Throwable)o1);
      } 
    } 
    super.d(paramLong);
  }
  
  protected void BnInterfaceKilo(m paramm) {
    BnInterfaceOscar o1 = new BnInterfaceOscar();
    o1.a(paramm);
    try {
      int i = 0;
      byte b1 = 2;
      List list = BnInterfaceTango.a().a(this.TostringInBoPackage, paramm.v(), paramm);
      for (List list1 : list) {
        this.i.q();
        paramm.m();
        BnInterfaceTango BnInterfaceTango = this.d.a(list1);
        if (BnInterfaceTango == null) {
          D.TostringInBoPackage("Raw Write response null!");
          throw new G.l("Raw Write response null!");
        } 
        if (BnInterfaceTango.a() != 255 && paramm.AInterfaceGolf()) {
          D.VInterfaceBravo("Raw Write Failed! retrying..");
          BnInterfaceTango = this.d.a(list1);
          if (BnInterfaceTango.a() != 255) {
            D.VInterfaceBravo("Raw Write Failed again!");
            if ((BnInterfaceTango.TostringInBoPackage()).length > 0)
              throw new G.l("Raw Write response Error! " + TostringInBoPackage.d(BnInterfaceTango.d())); 
            throw new G.l("Raw Write response Error!");
          } 
          o1.a(1);
          for (BnInterfaceTango t1 : list1) {
            b1 = (t1.TostringInBoPackage()[0] == 163) ? 4 : 2;
            i += t1.VInterfaceBravo() - b1;
            paramm.VInterfaceBravo((i / paramm.r()));
          } 
          if ((BnInterfaceTango.TostringInBoPackage()).length > 0)
            if (paramm.d()) {
              o1.a(BnInterfaceTango.TostringInBoPackage());
            } else {
              int[] arrayOfInt = TostringInBoPackage.VInterfaceBravo(BnInterfaceTango.TostringInBoPackage());
              o1.a(arrayOfInt);
            }  
          paramm.VInterfaceBravo(o1);
          continue;
        } 
        o1.a(1);
        for (BnInterfaceTango t1 : list1) {
          b1 = (t1.TostringInBoPackage()[0] == 163) ? 4 : 2;
          i += t1.VInterfaceBravo() - b1;
        } 
        if ((BnInterfaceTango.TostringInBoPackage()).length > 0)
          if (paramm.d()) {
            o1.a(BnInterfaceTango.TostringInBoPackage());
          } else {
            int[] arrayOfInt = TostringInBoPackage.VInterfaceBravo(BnInterfaceTango.TostringInBoPackage());
            o1.a(arrayOfInt);
          }  
        paramm.VInterfaceBravo(o1);
      } 
    } catch (VInterfaceBravo b1) {
      o1.a(3);
      o1.a("Controller Instruction failed!\BnInterfaceNovember\nError: \BnInterfaceNovember" + b1.getMessage());
    } catch (Exception exception) {
      o1.a(3);
      o1.a("Raw write failed!\nError: " + exception.getMessage());
      D.VInterfaceBravo("Raw write failed!\nError: " + exception.getMessage());
      paramm.VInterfaceBravo(o1);
      return;
    } finally {
      paramm.VInterfaceBravo(1.0D);
    } 
  }
  
  protected void JInterfaceJuliet(m paramm) {
    BnInterfaceTango t1 = null;
    BnInterfaceOscar o1 = new BnInterfaceOscar();
    o1.a(paramm);
    paramm.m();
    int i = paramm.p()[0];
    BnInterfaceTango t2 = BnInterfaceTango.a().e(this.TostringInBoPackage, i);
    try {
      t1 = this.d.VInterfaceBravo(t2, 2);
    } catch (VInterfaceBravo b1) {
      throw b1;
    } catch (BnInterfaceOscar o2) {
      Logger.getLogger(l.class.getName()).log(Level.SEVERE, (String)null, (Throwable)o2);
    } 
  }
  
  protected void AInterfaceHotel(m paramm) {
    if (AInterfaceHotel()) {
      F f1 = paramm.v();
      BnInterfaceTango t1 = null;
      BnInterfaceOscar o1 = new BnInterfaceOscar();
      o1.a(paramm);
      paramm.m();
      BnInterfaceTango t2 = BnInterfaceTango.a().TostringInBoPackage(this.TostringInBoPackage, f1, paramm);
      try {
        t1 = this.d.VInterfaceBravo(t2, 2);
      } catch (VInterfaceBravo b1) {
        throw b1;
      } catch (BnInterfaceOscar o2) {
        Logger.getLogger(l.class.getName()).log(Level.SEVERE, (String)null, (Throwable)o2);
      } 
      if (t1 == null) {
        D.TostringInBoPackage("Download PcVariable response null!");
        throw new G.l("Download PcVariable response null!");
      } 
      if (t1.a() != 255) {
        o1.a(3);
        paramm.VInterfaceBravo(o1);
      } else {
        byte[] arrayOfByte = t1.TostringInBoPackage();
        if (arrayOfByte[0] == 0) {
          o1.a(1);
          paramm.VInterfaceBravo(o1);
        } else if (arrayOfByte[0] == 1) {
          o1.a(2);
          if (arrayOfByte.length > 1) {
            byte[] arrayOfByte1 = new byte[arrayOfByte.length - 1];
            System.arraycopy(arrayOfByte, 1, arrayOfByte1, 1, arrayOfByte1.length);
            String str = new String(arrayOfByte1);
            o1.a(str);
            D.VInterfaceBravo("WritePcVariable: " + str);
          } 
          paramm.VInterfaceBravo(o1);
        } else {
          o1.a(3);
          if (arrayOfByte.length > 1) {
            byte[] arrayOfByte1 = new byte[arrayOfByte.length - 1];
            System.arraycopy(arrayOfByte, 1, arrayOfByte1, 1, arrayOfByte1.length);
            String str = new String(arrayOfByte1);
            o1.a(str);
            D.a("WritePcVariable: " + str);
          } 
          paramm.VInterfaceBravo(o1);
        } 
      } 
    } 
  }
  
  protected void i(m paramm) {
    if (AInterfaceHotel()) {
      F f1 = paramm.v();
      BnInterfaceTango t1 = null;
      BnInterfaceOscar o1 = new BnInterfaceOscar();
      o1.a(paramm);
      paramm.m();
      BnInterfaceTango t2 = BnInterfaceTango.a().d(this.TostringInBoPackage, f1, paramm);
      try {
        t1 = this.d.VInterfaceBravo(t2, 2);
      } catch (VInterfaceBravo b1) {
        throw b1;
      } catch (BnInterfaceOscar o2) {
        Logger.getLogger(l.class.getName()).log(Level.SEVERE, (String)null, (Throwable)o2);
      } 
      if (t1.a() != 255) {
        o1.a(3);
        byte[] arrayOfByte = t1.TostringInBoPackage();
        if (arrayOfByte.length > 0) {
          String str = new String(arrayOfByte);
          o1.a(str);
        } 
        paramm.VInterfaceBravo(o1);
      } else {
        byte[] arrayOfByte = t1.TostringInBoPackage();
        o1.a(1);
        if (arrayOfByte.length > 0) {
          String str = new String(arrayOfByte);
          o1.a(str);
        } 
        paramm.VInterfaceBravo(o1);
      } 
    } 
  }
  
  public boolean AInterfaceHotel() {
    return e().al().equals("basicRequestReply");
  }
  
  private boolean q(m paramm) {
    try {
      F f1 = paramm.v();
      N n1 = (N)this.ad.get(f1.u());
      int[] arrayOfInt = n1.a(paramm.BnInterfaceOscar(), paramm.q(), paramm.r());
      return TostringInBoPackage.VInterfaceBravo(arrayOfInt, paramm.p());
    } catch (Exception exception) {
      D.a(exception.getMessage());
      return false;
    } 
  }
  
  protected void e(m paramm) {
    if (O)
      D.TostringInBoPackage("Write Chunk / Download"); 
    BnInterfaceOscar o1 = new BnInterfaceOscar();
    o1.a(1);
    F f1 = paramm.v();
    boolean bool = false;
    try {
      bool = (q(paramm) && VInterfaceBravo(f1, paramm.BnInterfaceOscar(), paramm.q(), paramm.r())) ? true : false;
    } catch (Exception exception) {
      D.VInterfaceBravo("failed to get CRC for local check");
    } 
    if (bool) {
      String str = "Write Chunk data already matches controller data, skipping. page: " + (paramm.BnInterfaceOscar() + 1) + ", ";
      D.d(str);
      o1.a(1);
      o1.a(str);
      o1.a(paramm);
      paramm.VInterfaceBravo(o1);
      if (!f1.x(paramm.BnInterfaceOscar()))
        f1.u(-2); 
      this.l = -1L;
      f1.BnInterfaceTango(-2);
      f1.u(-2);
      o1.a(1);
      o1.VInterfaceBravo(f1.u());
      paramm.VInterfaceBravo(1.0D);
      paramm.VInterfaceBravo(o1);
      TostringInBoPackage(f1.u(), paramm.BnInterfaceOscar());
      return;
    } 
    int i = paramm.BnInterfaceOscar();
    f1.u(i);
    o1.a(paramm);
    try {
      a(f1, i);
      int i1 = 0;
      a(f1, paramm.BnInterfaceOscar(), paramm.q());
      byte b1 = 2;
      List list = BnInterfaceTango.a().VInterfaceBravo(this.TostringInBoPackage, f1, paramm);
      for (List list1 : list) {
        this.i.q();
        BnInterfaceTango BnInterfaceTango = this.d.a(list1);
        if (BnInterfaceTango == null) {
          D.TostringInBoPackage("Download response null!");
          throw new G.l("Download response null!");
        } 
        if (BnInterfaceTango.a() != 255) {
          D.VInterfaceBravo("DOWNLOAD Failed! retrying..");
          this.l = -1L;
          a(f1, paramm.BnInterfaceOscar(), paramm.q() + i1);
          BnInterfaceTango = this.d.a(list1);
          if (BnInterfaceTango.a() != 255) {
            D.VInterfaceBravo("DOWNLOAD Failed again!");
            if ((BnInterfaceTango.TostringInBoPackage()).length > 0)
              throw new G.l("Download response Error! " + TostringInBoPackage.d(BnInterfaceTango.d())); 
            throw new G.l("Download response Error!");
          } 
          for (BnInterfaceTango t1 : list1) {
            i1 += t1.VInterfaceBravo() - b1;
            paramm.VInterfaceBravo((i1 / paramm.r()));
          } 
          continue;
        } 
        for (BnInterfaceTango t1 : list1) {
          i1 += t1.VInterfaceBravo() - b1;
          this.l += (t1.VInterfaceBravo() - b1);
        } 
      } 
    } catch (VInterfaceBravo b1) {
      throw b1;
    } catch (Exception exception) {
      o1.a(3);
      o1.a("Device write failed!\nError: " + exception.getMessage());
      D.VInterfaceBravo("Device write failed!\nError: " + exception.getMessage());
      paramm.VInterfaceBravo(o1);
      return;
    } finally {
      paramm.VInterfaceBravo(1.0D);
    } 
    if (o1.a() == 1) {
      N n1 = (N)this.ad.get(f1.u());
      n1.a(paramm.BnInterfaceOscar(), paramm.q(), paramm.p(), false);
      boolean bool1 = true;
      if (bool1)
        try {
          if (!VInterfaceBravo(f1, paramm.BnInterfaceOscar(), paramm.q(), paramm.r())) {
            if (paramm.AInterfaceHotel() < 4) {
              D.VInterfaceBravo("Write failed CRC validation! Resending DOWNLOAD p:" + paramm.BnInterfaceOscar() + ", BnInterfaceOscar:" + paramm.q() + ", l:" + paramm.r());
              TostringInBoPackage(this.TostringInBoPackage.r());
              this.d.i();
              this.l = -1L;
              f1.BnInterfaceTango(-1);
              try {
                AInterfaceGolf();
              } catch (BnInterfaceOscar o2) {
                Logger.getLogger(l.class.getName()).log(Level.INFO, "This shouldn'BnInterfaceTango have happened.", (Throwable)o2);
              } 
              paramm.TostringInBoPackage(paramm.AInterfaceHotel() + 1);
              e(paramm);
            } else {
              D.a("Write failed CRC validation after 3 tries! Giving up and raising an error.");
              o1.a(3);
              o1.a(false);
              o1.a("Write failed CRC validation after 3 tries! p:" + paramm.BnInterfaceOscar() + ", BnInterfaceOscar:" + paramm.q() + ", l:" + paramm.r());
              byte[] arrayOfByte1 = TostringInBoPackage.a(n1.VInterfaceBravo(paramm.BnInterfaceOscar()));
              byte[] arrayOfByte2 = new byte[paramm.r()];
              System.arraycopy(arrayOfByte1, paramm.q(), arrayOfByte2, 0, arrayOfByte2.length);
              int[] arrayOfInt = a(f1, paramm.BnInterfaceOscar(), paramm.q(), paramm.r(), (m)null, false);
              a(TostringInBoPackage.VInterfaceBravo(arrayOfByte2), arrayOfInt, paramm.BnInterfaceOscar(), paramm.q());
            } 
          } else {
            D.d("Write verified. " + paramm.BnInterfaceOscar() + ":" + paramm.q() + ":" + paramm.r());
          } 
        } catch (G.l l1) {
          o1.a(3);
          o1.a("Write succeded, but crc validation failed: " + l1.getMessage());
          D.VInterfaceBravo("Write succeded, but crc validation failed!\nError: " + l1.getMessage());
        }  
    } 
    paramm.VInterfaceBravo(o1);
  }
  
  protected int[] a(F paramF, int paramInt, m paramm) {
    D.TostringInBoPackage("Upload / Read Page: " + paramInt);
    return a(paramF, paramInt, 0, paramF.IO(paramInt), paramm);
  }
  
  private void a(F paramF, int paramInt1, int paramInt2) {
    BnInterfaceTango t2;
    int i = paramInt2 + paramF.y(paramInt1);
    if (O)
      D.TostringInBoPackage("Setting MTA, page= " + paramInt1 + ", address= 0x" + Integer.toHexString(i).toUpperCase()); 
    BnInterfaceTango t1 = BnInterfaceTango.a().a(this.TostringInBoPackage, i);
    byte b1 = 0;
    String str = "Unknown";
    do {
      b1++;
      t2 = this.d.VInterfaceBravo(t1, 2);
      if (t2.a() == 255)
        continue; 
      D.a("SET_MTA Error!");
      str = "None";
      if ((t2.TostringInBoPackage()).length <= 0)
        continue; 
      int i1 = TostringInBoPackage.a(t2.TostringInBoPackage()[0]);
      D.d("Error Code: " + TostringInBoPackage.d(t2.TostringInBoPackage()));
      str = BnInterfaceNovember.a(t2.TostringInBoPackage()[0]);
      if (i1 == 32 || i1 == 33 || i1 == 34) {
        G.l l1 = new G.l("Fatal Error " + str);
        l1.a(i1);
        l1.a(false);
        throw l1;
      } 
      D.VInterfaceBravo("Error setting address: " + str);
    } while (t2.a() != 255 && b1 < 3);
    if (t2.a() != 255) {
      G.l l1 = new G.l("Error: " + str);
      throw l1;
    } 
    this.l = i;
  }
  
  protected void m(m paramm) {
    int[] arrayOfInt = a(paramm.v(), paramm.BnInterfaceOscar(), paramm);
    BnInterfaceOscar o1 = new BnInterfaceOscar();
    o1.a(arrayOfInt);
    o1.a(1);
    o1.a(paramm);
    paramm.VInterfaceBravo(o1);
  }
  
  protected void BnInterfaceNovember(m paramm) {
    int[] arrayOfInt;
    F f1 = paramm.v();
    int i = paramm.BnInterfaceOscar();
    int i1 = paramm.q();
    int i2 = paramm.IO();
    paramm.VInterfaceBravo(0.0D);
    try {
      arrayOfInt = a(f1, i, i1, i2, paramm);
    } catch (G.l l1) {
      if (f1.i() > f1.m()) {
        D.d("Timeout reading chunk " + (i + 1) + ", blockReadTimeout=" + f1.i() + ", giving up..");
        throw l1;
      } 
      f1.TostringInBoPackage(f1.i() + 50);
      D.d("Timeout reading chunk " + (i + 1) + ", increased blockReadTimeout to " + f1.i() + ", trying once more.");
      try {
        Thread.sleep(f1.i());
      } catch (InterruptedException interruptedException) {
        Logger.getLogger(J.class.getName()).log(Level.INFO, (String)null, interruptedException);
      } 
      arrayOfInt = a(f1, i, i1, i2, paramm);
    } 
    paramm.VInterfaceBravo((i + 1.0D) / arrayOfInt.length);
    BnInterfaceOscar o1 = new BnInterfaceOscar();
    o1.a(paramm);
    o1.a(1);
    o1.a(arrayOfInt);
    paramm.VInterfaceBravo(o1);
  }
  
  protected int[] a(F paramF, int paramInt1, int paramInt2, int paramInt3, m paramm) {
    return a(paramF, paramInt1, paramInt2, paramInt3, paramm, true);
  }
  
  protected int[] a(F paramF, int paramInt1, int paramInt2, int paramInt3, m paramm, boolean paramBoolean) {
    if (paramInt3 == 0)
      return new int[0]; 
    char TostringInBoPackage = 'က';
    byte b1 = 30;
    if (paramInt3 <= TostringInBoPackage && paramInt3 > b1) {
      if (paramBoolean && VInterfaceBravo(paramF, paramInt1, paramInt2, paramInt3)) {
        D.d("Checksum matches, using local data.");
        N n1 = (N)this.ad.get(paramF.u());
        return n1.a(paramInt1, paramInt2, paramInt3);
      } 
      if (paramBoolean)
        D.d("Checksum does not match, refreshing from controller."); 
      int[] arrayOfInt1 = VInterfaceBravo(paramF, paramInt1, paramInt2, paramInt3, paramm);
      if (I() && paramInt3 > b1) {
        N n1 = (N)this.ad.get(paramF.u());
        int[] arrayOfInt2 = n1.a(paramInt1, paramInt2, paramInt3);
        a(arrayOfInt2, arrayOfInt1, paramInt1, paramInt2 + paramF.y(paramInt1));
      } 
      U();
      return arrayOfInt1;
    } 
    int[] arrayOfInt = new int[paramInt3];
    GInterfaceCf GInterfaceCf = new GInterfaceCf(paramF, paramm, paramInt3);
    int i = 0;
    while (true) {
      int[] arrayOfInt1;
      byte b2 = (paramInt3 - i > TostringInBoPackage) ? TostringInBoPackage : (paramInt3 - i);
      GInterfaceCf.JInterfaceJuliet(b2);
      if (b2 > b1 && paramBoolean && VInterfaceBravo(paramF, paramInt1, paramInt2 + i, b2)) {
        D.d("Checksum matches, using local data.");
        N n1 = (N)this.ad.get(paramF.u());
        arrayOfInt1 = n1.a(paramInt1, paramInt2 + i, b2);
      } else {
        if (paramBoolean)
          D.d("Checksum does not match, refreshing from controller."); 
        if (I() && b2 > b1) {
          N n1 = (N)this.ad.get(paramF.u());
          int[] arrayOfInt2 = n1.a(paramInt1, paramInt2 + i, b2);
          arrayOfInt1 = VInterfaceBravo(paramF, paramInt1, paramInt2 + i, b2, (m)GInterfaceCf);
          a(arrayOfInt2, arrayOfInt1, paramInt1, i + paramInt2 + paramF.y(paramInt1));
        } else {
          arrayOfInt1 = VInterfaceBravo(paramF, paramInt1, paramInt2 + i, b2, (m)GInterfaceCf);
        } 
        U();
      } 
      GInterfaceCf.VInterfaceBravo(1.0D);
      try {
        System.arraycopy(arrayOfInt1, 0, arrayOfInt, i, arrayOfInt1.length);
        i += arrayOfInt1.length;
        GInterfaceCf.BnInterfaceKilo(i);
      } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
        D.TostringInBoPackage("IndexOutOfBoundsException caught: chunkData.length=" + arrayOfInt1.length + ", offset=" + paramInt2);
        indexOutOfBoundsException.printStackTrace();
      } 
      if (paramInt3 - i <= 0)
        return arrayOfInt; 
    } 
  }
  
  protected byte[] a(int[] paramArrayOfint) {
    byte[] arrayOfByte = TostringInBoPackage.a(paramArrayOfint);
    return this.AInterfaceGolf.a(arrayOfByte);
  }
  
  private int[] VInterfaceBravo(F paramF, int paramInt1, int paramInt2, int paramInt3, m paramm) {
    if (paramInt3 <= 0)
      return new int[0]; 
    D.TostringInBoPackage("Upload / Read Chunk: page:" + (paramInt1 + 1) + " len:" + paramInt3);
    a(paramF, paramInt1);
    List<BnInterfaceKilo> list = BnInterfaceTango.a().a(paramF, this.TostringInBoPackage, paramInt1, paramInt3);
    int i = paramInt2;
    byte[] arrayOfByte = new byte[paramInt3];
    try {
      a(paramF, paramInt1, i);
    } catch (VInterfaceBravo b3) {
      throw new G.l("Timeout on setMTA.");
    } catch (BnInterfaceOscar o1) {
      Logger.getLogger(l.class.getName()).log(Level.SEVERE, (String)null, (Throwable)o1);
      throw new G.l("Invalid Packet: " + o1.getLocalizedMessage());
    } 
    byte b1 = 0;
    for (byte b2 = 0; b2 < list.size(); b2++) {
      y y;
      this.m = System.currentTimeMillis();
      BnInterfaceKilo k1 = list.get(b2);
      this.i.p();
      int i1 = i;
      try {
        D.TostringInBoPackage("calling upload, expecting " + k1.VInterfaceBravo() + " packets");
        y = this.d.VInterfaceBravo(k1);
        if (y != null && y.TostringInBoPackage() != null) {
          D.TostringInBoPackage("Finished upload, got " + y.TostringInBoPackage().size() + " packets");
        } else {
          D.TostringInBoPackage("Got Crap");
        } 
      } catch (VInterfaceBravo b3) {
        y = new y();
        y.a(3);
      } catch (BnInterfaceOscar o1) {
        Logger.getLogger(l.class.getName()).log(Level.SEVERE, (String)null, (Throwable)o1);
        throw new G.l("Invalid Packet: " + o1.getLocalizedMessage());
      } 
      if (y.a() == 3) {
        if (b1++ > 2) {
          String str = (y.VInterfaceBravo() != null) ? ("\BnInterfaceNovember" + y.VInterfaceBravo()) : "";
          D.VInterfaceBravo("Giving up. Fail Cout = " + b1);
          throw new G.l("Read chunk failed: " + paramInt1 + str);
        } 
        D.VInterfaceBravo("Packet Failed on UPLOAD, retrying.");
        b2--;
        try {
          TostringInBoPackage(this.TostringInBoPackage.r());
          this.d.i();
          this.l = -1L;
          AInterfaceGolf();
          a(paramF, paramInt1, i1);
          i = i1;
        } catch (VInterfaceBravo b3) {
          throw new G.l("Timeout on setMTA.");
        } catch (BnInterfaceOscar o1) {
          Logger.getLogger(l.class.getName()).log(Level.SEVERE, (String)null, (Throwable)o1);
          throw new G.l("Invalid Packet: " + o1.getLocalizedMessage());
        } 
      } else if (y.a() != 1) {
        if (b1++ > 2) {
          String str = (y.VInterfaceBravo() != null) ? ("\BnInterfaceNovember" + y.VInterfaceBravo()) : "";
          throw new G.l("Read chunk Unknown response: 0x" + Integer.toHexString(y.a()).toUpperCase() + ", " + paramInt1 + str);
        } 
        D.VInterfaceBravo("Packet not successful on UPLOAD, retrying.");
        b2--;
        try {
          TostringInBoPackage(this.TostringInBoPackage.r());
          this.d.i();
          this.l = -1L;
          AInterfaceGolf();
          a(paramF, paramInt1, i1);
          i = i1;
        } catch (VInterfaceBravo b3) {
          throw new G.l("Timeout on setMTA.");
        } catch (BnInterfaceOscar o1) {
          Logger.getLogger(l.class.getName()).log(Level.SEVERE, (String)null, (Throwable)o1);
          throw new G.l("Invalid Packet: " + o1.getLocalizedMessage());
        } 
      } else {
        b1 = 0;
        List list1 = y.TostringInBoPackage();
        int i2 = 0;
        for (BnInterfaceTango BnInterfaceTango : list1) {
          try {
            byte[] arrayOfByte1 = BnInterfaceTango.TostringInBoPackage();
            System.arraycopy(arrayOfByte1, 0, arrayOfByte, i - paramInt2 + i2, arrayOfByte1.length);
            i2 += arrayOfByte1.length;
            if (paramm != null)
              paramm.VInterfaceBravo(((i - paramInt2 + i2) / arrayOfByte.length)); 
          } catch (Exception exception) {
            throw new G.l("Invalid data.");
          } 
        } 
        i += i2;
        this.l += i;
      } 
    } 
    N n1 = (N)this.ad.get(paramF.u());
    int[] arrayOfInt = TostringInBoPackage.VInterfaceBravo(arrayOfByte);
    n1.a(paramInt1, paramInt2, arrayOfInt, true);
    if (!VInterfaceBravo(paramF, paramInt1, paramInt2, paramInt3)) {
      D.VInterfaceBravo("CRC doesn'BnInterfaceTango match after upload, raising error. p=" + (paramInt1 + 1) + ", BnInterfaceOscar=" + paramInt2 + ", l=" + paramInt3);
      throw new G.l("CRC doesn'BnInterfaceTango match after upload");
    } 
    return TostringInBoPackage.VInterfaceBravo(arrayOfByte);
  }
  
  public boolean TostringInBoPackage(F paramF, int paramInt) {
    return this.AInterfaceGolf.a();
  }
  
  protected boolean a(F paramF, int paramInt1, int paramInt2, int paramInt3) {
    return false;
  }
  
  protected boolean VInterfaceBravo(F paramF, int paramInt1, int paramInt2, int paramInt3) {
    if (!this.AInterfaceGolf.a())
      return false; 
    if (O) {
      int i1 = paramInt2 + paramF.y(paramInt1);
      D.TostringInBoPackage("BUILD_CHECKSUM, page= " + paramInt1 + ", offset= 0x" + Integer.toHexString(i1).toUpperCase() + ", BlockSize: 0x" + Integer.toHexString(paramInt3));
    } 
    a(paramF, paramInt1);
    try {
      a(paramF, paramInt1, paramInt2);
    } catch (VInterfaceBravo b2) {
      throw new G.l("Timout: " + b2.getLocalizedMessage());
    } catch (BnInterfaceOscar o1) {
      Logger.getLogger(l.class.getName()).log(Level.SEVERE, (String)null, (Throwable)o1);
      throw new G.l("Format Error: " + o1.getMessage());
    } 
    char TostringInBoPackage = 'က';
    int i = paramInt3;
    BnInterfaceTango BnInterfaceTango = null;
    byte b1 = 0;
    while (true) {
      int i1;
      if (i > TostringInBoPackage) {
        i1 = TostringInBoPackage;
      } else {
        i1 = i;
      } 
      i -= TostringInBoPackage;
      BnInterfaceTango t1 = BnInterfaceTango.a().VInterfaceBravo(this.TostringInBoPackage, i1);
      String str = "Unknown";
      try {
        b1++;
        BnInterfaceTango = this.d.VInterfaceBravo(t1, 2);
        if (BnInterfaceTango.a() == 255) {
          N n1 = (N)this.ad.get(paramF.u());
          byte[] arrayOfByte1 = TostringInBoPackage.a(n1.VInterfaceBravo(paramInt1));
          byte[] arrayOfByte2 = new byte[i1];
          System.arraycopy(arrayOfByte1, paramInt2, arrayOfByte2, 0, arrayOfByte2.length);
          if (!this.AInterfaceGolf.a(this.TostringInBoPackage, arrayOfByte2, BnInterfaceTango)) {
            this.i.w();
            return false;
          } 
          this.i.v();
          paramInt2 += arrayOfByte2.length;
        } 
      } catch (VInterfaceBravo b2) {
        if (b1 > 1)
          throw new G.l("Timeout: " + b2.getLocalizedMessage()); 
      } catch (BnInterfaceOscar o1) {
        throw new G.l("Format: " + o1.getLocalizedMessage());
      } catch (G.l l1) {
        throw new G.l("Connection Error: " + l1.getLocalizedMessage());
      } 
      if (i <= 0)
        return (BnInterfaceTango != null && BnInterfaceTango.a() == 255); 
    } 
  }
  
  protected void BnInterfaceOscar(String paramString) {
    super.BnInterfaceOscar(paramString);
    R r = T.a().TostringInBoPackage(paramString);
    if (r != null)
      this.d.a(r.O()); 
  }
  
  protected boolean BnInterfaceKilo() {
    return this.E;
  }
  
  public boolean r() {
    return (this.VInterfaceBravo != null && this.VInterfaceBravo.isAlive());
  }
  
  public boolean q() {
    return (this.F && O());
  }
  
  protected boolean p() {
    return this.ap.m();
  }
  
  protected boolean a(int paramInt) {
    return this.ap.a(paramInt);
  }
  
  public boolean a(Thread paramThread) {
    return false;
  }
  
  public IO a() {
    return this.ap;
  }
  
  public void VInterfaceBravo(m paramm) {
    super.VInterfaceBravo(paramm);
  }
  
  public void a(IO paramf) {
    if (this.ap != null) {
      this.ap.VInterfaceBravo(this.d);
      this.ap.VInterfaceBravo(this.e);
    } 
    this.ap = paramf;
    try {
      this.TostringInBoPackage.VInterfaceBravo(paramf.s());
    } catch (IOException iOException) {
      Logger.getLogger(l.class.getName()).log(Level.SEVERE, "Unable to set proper Transport for XCP", iOException);
    } 
    this.d.a(paramf);
    paramf.a(this.d);
    paramf.a(this.e);
  }
  
  public void JInterfaceJuliet() {
    if (this.ap != null) {
      this.ap.VInterfaceBravo(this.d);
      this.ap.VInterfaceBravo(this.e);
    } 
    this.ap = null;
  }
  
  private void V() {
    for (e e : this.AInterfaceHotel) {
      try {
        BnInterfaceTango t1 = BnInterfaceTango.a().VInterfaceBravo(this.TostringInBoPackage);
        BnInterfaceTango t2 = this.d.VInterfaceBravo(t1, 3);
        if (t2 == null || (t2.a() == 254 && (t2.TostringInBoPackage()).length > 0))
          while (t2 == null || t2.TostringInBoPackage()[0] == 16 || t2.TostringInBoPackage()[0] == 18) {
            String str = null;
            if (t2 != null)
              str = TostringInBoPackage.d(t2.TostringInBoPackage()); 
            D.VInterfaceBravo("GET_DAQ_PROCESSOR_INFO Error Code: " + str + " waiting before retry");
            a(this.TostringInBoPackage.s());
            t2 = this.d.a(t1);
          }  
        if (t2.a() != 255) {
          if ((t2.TostringInBoPackage()).length > 0)
            D.VInterfaceBravo("GET_DAQ_PROCESSOR_INFO Error Code: " + TostringInBoPackage.d(t2.TostringInBoPackage()) + ", Using defaults"); 
        } else {
          byte[] arrayOfByte = t2.TostringInBoPackage();
          if (arrayOfByte.length != 7) {
            String str = "GET_DAQ_PROCESSOR_INFO: Invalid Packet Length! " + TostringInBoPackage.d(t2.d());
            D.VInterfaceBravo(str);
            throw new G.l(str);
          } 
          e.TostringInBoPackage().a(arrayOfByte[0]);
          int i1 = TostringInBoPackage.a(arrayOfByte, 1, 2, this.TostringInBoPackage.AInterfaceGolf(), false);
          e.TostringInBoPackage().a(i1);
          int i2 = TostringInBoPackage.a(arrayOfByte, 3, 2, this.TostringInBoPackage.AInterfaceGolf(), false);
          e.TostringInBoPackage().VInterfaceBravo(i2);
          e.TostringInBoPackage().TostringInBoPackage(arrayOfByte[5]);
          e.TostringInBoPackage().VInterfaceBravo(arrayOfByte[6]);
          D.d("Set Processor Info: " + e.TostringInBoPackage());
        } 
        for (byte b1 = 0; b1 < e.TostringInBoPackage().VInterfaceBravo(); b1++)
          TostringInBoPackage(e, b1); 
      } catch (VInterfaceBravo b1) {
        Logger.getLogger(l.class.getName()).log(Level.SEVERE, "Timeout initializing DAQ", (Throwable)b1);
        throw b1;
      } catch (BnInterfaceOscar o1) {
        Logger.getLogger(l.class.getName()).log(Level.SEVERE, "Failed to get DAQ Processor Info", (Throwable)o1);
        throw o1;
      } 
      try {
        BnInterfaceTango t1 = BnInterfaceTango.a().TostringInBoPackage(this.TostringInBoPackage);
        BnInterfaceTango t2 = this.d.VInterfaceBravo(t1, 3);
        if (t2 == null || (t2.a() == 254 && (t2.TostringInBoPackage()).length > 0))
          while (t2 == null || t2.TostringInBoPackage()[0] == 16 || t2.TostringInBoPackage()[0] == 18) {
            String str = null;
            if (t2 != null)
              str = TostringInBoPackage.d(t2.TostringInBoPackage()); 
            D.VInterfaceBravo("GET_DAQ_RESOLUTION_INFO Error Code: " + str + " waiting before retry");
            a(this.TostringInBoPackage.s());
            t2 = this.d.a(t1);
          }  
        if (t2.a() != 255) {
          if ((t2.TostringInBoPackage()).length > 0)
            D.VInterfaceBravo("GET_DAQ_RESOLUTION_INFO Error Code: " + TostringInBoPackage.d(t2.TostringInBoPackage()) + ", Using defaults"); 
        } else {
          byte[] arrayOfByte = t2.TostringInBoPackage();
          if (arrayOfByte.length != 7) {
            String str = "GET_DAQ_RESOLUTION_INFO: Invalid Packet Length! " + TostringInBoPackage.d(t2.d());
            D.VInterfaceBravo(str);
            throw new G.l(str);
          } 
          e.d().e(TostringInBoPackage.a(arrayOfByte[0]));
          e.d().a(TostringInBoPackage.a(arrayOfByte[1]));
          e.d().VInterfaceBravo(TostringInBoPackage.a(arrayOfByte[2]));
          e.d().TostringInBoPackage(TostringInBoPackage.a(arrayOfByte[3]));
          e.d().d().a(arrayOfByte[4]);
          int i1 = TostringInBoPackage.a(arrayOfByte, 5, 2, this.TostringInBoPackage.AInterfaceGolf(), false);
          e.d().d(i1);
          this.TostringInBoPackage.a(e.d().d().a());
          D.d("Set DAQ Resolution Info: " + e.d());
          D.TostringInBoPackage("TimeStamp: " + e.d().d().toString());
          D.TostringInBoPackage("TimeStamp ticks = " + i1);
        } 
      } catch (VInterfaceBravo b1) {
        Logger.getLogger(l.class.getName()).log(Level.SEVERE, "Timeout initializing DAQ", (Throwable)b1);
        throw b1;
      } catch (BnInterfaceOscar o1) {
        Logger.getLogger(l.class.getName()).log(Level.SEVERE, "Failed to get DAQ Processor Info", (Throwable)o1);
        throw o1;
      } 
      e.a(e.TostringInBoPackage().VInterfaceBravo());
      for (int i = e.TostringInBoPackage().d(); i < e.TostringInBoPackage().VInterfaceBravo(); i++) {
        try {
          IO(e, i);
        } catch (G.l l1) {
          IO(e, i);
        } 
      } 
    } 
  }
  
  private e q(String paramString) {
    for (e e : this.AInterfaceHotel) {
      if (e.a().equals(paramString))
        return e; 
    } 
    return null;
  }
  
  protected BnInterfaceOscar BnInterfaceOscar(m paramm) {
    BnInterfaceOscar o1 = new BnInterfaceOscar();
    o1.a(paramm);
    paramm.m();
    int i = paramm.i();
    e e = q(paramm.v().u());
    a(e, i);
    o1.a(1);
    paramm.VInterfaceBravo(o1);
    return o1;
  }
  
  protected void a(e parame, int paramInt) {
    TostringInBoPackage TostringInBoPackage = parame.VInterfaceBravo(paramInt);
    D.TostringInBoPackage("XcpMasterCommDriver:: updating DAQ List: " + TostringInBoPackage.toString());
    try {
      TostringInBoPackage(parame, paramInt);
      VInterfaceBravo(parame, paramInt);
      byte b1 = 0;
      while (true) {
        a(parame, paramInt, b1, 0);
        BnInterfaceKilo k1 = TostringInBoPackage.TostringInBoPackage(b1);
        for (bO.l l1 : k1)
          a(parame, (byte)-1, (byte)l1.VInterfaceBravo(), (byte)0, l1.a()); 
        if (++b1 >= TostringInBoPackage.IO()) {
          if (TostringInBoPackage.m())
            d(parame, paramInt); 
          if (!this.r.isEmpty()) {
            for (GInterfaceAf GInterfaceAf : this.r)
              a(GInterfaceAf); 
            this.r.clear();
          } 
          return;
        } 
      } 
    } catch (BnInterfaceOscar o1) {
      Logger.getLogger(l.class.getName()).log(Level.SEVERE, "Invalid Command Structure, critical failure.", (Throwable)o1);
    } catch (JInterfaceJuliet j1) {
      String str1 = e().u();
      String str2 = j1.getMessage() + " Channels active: " + ManagerUsingArrayList.a().VInterfaceBravo(str1);
      Logger.getLogger(l.class.getName()).log(Level.SEVERE, "Error writing DAQ.", (Throwable)j1);
      VInterfaceBravo(str1, str2);
      throw new VInterfaceBravo("Error updating Runtime tables.");
    } 
  }
  
  protected void a(e parame, byte paramByte1, byte paramByte2, byte paramByte3, long paramLong) {
    try {
      BnInterfaceTango t1 = BnInterfaceTango.a().a(this.TostringInBoPackage, paramByte1, paramByte2, paramByte3, paramLong);
      BnInterfaceTango t2 = this.d.VInterfaceBravo(t1, 3);
      if (t2 == null || (t2.a() == 254 && (t2.TostringInBoPackage()).length > 0))
        while (t2 == null || ((t2.TostringInBoPackage()).length > 0 && (t2.TostringInBoPackage()[0] == 16 || t2.TostringInBoPackage()[0] == 18))) {
          String str = null;
          if (t2 != null)
            str = TostringInBoPackage.d(t2.TostringInBoPackage()); 
          D.VInterfaceBravo("WRITE_DAQ Error Code: " + str + " waiting before retry");
          a(this.TostringInBoPackage.s());
          t2 = this.d.a(t1);
        }  
      if (t2.a() != 255) {
        if ((t2.TostringInBoPackage()).length > 0)
          D.VInterfaceBravo("WRITE_DAQ Error Code: " + TostringInBoPackage.d(t2.TostringInBoPackage()) + ", Using defaults"); 
        parame.d(-1);
        parame.e(-1);
        parame.IO(-1);
        throw new JInterfaceJuliet("Error writing ODT Entry");
      } 
      TostringInBoPackage TostringInBoPackage = parame.VInterfaceBravo(parame.AInterfaceHotel());
      int i = parame.JInterfaceJuliet() + 1;
      if (i < TostringInBoPackage.TostringInBoPackage()) {
        parame.IO(i);
      } else {
        parame.d(-1);
        parame.e(-1);
        parame.IO(-1);
      } 
    } catch (VInterfaceBravo b1) {
      D.a("Timeout initializing DAQ");
      throw b1;
    } catch (BnInterfaceOscar o1) {
      D.a("Failed to get DAQ Processor Info");
      throw o1;
    } 
  }
  
  protected void VInterfaceBravo(e parame, int paramInt) {
    try {
      BnInterfaceTango t1 = BnInterfaceTango.a().d(this.TostringInBoPackage, paramInt);
      BnInterfaceTango t2 = this.d.VInterfaceBravo(t1, 3);
      if (t2 == null || (t2.a() == 254 && (t2.TostringInBoPackage()).length > 0))
        while (t2 == null || t2.TostringInBoPackage()[0] == 16 || t2.TostringInBoPackage()[0] == 18) {
          String str = null;
          if (t2 != null)
            str = TostringInBoPackage.d(t2.TostringInBoPackage()); 
          D.VInterfaceBravo("CLEAR_DAQ_LIST Error Code: " + str + " waiting before retry");
          a(this.TostringInBoPackage.s());
          t2 = this.d.a(t1);
        }  
      if (t2.a() != 255) {
        if ((t2.TostringInBoPackage()).length > 0)
          D.VInterfaceBravo("CLEAR_DAQ_LIST Error Code: " + TostringInBoPackage.d(t2.TostringInBoPackage()) + ", Using defaults"); 
        throw new JInterfaceJuliet("Error Clearing DAQ List");
      } 
      D.d("Cleared DAQ List " + paramInt);
    } catch (VInterfaceBravo b1) {
      D.a("Timeout initializing DAQ");
      throw b1;
    } catch (BnInterfaceOscar o1) {
      D.a("Failed to get DAQ Processor Info");
      throw o1;
    } 
  }
  
  protected void a(e parame, int paramInt1, int paramInt2, int paramInt3) {
    if (parame.AInterfaceHotel() == paramInt1 && parame.i() == paramInt2 && parame.JInterfaceJuliet() == paramInt3)
      return; 
    try {
      BnInterfaceTango t1 = BnInterfaceTango.a().a(this.TostringInBoPackage, paramInt1, paramInt2, paramInt3);
      BnInterfaceTango t2 = this.d.VInterfaceBravo(t1, 3);
      if (t2 == null || (t2.a() == 254 && (t2.TostringInBoPackage()).length > 0))
        while (t2 == null || t2.TostringInBoPackage()[0] == 16 || t2.TostringInBoPackage()[0] == 18) {
          String str = null;
          if (t2 != null)
            str = TostringInBoPackage.d(t2.TostringInBoPackage()); 
          D.VInterfaceBravo("SET_DAQ_PTR Error Code: " + str + " waiting before retry");
          a(this.TostringInBoPackage.s());
          t2 = this.d.a(t1);
        }  
      if (t2.a() != 255) {
        if ((t2.TostringInBoPackage()).length > 0)
          D.VInterfaceBravo("SET_DAQ_PTR Error Code: " + TostringInBoPackage.d(t2.TostringInBoPackage()) + ", Using defaults"); 
        throw new JInterfaceJuliet("Error Setting DAQ PTR");
      } 
      if (O)
        D.d("Set DAQ PTR  list:" + paramInt1 + ", odtNum:" + paramInt2 + ", odtEntryNum: " + paramInt3); 
      parame.d(paramInt1);
      parame.e(paramInt2);
      parame.IO(paramInt3);
    } catch (VInterfaceBravo b1) {
      D.a("Timeout initializing DAQ");
      throw b1;
    } catch (BnInterfaceOscar o1) {
      D.a("Failed to get DAQ Processor Info");
      throw o1;
    } 
  }
  
  protected BnInterfaceOscar p(m paramm) {
    BnInterfaceOscar o1 = new BnInterfaceOscar();
    o1.a(paramm);
    paramm.m();
    try {
      e e = q(paramm.v().u());
      TostringInBoPackage(e, paramm.i());
    } catch (BnInterfaceOscar o2) {
      Logger.getLogger(l.class.getName()).log(Level.SEVERE, (String)null, (Throwable)o2);
      o1.a(3);
    } 
    paramm.VInterfaceBravo(o1);
    return o1;
  }
  
  public void l() {
    if (e().aw() > 0)
      for (e e : this.AInterfaceHotel) {
        for (int i = e.VInterfaceBravo().VInterfaceBravo().d(); i < e.VInterfaceBravo().VInterfaceBravo().VInterfaceBravo(); i++) {
          boolean bool = false;
          byte b1 = 0;
          try {
            do {
              d(e, i);
              bool = true;
            } while (!bool && b1++ < 3);
          } catch (BnInterfaceOscar o1) {
            Logger.getLogger(l.class.getName()).log(Level.SEVERE, "FormatException??", (Throwable)o1);
          } 
        } 
      }  
  }
  
  public void m() {
    for (e e : this.AInterfaceHotel) {
      for (int i = e.VInterfaceBravo().VInterfaceBravo().d(); i < e.VInterfaceBravo().VInterfaceBravo().VInterfaceBravo(); i++) {
        try {
          boolean bool = false;
          byte b1 = 0;
          do {
            TostringInBoPackage(e, i);
            bool = true;
          } while (!bool && b1++ < 3);
        } catch (BnInterfaceOscar o1) {
          Logger.getLogger(l.class.getName()).log(Level.SEVERE, "FormatException??", (Throwable)o1);
        } 
      } 
    } 
  }
  
  protected void a(byte paramByte) {
    try {
      BnInterfaceTango t1 = BnInterfaceTango.a().a(this.TostringInBoPackage, paramByte);
      BnInterfaceTango t2 = this.d.VInterfaceBravo(t1, 3);
      if (t2 != null && t2.a() != 255) {
        D.VInterfaceBravo("START_STOP_SYNC Failed, DAQ not running?");
      } else {
        if (paramByte == 0) {
          D.d("Stop Sync DAQ ");
        } else if (paramByte == 1) {
          D.d("Start Sync List ");
        } 
        if ((t2.TostringInBoPackage()).length > 0 && t2.TostringInBoPackage()[0] == 0)
          Q(); 
      } 
    } catch (VInterfaceBravo b1) {
      D.a("Timeout StartStop DAQ");
      throw b1;
    } catch (BnInterfaceOscar o1) {
      Logger.getLogger(l.class.getName()).log(Level.SEVERE, "Failed to get DAQ Processor Info", (Throwable)o1);
      throw o1;
    } 
  }
  
  protected void BnInterfaceOscar() {
    a((byte)0);
  }
  
  protected void s() {
    a((byte)1);
  }
  
  protected void TostringInBoPackage(e parame, int paramInt) {
    D.TostringInBoPackage("################### Stopping DAQ " + paramInt);
    a(parame, paramInt, (byte)0);
  }
  
  protected void d(e parame, int paramInt) {
    if (e().aw() > 0) {
      D.TostringInBoPackage("################### Starting DAQ " + paramInt);
      this.m = System.currentTimeMillis();
      AInterfaceGolf(parame, paramInt);
      a(parame, paramInt, (byte)2);
      e(parame, paramInt);
      s();
      D.TostringInBoPackage("################### Started DAQ " + paramInt);
    } 
  }
  
  protected void a(e parame, int paramInt, byte paramByte) {
    try {
      BnInterfaceTango t1 = BnInterfaceTango.a().a(this.TostringInBoPackage, paramInt, paramByte);
      BnInterfaceTango t2 = this.d.VInterfaceBravo(t1, 3);
      this.m = System.currentTimeMillis();
      if (t2 == null || (t2.a() == 254 && (t2.TostringInBoPackage()).length > 0))
        while (t2 == null || t2.TostringInBoPackage()[0] == 16 || t2.TostringInBoPackage()[0] == 18) {
          String str = null;
          if (t2 != null)
            str = TostringInBoPackage.d(t2.TostringInBoPackage()); 
          D.VInterfaceBravo("START_STOP_DAQ Error Code: " + str + " waiting before retry");
          a(this.TostringInBoPackage.s());
          t2 = this.d.a(t1);
        }  
      if (t2.a() != 255) {
        if ((t2.TostringInBoPackage()).length > 0)
          D.VInterfaceBravo("START_STOP_DAQ Error Code: " + TostringInBoPackage.d(t2.TostringInBoPackage()) + ", Using defaults"); 
      } else {
        if (paramByte == 0) {
          D.d("Stopped DAQ List " + paramInt);
        } else if (paramByte == 1) {
          D.d("Started DAQ List " + paramInt);
        } 
        byte[] arrayOfByte = t2.TostringInBoPackage();
        TostringInBoPackage TostringInBoPackage = parame.VInterfaceBravo(paramInt);
        if (TostringInBoPackage == null) {
          D.VInterfaceBravo("Invalid DAQ: " + paramInt);
        } else if (arrayOfByte == null || arrayOfByte.length < 1) {
          D.VInterfaceBravo("No FIRST_PID on START_STOP_DAQ");
        } else {
          TostringInBoPackage.AInterfaceHotel(TostringInBoPackage.a(arrayOfByte[0]));
        } 
      } 
    } catch (VInterfaceBravo b1) {
      D.a("Timeout StartStop DAQ");
      throw b1;
    } catch (BnInterfaceOscar o1) {
      Logger.getLogger(l.class.getName()).log(Level.SEVERE, "Failed to get DAQ Processor Info", (Throwable)o1);
      throw o1;
    } 
  }
  
  protected void e(e parame, int paramInt) {
    if (parame.d().d().a() == 0) {
      D.d("Timestamp not supported by connected device, using local clock.");
      return;
    } 
    try {
      BnInterfaceTango t1 = BnInterfaceTango.a().d(this.TostringInBoPackage);
      BnInterfaceTango t2 = this.d.VInterfaceBravo(t1, 3);
      if (t2 == null || (t2.a() == 254 && (t2.TostringInBoPackage()).length > 0))
        while (t2 == null || t2.TostringInBoPackage()[0] == 16 || t2.TostringInBoPackage()[0] == 18) {
          String str = null;
          if (t2 != null)
            str = TostringInBoPackage.d(t2.TostringInBoPackage()); 
          D.VInterfaceBravo("GET_DAQ_CLOCK Error Code: " + str + " waiting before retry");
          a(this.TostringInBoPackage.s());
          t2 = this.d.a(t1);
        }  
      if (t2.a() != 255) {
        if ((t2.TostringInBoPackage()).length > 0) {
          D.VInterfaceBravo("GET_DAQ_CLOCK Error Code: " + TostringInBoPackage.d(t2.TostringInBoPackage()) + ", Using defaults");
        } else {
          D.VInterfaceBravo("GET_DAQ_CLOCK Error");
        } 
      } else {
        byte[] arrayOfByte = t2.TostringInBoPackage();
        TostringInBoPackage TostringInBoPackage = parame.VInterfaceBravo(paramInt);
        if (TostringInBoPackage == null) {
          D.VInterfaceBravo("Invalid DAQ: " + paramInt);
        } else if (arrayOfByte == null || arrayOfByte.length != 7) {
          D.VInterfaceBravo("No Timestamp on GET_DAQ_CLOCK, wrong packet size");
        } else {
          long l1 = TostringInBoPackage.VInterfaceBravo(arrayOfByte, 3, 4, this.TostringInBoPackage.AInterfaceGolf(), false);
          D.TostringInBoPackage("Set timestamp of size: " + parame.d().d().a() + " to value: " + l1);
          TostringInBoPackage.a(l1);
        } 
      } 
    } catch (VInterfaceBravo b1) {
      D.a("Timeout getting DAQ clock");
      throw b1;
    } catch (BnInterfaceOscar o1) {
      Logger.getLogger(l.class.getName()).log(Level.SEVERE, "Failed to get DAQ clock", (Throwable)o1);
      throw o1;
    } 
  }
  
  private void IO(e parame, int paramInt) {
    try {
      BnInterfaceTango t1 = BnInterfaceTango.a().TostringInBoPackage(this.TostringInBoPackage, paramInt);
      BnInterfaceTango t2 = this.d.VInterfaceBravo(t1, 3);
      if (t2 == null || (t2.a() == 254 && (t2.TostringInBoPackage()).length > 0))
        while (t2 == null || t2.TostringInBoPackage()[0] == 16 || t2.TostringInBoPackage()[0] == 18) {
          String str = null;
          if (t2 != null)
            str = TostringInBoPackage.d(t2.TostringInBoPackage()); 
          D.VInterfaceBravo("GET_DAQ_LIST_INFO Error Code: " + str + " waiting before retry");
          a(this.TostringInBoPackage.s());
          t2 = this.d.a(t1);
        }  
      if (t2.a() != 255) {
        if ((t2.TostringInBoPackage()).length > 0)
          D.VInterfaceBravo("GET_DAQ_LIST_INFO Error Code: " + TostringInBoPackage.d(t2.TostringInBoPackage()) + ", Using defaults"); 
      } else {
        byte[] arrayOfByte = t2.TostringInBoPackage();
        if (arrayOfByte.length != 5) {
          String str = "GET_DAQ_LIST_INFO: Invalid Packet Length! " + TostringInBoPackage.d(t2.d());
          D.VInterfaceBravo(str);
          throw new G.l(str);
        } 
        TostringInBoPackage TostringInBoPackage = parame.VInterfaceBravo(paramInt);
        TostringInBoPackage.VInterfaceBravo().a(arrayOfByte[0]);
        TostringInBoPackage.a(TostringInBoPackage.a(arrayOfByte[1]));
        TostringInBoPackage.VInterfaceBravo(TostringInBoPackage.a(arrayOfByte[2]));
        int i = TostringInBoPackage.a(arrayOfByte, 3, 2, this.TostringInBoPackage.AInterfaceGolf(), false);
        TostringInBoPackage.d(i);
        D.d("DAQ List " + paramInt + " Info: " + TostringInBoPackage);
      } 
    } catch (VInterfaceBravo b1) {
      D.a("Timeout configuring DAQ");
      throw b1;
    } catch (BnInterfaceOscar o1) {
      Logger.getLogger(l.class.getName()).log(Level.SEVERE, "Failed to get DAQ Processor Info", (Throwable)o1);
      throw o1;
    } 
  }
  
  private void AInterfaceGolf(e parame, int paramInt) {
    try {
      int i = 100 / e().aw();
      i = Math.max(i, 1);
      BnInterfaceTango t1 = BnInterfaceTango.a().a(this.TostringInBoPackage, parame.TostringInBoPackage().a().VInterfaceBravo(), false, paramInt, parame.VInterfaceBravo(paramInt).d(), (byte)i, (byte)parame.VInterfaceBravo(paramInt).JInterfaceJuliet());
      D.TostringInBoPackage("SET_DAQ_LIST_MODE: " + TostringInBoPackage.d(t1.d()));
      BnInterfaceTango t2 = this.d.VInterfaceBravo(t1, 3);
      if (t2 == null || (t2.a() == 254 && (t2.TostringInBoPackage()).length > 0))
        while (t2 == null || t2.TostringInBoPackage()[0] == 16 || t2.TostringInBoPackage()[0] == 18) {
          String str = null;
          if (t2 != null)
            str = TostringInBoPackage.d(t2.TostringInBoPackage()); 
          D.VInterfaceBravo("SET_DAQ_LIST_MODE Error Code: " + str + " Error: " + BnInterfaceNovember.a(t2.TostringInBoPackage()[0]) + " waiting before retry");
          a(this.TostringInBoPackage.s());
          t2 = this.d.a(t1);
        }  
      if (t2.a() != 255) {
        if ((t2.TostringInBoPackage()).length > 0)
          D.VInterfaceBravo("SET_DAQ_LIST_MODE Error Code: " + TostringInBoPackage.d(t2.TostringInBoPackage()) + " Error: " + BnInterfaceNovember.a(t2.TostringInBoPackage()[0]) + " , Using defaults"); 
      } else {
        byte[] arrayOfByte = t2.TostringInBoPackage();
        if (arrayOfByte.length != 0) {
          String str = "SET_DAQ_LIST_MODE: Invalid Packet Length! " + TostringInBoPackage.d(t2.d());
          D.VInterfaceBravo(str);
          throw new G.l(str);
        } 
      } 
    } catch (VInterfaceBravo b1) {
      D.a("Timeout SET_LIST_MODE DAQ");
      throw b1;
    } catch (BnInterfaceOscar o1) {
      Logger.getLogger(l.class.getName()).log(Level.SEVERE, "Failed to get DAQ Processor Info", (Throwable)o1);
      throw o1;
    } 
  }
  
  protected boolean d(int paramInt) {
    try {
      v();
      BnInterfaceTango t1 = null;
      try {
        t1 = T();
      } catch (Exception exception) {
        t1 = T();
      } 
      if (t1 == null)
        return false; 
      this.l = -1L;
      BnInterfaceOscar();
      byte[] arrayOfByte1 = t1.TostringInBoPackage();
      D.d("Connected with Controller, Protocol version: " + arrayOfByte1[5] + " Transport version: " + arrayOfByte1[6]);
      this.TostringInBoPackage.p().a(arrayOfByte1[0]);
      this.TostringInBoPackage.BnInterfaceTango().a(arrayOfByte1[1]);
      this.TostringInBoPackage.IO(TostringInBoPackage.a(arrayOfByte1[2]));
      this.TostringInBoPackage.AInterfaceGolf(TostringInBoPackage.a(arrayOfByte1, 3, 2, this.TostringInBoPackage.AInterfaceGolf(), false));
      if (arrayOfByte1[5] > 1) {
        IO("Unsupported Protocol Level: " + arrayOfByte1[5]);
        return false;
      } 
      BnInterfaceTango t2 = BnInterfaceTango.a().e();
      t1 = this.d.VInterfaceBravo(t2, 2);
      if (t1 == null || t1.a() != 255) {
        D.a("Received Valid Connect, but failed GET_COMM_MODE_INFO. Using defaults.");
      } else if ((t1.TostringInBoPackage()).length < 7) {
        D.d("Valid GET_COMM_MODE_INFO, but invalid payload, using defaults.");
      } else {
        arrayOfByte1 = t1.TostringInBoPackage();
        this.TostringInBoPackage.AInterfaceHotel(TostringInBoPackage.a(arrayOfByte1[4]));
        if (TostringInBoPackage.a(arrayOfByte1[6]) > al) {
          String str1 = "Dash Echo Server has greater driver version than client, app needs to be updated.\nServer version: " + TostringInBoPackage.a(arrayOfByte1[6]) + ", Client Version: " + al;
          D.a(str1);
          ArrayListInGPackage.a().VInterfaceBravo(e().u(), str1);
          return false;
        } 
        D.d("Slave Driver version: " + TostringInBoPackage.a(arrayOfByte1[6]));
      } 
      BnInterfaceTango t3 = BnInterfaceTango.a().a((byte)0);
      t1 = this.d.VInterfaceBravo(t3, 2);
      if (t1 == null || t1.a() != 255) {
        D.a("Received Valid Connect, but failed GET_ID type 1. Support for Type 1 Get_ID is required to connect.");
        return false;
      } 
      if ((t1.TostringInBoPackage()).length < 7) {
        D.d("Valid Connect response code, but invalid packet size.");
        return false;
      } 
      arrayOfByte1 = t1.TostringInBoPackage();
      byte b1 = arrayOfByte1[0];
      int i = TostringInBoPackage.a(arrayOfByte1, 3, 4, this.TostringInBoPackage.AInterfaceGolf(), false);
      if (i == 0) {
        D.a("GET_ID: Len must be greater than 0");
        return false;
      } 
      byte[] arrayOfByte2 = new byte[i];
      if (b1 == 1) {
        System.arraycopy(arrayOfByte1, 7, arrayOfByte2, 0, arrayOfByte2.length);
      } else {
        D.a("GET_ID:: Mode 1 not yet supported.");
      } 
      F f1 = e();
      String str = null;
      if (f1.al() != null && f1.al().equals("basicRequestReply")) {
        try {
          BnInterfaceTango BnInterfaceTango = BnInterfaceTango.a().VInterfaceBravo(VInterfaceBravo.a);
          t1 = this.d.VInterfaceBravo(BnInterfaceTango, 2);
          if (t1 == null || t1.a() != 255)
            D.a("Received Valid Connect, but failed GetFirmwareinfo."); 
          str = new String(t1.TostringInBoPackage());
        } catch (Exception exception) {
          D.a("GetFirmwareInfo failed: " + exception.getLocalizedMessage());
        } 
        try {
          BnInterfaceTango BnInterfaceTango = BnInterfaceTango.a().VInterfaceBravo(VInterfaceBravo.VInterfaceBravo);
          t1 = this.d.VInterfaceBravo(BnInterfaceTango, 2);
          if (t1 == null || t1.a() != 255)
            D.a("Received Valid Connect, but failed Get Blocking factors."); 
          arrayOfByte1 = t1.TostringInBoPackage();
          if (arrayOfByte1 != null && arrayOfByte1.length == 4) {
            int i1 = TostringInBoPackage.a(arrayOfByte1, 0, 2, true, false);
            int i2 = TostringInBoPackage.a(arrayOfByte1, 2, 2, true, false);
            f1.I(i1);
            f1.H(i2);
          } else {
            D.VInterfaceBravo("Unexpected response size for Get Blocking factors: " + TostringInBoPackage.d(arrayOfByte1));
          } 
        } catch (Exception exception) {
          D.a("Get Blocking factors failed: " + exception.getLocalizedMessage());
        } 
        try {
          BnInterfaceTango BnInterfaceTango = BnInterfaceTango.a().VInterfaceBravo(VInterfaceBravo.TostringInBoPackage);
          t1 = this.d.VInterfaceBravo(BnInterfaceTango, 2);
          if (t1 == null || t1.a() != 255)
            D.a("Received Valid Connect, but failed Get Local CAN ID."); 
          arrayOfByte1 = t1.TostringInBoPackage();
          if (arrayOfByte1 != null && arrayOfByte1.length == 1) {
            int i1 = TostringInBoPackage.a(arrayOfByte1[0]);
            f1.w(i1);
          } else {
            D.VInterfaceBravo("Unexpected response size for Get Local CAN ID: " + TostringInBoPackage.d(arrayOfByte1));
          } 
        } catch (Exception exception) {
          D.a("Get Local CAN ID failed: " + exception.getLocalizedMessage());
        } 
      } 
      try {
        V();
      } catch (G.l l1) {
        try {
          D.a("Initialize DAQ Failed, try again.");
          V();
        } catch (G.l l2) {
          D.a("Initialize DAQ Failed again, raising error");
          throw new IOException("Initialize DAQ Failed.");
        } 
      } 
      AeInterfaceMikeTostring AeInterfaceMikeTostring = new AeInterfaceMikeTostring();
      AeInterfaceMikeTostring.a(arrayOfByte2);
      if (!VInterfaceBravo(arrayOfByte2)) {
        D.VInterfaceBravo("Unsupported Controller Firmware.");
        VInterfaceBravo(AeInterfaceMikeTostring.VInterfaceBravo(), "Invalid data received from controller.");
        return false;
      } 
      this.E = true;
      this.F = true;
      this.G = true;
      this.m = System.currentTimeMillis();
      u();
      s s = new s(this);
      s.start();
      if (str != null && !str.isEmpty()) {
        AeInterfaceMikeTostring.VInterfaceBravo(str);
      } else {
        AeInterfaceMikeTostring.VInterfaceBravo(AeInterfaceMikeTostring.VInterfaceBravo());
      } 
      a(e().u(), AeInterfaceMikeTostring.TostringInBoPackage(), AeInterfaceMikeTostring);
      s.a();
      if (e().aw() > 0) {
        ((e)this.AInterfaceHotel.get(0)).d(-1);
        ((e)this.AInterfaceHotel.get(0)).e(-1);
        ((e)this.AInterfaceHotel.get(0)).IO(-1);
        ((e)this.AInterfaceHotel.get(0)).BnInterfaceKilo();
      } 
      return true;
    } catch (BnInterfaceOscar o1) {
      Logger.getLogger(l.class.getName()).log(Level.SEVERE, (String)null, (Throwable)o1);
      return false;
    } 
  }
  
  public void a(byte[] paramArrayOfbyte, double paramDouble) {
    boolean bool = true;
    if (bool) {
      if (this.JInterfaceJuliet == null || !this.JInterfaceJuliet.isAlive()) {
        if (this.JInterfaceJuliet != null)
          this.JInterfaceJuliet.a(); 
        this.JInterfaceJuliet = new BnInterfaceOscar(this);
        this.JInterfaceJuliet.start();
      } 
      BnInterfaceOscar.a(this.JInterfaceJuliet, paramArrayOfbyte, paramDouble);
      this.m = System.currentTimeMillis();
    } else {
      a(e().u(), paramArrayOfbyte);
    } 
  }
  
  public void P() {
    R r = T.a().TostringInBoPackage();
    this.G = true;
    this.m = System.currentTimeMillis();
    if (r != null) {
      AeInterfaceMikeTostring AeInterfaceMikeTostring = new AeInterfaceMikeTostring();
      AeInterfaceMikeTostring.a(r.i());
      AeInterfaceMikeTostring.VInterfaceBravo(r.P());
      a(r.TostringInBoPackage(), r.P(), AeInterfaceMikeTostring);
    } 
  }
  
  public void Q() {
    this.G = false;
    A();
  }
  
  public void p(String paramString) {
    a(paramString, true);
  }
  
  protected void VInterfaceBravo(String paramString) {
    if (I())
      System.out.println(BnInterfaceKilo.v() + ": " + paramString); 
  }
  
  private boolean VInterfaceBravo(IO paramf) {
    if (paramf != null)
      for (IO f1 : aq.values()) {
        if (f1.equals(paramf))
          return true; 
      }  
    return false;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bQ/l.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */