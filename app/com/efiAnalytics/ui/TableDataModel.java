package com.efiAnalytics.ui;

import W.an;
import bH.I;
import bH.X;
import java.util.ArrayList;
import java.util.List;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class TableDataModel implements an, TableModel {
  ArrayList g = new ArrayList();
  
  Double[][] h;
  
  Double[][] i = null;
  
  b[][] j = null;
  
  String[] k = null;
  
  String[] l = null;
  
  String m = "MAP";
  
  String n = "RPM";
  
  String o = "";
  
  double p = Double.MAX_VALUE;
  
  double q = Double.MIN_VALUE;
  
  boolean r = true;
  
  private boolean a = true;
  
  private boolean b = true;
  
  List s = new ArrayList();
  
  private int c = -1;
  
  private boolean d = false;
  
  private List e = new ArrayList();
  
  private int f = 0;
  
  public s() {
    a(16, 16);
  }
  
  public int o() {
    byte b1 = 0;
    if (this.h != null)
      for (byte b2 = 0; b2 < this.h.length; b2++) {
        for (byte b3 = 0; b3 < (this.h[0]).length; b3++) {
          String str = this.h[b2][b3].toString();
          if (str.indexOf(".") != -1) {
            String str1 = str.substring(str.indexOf(".") + 1);
            byte b4 = str1.equals("0") ? 0 : str1.length();
            if (b4 > b1)
              b1 = b4; 
          } 
        } 
      }  
    return b1;
  }
  
  public void a(boolean paramBoolean) {
    this.r = paramBoolean;
  }
  
  public boolean p() {
    return this.r;
  }
  
  public void a(int paramInt1, int paramInt2) {
    boolean bool = (this.k == null || this.k.length != paramInt2 || this.l == null || this.l.length != paramInt1) ? true : false;
    this.h = new Double[paramInt1][paramInt2];
    this.i = this.h;
    if (this.j != null && (this.j.length != paramInt1 || (this.j[0]).length != paramInt2))
      this.j = null; 
    if (this.k == null || this.k.length != paramInt2)
      this.k = new String[paramInt2]; 
    if (this.l == null || this.l.length != paramInt1)
      this.l = new String[paramInt1]; 
    q();
    if (bool)
      f(paramInt1, paramInt2); 
  }
  
  public void q() {
    this.i = c(this.h);
  }
  
  public boolean r() {
    for (byte b1 = 0; b1 < this.h.length; b1++) {
      for (byte b2 = 0; b2 < (this.h[0]).length; b2++) {
        if (!this.h[b1][b2].equals(this.i[b1][b2]))
          return true; 
      } 
    } 
    return false;
  }
  
  public boolean b(int paramInt1, int paramInt2) {
    paramInt1 = this.h.length - paramInt1 - 1;
    return (this.h[paramInt1][paramInt2] != null && this.i[paramInt1][paramInt2] != null && this.h[paramInt1][paramInt2].equals(this.i[paramInt1][paramInt2]));
  }
  
  public Double c(int paramInt1, int paramInt2) {
    return Double.valueOf((this.i[this.i.length - 1 - paramInt1][paramInt2] != null) ? this.i[this.i.length - 1 - paramInt1][paramInt2].doubleValue() : Double.NaN);
  }
  
  public Double[][] s() {
    return this.i;
  }
  
  public void a(Double[][] paramArrayOfDouble) {
    if (paramArrayOfDouble.length != this.h.length)
      System.out.println("Clean values sizes don't match for BinTable, Don't know what to do with it"); 
    this.i = paramArrayOfDouble;
  }
  
  public int t() {
    return this.h.length * (this.h[0]).length;
  }
  
  public void u() {
    this.p = Double.MAX_VALUE;
    this.q = -1.7976931348623157E308D;
  }
  
  public void d(String paramString) {
    this.m = paramString;
  }
  
  public String v() {
    return this.m;
  }
  
  public void e(String paramString) {
    this.n = paramString;
  }
  
  public String w() {
    return this.n;
  }
  
  private double a(String paramString) {
    try {
      return (paramString == null) ? Double.NaN : Double.parseDouble(paramString);
    } catch (Exception exception) {
      return Double.NaN;
    } 
  }
  
  public void c(String[] paramArrayOfString) {
    if (this.k != null && this.k.length == paramArrayOfString.length) {
      for (byte b1 = 0; b1 < this.k.length; b1++) {
        double d1 = a(this.k[b1]);
        double d2 = a(paramArrayOfString[b1]);
        if (d1 != d2) {
          this.k[b1] = paramArrayOfString[b1];
          a(Double.valueOf(d2), -1, b1);
        } 
      } 
    } else {
      this.k = new String[paramArrayOfString.length];
      for (byte b1 = 0; b1 < this.k.length; b1++) {
        double d = a(paramArrayOfString[b1]);
        this.k[b1] = paramArrayOfString[b1];
        a(Double.valueOf(d), -1, b1);
      } 
    } 
  }
  
  public void d(String[] paramArrayOfString) {
    if (this.l != null && this.l.length == paramArrayOfString.length / 2) {
      for (byte b1 = 0; b1 < paramArrayOfString.length; b1++) {
        if ((b1 + 1) % 2 == 0)
          this.l[(b1 - 1) / 2] = paramArrayOfString[paramArrayOfString.length - b1]; 
      } 
    } else {
      this.l = new String[paramArrayOfString.length];
      for (byte b1 = 0; b1 < paramArrayOfString.length; b1++) {
        if (H()) {
          this.l[b1] = paramArrayOfString[paramArrayOfString.length - 1 - b1];
        } else {
          this.l[b1] = paramArrayOfString[b1];
        } 
      } 
    } 
  }
  
  public void e(String[] paramArrayOfString) {
    if (this.l != null && this.l.length == paramArrayOfString.length) {
      for (byte b1 = 0; b1 < this.l.length; b1++) {
        double d1 = a(this.l[b1]);
        double d2 = a(paramArrayOfString[b1]);
        if (d1 != d2) {
          this.l[b1] = paramArrayOfString[b1];
          a(Double.valueOf(d2), b1, -1);
        } 
      } 
    } else {
      this.l = new String[paramArrayOfString.length];
      for (byte b1 = 0; b1 < this.l.length; b1++) {
        double d = a(paramArrayOfString[b1]);
        this.l[b1] = paramArrayOfString[b1];
        a(Double.valueOf(d), b1, -1);
      } 
    } 
  }
  
  public void a(String paramString, int paramInt) {
    this.k[paramInt] = paramString;
    a(Double.valueOf(paramString), -1, paramInt);
  }
  
  public void b(String paramString, int paramInt) {
    this.l[paramInt] = paramString;
    a(Double.valueOf(paramString), paramInt, -1);
  }
  
  public String[] a() {
    if (this.l.length / 2 == getRowCount()) {
      String[] arrayOfString = new String[getRowCount()];
      byte b1 = 0;
      for (byte b2 = 0; b2 < this.l.length; b2++) {
        arrayOfString[b1] = this.l[b2];
        b2++;
        b1++;
      } 
      this.l = arrayOfString;
      this.a = false;
    } 
    return this.l;
  }
  
  public String[] b() {
    return this.k;
  }
  
  public Object[][] x() {
    Object[][] arrayOfObject = new Object[this.l.length][1];
    for (byte b1 = 0; b1 < this.l.length; b1++)
      arrayOfObject[b1][0] = this.l[b1]; 
    return arrayOfObject;
  }
  
  public Object[][] y() {
    Object[][] arrayOfObject = new Object[this.l.length][1];
    for (byte b1 = 0; b1 < this.l.length; b1++) {
      if (this.l[b1] != null)
        arrayOfObject[b1][0] = Double.valueOf((Double.parseDouble(this.l[b1]) - 100.0D) * 0.145038D); 
    } 
    return arrayOfObject;
  }
  
  public void f(String paramString) {
    this.o = paramString;
  }
  
  public String z() {
    return this.o;
  }
  
  public int getRowCount() {
    return (this.h == null) ? 0 : this.h.length;
  }
  
  public int getColumnCount() {
    return (this.h[0]).length;
  }
  
  public String getColumnName(int paramInt) {
    return (this.k == null || this.k.length <= paramInt) ? "" : this.k[paramInt];
  }
  
  public double A() {
    return this.p;
  }
  
  public double B() {
    return this.q;
  }
  
  public Class getColumnClass(int paramInt) {
    return Double.class;
  }
  
  public boolean isCellEditable(int paramInt1, int paramInt2) {
    return true;
  }
  
  public Double d(int paramInt1, int paramInt2) {
    return (this.f == 1 && this.j != null) ? this.j[this.j.length - 1 - paramInt1][paramInt2].i() : ((this.f == 3 && this.j != null) ? this.j[this.j.length - 1 - paramInt1][paramInt2].f() : ((this.f == 2 && this.j != null) ? this.j[this.j.length - 1 - paramInt1][paramInt2].g() : this.h[this.h.length - 1 - paramInt1][paramInt2]));
  }
  
  public Double e(int paramInt1, int paramInt2) {
    return this.h[paramInt1][paramInt2];
  }
  
  public double a(double paramDouble1, double paramDouble2) {
    int i = (int)paramDouble1;
    int j = (int)paramDouble2;
    int k = (i < this.h.length - 1) ? (i + 1) : i;
    int m = (j < (this.h[0]).length - 1) ? (j + 1) : j;
    double d1 = H() ? (paramDouble1 - i) : i;
    double d2 = H() ? (paramDouble2 - j) : j;
    null = 0.0D;
    return this.h[i][j].doubleValue() * (1.0D - d2) * (1.0D - d1) + this.h[i][m].doubleValue() * d2 * (1.0D - d1) + this.h[k][j].doubleValue() * (1.0D - d2) * d1 + this.h[k][m].doubleValue() * d2 * d1;
  }
  
  public void b(Double[][] paramArrayOfDouble) {
    this.h = paramArrayOfDouble;
  }
  
  public void a(double[][] paramArrayOfdouble) {
    a(paramArrayOfdouble.length, (paramArrayOfdouble[0]).length);
    Double[][] arrayOfDouble = new Double[paramArrayOfdouble.length][(paramArrayOfdouble[0]).length];
    for (byte b1 = 0; b1 < paramArrayOfdouble.length; b1++) {
      for (byte b2 = 0; b2 < (paramArrayOfdouble[0]).length; b2++)
        arrayOfDouble[b1][b2] = new Double(paramArrayOfdouble[b1][b2]); 
    } 
    b(arrayOfDouble);
  }
  
  public void a(Object paramObject, int paramInt1, int paramInt2) {
    Double double_ = I.a(paramObject);
    if (double_ == null)
      return; 
    boolean bool = (this.h[paramInt1][paramInt2] != null && (this.h[paramInt1][paramInt2].doubleValue() == this.q || this.h[paramInt1][paramInt2].doubleValue() == this.p)) ? true : false;
    if (double_.doubleValue() > this.q)
      this.q = double_.doubleValue(); 
    if (double_.doubleValue() < this.p)
      this.p = double_.doubleValue(); 
    this.h[paramInt1][paramInt2] = double_;
    if (bool)
      C(); 
    if (!this.d) {
      a(double_, paramInt1, paramInt2);
    } else if (!g(paramInt1, paramInt2)) {
      this.e.add(new t(this, paramInt1, paramInt2));
    } 
  }
  
  private boolean g(int paramInt1, int paramInt2) {
    for (t t : this.e) {
      if (t.b == paramInt2 && t.a == paramInt1)
        return true; 
    } 
    return false;
  }
  
  private void c() {
    for (t t : this.e) {
      double d = this.h[t.a][t.b].doubleValue();
      a(Double.valueOf(d), t.a, t.b);
    } 
  }
  
  public void setValueAt(Object paramObject, int paramInt1, int paramInt2) {
    paramInt1 = H() ? (this.h.length - 1 - paramInt1) : paramInt1;
    a(paramObject, paramInt1, paramInt2);
  }
  
  public void C() {
    u();
    for (byte b1 = 0; b1 < this.h.length; b1++) {
      for (byte b2 = 0; b2 < (this.h[0]).length; b2++) {
        if (d(b1, b2) != null) {
          Double double_ = d(b1, b2);
          double d = (double_ != null) ? double_.doubleValue() : Double.NaN;
          if (d > this.q)
            this.q = d; 
          if (d < this.p)
            this.p = d; 
        } 
      } 
    } 
  }
  
  public void a(Double paramDouble, int paramInt1, int paramInt2) {
    for (TableModelListener tableModelListener : this.g) {
      TableModelEvent tableModelEvent = new TableModelEvent(this, paramInt1, paramInt1, paramInt2);
      tableModelListener.tableChanged(tableModelEvent);
    } 
  }
  
  public void addTableModelListener(TableModelListener paramTableModelListener) {
    this.g.add(paramTableModelListener);
  }
  
  public void removeTableModelListener(TableModelListener paramTableModelListener) {
    this.g.remove(paramTableModelListener);
  }
  
  public String toString() {
    String str = "";
    byte b1;
    for (b1 = 0; b1 < this.h.length; b1++) {
      str = str + this.l[b1] + "\t";
      for (byte b2 = 0; b2 < (this.h[b1]).length; b2++) {
        if (this.c < 0) {
          str = str + d(b1, b2) + "\t";
        } else {
          str = str + X.b(d(b1, b2).doubleValue(), this.c) + "\t";
        } 
      } 
      str = str + "\n";
    } 
    str = str + "    \t";
    for (b1 = 0; b1 < this.k.length; b1++)
      str = str + this.k[b1] + "\t"; 
    return str;
  }
  
  private Double[][] c(Double[][] paramArrayOfDouble) {
    Double[][] arrayOfDouble = new Double[paramArrayOfDouble.length][(paramArrayOfDouble[0]).length];
    for (byte b1 = 0; b1 < arrayOfDouble.length; b1++) {
      for (byte b2 = 0; b2 < (arrayOfDouble[0]).length; b2++)
        arrayOfDouble[b1][b2] = paramArrayOfDouble[b1][b2]; 
    } 
    return arrayOfDouble;
  }
  
  public b[][] D() {
    return this.j;
  }
  
  public b[][] a(s params, c paramc) {
    String[] arrayOfString = params.a();
    if (this.j == null) {
      b[][] arrayOfB = new b[getRowCount()][getColumnCount()];
      for (byte b1 = 0; b1 < arrayOfB.length; b1++) {
        for (byte b2 = 0; b2 < (arrayOfB[0]).length; b2++) {
          arrayOfB[arrayOfB.length - b1 - 1][b2] = new b(paramc);
          arrayOfB[arrayOfB.length - b1 - 1][b2].a(d(b1, b2).doubleValue());
          double d1 = fh.b(params.b(), Double.parseDouble(b()[b2]));
          double d2 = arrayOfString.length - fh.a(arrayOfString, Double.parseDouble(a()[b1])) - 1.0D;
          arrayOfB[arrayOfB.length - b1 - 1][b2].c(params.a(d2, d1));
        } 
      } 
      this.j = arrayOfB;
    } else {
      b[][] arrayOfB = this.j;
      for (byte b1 = 0; b1 < arrayOfB.length; b1++) {
        for (byte b2 = 0; b2 < (arrayOfB[0]).length; b2++) {
          arrayOfB[arrayOfB.length - b1 - 1][b2].n();
          arrayOfB[arrayOfB.length - b1 - 1][b2].a(d(b1, b2).doubleValue());
          if (paramc != null)
            arrayOfB[arrayOfB.length - b1 - 1][b2].a(paramc); 
          double d1 = fh.b(params.b(), Double.parseDouble(b()[b2]));
          double d2 = params.getRowCount() - fh.a(arrayOfString, Double.parseDouble(a()[b1])) - 1.0D;
          arrayOfB[arrayOfB.length - b1 - 1][b2].c(params.a(d2, d1));
        } 
      } 
    } 
    return this.j;
  }
  
  public b[][] a(c paramc) {
    if (this.j == null) {
      b[][] arrayOfB = new b[getRowCount()][getColumnCount()];
      for (byte b1 = 0; b1 < arrayOfB.length; b1++) {
        for (byte b2 = 0; b2 < (arrayOfB[0]).length; b2++) {
          arrayOfB[arrayOfB.length - b1 - 1][b2] = new b(paramc);
          Double double_ = d(b1, b2);
          if (double_ == null)
            double_ = Double.valueOf(Double.NaN); 
          arrayOfB[arrayOfB.length - b1 - 1][b2].a(double_.doubleValue());
        } 
      } 
      this.j = arrayOfB;
    } else {
      b[][] arrayOfB = this.j;
      for (byte b1 = 0; b1 < arrayOfB.length; b1++) {
        for (byte b2 = 0; b2 < (arrayOfB[0]).length; b2++) {
          if (paramc != null)
            arrayOfB[arrayOfB.length - b1 - 1][b2].a(paramc); 
          Double double_ = d(b1, b2);
          if (double_ == null) {
            arrayOfB[arrayOfB.length - b1 - 1][b2].b(Double.NaN);
          } else {
            arrayOfB[arrayOfB.length - b1 - 1][b2].b(double_.doubleValue());
          } 
        } 
      } 
    } 
    return this.j;
  }
  
  public int E() {
    return this.f;
  }
  
  public void c(int paramInt) {
    if (paramInt == 0 || paramInt == 1 || paramInt == 3 || paramInt == 2)
      this.f = paramInt; 
  }
  
  public double d(int paramInt) {
    return a(this.k[paramInt]);
  }
  
  public double e(int paramInt) {
    paramInt = this.h.length - paramInt - 1;
    return a(this.l[paramInt]);
  }
  
  public double F() {
    double d1 = e(0);
    double d2 = e(this.l.length - 1);
    return Math.max(d1, d2);
  }
  
  public void a(b[][] paramArrayOfb) {
    this.j = paramArrayOfb;
  }
  
  public boolean G() {
    return this.a;
  }
  
  public void f(int paramInt1, int paramInt2) {
    for (fa fa : this.s)
      fa.a(paramInt1, paramInt2); 
  }
  
  public void a(fa paramfa) {
    this.s.add(paramfa);
  }
  
  public void b(fa paramfa) {
    this.s.remove(paramfa);
  }
  
  public void a(float paramFloat1, float paramFloat2) {
    for (byte b1 = 0; b1 < this.k.length; b1++)
      this.k[b1] = X.b((paramFloat1 + b1 * (paramFloat2 - paramFloat1) / (this.k.length - 1)), 6); 
  }
  
  public void b(float paramFloat1, float paramFloat2) {
    for (byte b1 = 0; b1 < this.l.length; b1++)
      this.l[this.l.length - b1 - 1] = X.b((paramFloat1 + b1 * (paramFloat2 - paramFloat1) / (this.l.length - 1)), 6); 
  }
  
  public boolean H() {
    if (this.b)
      return true; 
    double d1 = e(0);
    double d2 = e(this.l.length - 1);
    return (Double.isNaN(d1) || Double.isNaN(d2) || d1 < d2);
  }
  
  public boolean I() {
    return this.b;
  }
  
  public void b(boolean paramBoolean) {
    this.b = paramBoolean;
  }
  
  public int J() {
    return this.c;
  }
  
  public void f(int paramInt) {
    this.c = paramInt;
  }
  
  public boolean K() {
    return this.d;
  }
  
  public void c(boolean paramBoolean) {
    this.d = paramBoolean;
    if (!paramBoolean)
      c(); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/s.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */