package V;

public class d extends Exception {
  public static int a = 2;
  
  public static int b = 1;
  
  private int c = 0;
  
  private int[] d = null;
  
  private int e = 0;
  
  private int f = a;
  
  private String g = null;
  
  private String h = null;
  
  public d(String paramString) {
    super(paramString);
    this.g = paramString;
  }
  
  public int a() {
    return this.c;
  }
  
  public void a(int paramInt) {
    this.c = paramInt;
  }
  
  public void a(int[] paramArrayOfint) {
    this.d = paramArrayOfint;
  }
  
  public void b(int paramInt) {
    this.e = paramInt;
  }
  
  public String getMessage() {
    return this.g;
  }
  
  public void a(String paramString) {
    this.g = paramString;
  }
  
  public void b(String paramString) {
    this.h = paramString;
  }
  
  public String b() {
    return this.h;
  }
  
  public String toString() {
    return "Error Code: 0x" + Integer.toHexString(this.c).toUpperCase() + ", message: " + this.g;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/V/d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */