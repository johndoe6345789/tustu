package d;

import c.e;
import c.f;
import java.util.ArrayList;
import java.util.List;

public class i implements f {
  private String c;
  
  private String d;
  
  private String e = null;
  
  private String f = null;
  
  private e g = null;
  
  private int h = 1;
  
  List a = new ArrayList();
  
  i b = null;
  
  public i(String paramString1, String paramString2) {
    this.c = paramString1;
    this.d = paramString2;
  }
  
  public String c() {
    return this.c;
  }
  
  public String d() {
    return this.d;
  }
  
  public String e() {
    return (this.e == null) ? d() : this.e;
  }
  
  public void a(String paramString) {
    this.e = paramString;
  }
  
  public i a(i parami, String paramString) {
    i i1 = new i(parami.c, paramString);
    i1.e = parami.e;
    i1.g = parami.g;
    i1.h = parami.h;
    i1.a = parami.a;
    i1.f = parami.f;
    return i1;
  }
  
  public void b(String paramString) {
    this.d = paramString;
  }
  
  public int a() {
    return this.h;
  }
  
  public List b() {
    return this.a;
  }
  
  public void a(List paramList) {
    this.a = paramList;
  }
  
  public void a(int paramInt) {
    this.h = paramInt;
  }
  
  public String f() {
    return this.f;
  }
  
  public void c(String paramString) {
    this.f = paramString;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/d/i.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */