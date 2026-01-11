package ao;

import java.util.ArrayList;
import java.util.List;

public class bB {
  private String a;
  
  private String b;
  
  private String c = "";
  
  private List d = new ArrayList();
  
  public bB(String paramString1, String paramString2) {
    this.a = paramString1;
    this.b = paramString2;
  }
  
  public String a() {
    return this.a;
  }
  
  public String b() {
    return this.b;
  }
  
  public String c() {
    return this.c;
  }
  
  public void a(String paramString) {
    this.c = paramString;
  }
  
  public void b(String paramString) {
    this.d.add(paramString);
  }
  
  public List d() {
    return this.d;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/bB.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */