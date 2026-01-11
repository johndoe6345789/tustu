package S;

import G.T;
import W.ap;

public class j extends h {
  private ap c = null;
  
  private boolean d = true;
  
  public void d(String paramString) {
    super.d(paramString);
    i(paramString);
  }
  
  public ap h() {
    return b.a().b();
  }
  
  public void h(String paramString) {
    if (h() != null) {
      e(a(paramString, "triggerExpression", ""));
      f(a(paramString, "resetExpression", ""));
      b(false);
      a(Boolean.parseBoolean(a(paramString, "active", "false")));
    } 
  }
  
  public void i(String paramString) {
    b(paramString, "triggerExpression", d());
    b(paramString, "resetExpression", e());
    b(paramString, "triggered", Boolean.toString(b()));
    b(paramString, "active", Boolean.toString(c()));
  }
  
  private String a(String paramString1, String paramString2) {
    if (T.a().c() == null || (T.a().c() != null && T.a().c().c().equals(paramString1))) {
      paramString1 = "";
    } else {
      paramString1 = paramString1 + ".";
    } 
    return "EventTrigger:" + a() + ":" + paramString1 + paramString2;
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
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/S/j.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */