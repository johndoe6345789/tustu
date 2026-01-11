package G;

import V.g;
import bH.D;
import bH.c;

class au implements n {
  au(an paraman) {}
  
  public void a(double paramDouble) {}
  
  public void e() {}
  
  public void a(o paramo) {
    m m = paramo.b();
    if (paramo.a() == 1) {
      int i = paramo.b().o();
      if (!an.a(this.a, i) && !this.a.a.C().c(i)) {
        boolean bool = c.b(this.a.a.C().a(this.a.a.c(), m.o()), paramo.e());
        if (!bool) {
          D.b("Page validation failed on " + this.a.a.c() + " page:" + m.o() + "  Doing nothing.");
          D.c("Bytes from Controller:\n" + c.a(paramo.e(), 16));
          D.c("Bytes In offline Data:\n" + c.a(this.a.a.h().b(m.o()), 16));
          aB.a().b(this.a.a.c(), "Page validation failed on " + this.a.a.c() + " page: " + m.o() + "\nReverting back to last bytes successfully saved to Controller.");
          try {
            this.a.h = true;
            this.a.a.h().a(m.o(), 0, paramo.e(), false);
            this.a.h = false;
            this.a.a.h().g();
          } catch (g g) {
            D.c("error setting page bytes");
            g.printStackTrace();
          } 
        } else {
          D.c("Validated Page:" + paramo.b().o());
        } 
      } 
    } else {
      aB.a().b(this.a.a.c(), "Communication with controller " + this.a.a.c() + " lost after write. Changes may have been lost.");
      an.a(this.a, true);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/au.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */