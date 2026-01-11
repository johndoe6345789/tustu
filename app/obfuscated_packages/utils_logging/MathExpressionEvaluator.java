package bH;

import W.j;
import bJ.b;
import bJ.c;
import java.util.ArrayList;
import java.util.List;

public class u {
  public List a(j paramj1, j paramj2, h paramh, double[] paramArrayOfdouble) {
    ArrayList<Double> arrayList1 = new ArrayList();
    ArrayList<Double> arrayList2 = new ArrayList();
    for (byte b = 0; b < paramj1.i() && b < paramj2.i(); b++) {
      if (paramh == null || paramh.a(b)) {
        arrayList1.add(Double.valueOf(paramj1.c(b)));
        arrayList2.add(Double.valueOf(paramj2.c(b)));
      } 
    } 
    return a(arrayList1, arrayList2, paramArrayOfdouble);
  }
  
  public List a(List paramList1, List paramList2, double[] paramArrayOfdouble) {
    int i = Math.min(paramList1.size(), paramList2.size());
    double[] arrayOfDouble1 = new double[i];
    double[] arrayOfDouble2 = new double[i];
    for (byte b1 = 0; b1 < i; b1++) {
      arrayOfDouble1[b1] = ((Double)paramList1.get(b1)).doubleValue();
      arrayOfDouble2[b1] = ((Double)paramList2.get(b1)).doubleValue();
    } 
    c c = a(arrayOfDouble1, arrayOfDouble2);
    ArrayList<v> arrayList = new ArrayList();
    for (byte b2 = 0; b2 < paramArrayOfdouble.length; b2++) {
      v v = new v(this, paramArrayOfdouble[b2], c.b(paramArrayOfdouble[b2]));
      arrayList.add(v);
    } 
    return arrayList;
  }
  
  public c a(double[] paramArrayOfdouble1, double[] paramArrayOfdouble2) {
    b b = new b();
    b.a(paramArrayOfdouble2, paramArrayOfdouble1);
    return (c)b;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bH/u.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */