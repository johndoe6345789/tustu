package L;

import ax.CloneableImplInAxPackage;
import ax.ExceptionInAxPackage;
import ax.ab;
import ax.ac;
import java.util.ArrayList;
import java.util.List;

public class SelectExpressionFunction extends ac {
  ab a;
  
  List b = new ArrayList();
  
  public N(ab paramab, List paramList) {
    this.a = paramab;
    this.b = paramList;
  }
  
  public double a(CloneableImplInAxPackage paramS) {
    int i = (int)Math.round(this.a.b(paramS));
    try {
      return ((ab)this.b.get(i)).b(paramS);
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
    for (ab ab1 : this.b) {
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