package G;

import bH.D;
import java.io.Serializable;

public class N implements Serializable {
  int[][] a = null;
  
  boolean[][] b = null;
  
  public N(J paramJ) {}
  
  public void a(F paramF) {
    c(paramF.g());
    int[] arrayOfInt = paramF.l();
    for (byte b = 0; b < arrayOfInt.length; b++)
      a(b, arrayOfInt[b]); 
  }
  
  private void c(int paramInt) {
    this.a = new int[paramInt][1];
    this.b = new boolean[paramInt][1];
  }
  
  private void a(int paramInt1, int paramInt2) {
    this.a[paramInt1] = new int[paramInt2];
    this.b[paramInt1] = new boolean[paramInt2];
    for (byte b = 0; b < (this.b[paramInt1]).length; b++)
      this.b[paramInt1][b] = true; 
  }
  
  public void a(int paramInt1, int paramInt2, int[] paramArrayOfint, boolean paramBoolean) {
    for (byte b = 0; b < paramArrayOfint.length; b++) {
      if (paramInt1 == -1 || paramInt2 + b == -1)
        D.c("Local Controller Data Write Error!!!"); 
      if ((paramBoolean || this.b[paramInt1][paramInt2 + b]) && this.a[paramInt1][paramInt2 + b] != paramArrayOfint[b])
        this.a[paramInt1][paramInt2 + b] = paramArrayOfint[b]; 
    } 
  }
  
  protected void a(int paramInt1, int paramInt2, boolean paramBoolean) {
    this.b[paramInt1][paramInt2] = paramBoolean;
  }
  
  protected int[] a(int paramInt) {
    return this.a[paramInt];
  }
  
  public int[] b(int paramInt) {
    int[] arrayOfInt1 = a(paramInt);
    int[] arrayOfInt2 = new int[arrayOfInt1.length];
    for (byte b = 0; b < arrayOfInt1.length; b++)
      arrayOfInt2[b] = arrayOfInt1[b]; 
    return arrayOfInt2;
  }
  
  public int[] a(int paramInt1, int paramInt2, int paramInt3) {
    int[] arrayOfInt1 = a(paramInt1);
    if (arrayOfInt1 == null)
      return new int[0]; 
    int[] arrayOfInt2 = new int[paramInt3];
    System.arraycopy(arrayOfInt1, paramInt2, arrayOfInt2, 0, paramInt3);
    return arrayOfInt2;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/N.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */