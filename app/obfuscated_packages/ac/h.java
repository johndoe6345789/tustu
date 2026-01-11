package ac;

import G.J;
import G.R;
import G.T;
import G.aF;
import G.ac;
import G.cq;
import G.cu;
import G.i;
import L.y;
import V.a;
import W.as;
import W.e;
import bH.D;
import bH.aa;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class h implements aF {
  protected ArrayList d = new ArrayList();
  
  static List e = new ArrayList();
  
  private List a = new ArrayList();
  
  protected static h f = null;
  
  protected OutputStream g = null;
  
  private static String b = null;
  
  protected boolean h = false;
  
  long i = System.currentTimeMillis();
  
  long j = -1L;
  
  protected k k = null;
  
  private long c = -1L;
  
  File l = null;
  
  boolean m = false;
  
  private double p = 0.0D;
  
  private static int q = 0;
  
  private String[] r = null;
  
  boolean n = false;
  
  private static h s = null;
  
  private boolean t = true;
  
  private cq u = null;
  
  private static B v = null;
  
  private boolean w = false;
  
  final List o = new ArrayList();
  
  protected h() {
    this.u = new i(this);
  }
  
  protected abstract void a(R[] paramArrayOfR, OutputStream paramOutputStream);
  
  public void d(String paramString) {
    a(this.g, paramString);
    f(paramString);
  }
  
  protected abstract void a(OutputStream paramOutputStream, String paramString);
  
  protected abstract void a(OutputStream paramOutputStream, byte[][] paramArrayOfbyte);
  
  protected abstract void a(OutputStream paramOutputStream);
  
  public void a(a parama) {
    if (u())
      throw new A("Can not modify LoggerFields while logging."); 
    if (!this.a.contains(parama))
      this.a.add(parama); 
  }
  
  public void i() {
    if (u())
      throw new A("Can not modify LoggerFields while logging."); 
    this.a.clear();
  }
  
  protected List j() {
    return this.a;
  }
  
  public static h k() {
    return s;
  }
  
  public void a(h paramh) {
    s = paramh;
  }
  
  public synchronized void a(String paramString1, String paramString2) {
    String[] arrayOfString = new String[1];
    arrayOfString[0] = paramString1;
    a(arrayOfString, paramString2);
  }
  
  public synchronized void a(String[] paramArrayOfString, String paramString) {
    T t = T.a();
    R[] arrayOfR = new R[paramArrayOfString.length];
    R r = t.c();
    D.c("Starting Log for " + arrayOfR.length + " Configs.");
    for (byte b1 = 0; b1 < paramArrayOfString.length; b1++) {
      R r1 = t.c(paramArrayOfString[b1]);
      if (b1 > 0 && r1.equals(r)) {
        R r2 = arrayOfR[0];
        arrayOfR[0] = r1;
        arrayOfR[b1] = r2;
      } else {
        arrayOfR[b1] = r1;
      } 
      if (arrayOfR[b1] == null)
        throw new a("Configuration '" + paramArrayOfString[b1] + "' not currently loaded. \nCan't start data Log."); 
    } 
    ArrayList<R> arrayList = new ArrayList();
    for (byte b2 = 0; b2 < arrayOfR.length; b2++) {
      if (b2 == 0 || (arrayOfR[b2].S() && arrayOfR[b2].C().e(arrayOfR[b2].O())))
        arrayList.add(arrayOfR[b2]); 
    } 
    arrayOfR = arrayList.<R>toArray(new R[arrayList.size()]);
    ArrayList arrayList1 = a(arrayOfR);
    aa aa = new aa();
    aa.a();
    HashMap<Object, Object> hashMap = new HashMap<>();
    for (q q : arrayList1) {
      if (q.g() != null) {
        List<String> list = (List)hashMap.get(q.g());
        if (list == null) {
          list = new ArrayList();
          hashMap.put(q.g(), list);
        } 
        if (q.c() == null) {
          D.b("OutputChannel is null! Cannot datalog: " + q.a());
          continue;
        } 
        list.add(q.c().aL());
      } 
    } 
    for (String str : hashMap.keySet()) {
      List list = (List)hashMap.get(str);
      cu.a().a(str, list, this.u);
    } 
    D.c("Time to subscribe all data log channels: " + aa.d());
    try {
      this.g = e(paramString);
      a(arrayOfR, this.g);
    } catch (Exception exception) {
      exception.printStackTrace();
      throw new a("Could not create file " + paramString);
    } 
    ArrayList<J> arrayList2 = new ArrayList();
    for (byte b3 = 0; b3 < arrayOfR.length; b3++) {
      J j = T.a().c(paramArrayOfString[b3]).C();
      if (!arrayList2.contains(j))
        j.b(this); 
      arrayList2.add(j);
      this.d.add(new m(this, paramArrayOfString[b3], b3, arrayOfR[b3].O().n()));
    } 
    a(new File(paramString));
    D.d("Started Data Log to file: " + paramString);
    y.a();
    this.j = -1L;
    this.n = false;
    this.h = true;
    try {
      String str1 = paramArrayOfString[0];
      String str2 = "Channels active on main config " + str1 + ": " + cu.a().b(str1);
      D.d(str2);
    } catch (Exception exception) {}
  }
  
  public void l() {
    this.n = true;
    j j = new j(this);
    j.start();
  }
  
  protected void m() {
    this.h = false;
    y.b();
    try {
      for (byte b = 0; b < this.d.size(); b++) {
        m m = this.d.get(b);
        String str = m.a();
        T t = T.a();
        R r = t.c(str);
        if (r == null)
          throw new a("Configuration '" + str + "' not currently loaded. \nCan't stop data Log."); 
        J j = T.a().c(str).C();
        j.c(this);
        this.d.remove(m);
        b--;
      } 
      a(this.g);
      cu.a().a(this.u);
      q();
      if (!this.m && this.l != null && this.l.exists()) {
        D.d("No records written to log file: " + this.l.getName() + ", will delete.");
        this.l.delete();
      } 
      this.j = -1L;
    } catch (Exception exception) {
      exception.printStackTrace();
      throw new a("Could Not close log file, error\n" + exception.getMessage());
    } 
    if (this.k != null)
      this.k.a(); 
  }
  
  protected boolean a(R paramR, ac paramac) {
    String str = T.a().c().equals(paramR) ? "" : paramR.c();
    return (!a(str, this.r, paramac.b()) && r.a(paramR, paramac));
  }
  
  private boolean a(String paramString1, String[] paramArrayOfString, String paramString2) {
    if (paramArrayOfString == null || paramString2 == null)
      return false; 
    for (byte b = 0; b < paramArrayOfString.length; b++) {
      if ((paramString1 == null || paramString1.isEmpty()) && paramArrayOfString[b].equals(paramString2))
        return true; 
      if (paramArrayOfString[b].equals(paramString1 + "." + paramString2))
        return true; 
    } 
    return false;
  }
  
  protected ArrayList a(R[] paramArrayOfR) {
    ArrayList<q> arrayList = new ArrayList();
    for (byte b = 0; b < paramArrayOfR.length; b++) {
      if (paramArrayOfR[b].S()) {
        q = 0;
        for (ac ac : paramArrayOfR[b].g()) {
          if (a(paramArrayOfR[b], ac)) {
            q q = new q();
            if (b == 0) {
              String str = ac.b();
              byte b1 = 0;
              while (a(arrayList, str))
                str = ac.b() + "_" + b1++; 
              q.a(str);
            } else {
              String str = paramArrayOfR[b].c() + "." + ac.b();
              byte b1 = 0;
              while (a(arrayList, str))
                str = paramArrayOfR[b].c() + "." + ac.b() + "_" + b1++; 
              q.a(str);
            } 
            q.b(paramArrayOfR[b].c());
            q.a(ac);
            q.a(b);
            q.a(paramArrayOfR[b].g(ac.a()));
            q.b(ac.f());
            if (q.h() > q)
              q = q.h(); 
            q.c(ac.m());
            q.d(ac.n());
            arrayList.add(q);
          } 
        } 
        for (q q : arrayList)
          q.c(q); 
      } 
    } 
    return arrayList;
  }
  
  private boolean a(ArrayList paramArrayList, String paramString) {
    for (q q : paramArrayList) {
      if (q.a().equals(paramString))
        return true; 
    } 
    return false;
  }
  
  public synchronized void a(String paramString, byte[] paramArrayOfbyte) {
    double d = 0.0D;
    long l1 = System.currentTimeMillis();
    long l2 = System.nanoTime();
    if (this.c != -1L) {
      d = (l1 - this.c) / 1000.0D;
    } else {
      d = 0.1D;
    } 
    this.c = l1;
    this.p = (this.p * 20.0D + 1.0D / d) / 21.0D;
    m m = a(paramString);
    if (m == null || paramArrayOfbyte == null)
      return; 
    m.a(paramArrayOfbyte);
    for (m m1 : this.d) {
      if (m1.b() == null)
        return; 
    } 
    byte[][] arrayOfByte = new byte[this.d.size()][0];
    String[] arrayOfString = new String[this.d.size()];
    for (byte b = 0; b < this.d.size(); b++) {
      m m1 = this.d.get(b);
      arrayOfByte[b] = m1.b();
      m1.a((byte[])null);
      arrayOfString[b] = m1.a();
    } 
    try {
      if (this.j == -1L) {
        i.b();
        this.j = System.currentTimeMillis();
      } 
      long l3 = System.nanoTime() - l2;
      if (v != null)
        cu.a().a("dataLogTime", v.a()); 
      a(this.g, arrayOfByte);
      long l4 = System.nanoTime() - l2 - l3;
      p();
      this.m = true;
      long l5 = System.nanoTime() - l2 - l3 - l4;
      if ((System.nanoTime() - l2) > 4.0E7D) {
        NumberFormat numberFormat = DecimalFormat.getNumberInstance();
        numberFormat.setMaximumFractionDigits(6);
        D.b("Data Log write time seems to be taking an unusually long amount of time.");
        D.c("Time to write Data Log Record: " + numberFormat.format(l4 / 1000000.0D) + "ms. Time to notify Listeners: " + (l5 / 1000000.0D) + "ms. Prework time:" + (l3 / 1000000.0D));
      } 
    } catch (Exception exception) {
      D.a("Failed to write log record. Error:");
      Logger.getLogger(h.class.getName()).log(Level.SEVERE, (String)null, exception);
    } 
    try {
      this.g.flush();
    } catch (IOException iOException) {
      iOException.printStackTrace();
    } 
    if (this.n && q == 0) {
      try {
        m();
      } catch (a a) {
        D.a(a.getLocalizedMessage(), (Exception)a, null);
      } 
    } else if (this.n && q > 0) {
      q--;
    } 
  }
  
  private m a(String paramString) {
    for (m m : this.d) {
      if (m.a().equals(paramString))
        return m; 
    } 
    return null;
  }
  
  protected OutputStream e(String paramString) {
    File file = new File(paramString);
    try {
      file.getParentFile().mkdirs();
      b(file);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
    e e = new e(new FileOutputStream(file));
    as as = new as((OutputStream)e);
    this.l = file;
    this.m = false;
    return (OutputStream)as;
  }
  
  public String n() {
    return b;
  }
  
  public void a(File paramFile) {
    b = paramFile.getAbsolutePath();
  }
  
  public double o() {
    return this.p;
  }
  
  protected void b(File paramFile) {
    if (this.t) {
      Iterator<f> iterator = e.iterator();
      while (iterator.hasNext())
        ((f)iterator.next()).a(paramFile); 
    } 
  }
  
  protected void p() {
    if (this.t) {
      Iterator<f> iterator = e.iterator();
      while (iterator.hasNext())
        ((f)iterator.next()).c(); 
    } 
  }
  
  protected void q() {
    if (this.t) {
      Iterator<f> iterator = e.iterator();
      while (iterator.hasNext())
        ((f)iterator.next()).d(); 
    } 
  }
  
  protected void f(String paramString) {
    if (this.t) {
      Iterator<f> iterator = e.iterator();
      while (iterator.hasNext())
        ((f)iterator.next()).b(paramString); 
    } 
  }
  
  public void a(f paramf) {
    e.add(paramf);
  }
  
  public int r() {
    return q;
  }
  
  public void a(String[] paramArrayOfString) {
    this.r = paramArrayOfString;
  }
  
  public void b(boolean paramBoolean) {
    this.t = paramBoolean;
  }
  
  public static B s() {
    return v;
  }
  
  public static void a(B paramB) {
    v = paramB;
  }
  
  public boolean t() {
    return this.w;
  }
  
  public void c(boolean paramBoolean) {
    this.w = paramBoolean;
  }
  
  public boolean u() {
    return this.h;
  }
  
  public void d(boolean paramBoolean) {
    this.h = paramBoolean;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ac/h.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */