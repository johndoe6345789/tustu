package z;

import G.R;
import G.aF;
import bH.D;
import java.util.ArrayList;
import java.util.Iterator;

public class ZComponentAlpha {
  R a = null;
  
  e b = null;
  
  String c = "9600";
  
  int d = 15;
  
  ArrayList e = new ArrayList();
  
  b f = null;
  
  private String g = "115200";
  
  private String h = "COM1";
  
  private boolean i = false;
  
  public ZComponentAlpha(R paramR) {
    this.a = paramR;
    this.b = (e)this.a.C();
  }
  
  public void a() {
    if (this.f != null && this.f.a())
      return; 
    this.f = new b(this);
    this.f.start();
  }
  
  public void b() {
    if (this.f != null)
      this.f.a(false); 
  }
  
  public boolean c() {
    return !(this.f == null || !this.f.a());
  }
  
  private void a(byte[] paramArrayOfbyte) {
    Iterator<aF> iterator = this.e.iterator();
    while (iterator.hasNext()) {
      try {
        ((aF)iterator.next()).a(this.a.c(), paramArrayOfbyte);
      } catch (Exception exception) {
        D.a("Exception while notifiying BurstMode OchListener");
        exception.printStackTrace();
      } 
    } 
  }
  
  public void a(aF paramaF) {
    this.e.add(paramaF);
  }
  
  public void b(aF paramaF) {
    this.e.remove(paramaF);
  }
  
  public String d() {
    return this.g;
  }
  
  public void a(String paramString) {
    this.g = paramString;
  }
  
  public String e() {
    return this.h;
  }
  
  public void b(String paramString) {
    this.h = paramString;
  }
  
  public boolean f() {
    return this.i;
  }
  
  public void a(boolean paramBoolean) {
    this.i = paramBoolean;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/z/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */