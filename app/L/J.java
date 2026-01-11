package L;

import ax.S;
import ax.ab;
import ax.ac;
import java.util.List;

public class J extends ac {
  List a;
  
  ab b;
  
  ab c = null;
  
  double d = Double.NaN;
  
  long e = 0L;
  
  protected J(List<ab> paramList) {
    this.a = paramList;
    this.b = paramList.get(0);
    if (paramList.size() > 1)
      this.c = paramList.get(1); 
  }
  
  public double a(S paramS) {
    double d = this.b.b(paramS);
    if (this.c != null && (c(paramS) - this.e) > this.c.b(paramS))
      this.d = Double.NaN; 
    if (Double.isNaN(this.d) || d < this.d) {
      this.d = d;
      this.e = c(paramS);
    } 
    return this.d;
  }
  
  private long c(S paramS) {
    return (long)(n.a()).b.b(paramS);
  }
  
  public double b(S paramS) {
    return a(paramS);
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("minValue( ");
    for (byte b = 0; b < this.a.size(); b++) {
      ab ab1 = this.a.get(b);
      stringBuilder.append(ab1.toString());
      if (b + 1 < this.a.size())
        stringBuilder.append(", "); 
    } 
    stringBuilder.append(" )");
    return stringBuilder.toString();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/L/J.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */