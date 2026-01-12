package ao;

import W.j;

class gP implements Runnable {
  gP(go paramgo, int paramInt) {}

  public void run() {
    j j1 = this.b.b().d();
    j j2 = this.b.b().e();
    if (j1 != null && j2 != null && this.b.g()) {
      if (this.a - this.b.ae == 1) {
        Float float_1 = Float.valueOf(j1.d(this.a));
        Float float_2 = Float.valueOf(j2.d(this.a));
        this.b.l.h().a(float_2.toString(), float_1.toString());
      } else {
        int i = this.a - this.b.l.h().J();
        if (i < 0) i = 0;
        int j = Math.min(this.b.l.h().J() + 1, this.a + 1);
        float[] arrayOfFloat1 = new float[j];
        float[] arrayOfFloat2 = new float[j];
        for (byte b = 0; b < j; b++) {
          arrayOfFloat1[b] = j1.d(this.a - b);
          arrayOfFloat2[b] = j2.d(this.a - b);
        }
        this.b.l.h().a(arrayOfFloat2, arrayOfFloat1);
      }
      this.b.ae = this.a;
      this.b.W.a();
    }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/gP.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
