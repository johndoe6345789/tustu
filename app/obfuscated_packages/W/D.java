package W;

import bH.b;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class D implements b {
  List a = new ArrayList();
  
  private static D b = null;
  
  public static D a() {
    if (b == null)
      b = new D(); 
    return b;
  }
  
  public void a(File paramFile) {
    this.a.add(paramFile);
  }
  
  public boolean b() {
    return true;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/W/D.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */