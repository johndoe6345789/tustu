package bk;

import aI.u;
import com.efiAnalytics.remotefileaccess.RemoteAccessException;

class m extends Thread {
  m(h paramh) {}
  
  public void run() {
    try {
      if (h.d(this.a) != null) {
        u u = h.d(this.a).a(null);
        if (u != null) {
          this.a.j.a(u, this.a.v);
          h.d(this.a).c();
        } 
      } 
    } catch (RemoteAccessException remoteAccessException) {}
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bk/m.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */