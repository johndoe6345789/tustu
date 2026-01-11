package business.key_bindings;

import aI.DirectoryInformationImplGetfilecount;
import com.efiAnalytics.remotefileaccess.RemoteAccessException;

class ThreadedInBkPackage extends Thread {
  m(h paramh) {}
  
  public void run() {
    try {
      if (h.d(this.a) != null) {
        DirectoryInformationImplGetfilecount DirectoryInformationImplGetfilecount = h.d(this.a).a(null);
        if (DirectoryInformationImplGetfilecount != null) {
          this.a.j.a(DirectoryInformationImplGetfilecount, this.a.v);
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