package L;

import ax.CloneableImplInAxPackage;
import ax.ExceptionInAxPackage;
import ax.AxInterfaceAb;
import ax.AbstractInAxPackage;
import java.util.ArrayList;
import java.util.List;

public class SelectExpressionFunction extends AbstractInAxPackage {
  AxInterfaceAb a;
  
  List b = new ArrayList();
  
  public N(AxInterfaceAb paramab, List paramList) {
    this.a = paramab;
    this.b = paramList;
  }
  
  public double a(CloneableImplInAxPackage paramS) {
    int i = (int)Math.round(this.a.b(paramS));
    try {
      return ((AxInterfaceAb)this.b.get(i)).b(paramS);
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw new ExceptionInAxPackage("IndexOutOfBounds! index=" + i + ", function: " + toString());
    } 
  }
  
  public double b(CloneableImplInAxPackage paramS) {
    return a(paramS);
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("selectExpression( ");
    stringBuilder.append(this.a.toString());
    for (AxInterfaceAb ab1 : this.b) {
      stringBuilder.append(", ");
      stringBuilder.append(ab1.toString());
    } 
    stringBuilder.append(" )");
    return stringBuilder.toString();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/L/N.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */