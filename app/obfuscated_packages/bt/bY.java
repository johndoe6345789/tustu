package bt;

import G.R;
import G.aJ;
import G.aM;
import G.bA;
import G.bM;
import G.be;
import G.bq;
import G.bv;
import V.ExceptionInVPackage;
import bH.D;
import bH.X;
import com.efiAnalytics.ui.am;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.fh;
import com.efiAnalytics.ui.s;
import java.util.ArrayList;
import n.NInterfaceHotel;
import s.SComponentGolf;

public class bY implements am {
  R ExceptionInVPackage;
  
  be b;
  
  s c;
  
  aM d = null;
  
  aM e = null;
  
  aM f;
  
  aM SComponentGolf;
  
  aM NInterfaceHotel;
  
  public static int i = 1;
  
  public static int j = 2;
  
  public static int k = -1;
  
  int l = k;
  
  public bY(R paramR, be parambe, s params) {
    this.ExceptionInVPackage = paramR;
    this.b = parambe;
    this.c = params;
    this.SComponentGolf = paramR.c(parambe.b());
    this.f = paramR.c(parambe.ExceptionInVPackage());
    this.NInterfaceHotel = paramR.c(parambe.c());
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
    String[] arrayOfString2 = this.SComponentGolf.Q();
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
  
  public boolean ExceptionInVPackage() {
    return true;
  }
  
  public int b() {
    return (int)((this.d != null) ? Math.round(this.d.s()) : this.SComponentGolf.b());
  }
  
  public int c() {
    return (int)((this.d != null) ? Math.round(this.d.r()) : this.SComponentGolf.b());
  }
  
  public int d() {
    return (int)((this.e != null) ? Math.round(this.e.s()) : this.f.b());
  }
  
  public int e() {
    return (int)((this.e != null) ? Math.round(this.e.r()) : this.f.b());
  }
  
  public int f() {
    int i = SComponentGolf();
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
      arrayList.add(this.SComponentGolf);
      arrayList.add(this.NInterfaceHotel);
      if (this.f.n() && this.SComponentGolf.n() && this.f.d() == this.NInterfaceHotel.d() && this.SComponentGolf.d() == this.NInterfaceHotel.d() && aJ.ExceptionInVPackage(this.ExceptionInVPackage, arrayList)) {
        this.l = i + j;
      } else {
        this.l = 0;
      } 
    } 
    return (this.l == i + j);
  }
  
  public int SComponentGolf() {
    int i;
    if (i()) {
      i = Math.min(this.f.SComponentGolf(), this.SComponentGolf.SComponentGolf());
      i = Math.min(this.NInterfaceHotel.SComponentGolf(), i);
    } else {
      i = this.NInterfaceHotel.SComponentGolf();
    } 
    int j = aJ.ExceptionInVPackage(this.ExceptionInVPackage, this.NInterfaceHotel.d(), i);
    if (i())
      j -= this.SComponentGolf.e(); 
    return Math.floorDiv(j, this.NInterfaceHotel.e());
  }
  
  public boolean ExceptionInVPackage(int paramInt1, int paramInt2) {
    int i;
    boolean bool = i();
    if (bool) {
      i = Math.min(this.f.SComponentGolf(), this.SComponentGolf.SComponentGolf());
      i = Math.min(this.NInterfaceHotel.SComponentGolf(), i);
    } else {
      i = this.NInterfaceHotel.SComponentGolf();
    } 
    int j = aJ.ExceptionInVPackage(this.ExceptionInVPackage, this.NInterfaceHotel.d(), i);
    if (bool) {
      int k = this.f.e() * paramInt2;
      int m = this.SComponentGolf.e() * paramInt1;
      int n = Math.floorDiv(j - k - m, this.NInterfaceHotel.e());
      return (n <= paramInt1 * paramInt2);
    } 
    return (Math.floorDiv(j, this.NInterfaceHotel.e()) <= paramInt1 * paramInt2);
  }
  
  private void b(int paramInt1, int paramInt2) {
    if (paramInt1 > b())
      throw new ExceptionInVPackage(SComponentGolf.b("Maximum Rows already reached")); 
    if (paramInt1 < c())
      throw new ExceptionInVPackage(SComponentGolf.b("Minimum rows") + ": " + c()); 
    if (paramInt2 > d())
      throw new ExceptionInVPackage(SComponentGolf.b("Maximum Columns already reached")); 
    if (paramInt2 < e())
      throw new ExceptionInVPackage(SComponentGolf.b("Minimum columns") + ": " + e()); 
    if (paramInt2 * paramInt1 > f())
      throw new ExceptionInVPackage(SComponentGolf.b("Requires more table cells than permitted.")); 
    if (!ExceptionInVPackage(paramInt1, paramInt2))
      throw new ExceptionInVPackage(SComponentGolf.b("Requires more table cells than available contiguous RAM.")); 
  }
  
  public void NInterfaceHotel() {
    bv bv = new bv();
    bv.s(SComponentGolf.b("Resize Table") + " " + bM.c(this.ExceptionInVPackage, this.b.aL()));
    bq bq = new bq();
    bq.e(" ");
    bv.ExceptionInVPackage((bA)bq);
    bq = new bq();
    bq.b(this.d.aL());
    bq.e(SComponentGolf.b("Number of Rows"));
    bv.ExceptionInVPackage((bA)bq);
    bq = new bq();
    bq.b(this.e.aL());
    bq.e(SComponentGolf.b("Number of Columns"));
    bv.ExceptionInVPackage((bA)bq);
    NInterfaceHotel.ExceptionInVPackage().ExceptionInVPackage(this.ExceptionInVPackage, bv, bV.c());
  }
  
  public void ExceptionInVPackage(int paramInt) {
    b(this.c.getRowCount() + 1, this.c.getColumnCount());
    try {
      bQ.ExceptionInVPackage().b(false);
      s s1 = fh.b(this.c);
      this.d.l(this.ExceptionInVPackage.NInterfaceHotel());
      int i = (int)this.d.j(this.ExceptionInVPackage.NInterfaceHotel());
      int j = (int)this.e.j(this.ExceptionInVPackage.NInterfaceHotel());
      this.c.ExceptionInVPackage(i, j);
      D.c("Set new Model size: Rows: " + i + ", Cols: " + j);
      int k = s1.getRowCount();
      String[] arrayOfString = new String[i];
      for (byte b = 0; b < i; b++) {
        String str;
        boolean bool = (b <= paramInt) ? b : (b - 1);
        if (b == paramInt) {
          if (b == i - 1) {
            str = s1.ExceptionInVPackage()[k - 1];
          } else if (b == 0) {
            str = s1.ExceptionInVPackage()[0];
          } else {
            str = X.b((Double.parseDouble(s1.ExceptionInVPackage()[b - 1]) + Double.parseDouble(s1.ExceptionInVPackage()[b])) / 2.0D, this.c.J());
          } 
        } else {
          str = s1.ExceptionInVPackage()[bool];
        } 
        arrayOfString[arrayOfString.length - b - 1] = str;
        D.c("set row " + b + " to " + str);
      } 
      this.c.d(arrayOfString);
      D.c("Copy Z vals");
      fh.b(s1, this.c);
      this.ExceptionInVPackage.NInterfaceHotel().m();
    } catch (Exception exception) {
      exception.printStackTrace();
      throw new ExceptionInVPackage("Error trying to delete Row.\n" + exception.getLocalizedMessage());
    } finally {
      bQ.ExceptionInVPackage().b(true);
    } 
  }
  
  public void b(int paramInt) {
    b(this.c.getRowCount() - 1, this.c.getColumnCount());
    try {
      bQ.ExceptionInVPackage().b(false);
      s s1 = fh.b(this.c);
      this.d.m(this.ExceptionInVPackage.NInterfaceHotel());
      int i = (int)this.d.j(this.ExceptionInVPackage.NInterfaceHotel());
      int j = (int)this.e.j(this.ExceptionInVPackage.NInterfaceHotel());
      this.c.ExceptionInVPackage(i, j);
      D.c("Set new Model size: Rows: " + i + ", Cols: " + j);
      int k = s1.getRowCount();
      String[] arrayOfString = new String[i];
      for (byte b = 0; b < k; b++) {
        if (b != paramInt) {
          byte b1 = (b < paramInt) ? b : (b - 1);
          String str = s1.ExceptionInVPackage()[b];
          arrayOfString[arrayOfString.length - b1 - 1] = str;
          D.c("set row " + b1 + " to " + str);
        } 
      } 
      this.c.d(arrayOfString);
      D.c("Copy Z vals");
      fh.b(s1, this.c);
      this.ExceptionInVPackage.NInterfaceHotel().m();
    } catch (Exception exception) {
      throw new ExceptionInVPackage("Error trying to delete Row.\n" + exception.getLocalizedMessage());
    } finally {
      bQ.ExceptionInVPackage().b(true);
    } 
  }
  
  public void c(int paramInt) {
    b(this.c.getRowCount(), this.c.getColumnCount() + 1);
    try {
      bQ.ExceptionInVPackage().b(false);
      s s1 = fh.b(this.c);
      this.e.l(this.ExceptionInVPackage.NInterfaceHotel());
      int i = (int)this.d.j(this.ExceptionInVPackage.NInterfaceHotel());
      int j = (int)this.e.j(this.ExceptionInVPackage.NInterfaceHotel());
      this.c.ExceptionInVPackage(i, j);
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
      this.ExceptionInVPackage.NInterfaceHotel().m();
    } catch (Exception exception) {
      exception.printStackTrace();
      throw new ExceptionInVPackage("Error trying to delete Column.\n" + exception.getLocalizedMessage());
    } finally {
      bQ.ExceptionInVPackage().b(true);
    } 
  }
  
  public void d(int paramInt) {
    b(this.c.getRowCount(), this.c.getColumnCount() - 1);
    try {
      bQ.ExceptionInVPackage().b(false);
      s s1 = fh.b(this.c);
      this.e.m(this.ExceptionInVPackage.NInterfaceHotel());
      int i = (int)this.d.j(this.ExceptionInVPackage.NInterfaceHotel());
      int j = (int)this.e.j(this.ExceptionInVPackage.NInterfaceHotel());
      this.c.ExceptionInVPackage(i, j);
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
      this.ExceptionInVPackage.NInterfaceHotel().m();
    } catch (Exception exception) {
      exception.printStackTrace();
      throw new ExceptionInVPackage("Error trying to delete Column.\n" + exception.getLocalizedMessage());
    } finally {
      bQ.ExceptionInVPackage().b(true);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/bY.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */