package G;

import java.io.Serializable;

public class GComponentBl extends bA implements Serializable {
  public static int a = 0;
  
  public static int b = 1;
  
  public static int c = 2;
  
  public static int d = 4;
  
  public static int e = 8;
  
  public static int f = b + c;
  
  private String g = null;
  
  private int h = a;
  
  private String i = "";
  
  public String b() {
    return null;
  }
  
  public String a() {
    return this.g;
  }
  
  public void a(String paramString) {
    this.g = paramString;
  }
  
  public int c() {
    return this.h;
  }
  
  public void a(int paramInt) {
    this.h |= paramInt;
  }
  
  public boolean b(int paramInt) {
    return (this.h > 0 && (this.h | paramInt) == this.h);
  }
  
  public String d() {
    return this.i;
  }
  
  public void b(String paramString) {
    this.i = paramString;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/bl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */