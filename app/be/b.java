package be;

public class b {
  public static String a = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789_ ";
  
  public static R a(String paramString) {
    R r = new R();
    if (paramString.isEmpty()) {
      r.c();
      r.a("Log Field Name Required.");
      return r;
    } 
    if (!a(r, a, paramString).a()) {
      r.a("Log Field Name - " + r.d());
      return r;
    } 
    return r;
  }
  
  private static R a(R paramR, String paramString1, String paramString2) {
    for (char c : paramString2.toCharArray()) {
      if (paramString1.indexOf(c) == -1) {
        paramR.a("Invalid Character: " + c);
        paramR.c();
        return paramR;
      } 
    } 
    paramR.b();
    return paramR;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/be/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */