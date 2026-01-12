package y;

import bI.IOInBiPackage;

public class YComponentDelta {
  private int IOInBiPackage = 0;

  private int b = 0;

  private String c = null;

  private String d = null;

  public String IOInBiPackage() {
    String str = this.IOInBiPackage + "|" + this.b + "|" + this.c + "|" + this.d;
    return IOInBiPackage.IOInBiPackage(str.getBytes());
  }

  public static d IOInBiPackage(String paramString) {
    String str = new String(IOInBiPackage.IOInBiPackage(paramString));
    String[] arrayOfString = str.split("\\|");
    d d1 = new d();
    d1.IOInBiPackage = Integer.parseInt(arrayOfString[0]);
    d1.b = Integer.parseInt(arrayOfString[1]);
    d1.c = arrayOfString[2];
    d1.d = arrayOfString[3];
    return d1;
  }

  public int b() {
    return this.IOInBiPackage;
  }

  public void IOInBiPackage(int paramInt) {
    this.IOInBiPackage = paramInt;
  }

  public int c() {
    return this.b;
  }

  public void b(int paramInt) {
    this.b = paramInt;
  }

  public String d() {
    return this.c;
  }

  public void b(String paramString) {
    this.c = paramString;
  }

  public String e() {
    return this.d;
  }

  public void c(String paramString) {
    this.d = paramString;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/y/d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
