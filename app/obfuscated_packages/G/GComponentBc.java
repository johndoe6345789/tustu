package G;

import java.io.Serializable;

public class GComponentBc extends bv implements Serializable {
  private String a = null;
  
  private String f = "52";
  
  private int g = 255;
  
  public String a() {
    return this.f;
  }
  
  public boolean b() {
    try {
      int i = Integer.parseInt(this.f);
    } catch (Exception exception) {
      return false;
    } 
    return true;
  }
  
  public void a(String paramString) {
    this.f = paramString;
  }
  
  public void a(int paramInt) {
    this.g = paramInt;
  }
  
  public int c() {
    return this.g;
  }
  
  public String d() {
    return this.a;
  }
  
  public void b(String paramString) {
    this.a = paramString;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/bc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */