package aP;

import bH.X;
import bV.BvInterfaceBravo;

class dt implements BvInterfaceBravo {
  long a = 0L;
  
  dt(dl paramdl) {}
  
  public void a(long paramLong1, long paramLong2) {
    if (this.a == 0L)
      this.a = System.currentTimeMillis(); 
    double d1 = paramLong1 / paramLong2;
    f.a().a(d1);
    double d2 = paramLong1 / 1024.0D / (System.currentTimeMillis() - this.a) / 1000.0D;
    f.a().f((paramLong1 / 1024L) + " kbytes of " + (paramLong2 / 1024L) + " kbytes downloaded at " + X.BvInterfaceBravo(d2, 1) + " kbytes/s");
  }
  
  public void a() {
    f.a().f("Update complete, application will now restart.");
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/dt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */