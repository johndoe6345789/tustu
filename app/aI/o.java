package aI;

import G.R;
import G.S;
import G.T;
import G.cq;
import G.cu;
import G.dc;
import G.m;
import V.a;
import bH.D;
import com.efiAnalytics.remotefileaccess.RemoteAccessException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class o implements S, cq {
  R a = null;
  
  dc b = new dc();
  
  private boolean p = true;
  
  private boolean q = false;
  
  boolean c = false;
  
  List d = Collections.synchronizedList(new ArrayList());
  
  int e = 5000;
  
  long f = Long.MAX_VALUE;
  
  int g = 20;
  
  long h = System.currentTimeMillis();
  
  long i = System.currentTimeMillis();
  
  int j = 10;
  
  int k = 1500;
  
  long l = System.currentTimeMillis();
  
  boolean m = false;
  
  private static Map r = new HashMap<>();
  
  long n = 0L;
  
  boolean o = false;
  
  private o(R paramR) {
    this.a = paramR;
    e();
  }
  
  public static o d(R paramR) {
    if (r.get(paramR.c()) == null) {
      o o1 = new o(paramR);
      r.put(paramR.c(), o1);
    } 
    return (o)r.get(paramR.c());
  }
  
  private void e() {
    try {
      cu.a().a(this.a.c(), d.a, this);
      T.a().a(this);
    } catch (a a) {
      Logger.getLogger(l.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a);
    } 
  }
  
  public synchronized G.o a(m paramm, boolean paramBoolean, int paramInt) {
    long l = System.currentTimeMillis();
    if (this.m)
      a("Instruction Entering " + paramm.aL()); 
    while (this.i > System.currentTimeMillis()) {
      if (System.currentTimeMillis() - l > this.e)
        throw new RemoteAccessException("Timeout waiting for SD to become Ready while executing " + paramm.aL()); 
      try {
        Thread.sleep(40L);
        if (this.m)
          a("under processing hysteresis, sleeping."); 
      } catch (InterruptedException interruptedException) {
        Logger.getLogger(o.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
      } 
    } 
    if (this.m)
      a("Instruction Released for Processing. " + paramm.aL() + ", triggerNotReady=" + paramBoolean); 
    if (paramBoolean) {
      this.c = true;
      try {
        a(false);
        if (this.m)
          a("Instruction About to process. " + paramm.aL()); 
        this.i = System.currentTimeMillis() + this.j;
        return this.b.a(this.a, paramm, paramInt);
      } finally {
        this.p = false;
        this.c = false;
        if (this.m)
          a("Instruction Completed. " + paramm.aL()); 
        this.i = System.currentTimeMillis() + this.j;
      } 
    } 
    try {
      if (this.m)
        a("Instruction About to process " + paramm.aL() + ", triggerNotReady=" + paramBoolean); 
      return this.b.a(this.a, paramm, paramInt);
    } finally {
      if (this.m)
        a("Instruction Completed " + paramm.aL() + ", triggerNotReady=" + paramBoolean); 
    } 
  }
  
  public void a() {
    this.p = false;
    this.c = false;
    a(false);
    this.i = System.currentTimeMillis() + this.j;
  }
  
  public void setCurrentOutputChannelValue(String paramString, double paramDouble) {
    boolean bool = (((int)paramDouble & d.c) == d.c);
    if (this.a.C() instanceof bQ.l)
      if (bool ^ this.o) {
        this.n = System.currentTimeMillis() + 50L;
        this.o = bool;
        bool = this.p;
      } else if (this.n < System.currentTimeMillis()) {
        this.o = bool;
        bool = this.p;
      } else {
        this.o = bool;
      }  
    if (!this.c && !this.p && bool) {
      if (this.m)
        a("SD Status Changed to Ready. Will notify after hysterisis: " + this.j); 
      this.p = true;
      this.f = System.currentTimeMillis() + this.g;
      this.i = System.currentTimeMillis() + this.j;
    } else if (this.p && !bool) {
      if (this.m)
        a("SD Status Changed to Not Ready."); 
      this.p = false;
      a(this.p);
      this.f = Long.MAX_VALUE;
    } 
    boolean bool1 = (((int)paramDouble & d.d) == d.d) ? true : false;
    if (!this.c && this.q && !bool1) {
      if (this.m)
        a("SD Status Changed to Not Logging. Will notify after hysterisis"); 
      this.q = false;
      this.h = System.currentTimeMillis() + this.k;
    } else if (!this.q && bool1) {
      if (this.m)
        a("Told, SD Status Changed to Logging. "); 
      this.q = true;
      b(this.q);
      this.h = Long.MAX_VALUE;
    } 
    if (this.p && this.f < System.currentTimeMillis()) {
      a(this.p);
      this.f = Long.MAX_VALUE;
    } 
    if (!this.q && this.h < System.currentTimeMillis()) {
      if (this.m)
        a("publishing logging status: " + System.currentTimeMillis()); 
      b(this.q);
      this.h = Long.MAX_VALUE;
    } 
  }
  
  private void a(String paramString) {
    D.c(((float)(System.currentTimeMillis() - this.l) / 1000.0F) + "s. :" + paramString);
  }
  
  public void a(q paramq) {
    this.d.add(paramq);
    paramq.a(this.p);
    paramq.b(this.q);
  }
  
  public void b(q paramq) {
    this.d.remove(paramq);
  }
  
  protected void a(boolean paramBoolean) {
    if (paramBoolean) {
      a("Notifying SD Ready.");
    } else {
      a("Notifying SD Not Ready.");
    } 
    Iterator<q> iterator = this.d.iterator();
    while (iterator.hasNext())
      ((q)iterator.next()).a(paramBoolean); 
  }
  
  public void a(R paramR) {}
  
  public void b(R paramR) {
    if (paramR.equals(this.a)) {
      cu.a().a(this);
      r.remove(paramR.c());
    } 
  }
  
  public void c(R paramR) {}
  
  protected void a(int paramInt) {
    this.a.C().d(System.currentTimeMillis() + paramInt);
  }
  
  protected void b() {
    this.a.C().d(0L);
  }
  
  private void b(boolean paramBoolean) {
    if (paramBoolean) {
      a("Notifying SD Logging On.");
    } else {
      a("Notifying SD Logging Off.");
    } 
    Iterator<q> iterator = this.d.iterator();
    while (iterator.hasNext())
      ((q)iterator.next()).b(paramBoolean); 
  }
  
  public boolean c() {
    return this.p;
  }
  
  public boolean d() {
    return this.q;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aI/o.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */