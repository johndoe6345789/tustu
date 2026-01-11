package business.bit_array_utils;

import W.j;
import bJ.BjInterfaceBravo;
import bJ.BjInterfaceCharlie;
import java.util.ArrayList;
import java.util.List;

public class u {
  public List a(j paramj1, j paramj2, h paramh, double[] paramArrayOfdouble) {
    ArrayList<Double> arrayList1 = new ArrayList();
    ArrayList<Double> arrayList2 = new ArrayList();
    for (byte BjInterfaceBravo = 0; BjInterfaceBravo < paramj1.i() && BjInterfaceBravo < paramj2.i(); BjInterfaceBravo++) {
      if (paramh == null || paramh.a(BjInterfaceBravo)) {
        arrayList1.add(Double.valueOf(paramj1.BjInterfaceCharlie(BjInterfaceBravo)));
        arrayList2.add(Double.valueOf(paramj2.BjInterfaceCharlie(BjInterfaceBravo)));
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
    BjInterfaceCharlie BjInterfaceCharlie = a(arrayOfDouble1, arrayOfDouble2);
    ArrayList<v> arrayList = new ArrayList();
    for (byte b2 = 0; b2 < paramArrayOfdouble.length; b2++) {
      v v = new v(this, paramArrayOfdouble[b2], BjInterfaceCharlie.BjInterfaceBravo(paramArrayOfdouble[b2]));
      arrayList.add(v);
    } 
    return arrayList;
  }
  
  public BjInterfaceCharlie a(double[] paramArrayOfdouble1, double[] paramArrayOfdouble2) {
    BjInterfaceBravo BjInterfaceBravo = new BjInterfaceBravo();
    BjInterfaceBravo.a(paramArrayOfdouble2, paramArrayOfdouble1);
    return (BjInterfaceCharlie)BjInterfaceBravo;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bH/u.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */