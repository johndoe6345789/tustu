package bQ;

import A.f;
import A.g;
import A.h;
import G.F;
import G.J;
import G.N;
import G.R;
import G.T;
import G.aB;
import G.aF;
import G.bT;
import G.cF;
import G.cG;
import G.cu;
import G.m;
import G.n;
import G.o;
import J.h;
import J.j;
import V.b;
import V.g;
import ac.h;
import bH.D;
import bH.c;
import bN.b;
import bN.k;
import bN.n;
import bN.o;
import bN.t;
import bO.c;
import bO.j;
import bO.k;
import bU.b;
import com.efiAnalytics.xcp.master.responseProcessors.CrcProcessor;
import com.efiAnalytics.xcp.master.responseProcessors.a;
import com.efiAnalytics.xcp.master.responseProcessors.b;
import com.efiAnalytics.xcp.master.responseProcessors.d;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class l extends J implements g, h {
  private f ap = null;
  
  public static String a = "XCP Master Driver";
  
  n b = null;
  
  final k c = new k();
  
  final f d = new f(this.c);
  
  final m e = new m(this);
  
  final b f = new b();
  
  final CrcProcessor g = new CrcProcessor();
  
  final List h = new ArrayList();
  
  final j i = new j();
  
  o j = null;
  
  a k;
  
  long l = -1L;
  
  long m = 0L;
  
  double n = -1.0D;
  
  p o = null;
  
  public static int al = 1;
  
  int am = 0;
  
  static int an = 0;
  
  float ao = 0.0F;
  
  private static final HashMap aq = new HashMap<>();
  
  public l(F paramF) {
    super(paramF);
    f(paramF);
    f(false);
    this.d.a(new q(this));
    this.d.a(this.i);
    this.k = new a(this, this.i);
    this.k.a();
    this.o = new p(this);
    h.a(this.o);
  }
  
  private void f(F paramF) {
    int i = paramF.g();
    String[] arrayOfString = new String[i];
    for (byte b1 = 0; b1 < arrayOfString.length; b1++)
      arrayOfString[b1] = "XCP"; 
    try {
      paramF.f(arrayOfString);
      paramF.e(null);
      paramF.b(arrayOfString);
      paramF.h(arrayOfString);
      paramF.c(arrayOfString);
      paramF.g(arrayOfString);
    } catch (g g1) {
      Logger.getLogger(l.class.getName()).log(Level.SEVERE, (String)null, (Throwable)g1);
    } 
    e e = new e(paramF.u(), this.c);
    a(e.f());
    this.h.add(e);
    b b2 = new b(paramF.E(), this, e);
    this.d.a(b2);
  }
  
  protected void b(F paramF) {
    super.b(paramF);
  }
  
  public void b(aF paramaF) {
    a(paramaF);
  }
  
  public h D() {
    return (h)this.i;
  }
  
  public String n() {
    return a;
  }
  
  public u a(String paramString) {
    for (e e : this.h) {
      if (e.f().a().equals(paramString))
        return e.f(); 
    } 
    return null;
  }
  
  public void c() {
    if (this.b != null) {
      n.a(this.b);
      this.b.a(true);
    } 
    try {
      if (a() != null)
        a().g(); 
    } catch (Exception exception) {}
  }
  
  private t T() {
    bN.l l1 = t.a().b();
    t t = this.d.a((t)l1, this.c.q() / 4);
    if (t == null || t.a() != 255)
      throw new b("Connect Failed"); 
    if ((t.c()).length != 7) {
      D.d("Valid Connect response code, but invalid packet size.");
      throw new b("Connect Failed, Invalid packet size");
    } 
    return t;
  }
  
  public void f() {
    if (this.F)
      try {
        m();
        bN.l l1 = t.a().c();
        k k1 = new k();
        k1.a((t)l1);
        this.d.a(k1);
        a(100L);
      } catch (Exception exception) {
        Logger.getLogger(l.class.getName()).log(Level.SEVERE, (String)null, exception);
      }  
  }
  
  protected InputStream i() {
    return a().i();
  }
  
  public boolean b() {
    return (this.b != null && n.b(this.b));
  }
  
  public void d() {
    if (this.b == null || !this.b.isAlive() || n.b(this.b)) {
      this.b = new n(this);
      this.b.start();
    } 
    this.m = System.currentTimeMillis();
  }
  
  public void a(boolean paramBoolean) {}
  
  protected o a(m paramm) {
    o o1 = new o();
    try {
      this.ap.f();
      this.c.b(this.ap.s());
      bN.l l1 = t.a().b();
      t t = this.d.a((t)l1);
      D.c("Test: " + this.ap.n());
      if (t == null || t.a() != 255) {
        o1.a(3);
      } else {
        o1.a(1);
        o1.a("Received valid connect response.");
        bN.l l2 = t.a().c();
        k k1 = new k();
        k1.a((t)l2);
        this.d.a(k1);
        a(100L);
      } 
    } catch (Exception exception) {
      if (!(exception instanceof b)) {
        Logger.getLogger(l.class.getName()).log(Level.SEVERE, (String)null, exception);
      } else {
        D.d("Test Timed out, failed.");
      } 
      o1.a(3);
    } finally {
      c();
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
    if (paramm.o() == -2)
      paramm.e(f1.A()); 
    if (paramm.o() < 0) {
      D.b("Burn requested for page:" + paramm.o());
      return;
    } 
    o o1 = new o();
    o1.a(paramm);
    byte b1 = 3;
    paramm.c(paramm.h() + 1);
    try {
      c(true);
    } catch (G.l|b|o l1) {
      o1.a(3);
      o1.a(l1.getLocalizedMessage());
      paramm.b(1.0D);
      paramm.b(o1);
      c(f1.u(), paramm.o());
      return;
    } 
    t t = t.a().a(this.c);
    try {
      long l1 = System.currentTimeMillis();
      t t1 = this.d.a(t);
      if (t1.a() != 255 && paramm.h() <= b1) {
        D.b("Burn failed! Try Count: " + paramm.h() + ", trying again.");
        c(this.c.r());
        this.i.t();
        d(paramm);
        return;
      } 
      if (t1.a() != 255) {
        this.i.t();
        o1.a(3);
        o1.a("Store to flash failed!");
        paramm.b(1.0D);
        paramm.b(o1);
        c(f1.u(), paramm.o());
        return;
      } 
      o1.a(1);
      a a1 = new a();
      this.d.j().a((d)a1);
      synchronized (a1) {
        try {
          a1.wait(4000L);
          D.c("Burn time: " + (System.currentTimeMillis() - l1));
        } catch (InterruptedException interruptedException) {
          Logger.getLogger(l.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
        } finally {
          this.d.j().b((d)a1);
        } 
        if (a1.a()) {
          this.i.r();
        } else {
          this.i.t();
        } 
      } 
    } catch (b|o b2) {
      if (paramm.h() <= b1) {
        D.b("Burn failed! Try Count: " + paramm.h() + ", trying again.");
        c(this.c.r());
        d(paramm);
        return;
      } 
      o1.a(3);
      o1.a(b2.getLocalizedMessage());
      paramm.b(1.0D);
      paramm.b(o1);
      c(f1.u(), paramm.o());
      return;
    } 
    this.l = -1L;
    f1.t(-2);
    f1.u(-2);
    o1.a(1);
    o1.b(f1.u());
    D.c("burned page " + (paramm.o() + 1));
    paramm.b(1.0D);
    paramm.b(o1);
    c(f1.u(), paramm.o());
  }
  
  protected void c(boolean paramBoolean) {
    t t1 = null;
    byte b1 = 0;
    String str = "Unknown";
    t t2 = t.a().a(this.c, paramBoolean);
    do {
      try {
        b1++;
        t1 = this.d.a(t2);
        if (t1.a() != 255) {
          D.a("SET_SEGMENT_MODE Error!");
          str = "None";
          if ((t1.c()).length > 0) {
            int i = c.a(t1.c()[0]);
            D.d("Error Code: " + c.d(t1.c()));
            str = n.a(t1.c()[0]);
            if (i == 32 || i == 33 || i == 39 || i == 40) {
              G.l l1 = new G.l("Fatal Error " + str);
              l1.a(i);
              l1.a(false);
              throw l1;
            } 
            D.b("Error setting address: " + str);
            c(this.c.s());
          } 
        } 
      } catch (b b2) {
        g();
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
  
  protected void c(m paramm) {
    byte b1 = (paramm.n() == 5) ? 5 : 2;
    boolean bool = false;
    U();
    do {
      try {
        this.am++;
        super.c(paramm);
        if (paramm.j() == null || paramm.j().a() == 1 || paramm.j().a() == -1)
          bool = true; 
        if (this.am > 1)
          this.i.i(); 
      } catch (G.l l1) {
        if (this.am > 1)
          this.i.h(); 
        if (l1.a() == 16 || l1.a() == 18) {
          this.am = 0;
          a(this.c.r());
          this.i.u();
        } else {
          if (!l1.b() || this.am >= b1)
            throw l1; 
          D.d("Command failed, performing sync and retry: " + this.am);
          try {
            g();
          } catch (b b2) {
            this.i.h();
            D.a("Sync Failed");
            throw new G.l("Sync Timeout on retry");
          } catch (o o1) {
            Logger.getLogger(l.class.getName()).log(Level.INFO, "Sync failed on retry do to format exception", (Throwable)o1);
            throw new G.l("Sync Formate error on retry");
          } 
        } 
      } catch (b b2) {
        if (this.am > 1)
          this.i.h(); 
        D.d("Timeout, sync and retry: " + this.am);
        try {
          g();
        } catch (Exception exception) {
          D.b("SYNC Failed");
          try {
            g();
          } catch (Exception exception1) {
            D.b("SYNC Failed again");
            this.i.h();
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
      t t1;
      if (this.H && paramF.A() >= 0 && paramF.B() >= 0 && paramF.x(paramF.A()) && paramF.A() != paramInt) {
        D.c("Activate Page, burn page " + (paramF.A() + 1) + " new active page=" + (paramInt + 1));
        m m1 = m.a(paramF, paramF.A());
        d(m1);
      } 
      paramF.t(paramInt);
      D.c("Activate Page: " + (paramInt + 1));
      this.l = -1L;
      t t2 = t.a().a(paramInt);
      byte b1 = 0;
      do {
        b1++;
        t1 = this.d.b(t2, 3);
        if (t1.a() != 255) {
          D.a("SET_CAL_PAGE Error!");
          String str = "None";
          if ((t1.c()).length > 0) {
            int i = c.a(t1.c()[0]);
            D.d("Error Code: " + c.d(t1.c()));
            str = n.a(t1.c()[0]);
            if (i == 32 || i == 33 || i == 39 || i == 40 || i == 33 || i == 38) {
              G.l l1 = new G.l("Fatal Error " + str);
              l1.a(i);
              l1.a(false);
              throw l1;
            } 
            D.b("Error setting cal page: " + str);
          } else if (b1 > 2) {
            G.l l1 = new G.l("Unknown Error");
            l1.a(false);
            throw l1;
          } 
        } 
        paramF.t(paramInt);
      } while (t1.a() != 255 && b1 < 3);
      if (t1.a() != 255) {
        G.l l1 = new G.l("Unknown Error");
        l1.a(false);
        throw l1;
      } 
    } catch (G.l l1) {
      throw l1;
    } catch (Exception exception) {
      D.c("Failed to activate Page: " + paramInt);
      throw new G.l("Activating page" + paramInt + ": " + exception.getMessage());
    } 
  }
  
  protected void l(m paramm) {
    F f1 = paramm.v();
    int[][] arrayOfInt = new int[f1.g()][0];
    paramm.b(0.0D);
    m m1 = new m(f1);
    cG cG = new cG(f1, paramm);
    m1.b((n)cG);
    m();
    try {
      for (byte b1 = 0; b1 < arrayOfInt.length; b1++) {
        cG.a(b1);
        long l1 = System.currentTimeMillis();
        arrayOfInt[b1] = a(f1, b1, m1);
        D.c("Read page time: " + (System.currentTimeMillis() - l1) + "ms.");
      } 
      o o1 = new o();
      o1.a(1);
      o1.a(arrayOfInt);
      paramm.b(o1);
    } finally {
      l();
    } 
  }
  
  protected void g() {
    t t1 = t.a().d();
    t t2 = this.d.a(t1, 1000);
    if (t2.a() != 255) {
      this.i.n();
      if ((t2.c()).length > 0) {
        int i = c.a(t2.c()[0]);
        String str = n.a(t2.c()[0]);
        if (i == 0) {
          if (e().aw() > 0 && O() && System.currentTimeMillis() - this.m > 3000L) {
            Q();
          } else if (!O() && (e().aw() == 0 || System.currentTimeMillis() - this.m < 500L)) {
            P();
          } 
        } else {
          if (i == 32 || i == 33) {
            D.d("Error Code: " + c.d(t2.c()));
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
  
  protected void f(m paramm) {
    D.a("Write Value, should not be called with this protocol!!!");
  }
  
  public synchronized void d(long paramLong) {
    if (h()) {
      long l1 = paramLong - System.currentTimeMillis();
      if (l1 > 1000000L)
        l1 = 60000L; 
      D.c("Client: Ignore runtime reads for: " + (paramLong - System.currentTimeMillis()));
      t t = t.a().f(this.c, (int)l1);
      try {
        t t1 = this.d.a(t);
        if (t1.a() != 255)
          D.c("IgnoreRuntimeUntil failed.."); 
      } catch (b b1) {
        Logger.getLogger(l.class.getName()).log(Level.SEVERE, "Stop runtime for failed", (Throwable)b1);
      } catch (o o1) {
        Logger.getLogger(l.class.getName()).log(Level.SEVERE, "Stop runtime for failed", (Throwable)o1);
      } 
    } 
    super.d(paramLong);
  }
  
  protected void k(m paramm) {
    o o1 = new o();
    o1.a(paramm);
    try {
      int i = 0;
      byte b1 = 2;
      List list = t.a().a(this.c, paramm.v(), paramm);
      for (List list1 : list) {
        this.i.q();
        paramm.m();
        t t = this.d.a(list1);
        if (t == null) {
          D.c("Raw Write response null!");
          throw new G.l("Raw Write response null!");
        } 
        if (t.a() != 255 && paramm.g()) {
          D.b("Raw Write Failed! retrying..");
          t = this.d.a(list1);
          if (t.a() != 255) {
            D.b("Raw Write Failed again!");
            if ((t.c()).length > 0)
              throw new G.l("Raw Write response Error! " + c.d(t.d())); 
            throw new G.l("Raw Write response Error!");
          } 
          o1.a(1);
          for (t t1 : list1) {
            b1 = (t1.c()[0] == 163) ? 4 : 2;
            i += t1.b() - b1;
            paramm.b((i / paramm.r()));
          } 
          if ((t.c()).length > 0)
            if (paramm.d()) {
              o1.a(t.c());
            } else {
              int[] arrayOfInt = c.b(t.c());
              o1.a(arrayOfInt);
            }  
          paramm.b(o1);
          continue;
        } 
        o1.a(1);
        for (t t1 : list1) {
          b1 = (t1.c()[0] == 163) ? 4 : 2;
          i += t1.b() - b1;
        } 
        if ((t.c()).length > 0)
          if (paramm.d()) {
            o1.a(t.c());
          } else {
            int[] arrayOfInt = c.b(t.c());
            o1.a(arrayOfInt);
          }  
        paramm.b(o1);
      } 
    } catch (b b1) {
      o1.a(3);
      o1.a("Controller Instruction failed!\n\nError: \n" + b1.getMessage());
    } catch (Exception exception) {
      o1.a(3);
      o1.a("Raw write failed!\nError: " + exception.getMessage());
      D.b("Raw write failed!\nError: " + exception.getMessage());
      paramm.b(o1);
      return;
    } finally {
      paramm.b(1.0D);
    } 
  }
  
  protected void j(m paramm) {
    t t1 = null;
    o o1 = new o();
    o1.a(paramm);
    paramm.m();
    int i = paramm.p()[0];
    t t2 = t.a().e(this.c, i);
    try {
      t1 = this.d.b(t2, 2);
    } catch (b b1) {
      throw b1;
    } catch (o o2) {
      Logger.getLogger(l.class.getName()).log(Level.SEVERE, (String)null, (Throwable)o2);
    } 
  }
  
  protected void h(m paramm) {
    if (h()) {
      F f1 = paramm.v();
      t t1 = null;
      o o1 = new o();
      o1.a(paramm);
      paramm.m();
      t t2 = t.a().c(this.c, f1, paramm);
      try {
        t1 = this.d.b(t2, 2);
      } catch (b b1) {
        throw b1;
      } catch (o o2) {
        Logger.getLogger(l.class.getName()).log(Level.SEVERE, (String)null, (Throwable)o2);
      } 
      if (t1 == null) {
        D.c("Download PcVariable response null!");
        throw new G.l("Download PcVariable response null!");
      } 
      if (t1.a() != 255) {
        o1.a(3);
        paramm.b(o1);
      } else {
        byte[] arrayOfByte = t1.c();
        if (arrayOfByte[0] == 0) {
          o1.a(1);
          paramm.b(o1);
        } else if (arrayOfByte[0] == 1) {
          o1.a(2);
          if (arrayOfByte.length > 1) {
            byte[] arrayOfByte1 = new byte[arrayOfByte.length - 1];
            System.arraycopy(arrayOfByte, 1, arrayOfByte1, 1, arrayOfByte1.length);
            String str = new String(arrayOfByte1);
            o1.a(str);
            D.b("WritePcVariable: " + str);
          } 
          paramm.b(o1);
        } else {
          o1.a(3);
          if (arrayOfByte.length > 1) {
            byte[] arrayOfByte1 = new byte[arrayOfByte.length - 1];
            System.arraycopy(arrayOfByte, 1, arrayOfByte1, 1, arrayOfByte1.length);
            String str = new String(arrayOfByte1);
            o1.a(str);
            D.a("WritePcVariable: " + str);
          } 
          paramm.b(o1);
        } 
      } 
    } 
  }
  
  protected void i(m paramm) {
    if (h()) {
      F f1 = paramm.v();
      t t1 = null;
      o o1 = new o();
      o1.a(paramm);
      paramm.m();
      t t2 = t.a().d(this.c, f1, paramm);
      try {
        t1 = this.d.b(t2, 2);
      } catch (b b1) {
        throw b1;
      } catch (o o2) {
        Logger.getLogger(l.class.getName()).log(Level.SEVERE, (String)null, (Throwable)o2);
      } 
      if (t1.a() != 255) {
        o1.a(3);
        byte[] arrayOfByte = t1.c();
        if (arrayOfByte.length > 0) {
          String str = new String(arrayOfByte);
          o1.a(str);
        } 
        paramm.b(o1);
      } else {
        byte[] arrayOfByte = t1.c();
        o1.a(1);
        if (arrayOfByte.length > 0) {
          String str = new String(arrayOfByte);
          o1.a(str);
        } 
        paramm.b(o1);
      } 
    } 
  }
  
  public boolean h() {
    return e().al().equals("basicRequestReply");
  }
  
  private boolean q(m paramm) {
    try {
      F f1 = paramm.v();
      N n1 = (N)this.ad.get(f1.u());
      int[] arrayOfInt = n1.a(paramm.o(), paramm.q(), paramm.r());
      return c.b(arrayOfInt, paramm.p());
    } catch (Exception exception) {
      D.a(exception.getMessage());
      return false;
    } 
  }
  
  protected void e(m paramm) {
    if (O)
      D.c("Write Chunk / Download"); 
    o o1 = new o();
    o1.a(1);
    F f1 = paramm.v();
    boolean bool = false;
    try {
      bool = (q(paramm) && b(f1, paramm.o(), paramm.q(), paramm.r())) ? true : false;
    } catch (Exception exception) {
      D.b("failed to get CRC for local check");
    } 
    if (bool) {
      String str = "Write Chunk data already matches controller data, skipping. page: " + (paramm.o() + 1) + ", ";
      D.d(str);
      o1.a(1);
      o1.a(str);
      o1.a(paramm);
      paramm.b(o1);
      if (!f1.x(paramm.o()))
        f1.u(-2); 
      this.l = -1L;
      f1.t(-2);
      f1.u(-2);
      o1.a(1);
      o1.b(f1.u());
      paramm.b(1.0D);
      paramm.b(o1);
      c(f1.u(), paramm.o());
      return;
    } 
    int i = paramm.o();
    f1.u(i);
    o1.a(paramm);
    try {
      a(f1, i);
      int i1 = 0;
      a(f1, paramm.o(), paramm.q());
      byte b1 = 2;
      List list = t.a().b(this.c, f1, paramm);
      for (List list1 : list) {
        this.i.q();
        t t = this.d.a(list1);
        if (t == null) {
          D.c("Download response null!");
          throw new G.l("Download response null!");
        } 
        if (t.a() != 255) {
          D.b("DOWNLOAD Failed! retrying..");
          this.l = -1L;
          a(f1, paramm.o(), paramm.q() + i1);
          t = this.d.a(list1);
          if (t.a() != 255) {
            D.b("DOWNLOAD Failed again!");
            if ((t.c()).length > 0)
              throw new G.l("Download response Error! " + c.d(t.d())); 
            throw new G.l("Download response Error!");
          } 
          for (t t1 : list1) {
            i1 += t1.b() - b1;
            paramm.b((i1 / paramm.r()));
          } 
          continue;
        } 
        for (t t1 : list1) {
          i1 += t1.b() - b1;
          this.l += (t1.b() - b1);
        } 
      } 
    } catch (b b1) {
      throw b1;
    } catch (Exception exception) {
      o1.a(3);
      o1.a("Device write failed!\nError: " + exception.getMessage());
      D.b("Device write failed!\nError: " + exception.getMessage());
      paramm.b(o1);
      return;
    } finally {
      paramm.b(1.0D);
    } 
    if (o1.a() == 1) {
      N n1 = (N)this.ad.get(f1.u());
      n1.a(paramm.o(), paramm.q(), paramm.p(), false);
      boolean bool1 = true;
      if (bool1)
        try {
          if (!b(f1, paramm.o(), paramm.q(), paramm.r())) {
            if (paramm.h() < 4) {
              D.b("Write failed CRC validation! Resending DOWNLOAD p:" + paramm.o() + ", o:" + paramm.q() + ", l:" + paramm.r());
              c(this.c.r());
              this.d.i();
              this.l = -1L;
              f1.t(-1);
              try {
                g();
              } catch (o o2) {
                Logger.getLogger(l.class.getName()).log(Level.INFO, "This shouldn't have happened.", (Throwable)o2);
              } 
              paramm.c(paramm.h() + 1);
              e(paramm);
            } else {
              D.a("Write failed CRC validation after 3 tries! Giving up and raising an error.");
              o1.a(3);
              o1.a(false);
              o1.a("Write failed CRC validation after 3 tries! p:" + paramm.o() + ", o:" + paramm.q() + ", l:" + paramm.r());
              byte[] arrayOfByte1 = c.a(n1.b(paramm.o()));
              byte[] arrayOfByte2 = new byte[paramm.r()];
              System.arraycopy(arrayOfByte1, paramm.q(), arrayOfByte2, 0, arrayOfByte2.length);
              int[] arrayOfInt = a(f1, paramm.o(), paramm.q(), paramm.r(), (m)null, false);
              a(c.b(arrayOfByte2), arrayOfInt, paramm.o(), paramm.q());
            } 
          } else {
            D.d("Write verified. " + paramm.o() + ":" + paramm.q() + ":" + paramm.r());
          } 
        } catch (G.l l1) {
          o1.a(3);
          o1.a("Write succeded, but crc validation failed: " + l1.getMessage());
          D.b("Write succeded, but crc validation failed!\nError: " + l1.getMessage());
        }  
    } 
    paramm.b(o1);
  }
  
  protected int[] a(F paramF, int paramInt, m paramm) {
    D.c("Upload / Read Page: " + paramInt);
    return a(paramF, paramInt, 0, paramF.f(paramInt), paramm);
  }
  
  private void a(F paramF, int paramInt1, int paramInt2) {
    t t2;
    int i = paramInt2 + paramF.y(paramInt1);
    if (O)
      D.c("Setting MTA, page= " + paramInt1 + ", address= 0x" + Integer.toHexString(i).toUpperCase()); 
    t t1 = t.a().a(this.c, i);
    byte b1 = 0;
    String str = "Unknown";
    do {
      b1++;
      t2 = this.d.b(t1, 2);
      if (t2.a() == 255)
        continue; 
      D.a("SET_MTA Error!");
      str = "None";
      if ((t2.c()).length <= 0)
        continue; 
      int i1 = c.a(t2.c()[0]);
      D.d("Error Code: " + c.d(t2.c()));
      str = n.a(t2.c()[0]);
      if (i1 == 32 || i1 == 33 || i1 == 34) {
        G.l l1 = new G.l("Fatal Error " + str);
        l1.a(i1);
        l1.a(false);
        throw l1;
      } 
      D.b("Error setting address: " + str);
    } while (t2.a() != 255 && b1 < 3);
    if (t2.a() != 255) {
      G.l l1 = new G.l("Error: " + str);
      throw l1;
    } 
    this.l = i;
  }
  
  protected void m(m paramm) {
    int[] arrayOfInt = a(paramm.v(), paramm.o(), paramm);
    o o1 = new o();
    o1.a(arrayOfInt);
    o1.a(1);
    o1.a(paramm);
    paramm.b(o1);
  }
  
  protected void n(m paramm) {
    int[] arrayOfInt;
    F f1 = paramm.v();
    int i = paramm.o();
    int i1 = paramm.q();
    int i2 = paramm.f();
    paramm.b(0.0D);
    try {
      arrayOfInt = a(f1, i, i1, i2, paramm);
    } catch (G.l l1) {
      if (f1.i() > f1.m()) {
        D.d("Timeout reading chunk " + (i + 1) + ", blockReadTimeout=" + f1.i() + ", giving up..");
        throw l1;
      } 
      f1.c(f1.i() + 50);
      D.d("Timeout reading chunk " + (i + 1) + ", increased blockReadTimeout to " + f1.i() + ", trying once more.");
      try {
        Thread.sleep(f1.i());
      } catch (InterruptedException interruptedException) {
        Logger.getLogger(J.class.getName()).log(Level.INFO, (String)null, interruptedException);
      } 
      arrayOfInt = a(f1, i, i1, i2, paramm);
    } 
    paramm.b((i + 1.0D) / arrayOfInt.length);
    o o1 = new o();
    o1.a(paramm);
    o1.a(1);
    o1.a(arrayOfInt);
    paramm.b(o1);
  }
  
  protected int[] a(F paramF, int paramInt1, int paramInt2, int paramInt3, m paramm) {
    return a(paramF, paramInt1, paramInt2, paramInt3, paramm, true);
  }
  
  protected int[] a(F paramF, int paramInt1, int paramInt2, int paramInt3, m paramm, boolean paramBoolean) {
    if (paramInt3 == 0)
      return new int[0]; 
    char c = 'က';
    byte b1 = 30;
    if (paramInt3 <= c && paramInt3 > b1) {
      if (paramBoolean && b(paramF, paramInt1, paramInt2, paramInt3)) {
        D.d("Checksum matches, using local data.");
        N n1 = (N)this.ad.get(paramF.u());
        return n1.a(paramInt1, paramInt2, paramInt3);
      } 
      if (paramBoolean)
        D.d("Checksum does not match, refreshing from controller."); 
      int[] arrayOfInt1 = b(paramF, paramInt1, paramInt2, paramInt3, paramm);
      if (I() && paramInt3 > b1) {
        N n1 = (N)this.ad.get(paramF.u());
        int[] arrayOfInt2 = n1.a(paramInt1, paramInt2, paramInt3);
        a(arrayOfInt2, arrayOfInt1, paramInt1, paramInt2 + paramF.y(paramInt1));
      } 
      U();
      return arrayOfInt1;
    } 
    int[] arrayOfInt = new int[paramInt3];
    cF cF = new cF(paramF, paramm, paramInt3);
    int i = 0;
    while (true) {
      int[] arrayOfInt1;
      byte b2 = (paramInt3 - i > c) ? c : (paramInt3 - i);
      cF.j(b2);
      if (b2 > b1 && paramBoolean && b(paramF, paramInt1, paramInt2 + i, b2)) {
        D.d("Checksum matches, using local data.");
        N n1 = (N)this.ad.get(paramF.u());
        arrayOfInt1 = n1.a(paramInt1, paramInt2 + i, b2);
      } else {
        if (paramBoolean)
          D.d("Checksum does not match, refreshing from controller."); 
        if (I() && b2 > b1) {
          N n1 = (N)this.ad.get(paramF.u());
          int[] arrayOfInt2 = n1.a(paramInt1, paramInt2 + i, b2);
          arrayOfInt1 = b(paramF, paramInt1, paramInt2 + i, b2, (m)cF);
          a(arrayOfInt2, arrayOfInt1, paramInt1, i + paramInt2 + paramF.y(paramInt1));
        } else {
          arrayOfInt1 = b(paramF, paramInt1, paramInt2 + i, b2, (m)cF);
        } 
        U();
      } 
      cF.b(1.0D);
      try {
        System.arraycopy(arrayOfInt1, 0, arrayOfInt, i, arrayOfInt1.length);
        i += arrayOfInt1.length;
        cF.k(i);
      } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
        D.c("IndexOutOfBoundsException caught: chunkData.length=" + arrayOfInt1.length + ", offset=" + paramInt2);
        indexOutOfBoundsException.printStackTrace();
      } 
      if (paramInt3 - i <= 0)
        return arrayOfInt; 
    } 
  }
  
  protected byte[] a(int[] paramArrayOfint) {
    byte[] arrayOfByte = c.a(paramArrayOfint);
    return this.g.a(arrayOfByte);
  }
  
  private int[] b(F paramF, int paramInt1, int paramInt2, int paramInt3, m paramm) {
    if (paramInt3 <= 0)
      return new int[0]; 
    D.c("Upload / Read Chunk: page:" + (paramInt1 + 1) + " len:" + paramInt3);
    a(paramF, paramInt1);
    List<k> list = t.a().a(paramF, this.c, paramInt1, paramInt3);
    int i = paramInt2;
    byte[] arrayOfByte = new byte[paramInt3];
    try {
      a(paramF, paramInt1, i);
    } catch (b b3) {
      throw new G.l("Timeout on setMTA.");
    } catch (o o1) {
      Logger.getLogger(l.class.getName()).log(Level.SEVERE, (String)null, (Throwable)o1);
      throw new G.l("Invalid Packet: " + o1.getLocalizedMessage());
    } 
    byte b1 = 0;
    for (byte b2 = 0; b2 < list.size(); b2++) {
      y y;
      this.m = System.currentTimeMillis();
      k k1 = list.get(b2);
      this.i.p();
      int i1 = i;
      try {
        D.c("calling upload, expecting " + k1.b() + " packets");
        y = this.d.b(k1);
        if (y != null && y.c() != null) {
          D.c("Finished upload, got " + y.c().size() + " packets");
        } else {
          D.c("Got Crap");
        } 
      } catch (b b3) {
        y = new y();
        y.a(3);
      } catch (o o1) {
        Logger.getLogger(l.class.getName()).log(Level.SEVERE, (String)null, (Throwable)o1);
        throw new G.l("Invalid Packet: " + o1.getLocalizedMessage());
      } 
      if (y.a() == 3) {
        if (b1++ > 2) {
          String str = (y.b() != null) ? ("\n" + y.b()) : "";
          D.b("Giving up. Fail Cout = " + b1);
          throw new G.l("Read chunk failed: " + paramInt1 + str);
        } 
        D.b("Packet Failed on UPLOAD, retrying.");
        b2--;
        try {
          c(this.c.r());
          this.d.i();
          this.l = -1L;
          g();
          a(paramF, paramInt1, i1);
          i = i1;
        } catch (b b3) {
          throw new G.l("Timeout on setMTA.");
        } catch (o o1) {
          Logger.getLogger(l.class.getName()).log(Level.SEVERE, (String)null, (Throwable)o1);
          throw new G.l("Invalid Packet: " + o1.getLocalizedMessage());
        } 
      } else if (y.a() != 1) {
        if (b1++ > 2) {
          String str = (y.b() != null) ? ("\n" + y.b()) : "";
          throw new G.l("Read chunk Unknown response: 0x" + Integer.toHexString(y.a()).toUpperCase() + ", " + paramInt1 + str);
        } 
        D.b("Packet not successful on UPLOAD, retrying.");
        b2--;
        try {
          c(this.c.r());
          this.d.i();
          this.l = -1L;
          g();
          a(paramF, paramInt1, i1);
          i = i1;
        } catch (b b3) {
          throw new G.l("Timeout on setMTA.");
        } catch (o o1) {
          Logger.getLogger(l.class.getName()).log(Level.SEVERE, (String)null, (Throwable)o1);
          throw new G.l("Invalid Packet: " + o1.getLocalizedMessage());
        } 
      } else {
        b1 = 0;
        List list1 = y.c();
        int i2 = 0;
        for (t t : list1) {
          try {
            byte[] arrayOfByte1 = t.c();
            System.arraycopy(arrayOfByte1, 0, arrayOfByte, i - paramInt2 + i2, arrayOfByte1.length);
            i2 += arrayOfByte1.length;
            if (paramm != null)
              paramm.b(((i - paramInt2 + i2) / arrayOfByte.length)); 
          } catch (Exception exception) {
            throw new G.l("Invalid data.");
          } 
        } 
        i += i2;
        this.l += i;
      } 
    } 
    N n1 = (N)this.ad.get(paramF.u());
    int[] arrayOfInt = c.b(arrayOfByte);
    n1.a(paramInt1, paramInt2, arrayOfInt, true);
    if (!b(paramF, paramInt1, paramInt2, paramInt3)) {
      D.b("CRC doesn't match after upload, raising error. p=" + (paramInt1 + 1) + ", o=" + paramInt2 + ", l=" + paramInt3);
      throw new G.l("CRC doesn't match after upload");
    } 
    return c.b(arrayOfByte);
  }
  
  public boolean c(F paramF, int paramInt) {
    return this.g.a();
  }
  
  protected boolean a(F paramF, int paramInt1, int paramInt2, int paramInt3) {
    return false;
  }
  
  protected boolean b(F paramF, int paramInt1, int paramInt2, int paramInt3) {
    if (!this.g.a())
      return false; 
    if (O) {
      int i1 = paramInt2 + paramF.y(paramInt1);
      D.c("BUILD_CHECKSUM, page= " + paramInt1 + ", offset= 0x" + Integer.toHexString(i1).toUpperCase() + ", BlockSize: 0x" + Integer.toHexString(paramInt3));
    } 
    a(paramF, paramInt1);
    try {
      a(paramF, paramInt1, paramInt2);
    } catch (b b2) {
      throw new G.l("Timout: " + b2.getLocalizedMessage());
    } catch (o o1) {
      Logger.getLogger(l.class.getName()).log(Level.SEVERE, (String)null, (Throwable)o1);
      throw new G.l("Format Error: " + o1.getMessage());
    } 
    char c = 'က';
    int i = paramInt3;
    t t = null;
    byte b1 = 0;
    while (true) {
      int i1;
      if (i > c) {
        i1 = c;
      } else {
        i1 = i;
      } 
      i -= c;
      t t1 = t.a().b(this.c, i1);
      String str = "Unknown";
      try {
        b1++;
        t = this.d.b(t1, 2);
        if (t.a() == 255) {
          N n1 = (N)this.ad.get(paramF.u());
          byte[] arrayOfByte1 = c.a(n1.b(paramInt1));
          byte[] arrayOfByte2 = new byte[i1];
          System.arraycopy(arrayOfByte1, paramInt2, arrayOfByte2, 0, arrayOfByte2.length);
          if (!this.g.a(this.c, arrayOfByte2, t)) {
            this.i.w();
            return false;
          } 
          this.i.v();
          paramInt2 += arrayOfByte2.length;
        } 
      } catch (b b2) {
        if (b1 > 1)
          throw new G.l("Timeout: " + b2.getLocalizedMessage()); 
      } catch (o o1) {
        throw new G.l("Format: " + o1.getLocalizedMessage());
      } catch (G.l l1) {
        throw new G.l("Connection Error: " + l1.getLocalizedMessage());
      } 
      if (i <= 0)
        return (t != null && t.a() == 255); 
    } 
  }
  
  protected void o(String paramString) {
    super.o(paramString);
    R r = T.a().c(paramString);
    if (r != null)
      this.d.a(r.O()); 
  }
  
  protected boolean k() {
    return this.E;
  }
  
  public boolean r() {
    return (this.b != null && this.b.isAlive());
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
  
  public f a() {
    return this.ap;
  }
  
  public void b(m paramm) {
    super.b(paramm);
  }
  
  public void a(f paramf) {
    if (this.ap != null) {
      this.ap.b(this.d);
      this.ap.b(this.e);
    } 
    this.ap = paramf;
    try {
      this.c.b(paramf.s());
    } catch (IOException iOException) {
      Logger.getLogger(l.class.getName()).log(Level.SEVERE, "Unable to set proper Transport for XCP", iOException);
    } 
    this.d.a(paramf);
    paramf.a(this.d);
    paramf.a(this.e);
  }
  
  public void j() {
    if (this.ap != null) {
      this.ap.b(this.d);
      this.ap.b(this.e);
    } 
    this.ap = null;
  }
  
  private void V() {
    for (e e : this.h) {
      try {
        t t1 = t.a().b(this.c);
        t t2 = this.d.b(t1, 3);
        if (t2 == null || (t2.a() == 254 && (t2.c()).length > 0))
          while (t2 == null || t2.c()[0] == 16 || t2.c()[0] == 18) {
            String str = null;
            if (t2 != null)
              str = c.d(t2.c()); 
            D.b("GET_DAQ_PROCESSOR_INFO Error Code: " + str + " waiting before retry");
            a(this.c.s());
            t2 = this.d.a(t1);
          }  
        if (t2.a() != 255) {
          if ((t2.c()).length > 0)
            D.b("GET_DAQ_PROCESSOR_INFO Error Code: " + c.d(t2.c()) + ", Using defaults"); 
        } else {
          byte[] arrayOfByte = t2.c();
          if (arrayOfByte.length != 7) {
            String str = "GET_DAQ_PROCESSOR_INFO: Invalid Packet Length! " + c.d(t2.d());
            D.b(str);
            throw new G.l(str);
          } 
          e.c().a(arrayOfByte[0]);
          int i1 = c.a(arrayOfByte, 1, 2, this.c.g(), false);
          e.c().a(i1);
          int i2 = c.a(arrayOfByte, 3, 2, this.c.g(), false);
          e.c().b(i2);
          e.c().c(arrayOfByte[5]);
          e.c().b(arrayOfByte[6]);
          D.d("Set Processor Info: " + e.c());
        } 
        for (byte b1 = 0; b1 < e.c().b(); b1++)
          c(e, b1); 
      } catch (b b1) {
        Logger.getLogger(l.class.getName()).log(Level.SEVERE, "Timeout initializing DAQ", (Throwable)b1);
        throw b1;
      } catch (o o1) {
        Logger.getLogger(l.class.getName()).log(Level.SEVERE, "Failed to get DAQ Processor Info", (Throwable)o1);
        throw o1;
      } 
      try {
        t t1 = t.a().c(this.c);
        t t2 = this.d.b(t1, 3);
        if (t2 == null || (t2.a() == 254 && (t2.c()).length > 0))
          while (t2 == null || t2.c()[0] == 16 || t2.c()[0] == 18) {
            String str = null;
            if (t2 != null)
              str = c.d(t2.c()); 
            D.b("GET_DAQ_RESOLUTION_INFO Error Code: " + str + " waiting before retry");
            a(this.c.s());
            t2 = this.d.a(t1);
          }  
        if (t2.a() != 255) {
          if ((t2.c()).length > 0)
            D.b("GET_DAQ_RESOLUTION_INFO Error Code: " + c.d(t2.c()) + ", Using defaults"); 
        } else {
          byte[] arrayOfByte = t2.c();
          if (arrayOfByte.length != 7) {
            String str = "GET_DAQ_RESOLUTION_INFO: Invalid Packet Length! " + c.d(t2.d());
            D.b(str);
            throw new G.l(str);
          } 
          e.d().e(c.a(arrayOfByte[0]));
          e.d().a(c.a(arrayOfByte[1]));
          e.d().b(c.a(arrayOfByte[2]));
          e.d().c(c.a(arrayOfByte[3]));
          e.d().d().a(arrayOfByte[4]);
          int i1 = c.a(arrayOfByte, 5, 2, this.c.g(), false);
          e.d().d(i1);
          this.c.a(e.d().d().a());
          D.d("Set DAQ Resolution Info: " + e.d());
          D.c("TimeStamp: " + e.d().d().toString());
          D.c("TimeStamp ticks = " + i1);
        } 
      } catch (b b1) {
        Logger.getLogger(l.class.getName()).log(Level.SEVERE, "Timeout initializing DAQ", (Throwable)b1);
        throw b1;
      } catch (o o1) {
        Logger.getLogger(l.class.getName()).log(Level.SEVERE, "Failed to get DAQ Processor Info", (Throwable)o1);
        throw o1;
      } 
      e.a(e.c().b());
      for (int i = e.c().d(); i < e.c().b(); i++) {
        try {
          f(e, i);
        } catch (G.l l1) {
          f(e, i);
        } 
      } 
    } 
  }
  
  private e q(String paramString) {
    for (e e : this.h) {
      if (e.a().equals(paramString))
        return e; 
    } 
    return null;
  }
  
  protected o o(m paramm) {
    o o1 = new o();
    o1.a(paramm);
    paramm.m();
    int i = paramm.i();
    e e = q(paramm.v().u());
    a(e, i);
    o1.a(1);
    paramm.b(o1);
    return o1;
  }
  
  protected void a(e parame, int paramInt) {
    c c = parame.b(paramInt);
    D.c("XcpMasterCommDriver:: updating DAQ List: " + c.toString());
    try {
      c(parame, paramInt);
      b(parame, paramInt);
      byte b1 = 0;
      while (true) {
        a(parame, paramInt, b1, 0);
        k k1 = c.c(b1);
        for (bO.l l1 : k1)
          a(parame, (byte)-1, (byte)l1.b(), (byte)0, l1.a()); 
        if (++b1 >= c.f()) {
          if (c.m())
            d(parame, paramInt); 
          if (!this.r.isEmpty()) {
            for (aF aF : this.r)
              a(aF); 
            this.r.clear();
          } 
          return;
        } 
      } 
    } catch (o o1) {
      Logger.getLogger(l.class.getName()).log(Level.SEVERE, "Invalid Command Structure, critical failure.", (Throwable)o1);
    } catch (j j1) {
      String str1 = e().u();
      String str2 = j1.getMessage() + " Channels active: " + cu.a().b(str1);
      Logger.getLogger(l.class.getName()).log(Level.SEVERE, "Error writing DAQ.", (Throwable)j1);
      b(str1, str2);
      throw new b("Error updating Runtime tables.");
    } 
  }
  
  protected void a(e parame, byte paramByte1, byte paramByte2, byte paramByte3, long paramLong) {
    try {
      t t1 = t.a().a(this.c, paramByte1, paramByte2, paramByte3, paramLong);
      t t2 = this.d.b(t1, 3);
      if (t2 == null || (t2.a() == 254 && (t2.c()).length > 0))
        while (t2 == null || ((t2.c()).length > 0 && (t2.c()[0] == 16 || t2.c()[0] == 18))) {
          String str = null;
          if (t2 != null)
            str = c.d(t2.c()); 
          D.b("WRITE_DAQ Error Code: " + str + " waiting before retry");
          a(this.c.s());
          t2 = this.d.a(t1);
        }  
      if (t2.a() != 255) {
        if ((t2.c()).length > 0)
          D.b("WRITE_DAQ Error Code: " + c.d(t2.c()) + ", Using defaults"); 
        parame.d(-1);
        parame.e(-1);
        parame.f(-1);
        throw new j("Error writing ODT Entry");
      } 
      c c = parame.b(parame.h());
      int i = parame.j() + 1;
      if (i < c.c()) {
        parame.f(i);
      } else {
        parame.d(-1);
        parame.e(-1);
        parame.f(-1);
      } 
    } catch (b b1) {
      D.a("Timeout initializing DAQ");
      throw b1;
    } catch (o o1) {
      D.a("Failed to get DAQ Processor Info");
      throw o1;
    } 
  }
  
  protected void b(e parame, int paramInt) {
    try {
      t t1 = t.a().d(this.c, paramInt);
      t t2 = this.d.b(t1, 3);
      if (t2 == null || (t2.a() == 254 && (t2.c()).length > 0))
        while (t2 == null || t2.c()[0] == 16 || t2.c()[0] == 18) {
          String str = null;
          if (t2 != null)
            str = c.d(t2.c()); 
          D.b("CLEAR_DAQ_LIST Error Code: " + str + " waiting before retry");
          a(this.c.s());
          t2 = this.d.a(t1);
        }  
      if (t2.a() != 255) {
        if ((t2.c()).length > 0)
          D.b("CLEAR_DAQ_LIST Error Code: " + c.d(t2.c()) + ", Using defaults"); 
        throw new j("Error Clearing DAQ List");
      } 
      D.d("Cleared DAQ List " + paramInt);
    } catch (b b1) {
      D.a("Timeout initializing DAQ");
      throw b1;
    } catch (o o1) {
      D.a("Failed to get DAQ Processor Info");
      throw o1;
    } 
  }
  
  protected void a(e parame, int paramInt1, int paramInt2, int paramInt3) {
    if (parame.h() == paramInt1 && parame.i() == paramInt2 && parame.j() == paramInt3)
      return; 
    try {
      t t1 = t.a().a(this.c, paramInt1, paramInt2, paramInt3);
      t t2 = this.d.b(t1, 3);
      if (t2 == null || (t2.a() == 254 && (t2.c()).length > 0))
        while (t2 == null || t2.c()[0] == 16 || t2.c()[0] == 18) {
          String str = null;
          if (t2 != null)
            str = c.d(t2.c()); 
          D.b("SET_DAQ_PTR Error Code: " + str + " waiting before retry");
          a(this.c.s());
          t2 = this.d.a(t1);
        }  
      if (t2.a() != 255) {
        if ((t2.c()).length > 0)
          D.b("SET_DAQ_PTR Error Code: " + c.d(t2.c()) + ", Using defaults"); 
        throw new j("Error Setting DAQ PTR");
      } 
      if (O)
        D.d("Set DAQ PTR  list:" + paramInt1 + ", odtNum:" + paramInt2 + ", odtEntryNum: " + paramInt3); 
      parame.d(paramInt1);
      parame.e(paramInt2);
      parame.f(paramInt3);
    } catch (b b1) {
      D.a("Timeout initializing DAQ");
      throw b1;
    } catch (o o1) {
      D.a("Failed to get DAQ Processor Info");
      throw o1;
    } 
  }
  
  protected o p(m paramm) {
    o o1 = new o();
    o1.a(paramm);
    paramm.m();
    try {
      e e = q(paramm.v().u());
      c(e, paramm.i());
    } catch (o o2) {
      Logger.getLogger(l.class.getName()).log(Level.SEVERE, (String)null, (Throwable)o2);
      o1.a(3);
    } 
    paramm.b(o1);
    return o1;
  }
  
  public void l() {
    if (e().aw() > 0)
      for (e e : this.h) {
        for (int i = e.b().b().d(); i < e.b().b().b(); i++) {
          boolean bool = false;
          byte b1 = 0;
          try {
            do {
              d(e, i);
              bool = true;
            } while (!bool && b1++ < 3);
          } catch (o o1) {
            Logger.getLogger(l.class.getName()).log(Level.SEVERE, "FormatException??", (Throwable)o1);
          } 
        } 
      }  
  }
  
  public void m() {
    for (e e : this.h) {
      for (int i = e.b().b().d(); i < e.b().b().b(); i++) {
        try {
          boolean bool = false;
          byte b1 = 0;
          do {
            c(e, i);
            bool = true;
          } while (!bool && b1++ < 3);
        } catch (o o1) {
          Logger.getLogger(l.class.getName()).log(Level.SEVERE, "FormatException??", (Throwable)o1);
        } 
      } 
    } 
  }
  
  protected void a(byte paramByte) {
    try {
      t t1 = t.a().a(this.c, paramByte);
      t t2 = this.d.b(t1, 3);
      if (t2 != null && t2.a() != 255) {
        D.b("START_STOP_SYNC Failed, DAQ not running?");
      } else {
        if (paramByte == 0) {
          D.d("Stop Sync DAQ ");
        } else if (paramByte == 1) {
          D.d("Start Sync List ");
        } 
        if ((t2.c()).length > 0 && t2.c()[0] == 0)
          Q(); 
      } 
    } catch (b b1) {
      D.a("Timeout StartStop DAQ");
      throw b1;
    } catch (o o1) {
      Logger.getLogger(l.class.getName()).log(Level.SEVERE, "Failed to get DAQ Processor Info", (Throwable)o1);
      throw o1;
    } 
  }
  
  protected void o() {
    a((byte)0);
  }
  
  protected void s() {
    a((byte)1);
  }
  
  protected void c(e parame, int paramInt) {
    D.c("################### Stopping DAQ " + paramInt);
    a(parame, paramInt, (byte)0);
  }
  
  protected void d(e parame, int paramInt) {
    if (e().aw() > 0) {
      D.c("################### Starting DAQ " + paramInt);
      this.m = System.currentTimeMillis();
      g(parame, paramInt);
      a(parame, paramInt, (byte)2);
      e(parame, paramInt);
      s();
      D.c("################### Started DAQ " + paramInt);
    } 
  }
  
  protected void a(e parame, int paramInt, byte paramByte) {
    try {
      t t1 = t.a().a(this.c, paramInt, paramByte);
      t t2 = this.d.b(t1, 3);
      this.m = System.currentTimeMillis();
      if (t2 == null || (t2.a() == 254 && (t2.c()).length > 0))
        while (t2 == null || t2.c()[0] == 16 || t2.c()[0] == 18) {
          String str = null;
          if (t2 != null)
            str = c.d(t2.c()); 
          D.b("START_STOP_DAQ Error Code: " + str + " waiting before retry");
          a(this.c.s());
          t2 = this.d.a(t1);
        }  
      if (t2.a() != 255) {
        if ((t2.c()).length > 0)
          D.b("START_STOP_DAQ Error Code: " + c.d(t2.c()) + ", Using defaults"); 
      } else {
        if (paramByte == 0) {
          D.d("Stopped DAQ List " + paramInt);
        } else if (paramByte == 1) {
          D.d("Started DAQ List " + paramInt);
        } 
        byte[] arrayOfByte = t2.c();
        c c = parame.b(paramInt);
        if (c == null) {
          D.b("Invalid DAQ: " + paramInt);
        } else if (arrayOfByte == null || arrayOfByte.length < 1) {
          D.b("No FIRST_PID on START_STOP_DAQ");
        } else {
          c.h(c.a(arrayOfByte[0]));
        } 
      } 
    } catch (b b1) {
      D.a("Timeout StartStop DAQ");
      throw b1;
    } catch (o o1) {
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
      t t1 = t.a().d(this.c);
      t t2 = this.d.b(t1, 3);
      if (t2 == null || (t2.a() == 254 && (t2.c()).length > 0))
        while (t2 == null || t2.c()[0] == 16 || t2.c()[0] == 18) {
          String str = null;
          if (t2 != null)
            str = c.d(t2.c()); 
          D.b("GET_DAQ_CLOCK Error Code: " + str + " waiting before retry");
          a(this.c.s());
          t2 = this.d.a(t1);
        }  
      if (t2.a() != 255) {
        if ((t2.c()).length > 0) {
          D.b("GET_DAQ_CLOCK Error Code: " + c.d(t2.c()) + ", Using defaults");
        } else {
          D.b("GET_DAQ_CLOCK Error");
        } 
      } else {
        byte[] arrayOfByte = t2.c();
        c c = parame.b(paramInt);
        if (c == null) {
          D.b("Invalid DAQ: " + paramInt);
        } else if (arrayOfByte == null || arrayOfByte.length != 7) {
          D.b("No Timestamp on GET_DAQ_CLOCK, wrong packet size");
        } else {
          long l1 = c.b(arrayOfByte, 3, 4, this.c.g(), false);
          D.c("Set timestamp of size: " + parame.d().d().a() + " to value: " + l1);
          c.a(l1);
        } 
      } 
    } catch (b b1) {
      D.a("Timeout getting DAQ clock");
      throw b1;
    } catch (o o1) {
      Logger.getLogger(l.class.getName()).log(Level.SEVERE, "Failed to get DAQ clock", (Throwable)o1);
      throw o1;
    } 
  }
  
  private void f(e parame, int paramInt) {
    try {
      t t1 = t.a().c(this.c, paramInt);
      t t2 = this.d.b(t1, 3);
      if (t2 == null || (t2.a() == 254 && (t2.c()).length > 0))
        while (t2 == null || t2.c()[0] == 16 || t2.c()[0] == 18) {
          String str = null;
          if (t2 != null)
            str = c.d(t2.c()); 
          D.b("GET_DAQ_LIST_INFO Error Code: " + str + " waiting before retry");
          a(this.c.s());
          t2 = this.d.a(t1);
        }  
      if (t2.a() != 255) {
        if ((t2.c()).length > 0)
          D.b("GET_DAQ_LIST_INFO Error Code: " + c.d(t2.c()) + ", Using defaults"); 
      } else {
        byte[] arrayOfByte = t2.c();
        if (arrayOfByte.length != 5) {
          String str = "GET_DAQ_LIST_INFO: Invalid Packet Length! " + c.d(t2.d());
          D.b(str);
          throw new G.l(str);
        } 
        c c = parame.b(paramInt);
        c.b().a(arrayOfByte[0]);
        c.a(c.a(arrayOfByte[1]));
        c.b(c.a(arrayOfByte[2]));
        int i = c.a(arrayOfByte, 3, 2, this.c.g(), false);
        c.d(i);
        D.d("DAQ List " + paramInt + " Info: " + c);
      } 
    } catch (b b1) {
      D.a("Timeout configuring DAQ");
      throw b1;
    } catch (o o1) {
      Logger.getLogger(l.class.getName()).log(Level.SEVERE, "Failed to get DAQ Processor Info", (Throwable)o1);
      throw o1;
    } 
  }
  
  private void g(e parame, int paramInt) {
    try {
      int i = 100 / e().aw();
      i = Math.max(i, 1);
      t t1 = t.a().a(this.c, parame.c().a().b(), false, paramInt, parame.b(paramInt).d(), (byte)i, (byte)parame.b(paramInt).j());
      D.c("SET_DAQ_LIST_MODE: " + c.d(t1.d()));
      t t2 = this.d.b(t1, 3);
      if (t2 == null || (t2.a() == 254 && (t2.c()).length > 0))
        while (t2 == null || t2.c()[0] == 16 || t2.c()[0] == 18) {
          String str = null;
          if (t2 != null)
            str = c.d(t2.c()); 
          D.b("SET_DAQ_LIST_MODE Error Code: " + str + " Error: " + n.a(t2.c()[0]) + " waiting before retry");
          a(this.c.s());
          t2 = this.d.a(t1);
        }  
      if (t2.a() != 255) {
        if ((t2.c()).length > 0)
          D.b("SET_DAQ_LIST_MODE Error Code: " + c.d(t2.c()) + " Error: " + n.a(t2.c()[0]) + " , Using defaults"); 
      } else {
        byte[] arrayOfByte = t2.c();
        if (arrayOfByte.length != 0) {
          String str = "SET_DAQ_LIST_MODE: Invalid Packet Length! " + c.d(t2.d());
          D.b(str);
          throw new G.l(str);
        } 
      } 
    } catch (b b1) {
      D.a("Timeout SET_LIST_MODE DAQ");
      throw b1;
    } catch (o o1) {
      Logger.getLogger(l.class.getName()).log(Level.SEVERE, "Failed to get DAQ Processor Info", (Throwable)o1);
      throw o1;
    } 
  }
  
  protected boolean d(int paramInt) {
    try {
      v();
      t t1 = null;
      try {
        t1 = T();
      } catch (Exception exception) {
        t1 = T();
      } 
      if (t1 == null)
        return false; 
      this.l = -1L;
      o();
      byte[] arrayOfByte1 = t1.c();
      D.d("Connected with Controller, Protocol version: " + arrayOfByte1[5] + " Transport version: " + arrayOfByte1[6]);
      this.c.p().a(arrayOfByte1[0]);
      this.c.t().a(arrayOfByte1[1]);
      this.c.f(c.a(arrayOfByte1[2]));
      this.c.g(c.a(arrayOfByte1, 3, 2, this.c.g(), false));
      if (arrayOfByte1[5] > 1) {
        f("Unsupported Protocol Level: " + arrayOfByte1[5]);
        return false;
      } 
      t t2 = t.a().e();
      t1 = this.d.b(t2, 2);
      if (t1 == null || t1.a() != 255) {
        D.a("Received Valid Connect, but failed GET_COMM_MODE_INFO. Using defaults.");
      } else if ((t1.c()).length < 7) {
        D.d("Valid GET_COMM_MODE_INFO, but invalid payload, using defaults.");
      } else {
        arrayOfByte1 = t1.c();
        this.c.h(c.a(arrayOfByte1[4]));
        if (c.a(arrayOfByte1[6]) > al) {
          String str1 = "Dash Echo Server has greater driver version than client, app needs to be updated.\nServer version: " + c.a(arrayOfByte1[6]) + ", Client Version: " + al;
          D.a(str1);
          aB.a().b(e().u(), str1);
          return false;
        } 
        D.d("Slave Driver version: " + c.a(arrayOfByte1[6]));
      } 
      t t3 = t.a().a((byte)0);
      t1 = this.d.b(t3, 2);
      if (t1 == null || t1.a() != 255) {
        D.a("Received Valid Connect, but failed GET_ID type 1. Support for Type 1 Get_ID is required to connect.");
        return false;
      } 
      if ((t1.c()).length < 7) {
        D.d("Valid Connect response code, but invalid packet size.");
        return false;
      } 
      arrayOfByte1 = t1.c();
      byte b1 = arrayOfByte1[0];
      int i = c.a(arrayOfByte1, 3, 4, this.c.g(), false);
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
          t t = t.a().b(b.a);
          t1 = this.d.b(t, 2);
          if (t1 == null || t1.a() != 255)
            D.a("Received Valid Connect, but failed GetFirmwareinfo."); 
          str = new String(t1.c());
        } catch (Exception exception) {
          D.a("GetFirmwareInfo failed: " + exception.getLocalizedMessage());
        } 
        try {
          t t = t.a().b(b.b);
          t1 = this.d.b(t, 2);
          if (t1 == null || t1.a() != 255)
            D.a("Received Valid Connect, but failed Get Blocking factors."); 
          arrayOfByte1 = t1.c();
          if (arrayOfByte1 != null && arrayOfByte1.length == 4) {
            int i1 = c.a(arrayOfByte1, 0, 2, true, false);
            int i2 = c.a(arrayOfByte1, 2, 2, true, false);
            f1.I(i1);
            f1.H(i2);
          } else {
            D.b("Unexpected response size for Get Blocking factors: " + c.d(arrayOfByte1));
          } 
        } catch (Exception exception) {
          D.a("Get Blocking factors failed: " + exception.getLocalizedMessage());
        } 
        try {
          t t = t.a().b(b.c);
          t1 = this.d.b(t, 2);
          if (t1 == null || t1.a() != 255)
            D.a("Received Valid Connect, but failed Get Local CAN ID."); 
          arrayOfByte1 = t1.c();
          if (arrayOfByte1 != null && arrayOfByte1.length == 1) {
            int i1 = c.a(arrayOfByte1[0]);
            f1.w(i1);
          } else {
            D.b("Unexpected response size for Get Local CAN ID: " + c.d(arrayOfByte1));
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
      bT bT = new bT();
      bT.a(arrayOfByte2);
      if (!b(arrayOfByte2)) {
        D.b("Unsupported Controller Firmware.");
        b(bT.b(), "Invalid data received from controller.");
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
        bT.b(str);
      } else {
        bT.b(bT.b());
      } 
      a(e().u(), bT.c(), bT);
      s.a();
      if (e().aw() > 0) {
        ((e)this.h.get(0)).d(-1);
        ((e)this.h.get(0)).e(-1);
        ((e)this.h.get(0)).f(-1);
        ((e)this.h.get(0)).k();
      } 
      return true;
    } catch (o o1) {
      Logger.getLogger(l.class.getName()).log(Level.SEVERE, (String)null, (Throwable)o1);
      return false;
    } 
  }
  
  public void a(byte[] paramArrayOfbyte, double paramDouble) {
    boolean bool = true;
    if (bool) {
      if (this.j == null || !this.j.isAlive()) {
        if (this.j != null)
          this.j.a(); 
        this.j = new o(this);
        this.j.start();
      } 
      o.a(this.j, paramArrayOfbyte, paramDouble);
      this.m = System.currentTimeMillis();
    } else {
      a(e().u(), paramArrayOfbyte);
    } 
  }
  
  public void P() {
    R r = T.a().c();
    this.G = true;
    this.m = System.currentTimeMillis();
    if (r != null) {
      bT bT = new bT();
      bT.a(r.i());
      bT.b(r.P());
      a(r.c(), r.P(), bT);
    } 
  }
  
  public void Q() {
    this.G = false;
    A();
  }
  
  public void p(String paramString) {
    a(paramString, true);
  }
  
  protected void b(String paramString) {
    if (I())
      System.out.println(k.v() + ": " + paramString); 
  }
  
  private boolean b(f paramf) {
    if (paramf != null)
      for (f f1 : aq.values()) {
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