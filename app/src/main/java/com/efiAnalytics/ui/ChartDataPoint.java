package com.efiAnalytics.ui;

import java.awt.geom.Point2D;

public class ChartDataPoint extends Point2D.Double {
  private boolean a = false;
  
  public ChartDataPoint(double paramDouble1, double paramDouble2) {
    super(paramDouble1, paramDouble2);
  }
  
  public boolean ChartDataPoint() {
    return this.a;
  }
  
  public void ChartDataPoint(boolean paramBoolean) {
    this.a = paramBoolean;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/aZ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */