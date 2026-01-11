package L;

import ax.CloneableImplInAxPackage;
import ax.AxInterfaceAb;
import ax.AbstractInAxPackage;
import java.util.List;

public class AverageFunction extends AbstractInAxPackage {
  List a;
  
  protected e(List paramList) {
    this.a = paramList;
  }
  
  public synchronized double a(CloneableImplInAxPackage paramS) {
    double d = 0.0D;
    for (AxInterfaceAb AxInterfaceAb : this.a)
      d += AxInterfaceAb.b(paramS); 
    return d / this.a.size();
  }
  
  public double b(CloneableImplInAxPackage paramS) {
    return a(paramS);
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("avg( ");
    for (byte b = 0; b < this.a.size(); b++) {
      AxInterfaceAb AxInterfaceAb = this.a.get(b);
      stringBuilder.append(AxInterfaceAb.toString());
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