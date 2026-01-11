package aP;

import G.R;
import V.g;
import aE.a;
import aE.e;
import aS.l;
import aj.c;
import bH.D;
import br.J;
import java.util.ArrayList;
import r.i;

class he implements Runnable {
  he(hb paramhb, R paramR, a parama) {}
  
  public void run() {
    ArrayList arrayList = (new c()).a(this.a);
    for (e e : this.c.k) {
      if (e instanceof e) {
        e e1 = e;
        e1.a(this.b, this.a);
      } 
    } 
    if (this.c.e.getTabCount() > 1) {
      boolean bool = (i.a().a("pokfr09i0943") && this.a.y()) ? true : false;
      this.c.e.a(hb.n, (arrayList.size() > 0 || bool));
    } 
    try {
      ArrayList arrayList1 = J.a().a(this.a);
      this.c.e.a(hb.p, (arrayList1.size() > 0));
      if (i.a().a("-0ofdspok54sg"))
        l.a().a(this.a, arrayList1); 
    } catch (g g) {
      D.c("Could not get supported VE Analyze Tables");
      g.printStackTrace();
    } 
    this.c.e.a(hb.r, i.a().a(" OKFDS09IFDSOK"));
    this.c.e.a(hb.q, i.a().a("12-0epofsraouvdlkw09fgk"));
    this.c.e.a(hb.s, i.a().a(";'GD;';'G"));
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/he.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */