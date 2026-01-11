package com.efiAnalytics.ui;

import bH.D;
import bH.X;
import java.io.InputStream;

public class TableModelFactory {
  public static TableDataModel a(TableDataModel params) {
    TableDataModel s1 = new TableDataModel();
    s1.a(3, 3);
    String[] arrayOfString1 = new String[3];
    String[] arrayOfString2 = new String[3];
    String[] arrayOfString3 = params.a();
    arrayOfString1[2] = arrayOfString3[0];
    arrayOfString1[0] = arrayOfString3[arrayOfString3.length - 1];
    arrayOfString1[1] = X.a((Double.parseDouble(arrayOfString1[0]) + Double.parseDouble(arrayOfString1[2])) * 0.35D);
    s1.d(arrayOfString1);
    arrayOfString3 = params.b();
    arrayOfString2[0] = arrayOfString3[0];
    arrayOfString2[2] = arrayOfString3[arrayOfString3.length - 1];
    arrayOfString2[1] = X.a((Double.parseDouble(arrayOfString2[0]) + Double.parseDouble(arrayOfString2[2])) * 0.3D);
    s1.c(arrayOfString2);
    s1.setValueAt(Double.valueOf(200.0D), 0, 0);
    s1.setValueAt(Double.valueOf(250.0D), 1, 0);
    s1.setValueAt(Double.valueOf(350.0D), 2, 0);
    s1.setValueAt(Double.valueOf(70.0D), 0, 1);
    s1.setValueAt(Double.valueOf(150.0D), 1, 1);
    s1.setValueAt(Double.valueOf(300.0D), 2, 1);
    s1.setValueAt(Double.valueOf(40.0D), 0, 2);
    s1.setValueAt(Double.valueOf(100.0D), 1, 2);
    s1.setValueAt(Double.valueOf(200.0D), 2, 2);
    s1.d(params.v());
    s1.e(params.w());
    return s1;
  }
  
  public static double[] a(int paramInt, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4) {
    double[] arrayOfDouble = new double[paramInt];
    byte b1 = 0;
    byte b2 = 3;
    if (arrayOfDouble.length > 12) {
      b2 = 3;
      arrayOfDouble[b1++] = Math.floor((paramDouble1 - paramDouble1 * 0.2D) / 100.0D) * 100.0D;
      arrayOfDouble[b1++] = (Math.round(paramDouble1 / 100.0D) * 100L);
      arrayOfDouble[b1++] = Math.ceil((paramDouble1 + paramDouble1 * 0.25D) / 100.0D) * 100.0D;
    } else if (arrayOfDouble.length > 8) {
      b2 = 2;
      arrayOfDouble[b1++] = Math.floor((paramDouble1 - paramDouble1 * 0.2D) / 100.0D) * 100.0D;
      arrayOfDouble[b1++] = Math.ceil((paramDouble1 + paramDouble1 * 0.2D) / 100.0D) * 100.0D;
    } else {
      b2 = 2;
      arrayOfDouble[b1++] = Math.floor((paramDouble1 - paramDouble1 * 0.25D) / 100.0D) * 100.0D;
      arrayOfDouble[b1++] = Math.ceil((paramDouble1 + 100.0D) / 100.0D) * 100.0D;
    } 
    int i = arrayOfDouble.length - b2 - 3;
    int j = (int)Math.ceil(i / 2.0D);
    paramDouble2 = (Math.round(paramDouble2 / 100.0D) * 100L);
    int k;
    for (k = 1; k <= j; k++) {
      double d1 = (2 * j + k) / (j * 3);
      double d2 = arrayOfDouble[b2 - 1] + d1 * k * (paramDouble2 - arrayOfDouble[b2 - 1]) / (j + 1);
      arrayOfDouble[b1++] = (Math.round(d2 / 100.0D) * 100L);
    } 
    arrayOfDouble[b1++] = paramDouble2;
    k = (int)Math.ceil((2 * (arrayOfDouble.length - b1 - 2)) / 3.0D);
    paramDouble3 = (Math.round(paramDouble3 / 100.0D) * 100L);
    int m;
    for (m = 1; m <= k; m++) {
      double d = paramDouble2 + m * (paramDouble3 - paramDouble2) / (k + 1);
      arrayOfDouble[b1++] = (Math.round(d / 100.0D) * 100L);
    } 
    arrayOfDouble[b1++] = paramDouble3;
    m = arrayOfDouble.length - b1 - 1;
    paramDouble4 = Math.ceil(paramDouble4 / 100.0D) * 100.0D;
    for (byte b3 = 1; b3 <= m; b3++)
      arrayOfDouble[b1++] = paramDouble3 + b3 * (paramDouble4 - paramDouble3) / (m + 1); 
    arrayOfDouble[b1++] = paramDouble4;
    return arrayOfDouble;
  }
  
  public static double[] a(int paramInt, double paramDouble1, double paramDouble2) {
    double[] arrayOfDouble1 = new double[paramInt];
    int i = (int)(Math.round(paramDouble1 / 11.0D) * 5L);
    paramDouble1 = Math.ceil(paramDouble1 / 5.0D) * 5.0D;
    paramDouble2 = Math.ceil(paramDouble2 / 5.0D) * 5.0D;
    int j = (int)((paramDouble2 <= 105.0D) ? 0L : Math.round(paramInt * 0.3D + 2.0D * Math.log((paramDouble2 - 100.0D) / (100.0D - i))));
    int k = paramInt - j;
    byte b1;
    for (b1 = 5; i + (k - 1) * b1 > 100; b1--);
    while (i + (k - 1) * b1 * 2 < 100)
      b1++; 
    int m = (int)Math.ceil((100.0D - i) / b1) - k + 1;
    byte b2;
    for (b2 = 0; b2 < k; b2++) {
      if (b2 == 0) {
        arrayOfDouble1[b2] = i;
      } else if (m > 0 && 3 * (k - m) / 4 < b2) {
        arrayOfDouble1[b2] = arrayOfDouble1[b2 - 1] + (b1 * 2);
        m--;
      } else if (m > 0 && b2 == 1) {
        arrayOfDouble1[b2] = arrayOfDouble1[b2 - 1] + (b1 * 2);
        m--;
      } else if (arrayOfDouble1[b2 - 1] + b1 > 100.0D) {
        arrayOfDouble1[b2] = 100.0D;
      } else {
        arrayOfDouble1[b2] = arrayOfDouble1[b2 - 1] + b1;
      } 
    } 
    b1 = 25;
    i = 100;
    for (b2 = 0; b2 < j; b2++)
      arrayOfDouble1[k + b2] = i + (b2 + 1) * (paramDouble2 - i) / j; 
    double[] arrayOfDouble2 = new double[arrayOfDouble1.length];
    for (byte b3 = 0; b3 < arrayOfDouble2.length; b3++)
      arrayOfDouble2[b3] = arrayOfDouble1[arrayOfDouble1.length - 1 - b3]; 
    return arrayOfDouble2;
  }
  
  public static s a(s params, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, double paramDouble7, double paramDouble8, double paramDouble9, boolean paramBoolean) {
    double[] arrayOfDouble1 = a(params.getColumnCount(), paramDouble1, paramDouble7, paramDouble3, paramDouble4);
    String[] arrayOfString = new String[arrayOfDouble1.length];
    for (byte b1 = 0; b1 < arrayOfString.length; b1++)
      arrayOfString[b1] = "" + (int)arrayOfDouble1[b1]; 
    params.c(arrayOfString);
    double d = (paramDouble6 > paramDouble9) ? paramDouble6 : paramDouble9;
    double[] arrayOfDouble2 = a(params.getRowCount(), paramDouble2, d);
    for (byte b2 = 0; b2 < arrayOfDouble2.length; b2++)
      params.b("" + arrayOfDouble2[b2], b2); 
    return params;
  }
  
  public static s a(s params, int paramInt1, int paramInt2, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, double paramDouble7, double paramDouble8, double paramDouble9, double paramDouble10, boolean paramBoolean, double paramDouble11) {
    s s1 = new s();
    s1.a(paramInt2, paramInt1);
    double[] arrayOfDouble1 = a(paramInt1, paramDouble1, paramDouble7, paramDouble3, paramDouble4);
    String[] arrayOfString = new String[arrayOfDouble1.length];
    for (byte b1 = 0; b1 < arrayOfString.length; b1++)
      arrayOfString[b1] = "" + (int)arrayOfDouble1[b1]; 
    s1.c(arrayOfString);
    double d = (paramDouble6 > paramDouble9) ? paramDouble6 : paramDouble9;
    double[] arrayOfDouble2 = a(paramInt2, paramDouble2, d);
    for (byte b2 = 0; b2 < arrayOfDouble2.length; b2++)
      s1.b("" + arrayOfDouble2[b2], b2); 
    return a(s1, params, paramDouble1, paramDouble2, paramDouble3, paramDouble5, paramDouble6, paramDouble7, paramDouble8, paramDouble9, paramDouble10, paramBoolean, paramDouble11);
  }
  
  public static s a(s params1, s params2, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, double paramDouble7, double paramDouble8, double paramDouble9, boolean paramBoolean, double paramDouble10) {
    double d1 = params1.F();
    double d2 = (d1 > 101.3D) ? 0.65D : 1.0D;
    double d3 = (d1 > 101.3D && paramBoolean) ? 0.59D : 0.0D;
    double d4 = d2 + (1.0D - d2) * d3;
    double d5 = paramDouble7 * 101.3D / paramDouble8 * d4;
    double d6 = paramDouble4 * 101.3D / paramDouble5 * d4 * 5252.0D / paramDouble3;
    double d7 = (paramDouble5 > 101.3D) ? (paramBoolean ? 0.52D : 0.56D) : 0.47D;
    double d8 = (paramDouble5 > 101.3D) ? (paramBoolean ? 0.56D : 0.6D) : 0.5D;
    double d9 = 941100.0D * d7 * paramDouble7 / paramDouble9 * 5252.0D;
    double d10 = 941100.0D * d8 * paramDouble4 / paramDouble9 * paramDouble3;
    double d11 = 941100.0D * d8 * d6 / paramDouble9 * paramDouble3;
    if (d10 > d9 * d8 / d7) {
      d9 = d10;
      d10 = d9 * 0.98D;
      D.c("input HP and TQ look unreasonable, adjusting.");
    } 
    double d12 = d9;
    double d13 = d10;
    double d14 = (d13 - d12) / (paramDouble3 * paramDouble3 - 2.0D * paramDouble6 * paramDouble3 + paramDouble6 * paramDouble6);
    double d15 = -2.0D * d14 * paramDouble6;
    double d16 = d12 + d14 * paramDouble6 * paramDouble6;
    double d17 = 0.31D * (d5 / paramDouble9 + d6 / paramDouble9);
    double d18 = d14 * paramDouble6 * paramDouble6 + d15 * paramDouble6 + d16;
    double d19 = d18 * 0.25D * 100.0D / d1;
    int i = params1.getColumnCount();
    int j = params1.getRowCount();
    double d20 = 1.0D - 8.0D / i * 0.05D;
    double d21 = 0.0D;
    double d22 = params1.e(0);
    double d23 = (d1 - (d1 - d22) * d17) / d1;
    double d24 = (d14 * paramDouble1 * paramDouble1 + d15 * paramDouble1 + d16) * d23;
    double d25 = 14.7D;
    for (byte b = 0; b < j; b++) {
      double d27;
      double d26 = params1.e(b);
      if (d4 < 1.0D && d26 > 90.0D) {
        d27 = 1.0D - (d26 - 90.0D) / (d1 - 90.0D) * d4;
      } else {
        d27 = d4;
      } 
      double d28 = d17 * d27;
      double d29 = (d1 - (d1 - d26) * d28) / d1;
      for (byte b1 = 0; b1 < i; b1++) {
        double d30 = params1.d(b1);
        double d31 = (d14 * d30 * d30 + d15 * d30 + d16) * d29;
        double d32 = (paramDouble2 + 1.0D > d26) ? (Math.pow(paramDouble2 + 5.0D, 4.0D) / Math.pow(d26, 4.0D)) : (Math.pow(paramDouble2 + 5.0D, 5.0D) / Math.pow(d26, 5.0D));
        double d33 = Math.pow(paramDouble1 + 100.0D, 3.0D) / Math.pow(d30, 3.0D);
        double d34 = d33 * d32;
        double d35 = (d24 * d34 + d31) / (1.0D + d34);
        if (d35 < d19) {
          d35 = d19;
          D.c("ve below min. ve=" + d35 + ", min=" + d19);
        } else if (d35 > d18) {
          d35 = d18;
        } 
        if (b1 > 0 && d35 < d21 * d20)
          d35 = d21 * d20; 
        d21 = d35;
        double d36 = fh.a(params2, d30, d26);
        if (d25 > d36)
          d25 = d36; 
        double d37 = (d36 > 3.0D) ? (d36 / d25) : d36;
        params1.a(Double.valueOf(d35 * paramDouble10 * d37), b, b1);
      } 
    } 
    return params1;
  }
  
  public static s a(s params, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4) {
    byte b;
    for (b = 0; b < params.getColumnCount(); b++)
      params.b()[b] = (paramDouble3 + (paramDouble4 - paramDouble3) * b / (params.getColumnCount() - 1)) + ""; 
    for (b = 0; b < params.getRowCount(); b++)
      params.a()[params.getRowCount() - 1 - b] = (paramDouble1 + (paramDouble2 - paramDouble1) * b / (params.getRowCount() - 1)) + ""; 
    return b(params);
  }
  
  public static s b(s params) {
    return a(params, 1.0D);
  }
  
  public static s a(s params, double paramDouble) {
    InputStream inputStream = params.getClass().getResourceAsStream("resources/afrTableReference.table");
    eY eY = new eY();
    s s1 = eY.a(inputStream);
    double d1 = Double.parseDouble(params.b()[0]);
    double d2 = Double.parseDouble(params.b()[(params.b()).length - 1]);
    for (byte b = 0; b < params.getRowCount(); b++) {
      for (byte b1 = 0; b1 < params.getColumnCount(); b1++) {
        double d3 = Double.parseDouble(params.b()[b1]);
        double d4 = (d3 - d1) / (d2 - d1);
        double d5 = d1 + d4 * (d2 - d1);
        double d6 = Double.parseDouble(params.a()[b]);
        double d7 = fh.a(s1, d4, d6);
        params.setValueAt(Double.valueOf(d7 * paramDouble), b, b1);
      } 
    } 
    params.q();
    return params;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/u.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */