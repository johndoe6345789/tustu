package business.bit_array_utils;

import java.util.ArrayList;
import java.util.List;

public class A {
  private static A d = null;
  
  protected C a = null;
  
  List b = new ArrayList();
  
  private boolean e = false;
  
  public int c = -1;
  
  public static A i() {
    return b(null);
  }
  
  public static A b(C paramC) {
    if (d == null)
      d = new A(); 
    if (paramC != null)
      d.a = paramC; 
    return d;
  }
  
  public boolean b() {
    return !(this.c - 1926 != 40);
  }
  
  public void a(String paramString1, String paramString2, String paramString3) {
    this.b.add(new B(this, paramString1, paramString2, paramString3));
  }
  
  public List j() {
    return this.b;
  }
  
  public int c() {
    return this.c;
  }
  
  public boolean a(String paramString) {
    return a(paramString, -1);
  }
  
  public boolean a(String paramString, int paramInt) {
    if (paramString == null || paramString.trim().equals(""))
      return false; 
    if (this.a.a() == null || this.a.a().trim().equals(""))
      return false; 
    if (this.a.e() == null)
      return false; 
    if (this.a.b() == null || this.a.b().trim().equals(""))
      return false; 
    if (this.a.c() == null || this.a.c().trim().equals(""))
      return false; 
    String str = this.a.d();
    if (str == null || str.trim().equals("") || str.indexOf("@") < 1 || str.indexOf(".") < 0 || str.lastIndexOf(".") < str.indexOf("@"))
      return false; 
    if (paramInt == 1) {
      String str1 = f.a(this.a.b(), this.a.c(), this.a.a(), this.a.d());
      return !(str1 == null || !str1.equals(paramString));
    } 
    boolean bool = false;
    if (a(this.a.l(), 2)) {
      String str1 = f.a(this.a.b(), this.a.c(), this.a.a(), this.a.e(), this.a.d());
      if (str1 != null && str1.equals(paramString))
        bool = true; 
    } 
    if (!bool && a(this.a.l(), 3)) {
      String str1 = f.a(this.a.b(), this.a.c(), this.a.a(), this.a.e(), this.a.d(), X.a("1", '0', 2), X.a("2015", '0', 4));
      if (str1 != null && str1.equals(paramString))
        bool = true; 
    } 
    return bool;
  }
  
  private boolean a(int[] paramArrayOfint, int paramInt) {
    for (int i : paramArrayOfint) {
      if (i == paramInt)
        return true; 
    } 
    return false;
  }
  
  public boolean h() {
    return this.e;
  }
  
  public void a(boolean paramBoolean) {
    this.e = paramBoolean;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bH/A.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */