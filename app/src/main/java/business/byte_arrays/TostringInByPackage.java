package business.byte_arrays;

import java.util.ArrayList;
import java.util.List;

public class TostringInByPackage {
  private String b;
  
  List a = new ArrayList();
  
  public TostringInByPackage(String paramString) {
    this.b = paramString;
  }
  
  public void a(l paraml) {
    this.a.add(paraml);
  }
  
  public String a() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(b()).append("(");
    for (byte b = 0; b < this.a.size(); b++) {
      l l = this.a.get(b);
      stringBuilder.append('[').append(l.a()).append(']');
      if (b + 1 < this.a.size())
        stringBuilder.append(", "); 
    } 
    stringBuilder.append(")");
    return stringBuilder.toString();
  }
  
  public String toString() {
    return this.a.isEmpty() ? (b() + "()") : (b() + "(..)");
  }
  
  public String b() {
    return this.b;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/by/k.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */