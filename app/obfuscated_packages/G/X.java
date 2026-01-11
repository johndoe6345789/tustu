package G;

import java.util.ArrayList;
import java.util.Iterator;

public class X {
  private static X b = null;
  
  ArrayList a = new ArrayList();
  
  public static X a() {
    if (b == null)
      b = new X(); 
    return b;
  }
  
  public void a(cX paramcX) {
    this.a.add(paramcX);
  }
  
  public boolean a(bT parambT) {
    Iterator<cX> iterator = this.a.iterator();
    while (iterator.hasNext()) {
      if (((cX)iterator.next()).a(parambT))
        return true; 
    } 
    return false;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/X.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */