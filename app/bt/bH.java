package bt;

import java.util.ArrayList;
import java.util.List;

public class bH {
  private static bH a = null;
  
  private final List b = new ArrayList();
  
  public static bH a() {
    if (a == null)
      a = new bH(); 
    return a;
  }
  
  public void a(bG parambG) {
    this.b.add(parambG);
  }
  
  public void b(bG parambG) {
    this.b.remove(parambG);
  }
  
  public void a(boolean paramBoolean) {
    for (bG bG : this.b)
      bG.c(paramBoolean); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/bH.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */