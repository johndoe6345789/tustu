package aI;

import C.a;
import C.b;
import G.R;
import G.GInterfaceDh;
import G.m;
import G.o;
import V.ExceptionPrintstacktrace;
import bH.M;
import bH.c;
import com.efiAnalytics.remotefileaccess.RemoteAccessException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AiInterfacePapa implements q {
  R a = null;
  
  boolean b = false;
  
  boolean c = true;
  
  int d = 500;
  
  o e = null;
  
  public AiInterfacePapa(R paramR) {
    this.a = paramR;
    h();
  }
  
  private void h() {
    this.e = o.d(this.a);
    this.e.a(this);
  }
  
  public void a() {
    this.e.b(this);
  }
  
  public void b() {
    i();
    try {
      m m = d.a(this.a.O(), 3);
      m.v("SD Start Logging");
      o o1 = this.e.a(m, false, this.d);
      if (o1.a() == 3)
        throw new w(o1.c()); 
    } catch (RemoteAccessException remoteAccessException) {
      throw new w(remoteAccessException.getMessage());
    } catch (x x) {
      Logger.getLogger(p.class.getName()).log(Level.SEVERE, (String)null, x);
    } 
  }
  
  public void c() {
    if (!this.a.R())
      throw new w(a("Not currently connected to an MS3.")); 
    if (!this.c)
      throw new w(a("MS3 is not currently capturing an SD Log, can not stop.")); 
    try {
      m m = d.a(this.a.O(), 2);
      m.v("SD Stop Logging");
      o o1 = this.e.a(m, true, this.d);
      if (o1.a() == 3)
        throw new w(o1.c()); 
    } catch (RemoteAccessException remoteAccessException) {
      throw new w(remoteAccessException.getMessage());
    } catch (x x) {
      Logger.getLogger(p.class.getName()).log(Level.SEVERE, (String)null, x);
    } 
  }
  
  public void d() {
    i();
    try {
      m m = d.a(this.a.O(), 0);
      m.v("SD Reset Return to Normal");
      o o1 = this.e.a(m, true, this.d);
      if (o1.a() == 3)
        throw new w(o1.c()); 
    } catch (RemoteAccessException remoteAccessException) {
      throw new w(remoteAccessException.getMessage());
    } catch (x x) {
      Logger.getLogger(p.class.getName()).log(Level.SEVERE, (String)null, x);
    } 
  }
  
  public void e() {
    i();
    try {
      m m = d.a(this.a.O(), 5);
      m.v("SD Read Start Logging");
      o o1 = this.e.a(m, true, this.d);
      if (o1.a() == 3)
        throw new w(o1.c()); 
    } catch (RemoteAccessException remoteAccessException) {
      throw new w(remoteAccessException.getMessage());
    } catch (x x) {
      Logger.getLogger(p.class.getName()).log(Level.SEVERE, (String)null, x);
    } 
  }
  
  public void f() {
    i();
    try {
      m m = d.a(this.a.O(), 1);
      m.v("SD Reset & wait");
      o o1 = this.e.a(m, true, this.d);
      if (o1.a() == 3)
        throw new w(o1.c()); 
    } catch (RemoteAccessException remoteAccessException) {
      throw new w(remoteAccessException.getMessage());
    } catch (x x) {
      Logger.getLogger(p.class.getName()).log(Level.SEVERE, (String)null, x);
    } 
  }
  
  public void a(Date paramDate) {
    ArrayList<m> arrayList = new ArrayList();
    m m1 = d.f(this.a.O());
    arrayList.add(m1);
    m m2 = d.a(this.a.O(), paramDate);
    arrayList.add(m2);
    m m3 = m.a(this.a.O(), arrayList);
    m3.v("RTC Set Command ");
    o o1 = this.e.a(m3, false, 1500);
    if (o1.a() == 3)
      throw new RemoteAccessException(o1.c()); 
  }
  
  public Date ExceptionPrintstacktrace() {
    m m = d.e(this.a.O());
    o o1 = this.e.a(m, false, 2000);
    if (o1.a() == 3)
      throw new RemoteAccessException(o1.c()); 
    if (o1.a() == 2 && o1.e() == null)
      throw new RemoteAccessException(o1.c()); 
    int[] arrayOfInt = o1.e();
    Calendar calendar = Calendar.getInstance();
    int i = c.b(arrayOfInt, 6, 2, true, false);
    calendar.set(1, i);
    int j = c.b(arrayOfInt, 5, 1, true, false);
    calendar.set(2, j - 1);
    int k = c.b(arrayOfInt, 4, 1, true, false);
    calendar.set(5, k);
    int n = c.b(arrayOfInt, 2, 1, true, false);
    calendar.set(11, n);
    int i1 = c.b(arrayOfInt, 1, 1, true, false);
    calendar.set(12, i1);
    int i2 = c.b(arrayOfInt, 0, 1, true, false);
    calendar.set(13, i2);
    return calendar.getTime();
  }
  
  public void a(u paramu, M paramM) {
    n n = new n(this.a);
    try {
      n.a(paramu, paramM);
    } finally {
      try {
        if (this.a.O().T())
          GInterfaceDh.b(this.a); 
      } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
        Logger.getLogger(p.class.getName()).log(Level.WARNING, "Failed to stop turbo baud.", (Throwable)ExceptionPrintstacktrace);
      } 
    } 
  }
  
  private void i() {
    if (!this.a.R())
      throw new w(a("Not currently connected to an MS3.")); 
  }
  
  private String a(String paramString) {
    a a = a.a();
    try {
      return a.a("", paramString);
    } catch (b b) {
      Logger.getLogger(p.class.getName()).log(Level.SEVERE, (String)null, (Throwable)b);
      return paramString;
    } 
  }
  
  public void a(q paramq) {
    this.e.a(paramq);
  }
  
  public void b(q paramq) {
    this.e.b(paramq);
  }
  
  public void a(boolean paramBoolean) {
    this.b = paramBoolean;
  }
  
  public void b(boolean paramBoolean) {
    this.c = paramBoolean;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aI/p.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */