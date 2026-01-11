package n;

import java.util.ArrayList;
import java.util.List;

public class NInterfaceJuliet {
  private static j b = null;
  
  List a = new ArrayList();
  
  public static j a() {
    if (b == null)
      b = new j(); 
    return b;
  }
  
  public void a(String paramString) {
    for (i i : this.a)
      i.a(paramString); 
  }
  
  public void b(String paramString) {
    for (i i : this.a)
      i.b(paramString); 
  }
  
  public void a(i parami) {
    this.a.add(parami);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/n/j.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */