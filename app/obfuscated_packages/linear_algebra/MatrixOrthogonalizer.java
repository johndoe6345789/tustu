package linear_algebra;

import b.a;
import java.io.Serializable;

public class MatrixOrthogonalizer implements Serializable {
  private double[][] a;
  
  private int b;
  
  private int c;
  
  private double[] d;
  
  public MatrixOrthogonalizer(Matrix paramb) {
    this.a = paramb.c();
    this.b = paramb.d();
    this.c = paramb.e();
    this.d = new double[this.c];
    for (byte b1 = 0; b1 < this.c; b1++) {
      double d = 0.0D;
      int i;
      for (i = b1; i < this.b; i++)
        d = a.a(d, this.a[i][b1]); 
      if (d != 0.0D) {
        if (this.a[b1][b1] < 0.0D)
          d = -d; 
        for (i = b1; i < this.b; i++)
          this.a[i][b1] = this.a[i][b1] / d; 
        this.a[b1][b1] = this.a[b1][b1] + 1.0D;
        for (i = b1 + 1; i < this.c; i++) {
          double d1 = 0.0D;
          byte b2;
          for (b2 = b1; b2 < this.b; b2++)
            d1 += this.a[b2][b1] * this.a[b2][i]; 
          d1 = -d1 / this.a[b1][b1];
          for (b2 = b1; b2 < this.b; b2++)
            this.a[b2][i] = this.a[b2][i] + d1 * this.a[b2][b1]; 
        } 
      } 
      this.d[b1] = -d;
    } 
  }
  
  public boolean a() {
    for (byte b = 0; b < this.c; b++) {
      if (this.d[b] == 0.0D)
        return false; 
    } 
    return true;
  }
  
  public Matrix a(Matrix paramb) {
    if (paramb.d() != this.b)
      throw new IllegalArgumentException("Matrix row dimensions must agree."); 
    if (!a())
      throw new RuntimeException("Matrix is rank deficient."); 
    int i = paramb.e();
    double[][] arrayOfDouble = paramb.c();
    int j;
    for (j = 0; j < this.c; j++) {
      for (byte b1 = 0; b1 < i; b1++) {
        double d = 0.0D;
        int k;
        for (k = j; k < this.b; k++)
          d += this.a[k][j] * arrayOfDouble[k][b1]; 
        d = -d / this.a[j][j];
        for (k = j; k < this.b; k++)
          arrayOfDouble[k][b1] = arrayOfDouble[k][b1] + d * this.a[k][j]; 
      } 
    } 
    for (j = this.c - 1; j >= 0; j--) {
      byte b1;
      for (b1 = 0; b1 < i; b1++)
        arrayOfDouble[j][b1] = arrayOfDouble[j][b1] / this.d[j]; 
      for (b1 = 0; b1 < j; b1++) {
        for (byte b2 = 0; b2 < i; b2++)
          arrayOfDouble[b1][b2] = arrayOfDouble[b1][b2] - arrayOfDouble[j][b2] * this.a[b1][j]; 
      } 
    } 
    return (new Matrix(arrayOfDouble, this.c, i)).a(0, this.c - 1, 0, i - 1);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/a/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */