package aI;

import com.efiAnalytics.remotefileaccess.DirectoryIdentifier;

public class v extends DirectoryIdentifier {
  private long a = 0L;
  
  public String getDirectoryId() {
    return "file://MS3_SD/sectorNumber";
  }
  
  public void a(long paramLong) {
    this.a = paramLong;
  }
  
  public long getNumericId() {
    return this.a;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aI/v.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */