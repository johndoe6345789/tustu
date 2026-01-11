package com.efiAnalytics.ui;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.RenderingHints;
import java.awt.Stroke;

public class fh {
  private static boolean b = false;
  
  static Stroke a = new BasicStroke(2.0F);
  
  public static boolean a() {
    return b;
  }
  
  public static void a(boolean paramBoolean) {
    b = paramBoolean;
  }
  
  public static void a(s params, int[] paramArrayOfint1, int[] paramArrayOfint2, float paramFloat) {
    s s1 = b(params);
    for (int i = paramArrayOfint1[0]; i <= paramArrayOfint1[paramArrayOfint1.length - 1]; i++) {
      for (int j = paramArrayOfint2[0]; j <= paramArrayOfint2[paramArrayOfint2.length - 1]; j++) {
        double d = a(params, i, j, paramFloat);
        s1.setValueAt(new Double(d), j, i);
      } 
    } 
    a(s1, params);
  }
  
  public static double a(s params, int paramInt1, int paramInt2, float paramFloat) {
    float f1 = 1.0F - paramFloat;
    int i = params.getColumnCount();
    int j = params.getRowCount();
    if ((paramInt1 == 0 && paramInt2 == 0) || (paramInt1 == i - 1 && paramInt2 == j - 1) || (paramInt1 == 0 && paramInt2 == j - 1) || (paramInt1 == i - 1 && paramInt2 == 0)) {
      byte b = 3;
    } else if (paramInt1 == 0 || paramInt2 == 0 || paramInt1 == i - 1 || paramInt1 == i - 1) {
      byte b = 5;
    } else {
      byte b = 8;
    } 
    float f2 = paramFloat / 8.0F;
    double d1 = params.d(paramInt2, paramInt1).doubleValue();
    double d2 = f1 * d1;
    d2 += f2 * ((paramInt1 > 0) ? params.d(paramInt2, paramInt1 - 1).doubleValue() : d1);
    d2 += f2 * ((paramInt1 > 0 && paramInt2 > 0) ? params.d(paramInt2 - 1, paramInt1 - 1).doubleValue() : d1);
    d2 += f2 * ((paramInt2 > 0) ? params.d(paramInt2 - 1, paramInt1).doubleValue() : d1);
    d2 += f2 * ((paramInt1 + 1 < i && paramInt2 + 1 < j) ? params.d(paramInt2 + 1, paramInt1 + 1).doubleValue() : d1);
    d2 += f2 * ((paramInt1 + 1 < i) ? params.d(paramInt2, paramInt1 + 1).doubleValue() : d1);
    d2 += f2 * ((paramInt2 + 1 < j) ? params.d(paramInt2 + 1, paramInt1).doubleValue() : d1);
    d2 += f2 * ((paramInt1 > 0 && paramInt2 + 1 < j) ? params.d(paramInt2 + 1, paramInt1 - 1).doubleValue() : d1);
    d2 += f2 * ((paramInt1 + 1 < i && paramInt2 > 0) ? params.d(paramInt2 - 1, paramInt1 + 1).doubleValue() : d1);
    return d2;
  }
  
  public static double a(String[] paramArrayOfString, double paramDouble) {
    double d1 = 10.0D;
    try {
      d1 = Double.parseDouble(paramArrayOfString[paramArrayOfString.length - 1]);
    } catch (Exception exception) {
      System.out.println("axisValues=" + paramArrayOfString);
      System.out.println("Exception in getYaxisPosition, axisValues[axisValues.length-1]=" + paramArrayOfString[paramArrayOfString.length - 1] + ", axisValues.length=" + paramArrayOfString.length);
    } 
    double d2 = 0.0D;
    for (int i = paramArrayOfString.length - 1; i >= 0; i--) {
      double d = Double.parseDouble(paramArrayOfString[i]);
      if (d == paramDouble) {
        d2 = i;
        break;
      } 
      if (d > paramDouble) {
        if (i == paramArrayOfString.length - 1) {
          d2 = i;
          break;
        } 
        d2 = i + (d - paramDouble) / (d - d1);
        break;
      } 
      if (i == 0)
        return i; 
      d1 = d;
    } 
    return d2;
  }
  
  public static double b(String[] paramArrayOfString, double paramDouble) {
    double d1 = 0.0D;
    double d2 = Double.parseDouble(paramArrayOfString[0]);
    double d3 = Double.parseDouble(paramArrayOfString[paramArrayOfString.length - 1]);
    if (d3 < d2) {
      double d = 0.0D;
      for (int i = paramArrayOfString.length - 1; i > 0; i--) {
        double d5 = Double.parseDouble(paramArrayOfString[i]);
        if (d5 == paramDouble) {
          d = i;
          break;
        } 
        if (d5 > paramDouble) {
          if (i == paramArrayOfString.length - 1 && paramDouble <= d5) {
            d = (paramArrayOfString.length - 1);
            break;
          } 
          d = i + 1.0D - (paramDouble - d1) / (d5 - d1);
          break;
        } 
        d1 = d5;
      } 
      return d;
    } 
    double d4 = (paramArrayOfString.length - 1);
    for (byte b = 0; b < paramArrayOfString.length; b++) {
      double d = Double.parseDouble(paramArrayOfString[b]);
      if (d == paramDouble) {
        d4 = b;
        break;
      } 
      if (d > paramDouble) {
        if (b == 0 && paramDouble <= d) {
          d4 = 0.0D;
          break;
        } 
        d4 = b - 1.0D + (paramDouble - d1) / (d - d1);
        break;
      } 
      d1 = d;
    } 
    return d4;
  }
  
  public static int a(s params) {
    if (params.J() < 0) {
      byte b1 = 4;
      byte b2 = 0;
      for (byte b3 = 0; b3 < params.getRowCount(); b3++) {
        for (byte b = 0; b < params.getColumnCount(); b++) {
          String str = params.d(b3, b).toString();
          if (str.indexOf(".") != -1) {
            str = str.substring(str.indexOf(".") + 1);
            byte b4;
            for (b4 = 0; b4 < b1 && b4 < str.length() && str.charAt(b4) != '0'; b4++);
            if (b4 > b2)
              b2 = b4; 
          } 
        } 
      } 
      return b2;
    } 
    return params.J();
  }
  
  public static s b(s params) {
    return a(params, (s)null);
  }
  
  public static s a(s params1, s params2) {
    if (params2 == null) {
      params2 = new s();
      params2.a(params1.getRowCount(), params1.getColumnCount());
    } 
    if (params1.getRowCount() == params2.getRowCount() && params1.getColumnCount() == params2.getColumnCount()) {
      params2.e(params1.a());
      params2.c(params1.b());
      params2.f(params1.z());
      params2.d(params1.v());
      if (params1.w() != null && params1.w().trim().length() > 0)
        params2.e(params1.w()); 
      for (byte b = 0; b < params1.getRowCount(); b++) {
        for (byte b1 = 0; b1 < params1.getColumnCount(); b1++) {
          Double double_ = new Double(params1.d(b, b1).doubleValue());
          params2.setValueAt(double_, b, b1);
        } 
      } 
      params2.a(params1.D());
    } else {
      byte b;
      for (b = 0; b < params2.getRowCount(); b++) {
        double d = b * (params1.getRowCount() - 1.0D) / (params2.getRowCount() - 1.0D);
        String str = "" + (int)c(params1.a(), d);
        params2.b(str, b);
      } 
      for (b = 0; b < params2.getColumnCount(); b++) {
        double d = b * (params1.getColumnCount() - 1.0D) / (params2.getColumnCount() - 1.0D);
        String str = "" + (int)c(params1.b(), d);
        params2.a(str, b);
      } 
      for (b = 0; b < params2.getRowCount(); b++) {
        for (byte b1 = 0; b1 < params2.getColumnCount(); b1++) {
          double d1 = Double.parseDouble(params2.b()[b1]);
          double d2 = Double.parseDouble(params2.a()[b]);
          double d3 = a(params1, d1, d2);
          params2.setValueAt(Double.valueOf(d3), b, b1);
        } 
      } 
    } 
    return params2;
  }
  
  public static s b(s params1, s params2) {
    for (byte b = 0; b < params2.getRowCount(); b++) {
      for (byte b1 = 0; b1 < params2.getColumnCount(); b1++) {
        double d1 = Double.parseDouble(params2.b()[b1]);
        double d2 = Double.parseDouble(params2.a()[b]);
        double d3 = a(params1, d1, d2);
        params2.setValueAt(Double.valueOf(d3), b, b1);
      } 
    } 
    return params2;
  }
  
  public static Color a(double paramDouble1, double paramDouble2, double paramDouble3) {
    boolean bool = !b ? true : false;
    return bool ? c(paramDouble1, paramDouble2, paramDouble3) : b(paramDouble1, paramDouble2, paramDouble3);
  }
  
  public static void a(Graphics2D paramGraphics2D, Polygon paramPolygon, double[] paramArrayOfdouble, double paramDouble1, double paramDouble2) {
    Color color1;
    Color color2;
    Color color3;
    Color color4;
    boolean bool = !b ? true : false;
    if (paramPolygon.npoints != 4)
      throw new ArrayIndexOutOfBoundsException("Polygon must contain 4 points"); 
    if (paramArrayOfdouble.length != 4)
      throw new ArrayIndexOutOfBoundsException("vals must contain 4 values"); 
    if (bool) {
      paramGraphics2D.setStroke(a);
      paramGraphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
      color1 = a(paramArrayOfdouble[0], paramDouble1, paramDouble2);
      color2 = a(paramArrayOfdouble[1], paramDouble1, paramDouble2);
      color3 = a(paramArrayOfdouble[2], paramDouble1, paramDouble2);
      color4 = a(paramArrayOfdouble[3], paramDouble1, paramDouble2);
    } else {
      color1 = b(paramArrayOfdouble[0], paramDouble1, paramDouble2);
      color2 = b(paramArrayOfdouble[1], paramDouble1, paramDouble2);
      color3 = b(paramArrayOfdouble[2], paramDouble1, paramDouble2);
      color4 = b(paramArrayOfdouble[3], paramDouble1, paramDouble2);
    } 
    float f1 = Math.abs(paramPolygon.ypoints[0] - paramPolygon.ypoints[3]);
    int i = (paramPolygon.ypoints[0] < paramPolygon.ypoints[3]) ? paramPolygon.ypoints[0] : paramPolygon.ypoints[3];
    float f2 = Math.abs(paramPolygon.ypoints[1] - paramPolygon.ypoints[2]);
    float f3 = (f1 > f2) ? f1 : f2;
    for (byte b = 0; b < f3; b++) {
      float f4 = b * f1 / f3 * f1;
      float f5 = b * f2 / f3 * f2;
      Color color5 = a(color1, color4, f4);
      Color color6 = a(color2, color3, f5);
      int j = paramPolygon.xpoints[0] - Math.round((paramPolygon.xpoints[0] - paramPolygon.xpoints[3]) * f4);
      int k = paramPolygon.xpoints[1] - Math.round((paramPolygon.xpoints[1] - paramPolygon.xpoints[2]) * f5);
      GradientPaint gradientPaint = new GradientPaint(j, (paramPolygon.ypoints[0] + b), color5, k, (paramPolygon.ypoints[1] + b), color6);
      paramGraphics2D.setPaint(gradientPaint);
      paramGraphics2D.drawLine(j, paramPolygon.ypoints[0] - b, k, paramPolygon.ypoints[1] - b);
    } 
  }
  
  public static Color a(Color paramColor1, Color paramColor2, float paramFloat) {
    int i = Math.round(paramColor1.getRed() * paramFloat + paramColor2.getRed() * (1.0F - paramFloat));
    int j = Math.round(paramColor1.getGreen() * paramFloat + paramColor2.getGreen() * (1.0F - paramFloat));
    int k = Math.round(paramColor1.getBlue() * paramFloat + paramColor2.getBlue() * (1.0F - paramFloat));
    int m = Math.round(paramColor1.getAlpha() * paramFloat + paramColor2.getAlpha() * (1.0F - paramFloat));
    return new Color(i, j, k, m);
  }
  
  public static Color b(double paramDouble1, double paramDouble2, double paramDouble3) {
    return a(paramDouble1, paramDouble2, paramDouble3, 50);
  }
  
  public static Color a(double paramDouble1, double paramDouble2, double paramDouble3, int paramInt) {
    if (paramDouble1 > paramDouble3)
      paramDouble1 = paramDouble3; 
    if (paramDouble1 < paramDouble2)
      paramDouble1 = paramDouble2; 
    if (paramDouble2 == paramDouble3)
      return Color.WHITE; 
    float f1 = (float)((paramDouble1 - paramDouble2) / (paramDouble3 - paramDouble2));
    float f2 = 3.0F * f1;
    float f3 = (f1 >= 0.1D) ? (2.0F * (1.0F - f1)) : (0.92F + 10.0F * f1);
    float f4 = 0.0F;
    if (f2 > 1.0F)
      f2 = 1.0F; 
    if (f3 > 1.0F)
      f3 = 1.0F; 
    if (f3 < 0.0F)
      f3 = 0.0F; 
    return new Color(f2, f3, f4);
  }
  
  public static Color b(double paramDouble1, double paramDouble2, double paramDouble3, int paramInt) {
    int i = 255;
    int j = 255;
    int k = 255;
    if (paramDouble1 > paramDouble3) {
      paramDouble1 = paramDouble3;
    } else if (paramDouble1 < paramDouble2) {
      paramDouble1 = paramDouble2;
    } 
    double d = (paramDouble1 - paramDouble2) / (paramDouble3 - paramDouble2);
    if (d < 0.33334D) {
      j = 3 * (int)(d * 255.0D);
      i = 0;
      k = 255 - (int)(Math.pow(d, 2.0D) * 255.0D);
    } else if (d < 0.66667D) {
      double d1 = (d - 0.33334D) * 3.0D;
      j = 255;
      i = (int)(255.0D * d1);
      k = 192 - (int)(d1 * 192.0D);
    } else {
      double d1 = (d - 0.6667D) * 3.0D;
      j = 255 - (int)(d1 * 255.0D);
      i = 255;
      k = 0;
    } 
    i = paramInt + (int)(i / 255.0D * (255 - paramInt));
    j = paramInt + (int)(j / 255.0D * (255 - paramInt));
    k = paramInt + (int)(k / 255.0D * (255 - paramInt));
    return new Color(i, j, k);
  }
  
  public static Color c(double paramDouble1, double paramDouble2, double paramDouble3) {
    if (paramDouble1 > paramDouble3)
      paramDouble1 = paramDouble3; 
    if (paramDouble1 < paramDouble2)
      paramDouble1 = paramDouble2; 
    byte b = 120;
    int i = 255 - b;
    int j = b - 2 * (int)(b * (paramDouble1 - paramDouble2) / (paramDouble3 - paramDouble2));
    int k = 0;
    int m = 0;
    int n = 0;
    if (j > 0) {
      n = j;
      m = b - n;
    } else if (j < 0) {
      k = Math.abs(j);
      m = b - k;
    } else if (j == 0) {
      m = b;
    } 
    m = (int)(m * 0.85D);
    if (k < 0)
      k = 0; 
    if (m < 0)
      m = 0; 
    if (n < 0)
      n = 0; 
    if (k + i > 255)
      k = b; 
    if (m + i > 255)
      m = b; 
    if (n + i > 255)
      n = b; 
    return new Color(k + i, m + i, n + i);
  }
  
  public static double a(s params, double paramDouble1, double paramDouble2) {
    double d1 = b(params.b(), paramDouble1);
    double d2 = a(params.a(), paramDouble2);
    return params.a(((params.a()).length - 1) - d2, d1);
  }
  
  public static double c(String[] paramArrayOfString, double paramDouble) {
    int i = (int)paramDouble;
    int j = (i < paramArrayOfString.length - 2) ? (i + 1) : i;
    double d1 = paramDouble - i;
    double d2 = Double.parseDouble(paramArrayOfString[j]);
    double d3 = Double.parseDouble(paramArrayOfString[i]);
    return d3 * (1.0D - d1) + d2 * d1;
  }
  
  public static double c(s params) {
    double d = Double.MIN_VALUE;
    for (byte b = 0; b < params.getRowCount(); b++) {
      for (byte b1 = 0; b1 < params.getColumnCount(); b1++) {
        double d1 = params.d(b, b1).doubleValue();
        if (d1 > d)
          d = d1; 
      } 
    } 
    return d;
  }
  
  public static double d(s params) {
    double d = 0.0D;
    byte b1 = 0;
    for (byte b2 = 0; b2 < params.getRowCount(); b2++) {
      for (byte b = 0; b < params.getColumnCount(); b++) {
        double d1 = params.d(b2, b).doubleValue();
        d = (d * b1 + d1) / (b1 + 1);
        b1++;
      } 
    } 
    return d;
  }
  
  public static s c(s params1, s params2) {
    if (params2 == null) {
      params2 = new s();
      params2.a(params1.getRowCount(), params1.getColumnCount());
    } 
    if (params1.getRowCount() == params2.getRowCount() && params1.getColumnCount() == params2.getColumnCount()) {
      params2.e(params1.a());
      params2.c(params1.b());
      params2.f(params1.z());
      params2.d(params1.v());
      if (params1.w() != null && params1.w().trim().length() > 0)
        params2.e(params1.w()); 
    } else {
      byte b;
      for (b = 0; b < params2.getRowCount(); b++) {
        double d = b * (params1.getRowCount() - 1.0D) / (params2.getRowCount() - 1.0D);
        String str = "" + (int)c(params1.a(), d);
        params2.b(str, b);
      } 
      for (b = 0; b < params2.getColumnCount(); b++) {
        double d = b * (params1.getColumnCount() - 1.0D) / (params2.getColumnCount() - 1.0D);
        String str = "" + (int)c(params1.b(), d);
        params2.a(str, b);
      } 
    } 
    return params2;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/fh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */