package business.bean_encoders.bE_components;

import W.j;
import java.util.ArrayList;
import java.util.List;

public class BeInterfaceAlpha implements p {
  j c = new j();
  
  j d = new j();
  
  j e = new j();
  
  List f = new ArrayList();
  
  public void a(float paramFloat1, float paramFloat2, float paramFloat3) {
    this.c.a(paramFloat1);
    this.d.a(paramFloat2);
    this.e.a(paramFloat3);
  }
  
  public void a(double paramDouble) {
    this.c.d((float)paramDouble);
  }
  
  public void b(double paramDouble) {
    this.c.e((float)paramDouble);
  }
  
  public void c(double paramDouble) {
    this.d.d((float)paramDouble);
  }
  
  public void d(double paramDouble) {
    this.d.e((float)paramDouble);
  }
  
  public void e(double paramDouble) {
    this.e.d((float)paramDouble);
  }
  
  public void f(double paramDouble) {
    this.e.e((float)paramDouble);
  }
  
  public double a() {
    return this.c.e();
  }
  
  public double b() {
    return this.c.f();
  }
  
  public double c() {
    return this.d.e();
  }
  
  public double d() {
    return this.d.f();
  }
  
  public double h() {
    return this.e.e();
  }
  
  public double i() {
    return this.e.f();
  }
  
  public q b(int paramInt) {
    boolean bool = false;
    return bool ? new c(this.c.c(paramInt), this.d.c(paramInt), this.e.c(paramInt)) : new b(this.c.c(paramInt), this.d.c(paramInt), this.e.c(paramInt));
  }
  
  public int e() {
    return this.d.i();
  }
  
  public int f() {
    return 0;
  }
  
  public void a(l paraml) {
    this.f.add(paraml);
  }
  
  public void b(l paraml) {
    this.f.remove(paraml);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bE/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */