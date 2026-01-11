package ac;

import G.aG;
import G.bT;

public class g implements aG {
  int a = 500;
  
  long b = 0L;
  
  long c = 0L;
  
  public boolean a(String paramString, bT parambT) {
    h h = h.k();
    if (h != null && h.u() && System.currentTimeMillis() - this.b > this.a) {
      this.b = System.currentTimeMillis();
      h.d("Going Online: " + paramString);
    } 
    return true;
  }
  
  public void a(String paramString) {
    h h = h.k();
    if (h != null && h.u() && System.currentTimeMillis() - this.c > this.a) {
      this.c = System.currentTimeMillis();
      h.d("Going Offline: " + paramString);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ac/g.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */