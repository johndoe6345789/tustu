package af;

import G.bT;
import G.cR;
import G.cV;
import J.f;
import J.g;
import ad.a;
import ad.d;
import ae.d;
import ae.k;
import ae.m;
import ae.o;
import ae.p;
import ae.u;
import ae.v;
import bH.D;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class c implements n {
  cV a = null;
  
  cR b = null;
  
  cV c = (cV)new g();
  
  cR d = (cR)new f();
  
  List e = new ArrayList();
  
  k f = new k(this);
  
  b g = new b();
  
  public static String h = "https://www.msextra.com/forums/viewforum.php?f=101";
  
  public static String i = "https://www.msextra.com/forums/viewforum.php?f=138";
  
  private String k = h;
  
  boolean j = true;
  
  public String a() {
    return "MS2 Extra Firmware Loader";
  }
  
  public String b() {
    return "Firmware loader for loading MS2 Extra version 3.3 and up Firmware.";
  }
  
  public List c() {
    ArrayList<k> arrayList = new ArrayList();
    arrayList.add(this.f);
    if (this.j)
      arrayList.add(this.g); 
    return arrayList;
  }
  
  public List d() {
    ArrayList<b> arrayList = new ArrayList();
    if (this.j)
      arrayList.add(this.g); 
    arrayList.add(this.f);
    return arrayList;
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
  
  public boolean a(m paramm) {
    return ((paramm.b() | 0x1) == paramm.b());
  }
  
  public boolean a(k paramk) {
    List<File> list = paramk.d();
    for (byte b1 = 0; b1 < list.size(); b1++) {
      try {
        a a = paramk.c(list.get(b1));
        if (a.a().size() > 0) {
          int[] arrayOfInt = ((d)a.a().get(0)).e();
          byte[] arrayOfByte = bH.c.a(arrayOfInt);
          String str = new String(arrayOfByte);
          if (str.contains("megasquirt2.s19") || str.contains("microsquirt.s19") || str.contains("microsquirt-module.s19") || str.contains("ms2_extra.s19") || str.contains("ms2_extra_us.s19") || str.contains("mspnp2.s19")) {
            this.j = true;
            this.f.a(false);
            return true;
          } 
          if (str.contains("trans.s19"))
            this.j = false; 
        } 
        File file = list.get(b1);
        if ((file.getName().startsWith("iobox") && file.getName().endsWith(".s19")) || (file.getName().startsWith("trans") && file.getName().endsWith(".s19")))
          return true; 
      } catch (ad.c c1) {
        Logger.getLogger(c.class.getName()).log(Level.SEVERE, (String)null, (Throwable)c1);
      } 
    } 
    D.b("Selected Firmware Package not suitable for MS2e Firmware Loader.");
    return false;
  }
  
  public boolean a(m paramm, File paramFile) {
    if (paramFile.getName().startsWith("trans")) {
      this.k = i;
    } else {
      this.k = h;
    } 
    return (paramFile.getName().equals("microsquirt.s19") || (paramFile.getName().startsWith("iobox") && paramFile.getName().endsWith(".s19")) || (paramFile.getName().startsWith("trans") && paramFile.getName().endsWith(".s19"))) ? (((paramm.b() & o.D) > 0)) : (paramFile.getName().equals("microsquirt-module.s19") ? (((paramm.b() & o.G) > 0)) : (paramFile.getName().equals("mspnp2.s19") ? (((paramm.b() & o.E) > 0)) : (paramFile.getName().equals("megasquirt2.s19") ? (((paramm.b() & o.w) > 0)) : false)));
  }
  
  public boolean b(m paramm, File paramFile) {
    return paramFile.getName().equals("microsquirt.s19") ? (((paramm.b() & o.D) > 0)) : (paramFile.getName().equals("microsquirt-module.s19") ? (((paramm.b() & o.G) > 0)) : (paramFile.getName().equals("mspnp2.s19") ? (((paramm.b() & o.E) > 0)) : (paramFile.getName().equals("megasquirt2.s19") ? (((paramm.b() & o.C) > 0)) : (paramFile.getName().equals("trans.s19") ? (((paramm.b() & o.w) > 0)) : (paramFile.getName().equals("iobox.s19") ? (((paramm.b() & o.w) > 0)) : false)))));
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
      a a = paramk.c(file);
      d d1 = new d(this);
      d = j.a(a, paramp, paramu, d1);
    } catch (ad.c c1) {
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
  
  public String e() {
    return this.k;
  }
  
  public bT a(p paramp) {
    return j.f(paramp);
  }
  
  public void f() {
    j.a();
  }
  
  public String a(File paramFile) {
    return paramFile.getName().equalsIgnoreCase("megasquirt2.s19") ? o.f : ((paramFile.getName().equalsIgnoreCase("microsquirt.s19") || paramFile.getName().equalsIgnoreCase("ms2_extra_us.s19")) ? o.e : (paramFile.getName().equalsIgnoreCase("microsquirt-module.s19") ? o.g : (paramFile.getName().equalsIgnoreCase("ms2_extra.s19") ? o.c : (paramFile.getName().equalsIgnoreCase("ms2_extra_us.s19") ? o.g : (paramFile.getName().equalsIgnoreCase("mspnp2.s19") ? o.i : (paramFile.getName().equalsIgnoreCase("trans.s19") ? o.c : ""))))));
  }
  
  public void a(String paramString) {}
  
  public boolean g() {
    return false;
  }
  
  public List b(m paramm) {
    return new ArrayList();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/af/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */