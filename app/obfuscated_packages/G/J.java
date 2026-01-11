package G;

import J.c;
import J.f;
import J.h;
import V.b;
import V.d;
import bH.A;
import bH.D;
import bH.X;
import bH.c;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.CRC32;

public abstract class J implements Serializable {
  private static HashMap a = new HashMap<>();
  
  private List b = new CopyOnWriteArrayList();
  
  final ConcurrentLinkedQueue p = new ConcurrentLinkedQueue();
  
  ArrayList q = new ArrayList();
  
  protected ArrayList r = new ArrayList();
  
  ArrayList s = new ArrayList();
  
  ArrayList t = new ArrayList();
  
  List u = Collections.synchronizedList(new ArrayList());
  
  ArrayList v = new ArrayList();
  
  ArrayList w = new ArrayList();
  
  ArrayList x = new ArrayList();
  
  ArrayList y = new ArrayList();
  
  ArrayList z = new ArrayList();
  
  protected ArrayList A = new ArrayList();
  
  ArrayList B = new ArrayList();
  
  protected ArrayList C = new ArrayList();
  
  protected int D = 0;
  
  protected boolean E = false;
  
  protected boolean F = false;
  
  protected boolean G = true;
  
  protected boolean H = true;
  
  protected boolean I = false;
  
  boolean J = false;
  
  boolean K = true;
  
  int L = -2;
  
  F M = null;
  
  int N = 0;
  
  protected static boolean O = false;
  
  long P = 0L;
  
  protected long Q = System.currentTimeMillis();
  
  protected long R = Long.MAX_VALUE;
  
  String S = null;
  
  static P T;
  
  long U = System.nanoTime();
  
  long V = 0L;
  
  private boolean c = true;
  
  protected boolean W = false;
  
  private boolean d = false;
  
  f X = new f();
  
  f Y = new f();
  
  private long e = 0L;
  
  private String f = "";
  
  int Z = 0;
  
  protected int[] aa = null;
  
  int ab = 15;
  
  int ac = 50;
  
  protected HashMap ad = new HashMap<>();
  
  CRC32 ae = new CRC32();
  
  int af = 0;
  
  long ag = System.nanoTime();
  
  long ah = System.currentTimeMillis();
  
  long ai = 0L;
  
  int aj = 0;
  
  v ak = new M(this);
  
  protected J(F paramF) {
    b(paramF);
    this.f = paramF.u();
    if (T == null) {
      T = new P(this);
      T.start();
    } 
  }
  
  public static void c(String paramString) {
    J j = (J)a.get(paramString);
    if (j != null)
      j.c(); 
    a.remove(paramString);
  }
  
  protected void a(J paramJ) {
    paramJ.q = this.q;
    paramJ.s = this.s;
    paramJ.t = this.t;
    paramJ.u = this.u;
    paramJ.v = this.v;
    paramJ.w = this.w;
    paramJ.x = this.x;
    paramJ.A = this.A;
    paramJ.B = this.B;
    paramJ.ad = this.ad;
    paramJ.b = this.b;
    paramJ.y = this.y;
  }
  
  public void t() {
    this.Z = 0;
    this.aa = new int[this.A.size()];
    byte b = 0;
    for (F f1 : this.A) {
      this.Z += f1.n();
      this.aa[b] = f1.n();
      b++;
    } 
  }
  
  public abstract String n();
  
  public abstract void c();
  
  protected void u() {
    Iterator<F> iterator = this.A.iterator();
    while (iterator.hasNext())
      ((F)iterator.next()).t(-2); 
  }
  
  public void v() {
    if (x() || (e().B() >= 0 && e().x(e().B()))) {
      f("Going offline before all changes were permanently saved to the Controller.\nThese writes will be lost!");
      D.d("Going offline before all changes were permanently saved to the Controller.");
      this.L = -2;
    } 
    this.p.clear();
  }
  
  protected abstract InputStream i();
  
  protected void a(F paramF) {
    int i = f(paramF);
    if (i >= 0) {
      m m = m.a(paramF, i);
      D.c("Burn Page anonymous: " + (this.L + 1));
      b(m);
    } else {
      D.c("Skip Burn, last write page: " + i);
    } 
  }
  
  private int f(F paramF) {
    int i = -1;
    if (this.p.size() > 0)
      synchronized (this.p) {
        for (m m : this.p) {
          if (m.v() != null && m.v().equals(paramF) && (m.n() == 5 || m.n() == 4))
            i = m.o(); 
        } 
      }  
    if (i < 0)
      i = paramF.B(); 
    if (i < 0)
      i = paramF.A(); 
    if (i < 0)
      i = this.L; 
    return i;
  }
  
  public void b(m paramm) {
    if (O)
      b("Received Instruction: " + paramm.aL() + ", Page: " + (paramm.o() + 1)); 
    if (!this.F || !this.G)
      if (paramm.n() == 7) {
        try {
          c(paramm);
        } catch (b b1) {
          Logger.getLogger(J.class.getName()).log(Level.SEVERE, "Timeout", (Throwable)b1);
        } catch (l l) {
          Logger.getLogger(J.class.getName()).log(Level.SEVERE, (String)null, l);
        } 
      } else {
        return;
      }  
    byte b = -1;
    if (paramm.n() == 5 || paramm.n() == 4) {
      if (paramm.o() == -1 || paramm.q() < 0)
        D.c("Impossible Write Chunk Instruction!!!"); 
      synchronized (this.p) {
        Iterator<m> iterator = this.p.iterator();
        while (iterator.hasNext()) {
          m m1 = iterator.next();
          int i = m1.q() + m1.r();
          int j = paramm.q() + paramm.r();
          if (m1.o() == paramm.o() && m1.q() >= paramm.q() && i <= j) {
            iterator.remove();
            D.c("removed expired instruction");
          } 
        } 
      } 
    } 
    if (paramm.x() && this.L >= 0) {
      m m1 = m.a(paramm.v(), this.L);
      b(m1);
    } 
    if (paramm.n() == 6) {
      if (paramm.o() == this.L) {
        if (O)
          D.c("CommManager got a burn for page " + (this.L + 1) + ", cleared lastWritePage"); 
        this.L = -2;
        this.M = null;
        D.d("Queueing burn to page:" + (paramm.o() + 1));
        paramm.b(new K(this));
      } else {
        D.d("skip burn to page:" + (paramm.o() + 1) + ", lastWritePage = " + this.L);
      } 
    } else if (paramm.n() == 5 || paramm.n() == 4 || (paramm.n() == 16 && paramm.o() >= 0)) {
      this.L = paramm.o();
      this.M = paramm.v();
      d(this.M.u(), this.L);
    } else if (paramm.n() == 3) {
    
    } 
    synchronized (this) {
      paramm.g(this.af++);
      this.p.add(paramm);
      notify();
    } 
  }
  
  public boolean w() {
    return !this.p.isEmpty();
  }
  
  public boolean c(int paramInt) {
    for (m m : this.p) {
      if (m.o() == paramInt && (m.n() == 5 || m.n() == 4))
        return true; 
    } 
    return false;
  }
  
  public boolean x() {
    byte b = 0;
    ArrayList<Integer> arrayList = new ArrayList();
    for (m m : this.p) {
      if (m.n() == 5 || m.n() == 4) {
        if (!arrayList.contains(Integer.valueOf(m.o() + 1)))
          arrayList.add(Integer.valueOf(m.o() + 1)); 
        b++;
      } 
    } 
    if (b > 0) {
      StringBuilder stringBuilder = new StringBuilder();
      Iterator<Integer> iterator = arrayList.iterator();
      while (iterator.hasNext())
        stringBuilder.append(iterator.next()).append(", "); 
      D.c("Queued Write instructions:" + b + " to page(s) " + stringBuilder.toString());
      return true;
    } 
    D.c("No Remaining Queue Write instructions");
    return false;
  }
  
  public abstract boolean b();
  
  protected void y() {
    while (!this.p.isEmpty()) {
      m m = this.p.poll();
      String str = (m.v() == null) ? e().u() : m.v().u();
      o(str);
      try {
        if (e().D() == null && e().al().equals("basicRequestReply"))
          a(25L); 
        if (m.c()) {
          cR cR = m.v().D();
          m.v().a((cR)null);
          cV cV = m.v().C();
          m.v().a((cV)null);
          try {
            c(m);
          } finally {
            m.v().a(cV);
            m.v().a(cR);
          } 
          continue;
        } 
        c(m);
      } catch (Exception exception) {
        if (b()) {
          D.d("Exception caught processing instruction, but stop has already been initiated. Doing nothing.");
          if (exception instanceof l)
            throw new IOException(exception.getMessage()); 
          continue;
        } 
        D.a("Could not process CommInstruction. writing last " + this.D + " controller interactions to the log followed by the stack trace");
        G();
        Logger.getLogger(J.class.getName()).log(Level.SEVERE, (String)null, exception);
        o o = new o(m);
        o.a(3);
        o.a("Could not process CommInstruction.\nError written to log.\n" + exception.getMessage());
        m.b(o);
        if (exception instanceof l)
          throw new IOException(exception.getMessage()); 
      } 
    } 
    try {
      if (e().D() == null && e().al().equals("basicRequestReply"))
        Thread.sleep(e().h()); 
    } catch (InterruptedException interruptedException) {}
  }
  
  protected void c(m paramm) {
    while (this.I)
      a(100L); 
    if (O)
      b("Processing Instruction: " + paramm.aL() + ", Page: " + (paramm.o() + 1)); 
    paramm.m();
    switch (paramm.n()) {
      case 3:
        l(paramm);
        D.c("Read All Data");
        break;
      case 2:
        m(paramm);
        break;
      case 1:
        n(paramm);
        break;
      case 5:
        a(paramm.v(), paramm.o());
        paramm.b(0.2D);
        e(paramm);
        break;
      case 4:
        a(paramm.v(), paramm.o());
        f(paramm);
        break;
      case 6:
        try {
          if (paramm.v() != null && paramm.v().x(paramm.o())) {
            d(paramm);
            break;
          } 
          if (!x())
            a(e().u(), true); 
        } catch (Exception exception) {
          try {
            d(paramm);
          } catch (d d) {
            throw new l(d.getMessage());
          } 
        } 
        break;
      case 7:
        t(paramm);
        break;
      case 8:
        s(paramm);
        break;
      case 16:
        k(paramm);
        break;
      case 32:
        g(paramm);
        break;
      case 64:
        q(paramm);
        break;
      case 128:
        u(paramm);
        break;
      case 256:
        o(paramm);
        break;
      case 512:
        p(paramm);
        break;
      case 1024:
        paramm.k().run();
        break;
      case 2048:
        i(paramm);
        break;
      case 4096:
        h(paramm);
        break;
      case 8192:
        j(paramm);
        break;
      default:
        D.b("Attempted to process CommInstruction, but type is not supported by this driver:" + paramm.n());
        break;
    } 
    if (O)
      b("Processing Complete: " + paramm.aL()); 
  }
  
  protected void z() {
    if (!N() && M() < System.currentTimeMillis() && e().aw() > 0) {
      F f1 = e();
      c(f1);
      if (f1.Q() != null && f1.V() && !f1.W()) {
        m m = m.d(f1);
        try {
          c(m);
          int j = (int)f1.S().a();
          a(j);
          f1.i(true);
          D.d("Activated Turbo Baud, Runtime: " + j);
        } catch (l l) {
          Logger.getLogger(J.class.getName()).log(Level.SEVERE, (String)null, l);
        } 
      } 
      boolean bool1 = O;
      boolean bool2 = O;
      byte[][] arrayOfByte = new byte[this.A.size()][1];
      int i = 0;
      try {
        byte b;
        for (b = 0; b < arrayOfByte.length; b++) {
          F f2 = this.A.get(b);
          o(f2.u());
          if (f2.F() && !f2.ap() && f2.o() != null) {
            if (f2.ac() && f2.ad() >= 0) {
              boolean bool3 = false;
              boolean bool4 = true;
              if (I())
                D.c("Real OchDelay for " + f2.u() + ": " + bool4 + ", timeout=" + f2.av()); 
              long l = System.nanoTime();
              arrayOfByte[b] = this.X.b(f2.n());
              try {
                a(f2, arrayOfByte[b], bool3, f2.ad(), bool4);
              } catch (d d) {
                D.c("Controller reported Comms error, skipping runtime data read. " + d.getMessage());
                b(f2.u(), 2);
                if (d.a() == 147) {
                  cu.a().a(f2.E().K());
                  throw d;
                } 
                throw d;
              } catch (b b1) {
                cu.a().a(f2.E().K());
                throw b1;
              } 
              i = (int)((System.nanoTime() - l) / 1000000L);
              if (I())
                D.c("time to read scattered outpc: " + i + " ms."); 
            } else if (!f2.N()) {
              long l = System.nanoTime();
              byte[] arrayOfByte1 = f2.o().a(0, f2.n(), null);
              try {
                boolean bool3 = (((F)this.A.get(0)).D() == null) ? (((F)this.A.get(0)).t() / arrayOfByte.length) : false;
                if (I())
                  D.c("Real OchDelay for " + f2.u() + ": " + f2.t() + ", timeout=" + f2.av()); 
                byte[] arrayOfByte2 = a(arrayOfByte1, bool3, f2.av(), this.aa[b], (m)null);
                if (arrayOfByte2.length != this.aa[b]) {
                  D.c("unexpected runtime response size: " + arrayOfByte2.length + ", expected: " + this.aa[b]);
                  b b1 = new b("");
                  b1.b(this.aa[b]);
                  b1.a(arrayOfByte2.length);
                  throw b1;
                } 
                arrayOfByte[b] = this.X.b(arrayOfByte2.length);
                System.arraycopy(arrayOfByte2, 0, arrayOfByte[b], 0, arrayOfByte2.length);
              } catch (d d) {
                if (f2.D() != null && f2.D().c(d.a()))
                  return; 
                if (b == 0) {
                  D.c("Controller reported Comms error, skipping runtime data read. " + d.getMessage());
                  b(f2.u(), 2);
                  throw new b("Failed to read runtime data.\n" + d.getMessage());
                } 
                b(f2.u(), 2);
                throw new b("Failed to communicate with CAN device.\n" + d.getMessage());
              } 
              i = (int)((System.nanoTime() - l) / 1000000L);
              if (I())
                D.c("old style time to read outpc: " + i + " ms."); 
              if (b < arrayOfByte.length - 1)
                a(1L); 
            } else {
              boolean bool3 = (((F)this.A.get(0)).D() == null) ? (((F)this.A.get(0)).t() / arrayOfByte.length) : false;
              if (I())
                D.c("Real OchDelay for " + f2.u() + ": " + bool3 + ", timeout=" + f2.av()); 
              long l = System.nanoTime();
              boolean bool4 = false;
              arrayOfByte[b] = this.X.b(f2.n());
              try {
                List list = f2.L();
                if (list != null && !list.isEmpty()) {
                  for (w w : list) {
                    if (((F)this.A.get(0)).ar()) {
                      b(f2, arrayOfByte[b], w.a(), w.c(), 0);
                      continue;
                    } 
                    b(f2, arrayOfByte[b], w.a(), w.c(), 1 + w.c() / 36);
                  } 
                } else {
                  b(f2, arrayOfByte[b], bool4, this.aa[b], bool3);
                } 
              } catch (d d) {
                D.c("Controller reported Comms error, skipping runtime data read. " + d.getMessage());
                b(f2.u(), 2);
                throw d;
              } 
              i = (int)((System.nanoTime() - l) / 1000000L);
              if (I())
                D.c("Blocked time to read outpc: " + i + " ms."); 
            } 
            if (b == 0)
              this.ab = i; 
            if (this.aa[b] != (arrayOfByte[b]).length) {
              D.b("Och is " + (arrayOfByte[b]).length + ", expected:" + this.aa[b] + ", turn on Comm debug for more data.");
              b(f2.u(), 4);
              return;
            } 
          } 
        } 
        for (b = 0; b < this.A.size(); b++) {
          if (((F)this.A.get(b)).F() && !((F)this.A.get(b)).ap())
            if (b > 0 || b(((F)this.A.get(b)).u(), arrayOfByte[b])) {
              a(((F)this.A.get(b)).u(), arrayOfByte[b]);
            } else {
              throw new b("Invalid runtime data received.");
            }  
        } 
      } finally {
        for (byte b = 0; b < arrayOfByte.length; b++)
          this.X.a(arrayOfByte[b]); 
      } 
      boolean bool = (e().aw() == 0) ? true : (int)(1.0E9D / e().aw() - (System.nanoTime() - this.ag));
      if (this.P > 0L) {
        this.P = bool ? 0L : (int)Math.floor((this.P + bool) / 2.0D);
      } else {
        this.P = bool ? 0L : bool;
      } 
      if (e().aw() < 8 && this.P < 25000000L && e().D() == null) {
        this.P = 25000000L;
      } else if (e().aw() < 12 && this.P < 15000000L && e().D() == null) {
        this.P = 12000000L;
      } else if (e().aw() < 18 && this.P < 6000000L && e().D() == null) {
        this.P = 5000000L;
      } else if (e().aw() < 25 && this.P < 2000000L && e().D() == null) {
        this.P = 2000000L;
      } else if (this.P < 0L) {
        this.P = 0L;
      } 
      this.P += (e().z() * 1000000);
      if (this.P > 0L) {
        long l1 = System.nanoTime();
        long l2 = this.P;
        do {
          int j = (int)(l2 / 1000000L);
          l2 %= 1000000L;
          a(j, (int)l2);
          l2 -= System.nanoTime() - l1;
        } while (l2 > 0L && !w());
      } 
    } else {
      c(30L);
    } 
    this.ag = System.nanoTime();
    if (!this.r.isEmpty()) {
      this.q.addAll(this.r);
      this.r.clear();
    } 
  }
  
  private byte[] a(F paramF, byte[] paramArrayOfbyte, int paramInt1, int paramInt2, int paramInt3) {
    int i = 0;
    byte[] arrayOfByte = this.X.a(paramF.ad());
    List list = paramF.ab();
    while (i < paramInt2) {
      int k = paramF.G(0);
      int m = (k < paramInt2 - i) ? k : (paramInt2 - i);
      byte[] arrayOfByte1 = paramF.Z().a(paramInt1 + i, m, null);
      if (paramInt2 > k && arrayOfByte1.length == 1) {
        D.b("blockingFactor smaller than ochBlockSize, but ochCommand does not support blocking. Will Attempt reading entire outpc");
        m = paramInt2;
      } 
      byte[] arrayOfByte2 = a(arrayOfByte1, paramInt3, paramF.av(), m, (m)null);
      if (arrayOfByte2.length == m) {
        System.arraycopy(arrayOfByte2, 0, arrayOfByte, paramInt1 + i, arrayOfByte2.length);
        i += m;
        continue;
      } 
      d d = new d("Unexpected runtime response size, expected: " + m + ", received: " + arrayOfByte2.length);
      d.a(147);
      throw d;
    } 
    int j = 0;
    for (w w : list) {
      System.arraycopy(arrayOfByte, j, paramArrayOfbyte, w.a(), w.c());
      j += w.c();
    } 
    return paramArrayOfbyte;
  }
  
  private byte[] b(F paramF, byte[] paramArrayOfbyte, int paramInt1, int paramInt2, int paramInt3) {
    int i = 0;
    while (i < paramInt2) {
      int j = paramF.G(0);
      int k = (j < paramInt2 - i) ? j : (paramInt2 - i);
      byte[] arrayOfByte1 = paramF.o().a(paramInt1 + i, k, null);
      if (paramInt2 > j && arrayOfByte1.length == 1) {
        D.b("blockingFactor smaller than ochBlockSize, but ochCommand does not support blocking. Will Attempt reading entire outpc");
        k = paramInt2;
      } 
      byte[] arrayOfByte2 = a(arrayOfByte1, paramInt3, paramF.av(), k, (m)null);
      if (arrayOfByte2.length == k) {
        System.arraycopy(arrayOfByte2, 0, paramArrayOfbyte, paramInt1 + i, arrayOfByte2.length);
        i += k;
        continue;
      } 
      throw new d("Unexpected runtime response size, expected: " + k + ", received: " + arrayOfByte2.length);
    } 
    return paramArrayOfbyte;
  }
  
  public abstract void d();
  
  protected void b(F paramF) {
    if (this.A.contains(paramF))
      return; 
    this.A.add(paramF);
    if (paramF.l() != null) {
      N n = new N(this);
      n.a(paramF);
      this.ad.put(paramF.u(), n);
    } 
    t();
  }
  
  protected F d(String paramString) {
    if (paramString == null || paramString.equals(""))
      return this.A.get(0); 
    for (F f1 : this.A) {
      if (f1.aL().equals(paramString))
        return f1; 
    } 
    return this.A.isEmpty() ? null : this.A.get(0);
  }
  
  public F e() {
    return this.A.get(0);
  }
  
  protected void a(F paramF, int paramInt) {
    try {
      if (this.H && paramF.A() >= 0 && paramF.B() >= 0 && paramF.x(paramF.A()) && paramF.A() != paramInt) {
        D.c("Activate Page, burn page " + (paramF.A() + 1) + " new active page=" + (paramInt + 1));
        m m = m.a(paramF, paramF.A());
        d(m);
      } 
      if (paramF.m(paramInt) == null) {
        paramF.t(paramInt);
        return;
      } 
      if (paramF.A() == paramInt)
        return; 
      D.d("Activating page: " + (paramInt + 1));
      paramF.t(paramInt);
      byte[] arrayOfByte = paramF.m(paramInt);
      if (arrayOfByte == null)
        return; 
      a(arrayOfByte, paramF.h());
    } catch (b b) {
      throw b;
    } catch (Exception exception) {
      Logger.getLogger(J.class.getName()).log(Level.INFO, (String)null, exception);
      throw new l("Activating page" + paramInt + ": " + exception.getMessage());
    } 
  }
  
  protected void d(m paramm) {
    F f1 = paramm.v();
    if (f1 == null)
      f1 = e(); 
    if (paramm.o() == -2)
      paramm.e(f1.A()); 
    if (paramm.o() < 0) {
      D.b("Burn requested for page:" + (paramm.o() + 1));
      return;
    } 
    if (f1.B() < 0) {
      D.c("Request to burn page, but no writes have been performed. Ignoring burn. page: " + (paramm.o() + 1));
      return;
    } 
    H h = f1.e(paramm.o());
    byte[] arrayOfByte = h.d();
    o o = new o();
    o.a(paramm);
    if (arrayOfByte == null || arrayOfByte.length == 0) {
      D.d("Burn Command empty for page " + (paramm.o() + 1) + ", bypassing burn and verification.");
      f1.u(-2);
      o.a(2);
      o.b(f1.u());
      paramm.b(1.0D);
      paramm.b(o);
      c(f1.u(), paramm.o());
      if (!x()) {
        this.L = -2;
        a(e().u(), true);
      } 
      return;
    } 
    try {
      byte b = -1;
      long l = System.currentTimeMillis();
      if (e().D() != null) {
        boolean bool1 = (f1.h() > 0) ? f1.h() : true;
        a(arrayOfByte, 1L, bool1, 0, (m)null);
      } else {
        b(arrayOfByte, b);
        if (f1.h() > 0)
          a(f1.h()); 
      } 
      D.c("Burn time:" + (System.currentTimeMillis() - l) + "ms.");
      f1.u(-2);
      o.a(1);
      o.b(f1.u());
      D.c("burned page " + (paramm.o() + 1));
    } catch (d d) {
      throw d;
    } catch (Exception exception) {
      o.a(3);
      o.a("Device burn failed!\nError: " + exception.getMessage());
      D.c("burned page FAILED! " + (paramm.o() + 1));
      Logger.getLogger(J.class.getName()).log(Level.SEVERE, (String)null, exception);
    } 
    a(true);
    paramm.b(1.0D);
    paramm.b(o);
    c(f1.u(), paramm.o());
    a(false);
    boolean bool = true;
    try {
      bool = r(paramm);
    } catch (l l) {
      aB.a().b(f1.u(), "Serial Communication error during page burn.\nNo Response from Controller.\n\nPossible loss of data that has been written to the Controller.\nGoing offline.");
      c();
      E();
      o.a(3);
    } 
    if (!bool) {
      f("Burn Page failed CRC Check.\nCheck Log for full data dump of local and controller Page " + (paramm.o() + 1) + " data.");
      o.a(3);
      F();
      D.c("Writing the last " + this.D + " comm interactions including the burn, crc and page read to the log file here:");
      G();
    } 
  }
  
  private void q(m paramm) {
    o o = new o();
    o.a(paramm);
    try {
      b b = new b();
      for (m m1 : paramm.a()) {
        m1.b(b);
        c(m1);
        if (b.a() == null || b.a().a() == 3) {
          o.a(3);
          o.a(b.b());
          paramm.b(o);
          return;
        } 
        m1.a(b);
      } 
      o.a(1);
      o.a(b.a().e());
      o.a(b.a().d());
    } catch (Exception exception) {
      o.a(3);
      o.a(exception.getMessage());
    } 
    paramm.b(o);
  }
  
  protected void e(m paramm) {
    F f1 = paramm.v();
    H h = f1.j(paramm.o());
    byte[] arrayOfByte = h.a(paramm.q(), paramm.r(), paramm.p());
    o o = new o();
    o.a(paramm);
    try {
      a(arrayOfByte);
      o.a(1);
      f1.u(paramm.o());
    } catch (b|d b) {
      if (b instanceof d)
        D.b("Retrying Controller Rejected Write after " + f1.i() + "ms wait"); 
      try {
        a(f1.i());
        a(arrayOfByte);
        o.a(1);
        f1.u(paramm.o());
      } catch (Exception exception) {
        if (b instanceof b)
          throw b; 
        if (b instanceof d)
          D.b("Retrying Controller Rejected Write after " + f1.i() + "ms wait"); 
        D.b("Controller Rejected Write again, Comm Manager will report error for additional handling.");
        o.a(3);
        o.a("Device write failed!\nError: " + b.getMessage());
        paramm.b(o);
        return;
      } 
    } catch (Exception exception) {
      o.a(3);
      o.a("Device write failed!\nError: " + exception.getMessage());
      paramm.b(o);
      return;
    } 
    paramm.b(1.0D);
    paramm.b(o);
    N n = (N)this.ad.get(f1.u());
    n.a(paramm.o(), paramm.q(), paramm.p(), false);
  }
  
  public abstract void a(boolean paramBoolean);
  
  protected void a(int[] paramArrayOfint1, int[] paramArrayOfint2, int paramInt1, int paramInt2) {
    String str = "Controller page " + (paramInt1 + 1) + " Does not match Local store:\n                 Controller " + c.d(a(paramArrayOfint2)) + "                      Local Data Store " + c.d(a(paramArrayOfint1)) + "\n" + c.a(paramInt2, paramArrayOfint2, paramArrayOfint1);
    O o = new O(this);
    o.a(str);
    T.a(o);
  }
  
  protected byte[] a(int[] paramArrayOfint) {
    byte[] arrayOfByte1 = c.a(paramArrayOfint);
    this.ae.reset();
    this.ae.update(arrayOfByte1);
    byte[] arrayOfByte2 = this.X.a(4);
    return c.a((int)this.ae.getValue(), arrayOfByte2, true);
  }
  
  private boolean r(m paramm) {
    F f1 = paramm.v();
    boolean bool = true;
    if (c(f1, paramm.o())) {
      bool = b(paramm.v(), paramm.o());
      if (!bool)
        try {
          N n = (N)this.ad.get(f1.u());
          int[] arrayOfInt1 = n.b(paramm.o());
          int[] arrayOfInt2 = a(f1, paramm.o(), (m)null);
          a(arrayOfInt1, arrayOfInt2, paramm.o(), 0);
          D.d("Retrying CRC call to see if it agrees after read:");
          b(paramm.v(), paramm.o());
        } catch (l l) {
          D.c("Failed during CRC check. Here is the stack:");
          Logger.getLogger(J.class.getName()).log(Level.INFO, (String)null, l);
        }  
    } 
    return bool;
  }
  
  public int[] a(String paramString, int paramInt) {
    return ((N)this.ad.get(paramString)).a(paramInt);
  }
  
  public void a(String paramString, int paramInt1, int paramInt2, boolean paramBoolean) {
    N n = (N)this.ad.get(paramString);
    n.a(paramInt1, paramInt2, paramBoolean);
  }
  
  protected void f(m paramm) {
    F f1 = paramm.v();
    H h = f1.i(paramm.o());
    byte[] arrayOfByte = h.a(paramm.q(), paramm.r(), paramm.p());
    o o = new o();
    o.a(paramm);
    try {
      if (f1.C() == null) {
        a(arrayOfByte);
      } else {
        byte[] arrayOfByte1 = a(arrayOfByte, 2L, f1.i(), 1, (m)null);
        a(3L);
      } 
      o.a(1);
      this.Q = System.currentTimeMillis();
      f1.u(paramm.o());
    } catch (Exception exception) {
      o.a(3);
      o.a("Device write failed!\nError: " + exception.getMessage());
      Logger.getLogger(J.class.getName()).log(Level.INFO, (String)null, exception);
    } 
    N n = (N)this.ad.get(f1.u());
    n.a(paramm.o(), paramm.q(), paramm.p(), false);
    paramm.b(1.0D);
    paramm.b(o);
  }
  
  private void s(m paramm) {
    F f1 = paramm.v();
    o o = new o();
    o.a(paramm);
    try {
      if (f1.B() >= 0) {
        m m1 = m.a(f1, f1.A());
        c(m1);
      } 
      byte[] arrayOfByte1 = this.X.a(2);
      byte[] arrayOfByte2 = f1.a(paramm.u(), paramm.p());
      if (f1.C() != null) {
        a(arrayOfByte2, paramm);
      } else {
        arrayOfByte1[0] = arrayOfByte2[0];
        arrayOfByte1[1] = arrayOfByte2[1];
        byte[] arrayOfByte = this.X.a(arrayOfByte2.length - 2);
        for (byte b = 0; b < arrayOfByte.length; b++)
          arrayOfByte[b] = arrayOfByte2[b + 2]; 
        a(arrayOfByte1);
        if (f1.h() > 0)
          Thread.sleep(f1.h()); 
        a(arrayOfByte, paramm);
      } 
      o.a(1);
    } catch (Exception exception) {
      o.a(3);
      o.a("Error: " + exception.getMessage());
    } 
    paramm.b(1.0D);
    paramm.b(o);
  }
  
  protected void g(m paramm) {
    o o = new o();
    o.a(paramm);
    paramm.m();
    boolean bool = false;
    try {
      bool = b(paramm.v(), paramm.o());
      if (bool) {
        o.a(1);
      } else {
        o.a(2);
        o.a("CRC Mismatch between Controller and local store");
      } 
    } catch (l l) {
      o.a(3);
      o.a("Error during Page CRC check.\n" + l.getMessage());
      Logger.getLogger(J.class.getName()).log(Level.INFO, (String)null, l);
    } 
    paramm.b(1.0D);
    paramm.b(o);
  }
  
  protected boolean b(F paramF, int paramInt) {
    boolean bool = false;
    int i = paramF.f(paramInt);
    return a(paramF, paramInt, bool, i);
  }
  
  protected boolean a(F paramF, int paramInt1, int paramInt2, int paramInt3) {
    boolean bool;
    byte[] arrayOfByte2;
    N n = (N)this.ad.get(paramF.u());
    if (!c(paramF, paramInt1))
      return false; 
    H h = paramF.l(paramInt1);
    byte b = 4;
    byte[] arrayOfByte1 = h.a(0, paramF.f(paramInt1), null);
    try {
      arrayOfByte2 = a(arrayOfByte1, 20L, paramF.i(), b, (m)null);
    } catch (IOException iOException) {
      throw new l("Error reading from Controller, command:" + c.d(arrayOfByte1) + "Error:" + iOException.getMessage());
    } catch (b b1) {
      throw new l("Timeout during CRC, command:" + c.d(arrayOfByte1) + "Error:" + b1.getMessage());
    } catch (d d) {
      throw new l("Controller Reported error during read: " + d.getMessage());
    } 
    byte[] arrayOfByte3 = arrayOfByte2;
    byte[] arrayOfByte4 = c.a(n.a(paramInt1));
    this.ae.reset();
    this.ae.update(arrayOfByte4);
    byte[] arrayOfByte5 = this.X.a(4);
    arrayOfByte5 = c.a((int)this.ae.getValue(), arrayOfByte5, true);
    if (!c.c(arrayOfByte3, arrayOfByte5)) {
      D.d("CRC Mismatch, will need to refresh page from controller ");
      D.d("   CRC from controller page " + (paramInt1 + 1) + ":" + c.d(arrayOfByte3));
      D.d("   Local Data CRC for page " + (paramInt1 + 1) + ": " + c.d(arrayOfByte5));
      bool = false;
    } else if (O) {
      D.d("CRC matches fine. ");
      D.c("   CRC from controller page " + (paramInt1 + 1) + ":" + c.d(arrayOfByte3));
      D.c("   Local Data CRC for page " + (paramInt1 + 1) + ": " + c.d(arrayOfByte5));
      bool = true;
    } else {
      D.c("CRC matches for page " + (paramInt1 + 1) + ":" + c.d(arrayOfByte3));
      bool = true;
    } 
    return bool;
  }
  
  protected void h(m paramm) {}
  
  protected void i(m paramm) {}
  
  protected void j(m paramm) {}
  
  protected void k(m paramm) {
    F f1 = paramm.v();
    o o = new o();
    o.a(paramm);
    try {
      int[] arrayOfInt = paramm.p();
      byte[] arrayOfByte1 = this.X.a(arrayOfInt.length);
      for (byte b1 = 0; b1 < arrayOfByte1.length; b1++)
        arrayOfByte1[b1] = (byte)arrayOfInt[b1]; 
      byte[] arrayOfByte2 = null;
      byte b2 = 0;
      do {
        try {
          boolean bool = (paramm.f() >= 0) ? paramm.f() : true;
          if (e().D() != null)
            e().D().a(false); 
          if (paramm.b() == -1) {
            int i = (f1 != null) ? f1.i() : paramm.w();
            arrayOfByte2 = a(arrayOfByte1, paramm.w(), i, bool, paramm);
          } else {
            arrayOfByte2 = a(arrayOfByte1, paramm.w(), paramm.b(), bool, paramm);
          } 
          if (paramm.o() >= 0) {
            this.L = paramm.o();
            if (f1 != null)
              d(f1.u(), this.L); 
          } 
          if (paramm.d() && arrayOfByte2 != null) {
            byte[] arrayOfByte = new byte[arrayOfByte2.length];
            System.arraycopy(arrayOfByte2, 0, arrayOfByte, 0, arrayOfByte.length);
            o.a(arrayOfByte);
          } else if (arrayOfByte2 != null) {
            o.a(c.b(arrayOfByte2));
          } 
          o.a(1);
        } catch (b b) {
          if (++b2 < 3) {
            D.d("Timeout on raw write, retrying:" + b2);
          } else {
            throw b;
          } 
        } finally {
          if (e().D() != null)
            e().D().a(true); 
        } 
      } while (o.a() != 1 && paramm.g());
    } catch (Exception exception) {
      o.a(3);
      o.a("Controller Instruction failed!\n\nError: \n" + exception.getMessage());
    } 
    paramm.b(1.0D);
    paramm.b(o);
    if (O)
      b("All processing complete for " + paramm.aL()); 
  }
  
  public boolean c(F paramF, int paramInt) {
    return (K() && paramF != null && paramF.k(paramInt));
  }
  
  protected void l(m paramm) {
    F f1 = paramm.v();
    int[][] arrayOfInt = new int[f1.g()][0];
    paramm.b(0.0D);
    m m1 = new m(f1);
    cG cG = new cG(f1, paramm);
    m1.b(cG);
    for (byte b = 0; b < arrayOfInt.length; b++) {
      if (e().D() == null)
        a(10L); 
      cG.a(b);
      long l = System.currentTimeMillis();
      try {
        if (c(f1, b)) {
          if (b(f1, b)) {
            N n = (N)this.ad.get(paramm.v().u());
            arrayOfInt[b] = n.b(b);
            D.d("CrC matched skipped controller read on page:" + (b + 1));
          } else if (O && c(f1, b)) {
            N n = (N)this.ad.get(f1.u());
            int[] arrayOfInt1 = n.b(b);
            arrayOfInt[b] = a(f1, b, m1);
            D.c("Read page time: " + (System.currentTimeMillis() - l) + "ms.");
            a(arrayOfInt1, arrayOfInt[b], b, 0);
          } else {
            arrayOfInt[b] = a(f1, b, m1);
            D.c("Read page time: " + (System.currentTimeMillis() - l) + "ms.");
            byte[] arrayOfByte = a(arrayOfInt[b]);
            D.d("Checksum page " + (b + 1) + " data read: " + c.d(arrayOfByte));
          } 
        } else {
          arrayOfInt[b] = a(f1, b, m1);
          D.c("Read page time: " + (System.currentTimeMillis() - l) + "ms.");
        } 
      } catch (l l1) {
        if (f1.i() < f1.m())
          f1.c(f1.i() + 50); 
        D.d("Timeout reading page " + (b + 1) + ", increased blockReadTimeout to " + f1.i() + ", trying once more.");
        try {
          Thread.sleep((f1.i() * 2));
        } catch (InterruptedException interruptedException) {
          Logger.getLogger(J.class.getName()).log(Level.INFO, (String)null, interruptedException);
        } 
        try {
          arrayOfInt[b] = a(f1, b, m1);
        } catch (l l2) {
          o o1 = new o();
          o1.a(3);
          o1.a("Serial Failure, Unable to get all pages of data after multiple attempts.");
          paramm.b(o1);
          return;
        } 
      } 
    } 
    o o = new o();
    o.a(1);
    o.a(arrayOfInt);
    paramm.b(o);
  }
  
  protected void m(m paramm) {
    F f1 = paramm.v();
    int i = paramm.o();
    int[] arrayOfInt = new int[f1.g()];
    paramm.b(0.0D);
    try {
      if (c(f1, i)) {
        a(f1, i);
        if (b(f1, i)) {
          N n = (N)this.ad.get(paramm.v().u());
          arrayOfInt = n.b(i);
          D.d("CrC matched skipped controller read on page:" + i);
        } else if (O && c(f1, i)) {
          N n = (N)this.ad.get(f1.u());
          int[] arrayOfInt1 = n.b(i);
          arrayOfInt = a(f1, i, paramm);
          a(arrayOfInt1, arrayOfInt, i, 0);
        } else {
          arrayOfInt = a(f1, i, paramm);
          byte[] arrayOfByte = a(arrayOfInt);
          D.d("Checksum of data read: " + c.d(arrayOfByte));
        } 
      } else {
        arrayOfInt = a(f1, i, paramm);
      } 
    } catch (l l) {
      if (f1.i() > f1.m()) {
        D.d("Timeout reading page " + (i + 1) + ", blockReadTimeout=" + f1.i() + ", giving up..");
        throw l;
      } 
      f1.c(f1.i() + 50);
      D.d("Timeout reading page " + (i + 1) + ", increased blockReadTimeout to " + f1.i() + ", trying once more.");
      try {
        Thread.sleep(f1.i());
      } catch (InterruptedException interruptedException) {
        Logger.getLogger(J.class.getName()).log(Level.INFO, (String)null, interruptedException);
      } 
      arrayOfInt = a(f1, i, paramm);
    } 
    paramm.b((i + 1.0D) / arrayOfInt.length);
    o o = new o();
    o.a(paramm);
    o.a(1);
    o.a(arrayOfInt);
    paramm.b(o);
  }
  
  protected int[] a(F paramF, int paramInt, m paramm) {
    try {
      a(paramF, paramInt);
      long l = System.currentTimeMillis();
      byte[] arrayOfByte = null;
      if (paramF.aH() == null || paramF.aH()[paramInt] <= 0 || paramF.f(paramInt) < paramF.aH()[paramInt]) {
        boolean bool;
        if (paramF.D() != null) {
          bool = (paramF.i() > 0) ? paramF.t() : true;
        } else {
          bool = (paramF.i() > 300) ? true : (paramF.i() / 2);
        } 
        arrayOfByte = a(paramF.g(paramInt), bool, paramF.i(), paramF.f(paramInt), paramm);
        if (arrayOfByte == null || paramF.f(paramInt) != arrayOfByte.length)
          throw new IOException("Response size mis-match! Expected:" + paramF.f(paramInt) + ", received:" + arrayOfByte.length); 
      } else {
        int i = 0;
        int j = paramF.G(paramInt);
        arrayOfByte = this.X.a(paramF.f(paramInt));
        while (i < paramF.f(paramInt)) {
          int k = (i + j < paramF.f(paramInt)) ? j : (paramF.f(paramInt) - i);
          boolean bool = (k / 20 > 20) ? (k / 20) : true;
          byte[] arrayOfByte1 = a(paramF.a(paramInt, i, k), bool, paramF.i(), k, (m)null);
          if (arrayOfByte1 == null || k != arrayOfByte1.length)
            throw new IOException("Response size mis-match! Expected:" + paramF.f(paramInt) + ", received:" + arrayOfByte.length); 
          System.arraycopy(arrayOfByte1, 0, arrayOfByte, i, arrayOfByte1.length);
          i += k;
          if (e().D() == null)
            a(5L); 
          paramm.b(i / paramF.f(paramInt));
        } 
      } 
      N n = (N)this.ad.get(paramF.u());
      int[] arrayOfInt = c.b(arrayOfByte);
      n.a(paramInt, 0, arrayOfInt, true);
      return arrayOfInt;
    } catch (l l) {
      Logger.getLogger(J.class.getName()).log(Level.INFO, "Error Reading Page", l);
      throw l;
    } catch (b b) {
      Logger.getLogger(J.class.getName()).log(Level.INFO, "Error Reading Page", (Throwable)b);
      throw b;
    } catch (Exception exception) {
      throw new l("Error Reading data page " + (paramInt + 1) + "\nReported Error: " + exception.getMessage());
    } 
  }
  
  protected void n(m paramm) {
    int[] arrayOfInt;
    F f1 = paramm.v();
    int i = paramm.o();
    int j = paramm.q();
    int k = paramm.f();
    paramm.b(0.0D);
    try {
      if (c(f1, i)) {
        a(f1, i);
        if (b(f1, i)) {
          N n = (N)this.ad.get(paramm.v().u());
          arrayOfInt = new int[paramm.f()];
          System.arraycopy(n.a(i), paramm.q(), arrayOfInt, 0, arrayOfInt.length);
          D.d("CrC matched skipped controller read on page:" + i);
        } else if (O && c(f1, i)) {
          N n = (N)this.ad.get(f1.u());
          int[] arrayOfInt1 = n.b(i);
          arrayOfInt = a(f1, i, j, k, paramm);
          int[] arrayOfInt2 = new int[arrayOfInt.length];
          System.arraycopy(arrayOfInt1, j, arrayOfInt2, 0, arrayOfInt.length);
          a(arrayOfInt2, arrayOfInt, i, 0);
        } else {
          arrayOfInt = a(f1, i, j, k, paramm);
          byte[] arrayOfByte = a(arrayOfInt);
          D.d("Checksum of data read: " + c.d(arrayOfByte));
        } 
      } else {
        arrayOfInt = a(f1, i, j, k, paramm);
      } 
    } catch (l l) {
      if (f1.i() > f1.m()) {
        D.d("Timeout reading chunk " + (i + 1) + ", blockReadTimeout=" + f1.i() + ", giving up..");
        throw l;
      } 
      f1.c(f1.i() + 50);
      D.d("Timeout reading chunk " + (i + 1) + ", increased blockReadTimeout to " + f1.i() + ", trying once more.");
      try {
        Thread.sleep(f1.i());
      } catch (InterruptedException interruptedException) {
        Logger.getLogger(J.class.getName()).log(Level.INFO, (String)null, interruptedException);
      } 
      arrayOfInt = a(f1, i, j, k, paramm);
    } 
    paramm.b((i + 1.0D) / arrayOfInt.length);
    o o = new o();
    o.a(paramm);
    o.a(1);
    o.a(arrayOfInt);
    paramm.b(o);
  }
  
  protected int[] a(F paramF, int paramInt1, int paramInt2, int paramInt3, m paramm) {
    if (paramF.B(paramInt1))
      try {
        a(paramF, paramInt1);
        long l = System.currentTimeMillis();
        byte[] arrayOfByte = null;
        if (paramF.aH() == null || paramF.aH()[paramInt1] <= 0 || paramInt3 < paramF.aH()[paramInt1]) {
          boolean bool;
          if (paramF.D() != null) {
            bool = (paramF.i() > 0) ? paramF.t() : true;
          } else {
            bool = (paramF.i() > 300) ? true : (paramF.i() / 3);
          } 
          arrayOfByte = a(paramF.a(paramInt1, paramInt2, paramInt3), bool, paramF.i(), paramInt3, paramm);
          if (arrayOfByte == null || paramInt3 != arrayOfByte.length)
            throw new IOException("Response size mis-match! Expected:" + paramF.f(paramInt1) + ", received:" + arrayOfByte.length); 
        } else {
          int i = 0;
          int j = paramF.G(paramInt1);
          arrayOfByte = this.X.a(paramInt3);
          while (i < paramInt3) {
            int k = (paramInt3 - i > j) ? j : (paramInt3 - i);
            byte b = (e().D() == null) ? 50 : 10;
            b = (paramF.t() / 3 > b) ? (paramF.t() / 3) : b;
            byte[] arrayOfByte1 = a(paramF.a(paramInt1, paramInt2 + i, k), b, paramF.i(), k, (m)null);
            if (arrayOfByte1 == null || k != arrayOfByte1.length)
              throw new IOException("Response size mis-match! Expected:" + paramF.f(paramInt1) + ", received:" + arrayOfByte.length); 
            System.arraycopy(arrayOfByte1, 0, arrayOfByte, i, arrayOfByte1.length);
            i += k;
            if (e().D() == null)
              a(5L); 
            paramm.b(i / paramInt3);
          } 
        } 
        N n = (N)this.ad.get(paramF.u());
        int[] arrayOfInt = c.b(arrayOfByte);
        n.a(paramInt1, paramInt2, arrayOfInt, true);
        return arrayOfInt;
      } catch (l l) {
        Logger.getLogger(J.class.getName()).log(Level.INFO, "Error Reading Page", l);
        throw l;
      } catch (b b) {
        Logger.getLogger(J.class.getName()).log(Level.INFO, "Error Reading Page", (Throwable)b);
        throw b;
      } catch (Exception exception) {
        throw new l("Error Reading data page " + (paramInt1 + 1) + "\nReported Error: " + exception.getMessage());
      }  
    int[] arrayOfInt1 = a(paramF, paramInt1, paramm);
    int[] arrayOfInt2 = new int[paramInt3];
    System.arraycopy(arrayOfInt1, paramInt2, arrayOfInt2, 0, paramInt3);
    return arrayOfInt2;
  }
  
  protected o o(m paramm) {
    return new o();
  }
  
  protected o p(m paramm) {
    o o = new o();
    o.a(1);
    return o;
  }
  
  protected abstract o a(m paramm);
  
  private void t(m paramm) {
    paramm.b(0.1D);
    o o = a(paramm);
    paramm.b(1.0D);
    if (o == null) {
      o = new o();
      o.a(3);
    } 
    paramm.b(o);
  }
  
  protected String a(byte[] paramArrayOfbyte, long paramLong) {
    byte[] arrayOfByte;
    try {
      arrayOfByte = b(paramArrayOfbyte, paramLong);
    } catch (d d) {
      D.c("Controller reported Comms error during read. " + d.getMessage());
      return null;
    } 
    if (arrayOfByte != null) {
      StringBuilder stringBuilder = new StringBuilder();
      for (byte b = 0; b < arrayOfByte.length && arrayOfByte[b] != 0 && arrayOfByte[b] != 255; b++)
        stringBuilder.append((char)arrayOfByte[b]); 
      return stringBuilder.toString();
    } 
    return null;
  }
  
  protected synchronized void a(long paramLong, int paramInt) {
    long l1 = System.nanoTime();
    long l2 = paramLong * 1000000L + paramInt;
    if (l2 <= 0L)
      return; 
    if (l2 < this.ai) {
      double d = l2 / this.ai;
      if (l2 < 500000L || Math.random() > d)
        return; 
    } else {
      l2 -= this.ai;
      paramLong = l2 / 1000000L;
      paramInt = (int)l2 % 1000000;
    } 
    try {
      if (this.W)
        D.c("nap:" + paramLong + "ms, " + paramInt + " nanos"); 
      Thread.sleep(paramLong, paramInt);
    } catch (Exception exception) {
      D.c("nap Failed");
      exception.printStackTrace();
    } 
    this.ai = (System.nanoTime() - paramLong * 1000000L - paramInt - l1 + this.ai + this.ai) / 3L;
  }
  
  protected synchronized void c(long paramLong) {
    if (paramLong <= 0L)
      return; 
    try {
      if (this.W)
        D.c("nap:" + paramLong); 
      wait(paramLong);
    } catch (Exception exception) {
      D.c("nap Failed");
      exception.printStackTrace();
    } 
  }
  
  protected void a(long paramLong) {
    if (paramLong <= 0L)
      return; 
    try {
      Thread.sleep(paramLong);
    } catch (Exception exception) {}
  }
  
  private void a(byte[] paramArrayOfbyte) {
    b(paramArrayOfbyte, -1L);
  }
  
  private void a(byte[] paramArrayOfbyte, m paramm) {
    try {
      long l = -1L;
      a(paramArrayOfbyte, l, l, -1, paramm);
    } catch (b b) {
      D.a("Write timeout, this shouldn't happen");
      Logger.getLogger(J.class.getName()).log(Level.SEVERE, (String)null, (Throwable)b);
    } 
  }
  
  private void a(byte[] paramArrayOfbyte, int paramInt) {
    b(paramArrayOfbyte, -1L);
    a(paramInt);
  }
  
  protected byte[] b(byte[] paramArrayOfbyte, long paramLong) {
    return a(paramArrayOfbyte, paramLong, paramLong, -1, (m)null);
  }
  
  protected abstract byte[] a(byte[] paramArrayOfbyte, long paramLong1, long paramLong2, int paramInt, m paramm, InputStream paramInputStream);
  
  protected abstract boolean k();
  
