package ae;

import java.util.ArrayList;
import java.util.List;

public class a implements t {
  private String b = null;
  
  private String c = null;
  
  private int d = -1;
  
  private double e = 2.147483647E9D;
  
  private double f = -2.147483648E9D;
  
  List a = new ArrayList();
  
  private Object g = null;
  
  public String a() {
    return this.b;
  }
  
  public void a(String paramString) {
    this.b = paramString;
  }
  
  public void b(String paramString) {
    this.c = paramString;
  }
  
  public int b() {
    return this.d;
  }
  
  public void a(int paramInt) {
    this.d = paramInt;
  }
  
  public double c() {
    return this.e;
  }
  
  public double d() {
    return this.f;
  }
  
  public List e() {
    return this.a;
  }
  
  public boolean a(Object paramObject) {
    if (this.d == 2 || this.d == 0)
      return this.a.contains(paramObject); 
    if (this.d == 4)
      return paramObject instanceof Boolean; 
    if (paramObject instanceof Number) {
      Number number = (Number)paramObject;
      return (number.doubleValue() >= this.f && number.doubleValue() <= this.e);
    } 
    return false;
  }
  
  public Object f() {
    return this.g;
  }
  
  public void b(Object paramObject) {
    this.g = paramObject;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ae/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */