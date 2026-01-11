package ao;

import au.c;
import h.b;
import i.c;
import java.awt.Component;

class cs implements Runnable {
  cs(cd paramcd) {}
  
  public void run() {
    if (b.a().a("triggerLogViewer")) {
      this.a.n = new c();
      this.a.m.add("Ignition Log Viewer", (Component)this.a.n);
    } 
    this.a.o = new er();
    c.a().a(this.a.o);
    this.a.m.add("Scatter Plots", this.a.o);
    this.a.m.a("Scatter Plots", b.a().a("scatterPlots"));
    this.a.p = new eC();
    c.a().a(this.a.p);
    boolean bool = b.a().a("tableGenerator");
    this.a.m.addTab("Histogram / Table Generator", null, this.a.p, bool ? null : "MLV HD feature");
    this.a.m.a("Histogram / Table Generator", bool);
    if (b.a().a("customTuneGenerator")) {
      fB fB = new fB();
      this.a.m.addTab("Reference Values", null, fB, bool ? null : "MLV HD feature");
      this.a.m.a("Reference Values", b.a().a("customTuneGenerator"));
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/cs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */