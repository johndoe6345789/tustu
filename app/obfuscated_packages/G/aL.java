package G;

import V.ExceptionPrintstacktrace;
import bH.D;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

public class aL {
  public static String a = "UNALLOCATED";
  
  private static boolean b = true;
  
  public static void a(R paramR) {
    if (paramR.ae() || !b)
      return; 
    long l = System.currentTimeMillis();
    for (byte b = 0; b < paramR.O().ExceptionPrintstacktrace(); b++)
      a(paramR, b); 
    paramR.aa();
    paramR.b(true);
    D.c("Fill Constants: " + (System.currentTimeMillis() - l));
  }
  
  public static void a(R paramR, int paramInt) {
    ArrayList<aM> arrayList = new ArrayList();
    Iterator<aM> iterator = paramR.a(paramInt);
    while (iterator.hasNext())
      arrayList.add(iterator.next()); 
    arrayList = a(arrayList);
    arrayList = b(arrayList);
    ArrayList<cj> arrayList1 = new ArrayList();
    cj cj = null;
    byte b;
    for (b = 0; b < arrayList.size(); b++) {
      aM aM = arrayList.get(b);
      if (aM.P()) {
        arrayList.remove(b);
        paramR.b(aM.aL());
        b--;
      } else if (cj == null) {
        cj = new cj(paramInt);
        cj.a(aM.ExceptionPrintstacktrace());
        cj.b(aM.z());
        arrayList1.add(cj);
      } else if (cj.a(aM.ExceptionPrintstacktrace(), aM.z())) {
        cj.b(aM.ExceptionPrintstacktrace(), aM.z());
      } else {
        cj = new cj(paramInt);
        cj.a(aM.ExceptionPrintstacktrace());
        cj.b(aM.z());
        arrayList1.add(cj);
      } 
    } 
    if (!arrayList1.isEmpty() && ((cj)arrayList1.get(0)).b() > 0) {
      aM aM = a("UNALLOCATED_" + paramInt, paramInt, 0, ((cj)arrayList1.get(0)).b());
      paramR.a(aM);
    } 
    for (b = 0; b < arrayList1.size() - 1; b++) {
      cj cj1 = arrayList1.get(b);
      cj cj2 = arrayList1.get(b + 1);
      int i = cj1.b() + cj1.c();
      int j = cj2.b() - i;
      aM aM = a("UNALLOCATED_SPACE_" + paramInt + "_" + b, paramInt, i, j);
      paramR.a(aM);
    } 
    if (!arrayList1.isEmpty()) {
      cj cj1 = arrayList1.get(arrayList1.size() - 1);
      if (cj1.b() + cj1.c() < paramR.O().f(paramInt)) {
        int i = cj1.b() + cj1.c();
        aM aM = a("UNALLOCATED_TOP_" + paramInt, paramInt, i, paramR.O().f(paramInt) - i);
        paramR.a(aM);
      } 
    } 
  }
  
  private static aM a(String paramString, int paramInt1, int paramInt2, int paramInt3) {
    try {
      aM aM = new aM();
      aM.a("array");
      aM.c(paramInt1);
      aM.b("U08");
      aM.v(paramString);
      aM.a(new bX(paramInt2));
      aM.a(1, paramInt3);
      aM.b(1.0D);
      aM.c("RAW");
      aM.k(true);
      aM.i(true);
      return aM;
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      Logger.getLogger(aL.class.getName()).log(Level.SEVERE, (String)null, (Throwable)ExceptionPrintstacktrace);
      return null;
    } 
  }
  
  public static void b(R paramR, int paramInt) {
    ArrayList<String> arrayList = new ArrayList();
    null = paramR.a(paramInt);
    while (null.hasNext()) {
      aM aM = null.next();
      if (aM.P())
        arrayList.add(aM.aL()); 
    } 
    for (String str : arrayList)
      paramR.b(str); 
  }
  
  public static ArrayList a(ArrayList<aM> paramArrayList) {
    for (byte b = 0; b < paramArrayList.size(); b++) {
      for (int i = b + 1; i < paramArrayList.size(); i++) {
        aM aM1 = paramArrayList.get(b);
        aM aM2 = paramArrayList.get(i);
        if (aM1.z() > aM2.z()) {
          paramArrayList.set(b, aM2);
          paramArrayList.set(i, aM1);
        } 
      } 
    } 
    return paramArrayList;
  }
  
  public static ArrayList b(ArrayList<aM> paramArrayList) {
    for (byte b = 0; b < paramArrayList.size(); b++) {
      for (int i = b + 1; i < paramArrayList.size(); i++) {
        aM aM1 = paramArrayList.get(b);
        aM aM2 = paramArrayList.get(i);
        if (aM1.ExceptionPrintstacktrace() > aM2.ExceptionPrintstacktrace()) {
          paramArrayList.set(b, aM2);
          paramArrayList.set(i, aM1);
        } 
      } 
    } 
    return paramArrayList;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/aL.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */