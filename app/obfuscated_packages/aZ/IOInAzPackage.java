package aZ;

import ac.AcInterfaceOscar;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.StringTokenizer;

public IOInAzPackagelass IOInAzPackage {
  int a = 0;
  
  String b = "";
  
  BufferedInputStream c = null;
  
  int[] d = new int[] { 0 };
  
  int e = 0;
  
  String[] f = null;
  
  String[] g = null;
  
  int h = 0;
  
  long i = 0L;
  
  static int j = 1024;
  
  public void a(String paramString) {
    f();
    File file = new File(paramString);
    this.i = file.length();
    FileInputStream fileInputStream = new FileInputStream(file);
    this.c = new BufferedInputStream(fileInputStream);
  }
  
  public int[] a() {
    int i = (int)this.i;
    try {
      i = d();
    } catch (Exception exception) {}
    int[] arrayOfInt = new int[i];
    byte b = 0;
    this.c.skip(this.a);
    do {
      arrayOfInt[b] = this.c.read();
    } while (++b < arrayOfInt.length && arrayOfInt[b] != -1);
    return arrayOfInt;
  }
  
  public int b() {
    return this.h;
  }
  
  public int c() {
    int i = 0;
    int[] arrayOfInt = e();
    for (byte b = 0; b < arrayOfInt.length; b++)
      i += arrayOfInt[b]; 
    i += 4;
    return i;
  }
  
  public int d() {
    return c() * b();
  }
  
  public int[] e() {
    String[] arrayOfString = b(AcInterfaceOscar.c);
    this.e = 0;
    int[] arrayOfInt = new int[arrayOfString.length];
    for (byte b = 0; b < arrayOfInt.length; b++) {
      arrayOfInt[b] = Integer.parseInt(arrayOfString[b]);
      this.e = arrayOfInt[b];
    } 
    this.e = 4;
    return arrayOfInt;
  }
  
  private String[] b(String paramString) {
    String str = this.b.substring(this.b.indexOf('=', this.b.indexOf(paramString)) + 1, this.b.indexOf('\n', this.b.indexOf(paramString)));
    StringTokenizer stringTokenizer = new StringTokenizer(str, ";");
    String[] arrayOfString = new String[stringTokenizer.countTokens()];
    for (byte b = 0; stringTokenizer.hasMoreTokens(); b++)
      arrayOfString[b] = stringTokenizer.nextToken(); 
    return arrayOfString;
  }
  
  public void f() {
    if (this.c != null)
      try {
        this.c.close();
        this.d[0] = 0;
        this.f = null;
        this.g = null;
        this.e = 0;
      } catch (Exception exception) {} 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aZ/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */