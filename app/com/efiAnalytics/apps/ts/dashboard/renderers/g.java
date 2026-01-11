package com.efiAnalytics.apps.ts.dashboard.renderers;

import java.awt.BasicStroke;
import java.io.Serializable;

public class g extends BasicStroke implements Serializable {
  public g(float paramFloat1, int paramInt1, int paramInt2, float paramFloat2, float[] paramArrayOffloat, float paramFloat3) {
    super(paramFloat1, paramInt1, paramInt2, paramFloat2, paramArrayOffloat, paramFloat3);
  }
  
  public g(float paramFloat, int paramInt1, int paramInt2) {
    super(paramFloat, paramInt1, paramInt2);
  }
  
  public g(float paramFloat) {
    this(paramFloat, 2, 0, 10.0F, null, 0.0F);
  }
  
  public g() {
    this(1.0F, 2, 0, 10.0F, null, 0.0F);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/dashboard/renderers/g.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */