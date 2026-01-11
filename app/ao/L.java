package ao;

import L.n;
import W.j;
import W.n;
import ax.U;
import bH.D;
import bH.X;
import bH.u;
import bH.w;
import h.g;
import h.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import k.a;
import k.d;

public class L {
  n a;
  
  j b;
  
  j c;
  
  j d;
  
  j e;
  
  int f;
  
  public static String g = "Auto";
  
  public static String h = "BruteForce";
  
  L(n paramn) {
    this.a = paramn;
    this.b = paramn.a(g.a().a("Time"));
    this.c = paramn.a(g.a().a("TraveledFeet"));
    this.e = D.b(paramn);
    this.d = paramn.a(g.a().a("Field.Launch timer"));
    a(0);
  }
  
  public void a(int paramInt) {
    this.f = paramInt;
    if (this.f > 0 && this.b != null && this.a.f("60ftET") != null) {
      HashMap<Integer, String> hashMap = this.a.c();
      hashMap.clear();
      int i = this.a.d() - 1;
      float f1 = this.b.c(this.f);
      if (this.d != null && this.d.c(this.f) < 1.0F)
        f1 -= this.d.c(this.f); 
      float f2 = 0.3F;
      try {
        f2 = Float.parseFloat(i.e(i.aw, "0.300"));
      } catch (Exception exception) {
        D.a("error parsing rollout time, using the default 0.300s");
        exception.printStackTrace();
      } 
      float f3 = f1 + f2;
      float f4 = -1.0F;
      for (int k = this.f; k < i - 1; k++) {
        if (f4 == -1.0F) {
          f4 = Math.abs(this.b.c(k) - f3);
        } else {
          if (Math.abs(this.b.c(k + 1) - f3) > f4) {
            if (Math.abs(this.b.c(k + 1) - f3) < Math.abs(this.b.c(k) - f3)) {
              this.f = k + 1;
              f1 = this.b.c(this.f);
              break;
            } 
            this.f = k;
            f1 = this.b.c(this.f);
            break;
          } 
          f4 = Math.abs(this.b.c(k) - f3);
        } 
      } 
      float f5 = a(this.a, "60ftET");
      float f6 = a(this.a, "330ftET");
      float f7 = a(this.a, "660ftET");
      float f8 = a(this.a, "660ftMPH");
      float f9 = a(this.a, "1000ftET");
      float f10 = a(this.a, "1320ftET");
      float f11 = a(this.a, "1320ftMPH");
      hashMap.put(Integer.valueOf(paramInt), "Launch");
      if (paramInt != this.f)
        hashMap.put(Integer.valueOf(this.f), "Beam break - Rollout"); 
      int m;
      for (m = this.f; m < i; m++) {
        double d1 = (this.b.c(m) - f1);
        double d2 = (this.b.c(m + 1) - f1);
        if (d1 >= f5 || (d2 > f5 && d2 - f5 > f5 - d1)) {
          String str = "60ft - ET:" + f5 + "s.";
          hashMap.put(Integer.valueOf(m), str);
          break;
        } 
        if (d1 > 100.0D)
          break; 
      } 
      for (m = this.f; m < i; m++) {
        double d1 = (this.b.c(m) - f1);
        double d2 = (this.b.c(m + 1) - f1);
        if (d1 >= f6 || (d2 > f6 && d2 - f5 > f6 - d1)) {
          String str = "330ft - ET:" + f6 + "s.";
          hashMap.put(Integer.valueOf(m), str);
          break;
        } 
        if (d1 > 100.0D)
          break; 
      } 
      for (m = this.f; m < i; m++) {
        double d1 = (this.b.c(m) - f1);
        double d2 = (this.b.c(m + 1) - f1);
        if (d1 >= f7 || (d2 > f7 && d2 - f7 > f7 - d1)) {
          String str = "660ft - ET:" + f7 + "s. Trap:" + f8;
          hashMap.put(Integer.valueOf(m), str);
          break;
        } 
        if (d1 > 100.0D)
          break; 
      } 
      for (m = this.f; m < i; m++) {
        double d1 = (this.b.c(m) - f1);
        double d2 = (this.b.c(m + 1) - f1);
        if (d1 >= f9 || (d2 > f9 && d2 - f9 > f9 - d1)) {
          String str = "1000ft - ET:" + f9 + "s";
          hashMap.put(Integer.valueOf(m), str);
          break;
        } 
        if (d1 > 100.0D)
          break; 
      } 
      for (m = this.f; m < i; m++) {
        double d1 = (this.b.c(m) - f1);
        double d2 = (this.b.c(m + 1) - f1);
        if (d1 >= f10 || (d2 > f10 && d2 - f10 > f10 - d1)) {
          String str = "1320ft - ET:" + f10 + "s. Trap:" + f11;
          hashMap.put(Integer.valueOf(m), str);
          break;
        } 
        if (d1 > 100.0D)
          break; 
      } 
    } else if (i.a(i.az, i.aA) && paramInt > 0 && this.b != null && (this.c != null || c())) {
      HashMap<Integer, String> hashMap = this.a.c();
      hashMap.clear();
      int i = this.a.d();
      j j1 = a(true);
      b();
      c();
      String str = "Launch - Generated Timeslip";
      hashMap.put(Integer.valueOf(paramInt), str);
      float f1 = 0.833F;
      float f2 = 0.0F;
      float f3 = this.c.d(paramInt) + f1;
      float f4 = 0.0F;
      int k;
      for (k = paramInt; k < i; k++) {
        float f = this.c.d(k);
        if (f >= f3) {
          if (Math.abs(f - f3) <= Math.abs(this.c.d(k - 1) - f3)) {
            paramInt = k;
          } else {
            paramInt = k - 1;
          } 
          if (this.d != null && this.d.c(paramInt) < 1.5F) {
            f4 += this.b.c(paramInt) - this.d.c(paramInt);
            f2 = this.d.c(paramInt) - f4;
          } else {
            f4 = (this.b.d(k) - this.b.d(k - 1)) * (this.c.d(paramInt) - f3) / (f - this.c.d(k - 1));
            f2 = this.b.c(paramInt) - f4;
          } 
          hashMap.put(Integer.valueOf(paramInt), "Beam break - 10 in. Rollout: " + X.c(f2, 3) + "s.");
          this.a.a("rolloutTime", X.c(f2, 3));
          break;
        } 
      } 
      for (k = paramInt; k < i; k++) {
        float f5 = this.c.d(k);
        float f6 = this.c.d(k + 1);
        if (f5 - f3 >= 60.0F || (f6 - f3 >= 60.0F && f6 - f3 < f3 - f5)) {
          String str1 = X.c((this.b.c(k) - f2), 3);
          str = "60ft - ET:" + str1 + "s.";
          this.a.a("60ftETGen", str1);
          if (j1 != null)
            str = str + " Speed:" + X.c(j1.c(k), 2); 
          hashMap.put(Integer.valueOf(k), str);
          paramInt = k;
          break;
        } 
      } 
      for (k = paramInt; k < i; k++) {
        float f5 = this.c.d(k);
        float f6 = this.c.d(k + 1);
        if (f5 - f3 >= 330.0F || (f6 - f3 >= 330.0F && f6 - f3 < f3 - f5)) {
          String str1 = X.c((this.b.c(k) - f2), 3);
          str = "330ft - ET:" + str1 + "s.";
          this.a.a("330ftETGen", str1);
          if (j1 != null)
            str = str + " Speed:" + X.c(j1.c(k), 2); 
          hashMap.put(Integer.valueOf(k), str);
          paramInt = k;
          break;
        } 
      } 
      for (k = paramInt; k < i; k++) {
        float f5 = this.c.d(k);
        float f6 = this.c.d(k + 1);
        if (f5 - f3 >= 660.0F || (f6 - f3 >= 660.0F && f6 - f3 < f3 - f5)) {
          String str1 = X.c((this.b.c(k) - f2), 3);
          str = "660ft - ET:" + str1 + "s.";
          this.a.a("660ftETGen", str1);
          if (j1 != null) {
            str = str + " Speed:" + X.c(j1.c(k), 2);
            this.a.a("660ftMPHGen", X.c(this.e.c(k), 3));
          } 
          hashMap.put(Integer.valueOf(k), str);
          paramInt = k;
          break;
        } 
      } 
      for (k = paramInt; k < i; k++) {
        float f5 = this.c.d(k);
        float f6 = this.c.d(k + 1);
        if (f5 - f3 >= 1000.0F || (f6 - f3 >= 1000.0F && f6 - f3 < f3 - f5)) {
          String str1 = X.c((this.b.c(k) - f2), 3);
          str = "1000ft - ET:" + str1 + "s.";
          this.a.a("1000ftETGen", str1);
          if (j1 != null)
            str = str + " Speed:" + X.c(j1.c(k), 2); 
          hashMap.put(Integer.valueOf(k), str);
          paramInt = k;
          break;
        } 
      } 
      for (k = paramInt; k < i; k++) {
        float f5 = this.c.d(k);
        float f6 = this.c.d(k + 1);
        if (f5 - f3 >= 1320.0F || (f6 - f3 >= 1320.0F && f6 - f3 < f3 - f5)) {
          String str1 = X.c((this.b.c(k) - f2), 3);
          str = "1320ft - ET:" + str1 + "s.";
          this.a.a("1320ftETGen", X.c((this.b.c(k) - f2), 3));
          if (j1 != null) {
            str = str + " Speed:" + X.c(j1.c(k), 2);
            this.a.a("1320ftMPHGen", str1);
          } 
          hashMap.put(Integer.valueOf(k), str);
          paramInt = k;
          break;
        } 
      } 
    } 
  }
  
  public void a() {
    if (this.b != null && this.c != null) {
      float f = 0.833F;
      j j1 = a(false);
      for (byte b = 0; b < this.b.i(); b++) {
        if (b(b)) {
          HashMap<Integer, String> hashMap = this.a.c();
          hashMap.clear();
          int i = this.a.d();
          String str = "Launch";
          hashMap.put(Integer.valueOf(b), str);
          float f1 = this.c.d(b) + f;
          byte b1;
          for (b1 = b; b1 < i; b1++) {
            if (this.c.d(b1) - f1 >= 60.0F) {
              str = "60ft - ET:" + this.b.c(b1) + "s.";
              if (j1 != null)
                str = str + " Speed:" + X.c(j1.c(b1), 2); 
              hashMap.put(Integer.valueOf(b1), str);
              b = b1;
              break;
            } 
          } 
          for (b1 = b; b1 < i; b1++) {
            if (this.c.d(b1) - f1 >= 330.0F) {
              str = "330ft - ET:" + this.b.c(b1) + "s.";
              if (j1 != null)
                str = str + " Speed:" + X.c(j1.c(b1), 2); 
              hashMap.put(Integer.valueOf(b1), str);
              b = b1;
              break;
            } 
          } 
          for (b1 = b; b1 < i; b1++) {
            if (this.c.d(b1) - f1 >= 660.0F) {
              str = "660ft - ET:" + this.b.c(b1) + "s.";
              if (j1 != null)
                str = str + " Speed:" + X.c(j1.c(b1), 2); 
              hashMap.put(Integer.valueOf(b1), str);
              b = b1;
              break;
            } 
          } 
          for (b1 = b; b1 < i; b1++) {
            if (this.c.d(b1) - f1 > 1000.0F) {
              str = "1000ft - ET:" + this.b.c(b1) + "s.";
              if (j1 != null)
                str = str + " Speed:" + X.c(j1.c(b1), 2); 
              hashMap.put(Integer.valueOf(b1), str);
              b = b1;
              break;
            } 
          } 
          for (b1 = b; b1 < i; b1++) {
            if (this.c.d(b1) - f1 > 1320.0F) {
              str = "1320ft - ET:" + this.b.c(b1) + "s.";
              if (j1 != null)
                str = str + " Speed:" + X.c(j1.c(b1), 2); 
              hashMap.put(Integer.valueOf(b1), str);
              b = b1;
              break;
            } 
          } 
        } 
      } 
    } 
  }
  
  private boolean b(int paramInt) {
    return false;
  }
  
  private float a(n paramn, String paramString) {
    String str = paramn.f(paramString);
    if (paramString != null)
      try {
        return Float.parseFloat(str);
      } catch (Exception exception) {
        return Float.NaN;
      }  
    return Float.NaN;
  }
  
  private void b() {
    byte b1 = 0;
    byte b2 = 1;
    byte b3 = 2;
    byte b4 = b3;
    if (b4 == b1)
      return; 
    if (b4 == b2) {
      j j1 = a(false);
      j j2 = this.a.a("TPS");
      u u = new u();
      ArrayList<Double> arrayList1 = new ArrayList();
      ArrayList<Double> arrayList2 = new ArrayList();
      for (byte b = 0; b < this.a.d(); b++) {
        float f;
        for (f = j2.c(b); f > 80.0F; f = j2.c(++b)) {
          if (this.e.d(b) > 0.0F) {
            if (arrayList1.size() == 0) {
              arrayList1.add(Double.valueOf(arrayList1.size()));
              if (b > 0)
                arrayList2.add(Double.valueOf(this.b.c(b - 1))); 
            } 
            arrayList1.add(Double.valueOf(this.b.c(b)));
            arrayList2.add(Double.valueOf(this.e.c(b)));
          } else {
            arrayList1.clear();
            arrayList2.clear();
          } 
        } 
        if (arrayList1.size() > 2 && ((Double)arrayList1.get(arrayList1.size() - 1)).doubleValue() - ((Double)arrayList1.get(0)).doubleValue() > 2.0D) {
          double[] arrayOfDouble1 = new double[arrayList1.size()];
          double[] arrayOfDouble2 = new double[arrayList1.size()];
          for (byte b5 = 0; b5 < arrayOfDouble1.length; b5++) {
            arrayOfDouble1[b5] = ((Double)arrayList1.get(b5)).doubleValue();
            arrayOfDouble2[b5] = ((Double)arrayList2.get(b5)).doubleValue();
          } 
          List<w> list = u.a(arrayList1, arrayList2, arrayOfDouble1);
          for (byte b6 = 0; b6 < list.size(); b6++) {
            float f1 = (float)((w)list.get(b6)).a();
            if (f1 > 0.0F) {
              j1.b(b6 + b - arrayOfDouble1.length, f1);
            } else {
              j1.b(b6 + b - arrayOfDouble1.length, 0.0F);
            } 
          } 
          arrayList1.clear();
          arrayList2.clear();
        } 
      } 
    } else if (b4 == b3) {
      j j1 = a(true);
      j j2 = this.a.a("TPS");
      ArrayList<Double> arrayList1 = new ArrayList();
      ArrayList<Double> arrayList2 = new ArrayList();
      for (int i = 0; i < this.a.d(); i++) {
        float f;
        for (f = j2.c(i); f > 80.0F; f = j2.c(++i)) {
          if (j1.d(i) > 0.0F) {
            if (arrayList1.size() == 0) {
              if (i > 0) {
                arrayList1.add(Double.valueOf(this.b.c(i - 1)));
              } else {
                arrayList1.add(Double.valueOf(arrayList1.size()));
              } 
              arrayList2.add(Double.valueOf(0.0D));
            } 
            arrayList1.add(Double.valueOf(this.b.c(i)));
            arrayList2.add(Double.valueOf(j1.c(i)));
          } else {
            arrayList1.clear();
            arrayList2.clear();
          } 
        } 
        if (arrayList1.size() > 2 && ((Double)arrayList1.get(arrayList1.size() - 1)).doubleValue() - ((Double)arrayList1.get(0)).doubleValue() > 2.0D) {
          i -= arrayList1.size();
          int k = c(i);
          float f1 = j1.c(k);
          float f2 = this.b.d(k);
          double d1 = 0.82D;
          double d2 = ((Double)arrayList1.get(0)).doubleValue();
          float f3 = 0.0F;
          if (this.d != null);
          float f4 = (float)(f1 / Math.pow((f2 - f3) - d2, d1));
          while (i <= k) {
            double d = (this.b.d(i) - f3) - d2;
            float f5 = (float)(Math.pow((this.b.d(i) - f3) - d2, d1) * f4);
            j1.b(i, f5);
            i++;
          } 
          arrayList1.clear();
          arrayList2.clear();
          break;
        } 
      } 
    } 
  }
  
  private int c(int paramInt) {
    j j1 = this.a.a(g.a().a(g.f));
    double d1 = Double.NaN;
    double d2 = Double.NaN;
    double d3 = Double.NaN;
    byte b1 = 2;
    byte b2 = 6;
    double d4 = 0.75D;
    byte b3 = 0;
    int i = this.e.s();
    boolean bool = this.e.r();
    this.e.b(true);
    this.e.g(3);
    try {
      for (int k = paramInt + 1; k < this.a.d() - b1 * b2 / 2; k++) {
        float f;
        for (f = j1.c(k); f > 80.0F && this.e.c(k) == 0.0F; f = j1.c(++k));
        while (f > 80.0F) {
          int m = b1 / 2;
          d1 = ((this.e.c(k) - this.e.c(paramInt)) / (this.b.c(k) - this.b.c(paramInt)));
          if (Double.isNaN(d2)) {
            d2 = ((this.e.c(k) - this.e.c(paramInt)) / (this.b.c(k) - this.b.c(paramInt)));
            d3 = ((this.e.c(k) - this.e.c(paramInt)) / (this.b.c(k) - this.b.c(paramInt)));
            boolean bool1 = true;
          } else if (b2 * b1 < k - paramInt) {
            d2 = ((this.e.c(k + m) - this.e.c(k - m)) / (this.b.c(k + m) - this.b.c(k - m)));
            d3 = ((this.e.c(k + m * b2) - this.e.c(k - m * b2)) / (this.b.c(k + m * b2) - this.b.c(k - m * b2)));
            byte b = 2;
          } else {
            d2 = (d2 * (b1 - 1.0F) + ((this.e.c(k) - this.e.c(k - 1)) / (this.b.c(k) - this.b.c(k - 1)))) / b1;
            d3 = (d3 * ((5 * b1) - 1.0F) + ((this.e.c(k) - this.e.c(k - 1)) / (this.b.c(k) - this.b.c(k - 1)))) / (5.0F * b1);
            byte b = 3;
          } 
          if (d2 > 0.0D && d3 > 0.0D && Math.abs(d2 - d3) < this.e.c(k) * 0.07D) {
            b3++;
          } else {
            b3 = 0;
          } 
          if (b3 > 4) {
            D.c("Within Range! " + k);
            return k;
          } 
          f = j1.c(++k);
        } 
      } 
    } finally {
      this.e.b(bool);
      this.e.g(i);
    } 
    return -1;
  }
  
  private j a(boolean paramBoolean) {
    if (this.e == null)
      return null; 
    j j1 = this.a.a("CorrectedMPH");
    if (paramBoolean || j1 == null) {
      if (j1 == null) {
        j1 = new j("CorrectedMPH");
        this.a.add(j1);
      } else {
        j1.w();
      } 
      boolean bool = this.e.r();
      this.e.b(false);
      for (byte b = 0; b < this.a.d(); b++)
        j1.a(this.e.c(b)); 
      this.e.b(bool);
    } 
    return j1;
  }
  
  private boolean c() {
    if (this.c == null && this.b != null && this.e != null) {
      b();
      this.c = new j("TraveledFeet");
      this.c.a(0.0F);
      j j1 = a(false);
      for (byte b = 1; b < this.b.v(); b++) {
        float f = this.c.d(b - 1) + 5280.0F * j1.d(b) / 3600.0F * (this.b.d(b) - this.b.d(b - 1));
        this.c.a(f);
      } 
      this.a.add(this.c);
    } 
    return (this.c != null);
  }
  
  private String d() {
    String str = i.e(i.aF, g);
    n n1 = hx.a().r();
    if (n1 == null || n1.size() == 0)
      return null; 
    if (str.equals(g))
      if (n1.a("Launch timer") != null) {
        str = "[Launch timer] < 2 && [Launch timer] < [Launch timer-1] && [TPS] > 70 && [TPS-1] > 70 ";
      } else if (n1.a("Launch retard timer") != null) {
        str = "[Launch retard timer] < 2 && [Launch retard timer] < [Launch retard timer-1] && [TPS] > 70 && [TPS-1] > 70";
      } else if (n1.a("Time after launch") != null && n1.a("Throttle position") != null) {
        str = "[Time after launch] > 0 && [Throttle position] > 80";
      } else if (n1.a("Tmr_Enable") != null) {
        str = "[Tmr_Enable] == 1 && [Tmr_Enable-1] == 0";
      } else if (n1.a("TWO_STEP_MODE") != null && n1.a("TWO_STEP_MODE") != null) {
        str = "[TWO_STEP_MODE] == 0 && [THREE_STEP_MODE] == 0 &&([TWO_STEP_MODE-1] == 1 || [THREE_STEP_MODE-1] == 1)";
      } else {
        str = h;
      }  
    return str;
  }
  
  public int a(n paramn) {
    String str = d();
    int i = -1;
    if (str != null && !str.isEmpty() && paramn != null)
      if (str.equals(h)) {
        j j1 = D.a(paramn);
        if (this.e != null && j1 != null && this.b != null) {
          byte b1 = -1;
          byte b2 = -1;
          byte b3 = 80;
          for (byte b4 = 0; b4 < paramn.d(); b4++) {
            if (b4 > 0 && this.e.c(b4 - 1) == 0.0F && this.e.c(b4) > 0.0F) {
              b1 = b4;
            } else if (this.e.c(b4) == 0.0F) {
              b1 = -1;
            } 
            if ((b4 == 0 || j1.c(b4 - 1) < b3) && j1.c(b4) >= b3) {
              b2 = b4;
            } else if (j1.c(b4) < b3) {
              b2 = -1;
            } 
            if (b1 >= 0 && b2 > 0 && b1 < b4 && j1.c(b4) >= b3 && (this.b.c(b4) - this.b.c(b2)) > 2.0D) {
              D.c("Set Zero time Brute Force.");
              this.b.j(-this.b.c(b1 - 1));
              i = b1 - 1;
              break;
            } 
          } 
        } 
      } else {
        String str1 = "SR2_TIMER";
        j j1 = paramn.a(str1);
        if (j1 != null && j1.e() == 0.0F && j1.f() > 0.0F) {
          for (byte b = 0; b < paramn.d(); b++) {
            if (j1.d(b) > 0.0F) {
              if (b > 0) {
                this.b.j(-this.b.c(b - 1));
                i = b - 1;
                break;
              } 
              this.b.j(-this.b.c(b) - j1.d(b));
              i = b - Math.round(j1.d(b) * 100.0F);
              break;
            } 
          } 
        } else {
          try {
            a a = d.a().a(str);
            for (byte b = 0; b < paramn.d(); b++) {
              n.a().a(b);
              if (a.a(paramn, b) != 0.0D) {
                double d1 = this.b.c(b);
                double d2 = d1;
                while (b < paramn.d() - 1) {
                  float f = this.b.c(b + 1);
                  if (f > d2) {
                    if (Math.abs(d2 - d1) > Math.abs(f - d2))
                      b++; 
                    if (a.a(paramn, b + 1) == 0.0D)
                      break; 
                  } 
                  b++;
                } 
                this.b.j(-this.b.c(b));
                i = b;
                break;
              } 
            } 
          } catch (U u) {
            D.d("Auto Zero Expression not valid, skipping");
          } 
        } 
      }  
    if (i >= 0)
      a(i); 
    return i;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/L.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */