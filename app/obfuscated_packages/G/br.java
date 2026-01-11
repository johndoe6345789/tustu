package G;

import java.io.Serializable;
import java.util.ArrayList;

public class br extends bv implements Serializable {
  ArrayList a = new ArrayList();
  
  public bs[] a() {
    bs[] arrayOfBs = new bs[this.a.size()];
    for (byte b = 0; b < this.a.size(); b++)
      arrayOfBs[b] = this.a.get(b); 
    return arrayOfBs;
  }
  
  public void a(bs parambs) {
    this.a.add(parambs);
  }
  
  public int b() {
    return this.a.size();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/br.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */