package G;

import V.ExceptionPrintstacktrace;
import ax.ArrayListUsingPattern;
import ax.ExceptionInAxPackage;
import bH.D;
import bH.G;
import bH.I;
import bH.X;
import bH.ab;
import bH.p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class bM {
  private static ab a = null;
  
  public static String a(R paramR, String paramString) {
    String str = null;
    Iterator<aA> iterator = paramR.e().b();
    while (iterator.hasNext()) {
      aA aA = iterator.next();
      if (aA.d() != null && aA.d().equals(paramString)) {
        str = aA.aJ();
        bv bv1 = paramR.e().c(paramString);
        if (bv1 != null && bv1.aJ() != null && !bv1.aJ().isEmpty())
          str = a(str, bv1.aJ()); 
        break;
      } 
      Iterator<aA> iterator1 = aA.a();
      label34: while (iterator1.hasNext()) {
        aA aA1 = iterator1.next();
        bv bv1 = (aA1.d() == null) ? null : paramR.e().c(aA1.d());
        if (aA1.d() == null || !aA1.d().equals(paramString)) {
          if (bv1 != null && bv1.L() && a(bv1, paramString))
            break label34; 
          continue;
        } 
        str = a(aA.aJ(), aA1.aJ());
      } 
    } 
    bv bv = paramR.e().c(paramString);
    if (bv != null && bv.aJ() != null && !bv.aJ().isEmpty())
      str = a(str, bv.aJ()); 
    return str;
  }
  
  public static String b(R paramR, String paramString) {
    Iterator<aA> iterator = paramR.e().b();
    while (iterator.hasNext()) {
      aA aA = iterator.next();
      Iterator<aA> iterator1 = aA.a();
      while (iterator1.hasNext()) {
        aA aA1 = iterator1.next();
        bv bv = (aA1.d() == null) ? null : paramR.e().c(aA1.d());
        if (bv != null) {
          bq bq = b(bv, paramString);
          if (bq != null)
            return b(aA.e()) + " --> " + b(aA1.e()) + " --> " + b(ExceptionPrintstacktrace(paramR, paramString)); 
        } 
      } 
    } 
    return null;
  }
  
  private static String a(String paramString1, String paramString2) {
    String str;
    if (paramString1 != null && !paramString1.isEmpty() && paramString2 != null && !paramString2.isEmpty()) {
      str = "( " + paramString1 + ") && ( " + paramString2 + ")";
    } else if (paramString1 == null || paramString1.isEmpty()) {
      str = paramString2;
    } else {
      str = paramString1;
    } 
    return str;
  }
  
  public static boolean a(bv parambv, String paramString) {
    Iterator<bv> iterator = parambv.K();
    while (iterator.hasNext()) {
      bv bv1 = iterator.next();
      if (bv1.aL() != null && bv1.aL().equals(paramString))
        return true; 
      if (bv1.L() && a(bv1, paramString))
        return true; 
    } 
    return false;
  }
  
  public static String c(R paramR, String paramString) {
    String str;
    bv bv = paramR.e().c(paramString);
    if (bv == null) {
      str = "";
    } else if (bv instanceof bm) {
      str = ((bm)bv).M();
    } else if (bv instanceof be) {
      str = ((be)bv).M();
    } else if (bv.M() != null && bv.M().length() > 1) {
      str = bv.M();
    } else {
      str = paramString;
    } 
    Iterator<aA> iterator = paramR.e().b();
    while (iterator.hasNext()) {
      aA aA = iterator.next();
      if (aA.d() != null && aA.d().equals(paramString)) {
        str = aA.e();
        break;
      } 
      Iterator<aA> iterator1 = aA.a();
      while (iterator1.hasNext()) {
        aA aA1 = iterator1.next();
        if (aA1.d() != null && aA1.d().equals(paramString))
          str = aA1.e(); 
      } 
    } 
    return str;
  }
  
  public static ArrayList a(R paramR, ArrayList paramArrayList) {
    ArrayList<bv> arrayList = new ArrayList();
    for (bv bv : paramArrayList) {
      if ((bv.aL() == null || bv.aL().isEmpty()) && bv.Z() == 1)
        bv = bv.j(0); 
      String str1 = (bv.aL() != null && bv.aL().length() > 0) ? bv.aL() : bv.M();
      String str2 = a(paramR, str1);
      try {
        if (str2 == null || str2.equals("") || p.a(str2, paramR))
          arrayList.add(bv); 
      } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
        D.a("An Error occured while evaluating " + str2);
        ExceptionPrintstacktrace.printStackTrace();
      } 
    } 
    return arrayList;
  }
  
  public static ArrayList a(R paramR, bv parambv) {
    ArrayList<String> arrayList = new ArrayList();
    if (parambv instanceof be) {
      be be = (be)parambv;
      String str = be.a();
      if (!arrayList.contains(str))
        arrayList.add(str); 
      str = be.b();
      if (!arrayList.contains(str))
        arrayList.add(str); 
      str = be.c();
      if (!arrayList.contains(str))
        arrayList.add(str); 
    } else if (parambv instanceof bm) {
      bm bm = (bm)parambv;
      byte b;
      for (b = 0; b < bm.j(); b++) {
        String str = bm.d(b);
        if (!arrayList.contains(str))
          arrayList.add(str); 
      } 
      for (b = 0; b < bm.d(); b++) {
        String str = bm.b(b);
        if (!arrayList.contains(str))
          arrayList.add(str); 
      } 
    } else if (parambv instanceof aS) {
      aS aS = (aS)parambv;
      if (aS.m() != null)
        arrayList.add(aS.m()); 
      if (aS.d() != null)
        arrayList.add(aS.d()); 
      if (aS.j() != null)
        arrayList.add(aS.j()); 
      if (aS.h() != null)
        arrayList.add(aS.h()); 
      if (aS.o() != null)
        arrayList.add(aS.o()); 
      if (aS.ExceptionPrintstacktrace() != null)
        arrayList.add(aS.ExceptionPrintstacktrace()); 
      if (aS.f() != null)
        arrayList.add(aS.f()); 
      if (aS.k() != null)
        arrayList.add(aS.k()); 
      if (aS.i() != null)
        arrayList.add(aS.i()); 
      if (aS.l() != null)
        arrayList.add(aS.l()); 
    } else if (parambv instanceof ag) {
      ag ag = (ag)parambv;
      if (ag.a() != null)
        arrayList.add(ag.a()); 
      if (ag.b() != null)
        arrayList.add(ag.b()); 
    } else {
      Iterator<bA> iterator1 = parambv.F();
      while (iterator1.hasNext()) {
        bA bA = iterator1.next();
        if (bA instanceof bq) {
          bq bq = (bq)bA;
          String[] arrayOfString = bq.c();
          if (arrayOfString != null)
            for (byte b = 0; b < arrayOfString.length; b++) {
              String str = arrayOfString[b];
              if (str.contains("["))
                str = str.substring(0, str.indexOf("[")); 
              if (str != null && str.length() > 0 && !arrayList.contains(str))
                arrayList.add(str); 
            }  
        } 
      } 
    } 
    Iterator<bv> iterator = parambv.K();
    while (iterator.hasNext()) {
      bv bv1 = iterator.next();
      ArrayList arrayList1 = a(paramR, bv1);
      for (String str : arrayList1) {
        if (!arrayList.contains(str))
          arrayList.add(str); 
      } 
    } 
    return arrayList;
  }
  
  public static cj[] b(R paramR, ArrayList paramArrayList) {
    HashMap<Object, Object> hashMap = new HashMap<>();
    for (String str : paramArrayList) {
      aM aM = paramR.c(str);
      if (aM != null) {
        if (hashMap.get(Integer.valueOf(aM.d())) != null) {
          cj cj1 = (cj)hashMap.get(Integer.valueOf(aM.d()));
          int i = Math.max(cj1.b() + cj1.c(), aM.ExceptionPrintstacktrace() + aM.z());
          int j = Math.min(cj1.b(), aM.ExceptionPrintstacktrace());
          cj1.a(j);
          cj1.b(i - j);
          continue;
        } 
        cj cj = new cj(aM.d());
        cj.a(aM.ExceptionPrintstacktrace());
        cj.b(aM.z());
        hashMap.put(Integer.valueOf(aM.d()), cj);
        continue;
      } 
      D.c("EcuParameter: '" + str + "' not found in Configuration " + paramR.c());
    } 
    return (hashMap.size() == 0) ? null : (cj[])hashMap.values().toArray((Object[])new cj[hashMap.size()]);
  }
  
  public static cj[] b(R paramR, bv parambv) {
    ArrayList arrayList = a(paramR, parambv);
    return b(paramR, arrayList);
  }
  
  public static aM a(R paramR, int paramInt1, int paramInt2, int paramInt3) {
    Iterator<aM> iterator = paramR.a(paramInt1);
    while (iterator.hasNext()) {
      aM aM = iterator.next();
      if (aM != null && aM.a(paramInt1, paramInt2, paramInt3))
        return aM; 
    } 
    return null;
  }
  
  public static bq d(R paramR, String paramString) {
    Iterator<bv> iterator = paramR.e().d();
    while (iterator.hasNext()) {
      bv bv = iterator.next();
      bq bq = b(bv, paramString);
      if (bq != null)
        return bq; 
    } 
    return null;
  }
  
  public static bq b(bv parambv, String paramString) {
    if (paramString.equals("adc_enable"));
    Iterator<bA> iterator = parambv.F();
    while (iterator.hasNext()) {
      bA bA = iterator.next();
      if (bA instanceof bq) {
        bq bq = (bq)bA;
        if (bq.b() != null && bq.b().equals(paramString))
          return bq; 
      } 
    } 
    try {
      iterator = parambv.K();
      while (iterator.hasNext()) {
        bv bv1 = (bv)iterator.next();
        bq bq = b(bv1, paramString);
        if (bq != null)
          return bq; 
      } 
    } catch (StackOverflowError stackOverflowError) {
      D.c("Boom 45486");
      throw stackOverflowError;
    } 
    return null;
  }
  
  public static String e(R paramR, String paramString) {
    ArrayListUsingPattern q = new ArrayListUsingPattern();
    try {
      q.a(paramString);
    } catch (ExceptionInAxPackage u) {
      Logger.getLogger(bM.class.getName()).log(Level.SEVERE, (String)null, (Throwable)u);
      return paramString;
    } 
    String str = f(paramR, paramString);
    StringBuilder stringBuilder = new StringBuilder(str);
    String[] arrayOfString1 = q.a();
    String[] arrayOfString2 = new String[arrayOfString1.length];
    for (byte b = 0; b < arrayOfString1.length; b++) {
      arrayOfString2[b] = ExceptionPrintstacktrace(paramR, arrayOfString1[b]);
      stringBuilder = X.a(stringBuilder, arrayOfString1[b], arrayOfString2[b]);
    } 
    stringBuilder = X.a(stringBuilder, "&&", " AND ");
    stringBuilder = X.a(stringBuilder, "||", " OR ");
    stringBuilder = X.a(stringBuilder, "==", "=");
    return stringBuilder.toString();
  }
  
  public static String f(R paramR, String paramString) {
    int i = 0;
    if (paramString.indexOf("==") == -1)
      return paramString; 
    StringBuilder stringBuilder = new StringBuilder(paramString);
    while (stringBuilder.indexOf("==", i) != -1) {
      i = stringBuilder.indexOf("==", i);
      String str1 = a(stringBuilder, i);
      String str2 = b(stringBuilder, i + 2);
      aM aM = null;
      String str3 = null;
      boolean bool = false;
      if (I.a(str1)) {
        str3 = str1;
        aM = paramR.c(str2);
      } else if (I.a(str2)) {
        str3 = str2;
        aM = paramR.c(str1);
        bool = true;
      } 
      if (str3 != null && aM != null && I.a(str3) && aM.i().equals("bits")) {
        String str;
        double d = G.k(str3);
        ArrayList<String> arrayList = aM.y();
        if (d >= 0.0D && d < arrayList.size()) {
          str = arrayList.get((int)d);
        } else {
          str = "INVALID";
        } 
        if (bool) {
          int j = stringBuilder.indexOf(str3, i);
          int k = j + str3.length();
          stringBuilder.replace(j, k, str);
          i = k;
        } else {
          int j = stringBuilder.lastIndexOf(str3, i);
          int k = j + str3.length();
          stringBuilder.replace(j, k, str);
          i++;
        } 
      } 
      i++;
    } 
    return stringBuilder.toString();
  }
  
  private static String a(StringBuilder paramStringBuilder, int paramInt) {
    if (paramInt <= 1)
      return ""; 
    for (String str = paramStringBuilder.substring(paramInt - 1, paramInt); str.equals(" ") && paramInt > 0; str = paramStringBuilder.substring(--paramInt - 1, paramInt));
    StringBuilder stringBuilder = new StringBuilder();
    while (paramInt > 0 && i.a.indexOf(paramStringBuilder.charAt(paramInt - 1)) == -1)
      stringBuilder.insert(0, paramStringBuilder.charAt(--paramInt)); 
    return stringBuilder.toString();
  }
  
  private static String b(StringBuilder paramStringBuilder, int paramInt) {
    if (paramInt > paramStringBuilder.length())
      return ""; 
    String str;
    for (str = paramStringBuilder.substring(paramInt, paramInt + 1); str.equals(" ") && paramInt + 1 < paramStringBuilder.length(); str = paramStringBuilder.substring(++paramInt, paramInt + 1));
    StringBuilder stringBuilder = new StringBuilder(str);
    while (paramInt < paramStringBuilder.length() && i.a.indexOf(paramStringBuilder.charAt(paramInt)) != -1) {
      stringBuilder.insert(0, paramStringBuilder.charAt(paramInt));
      paramInt++;
    } 
    return stringBuilder.toString();
  }
  
  public static String ExceptionPrintstacktrace(R paramR, String paramString) {
    bq bq = d(paramR, paramString);
    if (bq != null && bq.l().length() > 0)
      return bq.l(); 
    ac ac = h(paramR, paramString);
    return (ac != null && ac.b().length() > 0) ? ac.b() : paramString;
  }
  
  public static ac h(R paramR, String paramString) {
    ArrayList<ac> arrayList = paramR.ExceptionPrintstacktrace();
    for (byte b = 0; b < arrayList.size(); b++) {
      ac ac = arrayList.get(b);
      if (ac != null && ac.a() != null && ac.a().equals(paramString))
        return ac; 
    } 
    return null;
  }
  
  public static boolean a(bv parambv) {
    if (parambv instanceof bm || parambv instanceof bi || parambv instanceof be)
      return true; 
    if (parambv.L()) {
      Iterator<bv> iterator = parambv.K();
      while (iterator.hasNext()) {
        bv bv1 = iterator.next();
        if (a(bv1))
          return true; 
      } 
    } 
    return false;
  }
  
  public static boolean i(R paramR, String paramString) {
    String str;
    ArrayList<bv> arrayList = new ArrayList();
    Iterator<bv> iterator = paramR.e().d();
    while (iterator.hasNext()) {
      bv bv = iterator.next();
      arrayList.add(bv);
    } 
    iterator = null;
    for (bv bv : arrayList) {
      if (bv.e().contains(paramString)) {
        str = a(paramR, bv.aL());
        String str1 = bv.i(paramString);
        if (str != null && !str.equals("") && str1 != null && !str1.equals("")) {
          str = "( " + str + " ) && ( " + str1 + " )";
          break;
        } 
        if (str1 != null && !str1.equals(""))
          str = str1; 
        break;
      } 
    } 
    try {
      return p.a(str, paramR);
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      return true;
    } 
  }
  
  public static List c(R paramR, bv parambv) {
    List<String> list = parambv.e();
    for (byte b = 0; b < list.size(); b++) {
      String str = list.get(b);
      aM aM = paramR.c(str);
      if (aM != null) {
        dj dj = aM.G();
        list = a(list, dj);
        dj = aM.F();
        list = a(list, dj);
        dj = aM.u();
        list = a(list, dj);
        dj = aM.t();
        list = a(list, dj);
        dj = aM.w();
        list = a(list, dj);
      } else {
        D.b("Unknown EcuParameter: " + str);
      } 
    } 
    return list;
  }
  
  private static List a(List<String> paramList, dj paramdj) {
    if (paramdj instanceof bR) {
      bR bR = (bR)paramdj;
      String[] arrayOfString = bR.b();
      for (byte b = 0; b < arrayOfString.length; b++) {
        if (!paramList.contains(arrayOfString[b]))
          paramList.add(arrayOfString[b]); 
      } 
    } 
    return paramList;
  }
  
  public static String j(R paramR, String paramString) {
    for (ac ac : paramR.ExceptionPrintstacktrace()) {
      if (ac.a() != null && ac.a().equals(paramString))
        return ac.b(); 
    } 
    aH aH = paramR.ExceptionPrintstacktrace(paramString);
    if (aH != null && aH.b().equals("formula") && aH.k() != null && aH.k().trim().startsWith("selectExpression("))
      try {
        String str1 = X.b(aH.k().trim(), "selectExpression(", "");
        str1 = X.b(str1, ")", "");
        String[] arrayOfString = X.c(str1, ",");
        String str2 = arrayOfString[0];
        int i = (int)i.a(str2, paramR);
        return j(paramR, arrayOfString[i + 1]);
      } catch (Exception exception) {
        Logger.getLogger(bM.class.getName()).log(Level.WARNING, "Failed to get DataLogField for {0}", aH.k());
      }  
    return null;
  }
  
  public static void a(ab paramab) {
    a = paramab;
  }
  
  private static String b(String paramString) {
    return (a != null) ? a.a(paramString) : paramString;
  }
  
  public static int k(R paramR, String paramString) {
    int i = -1;
    Iterator<aA> iterator = paramR.e().b();
    while (iterator.hasNext()) {
      aA aA = iterator.next();
      if (aA.d() != null && aA.d().equals(paramString)) {
        bv bv = paramR.e().c(paramString);
        if (bv != null && bv.aJ() != null && !bv.aJ().isEmpty())
          i = aA.f(); 
        break;
      } 
      Iterator<aA> iterator1 = aA.a();
      label29: while (iterator1.hasNext()) {
        aA aA1 = iterator1.next();
        bv bv = (aA1.d() == null) ? null : paramR.e().c(aA1.d());
        if (aA1.d() == null || !aA1.d().equals(paramString)) {
          if (bv != null && bv.L() && a(bv, paramString))
            break label29; 
          continue;
        } 
        i = aA1.f();
      } 
    } 
    return i;
  }
  
  public static List a(R paramR) {
    ArrayList<aA> arrayList = new ArrayList();
    Iterator<aA> iterator = paramR.e().b();
    while (iterator.hasNext()) {
      aA aA = iterator.next();
      try {
        if (!aA.c() && p.a(aA.i(), paramR) && p.a(aA.aJ(), paramR)) {
          if (aA.b()) {
            a(paramR, aA.a(), arrayList);
            continue;
          } 
          if (aA.d() != null && !aA.d().isEmpty())
            arrayList.add(aA); 
        } 
      } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {}
    } 
    return arrayList;
  }
  
  private static void a(R paramR, Iterator<aA> paramIterator, List<aA> paramList) {
    aA aA = null;
    while (paramIterator.hasNext()) {
      aA aA1 = paramIterator.next();
      try {
        if (!aA1.c() && p.a(aA1.i(), paramR)) {
          bv bv = paramR.e().c(aA1.d());
          if (aA1.b()) {
            a(paramR, aA1.a(), paramList);
            continue;
          } 
          boolean bool = true;
          try {
            bool = p.a(aA1.aJ(), paramR);
          } catch (Exception exception) {}
          if (bool) {
            paramList.add(aA1);
            aA = aA1;
          } 
          continue;
        } 
        if (aA1.c() && aA != null && !aA.c() && paramIterator.hasNext())
          aA = aA1; 
      } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {}
    } 
  }
  
  public static boolean a(String paramString) {
    return (paramString != null && (paramString.equals("std_injection") || paramString.equals("std_realtime") || paramString.equals("std_accel") || paramString.equals("std_ms3Rtc") || paramString.equals("std_ms3SdConsole") || paramString.equals("std_ftpSdBrowser") || paramString.equals("std_separator") || paramString.equals("std_ms2gentherm") || paramString.equals("std_ms2geno2") || paramString.equals("std_constants") || paramString.equals("std_warmup") || paramString.equals("std_tpscal") || paramString.equals("std_port_edit") || paramString.equals("std_replay_upload") || paramString.equals("std_bootstrap") || paramString.equals("std_trigwiz")));
  }
  
  public static boolean b(bv parambv) {
    if (parambv == null)
      return false; 
    if (parambv.aL() != null && a(parambv.aL()))
      return true; 
    for (bv bv1 : parambv.d) {
      if (b(bv1))
        return true; 
    } 
    return false;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/bM.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */