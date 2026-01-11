package ag;

import G.bT;
import G.cR;
import G.cV;
import ad.c;
import ad.d;
import ae.d;
import ae.k;
import ae.m;
import ae.o;
import ae.p;
import ae.q;
import ae.u;
import ae.v;
import af.c;
import af.j;
import bH.D;
import bH.c;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class a implements q {
  List a = new ArrayList();
  
  c b = new c();
  
  public String a() {
    return "MS2 B&G Firmware Loader";
  }
  
  public String b() {
    return "Firmware Loader for B&G Firmwares including MegaSquirt-II B&G, MShift and GPIO";
  }
  
  public List c() {
    ArrayList<c> arrayList = new ArrayList();
    arrayList.add(this.b);
    return arrayList;
  }
  
  public List d() {
    ArrayList<c> arrayList = new ArrayList();
    arrayList.add(this.b);
    return arrayList;
  }
  
  public cR a(bT parambT) {
    return null;
  }
  
  public cV b(bT parambT) {
    return null;
  }
  
  public boolean a(m paramm) {
    return ((paramm.b() | 0x1) == paramm.b());
  }
  
  public boolean a(k paramk) {
    List<File> list = paramk.d();
    for (byte b = 0; b < list.size(); b++) {
      try {
        ad.a a1 = paramk.c(list.get(b));
        if (a1.a().size() > 0) {
          int[] arrayOfInt = ((d)a1.a().get(0)).e();
          byte[] arrayOfByte = c.a(arrayOfInt);
          String str = new String(arrayOfByte);
          if (!str.contains("megasquirt2.s19") && !str.contains("microsquirt.s19") && !str.contains("microsquirt-module.s19") && !str.contains("ms2_extra.s19") && !str.contains("ms2_extra_us.s19") && !str.contains("trans.s19") && !str.contains("mspnp2.s19")) {
            File file = list.get(b);
            if ((file.getName().toLowerCase().startsWith("monitor") && file.getName().endsWith(".s19")) || (file.getName().toLowerCase().startsWith("lct") && file.getName().endsWith(".s19")) || (file.getName().toLowerCase().startsWith("pico") && file.getName().endsWith(".s19")))
              return true; 
          } 
        } 
      } catch (c c1) {
        Logger.getLogger(a.class.getName()).log(Level.SEVERE, (String)null, (Throwable)c1);
      } 
    } 
    D.b("Selected Firmware Package not suitable for MS2 B&G Firmware Loader Firmware Loader.");
    return false;
  }
  
  public d a(k paramk, p paramp, u paramu) {
    d d = null;
    d = j.a(paramp);
    if (d.a() == d.b)
      return d; 
    d = j.c(paramp);
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
      ad.a a1 = paramk.c(file);
      b b = new b(this);
      d = j.a(a1, paramp, paramu, b);
    } catch (c c1) {
      d.a(d.b);
      d.a("Unable to read S19 File.");
      D.a("Unable to parse S19 File: " + file.getAbsolutePath());
      c1.printStackTrace();
      return d;
    } catch (v v) {
      Logger.getLogger(c.class.getName()).log(Level.SEVERE, "Unexpected Protocol Error", (Throwable)v);
      d.a(d.b);
      d.a("Unexpected Protocol Error");
      return d;
    } 
    return d;
  }
  
  public boolean a(m paramm, File paramFile) {
    return ((paramm.b() & o.w) > 0 && (paramm.b() & o.E) <= 0);
  }
  
  public boolean b(m paramm, File paramFile) {
    return ((paramm.b() & o.w) > 0 && (paramm.b() & o.E) <= 0);
  }
  
  public String a(File paramFile) {
    return paramFile.getName().toLowerCase().startsWith("monitor") ? o.c : "";
  }
  
  public String e() {
    return "https://www.msefi.com/";
  }
  
  public bT a(p paramp) {
    return j.f(paramp);
  }
  
  public void f() {
    j.a();
  }
  
  public void a(String paramString) {}
  
  public boolean g() {
    return false;
  }
  
  public List b(m paramm) {
    return new ArrayList();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ag/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */