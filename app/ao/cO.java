package ao;

import bH.X;
import bV.b;

class cO implements b {
  long a = 0L;
  
  cO(cd paramcd) {}
  
  public void a(long paramLong1, long paramLong2) {
    if (this.a == 0L)
      this.a = System.currentTimeMillis(); 
    double d1 = paramLong1 / paramLong2;
    b.a().a(d1);
    double d2 = paramLong1 / 1024.0D / (System.currentTimeMillis() - this.a) / 1000.0D;
    b.a().b((paramLong1 / 1024L) + "kbytes of " + (paramLong2 / 1024L) + "kbytes downloaded at " + X.b(d2, 1) + " kbytes/s");
  }
  
  public void a() {
    b.a().b("Update complete, application will now restart.");
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/cO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */