package aP;

import aE.a;
import com.efiAnalytics.remotefileaccess.http.FileAccessPreferences;
import h.i;
import r.j;

class dc implements FileAccessPreferences {
  dc(cc paramcc) {}
  
  public String getDownloadDirectory() {
    return (a.A() != null) ? a.A().q() : i.e(i.as, j.u());
  }
  
  public int getFileExistsPreference() {
    return i.b(i.ao, i.ap);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/dc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */