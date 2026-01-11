package G;

import V.ExceptionPrintstacktrace;
import bH.c;

public class aK extends aM {
  public int a() {
    return super.a();
  }
  
  public int b() {
    return super.b();
  }
  
  public void a(Y paramY, double paramDouble) {}
  
  public void a(String paramString) {
    super.a("array");
  }
  
  public A c() {
    A a = super.c();
    return new A(a.a(), a.b() / 2);
  }
  
  public double a(int paramInt) {
    return super.a(1 + paramInt * 2);
  }
  
  public double b(int paramInt) {
    return super.b(1 + paramInt * 2);
  }
  
  public int[][] a(Y paramY) {
    if (ExceptionPrintstacktrace() + a() * m() * e() > paramY.c(d())) {
      String str = "Attempt to retrieve data beyond page size!\n\tCheck offset and size for parameter:" + aL();
      throw new ExceptionPrintstacktrace(str);
    } 
    int[][] arrayOfInt = new int[a()][m()];
    int i = ExceptionPrintstacktrace() + e();
    for (byte b = 0; b < arrayOfInt.length; b++) {
      for (byte b1 = 0; b1 < (arrayOfInt[0]).length; b1++) {
        byte b2;
        byte b3;
        if (L()) {
          b2 = c().b() - b - 1;
          b3 = c().a() - b1 - 1;
        } else {
          b2 = b;
          b3 = b1;
        } 
        arrayOfInt[b2][b3] = c.b(paramY.b(d()), i, e(), o(paramY), A());
        if (O()) {
          int j = (int)Math.floor((float)(b(b2) / F().a(i) - G().a()));
          if (arrayOfInt[b2][b3] > j)
            arrayOfInt[b2][b3] = (byte)arrayOfInt[b2][b3]; 
        } 
        i += e() * 2;
      } 
    } 
    return arrayOfInt;
  }
  
  public void a(Y paramY, double[][] paramArrayOfdouble) {}
  
  protected void a(Y paramY, int paramInt1, int paramInt2, int[] paramArrayOfint, boolean paramBoolean) {}
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/aK.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */