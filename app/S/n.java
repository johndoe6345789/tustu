package S;

import G.T;
import W.ap;
import d.c;
import d.g;
import d.m;

public class n extends h implements k {
  private ap c = null;
  
  private String d = null;
  
  public n() {
    a(new o(this));
  }
  
  public void d(String paramString) {
    super.d(paramString);
    i(paramString);
  }
  
  public ap h() {
    return this.c;
  }
  
  public void a(ap paramap) {
    this.c = paramap;
  }
  
  public void h(String paramString) {
    if (h() != null) {
      e(a(paramString, "triggerExpression", ""));
      f(a(paramString, "resetExpression", ""));
      j(a(paramString, "targetAction", ""));
      try {
        int i = Integer.parseInt(a(paramString, "resetDelay", ""));
        a(i);
      } catch (Exception exception) {
        a(-1);
      } 
      b(false);
      a(Boolean.parseBoolean(a(paramString, "active", "false")));
    } 
  }
  
  public void i(String paramString) {
    b(paramString, "triggerExpression", d());
    b(paramString, "resetExpression", e());
    b(paramString, "targetAction", this.d);
    b(paramString, "resetDelay", Integer.toString(g()));
    b(paramString, "triggered", Boolean.toString(b()));
    b(paramString, "active", Boolean.toString(c()));
  }
  
  private String a(String paramString1, String paramString2) {
    if (paramString1.isEmpty() || T.a().c() == null || (T.a().c() != null && T.a().c().c().equals(paramString1))) {
      paramString1 = "";
    } else {
      paramString1 = paramString1 + ".";
    } 
    return paramString1 + paramString2;
  }
  
  private String a(String paramString1, String paramString2, String paramString3) {
    if (h() != null) {
      String str = a(paramString1, paramString2);
      return h().b(str, paramString3);
    } 
    return paramString3;
  }
  
  private void b(String paramString1, String paramString2, String paramString3) {
    if (h() != null && paramString3 != null) {
      String str = a(paramString1, paramString2);
      h().a(str, paramString3);
    } 
  }
  
  public String i() {
    return this.d;
  }
  
  public void j(String paramString) {
    this.d = paramString;
  }
  
  public void d_() {
    if (this.d != null) {
      c c = g.a().b(this.d);
      if (c instanceof m)
        ((m)c).n(); 
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/S/n.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */