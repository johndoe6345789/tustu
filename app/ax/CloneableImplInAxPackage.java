package ax;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CloneableImplInAxPackage implements Cloneable {
  List a = new ArrayList();
  
  int b = 0;
  
  int c = 0;
  
  void a(T paramT) {
    this.a.add(paramT);
  }
  
  public int a() {
    return this.b;
  }
  
  public int b() {
    return this.c;
  }
  
  public Object clone() {
    Object object = null;
    try {
      object = super.clone();
    } catch (CloneNotSupportedException cloneNotSupportedException) {
      Logger.getLogger(S.class.getName()).log(Level.SEVERE, (String)null, cloneNotSupportedException);
    } 
    return object;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ax/S.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */