package L;

import ax.S;
import ax.U;
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
  
  public double a(S paramS) {
    int i = (int)Math.round(this.a.b(paramS));
    try {
      return ((ab)this.b.get(i)).b(paramS);
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw new U("IndexOutOfBounds! index=" + i + ", function: " + toString());
    } 
  }
  
  public double b(S paramS) {
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