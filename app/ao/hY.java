package ao;

import V.a;
import bH.D;
import com.efiAnalytics.ui.s;
import com.efiAnalytics.ui.u;
import h.i;
import java.util.StringTokenizer;

public class hY extends s {
  private int a = -1;
  
  private int b = -1;
  
  private int c = -1;
  
  private double d = 0.0D;
  
  public void a(String[] paramArrayOfString) {
    e(paramArrayOfString);
  }
  
  public String[] c() {
    return a();
  }
  
  public void b(String[] paramArrayOfString) {
    c(paramArrayOfString);
  }
  
  public String[] d() {
    return b();
  }
  
  public hY e() {
    hY hY1 = new hY();
    String[] arrayOfString1 = d();
    String[] arrayOfString2 = c();
    hY1.a(arrayOfString2.length, arrayOfString1.length);
    double[][] arrayOfDouble = new double[arrayOfString2.length][arrayOfString1.length];
    hY1.f("Default AFR");
    hY1.d(i.a("yAxisField", "MAP"));
    int i = i();
    hY1.b(i);
    hY1.a(1);
    hY1.b(arrayOfString1);
    hY1.a(arrayOfString2);
    String str = i.e("defaultAfrValues", "");
    StringTokenizer stringTokenizer = new StringTokenizer(str, "\t");
    if (stringTokenizer.countTokens() - 1 == arrayOfDouble.length * (arrayOfDouble[0]).length) {
      StringTokenizer stringTokenizer1 = new StringTokenizer(str, "|");
      for (int j = hY1.getRowCount() - 1; j >= 0 && stringTokenizer1.hasMoreTokens(); j--) {
        StringTokenizer stringTokenizer2 = new StringTokenizer(stringTokenizer1.nextToken(), "\t");
        for (byte b = 0; b < hY1.getColumnCount() && stringTokenizer2.hasMoreTokens(); b++) {
          String str1 = stringTokenizer2.nextToken();
          try {
            hY1.setValueAt(new Double(str1), j, b);
          } catch (Exception exception) {
            System.out.println("bad Double " + str1);
          } 
        } 
      } 
    } else {
      try {
        u.b(hY1);
      } catch (a a) {
        a.printStackTrace();
        D.c("Error Generating AFR table, using method 2.");
        for (byte b = 0; b < arrayOfDouble.length; b++) {
          for (byte b1 = 0; b1 < (arrayOfDouble[0]).length; b1++) {
            if (b < arrayOfDouble.length / 3) {
              arrayOfDouble[b][b1] = (new Double(14.7D)).doubleValue();
            } else if (b < 2 * arrayOfDouble.length / 3 && b1 > 2) {
              arrayOfDouble[b][b1] = (new Double(13.9D)).doubleValue();
            } else if (b == 2 * arrayOfDouble.length / 3 && b1 > (arrayOfDouble[0]).length / 2) {
              arrayOfDouble[b][b1] = (new Double(13.2D)).doubleValue();
            } else {
              arrayOfDouble[b][b1] = (new Double(12.5D)).doubleValue();
            } 
          } 
        } 
        hY1.a(arrayOfDouble);
      } 
    } 
    hY1.C();
    hY1.q();
    return hY1;
  }
  
  public void f() {
    String str = "";
    for (byte b = 0; b < getRowCount(); b++) {
      for (byte b1 = 0; b1 < getColumnCount(); b1++)
        str = str + e(b, b1) + "\t"; 
      str = str + "|";
    } 
    i.c("defaultAfrValues", str);
  }
  
  public int g() {
    return (this.a == -1) ? o() : this.a;
  }
  
  public void a(int paramInt) {
    this.a = paramInt;
  }
  
  public int h() {
    return (this.b == -1) ? 0 : this.b;
  }
  
  public int i() {
    return this.c;
  }
  
  public void b(int paramInt) {
    this.c = (paramInt == -1) ? 0 : paramInt;
  }
  
  public void a(double paramDouble) {
    this.d = paramDouble;
  }
  
  public double j() {
    return this.d;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/hY.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */