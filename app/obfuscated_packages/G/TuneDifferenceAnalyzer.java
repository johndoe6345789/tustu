package G;

import V.g;
import bH.D;
import bH.ab;
import bH.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TuneDifferenceAnalyzer {
  ab a = null;
  
  public z(ab paramab) {
    this.a = paramab;
  }
  
  public ArrayList a(R paramR, Y paramY1, Y paramY2) {
    ArrayList<aM> arrayList = new ArrayList();
    String[] arrayOfString = paramR.k();
    for (byte b = 0; b < arrayOfString.length; b++) {
      aM aM = paramR.c(arrayOfString[b]);
      try {
        double[][] arrayOfDouble1 = aM.i(paramY1);
        double[][] arrayOfDouble2 = aM.i(paramY2);
        if (aM.n(paramY1) && aM.C() && aM.aL().indexOf("test") == -1 && !a(arrayOfDouble1, arrayOfDouble2, aM.v(), aM.B()) && !aM.N())
          arrayList.add(aM); 
      } catch (g g) {
        D.a("Failed to get data for EcuPrameter: " + aM.aL());
      } 
    } 
    return arrayList;
  }
  
  private List a(R paramR) {
    ArrayList arrayList = new ArrayList();
    bE bE = paramR.e();
    Iterator<aA> iterator = bE.b();
    while (iterator.hasNext()) {
      aA aA = iterator.next();
      a(paramR, arrayList, aA);
    } 
    return arrayList;
  }
  
  private List a(R paramR, List<String> paramList, aA paramaA) {
    if (paramaA.b()) {
      Iterator<aA> iterator = paramaA.a();
      while (iterator.hasNext()) {
        aA aA1 = iterator.next();
        a(paramR, paramList, aA1);
      } 
    } 
    if (!paramaA.c() && paramaA.d() != null && !paramaA.d().trim().isEmpty())
      paramList.add(paramaA.d()); 
    return paramList;
  }
  
  public ArrayList a(R paramR, ArrayList paramArrayList) {
    bE bE = paramR.e();
    ArrayList<bv> arrayList = new ArrayList();
    for (String str : a(paramR)) {
      bv bv = bE.c(str);
      if (bv instanceof bm) {
        bm bm = (bm)bv;
        if (a(paramArrayList, bm)) {
          bm bm1 = bm.t();
          bm1.a((String[])null);
          bm1.a(true);
          bv bv1 = new bv();
          if (bm1.M() == null || bm1.M().equals("")) {
            String str1 = bM.c(paramR, bm1.aL());
            str1 = a(str1);
            bv1.s(str1);
          } 
          bv1.a(bm1);
          arrayList.add(bv1);
        } 
        continue;
      } 
      if (bv instanceof be) {
        be be = (be)bv;
        if (a(paramArrayList, be.a()) || a(paramArrayList, be.b()) || a(paramArrayList, be.c())) {
          be be1 = be.j();
          be1.a(11);
          be1.a(true);
          bv bv1 = new bv();
          String str1 = bM.c(paramR, be1.aL());
          str1 = a(str1);
          bv1.s(str1);
          bv1.s(str1);
          bv1.a(be1);
          arrayList.add(bv1);
        } 
        continue;
      } 
      if (bv instanceof ag) {
        ag ag = (ag)bv;
        if (a(paramArrayList, ag.b()) || a(paramArrayList, ag.a()))
          arrayList.add(ag); 
        continue;
      } 
      if (bv == null)
        continue; 
      if (bv.H() > 0) {
        Iterator<bA> iterator = bv.F();
        while (iterator.hasNext()) {
          bA bA = iterator.next();
          if (bA instanceof bq) {
            bq bq = (bq)bA;
            if (a(paramArrayList, bq.b()) && !arrayList.contains(bv) && !bq.i())
              arrayList.add(bv); 
            continue;
          } 
          if (bA instanceof E) {
            E e = (E)bA;
            if (a(paramArrayList, e.a()) && !arrayList.contains(bv))
              arrayList.add(bv); 
          } 
        } 
        continue;
      } 
      List list = bv.e();
      for (String str1 : list) {
        if (a(paramArrayList, str1) && !arrayList.contains(bv))
          arrayList.add(bv); 
      } 
    } 
    return arrayList;
  }
  
  private String a(String paramString) {
    return (this.a != null) ? this.a.a(paramString) : paramString;
  }
  
  private boolean a(ArrayList paramArrayList, String paramString) {
    Iterator<aM> iterator = paramArrayList.iterator();
    while (iterator.hasNext()) {
      if (((aM)iterator.next()).aL().equals(paramString))
        return true; 
    } 
    return false;
  }
  
  private boolean a(ArrayList paramArrayList, bm parambm) {
    if (!parambm.z())
      for (byte b1 = 0; b1 < parambm.j(); b1++) {
        if (a(paramArrayList, parambm.d(b1)))
          return true; 
      }  
    for (byte b = 0; b < parambm.d(); b++) {
      if (a(paramArrayList, parambm.b(b)))
        return true; 
    } 
    return false;
  }
  
  public boolean a(double[][] paramArrayOfdouble1, double[][] paramArrayOfdouble2, int paramInt, double paramDouble) {
    return c.a(paramArrayOfdouble1, paramArrayOfdouble2, paramInt, paramDouble);
  }
  
  public ArrayList b(R paramR, ArrayList paramArrayList) {
    return bM.a(paramR, paramArrayList);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/z.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */