package L;

import ax.S;
import ax.ab;
import ax.ac;
import java.util.List;

public class Y extends ac {
  ab a;
  
  ab b;
  
  ab c;
  
  ab d = null;
  
  double e = 0.0D;
  
  double f = 0.0D;
  
  double g = -1.0D;
  
  double h = 0.0D;
  
  double i = 0.0D;
  
  double j = 0.0D;
  
  boolean k = true;
  
  int l = 0;
  
  protected Y(List<ab> paramList) {
    this.a = paramList.get(0);
    this.b = paramList.get(1);
    if (paramList.size() > 2)
      this.c = paramList.get(2); 
    if (paramList.size() > 3)
      this.d = paramList.get(3); 
  }
  
  public synchronized double a(S paramS) {
    if (this.g < 0.0D)
      this.g = c(paramS); 
    double d1 = this.b.b(paramS);
    if (d1 <= 0.0D) {
      this.e = -1.0D;
      this.g = c(paramS);
      this.l = 0;
      return this.j;
    } 
    if (this.e <= 0.0D) {
      double d = c(paramS);
      this.e = d;
      this.f = d1;
      this.j = 0.0D;
    } 
    if (this.j > 0.0D) {
      this.g = c(paramS);
      this.l = 0;
      return this.j;
    } 
    double d2 = c(paramS);
    if (this.l == 1)
      this.e -= (c(paramS) - this.g) / 2.0D; 
    this.l++;
    double d3 = this.a.b(paramS);
    if (d3 <= d1) {
      if (this.d == null) {
        this.j = this.g - this.e + (d3 - this.h) / (d1 - this.h) * (d2 - this.g);
        if (this.j < 0.0D)
          this.j = 0.0D; 
      } else {
        double d = this.d.b(paramS);
        this.j = this.i + (d3 - this.h) / (d1 - this.h) * (d - this.i);
      } 
      this.k = false;
      return this.j;
    } 
    this.g = d2;
    if (this.d == null) {
      this.h = d1;
      return this.g - this.e;
    } 
    this.i = this.d.b(paramS);
    return this.i;
  }
  
  private double c(S paramS) {
    return (this.c != null) ? this.c.b(paramS) : (System.currentTimeMillis() / 1000.0D);
  }
  
  public double b(S paramS) {
    return a(paramS);
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("timeToExceed( ");
    stringBuilder.append(this.a.toString());
    stringBuilder.append(", ");
    stringBuilder.append(this.b.toString());
    stringBuilder.append(")");
    return stringBuilder.toString();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/L/Y.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */