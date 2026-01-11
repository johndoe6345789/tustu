package com.efiAnalytics.apps.ts.dashboard.renderers;

import java.io.Serializable;

class FloatCoordinates implements Serializable {
  private float b;
  
  private float c;
  
  FloatCoordinates(AsymetricSweepRenderer paramAsymetricSweepRenderer, float paramFloat1, float paramFloat2) {
    this.b = paramFloat1;
    this.c = paramFloat2;
  }
  
  public float a() {
    return this.c;
  }
  
  public float b() {
    return this.b;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/dashboard/renderers/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */