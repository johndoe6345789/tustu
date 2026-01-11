package A;

import java.util.ArrayList;
import java.util.List;

public class AInterfaceBravo implements r {
  private String b = null;
  
  private String c = null;
  
  private int d = -1;
  
  private double e = 2.147483647E9D;
  
  private double f = -2.147483648E9D;
  
  List a = new ArrayList();
  
  public String c() {
    return this.b;
  }
  
  public void a(String paramString) {
    this.b = paramString;
  }
  
  public String d() {
    return this.c;
  }
  
  public void b(String paramString) {
    this.c = paramString;
  }
  
  public int a() {
    return this.d;
  }
  
  public void a(int paramInt) {
    this.d = paramInt;
  }
  
  public double e() {
    return this.e;
  }
  
  public void a(double paramDouble) {
    this.e = paramDouble;
  }
  
  public double f() {
    return this.f;
  }
  
  public void b(double paramDouble) {
    this.f = paramDouble;
  }
  
  public List b() {
    return this.a;
  }
  
  public void a(Object paramObject) {
    this.a.add(paramObject);
  }
  
  public boolean b(Object paramObject) {
    if (this.d == 2 || this.d == 4)
      return this.a.contains(paramObject); 
    if (paramObject instanceof Number) {
      Number number = (Number)paramObject;
      return (number.doubleValue() >= this.f && number.doubleValue() <= this.e);
    } 
    return true;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/A/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */