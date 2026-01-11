package ah;

import G.bT;
import G.cR;
import G.cV;
import ae.d;
import ae.k;
import ae.m;
import ae.p;
import ae.q;
import ae.u;
import bH.D;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class b implements q {
  List a = new ArrayList();
  
  List b = new ArrayList();
  
  c c = new c();
  
  public b() {
    this.b.add(this.c);
  }
  
  public String a() {
    return "BigStuff3 Gen4 Firmware Loader";
  }
  
  public String b() {
    return "BigStuff3 Gen4 Type 1 Firmware Loader.";
  }
  
  public List c() {
    return this.b;
  }
  
  public List d() {
    return this.b;
  }
  
  public cR a(bT parambT) {
    return null;
  }
  
  public cV b(bT parambT) {
    return null;
  }
  
  public boolean a(m paramm) {
    return true;
  }
  
  public boolean a(k paramk) {
    return true;
  }
  
  public d a(k paramk, p paramp, u paramu) {
    d d = new d();
    int i = 120000;
    paramu.a("Installing Firmware. Do not power off!");
    paramu.a(0.0D);
    long l = System.currentTimeMillis();
    boolean bool = false;
    while (!bool) {
      try {
        Thread.sleep(1000L);
      } catch (InterruptedException interruptedException) {
        Logger.getLogger(b.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
      } 
      bool = this.c.a(paramp);
      D.c("boxIsBack = " + bool);
      if (bool) {
        paramu.a(1.0D);
        continue;
      } 
      if ((System.currentTimeMillis() - l) > i * 1.5D) {
        d.a(d.c);
        paramu.a("Controller should have responded by now. Disconnect Boot jump and power cycle.");
        return d;
      } 
      paramu.a(((float)(System.currentTimeMillis() - l) / i));
    } 
    if (System.currentTimeMillis() - l < (i / 3)) {
      d.a(d.b);
      String str = "Controller not Boot Strapped.\nMake sure Pin Y2 is to 12 Volts. Then Power Cycle.";
      paramu.a(str);
      d.a(str);
      return d;
    } 
    d.a(d.a);
    return d;
  }
  
  public boolean a(m paramm, File paramFile) {
    return true;
  }
  
  public boolean b(m paramm, File paramFile) {
    return true;
  }
  
  public String a(File paramFile) {
    return "Unverified BigStuff Gen4 firmware";
  }
  
  public String e() {
    return "https://bigstuff3efi.com/";
  }
  
  public bT a(p paramp) {
    return new bT();
  }
  
  public void f() {}
  
  public void a(String paramString) {}
  
  public boolean g() {
    return false;
  }
  
  public List b(m paramm) {
    return new ArrayList();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ah/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */