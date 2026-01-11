package G;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

public class bx extends bA implements Serializable {
  ArrayList a = new ArrayList();
  
  public String b() {
    return null;
  }
  
  public void a(bw parambw) {
    this.a.add(parambw);
  }
  
  public Iterator a() {
    return this.a.iterator();
  }
  
  public bw a(String paramString) {
    Iterator<bw> iterator = a();
    while (iterator.hasNext()) {
      bw bw = iterator.next();
      if (bw.a().equals(paramString))
        return bw; 
    } 
    return null;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/bx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */