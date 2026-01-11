package L;

import ax.CloneableImplInAxPackage;
import ax.ab;
import ax.ac;
import java.util.List;

public class MaxFunction extends ac {
  List a;
  
  protected G(List paramList) {
    this.a = paramList;
  }
  
  public synchronized double a(CloneableImplInAxPackage paramS) {
    double d = Double.MIN_VALUE;
    for (ab ab : this.a) {
      double d1 = ab.b(paramS);
      if (d1 > d)
        d = d1; 
    } 
    return d;
  }
  
  public double b(CloneableImplInAxPackage paramS) {
    return a(paramS);
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("max( ");
    for (byte b = 0; b < this.a.size(); b++) {
      ab ab = this.a.get(b);
      stringBuilder.append(ab.toString());
      if (b + 1 < this.a.size())
        stringBuilder.append(", "); 
    } 
    stringBuilder.append(")");
    return stringBuilder.toString();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/L/G.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */