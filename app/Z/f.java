package Z;

import java.util.ArrayList;
import java.util.List;

public class f {
  private static f a = null;
  
  private final List b = new ArrayList();
  
  public static f a() {
    if (a == null)
      a = new f(); 
    return a;
  }
  
  public void a(d paramd) {
    this.b.add(paramd);
  }
  
  public List b() {
    return this.b;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/Z/f.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */