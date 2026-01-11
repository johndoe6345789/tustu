package L;

import ax.CloneableImplInAxPackage;
import ax.AxInterfaceAb;
import ax.AbstractInAxPackage;
import java.util.List;

public class AbstractInAxPackage extends AbstractInAxPackage {
  AxInterfaceAb a;
  
  AxInterfaceAb b;
  
  AxInterfaceAb c = null;
  
  double d = Double.NaN;
  
  boolean e = false;
  
  List f;
  
  protected AbstractInAxPackage(List<AxInterfaceAb> paramList) {
    this.a = paramList.get(0);
    this.b = paramList.get(1);
    if (paramList.size() > 2)
      this.c = paramList.get(2); 
    this.f = paramList;
  }
  
  public synchronized double a(CloneableImplInAxPackage paramS) {
    if (!this.e && this.c != null && Double.isNaN(this.d))
      this.d = this.c.b(paramS); 
    if (this.a.b(paramS) != 0.0D)
      this.d = this.b.b(paramS); 
    return this.d;
  }
  
  public double b(CloneableImplInAxPackage paramS) {
    return a(paramS);
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("updateValueWhen( ");
    for (byte b = 0; b < this.f.size(); b++) {
      AxInterfaceAb ab1 = this.f.get(b);
      stringBuilder.append(ab1.toString());
      if (b + 1 < this.f.size())
        stringBuilder.append(", "); 
    } 
    stringBuilder.append(")");
    return stringBuilder.toString();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/L/AbstractInAxPackage.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */