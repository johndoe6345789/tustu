package G;

import V.ExceptionPrintstacktrace;
import bH.D;
import bH.X;
import bH.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TuneDataSnapshot extends Q {
  List a = Collections.synchronizedList(new ArrayList());
  
  List b = Collections.synchronizedList(new ArrayList());
  
  List c = Collections.synchronizedList(new ArrayList());
  
  ArrayList d = new ArrayList();
  
  int e = -1;
  
  boolean f = false;
  
  aa ExceptionPrintstacktrace = null;
  
  private R k = null;
  
  boolean h = true;
  
  private boolean l = false;
  
  int[][] i = null;
  
  private long m = 21L;
  
  public static int j = Integer.MIN_VALUE;
  
  private boolean n = false;
  
  private Y() {}
  
  public Y(R paramR) {
    this.k = paramR;
    a(paramR.O());
  }
  
  public Y(R paramR, int[][] paramArrayOfint) {
    this.k = paramR;
    this.i = paramArrayOfint;
  }
  
  public Y a() {
    Y y = new Y();
    if (this.k != null && this.k.O() != null) {
      y.a(this.k.O());
    } else {
      y.i = new int[this.i.length][(this.i[0]).length];
    } 
    for (byte b = 0; b < y.i.length; b++) {
      for (byte b1 = 0; b1 < (y.i[b]).length; b1++)
        y.i[b][b1] = this.i[b][b1]; 
    } 
    y.h = this.h;
    return y;
  }
  
  public boolean b() {
    return this.h;
  }
  
  private void n() {
    if (this.e < this.c.size() - 1) {
      for (int i = this.c.size() - 1; i > this.e; i--)
        this.c.remove(i); 
      d(false);
    } 
  }
  
  public void c() {
    long l = System.currentTimeMillis();
    if (this.e > 0)
      l = ((aa)this.c.get(this.e - 1)).f() - this.m; 
    this.f = true;
    while (this.e > 0) {
      this.e--;
      this.ExceptionPrintstacktrace = this.c.get(this.e);
      if (this.ExceptionPrintstacktrace.f() < l) {
        this.e++;
        break;
      } 
      if (this.e == this.c.size() - 1) {
        aa aa1 = b(this.ExceptionPrintstacktrace.a(), this.ExceptionPrintstacktrace.b(), (this.ExceptionPrintstacktrace.c()).length);
        this.c.set(this.e, aa1);
      } else {
        aa aa1 = b(this.ExceptionPrintstacktrace.a(), this.ExceptionPrintstacktrace.b(), (this.ExceptionPrintstacktrace.c()).length);
        this.c.set(this.e, aa1);
      } 
      a(this.ExceptionPrintstacktrace.a(), this.ExceptionPrintstacktrace.b(), this.ExceptionPrintstacktrace.c(), false);
      if (this.e == this.c.size() - 1)
        d(true); 
      l = this.ExceptionPrintstacktrace.f() - this.m;
    } 
    this.f = false;
    if (this.e == 0)
      c(false); 
    if (this.e == this.c.size() - 2)
      d(true); 
  }
  
  public void d() {
    long l = 0L;
    if (this.e < this.c.size());
    while (this.e < this.c.size()) {
      this.ExceptionPrintstacktrace = this.c.get(this.e);
      if (l - this.ExceptionPrintstacktrace.f() > this.m)
        break; 
      aa aa1 = b(this.ExceptionPrintstacktrace.a(), this.ExceptionPrintstacktrace.b(), (this.ExceptionPrintstacktrace.c()).length);
      aa1.a(this.ExceptionPrintstacktrace.f());
      this.c.set(this.e, aa1);
      a(this.ExceptionPrintstacktrace.a(), this.ExceptionPrintstacktrace.b(), this.ExceptionPrintstacktrace.c(), false);
      l = this.ExceptionPrintstacktrace.f();
      this.e++;
    } 
    if (this.e == this.c.size())
      d(false); 
    if (this.e >= 1)
      c(true); 
  }
  
  public void a(int paramInt1, int paramInt2, int[] paramArrayOfint) {
    a(paramInt1, paramInt2, paramArrayOfint, false, false);
  }
  
  public synchronized void a(int paramInt1, int paramInt2, int[] paramArrayOfint, boolean paramBoolean1, boolean paramBoolean2) {
    aa aa1 = b(paramInt1, paramInt2, paramArrayOfint.length);
    if (aa1.equals(this.ExceptionPrintstacktrace) && c.c(aa1.c(), paramArrayOfint) && !paramBoolean1)
      return; 
    if (a(paramInt1, paramInt2, paramArrayOfint, paramBoolean1) && paramBoolean2) {
      n();
      a(aa1);
    } 
  }
  
  private void a(aa paramaa) {
    if (!this.f) {
      this.c.add(paramaa);
      this.e = this.c.size();
      c(true);
    } 
  }
  
  public synchronized boolean b(int paramInt1, int paramInt2, int[] paramArrayOfint) {
    boolean bool = false;
    try {
      for (byte b = 0; b < paramArrayOfint.length; b++) {
        if (this.i[paramInt1][paramInt2 + b] != paramArrayOfint[b]) {
          this.i[paramInt1][paramInt2 + b] = paramArrayOfint[b];
          this.l = true;
          bool = true;
        } 
      } 
    } catch (Exception exception) {
      throw new ExceptionPrintstacktrace("Unable to set bytes \npage:" + paramInt1 + ", offset:" + paramInt2 + ", bytes:\n" + paramArrayOfint + "\n" + exception.getMessage(), exception);
    } 
    return bool;
  }
  
  protected synchronized boolean a(int paramInt1, int paramInt2, int[] paramArrayOfint, boolean paramBoolean) {
    byte b1 = -1;
    byte b2 = -1;
    try {
      for (byte b = 0; b < paramArrayOfint.length; b++) {
        if (this.i[paramInt1][paramInt2 + b] != paramArrayOfint[b]) {
          if (this.n)
            throw new ExceptionPrintstacktrace("Attempt to update readonly ECU Data."); 
          this.i[paramInt1][paramInt2 + b] = paramArrayOfint[b];
          this.l = true;
          if (b1 == -1)
            b1 = b; 
          b2 = b;
        } 
      } 
    } catch (Exception exception) {
      throw new ExceptionPrintstacktrace("Unable to set bytes \npage:" + paramInt1 + ", offset:" + paramInt2 + ", bytes:\n" + c.a(paramArrayOfint, 8) + "\n" + exception.getMessage(), exception);
    } 
    if (paramBoolean || b1 != -1)
      if (b2 < 0) {
        if (paramBoolean) {
          c(paramInt1, paramInt2, paramArrayOfint);
        } else {
          int[] arrayOfInt = new int[1];
          System.arraycopy(paramArrayOfint, 0, arrayOfInt, 0, arrayOfInt.length);
          c(paramInt1, paramInt2, arrayOfInt);
        } 
      } else if (b2 - b1 < paramArrayOfint.length - 1) {
        int[] arrayOfInt = new int[b2 - b1 + 1];
        System.arraycopy(paramArrayOfint, b1, arrayOfInt, 0, arrayOfInt.length);
        c(paramInt1, paramInt2 + b1, arrayOfInt);
      } else {
        c(paramInt1, paramInt2, paramArrayOfint);
      }  
    return (b1 != -1);
  }
  
  public void a(boolean paramBoolean) {
    this.h = paramBoolean;
  }
  
  public void a(F paramF) {
    a(paramF.ExceptionPrintstacktrace());
    int[] arrayOfInt = paramF.l();
    for (byte b = 0; b < arrayOfInt.length; b++)
      a(b, arrayOfInt[b]); 
    f();
  }
  
  public int e() {
    return this.i.length;
  }
  
  public void a(int paramInt) {
    this.i = new int[paramInt][1];
  }
  
  public void a(int paramInt1, int paramInt2) {
    this.i[paramInt1] = new int[paramInt2];
  }
  
  public void f() {
    for (byte b = 0; b < this.i.length; b++) {
      for (byte b1 = 0; b1 < (this.i[b]).length; b1++)
        this.i[b][b1] = j; 
    } 
  }
  
  public int[] b(int paramInt) {
    return this.i[paramInt];
  }
  
  public int c(int paramInt) {
    return (this.i[paramInt]).length;
  }
  
  public int[] a(int paramInt1, int paramInt2, int paramInt3) {
    int[] arrayOfInt = new int[paramInt3];
    for (byte b = 0; b < arrayOfInt.length; b++) {
      if (paramInt2 + b >= (this.i[paramInt1]).length)
        byte b1 = 2; 
      arrayOfInt[b] = this.i[paramInt1][paramInt2 + b];
    } 
    return arrayOfInt;
  }
  
  public int b(int paramInt1, int paramInt2) {
    return this.i[paramInt1][paramInt2];
  }
  
  public String toString() {
    if (this.i == null)
      return "EcuData not initialized"; 
    String str = "";
    for (byte b = 0; b < this.i.length; b++) {
      str = str + "page:" + b;
      for (byte b1 = 0; b1 < (this.i[0]).length; b1++) {
        if (b1 % 16 == 0)
          str = str + "\n"; 
        str = str + "x" + X.a("" + Integer.toString(this.i[b][b1], 16), '0', 2) + "\t";
      } 
      str = str + "\n";
    } 
    return str;
  }
  
  public void a(ab paramab) {
    if (!this.a.contains(paramab))
      this.a.add(paramab); 
  }
  
  public void b(ab paramab) {
    this.a.remove(paramab);
  }
  
  protected void c(int paramInt1, int paramInt2, int[] paramArrayOfint) {
    synchronized (this.a) {
      for (ab ab : this.a) {
        try {
          ab.a(this.k.c(), paramInt1, paramInt2, paramArrayOfint);
        } catch (Exception exception) {
          D.c("EcuData::notifyDataUpdated - Error notifying: " + ab);
          exception.printStackTrace();
        } 
      } 
    } 
  }
  
  public void a(di paramdi) {
    this.b.add(paramdi);
  }
  
  public void b(di paramdi) {
    this.b.remove(paramdi);
  }
  
  private void c(boolean paramBoolean) {
    for (di di : this.b) {
      try {
        di.a(paramBoolean);
      } catch (Exception exception) {
        D.c("EcuData::notifyUndoAvailable - Error notifying: " + di);
        exception.printStackTrace();
      } 
    } 
  }
  
  private void d(boolean paramBoolean) {
    for (di di : this.b) {
      try {
        di.b(paramBoolean);
      } catch (Exception exception) {
        D.c("EcuData::notifyUndoAvailable - Error notifying: " + di);
        exception.printStackTrace();
      } 
    } 
  }
  
  public boolean aO() {
    return this.l;
  }
  
  public void ExceptionPrintstacktrace() {
    this.l = false;
    this.c.clear();
    this.e = -1;
    c(false);
    d(false);
  }
  
  public boolean h() {
    if (this.i == null)
      return true; 
    for (byte b = 0; b < this.i.length; b++) {
      for (byte b1 = 0; b1 < (this.i[b]).length; b1++) {
        if (this.i[b][b1] > 0)
          return false; 
      } 
    } 
    return true;
  }
  
  public String i() {
    return (this.k == null) ? null : this.k.c();
  }
  
  private aa b(int paramInt1, int paramInt2, int paramInt3) {
    aa aa1 = new aa(this, null);
    aa1.a(paramInt1);
    aa1.b(paramInt2);
    int[] arrayOfInt = new int[paramInt3];
    for (int i = paramInt2; i < paramInt2 + paramInt3; i++)
      arrayOfInt[i - paramInt2] = this.i[paramInt1][i]; 
    aa1.a(arrayOfInt);
    return aa1;
  }
  
  public void a(bd parambd) {
    if (!this.d.contains(parambd))
      this.d.add(parambd); 
  }
  
  public boolean j() {
    return this.n;
  }
  
  public void b(boolean paramBoolean) {
    this.n = paramBoolean;
  }
  
  public int k() {
    int i = 0;
    for (byte b = 0; b < this.i.length; b++)
      i += (this.i[b]).length; 
    return i;
  }
  
  public int l() {
    byte b1 = 0;
    for (byte b2 = 0; b2 < this.i.length; b2++) {
      for (byte b = 0; b < (this.i[b2]).length; b++) {
        if (this.i[b2][b] == j)
          b1++; 
      } 
    } 
    return b1;
  }
  
  public void m() {
    if (this.c.size() > 0) {
      this.c.clear();
      c(false);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/Y.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */