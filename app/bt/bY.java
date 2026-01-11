package bt;

import G.R;
import G.aJ;
import G.aM;
import G.bA;
import G.bM;
import G.be;
import G.bq;
import G.bv;
import V.a;
import bH.D;
import bH.X;
import com.efiAnalytics.ui.am;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.fh;
import com.efiAnalytics.ui.s;
import java.util.ArrayList;
import n.h;
import s.g;

public class bY implements am {
  R a;
  
  be b;
  
  s c;
  
  aM d = null;
  
  aM e = null;
  
  aM f;
  
  aM g;
  
  aM h;
  
  public static int i = 1;
  
  public static int j = 2;
  
  public static int k = -1;
  
  int l = k;
  
  public bY(R paramR, be parambe, s params) {
    this.a = paramR;
    this.b = parambe;
    this.c = params;
    this.g = paramR.c(parambe.b());
    this.f = paramR.c(parambe.a());
    this.h = paramR.c(parambe.c());
    String[] arrayOfString1 = this.f.Q();
    if (arrayOfString1 == null) {
      D.b("Table xSize Parameter name null, not resizable");
    } else if (arrayOfString1.length != 1) {
      D.b("Table xSize Parameter name not 1 in length, considered not fully resizable");
    } else {
      this.e = paramR.c(arrayOfString1[0]);
      if (this.e == null)
        D.b("X Size Parameter not found in current configuration, resizing disabled."); 
    } 
    String[] arrayOfString2 = this.g.Q();
    if (arrayOfString2 == null) {
      D.b("Table ySize Parameter name null, not resizable");
    } else if (arrayOfString2.length != 1) {
      D.b("Table ySize Parameter name not 1 in length, considered not fully resizable");
    } else {
      this.d = paramR.c(arrayOfString2[0]);
      if (this.d == null)
        D.b("Y Size Parameter not found in current configuration, resizing disabled."); 
    } 
  }
  
  public boolean a() {
    return true;
  }
  
  public int b() {
    return (int)((this.d != null) ? Math.round(this.d.s()) : this.g.b());
  }
  
  public int c() {
    return (int)((this.d != null) ? Math.round(this.d.r()) : this.g.b());
  }
  
  public int d() {
    return (int)((this.e != null) ? Math.round(this.e.s()) : this.f.b());
  }
  
  public int e() {
    return (int)((this.e != null) ? Math.round(this.e.r()) : this.f.b());
  }
  
  public int f() {
    int i = g();
    if (i()) {
      int j = (int)Math.sqrt(i);
      return i - j * 2;
    } 
    return i;
  }
  
  private boolean i() {
    if (this.l == k) {
      ArrayList<aM> arrayList = new ArrayList();
      arrayList.add(this.f);
      arrayList.add(this.g);
      arrayList.add(this.h);
      if (this.f.n() && this.g.n() && this.f.d() == this.h.d() && this.g.d() == this.h.d() && aJ.a(this.a, arrayList)) {
        this.l = i + j;
      } else {
        this.l = 0;
      } 
    } 
    return (this.l == i + j);
  }
  
  public int g() {
    int i;
    if (i()) {
      i = Math.min(this.f.g(), this.g.g());
      i = Math.min(this.h.g(), i);
    } else {
      i = this.h.g();
    } 
    int j = aJ.a(this.a, this.h.d(), i);
    if (i())
      j -= this.g.e(); 
    return Math.floorDiv(j, this.h.e());
  }
  
  public boolean a(int paramInt1, int paramInt2) {
    int i;
    boolean bool = i();
    if (bool) {
      i = Math.min(this.f.g(), this.g.g());
      i = Math.min(this.h.g(), i);
    } else {
      i = this.h.g();
    } 
    int j = aJ.a(this.a, this.h.d(), i);
    if (bool) {
      int k = this.f.e() * paramInt2;
      int m = this.g.e() * paramInt1;
      int n = Math.floorDiv(j - k - m, this.h.e());
      return (n <= paramInt1 * paramInt2);
    } 
    return (Math.floorDiv(j, this.h.e()) <= paramInt1 * paramInt2);
  }
  
  private void b(int paramInt1, int paramInt2) {
    if (paramInt1 > b())
      throw new a(g.b("Maximum Rows already reached")); 
    if (paramInt1 < c())
      throw new a(g.b("Minimum rows") + ": " + c()); 
    if (paramInt2 > d())
      throw new a(g.b("Maximum Columns already reached")); 
    if (paramInt2 < e())
      throw new a(g.b("Minimum columns") + ": " + e()); 
    if (paramInt2 * paramInt1 > f())
      throw new a(g.b("Requires more table cells than permitted.")); 
    if (!a(paramInt1, paramInt2))
      throw new a(g.b("Requires more table cells than available contiguous RAM.")); 
  }
  
  public void h() {
    bv bv = new bv();
    bv.s(g.b("Resize Table") + " " + bM.c(this.a, this.b.aL()));
    bq bq = new bq();
    bq.e(" ");
    bv.a((bA)bq);
    bq = new bq();
    bq.b(this.d.aL());
    bq.e(g.b("Number of Rows"));
    bv.a((bA)bq);
    bq = new bq();
    bq.b(this.e.aL());
    bq.e(g.b("Number of Columns"));
    bv.a((bA)bq);
    h.a().a(this.a, bv, bV.c());
  }
  
  public void a(int paramInt) {
    b(this.c.getRowCount() + 1, this.c.getColumnCount());
    try {
      bQ.a().b(false);
      s s1 = fh.b(this.c);
      this.d.l(this.a.h());
      int i = (int)this.d.j(this.a.h());
      int j = (int)this.e.j(this.a.h());
      this.c.a(i, j);
      D.c("Set new Model size: Rows: " + i + ", Cols: " + j);
      int k = s1.getRowCount();
      String[] arrayOfString = new String[i];
      for (byte b = 0; b < i; b++) {
        String str;
        boolean bool = (b <= paramInt) ? b : (b - 1);
        if (b == paramInt) {
          if (b == i - 1) {
            str = s1.a()[k - 1];
          } else if (b == 0) {
            str = s1.a()[0];
          } else {
            str = X.b((Double.parseDouble(s1.a()[b - 1]) + Double.parseDouble(s1.a()[b])) / 2.0D, this.c.J());
          } 
        } else {
          str = s1.a()[bool];
        } 
        arrayOfString[arrayOfString.length - b - 1] = str;
        D.c("set row " + b + " to " + str);
      } 
      this.c.d(arrayOfString);
      D.c("Copy Z vals");
      fh.b(s1, this.c);
      this.a.h().m();
    } catch (Exception exception) {
      exception.printStackTrace();
      throw new a("Error trying to delete Row.\n" + exception.getLocalizedMessage());
    } finally {
      bQ.a().b(true);
    } 
  }
  
  public void b(int paramInt) {
    b(this.c.getRowCount() - 1, this.c.getColumnCount());
    try {
      bQ.a().b(false);
      s s1 = fh.b(this.c);
      this.d.m(this.a.h());
      int i = (int)this.d.j(this.a.h());
      int j = (int)this.e.j(this.a.h());
      this.c.a(i, j);
      D.c("Set new Model size: Rows: " + i + ", Cols: " + j);
      int k = s1.getRowCount();
      String[] arrayOfString = new String[i];
      for (byte b = 0; b < k; b++) {
        if (b != paramInt) {
          byte b1 = (b < paramInt) ? b : (b - 1);
          String str = s1.a()[b];
          arrayOfString[arrayOfString.length - b1 - 1] = str;
          D.c("set row " + b1 + " to " + str);
        } 
      } 
      this.c.d(arrayOfString);
      D.c("Copy Z vals");
      fh.b(s1, this.c);
      this.a.h().m();
    } catch (Exception exception) {
      throw new a("Error trying to delete Row.\n" + exception.getLocalizedMessage());
    } finally {
      bQ.a().b(true);
    } 
  }
  
  public void c(int paramInt) {
    b(this.c.getRowCount(), this.c.getColumnCount() + 1);
    try {
      bQ.a().b(false);
      s s1 = fh.b(this.c);
      this.e.l(this.a.h());
      int i = (int)this.d.j(this.a.h());
      int j = (int)this.e.j(this.a.h());
      this.c.a(i, j);
      D.c("Set new Model size: Rows: " + i + ", Cols: " + j);
      int k = s1.getColumnCount();
      String[] arrayOfString = new String[j];
      for (byte b = 0; b < j; b++) {
        String str;
        boolean bool = (b <= paramInt) ? b : (b - 1);
        if (b == paramInt) {
          if (b == j - 1) {
            str = s1.b()[k - 1];
          } else if (b == 0) {
            str = s1.b()[0];
          } else {
            str = X.b((Double.parseDouble(s1.b()[b - 1]) + Double.parseDouble(s1.b()[b])) / 2.0D, this.c.J());
          } 
        } else {
          str = s1.b()[bool];
        } 
        arrayOfString[b] = str;
        D.c("set col " + b + " to " + str);
      } 
      this.c.c(arrayOfString);
      D.c("Copy Z vals");
      fh.b(s1, this.c);
      this.a.h().m();
    } catch (Exception exception) {
      exception.printStackTrace();
      throw new a("Error trying to delete Column.\n" + exception.getLocalizedMessage());
    } finally {
      bQ.a().b(true);
    } 
  }
  
  public void d(int paramInt) {
    b(this.c.getRowCount(), this.c.getColumnCount() - 1);
    try {
      bQ.a().b(false);
      s s1 = fh.b(this.c);
      this.e.m(this.a.h());
      int i = (int)this.d.j(this.a.h());
      int j = (int)this.e.j(this.a.h());
      this.c.a(i, j);
      D.c("Set new Model size: Rows: " + i + ", Cols: " + j);
      int k = s1.getColumnCount();
      String[] arrayOfString = new String[j];
      for (byte b = 0; b < k; b++) {
        if (b != paramInt) {
          boolean bool = (b < paramInt) ? b : (b - 1);
          String str = s1.b()[b];
          arrayOfString[bool] = str;
          D.c("set col " + bool + " to " + str);
        } 
      } 
      this.c.c(arrayOfString);
      D.c("Copy Z vals");
      fh.b(s1, this.c);
      this.a.h().m();
    } catch (Exception exception) {
      exception.printStackTrace();
      throw new a("Error trying to delete Column.\n" + exception.getLocalizedMessage());
    } finally {
      bQ.a().b(true);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/bY.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */