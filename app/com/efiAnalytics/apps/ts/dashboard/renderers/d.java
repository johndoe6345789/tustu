package com.efiAnalytics.apps.ts.dashboard.renderers;

import com.efiAnalytics.apps.ts.dashboard.s;
import java.awt.Graphics;
import java.awt.geom.Area;
import java.io.Serializable;

public interface d extends Serializable {
  String getName();
  
  void paintGauge(Graphics paramGraphics, s params);
  
  void updateGauge(Graphics paramGraphics, s params);
  
  void paintBackground(Graphics paramGraphics, s params);
  
  boolean requiresBackgroundRepaint(s params);
  
  void invalidate();
  
  Area areaPainted(s params);
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/dashboard/renderers/d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */