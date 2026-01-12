package com.efiAnalytics.apps.ts.dashboard;

import G.ManagerUsingArrayList;
import java.awt.Color;
import java.awt.Component;
import java.io.Serializable;

public class DashboardConfiguration implements Serializable {
  private String a = "";

  private Color b = null;

  private Color c = null;

  private String d = "";

  private String e = "";

  private Component[] f = null;

  private boolean g = true;

  private boolean h = false;

  private double i = 16.0D;

  private double j = 9.0D;

  public Color a() {
    return this.b;
  }

  public void a(Color paramColor) {
    this.b = paramColor;
  }

  public String b() {
    return this.d;
  }

  public void a(String paramString) {
    if (paramString == null || paramString.equals("") || paramString.equals("null")) {
      paramString = null;
    } else {
      this.d = paramString;
    }
  }

  public Component[] c() {
    return this.f;
  }

  public void a(Component[] paramArrayOfComponent) {
    this.f = paramArrayOfComponent;
  }

  public String d() {
    return this.a;
  }

  public void b(String paramString) {
    this.a = paramString;
  }

  public String e() {
    return this.e;
  }

  public void c(String paramString) {
    this.e = paramString;
  }

  public void d(String paramString) {
    if (this.f != null)
      for (byte b = 0; b < this.f.length; b++) {
        if (this.f[b] instanceof s) {
          s s = (s) this.f[b];
          if (s.getEcuConfigurationName() != null
              && !s.getEcuConfigurationName().equals(ManagerUsingArrayList.a))
            s.setEcuConfigurationName(paramString);
        }
      }
  }

  public boolean f() {
    return this.g;
  }

  public void a(boolean paramBoolean) {
    this.g = paramBoolean;
  }

  public Color g() {
    return this.c;
  }

  public void b(Color paramColor) {
    this.c = paramColor;
  }

  public boolean h() {
    return this.h;
  }

  public void b(boolean paramBoolean) {
    this.h = paramBoolean;
  }

  public double i() {
    return this.i;
  }

  public void a(double paramDouble) {
    this.i = paramDouble;
  }

  public double j() {
    return this.j;
  }

  public void b(double paramDouble) {
    this.j = paramDouble;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/dashboard/Z.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
