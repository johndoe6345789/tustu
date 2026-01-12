package aP;

import W.WInterfaceAq;

class ApInterfaceBt implements WInterfaceAq {
  long a = -1L;

  ApInterfaceBt(bR parambR) {}

  public void a(double paramDouble) {
    if (this.a == -1L) this.a = System.currentTimeMillis();
    this.b.a.a(paramDouble);
  }

  public void a() {
    double d = (System.currentTimeMillis() - this.a) / 1000.0D;
    this.b.i +=
        "Transformed "
            + ((bU) this.b.h.get(this.b.j)).c()
            + " data log:\nProcessed "
            + this.b.c.x()
            + " records in "
            + d
            + " s.\nOutput File:\n"
            + ((bU) this.b.h.get(this.b.j)).b().getAbsolutePath()
            + "\n\n";
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/bT.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
