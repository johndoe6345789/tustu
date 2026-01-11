package A;

import java.util.HashMap;
import java.util.Map;

public class ClassType {
  private String b = null;
  
  private String c = null;
  
  private Class d = null;
  
  private i e = null;
  
  Map a = new HashMap<>();
  
  private static String f = "DEFAULT_INSTANCE";
  
  public String a() {
    return this.b;
  }
  
  public void a(String paramString) {
    this.b = paramString;
  }
  
  public void b(String paramString) {
    this.c = paramString;
  }
  
  public void a(Class paramClass) {
    this.d = paramClass;
  }
  
  public f c(String paramString) {
    if (paramString == null)
      paramString = f; 
    f f = (f)this.a.get(paramString);
    if (f == null) {
      if (b() == null) {
        f = this.d.newInstance();
      } else {
        f = b().a(this.b, paramString);
      } 
      this.a.put(paramString, f);
    } 
    return f;
  }
  
  public i b() {
    return this.e;
  }
  
  public void a(i parami) {
    this.e = parami;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/A/q.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */