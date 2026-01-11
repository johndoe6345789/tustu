package business.buffer_loaders.bL_components;

import bH.D;
import com.efiAnalytics.ui.fh;
import com.efiAnalytics.ui.s;

public class BlInterfaceIndia {
  j[] a = null;
  
  public BlInterfaceIndia(s params, int paramInt) {
    a(params, paramInt);
  }
  
  public void a(s params, int paramInt) {
    this.a = new j[paramInt];
    for (byte b = 0; b < this.a.length; b++) {
      this.a[b] = new j(this);
      this.a[b].a(params.getRowCount(), params.getColumnCount());
      this.a[b] = (j)fh.a(params, this.a[b]);
      this.a[b].a(System.currentTimeMillis());
    } 
  }
  
  public s a(long paramLong, int paramInt) {
    j j1 = (j)a(paramLong);
    return (Math.abs(paramLong - j1.c()) > paramInt) ? null : j1;
  }
  
  public s a(long paramLong) {
    long l = Long.MAX_VALUE;
    for (byte b = 0; b < this.a.length; b++) {
      if (this.a[b].c() < paramLong)
        return (Math.abs(this.a[b].c() - paramLong) > Math.abs(l - paramLong)) ? this.a[b - 1] : this.a[b]; 
      l = this.a[b].c();
    } 
    D.c("timestamp is older than we have returning the oldest table I have. timestamp=" + paramLong + ", lastTimestamp=" + l);
    return this.a[this.a.length - 1];
  }
  
  public void a(s params, long paramLong) {
    j j1 = this.a[this.a.length - 1];
    for (int k = this.a.length - 1; k > 0; k--)
      this.a[k] = this.a[k - 1]; 
    this.a[0] = (j)fh.a(params, j1);
    this.a[0].a(paramLong);
  }
  
  public int a() {
    return this.a.length;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bL/i.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */