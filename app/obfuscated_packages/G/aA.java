package G;

import java.util.ArrayList;
import java.util.Iterator;

public class aA extends Q {
  private String a = null;
  
  private String b = null;
  
  private int c = -1;
  
  private ArrayList d = new ArrayList();
  
  private String e = null;
  
  private String f = null;
  
  private String g = null;
  
  public void a(aA paramaA) {
    this.d.add(paramaA);
  }
  
  public Iterator a() {
    return this.d.iterator();
  }
  
  public boolean b() {
    return (this.d.size() > 0);
  }
  
  public boolean c() {
    return (this.a != null && this.a.equals("std_separator"));
  }
  
  public void a(boolean paramBoolean) {
    if (paramBoolean) {
      this.a = "std_separator";
    } else {
      this.a = null;
    } 
  }
  
  public String d() {
    return this.a;
  }
  
  public void a(String paramString) {
    this.a = paramString;
  }
  
  public String e() {
    return this.b;
  }
  
  public void b(String paramString) {
    this.b = paramString;
  }
  
  public int f() {
    return this.c;
  }
  
  public void a(int paramInt) {
    this.c = paramInt;
  }
  
  public String g() {
    return this.e;
  }
  
  public void c(String paramString) {
    this.e = paramString;
  }
  
  public String h() {
    return this.f;
  }
  
  public void d(String paramString) {
    this.f = paramString;
  }
  
  public String i() {
    return this.g;
  }
  
  public void e(String paramString) {
    this.g = paramString;
  }
  
  public void a(String paramString1, String paramString2, String paramString3) {
    for (byte b = 0; b < this.d.size(); b++) {
      if (((aA)this.d.get(b)).d() != null && ((aA)this.d.get(b)).d().equals(paramString2)) {
        ((aA)this.d.get(b)).b(paramString3);
        ((aA)this.d.get(b)).d(paramString3);
      } 
    } 
  }
  
  public void a(String paramString, aA paramaA) {
    for (byte b = 0; b < this.d.size(); b++) {
      if (((aA)this.d.get(b)).d() != null && ((aA)this.d.get(b)).d().equals(paramString))
        this.d.set(b, paramaA); 
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/aA.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */