package L;

import ax.S;
import ax.ab;
import ax.ac;
import java.util.List;

public class AverageFunction extends ac {
  List a;
  
  protected e(List paramList) {
    this.a = paramList;
  }
  
  public synchronized double a(S paramS) {
    double d = 0.0D;
    for (ab ab : this.a)
      d += ab.b(paramS); 
    return d / this.a.size();
  }
  
  public double b(S paramS) {
    return a(paramS);
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("avg( ");
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


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/L/e.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */