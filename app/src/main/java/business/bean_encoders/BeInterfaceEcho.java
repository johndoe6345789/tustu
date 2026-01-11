package be;

import G.i;

class BeInterfaceEcho implements S {
  e(c paramc) {}
  
  public R a(String paramString) {
    R r = new R();
    if (paramString.length() == 0) {
      r.a("Channel Name Required");
      r.c();
      return r;
    } 
    if (i.c(paramString)) {
      r.a("Channel Name cannot have special characters");
      r.c();
      return r;
    } 
    r.b();
    return r;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/be/e.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */