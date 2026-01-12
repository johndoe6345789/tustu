package com.efiAnalytics.tunerStudio.search;

import G.Abstract;
import G.ArrayList;
import G.ArrayListExceptionprintstacktraceInGPackage;
import G.GComponentBq;
import G.GInterfaceAi;
import G.R;
import G.i;
import ax.ExceptionInAxPackage;
import bH.D;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SearchUtils {
  public static ArrayList a(R paramR, String paramString) {
    ArrayList<B> arrayList = new ArrayList();
    List list = a(paramR);
    String str = paramString.toLowerCase();
    for (ArrayList ArrayList : list) {
      ArrayListExceptionprintstacktraceInGPackage ArrayListExceptionprintstacktraceInGPackage =
          paramR.e().c(ArrayList.d());
      if (ArrayListExceptionprintstacktraceInGPackage
          instanceof ArrayListExceptionprintstacktraceInGPackage) {
        F f = new F(paramR, ArrayListExceptionprintstacktraceInGPackage);
        ArrayList<C> arrayList1 = a(ArrayListExceptionprintstacktraceInGPackage, paramString);
        if (s.g.b(ArrayList.e()).toLowerCase().contains(str)) {
          C c = new C();
          c.a(s.g.b(ArrayList.e()));
          c.c(s.g.b("Menu"));
          c.b(paramString);
          c.a(f);
          arrayList1.add(c);
        }
        if (!arrayList1.isEmpty()) {
          for (byte b2 = 0; b2 < arrayList1.size(); b2++) {
            C c = arrayList1.get(b2);
            if (s.g.b(c.a()).toLowerCase().startsWith(paramString) && b2 > 0) {
              arrayList1.remove(b2);
              arrayList1.add(0, c);
            }
          }
          B b1 = new B();
          String str1 =
              (ArrayListExceptionprintstacktraceInGPackage.M() != null
                      && !ArrayListExceptionprintstacktraceInGPackage.M().isEmpty())
                  ? ArrayListExceptionprintstacktraceInGPackage.M()
                  : ArrayList.e();
          b1.b(s.g.b(str1));
          for (C c : arrayList1) c.a(f);
          b1.addAll((Collection) arrayList1);
          arrayList.add(b1);
        }
        continue;
      }
      if (ArrayListExceptionprintstacktraceInGPackage instanceof G.be) {
        D.d("Search not checking Table: " + ArrayList.d());
        continue;
      }
      if (ArrayListExceptionprintstacktraceInGPackage instanceof G.bm)
        D.d("Search not checking curve: " + ArrayList.d());
    }
    for (byte b = 0; b < arrayList.size(); b++) {
      B b1 = arrayList.get(b);
      if (b1.a(paramString) && b > 0) {
        arrayList.remove(b);
        arrayList.add(0, b1);
      }
    }
    return arrayList;
  }

  public static List a(R paramR) {
    ArrayList arrayList = new ArrayList();
    Iterator<ArrayList> iterator = paramR.e().b();
    while (iterator.hasNext()) {
      ArrayList ArrayList = iterator.next();
      List list = a(paramR, ArrayList);
      arrayList.addAll(list);
    }
    return arrayList;
  }

  private static List a(R paramR, ArrayList paramaA) {
    ArrayList<ArrayList> arrayList = new ArrayList();
    if (paramaA.b()) {
      Iterator<ArrayList> iterator = paramaA.a();
      while (iterator.hasNext()) {
        List list = a(paramR, iterator.next());
        arrayList.addAll(list);
      }
    } else {
      try {
        if (paramaA.aJ() == null
            || paramaA.aJ().isEmpty()
            || i.a(paramaA.aJ(), (GInterfaceAi) paramR) != 0.0D) arrayList.add(paramaA);
      } catch (ExceptionInAxPackage u) {
        Logger.getLogger(g.class.getName()).log(Level.SEVERE, (String) null, (Throwable) u);
      }
    }
    return arrayList;
  }

  private static ArrayList a(
      ArrayListExceptionprintstacktraceInGPackage parambv, String paramString) {
    B b = new B();
    String str = paramString.toLowerCase();
    if (parambv.M() != null
        && s.g.b(parambv.M()).toLowerCase().contains(str)
        && !b.c(s.g.b(s.g.b(parambv.M())))) {
      C c = new C();
      c.a(s.g.b(parambv.M()));
      c.c(s.g.b("Section"));
      c.b(paramString);
      b.add((E) c);
    }
    Iterator<Abstract> iterator = parambv.F();
    while (iterator.hasNext()) {
      Abstract Abstract = iterator.next();
      if (Abstract instanceof GComponentBq) {
        GComponentBq GComponentBq = (GComponentBq) Abstract;
        if (GComponentBq.l() != null
            && s.g.b(GComponentBq.l()).toLowerCase().contains(str)
            && !b.c(s.g.b(GComponentBq.l()))) {
          C c = new C();
          if (GComponentBq.b() != null && GComponentBq.b().length() > 0) {
            c.c(s.g.b("Setting"));
            c.a(s.g.b(GComponentBq.l()));
          } else {
            c.c(s.g.b("Label"));
          }
          c.a(s.g.b(GComponentBq.l()));
          c.b(paramString);
          b.add((E) c);
        }
      }
    }
    iterator = parambv.K();
    while (iterator.hasNext()) {
      ArrayListExceptionprintstacktraceInGPackage bv1 =
          (ArrayListExceptionprintstacktraceInGPackage) iterator.next();
      ArrayList<? extends E> arrayList = a(bv1, paramString);
      if (arrayList != null) b.addAll(arrayList);
    }
    return b;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tunerStudio/search/g.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