  protected synchronized byte[] b(byte[] paramArrayOfbyte, long paramLong1, long paramLong2, int paramInt, m paramm) {
    // Byte code:
    //   0: aload_0
    //   1: getfield A : Ljava/util/ArrayList;
    //   4: iconst_0
    //   5: invokevirtual get : (I)Ljava/lang/Object;
    //   8: checkcast G/F
    //   11: invokevirtual C : ()LG/cV;
    //   14: astore #8
    //   16: aload_0
    //   17: getfield A : Ljava/util/ArrayList;
    //   20: iconst_0
    //   21: invokevirtual get : (I)Ljava/lang/Object;
    //   24: checkcast G/F
    //   27: invokevirtual D : ()LG/cR;
    //   30: astore #9
    //   32: aload #8
    //   34: ifnull -> 76
    //   37: aload_0
    //   38: invokevirtual k : ()Z
    //   41: ifne -> 67
    //   44: aload_0
    //   45: getfield A : Ljava/util/ArrayList;
    //   48: iconst_0
    //   49: invokevirtual get : (I)Ljava/lang/Object;
    //   52: checkcast G/F
    //   55: invokevirtual G : ()Z
    //   58: ifne -> 67
    //   61: aload_1
    //   62: arraylength
    //   63: iconst_1
    //   64: if_icmple -> 76
    //   67: aload #8
    //   69: aload_1
    //   70: invokeinterface a : ([B)[B
    //   75: astore_1
    //   76: aload_0
    //   77: invokevirtual i : ()Ljava/io/InputStream;
    //   80: astore #10
    //   82: lload #4
    //   84: aload_0
    //   85: invokevirtual e : ()LG/F;
    //   88: invokevirtual i : ()I
    //   91: i2l
    //   92: lcmp
    //   93: ifle -> 101
    //   96: lload #4
    //   98: goto -> 109
    //   101: aload_0
    //   102: invokevirtual e : ()LG/F;
    //   105: invokevirtual i : ()I
    //   108: i2l
    //   109: lstore #4
    //   111: lload_2
    //   112: ldc2_w -1
    //   115: lcmp
    //   116: ifne -> 128
    //   119: aload_0
    //   120: invokevirtual e : ()LG/F;
    //   123: invokevirtual t : ()I
    //   126: i2l
    //   127: lstore_2
    //   128: aload_0
    //   129: aload_1
    //   130: lload_2
    //   131: lload #4
    //   133: aload #9
    //   135: invokeinterface b : ()I
    //   140: aload #7
    //   142: aload #10
    //   144: invokevirtual a : ([BJJILG/m;Ljava/io/InputStream;)[B
    //   147: astore #11
    //   149: aload #9
    //   151: aload #11
    //   153: iload #6
    //   155: invokeinterface a : ([BI)I
    //   160: istore #12
    //   162: aload_0
    //   163: aconst_null
    //   164: lconst_0
    //   165: lload #4
    //   167: iload #12
    //   169: aload #7
    //   171: aload #10
    //   173: invokevirtual a : ([BJJILG/m;Ljava/io/InputStream;)[B
    //   176: astore #13
    //   178: aload #11
    //   180: ifnull -> 188
    //   183: aload #13
    //   185: ifnonnull -> 239
    //   188: new java/lang/StringBuilder
    //   191: dup
    //   192: invokespecial <init> : ()V
    //   195: ldc 'Time out waiting for response to command \\n'
    //   197: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   200: aload_1
    //   201: invokestatic d : ([B)Ljava/lang/String;
    //   204: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   207: invokevirtual toString : ()Ljava/lang/String;
    //   210: astore #14
    //   212: new V/b
    //   215: dup
    //   216: aload #14
    //   218: invokespecial <init> : (Ljava/lang/String;)V
    //   221: astore #15
    //   223: aload #15
    //   225: iload #12
    //   227: invokevirtual b : (I)V
    //   230: aload #15
    //   232: iconst_0
    //   233: invokevirtual a : (I)V
    //   236: aload #15
    //   238: athrow
    //   239: aload_0
    //   240: getfield Y : LG/f;
    //   243: aload #11
    //   245: arraylength
    //   246: aload #13
    //   248: arraylength
    //   249: iadd
    //   250: invokevirtual a : (I)[B
    //   253: astore #14
    //   255: aload #11
    //   257: iconst_0
    //   258: aload #14
    //   260: iconst_0
    //   261: aload #11
    //   263: arraylength
    //   264: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   267: aload #13
    //   269: iconst_0
    //   270: aload #14
    //   272: aload #11
    //   274: arraylength
    //   275: aload #13
    //   277: arraylength
    //   278: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   281: aload #9
    //   283: aload_1
    //   284: aload #14
    //   286: invokeinterface a : ([B[B)Z
    //   291: ifne -> 537
    //   294: aload #9
    //   296: invokeinterface d : ()LJ/h;
    //   301: instanceof J/i
    //   304: ifeq -> 363
    //   307: aload #9
    //   309: invokeinterface d : ()LJ/h;
    //   314: checkcast J/i
    //   317: astore #15
    //   319: new java/lang/StringBuilder
    //   322: dup
    //   323: invokespecial <init> : ()V
    //   326: ldc 'call failed protocol validation, running stats: '
    //   328: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   331: aload #15
    //   333: invokevirtual f : ()I
    //   336: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   339: ldc ' failed validation, '
    //   341: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   344: aload #15
    //   346: invokevirtual e : ()I
    //   349: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   352: ldc ' successful.'
    //   354: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   357: invokevirtual toString : ()Ljava/lang/String;
    //   360: invokestatic c : (Ljava/lang/String;)V
    //   363: aload_0
    //   364: ldc 'Response packet reported failure.'
    //   366: aload #14
    //   368: invokevirtual c : (Ljava/lang/String;[B)V
    //   371: aload_0
    //   372: invokevirtual e : ()LG/F;
    //   375: ifnull -> 388
    //   378: aload_0
    //   379: invokevirtual e : ()LG/F;
    //   382: invokevirtual u : ()Ljava/lang/String;
    //   385: goto -> 390
    //   388: ldc ''
    //   390: astore #15
    //   392: aload_1
    //   393: invokestatic b : ([B)[I
    //   396: astore #16
    //   398: aload_0
    //   399: iconst_1
    //   400: invokevirtual a : (Z)V
    //   403: aload #14
    //   405: invokestatic b : ([B)[I
    //   408: astore #17
    //   410: invokestatic a : ()LG/cQ;
    //   413: aload #9
    //   415: aload #9
    //   417: aload #14
    //   419: invokeinterface d : ([B)I
    //   424: invokeinterface b : (I)Z
    //   429: aload #15
    //   431: aload #9
    //   433: aload #14
    //   435: invokeinterface d : ([B)I
    //   440: aload #9
    //   442: aload #14
    //   444: invokeinterface c : ([B)Ljava/lang/String;
    //   449: aload #16
    //   451: aload #17
    //   453: invokevirtual a : (ZLjava/lang/String;ILjava/lang/String;[I[I)V
    //   456: aload_0
    //   457: iconst_0
    //   458: invokevirtual a : (Z)V
    //   461: new V/d
    //   464: dup
    //   465: new java/lang/StringBuilder
    //   468: dup
    //   469: invokespecial <init> : ()V
    //   472: ldc 'Response packet failed validation: '
    //   474: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   477: aload #9
    //   479: invokeinterface c : ()Ljava/lang/String;
    //   484: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   487: invokevirtual toString : ()Ljava/lang/String;
    //   490: invokespecial <init> : (Ljava/lang/String;)V
    //   493: astore #18
    //   495: aload #18
    //   497: aload #17
    //   499: invokevirtual a : ([I)V
    //   502: aload #18
    //   504: aload #9
    //   506: aload #14
    //   508: invokeinterface c : ([B)Ljava/lang/String;
    //   513: invokevirtual b : (Ljava/lang/String;)V
    //   516: aload #18
    //   518: aload #9
    //   520: aload #14
    //   522: invokeinterface d : ([B)I
    //   527: invokevirtual a : (I)V
    //   530: aload_0
    //   531: invokevirtual G : ()V
    //   534: aload #18
    //   536: athrow
    //   537: aload #9
    //   539: aload #14
    //   541: invokeinterface b : ([B)Z
    //   546: ifeq -> 650
    //   549: aload_0
    //   550: iconst_1
    //   551: invokevirtual a : (Z)V
    //   554: aload_0
    //   555: invokevirtual e : ()LG/F;
    //   558: ifnull -> 571
    //   561: aload_0
    //   562: invokevirtual e : ()LG/F;
    //   565: invokevirtual u : ()Ljava/lang/String;
    //   568: goto -> 573
    //   571: ldc ''
    //   573: astore #15
    //   575: invokestatic a : ()LG/cQ;
    //   578: aload #15
    //   580: aload #9
    //   582: aload #14
    //   584: invokeinterface c : ([B)Ljava/lang/String;
    //   589: invokevirtual a : (Ljava/lang/String;Ljava/lang/String;)V
    //   592: aload_0
    //   593: iconst_0
    //   594: invokevirtual a : (Z)V
    //   597: new V/d
    //   600: dup
    //   601: new java/lang/StringBuilder
    //   604: dup
    //   605: invokespecial <init> : ()V
    //   608: ldc 'Config Error Reported: '
    //   610: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   613: aload #9
    //   615: aload #14
    //   617: invokeinterface c : ([B)Ljava/lang/String;
    //   622: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   625: invokevirtual toString : ()Ljava/lang/String;
    //   628: invokespecial <init> : (Ljava/lang/String;)V
    //   631: astore #16
    //   633: aload #16
    //   635: aload #9
    //   637: aload #14
    //   639: invokeinterface d : ([B)I
    //   644: invokevirtual a : (I)V
    //   647: aload #16
    //   649: athrow
    //   650: aload_0
    //   651: invokevirtual e : ()LG/F;
    //   654: invokevirtual O : ()LG/H;
    //   657: ifnull -> 660
    //   660: aload #10
    //   662: invokevirtual available : ()I
    //   665: ifle -> 694
    //   668: new java/lang/StringBuilder
    //   671: dup
    //   672: invokespecial <init> : ()V
    //   675: ldc 'OverRun condition! No bytes expected from controller, found '
    //   677: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   680: aload #10
    //   682: invokevirtual available : ()I
    //   685: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   688: invokevirtual toString : ()Ljava/lang/String;
    //   691: invokestatic b : (Ljava/lang/String;)V
    //   694: aload #9
    //   696: aload #14
    //   698: invokeinterface a : ([B)[B
    //   703: astore #14
    //   705: aload #14
    //   707: areturn
  }
  
  protected synchronized byte[] a(byte[] paramArrayOfbyte, long paramLong1, long paramLong2, int paramInt, m paramm) {
    cR cR = ((F)this.A.get(0)).D();
    boolean bool = (paramm == null || paramm.g()) ? true : false;
    if (cR != null && (paramm == null || !paramm.c()) && (k() || ((F)this.A.get(0)).G()))
      try {
        if (paramLong1 == paramLong2)
          paramLong1 = 1L; 
        return b(paramArrayOfbyte, paramLong1, paramLong2, paramInt, paramm);
      } catch (d d) {
        if (bool && cR.a(d.a())) {
          byte b = (d.a() == 133) ? 50 : 20;
          if (d.a() == 138)
            b = 100; 
          D.c("Protocol reported error after write 0x" + Integer.toHexString(d.a()) + ", waiting " + b + "ms and retry ");
          a(b);
          try {
            byte[] arrayOfByte = b(paramArrayOfbyte, paramLong1, paramLong2, paramInt, paramm);
            D.c("Protocol retry successful on 2nd try! ");
            return arrayOfByte;
          } catch (d d1) {
            try {
              D.c("Protocol reported error on 2nd attempt after write 0x" + Integer.toHexString(d.a()) + ", waiting " + b + "ms and retry ");
              a(b);
              byte[] arrayOfByte = b(paramArrayOfbyte, paramLong1, paramLong2, paramInt, paramm);
              D.c("Protocol retry successful on 3rd try! ");
              return arrayOfByte;
            } catch (d d2) {
              D.c("Protocol retry FAILED!!! Failed 3 attempts, giving up.");
              d1.a(d1.getMessage() + ", 3 attempts made.");
              d.b(3);
              throw d1;
            } 
          } 
        } 
        if (cR.b(d.a())) {
          D.a("Critical Protocol Error, going offline. " + d.toString());
          c();
          if (d.b() != null) {
            a(true);
            String str = (e() != null) ? e().u() : "";
            cQ.a().a(str, d.b());
            a(false);
          } 
          throw d;
        } 
        throw d;
      }  
    InputStream inputStream = i();
    return a(paramArrayOfbyte, paramLong1, paramLong2, paramInt, paramm, inputStream);
  }
  
  protected boolean a(ArrayList paramArrayList) {
    if (paramArrayList.size() > 14 && c.a(paramArrayList)) {
      byte[] arrayOfByte = this.X.a(paramArrayList.size());
      for (byte b = 0; b < paramArrayList.size(); b++)
        arrayOfByte[b] = ((Byte)paramArrayList.get(b)).byteValue(); 
      String str = new String(arrayOfByte);
      e(str);
      return true;
    } 
    return false;
  }
  
  protected void e(String paramString) {
    D.c("Settings Error detected! Writing the last " + this.D + " comm interactions with the controller to the log file here:");
    G();
    cQ.a().a(e().u(), paramString);
  }
  
  public abstract boolean r();
  
  public void a(cJ paramcJ) {
    if (!this.v.contains(paramcJ))
      this.v.add(paramcJ); 
  }
  
  protected void a(m paramm, double paramDouble) {
    paramm.b(paramDouble);
  }
  
  protected void f(String paramString) {
    this.Q = System.currentTimeMillis() + 10000000L;
    Iterator<cJ> iterator = this.v.iterator();
    while (iterator.hasNext())
      ((cJ)iterator.next()).a(paramString); 
    this.Q = System.currentTimeMillis();
  }
  
  public void a(aV paramaV) {
    this.t.add(paramaV);
  }
  
  public void a(aG paramaG) {
    if (!this.b.contains(paramaG))
      this.b.add(paramaG); 
  }
  
  public void a(ad paramad) {
    this.w.add(paramad);
  }
  
  public void b(aG paramaG) {
    this.b.remove(paramaG);
  }
  
  public void a(aF paramaF) {
    this.q.add(paramaF);
  }
  
  public void b(aF paramaF) {
    this.r.add(paramaF);
  }
  
  public void c(aF paramaF) {
    this.r.remove(paramaF);
    this.q.remove(paramaF);
  }
  
  protected void a(String paramString, byte[] paramArrayOfbyte) {
    for (byte b = 0; b < this.q.size(); b++) {
      aF aF = this.q.get(b);
      try {
        aF.a(paramString, paramArrayOfbyte);
      } catch (Exception exception) {
        D.b("Exception during notifyOchRecived, finish remaining");
        Logger.getLogger(J.class.getName()).log(Level.INFO, (String)null, exception);
      } 
    } 
  }
  
  protected void b(String paramString, int paramInt) {
    for (byte b = 0; b < this.s.size(); b++) {
      aE aE = this.s.get(b);
      try {
        aE.a(paramString, paramInt);
      } catch (Exception exception) {
        D.b("Exception during notifyOchRecived, finish remaining");
        Logger.getLogger(J.class.getName()).log(Level.INFO, (String)null, exception);
      } 
    } 
  }
  
  protected boolean a(String paramString1, String paramString2, bT parambT) {
    boolean bool = true;
    for (aG aG : this.b) {
      try {
        if (!aG.a(paramString1, parambT)) {
          c();
          bool = false;
          break;
        } 
      } catch (Exception exception) {
        D.b("Exception while notifiying EcuOnlineListener of going online.\nlistener: " + aG);
        Logger.getLogger(J.class.getName()).log(Level.INFO, (String)null, exception);
      } 
    } 
    return bool;
  }
  
  protected void A() {
    for (F f1 : this.A) {
      g(f1.u());
      f1.w(-1);
    } 
    b(e().u(), e().u() + " Offline");
  }
  
  protected void g(String paramString) {
    for (aG aG : this.b) {
      try {
        aG.a(paramString);
      } catch (Exception exception) {}
    } 
  }
  
  protected boolean b(String paramString, byte[] paramArrayOfbyte) {
    for (aD aD : this.x) {
      if (!aD.a(paramString, paramArrayOfbyte))
        return false; 
    } 
    return true;
  }
  
  protected boolean B() {
    for (ai ai : this.y) {
      if (!ai.a(this.ak))
        return false; 
    } 
    return true;
  }
  
  public void a(u paramu) {
    if (!this.z.contains(paramu))
      this.z.add(paramu); 
  }
  
  protected void h(String paramString) {
    for (u u : this.z)
      u.a(paramString); 
  }
  
  public void a(aD paramaD) {
    this.x.add(paramaD);
  }
  
  public void a(ai paramai) {
    this.y.add(paramai);
  }
  
  protected void i(String paramString) {
    for (aV aV : this.t)
      aV.b(paramString); 
  }
  
  protected void j(String paramString) {
    for (aV aV : this.t)
      aV.c(paramString); 
  }
  
  protected void k(String paramString) {
    for (aV aV : this.t)
      aV.d(paramString); 
  }
  
  protected void l(String paramString) {
    for (aV aV : this.t)
      aV.e(paramString); 
  }
  
  protected void c(String paramString, int paramInt) {
    try {
      synchronized (this.u) {
        for (g g : this.u) {
          if (g != null)
            g.b(paramString, paramInt); 
        } 
      } 
    } catch (Exception exception) {
      D.a("Failed to notify all burn listeners. Stack to follow.");
      Logger.getLogger(J.class.getName()).log(Level.INFO, (String)null, exception);
    } 
  }
  
  protected void d(String paramString, int paramInt) {
    try {
      synchronized (this.u) {
        F f1 = d(paramString);
        if (f1 == null || f1.x(paramInt))
          for (g g : this.u) {
            if (g != null)
              g.a(paramString, paramInt); 
          }  
      } 
    } catch (Exception exception) {
      D.a("Failed to notify all burn listeners. Stack to follow.");
      Logger.getLogger(J.class.getName()).log(Level.INFO, (String)null, exception);
    } 
  }
  
  public boolean C() {
    F f1 = d(L());
    return (this.L >= 0 && (f1 == null || f1.x(this.L)));
  }
  
  public h D() {
    return (e().D() instanceof f) ? ((f)e().D()).d() : null;
  }
  
  protected void a(String paramString, boolean paramBoolean) {
    synchronized (this.u) {
      Iterator<g> iterator = this.u.iterator();
      while (iterator.hasNext())
        ((g)iterator.next()).a(paramString, paramBoolean); 
    } 
  }
  
  protected void E() {
    Iterator<ad> iterator = this.w.iterator();
    while (iterator.hasNext()) {
      try {
        ((ad)iterator.next()).b();
      } catch (Exception exception) {
        D.b("EcuDataSyncErrorListener had unhandled Exception, it was caught here.");
        Logger.getLogger(J.class.getName()).log(Level.INFO, (String)null, exception);
      } 
    } 
  }
  
  protected void F() {
    Iterator<ad> iterator = this.w.iterator();
    while (iterator.hasNext()) {
      try {
        ((ad)iterator.next()).a();
      } catch (Exception exception) {
        D.b("EcuDataSyncErrorListener had unhandled Exception, it was caught here.");
        Logger.getLogger(J.class.getName()).log(Level.INFO, (String)null, exception);
      } 
    } 
  }
  
  protected void b(String paramString1, String paramString2) {
    aB.a().a(paramString1, paramString2);
  }
  
  public void a(g paramg) {
    if (!this.u.contains(paramg))
      this.u.add(paramg); 
  }
  
  public boolean b(g paramg) {
    return this.u.remove(paramg);
  }
  
  public void b(boolean paramBoolean) {
    this.H = paramBoolean;
  }
  
  public abstract boolean q();
  
  protected void b(String paramString) {
    if (I()) {
      O o = new O(this);
      o.a(paramString);
      T.a(o);
    } 
  }
  
  protected void c(String paramString, byte[] paramArrayOfbyte) {
    if (this.D > 0 || I()) {
      O o = new O(this);
      o.a(paramString);
      o.a(paramArrayOfbyte);
      T.a(o);
    } 
  }
  
  protected boolean d(int paramInt) {
    byte b = 0;
    boolean bool1 = false;
    paramInt = (paramInt > 1000) ? 1000 : paramInt;
    boolean bool2 = false;
    int i = -1;
    Iterator<F> iterator = this.A.iterator();
    while (iterator.hasNext()) {
      F f1 = iterator.next();
      f1.n(false);
      byte[] arrayOfByte = null;
      this.E = false;
      boolean bool = false;
      if (b) {
        try {
          if (((F)this.A.get(0)).D() != null) {
            cR cR = ((F)this.A.get(0)).D();
            cV cV = ((F)this.A.get(0)).C();
            f1.a(cR);
            f1.a(cV);
            if (cV != null)
              ((F)this.A.get(0)).d(true); 
          } 
          boolean bool3 = false;
          if (cP.a().b() != null)
            try {
              if (i > 1) {
                c.a().a(f1, i);
                cP.a().b().a(this.ak, f1, f1.x());
              } else {
                bool3 = true;
              } 
            } catch (l l) {
              bool3 = true;
              if (I())
                D.c("CommException during ProtocolInitialization of " + f1.u() + ": " + l.getLocalizedMessage()); 
            } catch (b b1) {
              bool3 = true;
              if (I())
                D.c("CommTimeoutException during ProtocolInitialization of " + f1.u() + ": " + b1.getLocalizedMessage()); 
            }  
          if (bool3) {
            if (((F)this.A.get(0)).G(0) < f1.G(0))
              f1.I(((F)this.A.get(0)).G(0)); 
            if (((F)this.A.get(0)).ay() < f1.ay())
              f1.H(((F)this.A.get(0)).ay()); 
          } 
          try {
            arrayOfByte = b(f1.p().d(), paramInt);
          } catch (d d) {}
          if (arrayOfByte == null) {
            f("Failed to communicate with Device :" + f1.u() + ", \ndisabling so other controllers can go online.\nSetttings Changes Made to this controller during this session will not be sent\nas there is no communication with the controller.");
            f1.n(true);
            D.d("temporarily disabled CAN Device, signature is null.");
          } 
        } catch (Exception exception) {
          f("Failed to communicate with Device :" + f1.u() + ", \ndisabling so other controllers can go online.\nSetttings Changes Made to this controller during this session will not be sent\nas there is no communication with the controller.");
          D.d("temporarily disabled CAN Device, error trying to get signature.");
          f1.n(true);
        } 
      } else {
        g(f1);
        boolean bool3 = f1.G();
        f1.d(false);
        try {
          if (cP.a().b() != null) {
            cP.a().b().a();
            try {
              i = cP.a().b().a(this.ak);
              if (i > 0)
                this.E = true; 
              if (i > 1) {
                c.a().a(f1, i);
                cP.a().b().a(this.ak, f1, f1.x());
              } 
              f1.d(bool3);
            } catch (l l) {
              if (I())
                D.c("CommException during ProtocolInitialization: " + l.getLocalizedMessage()); 
            } catch (b b1) {
              if (I())
                D.c("CommTimeoutException during ProtocolInitialization: " + b1.getLocalizedMessage()); 
            } 
          } 
          try {
            arrayOfByte = b(f1.p().d(), paramInt);
            if (arrayOfByte != null && arrayOfByte.length > 0) {
              byte[] arrayOfByte1 = new byte[arrayOfByte.length];
              System.arraycopy(arrayOfByte, 0, arrayOfByte1, 0, arrayOfByte1.length);
              arrayOfByte = arrayOfByte1;
            } 
            bool2 = true;
            f1.d(bool3);
          } catch (d d) {
            throw new b("Protocol Error communicating with main controller: " + d.getLocalizedMessage());
          } 
          if (cP.a().b() != null && !this.E)
            try {
              int j = cP.a().b().a(this.ak);
              if (j > 0)
                this.E = true; 
              if (j > 1)
                cP.a().b().a(this.ak, f1, f1.x()); 
            } catch (l l) {
              if (I())
                D.c("CommException during ProtocolInitialization: " + l.getLocalizedMessage()); 
            } catch (b b1) {
              if (I())
                D.c("CommTimeoutException during ProtocolInitialization: " + b1.getLocalizedMessage()); 
            }  
        } finally {
          f1.d(bool3);
        } 
      } 
      if (!B())
        throw new cn("GoOnlineApprover rejected."); 
      if (bool)
        D.d("Device Removed, no further interrogation."); 
      if (!bool1 && b(arrayOfByte)) {
        D.d("Sig Bytes:" + c.d(arrayOfByte));
        String str = null;
        if (arrayOfByte.length == 1 && arrayOfByte[0] == 20)
          arrayOfByte = (arrayOfByte[0] + "").getBytes(); 
        if (f1.q() != null && e().q().d() != null) {
          try {
            try {
              byte[] arrayOfByte1 = b(f1.q().d(), paramInt);
              if (arrayOfByte1 != null && arrayOfByte1.length == 2) {
                int j = c.a(arrayOfByte1[0]);
                int k = c.a(arrayOfByte1[1]);
                str = X.a("" + Integer.toHexString(k), '0', 2) + X.a("" + Integer.toHexString(j), '0', 2);
                str = str.toUpperCase();
              } else {
                str = new String(arrayOfByte1);
                str = X.k(str);
                str = X.h(str);
              } 
            } catch (d d) {
              Logger.getLogger(J.class.getName()).log(Level.SEVERE, (String)null, (Throwable)d);
            } 
          } catch (b b1) {
            if (I())
              D.c("CommTimeoutException during versionInfo: " + b1.getLocalizedMessage()); 
            if (arrayOfByte != null && arrayOfByte.length > 0) {
              str = "Serial Signature: " + new String(arrayOfByte);
            } else {
              str = "Timeout";
            } 
          } 
        } else {
          str = "Bowling & Grippo MS1 Base Code " + arrayOfByte;
        } 
        f1.m(str);
        e().E(e().aw());
        a(true);
        this.F = true;
        u();
        bT bT = bT.b(arrayOfByte);
        bT.b(str);
        D.d("Communicating with sig:" + bT.b() + ", " + bT.c());
        if (!bool1)
          if (a(f1.u(), str, bT)) {
            this.E = true;
            cR cR = e().D();
            if (cR != null)
              cR.d().a(); 
            c(f1);
          } else {
            this.E = false;
            break;
          }  
        a(false);
      } else if (arrayOfByte != null && c.c(f1.p().d(), arrayOfByte)) {
        bool2 = false;
      } else {
        bool2 = false;
        if (arrayOfByte != null && arrayOfByte.length > 0) {
          if (arrayOfByte.length > 1) {
            D.b("Unsupported Controller Firmware: " + new String(arrayOfByte));
            b(f1.u(), "Invalid data received from controller.");
          } 
          if (b) {
            f("Failed to communicate with Device :" + f1.u() + ", \ndisabling so we can go online.\nSetttings Changes Made to this controller during this session will not be sent\nas there is no communication with the controller.");
            iterator.remove();
          } else {
            return false;
          } 
        } else {
          return false;
        } 
      } 
      b++;
    } 
    return true;
  }
  
  protected boolean c(F paramF) {
    if (paramF.Q() != null && paramF.U() && p() && !paramF.W() && paramF.S() != null) {
      m m = m.d(paramF);
      try {
        c(m);
        int i = (int)paramF.S().a();
        a(i);
        paramF.i(true);
        D.d("Activated Turbo Baud: " + i);
        return true;
      } catch (l l) {
        Logger.getLogger(J.class.getName()).log(Level.SEVERE, (String)null, l);
        return false;
      } 
    } 
    if (!paramF.U() && p() && paramF.W() && !paramF.T()) {
      d(paramF);
      return false;
    } 
    return false;
  }
  
  protected void d(F paramF) {
    if (paramF.R() != null && p() && paramF.W()) {
      m m = m.e(paramF);
      try {
        c(m);
        D.d("Deactivated Full Time Turbo Baud");
      } catch (l l) {
        Logger.getLogger(J.class.getName()).log(Level.SEVERE, (String)null, l);
      } 
      int i = paramF.r();
      a(i);
      D.d("Deactivated Turbo Baud, returned to: " + i);
      paramF.i(false);
    } 
  }
  
  private void g(F paramF) {
    if (p() && paramF.S() != null)
      if (!paramF.U() || this.aj++ % 2 == 0) {
        int i = paramF.r();
        a(i);
        paramF.i(false);
        if (I())
          D.d("Trying normal baud: " + i); 
      } else {
        int i = (int)paramF.S().a();
        a(i);
        paramF.i(true);
        if (I())
          D.d("Trying Turbo Baud: " + i); 
      }  
  }
  
  protected void m(String paramString) {
    if (this.D > 0 && this.C.size() > this.D)
      this.C.remove(0); 
    this.C.add(paramString);
  }
  
  protected void G() {
    if (this.D <= 0 || I())
      return; 
    D.d("------------------   Begin Historical Commands ---------------------------");
    Iterator<String> iterator = this.C.iterator();
    while (iterator.hasNext()) {
      String str = iterator.next();
      System.out.println(str);
      iterator.remove();
    } 
    D.d("-------------------   End Historical Commands ----------------------------");
  }
  
  protected void a(String paramString, int[] paramArrayOfint) {
    if (this.D > 0 || I()) {
      O o = new O(this);
      o.a(paramString);
      O.a(o, paramArrayOfint);
      T.a(o);
    } 
  }
  
  private String a() {
    long l = System.nanoTime() - this.U;
    int i = (int)(l % 1000000000L / 1000000L);
    int j = (int)(l % 60000000000L / 1000000000L);
    int k = (int)(l % 60000000000000L / 60000000000L);
    return k + ":" + X.a(j + "", '0', 2) + "." + X.a(i + "", '0', 3);
  }
  
  public boolean b(byte[] paramArrayOfbyte) {
    if (paramArrayOfbyte != null) {
      bT bT = bT.b(paramArrayOfbyte);
      if (X.a().a(bT))
        return true; 
    } 
    return false;
  }
  
  public boolean H() {
    if (this.B.size() > 0) {
      L l = new L(this);
      if (!this.I) {
        boolean bool = O;
        for (bO bO : this.B) {
          if (A.i().c() != bO.a(l)) {
            D.b("Firmware Validation failed, trying once more.");
            if (A.i().c() != bO.a(l)) {
              if (bO.b()) {
                c();
                D.a("Validation failed. Can not connect.");
              } else {
                D.a("Validation failed. Will try again when connected.");
              } 
              O = bool;
              return false;
            } 
          } 
        } 
        O = bool;
      } 
      return true;
    } 
    return true;
  }
  
  public static boolean I() {
    return O;
  }
  
  public static void e(boolean paramBoolean) {
    O = paramBoolean;
  }
  
  public boolean n(String paramString) {
    return ((F)this.A.get(0)).u().equals(paramString);
  }
  
  public void a(bO parambO) {
    this.B.add(parambO);
  }
  
  public void J() {
    this.B.clear();
  }
  
  public boolean K() {
    return this.c;
  }
  
  public void f(boolean paramBoolean) {
    this.c = paramBoolean;
  }
  
  protected String L() {
    return this.f;
  }
  
  protected void o(String paramString) {
    this.f = paramString;
  }
  
  public void e(int paramInt) {
    this.D = paramInt;
  }
  
  public long M() {
    return this.e;
  }
  
  public synchronized void d(long paramLong) {
    this.e = paramLong;
    D.c("Ignore runtime reads for: " + (paramLong - System.currentTimeMillis()));
    if (paramLong < System.currentTimeMillis())
      notify(); 
  }
  
  public boolean N() {
    return this.d;
  }
  
  public void g(boolean paramBoolean) {
    this.d = paramBoolean;
  }
  
  private void u(m paramm) {
    o o = new o();
    byte[] arrayOfByte = c.a(paramm.p());
    int i = (paramm.b() >= 0) ? paramm.b() : e().i();
    try {
      String str = a(arrayOfByte, i);
      o.a(1);
      o.a(str);
    } catch (b b) {
      o.a(3);
      o.a("Timeout");
    } catch (Exception exception) {
      throw new l("Error Reading String \nReported Error: " + exception.getMessage());
    } 
    paramm.b(o);
  }
  
  protected abstract boolean p();
  
  protected abstract boolean a(int paramInt);
  
  public abstract boolean a(Thread paramThread);
  
  public boolean e(F paramF) {
    return this.A.contains(paramF);
  }
  
  public boolean O() {
    return this.G;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/J.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */