package com.efiAnalytics.tunerStudio.search;

import G.R;
import G.aA;
import G.aI;
import G.bA;
import G.bq;
import G.bv;
import G.i;
import ax.U;
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
    for (aA aA : list) {
      bv bv = paramR.e().c(aA.d());
      if (bv instanceof bv) {
        F f = new F(paramR, bv);
        ArrayList<C> arrayList1 = a(bv, paramString);
        if (s.g.b(aA.e()).toLowerCase().contains(str)) {
          C c = new C();
          c.a(s.g.b(aA.e()));
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
          String str1 = (bv.M() != null && !bv.M().isEmpty()) ? bv.M() : aA.e();
          b1.b(s.g.b(str1));
          for (C c : arrayList1)
            c.a(f); 
          b1.addAll((Collection)arrayList1);
          arrayList.add(b1);
        } 
        continue;
      } 
      if (bv instanceof G.be) {
        D.d("Search not checking Table: " + aA.d());
        continue;
      } 
      if (bv instanceof G.bm)
        D.d("Search not checking curve: " + aA.d()); 
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
    Iterator<aA> iterator = paramR.e().b();
    while (iterator.hasNext()) {
      aA aA = iterator.next();
      List list = a(paramR, aA);
      arrayList.addAll(list);
    } 
    return arrayList;
  }
  
  private static List a(R paramR, aA paramaA) {
    ArrayList<aA> arrayList = new ArrayList();
    if (paramaA.b()) {
      Iterator<aA> iterator = paramaA.a();
      while (iterator.hasNext()) {
        List list = a(paramR, iterator.next());
        arrayList.addAll(list);
      } 
    } else {
      try {
        if (paramaA.aJ() == null || paramaA.aJ().isEmpty() || i.a(paramaA.aJ(), (aI)paramR) != 0.0D)
          arrayList.add(paramaA); 
      } catch (U u) {
        Logger.getLogger(g.class.getName()).log(Level.SEVERE, (String)null, (Throwable)u);
      } 
    } 
    return arrayList;
  }
  
  private static ArrayList a(bv parambv, String paramString) {
    B b = new B();
    String str = paramString.toLowerCase();
    if (parambv.M() != null && s.g.b(parambv.M()).toLowerCase().contains(str) && !b.c(s.g.b(s.g.b(parambv.M())))) {
      C c = new C();
      c.a(s.g.b(parambv.M()));
      c.c(s.g.b("Section"));
      c.b(paramString);
      b.add((E)c);
    } 
    Iterator<bA> iterator = parambv.F();
    while (iterator.hasNext()) {
      bA bA = iterator.next();
      if (bA instanceof bq) {
        bq bq = (bq)bA;
        if (bq.l() != null && s.g.b(bq.l()).toLowerCase().contains(str) && !b.c(s.g.b(bq.l()))) {
          C c = new C();
          if (bq.b() != null && bq.b().length() > 0) {
            c.c(s.g.b("Setting"));
            c.a(s.g.b(bq.l()));
          } else {
            c.c(s.g.b("Label"));
          } 
          c.a(s.g.b(bq.l()));
          c.b(paramString);
          b.add((E)c);
        } 
      } 
    } 
    iterator = parambv.K();
    while (iterator.hasNext()) {
      bv bv1 = (bv)iterator.next();
      ArrayList<? extends E> arrayList = a(bv1, paramString);
      if (arrayList != null)
        b.addAll(arrayList); 
    } 
    return b;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tunerStudio/search/g.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */