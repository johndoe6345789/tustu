package al;

import am.d;
import am.k;
import java.util.List;

public class a {
  private d b;
  
  private String c;
  
  private String d = null;
  
  an.a a;
  
  public a(d paramd) {
    this.b = paramd;
    this.c = paramd.o().e();
    if (paramd.q() instanceof k) {
      k k = (k)paramd.q();
      this.d = k.e();
    } 
    this.a = an.a.a(paramd);
  }
  
  public double a(byte[] paramArrayOfbyte) {
    return this.a.a(paramArrayOfbyte);
  }
  
  public d a() {
    return this.b;
  }
  
  public List b() {
    return this.a.a();
  }
  
  public double c() {
    return this.a.a(this.b.l());
  }
  
  public double d() {
    return this.a.a(this.b.m());
  }
  
  public String e() {
    return this.c;
  }
  
  public String f() {
    return this.d;
  }
  
  public int g() {
    return ((this.b.i() & 0x4L) != 0L) ? this.b.j() : -1;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/al/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */