package G;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class am implements Serializable {
  R a;
  
  private String c = "showPanel";
  
  List b = new ArrayList();
  
  private String d = null;
  
  public am(R paramR) {
    this.a = paramR;
  }
  
  public R a() {
    return this.a;
  }
  
  public void a(String paramString) {
    this.b.add(paramString);
  }
  
  public String a(int paramInt) {
    return this.b.get(paramInt);
  }
  
  public String b() {
    return this.d;
  }
  
  public void b(String paramString) {
    this.d = paramString;
  }
  
  public String c() {
    return this.c;
  }
  
  public void c(String paramString) {
    this.c = paramString;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/am.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */