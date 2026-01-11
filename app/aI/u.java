package aI;

import bH.c;
import com.efiAnalytics.remotefileaccess.DirectoryInformation;

public class u implements DirectoryInformation {
  private int a = 0;
  
  private long b = 0L;
  
  private long c = -1L;
  
  private int d = 0;
  
  private long e = 0L;
  
  private int f = 0;
  
  private boolean g = false;
  
  private boolean h = false;
  
  private boolean i = false;
  
  private boolean j = false;
  
  private boolean k = false;
  
  private boolean l = false;
  
  private boolean m = false;
  
  private boolean n = false;
  
  protected void a(int[] paramArrayOfint) {
    this.g = ((paramArrayOfint[0] & 0x1) == 1);
    this.h = ((paramArrayOfint[0] & 0x2) == 2);
    this.i = ((paramArrayOfint[0] & 0x4) == 4);
    this.j = ((paramArrayOfint[0] & 0x8) == 8);
    this.k = ((paramArrayOfint[0] & 0x10) == 16);
    this.l = ((paramArrayOfint[0] & 0x20) == 32);
    this.m = ((paramArrayOfint[0] & 0x40) == 64);
    this.n = ((paramArrayOfint[0] & 0x80) == 128);
    this.f = paramArrayOfint[1];
    this.d = c.b(paramArrayOfint, 2, 2, true, false);
    this.e = c.c(paramArrayOfint, 4, 4, true, false);
    this.a = c.b(paramArrayOfint, 8, 2, true, false);
    this.c = c.c(paramArrayOfint, 10, 4, true, false);
  }
  
  public int getFileCount() {
    return this.a;
  }
  
  public long getTotalBytes() {
    return this.e * this.d;
  }
  
  public long getUsedBytes() {
    return this.b;
  }
  
  public void a(int paramInt) {
    this.a = paramInt;
  }
  
  public void a(long paramLong) {
    this.b = paramLong;
  }
  
  public int a() {
    return this.d;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aI/u.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */