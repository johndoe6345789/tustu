package aG;

import com.efiAnalytics.remotefileaccess.DirectoryInformation;

public class d implements DirectoryInformation {
  private int a = 0;
  
  private long b = -1L;
  
  private long c = 0L;
  
  public int getFileCount() {
    return this.a;
  }
  
  public long getTotalBytes() {
    return this.b;
  }
  
  public long getUsedBytes() {
    return this.c;
  }
  
  public void a(int paramInt) {
    this.a = paramInt;
  }
  
  public void a(long paramLong) {
    this.c = paramLong;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aG/d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */