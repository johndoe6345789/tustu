package com.efiAnalytics.apps.ts.tuningViews.tuneComps;

import G.GComponentCq;
import bH.X;
import com.efiAnalytics.ui.fh;
import java.awt.Color;

class CrossHairChannelListener implements GComponentCq {
  int a = -1;

  Double b = Double.valueOf(Double.NaN);

  double c = Double.NaN;

  double d = Double.NaN;

  CrossHairChannelListener(TableCellCrossHair paramTableCellCrossHair) {}

  public void setCurrentOutputChannelValue(String paramString, double paramDouble) {
    if (paramString.equals(this.e.k)) {
      if (Double.isNaN(this.c)) {
        this.c = paramDouble;
      } else {
        this.c = (this.c * 3.0D + paramDouble) / 4.0D;
      }
      TableCellCrossHair.access$200(this.e, this.c);
      this.a = 1;
    } else if (paramString.equals(this.e.l)) {
      if (Double.isNaN(this.d)) {
        this.d = paramDouble;
      } else {
        this.d = (this.d * 3.0D + paramDouble) / 4.0D;
      }
      TableCellCrossHair.access$300(this.e, this.d);
      if (this.e.o >= 0 && this.e.n >= 0) {
        Double double_ = this.e.i.d(this.e.n, this.e.o);
        if (double_.doubleValue() != this.b.doubleValue()) {
          this.e.c.a(X.b(double_.doubleValue(), this.e.p));
          this.b = double_;
          Color color = fh.a(double_.doubleValue(), this.e.i.A(), this.e.i.B());
          this.e.c.a(color);
        }
      }
      if (this.a == 1) this.e.m.a();
      this.a = 2;
    }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/tuningViews/tuneComps/i.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
