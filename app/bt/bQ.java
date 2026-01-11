package bt;

import G.R;
import G.aM;
import G.af;
import G.be;
import G.bh;
import G.bv;
import G.cl;
import G.db;
import G.dj;
import V.a;
import V.g;
import aE.a;
import aE.e;
import bF.C;
import bF.a;
import bF.c;
import bF.x;
import bF.y;
import bH.D;
import bH.X;
import bH.ab;
import c.e;
import com.efiAnalytics.ui.eY;
import com.efiAnalytics.ui.fh;
import com.efiAnalytics.ui.s;
import com.efiAnalytics.ui.u;
import h.h;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import r.j;

public class bQ implements e {
  private static bQ j = null;
  
  HashMap a = new HashMap<>();
  
  HashMap b = new HashMap<>();
  
  HashMap c = new HashMap<>();
  
  HashMap d = new HashMap<>();
  
  ArrayList e = new ArrayList();
  
  ArrayList f = new ArrayList();
  
  private ab k = null;
  
  private String l = "lambdaDelay_";
  
  private boolean m = true;
  
  private boolean n = true;
  
  public static int g = 1;
  
  public static int h = 2;
  
  public static int i = -1;
  
  public static bQ a() {
    if (j == null)
      j = new bQ(); 
    return j;
  }
  
  public String a(String paramString) {
    return (this.k != null) ? this.k.a(paramString) : paramString;
  }
  
  public s a(R paramR, String paramString) {
    String str = (paramR.e().c("veTable1Tbl") != null) ? "veTable1Tbl" : "";
    return a(paramR, paramString, "", str);
  }
  
  public s a(R paramR, String paramString1, String paramString2) {
    return a(paramR, paramString1, "", paramString2);
  }
  
  public s a(R paramR, String paramString1, String paramString2, String paramString3) {
    if (!this.m)
      try {
        s s = b(paramR, paramString1);
        bS bS = new bS(this, paramR, s, paramString1);
        s.addTableModelListener(bS);
        return s;
      } catch (a a) {
        Logger.getLogger(bQ.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a);
        throw new g("Unable to create BinTable.", a);
      }  
    String str = paramR.c() + "." + paramString2 + paramString1;
    if (!this.a.containsKey(str))
      if (!b(paramString1)) {
        try {
          s s = b(paramR, paramString1);
          bS bS = new bS(this, paramR, s, paramString1);
          this.e.add(bS);
          s.addTableModelListener(bS);
          this.a.put(str, s);
        } catch (g g) {
          throw g;
        } catch (Exception exception) {
          exception.printStackTrace();
          throw new g("Unable to create BinTable.", exception);
        } 
      } else if (paramString1.equals("afrTSCustom")) {
        try {
          s s = d(paramR, paramString1, paramString3);
          this.a.put(str, s);
        } catch (a a) {
          a.printStackTrace();
          throw new g(a.getMessage());
        } 
      }  
    return (s)this.a.get(str);
  }
  
  public s b(R paramR, String paramString1, String paramString2) {
    String str = paramR.c() + "." + paramString2 + paramString1;
    return (s)this.a.get(str);
  }
  
  public boolean b(String paramString) {
    return (paramString == null || paramString.equals("afrTSCustom"));
  }
  
  private s d(R paramR, String paramString1, String paramString2) {
    String str1 = "afr_" + paramString1;
    s s1 = a().a(paramR, paramString2, paramString2);
    s s2 = null;
    String str2 = a.A().t();
    File file = j.a(str2, str1);
    if (file.exists()) {
      eY eY = new eY();
      s2 = null;
      try {
        s2 = eY.a(file.getAbsolutePath());
        if (s1 != null) {
          s2.d(s1.v());
          s2.e(s1.w());
        } 
      } catch (a a) {
        D.a("Error loading AFR Table from file:\n" + file + "\nUsing default.");
        a.printStackTrace();
      } 
    } 
    if (s2 == null) {
      s2 = new s();
      s2.a(s1.getRowCount(), s1.getColumnCount());
      fh.a(s1, s2);
      s2 = u.b(s2);
    } 
    bR bR = new bR(this, s2, str2, str1);
    s2.addTableModelListener(bR);
    s2.f(1);
    s2.q();
    return s2;
  }
  
  public s b(R paramR, String paramString) {
    be be = (be)paramR.e().c(paramString);
    if (be == null)
      throw new g(paramString + " not found in current Configuration, can not create Model."); 
    s s = new s();
    aM aM1 = paramR.c(be.c());
    aM aM2 = paramR.c(be.b());
    aM aM3 = paramR.c(be.a());
    double[][] arrayOfDouble = aM1.i(paramR.p());
    s.a(arrayOfDouble);
    s.d(be.f());
    s.e(be.d());
    s.d(a(aM2.i(paramR.p()), aM2.v()));
    s.c(a(aM3.i(paramR.p()), aM3.v()));
    s.q();
    bW bW = new bW(this, paramR, paramString, s);
    bW.a(bW);
    this.c.put(paramString, bW);
    return s;
  }
  
  public y c(R paramR, String paramString) {
    bv bv = paramR.e().c(paramString);
    if (bv != null && !(bv instanceof bh))
      throw new g(paramString + ", name already used but not defined as a 1D Table"); 
    bh bh = (bh)bv;
    if (bh == null)
      throw new g(paramString + " not found in current Configuration, can not create Model."); 
    y y = new y();
    y.a(bh.i());
    if (bh.h()) {
      a a = new a(paramR, bh.d(0));
      y.a((x)a);
    } else {
      y.b(bh.i());
      y.d(!bh.i());
      y.c(bh.h());
      if (y.g()) {
        aM aM = paramR.c(bh.d(0));
        c c = new c(aM.b());
        c.a(aM.w());
        c.b(aM.u());
        c.c(aM.t());
        c.d((dj)new cl(aM));
        db db = bh.f(0);
        if (db != null)
          c.a(db); 
        y.a((C)c);
        double[][] arrayOfDouble = aM.i(paramR.h());
        for (byte b1 = 0; b1 < arrayOfDouble.length; b1++)
          c.a(b1, Double.valueOf(arrayOfDouble[b1][0])); 
        c.f();
      } 
    } 
    for (byte b = 0; b < bh.a(); b++) {
      aM aM = paramR.c(bh.b(b));
      c c = new c(aM.b());
      c.a(aM.w());
      c.b(aM.u());
      c.c(aM.t());
      c.d((dj)new cl(aM));
      db db = bh.c(b);
      if (db != null)
        c.a(db); 
      c.a((e)new af(paramR, bh.a(b)));
      y.a((C)c);
      double[][] arrayOfDouble = aM.i(paramR.h());
      for (byte b1 = 0; b1 < arrayOfDouble.length; b1++)
        c.a(b1, Double.valueOf(arrayOfDouble[b1][0])); 
      c.f();
    } 
    if (y.h()) {
      aM aM = paramR.c(bh.d(0));
      c c = new c(aM.b());
      c.a(aM.w());
      c.b(aM.u());
      c.c(aM.t());
      c.d((dj)new cl(aM));
      db db = bh.f(0);
      if (db != null)
        c.a(db); 
      y.a((C)c);
      double[][] arrayOfDouble = aM.i(paramR.h());
      for (byte b1 = 0; b1 < arrayOfDouble.length; b1++)
        c.a(b1, Double.valueOf(arrayOfDouble[b1][0])); 
      c.f();
    } 
    return y;
  }
  
  private String[] a(double[][] paramArrayOfdouble, int paramInt) {
    String[] arrayOfString = new String[paramArrayOfdouble.length];
    for (byte b = 0; b < paramArrayOfdouble.length; b++)
      arrayOfString[b] = "" + X.b(paramArrayOfdouble[b][0], paramInt); 
    return arrayOfString;
  }
  
  public s a(s params, String paramString) {
    String str = "lambdaDelay_" + paramString;
    s s1 = (s)this.a.get(str);
    if (s1 == null) {
      String str1;
      if (a.A() != null) {
        str1 = a.A().t();
      } else {
        str1 = h.a().getAbsolutePath();
      } 
      File file = j.a(str1, str);
      if (file.exists()) {
        eY eY = new eY();
        s1 = null;
        try {
          s1 = eY.a(file.getAbsolutePath());
        } catch (a a) {
          D.a("Error loading Lambda Delay Table from file:\n" + file + "\nUsing default.");
          a.printStackTrace();
        } 
      } 
      if (s1 == null)
        s1 = u.a(params); 
      bR bR = new bR(this, s1, str1, str);
      s1.addTableModelListener(bR);
      s1.f(0);
      s1.q();
      this.a.put(str, s1);
    } 
    return s1;
  }
  
  public void c() {
    Iterator<s> iterator = this.a.values().iterator();
    while (iterator.hasNext())
      ((s)iterator.next()).q(); 
  }
  
  public void a(a parama, R paramR) {}
  
  public void e_() {
    this.a.clear();
    this.b.clear();
    this.d.clear();
    null = this.e.iterator();
    while (null.hasNext())
      ((bS)null.next()).a(); 
    this.e.clear();
    null = this.f.iterator();
    while (null.hasNext())
      ((bU)null.next()).a(); 
    this.f.clear();
    for (bW bW : this.c.values())
      bW.b(bW); 
    this.c.clear();
  }
  
  public void a(a parama) {}
  
  public y c(R paramR, String paramString1, String paramString2) {
    if (!this.m)
      try {
        y y = c(paramR, paramString1);
        bU bU = new bU(this, paramR, y, paramString1);
        this.f.add(bU);
        y.a(bU);
      } catch (g g) {
        Logger.getLogger(bQ.class.getName()).log(Level.SEVERE, "Error creating 1D unshared Model", (Throwable)g);
      } catch (a a) {
        Logger.getLogger(bQ.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a);
      }  
    String str = paramR.c() + "." + paramString2 + paramString1;
    if (!this.b.containsKey(str))
      try {
        y y = c(paramR, paramString1);
        bU bU = new bU(this, paramR, y, paramString1);
        this.f.add(bU);
        y.a(bU);
        this.b.put(str, y);
      } catch (g g) {
      
      } catch (Exception exception) {
        exception.printStackTrace();
      }  
    return (y)this.b.get(str);
  }
  
  public void a(ab paramab) {
    this.k = paramab;
  }
  
  public void a(boolean paramBoolean) {
    this.m = paramBoolean;
  }
  
  public void b(boolean paramBoolean) {
    this.n = paramBoolean;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/bQ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */