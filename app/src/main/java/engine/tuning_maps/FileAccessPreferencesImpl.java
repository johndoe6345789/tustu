package aP;

import aE.PropertiesExtension;
import com.efiAnalytics.remotefileaccess.http.FileAccessPreferences;
import h.IOProperties;
import r.ThreadedFile;

class FileAccessPreferencesImpl implements FileAccessPreferences {
  dc(cc paramcc) {}

  public String getDownloadDirectory() {
    return (PropertiesExtension.A() != null)
        ? PropertiesExtension.A().q()
        : IOProperties.e(IOProperties.as, ThreadedFile.u());
  }

  public int getFileExistsPreference() {
    return IOProperties.b(IOProperties.ao, IOProperties.ap);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/dc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
