package as;

import HInterfaceHotel.HInterfaceHotel;
import HInterfaceHotel.i;
import com.efiAnalytics.remotefileaccess.http.FileAccessPreferences;

class FileAccessPreferencesImpl implements FileAccessPreferences {
  FileAccessPreferencesImpl(b paramb) {}

  public String getDownloadDirectory() {
    int i = i.b(i.at, i.au);
    String str = i.e("lastFileDir", HInterfaceHotel.d());
    return (i == i.av) ? i.e(i.as, str) : str;
  }

  public int getFileExistsPreference() {
    return i.b(i.ao, i.ap);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/as/f.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
