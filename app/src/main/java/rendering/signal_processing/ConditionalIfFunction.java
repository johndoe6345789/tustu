package L;

import ax.AbstractInAxPackage;
import ax.AxInterfaceAb;
import ax.CloneableImplInAxPackage;
import java.util.List;

public class ConditionalIfFunction extends AbstractInAxPackage {
  AxInterfaceAb a;

  AxInterfaceAb b;

  AxInterfaceAb c;

  protected B(List<AxInterfaceAb> paramList) {
    this.a = paramList.get(0);
    this.b = paramList.get(1);
    this.c = paramList.get(2);
  }

  public synchronized double a(CloneableImplInAxPackage paramS) {
    return (this.a.b(paramS) != 0.0D) ? this.b.b(paramS) : this.c.b(paramS);
  }

  public double b(CloneableImplInAxPackage paramS) {
    return a(paramS);
  }

  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("IF( ");
    stringBuilder.append(this.a.toString()).append(", ");
    stringBuilder.append(this.b.toString()).append(", ");
    stringBuilder.append(this.c.toString());
    stringBuilder.append(" )");
    return stringBuilder.toString();
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/L/B.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
