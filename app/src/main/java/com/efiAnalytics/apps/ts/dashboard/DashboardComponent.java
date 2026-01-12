package com.efiAnalytics.apps.ts.dashboard;

import G.ManagerUsingArrayList;
import G.T;
import java.awt.Graphics;
import java.awt.geom.Area;
import java.io.Serializable;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import javax.swing.JComponent;

public abstract class DashboardComponent extends JComponent implements Serializable {
  private double a = 0.0D;

  private double b = 0.0D;

  private double c = 0.2D;

  private double d = 0.2D;

  private ac f = null;

  private String g = "";

  private boolean h = false;

  private String i = "";

  protected String e = "";

  private int j = 0;

  private int k = 0;

  private boolean l = true;

  private boolean m = false;

  private boolean n = false;

  public double getRelativeX() {
    return this.a;
  }

  public void setRelativeX(double paramDouble) {
    this.a = paramDouble;
  }

  public double getRelativeY() {
    return this.b;
  }

  public void setRelativeY(double paramDouble) {
    this.b = paramDouble;
  }

  public double getRelativeWidth() {
    return this.c;
  }

  public void setRelativeWidth(double paramDouble) {
    this.c = paramDouble;
  }

  public double getRelativeHeight() {
    return this.d;
  }

  public void setRelativeHeight(double paramDouble) {
    this.d = paramDouble;
  }

  public boolean isAntialiasingOn() {
    return this.l;
  }

  public void setAntialiasingOn(boolean paramBoolean) {
    this.l = paramBoolean;
  }

  public void myGaugeContainer(ac paramac) {
    this.f = paramac;
  }

  public ac myGaugeContainer() {
    if (this.f == null && getParent() != null && getParent() instanceof ac)
      this.f = (ac) getParent();
    return this.f;
  }

  public void setGaugeContainer(ac paramac) {
    this.f = paramac;
  }

  public abstract void setRunDemo(boolean paramBoolean);

  public abstract boolean isRunDemo();

  public abstract void goDead();

  public abstract void invalidatePainter();

  public abstract boolean isMustPaint();

  public boolean isDirty() {
    if (this.n || getWidth() != this.j || getHeight() != this.k) {
      updateLastsVals();
      return true;
    }
    return false;
  }

  protected void updateLastsVals() {
    this.j = getWidth();
    this.k = getHeight();
  }

  public String getFontFamily() {
    return this.g;
  }

  public void setFontFamily(String paramString) {
    this.g = paramString;
    invalidatePainter();
  }

  public String toString() {
    Field[] arrayOfField = getClass().getDeclaredFields();
    AccessibleObject.setAccessible((AccessibleObject[]) arrayOfField, true);
    null = getClass().getName();
    for (byte b = 0; b < arrayOfField.length; b++) {
      Field field = arrayOfField[b];
      try {
        null =
            null
                + "\n\t"
                + field.getName()
                + "="
                + field.get(this)
                + ", Generic String:"
                + field.toGenericString()
                + ", ";
      } catch (Exception exception) {
      }
    }
    return null + "\n";
  }

  public boolean isInvalidState() {
    return this.m;
  }

  protected void setInvalidState(boolean paramBoolean) {
    this.m = paramBoolean;
  }

  public void setBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.setBounds(paramInt1, paramInt2, paramInt3, paramInt4);
  }

  public void updateRelativeBoundsToCurrent() {
    if (getParent() != null && getParent().getWidth() > 0 && getParent().getHeight() > 0) {
      this.a = getX() / getParent().getWidth();
      this.b = getY() / getParent().getHeight();
      this.c = getWidth() / getParent().getWidth();
      this.d = getHeight() / getParent().getHeight();
    }
  }

  public void setDirty(boolean paramBoolean) {
    this.n = paramBoolean;
  }

  public String getEcuConfigurationName() {
    return (this.e != null && this.e.equals(ManagerUsingArrayList.a))
        ? this.e
        : ((T.a().c() != null && T.a().c().c().equals(this.e))
            ? ""
            : ((this.e != null && !this.e.isEmpty()) ? this.e : this.e));
  }

  public void setEcuConfigurationName(String paramString) {
    if (paramString == null || paramString.equals("null")) {
      this.e = "";
    } else {
      this.e = paramString;
    }
  }

  public abstract boolean isComponentPaintedAt(int paramInt1, int paramInt2);

  public abstract void subscribeToOutput();

  public abstract void unsubscribeToOutput();

  public String getId() {
    return this.i;
  }

  public void setId(String paramString) {
    this.i = paramString;
  }

  public boolean isItalicFont() {
    return this.h;
  }

  public void setItalicFont(boolean paramBoolean) {
    this.h = paramBoolean;
  }

  public abstract void paintBackground(Graphics paramGraphics);

  public abstract boolean requiresBackgroundRepaint();

  public abstract void updateGauge(Graphics paramGraphics);

  public abstract Area areaPainted();
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/dashboard/s.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
