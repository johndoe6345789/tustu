package com.efiAnalytics.apps.ts.dashboard.renderers;

import java.awt.geom.AffineTransform;
import java.awt.geom.PathIterator;
import java.io.Serializable;

class SweepPathIterator implements PathIterator, Serializable {
  SweepGaugeShape a;

  private AffineTransform d = null;

  int b = -1;

  SweepPathIterator(AsymetricSweepRenderer paramAsymetricSweepRenderer, SweepGaugeShape paramb) {
    this.a = paramb;
  }

  public int getWindingRule() {
    return 0;
  }

  public boolean isDone() {
    return (this.b > 5);
  }

  public void next() {
    this.b++;
  }

  public void a() {
    this.b = -1;
  }

  private float b() {
    return (float) ((this.d != null) ? this.d.getTranslateX() : 0.0D);
  }

  private float c() {
    return (float) ((this.d != null) ? this.d.getTranslateY() : 0.0D);
  }

  public int currentSegment(float[] paramArrayOffloat) {
    float f1 = this.a.a.isCounterClockwise() ? -1.0F : 1.0F;
    float f2 =
        this.a.a.isCounterClockwise()
            ? (this.a.a.getWidth() - this.a.a.getBorderWidth() / 2)
            : 0.0F;
    if (this.b < 0) this.b = 0;
    if (this.b == 0) {
      paramArrayOffloat[0] = f1 * this.a.b.x1 + b() + f2;
      paramArrayOffloat[1] = this.a.b.y1 + c();
      return 0;
    }
    if (this.b == 1) {
      paramArrayOffloat[0] = f1 * this.a.b.ctrlx1 + b() + f2;
      paramArrayOffloat[1] = this.a.b.ctrly1 + c();
      paramArrayOffloat[2] = f1 * this.a.b.ctrlx2 + b() + f2;
      paramArrayOffloat[3] = this.a.b.ctrly2 + c();
      paramArrayOffloat[4] = f1 * this.a.b.x2 + b() + f2;
      paramArrayOffloat[5] = this.a.b.y2 + c();
      return 3;
    }
    if (this.b == 2) {
      paramArrayOffloat[0] = f1 * this.a.c.x2 + b() + f2;
      paramArrayOffloat[1] = this.a.c.y2 + c();
      return 1;
    }
    if (this.b == 3) {
      paramArrayOffloat[0] = f1 * this.a.c.ctrlx2 + b() + f2;
      paramArrayOffloat[1] = this.a.c.ctrly2 + c();
      paramArrayOffloat[2] = f1 * this.a.c.ctrlx1 + b() + f2;
      paramArrayOffloat[3] = this.a.c.ctrly1 + c();
      paramArrayOffloat[4] = f1 * this.a.c.x1 + b() + f2;
      paramArrayOffloat[5] = this.a.c.y1 + c();
      return 3;
    }
    if (this.b == 4) {
      paramArrayOffloat[0] = f1 * this.a.b.x1 + b() + f2;
      paramArrayOffloat[1] = this.a.b.y1 + c();
      return 1;
    }
    return 4;
  }

  public int currentSegment(double[] paramArrayOfdouble) {
    float f1 = this.a.a.isCounterClockwise() ? -1.0F : 1.0F;
    float f2 =
        this.a.a.isCounterClockwise()
            ? (this.a.a.getWidth() - this.a.a.getBorderWidth() / 2)
            : 0.0F;
    if (this.b < 0) this.b = 0;
    if (this.b == 0) {
      paramArrayOfdouble[0] = (f1 * this.a.b.x1 + b() + f2);
      paramArrayOfdouble[1] = (this.a.b.y1 + c());
      return 0;
    }
    if (this.b == 1) {
      paramArrayOfdouble[0] = (f1 * this.a.b.ctrlx1 + b() + f2);
      paramArrayOfdouble[1] = (this.a.b.ctrly1 + c());
      paramArrayOfdouble[2] = (f1 * this.a.b.ctrlx2 + b() + f2);
      paramArrayOfdouble[3] = (this.a.b.ctrly2 + c());
      paramArrayOfdouble[4] = (f1 * this.a.b.x2 + b() + f2);
      paramArrayOfdouble[5] = (this.a.b.y2 + c());
      return 3;
    }
    if (this.b == 2) {
      paramArrayOfdouble[0] = (f1 * this.a.c.x2 + b() + f2);
      paramArrayOfdouble[1] = (this.a.c.y2 + c());
      return 1;
    }
    if (this.b == 3) {
      paramArrayOfdouble[0] = (f1 * this.a.c.ctrlx2 + b() + f2);
      paramArrayOfdouble[1] = (this.a.c.ctrly2 + c());
      paramArrayOfdouble[2] = (f1 * this.a.c.ctrlx1 + b() + f2);
      paramArrayOfdouble[3] = (this.a.c.ctrly1 + c());
      paramArrayOfdouble[4] = (f1 * this.a.c.x1 + b() + f2);
      paramArrayOfdouble[5] = (this.a.c.y1 + c());
      return 3;
    }
    if (this.b == 4) {
      paramArrayOfdouble[0] = (f1 * this.a.b.x1 + b() + f2);
      paramArrayOfdouble[1] = (this.a.b.y1 + c());
      return 1;
    }
    return 4;
  }

  public void a(AffineTransform paramAffineTransform) {
    this.d = paramAffineTransform;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/dashboard/renderers/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
