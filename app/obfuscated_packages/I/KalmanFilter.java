package I;

import G.T;
import G.aF;
import G.aG;
import G.bT;
import G.cu;
import M.KalmanFilterUsingMatrix;
import linear_algebra.Matrix;
import java.util.LinkedList;
import java.util.Queue;

public class KalmanFilterUsingMatrix implements aF, aG {
  public static String a = "runtimeDataRate";
  
  float b = 0.0F;
  
  Queue c = new LinkedList();
  
  int d = 10;
  
  private KalmanFilterUsingMatrix e;

  public KalmanFilterUsingMatrix() {
    double d1 = 50.0D;
    double d2 = 3.0D;
    double d3 = 5000.0D;
    this.e = KalmanFilterUsingMatrix.create(0.0D, 0.0D, d1, Math.pow(d2, 2.0D) / 2.0D, Math.pow(d3, 2.0D));
  }
  
  public void a(String paramString, byte[] paramArrayOfbyte) {
    if (T.a().c() != null && T.a().c().c().equals(paramString)) {
      float f1;
      long l = System.nanoTime();
      int i = this.c.size();
      if (i == 0) {
        f1 = 10.0F;
      } else if (i < this.d) {
        f1 = i * 1.0E9F / (float)(l - ((Long)this.c.peek()).longValue());
      } else {
        f1 = i * 1.0E9F / (float)(l - ((Long)this.c.remove()).longValue());
      } 
      float f2 = this.b / 8.0F;
      this.e.i(new Matrix(new double[][] { { f1 }, { 0.0D }, { 0.0D }, { 0.0D } }));
      this.e.a();
      this.b = (this.b * f2 + (float)this.e.b().a(0, 0)) / (f2 + 1.0F);
      cu.a().a(a, (this.b * 1.0F));
      if (i > f1 * 1.15D) {
        this.d = (int)Math.ceil(f1);
        this.c.clear();
      } else if (i < f1 * 0.85D) {
        this.d = (int)Math.ceil(f1);
      } 
      while (this.c.size() > this.d)
        this.c.remove(); 
      this.c.add(Long.valueOf(l));
    } 
  }
  
  public boolean a(String paramString, bT parambT) {
    return true;
  }
  
  public void a(String paramString) {
    this.b = 0.0F;
    cu.a().a(a, 0.0D);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/I/f.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */