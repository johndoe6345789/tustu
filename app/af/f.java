package af;

import G.bT;
import G.cR;
import G.cV;
import J.g;
import ad.a;
import ad.c;
import ad.d;
import ae.d;
import ae.k;
import ae.m;
import ae.o;
import ae.p;
import ae.u;
import ae.v;
import bH.D;
import bH.c;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class f implements n {
  cV a = null;
  
  cR b = null;
  
  cV c = (cV)new g();
  
  cR d = (cR)new J.f();
  
  List e = new ArrayList();
  
  m f = new m(this);
  
  e g = new e();
  
  String h = null;
  
  public String a() {
    return "MS3 Firmware Loader";
  }
  
  public String b() {
    return "Firmware loader for loading MS3 and MS3-Pro with version 1.1 and up Firmware.";
  }
  
  public List c() {
    ArrayList<m> arrayList = new ArrayList();
    arrayList.add(this.f);
    arrayList.add(this.g);
    return arrayList;
  }
  
  public List d() {
    ArrayList<e> arrayList = new ArrayList();
    arrayList.add(this.g);
    arrayList.add(this.f);
    return arrayList;
  }
  
  public boolean a(m paramm) {
    return ((paramm.b() | o.x) == paramm.b());
  }
  
  public boolean a(k paramk) {
    List<File> list = paramk.d();
    for (byte b = 0; b < list.size(); b++) {
      try {
        a a = paramk.c(list.get(b));
        int i = Integer.MAX_VALUE;
        if (a.a().size() > 0) {
          int[] arrayOfInt = ((d)a.a().get(0)).e();
          byte[] arrayOfByte = c.a(arrayOfInt);
          String str = new String(arrayOfByte);
          if (str.contains("ms3.s19") || str.contains("ms3pro-ult.s19") || str.contains("ms3pro-evo.s19") || str.contains("ms3pro-mini.s19") || str.contains("ms3pro-mini.s19") || str.contains("ms3pro-mini-plus.s19") || str.contains("ms3pro-competition.s19") || str.contains("ms3pro-comp.s19") || str.contains("ms3pro-plus.s19") || str.contains("ms3pro.s19"))
            return true; 
          D.b("s19 header does not resolve to a valid MS3 firmware file: " + str);
        } 
      } catch (c c) {
        Logger.getLogger(c.class.getName()).log(Level.SEVERE, (String)null, (Throwable)c);
      } 
    } 
    D.b("Selected Firmware Package not suitable for MS3 Firmware Loader.");
    return false;
  }
  
  public boolean a(m paramm, File paramFile) {
    return paramFile.getName().equals("ms3pro.s19") ? (((paramm.b() & o.B) > 0)) : (paramFile.getName().equals("ms3pro-evo.s19") ? (((paramm.b() & o.J) > 0)) : (paramFile.getName().equals("ms3pro-ult.s19") ? (((paramm.b() & o.K) > 0)) : (paramFile.getName().equals("ms3pro-mini.s19") ? (((paramm.b() & o.L) > 0)) : ((paramFile.getName().equals("ms3pro-mini-plus.s19") || paramFile.getName().equals("ms3pro-competition.s19") || paramFile.getName().equals("ms3pro-comp.s19")) ? (((paramm.b() & o.N) > 0)) : ((paramFile.getName().equals("ms3pro-mod2.s19") || paramFile.getName().equals("ms3pro-plus.s19")) ? (((paramm.b() & o.M) > 0)) : (paramFile.getName().equals("ms3.s19") ? (((paramm.b() & o.B) == 0 && (paramm.b() & o.J) == 0 && (paramm.b() & o.K) == 0 && (paramm.b() & o.L) == 0 && (paramm.b() & o.M) == 0 && (paramm.b() & o.x) > 0)) : false))))));
  }
  
  public boolean b(m paramm, File paramFile) {
    return paramFile.getName().equals("ms3pro.s19") ? (((paramm.b() & o.B) > 0)) : (paramFile.getName().equals("ms3pro-evo.s19") ? (((paramm.b() & o.J) > 0)) : (paramFile.getName().equals("ms3pro-ult.s19") ? (((paramm.b() & o.K) > 0)) : (paramFile.getName().equals("ms3pro-mini.s19") ? (((paramm.b() & o.L) > 0)) : ((paramFile.getName().equals("ms3pro-mini-plus.s19") || paramFile.getName().equals("ms3pro-competition.s19") || paramFile.getName().equals("ms3pro-comp.s19")) ? (((paramm.b() & o.N) > 0)) : ((paramFile.getName().equals("ms3pro-mod2.s19") || paramFile.getName().equals("ms3pro-plus.s19")) ? (((paramm.b() & o.M) > 0)) : (paramFile.getName().equals("ms3.s19") ? (((paramm.b() & o.B) == 0 && (paramm.b() & o.J) == 0 && (paramm.b() & o.K) == 0 && (paramm.b() & o.L) == 0 && (paramm.b() & o.N) == 0 && (paramm.b() & o.M) == 0 && (paramm.b() & o.x) > 0)) : false))))));
  }
  
  public d a(k paramk, p paramp, u paramu) {
    d d = null;
    d = j.a(paramp);
    if (d.a() == d.b)
      return d; 
    File file = paramk.g();
    if (file == null) {
      d.a(d.b);
      d.a("No Firmware File Selected!");
      return d;
    } 
    D.d("Loading Firmware File: " + file.getAbsolutePath());
    try {
      a a = paramk.c(file);
      h h = h.a(a.c(), this.h);
      paramu.a(0.0D);
      paramu.a("Erasing main flash");
      List list = a(a);
      d = j.a(paramp, list, paramu, this.g);
      if (d.a() == d.b)
        return d; 
      boolean bool = this.g.c();
      g g = new g(this, bool, h);
      paramu.a("Loading firmware");
      d = j.b(a, paramp, paramu, g);
      paramu.a("");
    } catch (c c) {
      d.a(d.b);
      d.a("Unable to read S19 File.");
      D.a("Unable to parse S19 File: " + file.getAbsolutePath());
      c.printStackTrace();
      return d;
    } catch (v v) {
      Logger.getLogger(c.class.getName()).log(Level.SEVERE, "Unexpected Protocol Error", (Throwable)v);
      d.a(d.b);
      d.a("Unexpected Protocol Error");
      return d;
    } 
    return d;
  }
  
  private List a(a parama) {
    ArrayList<l> arrayList = new ArrayList();
    HashMap<Object, Object> hashMap = new HashMap<>();
    for (d d : parama.b()) {
      if (d.d() > 2097152 && d.d() < 8126464) {
        int i = d.d() >>> 16;
        l l = null;
        if (hashMap.get(Integer.valueOf(i)) == null) {
          l = new l(i);
          hashMap.put(Integer.valueOf(i), l);
          l.a(d.d());
          arrayList.add(l);
          continue;
        } 
        if (l == null)
          l = (l)hashMap.get(Integer.valueOf(i)); 
        l.a(d.d());
      } 
    } 
    return arrayList;
  }
  
  public String e() {
    return "https://www.msextra.com/forums/viewforum.php?f=101";
  }
  
  public bT a(p paramp) {
    return j.f(paramp);
  }
  
  public void f() {
    j.a();
  }
  
  public String a(File paramFile) {
    return paramFile.getName().equalsIgnoreCase("ms3pro.s19") ? o.l : (paramFile.getName().equalsIgnoreCase("ms3pro-ult.s19") ? o.n : (paramFile.getName().equalsIgnoreCase("ms3pro-evo.s19") ? o.m : (paramFile.getName().equalsIgnoreCase("ms3pro-mini.s19") ? o.o : ((paramFile.getName().equals("ms3pro-mini-plus.s19") || paramFile.getName().equals("ms3pro-competition.s19") || paramFile.getName().equals("ms3pro-comp.s19")) ? o.p : ((paramFile.getName().equalsIgnoreCase("ms3pro-mod2.s19") || paramFile.getName().equals("ms3pro-plus.s19")) ? o.q : (paramFile.getName().equalsIgnoreCase("ms3.s19") ? o.k : ""))))));
  }
  
  public void a(String paramString) {
    this.h = paramString;
    this.g.a(this.h);
  }
  
  public cR a(bT parambT) {
    return this.b;
  }
  
  public cV b(bT parambT) {
    return this.a;
  }
  
  public void h() {
    this.a = this.c;
    this.b = this.d;
  }
  
  public void i() {
    this.a = null;
    this.b = null;
  }
  
  public boolean j() {
    return (this.a == null && this.b == null);
  }
  
  public boolean g() {
    return this.g.d();
  }
  
  public List b(m paramm) {
    ArrayList<String> arrayList = new ArrayList();
    if ((paramm.b() & o.B) > 0) {
      arrayList.add("ms3pro.s19");
    } else if ((paramm.b() & o.J) > 0) {
      arrayList.add("ms3pro-evo.s19");
    } else if ((paramm.b() & o.K) > 0) {
      arrayList.add("ms3pro-ult.s19");
    } else if ((paramm.b() & o.L) > 0) {
      arrayList.add("ms3pro-mini.s19");
    } else if ((paramm.b() & o.N) > 0) {
      arrayList.add("ms3pro-comp.s19");
      arrayList.add("ms3pro-competition.s19");
      arrayList.add("ms3pro-mini-plus.s19");
    } else if ((paramm.b() & o.M) > 0) {
      arrayList.add("ms3pro-plus.s19");
    } else if ((paramm.b() & o.B) == 0 && (paramm.b() & o.J) == 0 && (paramm.b() & o.K) == 0 && (paramm.b() & o.L) == 0 && (paramm.b() & o.M) == 0 && (paramm.b() & o.x) > 0) {
      arrayList.add("ms3.s19");
    } 
    return arrayList;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/af/f.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */