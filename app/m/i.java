package m;

import am.e;
import com.efiAnalytics.ui.bc;
import java.util.List;

class i implements bc {
  i(d paramd, List paramList, c paramc) {}
  
  public void close() {
    List list = this.a.a();
    for (byte b = 0; b < this.b.size(); b++) {
      e e = this.b.get(b);
      if (!list.contains(Integer.valueOf(e.h()))) {
        this.b.remove(b);
        b--;
      } 
    } 
    this.c.a(this.b);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/m/i.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */