package business.bean_encoders;

import G.GInterfaceAi;
import G.i;

class BeInterfaceFoxtrot implements S {
  f(c paramc) {}
  
  public R a(String paramString) {
    R r = new R();
    if (paramString.trim().isEmpty()) {
      r.c();
      r.a("You must define an expression");
      return r;
    } 
    try {
      i.a(paramString, (GInterfaceAi)this.a.i);
    } catch (Exception exception) {
      r.c();
      if (exception.getMessage() == null || exception.getMessage().length() < 10) {
        r.a("Invalid Expression");
      } else {
        r.a(exception.getMessage());
      } 
      return r;
    } 
    r.b();
    return r;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/be/f.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */