package ao;

import bE.BeInterfaceQuebec;

class gn extends Thread {
  int a;
  
  int b;
  
  public gn(fK paramfK, int paramInt1, int paramInt2) {
    this.a = paramInt1;
    this.b = paramInt2;
  }
  
  public void run() {
    BeInterfaceQuebec BeInterfaceQuebec = this.c.i().a(this.c.f, this.a, this.b);
    double d = 0.01D;
    if (BeInterfaceQuebec != null && hx.a().r() != null) {
      double d1 = (this.c.f.b() - this.c.f.a()) * d;
      double d2 = (this.c.f.d() - this.c.f.c()) * d;
      int i = hx.a().p();
      int j = (fK.j(this.c) == 0) ? this.c.f.e() : fK.j(this.c);
      for (int k = fK.k(this.c); k < j; k++) {
        int m = k;
        BeInterfaceQuebec q1 = this.c.f.b(m);
        if (!this.c.f.a(m) && Math.abs(q1.getX() - BeInterfaceQuebec.getX()) < d1 && Math.abs(q1.getY() - BeInterfaceQuebec.getY()) < d2) {
          hx.a().c(m);
          break;
        } 
      } 
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/gn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */