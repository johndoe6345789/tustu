package a;

import java.io.Serializable;

public class b implements Serializable, Cloneable {
  private double[][] a;
  
  private int b;
  
  private int c;
  
  public b(int paramInt1, int paramInt2) {
    this.b = paramInt1;
    this.c = paramInt2;
    this.a = new double[paramInt1][paramInt2];
  }
  
  public b(double[][] paramArrayOfdouble) {
    this.b = paramArrayOfdouble.length;
    this.c = (paramArrayOfdouble[0]).length;
    for (byte b1 = 0; b1 < this.b; b1++) {
      if ((paramArrayOfdouble[b1]).length != this.c)
        throw new IllegalArgumentException("All rows must have the same length."); 
    } 
    this.a = paramArrayOfdouble;
  }
  
  public b(double[][] paramArrayOfdouble, int paramInt1, int paramInt2) {
    this.a = paramArrayOfdouble;
    this.b = paramInt1;
    this.c = paramInt2;
  }
  
  public b a() {
    b b1 = new b(this.b, this.c);
    double[][] arrayOfDouble = b1.b();
    for (byte b2 = 0; b2 < this.b; b2++) {
      for (byte b3 = 0; b3 < this.c; b3++)
        arrayOfDouble[b2][b3] = this.a[b2][b3]; 
    } 
    return b1;
  }
  
  public Object clone() {
    return a();
  }
  
  public double[][] b() {
    return this.a;
  }
  
  public double[][] c() {
    double[][] arrayOfDouble = new double[this.b][this.c];
    for (byte b1 = 0; b1 < this.b; b1++) {
      for (byte b2 = 0; b2 < this.c; b2++)
        arrayOfDouble[b1][b2] = this.a[b1][b2]; 
    } 
    return arrayOfDouble;
  }
  
  public int d() {
    return this.b;
  }
  
  public int e() {
    return this.c;
  }
  
  public double a(int paramInt1, int paramInt2) {
    return this.a[paramInt1][paramInt2];
  }
  
  public b a(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    b b1 = new b(paramInt2 - paramInt1 + 1, paramInt4 - paramInt3 + 1);
    double[][] arrayOfDouble = b1.b();
    try {
      for (int i = paramInt1; i <= paramInt2; i++) {
        for (int j = paramInt3; j <= paramInt4; j++)
          arrayOfDouble[i - paramInt1][j - paramInt3] = this.a[i][j]; 
      } 
    } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
      throw new ArrayIndexOutOfBoundsException("Submatrix indices");
    } 
    return b1;
  }
  
  public b a(int[] paramArrayOfint, int paramInt1, int paramInt2) {
    b b1 = new b(paramArrayOfint.length, paramInt2 - paramInt1 + 1);
    double[][] arrayOfDouble = b1.b();
    try {
      for (byte b2 = 0; b2 < paramArrayOfint.length; b2++) {
        for (int i = paramInt1; i <= paramInt2; i++)
          arrayOfDouble[b2][i - paramInt1] = this.a[paramArrayOfint[b2]][i]; 
      } 
    } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
      throw new ArrayIndexOutOfBoundsException("Submatrix indices");
    } 
    return b1;
  }
  
  public b f() {
    b b1 = new b(this.c, this.b);
    double[][] arrayOfDouble = b1.b();
    for (byte b2 = 0; b2 < this.b; b2++) {
      for (byte b3 = 0; b3 < this.c; b3++)
        arrayOfDouble[b3][b2] = this.a[b2][b3]; 
    } 
    return b1;
  }
  
  public b a(b paramb) {
    e(paramb);
    b b1 = new b(this.b, this.c);
    double[][] arrayOfDouble = b1.b();
    for (byte b2 = 0; b2 < this.b; b2++) {
      for (byte b3 = 0; b3 < this.c; b3++)
        arrayOfDouble[b2][b3] = this.a[b2][b3] + paramb.a[b2][b3]; 
    } 
    return b1;
  }
  
  public b b(b paramb) {
    e(paramb);
    b b1 = new b(this.b, this.c);
    double[][] arrayOfDouble = b1.b();
    for (byte b2 = 0; b2 < this.b; b2++) {
      for (byte b3 = 0; b3 < this.c; b3++)
        arrayOfDouble[b2][b3] = this.a[b2][b3] - paramb.a[b2][b3]; 
    } 
    return b1;
  }
  
  public b a(double paramDouble) {
    b b1 = new b(this.b, this.c);
    double[][] arrayOfDouble = b1.b();
    for (byte b2 = 0; b2 < this.b; b2++) {
      for (byte b3 = 0; b3 < this.c; b3++)
        arrayOfDouble[b2][b3] = paramDouble * this.a[b2][b3]; 
    } 
    return b1;
  }
  
  public b c(b paramb) {
    if (paramb.b != this.c)
      throw new IllegalArgumentException("Matrix inner dimensions must agree."); 
    b b1 = new b(this.b, paramb.c);
    double[][] arrayOfDouble = b1.b();
    double[] arrayOfDouble1 = new double[this.c];
    for (byte b2 = 0; b2 < paramb.c; b2++) {
      byte b3;
      for (b3 = 0; b3 < this.c; b3++)
        arrayOfDouble1[b3] = paramb.a[b3][b2]; 
      for (b3 = 0; b3 < this.b; b3++) {
        double[] arrayOfDouble2 = this.a[b3];
        double d = 0.0D;
        for (byte b4 = 0; b4 < this.c; b4++)
          d += arrayOfDouble2[b4] * arrayOfDouble1[b4]; 
        arrayOfDouble[b3][b2] = d;
      } 
    } 
    return b1;
  }
  
  public b d(b paramb) {
    return (this.b == this.c) ? (new a(this)).a(paramb) : (new c(this)).a(paramb);
  }
  
  public b g() {
    return d(b(this.b, this.b));
  }
  
  public static b b(int paramInt1, int paramInt2) {
    b b1 = new b(paramInt1, paramInt2);
    double[][] arrayOfDouble = b1.b();
    for (byte b2 = 0; b2 < paramInt1; b2++) {
      for (byte b3 = 0; b3 < paramInt2; b3++)
        arrayOfDouble[b2][b3] = (b2 == b3) ? 1.0D : 0.0D; 
    } 
    return b1;
  }
  
  private void e(b paramb) {
    if (paramb.b != this.b || paramb.c != this.c)
      throw new IllegalArgumentException("Matrix dimensions must agree."); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/a/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */