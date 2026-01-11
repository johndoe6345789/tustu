package G;

import I.k;
import L.k;
import L.y;
import V.a;
import V.g;
import ax.U;
import bH.D;
import bH.F;
import bH.X;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ExpressionEvaluator {
  public static String a = "+-/=&<>*^!,% [{()}]|\n\t?:";
  
  private static Map e = new HashMap<>();
  
  private static Map f = new HashMap<>();
  
  public static long b = System.currentTimeMillis();
  
  public static boolean c = false;
  
  public static boolean d = false;
  
  public static double a(String paramString, aI paramaI, byte[] paramArrayOfbyte) {
    k k = c(paramaI.c(), paramString);
    if (k == null) {
      k = new k(paramaI);
      k.a(paramString);
      a(paramaI.c(), paramString, k);
    } 
    String[] arrayOfString = k.a();
    for (byte b = 0; b < arrayOfString.length; b++) {
      try {
        double d = b(arrayOfString[b], paramaI, paramArrayOfbyte);
        k.a(arrayOfString[b], d);
      } catch (g g) {
        if (paramaI.R())
          D.b(g.getMessage()); 
        throw new U(g.getMessage());
      } 
    } 
    return k.d();
  }
  
  public static double b(String paramString, aI paramaI, byte[] paramArrayOfbyte) {
    if (paramString.indexOf("[") > 0) {
      String str1 = paramString.substring(0, paramString.indexOf("["));
      String str2 = paramString.substring(paramString.indexOf("["));
      str2 = X.c(str2, "[", "");
      String str3 = str2.substring(0, str2.indexOf("]"));
      int j = Integer.parseInt(str3);
      paramString = str1;
      int k = 0;
      if (str2.indexOf("[") != -1) {
        String str = str2.substring(str2.indexOf("[") + 1, str2.lastIndexOf("]"));
        k = Integer.parseInt(str);
      } 
      aM aM1 = paramaI.c(paramString);
      if (aM1 != null)
        return aM1.i(paramaI.h())[j][k]; 
      throw new g("Variable '" + paramString + "' used in expression, but not defined as OutputChannel or Setting Parameter.");
    } 
    aH aH = paramaI.g(paramString);
    if (aH != null)
      return aH.b(paramArrayOfbyte); 
    aM aM = paramaI.c(paramString);
    if (aM != null)
      return aM.j(paramaI.h()); 
    if ((c || a(paramString)) && paramString.contains(".")) {
      String str = paramString.substring(0, paramString.indexOf("."));
      paramString = paramString.substring(paramString.indexOf(".") + 1, paramString.length());
      R r = T.a().c(str);
      if (r != null)
        return b(paramString, r); 
      if (cu.a().e(paramString))
        return cu.a().g(paramString); 
    } 
    throw new g("Variable '" + paramString + "' used in expression, but not defined as OutputChannel or Setting Parameter.");
  }
  
  public static double a(String paramString, aI paramaI) {
    k k = c(paramaI.c(), paramString);
    if (k == null) {
      k = new k(paramaI);
      k.a(paramString);
      a(paramaI.c(), paramString, k);
    } 
    String[] arrayOfString = k.a();
    for (byte b = 0; b < arrayOfString.length; b++) {
      try {
        double d = b(arrayOfString[b], paramaI);
        k.a(arrayOfString[b], d);
      } catch (g g) {
        throw new U(g.getMessage());
      } 
    } 
    return k.d();
  }
  
  public static double b(String paramString, aI paramaI) {
    if (paramString.indexOf("[") > 0) {
      String str1 = paramString.substring(0, paramString.indexOf("["));
      String str2 = paramString.substring(paramString.indexOf("["));
      str2 = X.c(str2, "[", "");
      String str3 = str2.substring(0, str2.indexOf("]"));
      int j = Integer.parseInt(str3);
      paramString = str1;
      int k = 0;
      if (str2.indexOf("[") != -1) {
        String str = str2.substring(str2.indexOf("[") + 1, str2.lastIndexOf("]"));
        k = Integer.parseInt(str);
      } 
      aM aM1 = paramaI.c(paramString);
      if (aM1 != null)
        return aM1.i(paramaI.h())[j][k]; 
      throw new g("Variable '" + paramString + "' used in expression, but not defined as OutputChannel or Setting Parameter.");
    } 
    aH aH = paramaI.g(paramString);
    if (aH != null)
      return aH.o(); 
    aM aM = paramaI.c(paramString);
    if (aM != null)
      return aM.j(paramaI.h()); 
    if ((c || a(paramString)) && paramString.contains(".")) {
      String str = paramString.substring(0, paramString.indexOf("."));
      paramString = paramString.substring(paramString.indexOf(".") + 1, paramString.length());
      R r = T.a().c(str);
      if (r != null)
        return b(paramString, r); 
      if (cu.a().e(paramString))
        return cu.a().g(paramString); 
    } 
    throw new g("Variable '" + paramString + "' used in expression, but not defined as OutputChannel or Setting Parameter in " + paramaI.c());
  }
  
  private static k c(String paramString1, String paramString2) {
    return (k)e.get(d(paramString1, paramString2));
  }
  
  private static String d(String paramString1, String paramString2) {
    return paramString2;
  }
  
  private static k a(String paramString1, String paramString2, k paramk) {
    String str = d(paramString1, paramString2);
    return e.put(str, paramk);
  }
  
  public static void a() {
    e.clear();
  }
  
  public static void a(String paramString1, String paramString2) {
    R r;
    if (paramString1 == null || paramString1.isEmpty()) {
      r = T.a().c();
    } else {
      r = T.a().c(paramString1);
    } 
    if (r == null) {
      if (paramString1 == null || paramString1.isEmpty())
        throw new g("No working configuration and no config name requested"); 
      throw new g("Configuration Name not found: " + paramString1);
    } 
    aH aH = r.g(paramString2);
    if (aH == null)
      throw new g("OutputChannel not found: " + paramString2); 
    String str = aH.k();
    if (str != null && str.length() > 0) {
      b(r.c(), str);
      k.a().a(r.c(), aH.aL());
    } 
  }
  
  public static void b(String paramString1, String paramString2) {
    if (paramString1 == null || paramString1.isEmpty())
      try {
        paramString1 = T.a().c().c();
      } catch (Exception exception) {} 
    String str = d(paramString1, paramString2);
    k k = (k)e.get(str);
    R r = T.a().c(paramString1);
    if (k != null) {
      String[] arrayOfString = k.a();
      if (arrayOfString != null && arrayOfString.length == 1) {
        aH aH = r.g(arrayOfString[0]);
        if (aH != null && aH.b().equals("formula")) {
          k.a().a(paramString1, aH.k());
          b(paramString1, aH.k());
        } 
      } 
    } 
    e.remove(str);
    if (r != null) {
      aH aH = r.g(paramString2);
      if (aH != null && aH.b().equals("formula"))
        b(paramString1, aH.k()); 
    } 
  }
  
  public static void b() {
    b = System.currentTimeMillis();
    y.a();
  }
  
  public static ArrayList a(R paramR, ArrayList paramArrayList) {
    ArrayList arrayList = a(paramArrayList);
    return a(paramR, arrayList);
  }
  
  public static ArrayList a(R paramR, List paramList) {
    ArrayList<aH> arrayList = new ArrayList();
    Iterator<Integer> iterator = paramList.iterator();
    while (iterator.hasNext()) {
      int j = ((Integer)iterator.next()).intValue();
      aH aH = a(paramR, j);
      if (aH == null)
        aH = b(paramR, j); 
      if (aH != null && !arrayList.contains(aH))
        arrayList.add(aH); 
    } 
    return arrayList;
  }
  
  private static aH b(R paramR, int paramInt) {
    for (al al : paramR.f()) {
      if (al.a() == paramInt)
        return al; 
    } 
    return null;
  }
  
  public static aH a(R paramR, int paramInt) {
    aH aH = null;
    Iterator<aH> iterator = paramR.q();
    while (iterator.hasNext()) {
      aH aH1 = iterator.next();
      if (aH1.a() <= paramInt && aH1.a() + aH1.l() - 1 >= paramInt && (aH == null || aH.l() < aH1.l()))
        aH = aH1; 
    } 
    return aH;
  }
  
  public static ArrayList a(ArrayList paramArrayList) {
    ArrayList<Integer> arrayList = new ArrayList();
    for (aH aH : paramArrayList) {
      if (!arrayList.contains(Integer.valueOf(aH.a())))
        arrayList.add(Integer.valueOf(aH.a())); 
    } 
    return arrayList;
  }
  
  public static String c(String paramString, aI paramaI, byte[] paramArrayOfbyte) {
    if (paramString.indexOf("table(") == -1)
      return paramString; 
    String str1 = paramString.substring(0, paramString.indexOf("table("));
    int j = paramString.indexOf("(", paramString.indexOf("table")) + 1;
    int k = paramString.indexOf(",", j);
    String str2 = paramString.substring(j, k).trim();
    int m = paramString.indexOf(")", k);
    String str3 = paramString.substring(k + 1, m).trim();
    String str4 = paramaI.K().F();
    str3 = X.b(str3, "\"", "");
    String str5 = paramString.substring(m + 1);
    double d = 0.0D;
    if (paramArrayOfbyte != null) {
      str2 = d(str2, paramaI, paramArrayOfbyte);
    } else {
      str2 = d(str2, paramaI);
    } 
    d = Double.parseDouble(str2);
    try {
      F f = F.b(str4, str3);
      double d1 = f.a(d);
      str1 = str1 + "" + d1;
    } catch (IOException iOException) {
      throw new g("Error loading inc Mapping File:" + str3, iOException);
    } catch (Exception exception) {
      throw new g("Error parsing inc Mapping File:" + str3 + "\n\t" + exception.getMessage());
    } 
    return str1 + str5;
  }
  
  public static String c(String paramString, aI paramaI) {
    return c(paramString, paramaI, null);
  }
  
  public static double a(aI paramaI, String paramString) {
    try {
      return a(paramString, paramaI);
    } catch (U u) {
      throw new g("EcuOutputChannel::Error executing formula:" + paramString + " \nError:\n" + u.getMessage());
    } 
  }
  
  public static String d(String paramString, aI paramaI, byte[] paramArrayOfbyte) {
    paramString = e(paramString, paramaI, paramArrayOfbyte);
    byte[] arrayOfByte = paramString.getBytes();
    int j;
    for (j = 0; arrayOfByte.length > j && a.indexOf((char)arrayOfByte[j]) != -1; j++);
    for (int k = j + 1; k <= arrayOfByte.length; k++) {
      boolean bool = (paramString.length() <= k + 1 || a.indexOf(paramString.charAt(k + 1)) != -1) ? true : false;
      if ((k == arrayOfByte.length && j < k - 1) || (k != arrayOfByte.length && a.indexOf((char)arrayOfByte[k]) != -1)) {
        String str = paramString.substring(j, k).trim();
        if (str.length() > 1 && !b(str) && !c(str)) {
          String str1 = str;
          aH aH = paramaI.g(str1);
          String str2 = null;
          if (aH != null) {
            try {
              str2 = "" + aH.b(paramArrayOfbyte);
            } catch (Exception exception) {
              D.c("ChannelUtil::replaceChannelNamesWithValues() Error getting value");
              exception.printStackTrace();
            } 
          } else {
            aM aM = paramaI.c(str1);
            if (aM == null) {
              str2 = "0.0";
              D.c("couldn't get value for " + str1 + " Filling with 0.0, formula:\n\t" + paramString);
            } else {
              try {
                str2 = "" + aM.j(paramaI.h());
              } catch (Exception exception) {
                D.b("Could not get value for " + str1 + ", formula:\n\t" + paramString);
              } 
            } 
          } 
          paramString = X.c(paramString, str1, str2);
          return d(paramString, paramaI, paramArrayOfbyte);
        } 
        j = k + 1;
      } 
    } 
    return paramString;
  }
  
  public static String d(String paramString, aI paramaI) {
    paramString = i(paramString, paramaI);
    byte[] arrayOfByte = paramString.getBytes();
    int j;
    for (j = 0; arrayOfByte.length > j && a.indexOf((char)arrayOfByte[j]) != -1; j++);
    for (int k = j + 1; k <= arrayOfByte.length; k++) {
      if ((k == arrayOfByte.length && j < k - 1) || (k != arrayOfByte.length && a.indexOf((char)arrayOfByte[k]) != -1)) {
        String str = paramString.substring(j, k).trim();
        if (str.length() > 1 && !b(str) && !c(str)) {
          String str1 = str;
          aH aH = paramaI.g(str1);
          String str2 = null;
          if (aH != null) {
            try {
              str2 = "" + aH.o();
            } catch (Exception exception) {
              D.c("ChannelUtil::replaceChannelNamesWithValues() Error getting value");
              exception.printStackTrace();
            } 
          } else {
            aM aM = paramaI.c(str1);
            if (aM == null)
              throw new g(" Variable '" + str1 + "' is not defined in current configuration."); 
            try {
              str2 = "" + aM.j(paramaI.h());
            } catch (Exception exception) {
              D.b("Could not get value for " + str1 + ", formula:\n\t" + paramString);
            } 
          } 
          paramString = X.c(paramString, str1, str2);
          return d(paramString, paramaI);
        } 
        j = k + 1;
      } 
    } 
    return paramString;
  }
  
  public static String a(String paramString, R paramR) {
    int j;
    for (j = 0; paramString.length() > j && a.indexOf(paramString.charAt(j)) != -1; j++);
    for (int k = j + 1; k <= paramString.length(); k++) {
      if ((k == paramString.length() && j < k - 1) || (k <= paramString.length() && (a.indexOf(paramString.charAt(k - 1)) != -1 || k == paramString.length() || a.indexOf(paramString.charAt(k)) != -1))) {
        String str = paramString.substring(j, k).trim();
        if (str.length() > 1 && !b(str) && !c(str)) {
          String str1 = str;
          aH aH = paramR.g(str1);
          String str2 = null;
          if (aH != null) {
            ac ac = a(paramR, str1);
            if (ac == null)
              throw new g("No DataLogField for channel " + str1); 
            try {
              str2 = "[" + ac.b() + "]";
            } catch (Exception exception) {
              D.c("ChannelUtil::convertToMlvFormula() Error getting value");
              exception.printStackTrace();
            } 
          } else {
            aM aM = paramR.c(str1);
            if (aM == null)
              throw new g(" Variable '" + str1 + "' is not defined in current configuration."); 
            try {
              str2 = "" + aM.j(paramR.h());
            } catch (Exception exception) {
              D.b("Could not get value for " + str1 + ", formula:\n\t" + paramString);
            } 
          } 
          paramString = X.c(paramString, str1, str2);
          j = k - str1.length() - str2.length();
          k = j;
        } else {
          j = k;
        } 
      } 
    } 
    return paramString;
  }
  
  public static ac a(R paramR, String paramString) {
    for (ac ac : paramR.g()) {
      if (ac.a().equals(paramString))
        return ac; 
    } 
    return null;
  }
  
  private static String i(String paramString, aI paramaI) {
    while (paramString != null && paramString.indexOf("table(") != -1)
      paramString = c(paramString, paramaI); 
    if (paramString.indexOf("timeNow") != -1)
      paramString = X.b(paramString, "timeNow", "" + ((System.currentTimeMillis() - b) / 1000.0D)); 
    if (paramString.indexOf("tempCvt(") != -1) {
      boolean bool = (paramaI.d("CELSIUS") != null) ? true : false;
      paramString = a(paramString, bool);
    } 
    return paramString;
  }
  
  private static String e(String paramString, aI paramaI, byte[] paramArrayOfbyte) {
    while (paramString != null && paramString.indexOf("table(") != -1)
      paramString = c(paramString, paramaI, paramArrayOfbyte); 
    if (paramString.indexOf("timeNow") != -1)
      paramString = X.b(paramString, "timeNow", "" + ((System.currentTimeMillis() - b) / 1000.0D)); 
    if (paramString.indexOf("tempCvt(") != -1) {
      boolean bool = (paramaI.d("CELSIUS") != null) ? true : false;
      paramString = a(paramString, bool);
    } 
    return paramString;
  }
  
  public static boolean a(String paramString) {
    return (paramString != null && (paramString.equals("time") || paramString.equals("dataLogTime") || paramString.equals("GPS.gpsSpeedMPH") || paramString.contains("AppEvent.dataLogTime") || paramString.contains("AppEvent.dataLoggingActive")));
  }
  
  public static String[] e(String paramString, aI paramaI) {
    byte[] arrayOfByte = paramString.getBytes();
    ArrayList<String> arrayList = new ArrayList();
    k k = c(paramaI.c(), paramString);
    if (k != null) {
      for (String str : k.a()) {
        if (paramaI.g(str) != null)
          arrayList.add(str); 
      } 
      String[] arrayOfString1 = new String[arrayList.size()];
      return arrayList.<String>toArray(arrayOfString1);
    } 
    int j = 0;
    for (byte b = 1; b < arrayOfByte.length; b++) {
      if ((b == arrayOfByte.length && j < b - 1) || (b != arrayOfByte.length && a.indexOf((char)arrayOfByte[b]) != -1)) {
        String str = paramString.substring(j, b).trim();
        if (str.length() > 1 && !b(str) && !c(str)) {
          String str1 = str;
          aH aH = paramaI.g(str1);
          if (aH != null)
            arrayList.add(str1); 
          j = b + 1;
        } else {
          j = b + 1;
        } 
      } 
    } 
    if (arrayList.isEmpty() && paramaI.g(paramString.trim()) != null)
      arrayList.add(paramString.trim()); 
    String[] arrayOfString = new String[arrayList.size()];
    return arrayList.<String>toArray(arrayOfString);
  }
  
  public static String[] f(String paramString, aI paramaI) {
    k k = c(paramaI.c(), paramString);
    if (k == null) {
      if (paramString.contains("%INDEX%"))
        paramString = X.b(paramString, "%INDEX%", "0"); 
      k = new k(paramaI);
      k.a(paramString);
      a(paramaI.c(), paramString, k);
    } 
    return k.a();
  }
  
  public static String[] g(String paramString, aI paramaI) {
    ArrayList<String> arrayList = new ArrayList();
    String[] arrayOfString = f(paramString, paramaI);
    for (byte b = 0; b < arrayOfString.length; b++) {
      if (!arrayList.contains(arrayOfString[b]))
        if (paramaI.g(arrayOfString[b]) != null) {
          aH aH = paramaI.g(arrayOfString[b]);
          if (aH.b().equals("formula")) {
            String[] arrayOfString1 = g(aH.k(), paramaI);
            for (byte b1 = 0; b1 < arrayOfString1.length; b1++)
              arrayList.add(arrayOfString1[b1]); 
          } 
        } else {
          arrayList.add(arrayOfString[b]);
        }  
    } 
    return arrayList.<String>toArray(new String[arrayList.size()]);
  }
  
  public static String[] h(String paramString, aI paramaI) {
    try {
      String[] arrayOfString = g(paramString, paramaI);
      ArrayList<String> arrayList = new ArrayList();
      for (String str : arrayOfString) {
        if (paramaI.c(str) != null)
          arrayList.add(str); 
      } 
      return arrayList.<String>toArray(new String[arrayList.size()]);
    } catch (U u) {
      Logger.getLogger(i.class.getName()).log(Level.SEVERE, (String)null, (Throwable)u);
      return new String[0];
    } 
  }
  
  public static void a(String paramString, aM paramaM, aN paramaN) {
    a(paramString, paramaM.G(), paramaN);
    a(paramString, paramaM.F(), paramaN);
    a(paramString, paramaM.w(), paramaN);
    a(paramString, paramaM.K(), paramaN);
    a(paramString, paramaM.M(), paramaN);
    a(paramString, paramaM.u(), paramaN);
    a(paramString, paramaM.t(), paramaN);
    aR.a().a(paramString, paramaM.aL(), paramaN);
  }
  
  public static void a(String paramString, dj paramdj, aN paramaN) {
    if (paramdj instanceof bR) {
      bR bR = (bR)paramdj;
      String[] arrayOfString = bR.b();
      for (byte b = 0; b < arrayOfString.length; b++)
        aR.a().a(paramString, arrayOfString[b], paramaN); 
    } 
  }
  
  public static void a(String paramString, db paramdb, cq paramcq, aN paramaN) {
    String[] arrayOfString = paramdb.b();
    R r = T.a().c(paramString);
    for (byte b = 0; b < arrayOfString.length; b++) {
      if (r.c(arrayOfString[b]) != null) {
        aR.a().a(paramString, arrayOfString[b], paramaN);
      } else if (r.g(arrayOfString[b]) != null) {
        try {
          cu.a().a(paramString, arrayOfString[b], paramcq);
        } catch (a a) {
          Logger.getLogger(i.class.getName()).log(Level.WARNING, "Unable to subscribe Channel:  " + arrayOfString[b], (Throwable)a);
        } 
      } 
    } 
  }
  
  public static void a(R paramR, String paramString, aN paramaN) {
    if (paramString != null && !paramString.isEmpty()) {
      String[] arrayOfString = h(paramString, paramR);
      for (byte b = 0; b < arrayOfString.length; b++)
        aR.a().a(paramR.c(), arrayOfString[b], paramaN); 
    } 
  }
  
  public static void a(String paramString1, String paramString2, cq paramcq) {
    R r = T.a().c(paramString1);
    if (r == null)
      r = T.a().c(); 
    if (paramString2 != null && !paramString2.isEmpty()) {
      String[] arrayOfString = e(paramString2, r);
      for (String str : arrayOfString) {
        try {
          cu.a().a(paramString1, str, paramcq);
        } catch (a a) {
          Logger.getLogger(i.class.getName()).log(Level.WARNING, "Unable to subscribe Channel from expression: " + paramString2, (Throwable)a);
        } 
      } 
    } 
  }
  
  public static void a(String paramString, db paramdb, aN paramaN) {
    if (paramdb != null) {
      String[] arrayOfString = paramdb.b();
      for (byte b = 0; arrayOfString != null && b < arrayOfString.length; b++) {
        String str = arrayOfString[b];
        int j = str.indexOf("[");
        if (j != -1)
          str = str.substring(0, j); 
        aR.a().a(paramString, str, paramaN);
      } 
    } 
  }
  
  public static String a(String paramString, boolean paramBoolean) {
    String str = "tempCvt";
    int j = paramString.indexOf(str);
    if (j != -1) {
      String str1 = paramString.substring(0, j);
      j += str.length();
      int k = a(paramString, j) + 1;
      String str2 = paramString.substring(j, k);
      String str3 = paramString.substring(k);
      if (paramBoolean)
        str2 = "(" + str2 + "-32)*5/9"; 
      paramString = str1 + str2 + str3;
    } 
    return paramString;
  }
  
  public static int a(String paramString, int paramInt) {
    byte b = 0;
    boolean bool = false;
    int j = -1;
    for (int k = paramInt; k < paramString.length() && (!bool || j == -1); k++) {
      if (paramString.charAt(k) == '(') {
        b++;
        bool = true;
      } else if (bool && paramString.charAt(k) == ')') {
        b--;
      } 
      if (b < 0)
        D.b("Found Close Parenthesis before open starting from index: " + paramInt + ", in Expression:" + paramString); 
      if (bool && b == 0)
        j = k; 
    } 
    return j;
  }
  
  public static boolean b(String paramString) {
    try {
      if (paramString.startsWith("0b")) {
        paramString = paramString.substring(2);
        int j = Integer.parseInt(paramString, 2);
      } else if (paramString.startsWith("0x")) {
        paramString = paramString.substring(2);
        int j = Integer.parseInt(paramString, 16);
      } else {
        double d = Double.parseDouble(paramString);
        return true;
      } 
      return true;
    } catch (Exception exception) {
      return false;
    } 
  }
  
  public static void a(String paramString1, String paramString2, String paramString3) {
    cq cq = a(paramString1, paramString2, paramString3, false);
    if (cq != null)
      cu.a().a(cq); 
    e(paramString2, paramString3);
  }
  
  public static void b(String paramString1, String paramString2, String paramString3) {
    if (paramString3 == null || paramString3.equals(""))
      return; 
    cq cq = a(paramString1, paramString2, paramString3, true);
    R r = T.a().c(paramString2);
    if (r == null)
      throw new q("Ecuconfiguration not loadeed: " + paramString2); 
    try {
      String[] arrayOfString = f(paramString3, r);
      for (byte b = 0; b < arrayOfString.length; b++) {
        if (r.g(arrayOfString[b]) != null) {
          try {
            cu.a().a(paramString2, arrayOfString[b], cq);
          } catch (a a) {
            Logger.getLogger(i.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a);
          } 
        } else if (cu.a().e(arrayOfString[b])) {
          cu.a().a(arrayOfString[b], cq);
        } else if (arrayOfString[b].contains("AppEvent.")) {
          String str = X.b(arrayOfString[b], "AppEvent.", "");
          if (cu.a().e(str))
            cu.a().a(str, cq); 
        } 
      } 
    } catch (U u) {
      u.printStackTrace();
    } 
  }
  
  private static cq a(String paramString1, String paramString2, String paramString3, boolean paramBoolean) {
    String str = paramString1 + paramString2 + paramString3;
    cq cq = (cq)f.get(str);
    if (cq == null && paramBoolean) {
      cq = new j();
      f.put(str, cq);
    } 
    return cq;
  }
  
  private static void e(String paramString1, String paramString2) {
    String str = paramString1 + paramString2;
    f.remove(str);
  }
  
  public static boolean c(String paramString) {
    return a(paramString, (char[])null);
  }
  
  public static boolean a(String paramString, char[] paramArrayOfchar) {
    for (byte b = 0; b < a.length(); b++) {
      if (!a(a.charAt(b), paramArrayOfchar) && paramString.indexOf(a.charAt(b)) != -1)
        return true; 
    } 
    return false;
  }
  
  private static boolean a(char paramChar, char[] paramArrayOfchar) {
    if (paramArrayOfchar == null)
      return false; 
    for (char c : paramArrayOfchar) {
      if (c == paramChar)
        return true; 
    } 
    return false;
  }
  
  public static ArrayList a(aI paramaI, aH paramaH) {
    ArrayList<aH> arrayList = new ArrayList();
    if (paramaH.b().equals("formula")) {
      String[] arrayOfString = e(paramaH.k(), paramaI);
      if (arrayOfString != null)
        for (byte b = 0; b < arrayOfString.length; b++) {
          if (!arrayOfString[b].equals(paramaH.aL())) {
            aH aH1 = paramaI.g(arrayOfString[b]);
            ArrayList<aH> arrayList1 = a(paramaI, aH1);
            if (arrayList1 != null)
              for (byte b1 = 0; b1 < arrayList1.size(); b1++) {
                if (!arrayList.contains(arrayList1.get(b1)))
                  arrayList.add(arrayList1.get(b1)); 
              }  
          } else {
            arrayList.add(paramaH);
          } 
        }  
    } else if (!arrayList.contains(paramaH)) {
      arrayList.add(paramaH);
    } 
    return arrayList;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/i.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */