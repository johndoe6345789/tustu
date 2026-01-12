package ao;

import au.AuComponentCharlie;
import h.ClassTypeInHPackage;
import i.AuComponentCharlie;
import java.awt.Component;

class cs implements Runnable {
  cs(cd paramcd) {}

  public void run() {
    if (ClassTypeInHPackage.a().a("triggerLogViewer")) {
      this.a.n = new AuComponentCharlie();
      this.a.m.add("Ignition Log Viewer", (Component) this.a.n);
    }
    this.a.o = new er();
    AuComponentCharlie.a().a(this.a.o);
    this.a.m.add("Scatter Plots", this.a.o);
    this.a.m.a("Scatter Plots", ClassTypeInHPackage.a().a("scatterPlots"));
    this.a.p = new eC();
    AuComponentCharlie.a().a(this.a.p);
    boolean bool = ClassTypeInHPackage.a().a("tableGenerator");
    this.a.m.addTab("Histogram / Table Generator", null, this.a.p, bool ? null : "MLV HD feature");
    this.a.m.a("Histogram / Table Generator", bool);
    if (ClassTypeInHPackage.a().a("customTuneGenerator")) {
      fB fB = new fB();
      this.a.m.addTab("Reference Values", null, fB, bool ? null : "MLV HD feature");
      this.a.m.a("Reference Values", ClassTypeInHPackage.a().a("customTuneGenerator"));
    }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/cs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
