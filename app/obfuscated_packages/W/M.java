package W;

import bH.X;

public class M {
  private String a = null;
  
  private String b = null;
  
  private String c = null;
  
  private int d = -1;
  
  private String e = null;
  
  public M() {}
  
  public M(String paramString) {
    this.e = paramString;
  }
  
  public String a() {
    return this.a;
  }
  
  public void a(String paramString, int paramInt) {
    this.a = paramString;
    this.d = paramInt;
    int i = X.a(paramString, ';');
    if (i != -1) {
      this.b = paramString.substring(0, i).trim();
      if (paramString.length() > i + 1)
        this.c = paramString.substring(i + 1); 
    } else {
      this.b = paramString.trim();
    } 
  }
  
  public String b() {
    return this.b;
  }
  
  public int c() {
    return this.d;
  }
  
  public boolean d() {
    return (b() == null || b().equals(""));
  }
  
  public String e() {
    return Q.a(b());
  }
  
  public String f() {
    try {
      return Q.b(b());
    } catch (Exception exception) {
      return "";
    } 
  }
  
  public String toString() {
    String str = "";
    if (g() != null && !this.e.equals(""))
      str = str + "[" + g() + "]:"; 
    if (c() > 0)
      str = str + "[Line:" + c() + "]: "; 
    if (b().trim().equals("")) {
      str = "BLANK ROW";
    } else {
      str = str + a();
    } 
    return str;
  }
  
  public String g() {
    return this.e;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/W/M.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */