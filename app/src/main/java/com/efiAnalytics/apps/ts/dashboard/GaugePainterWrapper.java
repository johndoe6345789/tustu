package com.efiAnalytics.apps.ts.dashboard;

import com.efiAnalytics.apps.ts.dashboard.renderers.GaugePainter;

class GaugePainterWrapper {
  GaugePainter a = null;

  public GaugePainterWrapper(ad paramad, GaugePainter paramGaugePainter) {
    this.a = paramGaugePainter;
  }

  public GaugePainter a() {
    return this.a;
  }

  public String toString() {
    return this.a.getName();
  }

  public boolean equals(Object paramObject) {
    if (paramObject instanceof GaugePainterWrapper) {
      GaugePainter gaugePainter = ((GaugePainterWrapper) paramObject).a();
      return gaugePainter.getName().equals(this.a.getName());
    }
    return false;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/dashboard/aE.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
