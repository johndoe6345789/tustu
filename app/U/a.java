package U;

import S.g;
import S.j;
import W.ap;

public class a implements g {
  public static String a = "Data log";
  
  public static String b = "Stop Data log";
  
  private ap e = null;
  
  j c = null;
  
  j d = null;
  
  public S.a a(String paramString1, String paramString2) {
    if (paramString2.equals(a)) {
      if (this.c != null)
        return (S.a)this.c; 
      this.c = new j();
      this.c.g(paramString2);
      this.c.e("0");
      this.c.f("0");
      if (this.e != null)
        this.c.h(paramString1); 
      return (S.a)this.c;
    } 
    if (paramString2.equals(b)) {
      if (this.d != null)
        return (S.a)this.d; 
      this.d = new j();
      this.d.g(paramString2);
      this.d.e("0");
      this.d.f("0");
      if (this.e != null)
        this.d.h(paramString1); 
      return (S.a)this.d;
    } 
    return null;
  }
  
  public void a(ap paramap) {
    this.e = paramap;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/U/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */