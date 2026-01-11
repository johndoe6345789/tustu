package com.efiAnalytics.apps.ts.dashboard;

import G.R;
import G.T;
import bH.D;
import com.efiAnalytics.tuningwidgets.panels.SelectableTablePanel;
import com.efiAnalytics.tuningwidgets.panels.ay;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;
import java.io.Serializable;
import javax.accessibility.AccessibleContext;

public class SelectableTableComponent extends SingleChannelDashComponent implements t, ay, Serializable {
  SelectableTablePanel a = null;
  
  R b = null;
  
  private String c = null;
  
  public SelectableTableComponent() {
    setLayout(new BorderLayout());
    setDoubleBuffered(true);
  }
  
  private void addTableSelector() {
    if (this.a == null) {
      if (this.b == null)
        setEcuConfigurationName(getEcuConfigurationName()); 
      this.a = new SelectableTablePanel(this.b);
      this.a.a(3);
      this.a.a(this);
      if (this.c != null)
        this.a.a(this.c); 
      if (this.c != null)
        setSelectedTableName(this.c); 
      add("Center", (Component)this.a);
    } 
  }
  
  public AccessibleContext getAccessibleContext() {
    return null;
  }
  
  public void setEcuConfigurationName(String paramString) {
    super.setEcuConfigurationName(paramString);
    if (paramString == null || paramString.isEmpty()) {
      this.b = T.a().c();
    } else {
      this.b = T.a().c(paramString);
    } 
  }
  
  public void setCurrentOutputChannelValue(String paramString1, String paramString2) {}
  
  public void setValue(double paramDouble) {}
  
  public double getValue() {
    return 0.0D;
  }
  
  public void setCurrentOutputChannelValue(String paramString, double paramDouble) {}
  
  public void setRunDemo(boolean paramBoolean) {}
  
  public boolean isRunDemo() {
    return false;
  }
  
  public void goDead() {}
  
  public void invalidatePainter() {}
  
  public boolean isMustPaint() {
    return false;
  }
  
  public void subscribeToOutput() {
    addTableSelector();
  }
  
  public String getSelectedTableName() {
    return this.c;
  }
  
  public void setSelectedTableName(String paramString) {
    this.c = paramString;
  }
  
  public void panelSelectionChanged(String paramString1, String paramString2) {
    this.c = paramString2;
    super.setEcuConfigurationName(this.e);
  }
  
  public void repaint(long paramLong, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    System.out.println("SelectablTableComponent::Repaint: x=" + paramInt1 + ", y=" + paramInt2 + ", w=" + paramInt3 + ", h=" + paramInt4);
    super.repaint(paramLong, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public boolean isComponentPaintedAt(int paramInt1, int paramInt2) {
    return (paramInt1 >= 0 && paramInt1 < getWidth() && paramInt2 >= 0 && paramInt2 < getHeight());
  }
  
  public void paintAll(Graphics paramGraphics) {
    D.c("PaintAll");
  }
  
  public void paint(Graphics paramGraphics) {
    super.paint(paramGraphics);
  }
  
  public void paintBackground(Graphics paramGraphics) {
    this.a.paint(paramGraphics);
  }
  
  public boolean requiresBackgroundRepaint() {
    return (this.a != null && this.a.isValid());
  }
  
  public void updateGauge(Graphics paramGraphics) {}
  
  public Area areaPainted() {
    Rectangle2D.Double double_ = new Rectangle2D.Double(0.0D, 0.0D, getWidth(), getHeight());
    return new Area(double_);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/dashboard/SelectableTableComponent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */