package bG;

import java.util.ArrayList;

public class a implements l {
  ArrayList a = new ArrayList();
  
  double b = 0.0D;
  
  private double e = Double.NaN;
  
  int c = 0;
  
  int d = 0;
  
  public a() {}
  
  public a(int paramInt1, int paramInt2) {
    a(paramInt1, paramInt2);
  }
  
  public ArrayList a() {
    return this.a;
  }
  
  public void a(int paramInt1, int paramInt2) {
    double d2;
    double d1 = 360.0D / paramInt1;
    if (Double.isNaN(this.e)) {
      d2 = (d1 < 6.0D) ? (d1 / 2.5D) : 3.0D;
    } else {
      d2 = this.e;
    } 
    double d3 = 0.0D;
    this.a.clear();
    this.b = Double.NaN;
    double d4;
    for (d4 = 0.0D; d4 < (paramInt1 - paramInt2); d4++) {
      k k = new k();
      k.a(d1 * d4 + d3);
      if (Double.isNaN(this.b))
        this.b = k.a(); 
      k.b(d2);
      this.a.add(k);
    } 
    this.c = paramInt1;
    this.d = paramInt2;
  }
  
  public double b() {
    return this.b;
  }
  
  public void a(double paramDouble) {
    this.e = paramDouble;
    if (this.c > 0)
      a(this.c, this.d); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bG/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */