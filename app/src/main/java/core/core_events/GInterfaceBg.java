package G;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

public class GInterfaceBg extends bF implements Serializable {
  ArrayList b = new ArrayList();
  
  public String g() {
    return "thermGenerator";
  }
  
  public void a(bH parambH) {
    this.b.add(parambH);
  }
  
  public Iterator a() {
    return this.b.iterator();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/bG.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */