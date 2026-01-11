package ak;

import W.T;
import W.k;

public class AkComponentDelta implements T {
  private String b = "";
  
  private String c = "";
  
  private String d = null;
  
  private int e = -1;
  
  private int f = 0;
  
  private float g = 1.0F;
  
  private float h = 0.0F;
  
  private float i = Float.NaN;
  
  private float j = Float.NaN;
  
  k a = null;
  
  public AkComponentDelta() {}
  
  public AkComponentDelta(String paramString1, String paramString2) {
    a(paramString1);
    b(paramString2);
  }
  
  public String a() {
    return this.b;
  }
  
  public void a(String paramString) {
    this.b = paramString;
  }
  
  public String b() {
    return this.c;
  }
  
  public void b(String paramString) {
    String str = paramString.replace("�", "°");
    if (str.length() > 8)
      str = str.substring(0, 8); 
    this.c = str;
  }
  
  public int e() {
    return this.e;
  }
  
  public void a(int paramInt) {
    this.e = paramInt;
  }
  
  public int f() {
    return this.f;
  }
  
  public void b(int paramInt) {
    this.f = paramInt;
  }
  
  public float d() {
    return this.g;
  }
  
  public float c() {
    return this.h;
  }
  
  public void a(float paramFloat) {
    this.g = paramFloat;
  }
  
  public void b(float paramFloat) {
    this.h = paramFloat;
  }
  
  public void a(k paramk) {
    this.a = paramk;
  }
  
  public k g() {
    return this.a;
  }
  
  public String toString() {
    return "BasicLogFieldDescriptor{headerName=" + this.b + ", units='" + this.c + "'}";
  }
  
  public float h() {
    return this.i;
  }
  
  public void c(float paramFloat) {
    this.i = paramFloat;
  }
  
  public float i() {
    return this.j;
  }
  
  public void d(float paramFloat) {
    this.j = paramFloat;
  }
  
  public String j() {
    return this.d;
  }
  
  public void c(String paramString) {
    this.d = paramString;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ak/d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */