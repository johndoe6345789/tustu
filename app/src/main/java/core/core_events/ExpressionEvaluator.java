package G;

import I.ThreadedInIPackage;
import L.ThreadedInIPackage;
import L.y;
import V.ExceptionInVPackage;
import V.ExceptionPrintstacktrace;
import ax.ExceptionInAxPackage;
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
  public static String ExceptionInVPackage = "+-/=&<>*^!,% [{()}]|\n\t?:";

  private static Map e = new HashMap<>();

  private static Map f = new HashMap<>();

  public static long b = System.currentTimeMillis();

  public static boolean c = false;

  public static boolean d = false;

  public static double ExceptionInVPackage(
      String paramString, aI paramaI, byte[] paramArrayOfbyte) {
    ThreadedInIPackage ThreadedInIPackage = c(paramaI.c(), paramString);
    if (ThreadedInIPackage == null) {
      ThreadedInIPackage = new ThreadedInIPackage(paramaI);
      ThreadedInIPackage.ExceptionInVPackage(paramString);
      ExceptionInVPackage(paramaI.c(), paramString, ThreadedInIPackage);
    }
    String[] arrayOfString = ThreadedInIPackage.ExceptionInVPackage();
    for (byte b = 0; b < arrayOfString.length; b++) {
      try {
        double d = b(arrayOfString[b], paramaI, paramArrayOfbyte);
        ThreadedInIPackage.ExceptionInVPackage(arrayOfString[b], d);
      } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
        if (paramaI.R()) D.b(ExceptionPrintstacktrace.getMessage());
        throw new ExceptionInAxPackage(ExceptionPrintstacktrace.getMessage());
      }
    }
    return ThreadedInIPackage.d();
  }

  public static double b(String paramString, aI paramaI, byte[] paramArrayOfbyte) {
    if (paramString.indexOf("[") > 0) {
      String str1 = paramString.substring(0, paramString.indexOf("["));
      String str2 = paramString.substring(paramString.indexOf("["));
      str2 = X.c(str2, "[", "");
      String str3 = str2.substring(0, str2.indexOf("]"));
      int j = Integer.parseInt(str3);
      paramString = str1;
      int ThreadedInIPackage = 0;
      if (str2.indexOf("[") != -1) {
        String str = str2.substring(str2.indexOf("[") + 1, str2.lastIndexOf("]"));
        ThreadedInIPackage = Integer.parseInt(str);
      }
      aM aM1 = paramaI.c(paramString);
      if (aM1 != null) return aM1.i(paramaI.h())[j][ThreadedInIPackage];
      throw new ExceptionPrintstacktrace(
          "Variable '"
              + paramString
              + "' used in expression, but not defined as OutputChannel or Setting Parameter.");
    }
    aH aH = paramaI.ExceptionPrintstacktrace(paramString);
    if (aH != null) return aH.b(paramArrayOfbyte);
    aM aM = paramaI.c(paramString);
    if (aM != null) return aM.j(paramaI.h());
    if ((c || ExceptionInVPackage(paramString)) && paramString.contains(".")) {
      String str = paramString.substring(0, paramString.indexOf("."));
      paramString = paramString.substring(paramString.indexOf(".") + 1, paramString.length());
      R r = T.ExceptionInVPackage().c(str);
      if (r != null) return b(paramString, r);
      if (cu.ExceptionInVPackage().e(paramString))
        return cu.ExceptionInVPackage().ExceptionPrintstacktrace(paramString);
    }
    throw new ExceptionPrintstacktrace(
        "Variable '"
            + paramString
            + "' used in expression, but not defined as OutputChannel or Setting Parameter.");
  }

  public static double ExceptionInVPackage(String paramString, aI paramaI) {
    ThreadedInIPackage ThreadedInIPackage = c(paramaI.c(), paramString);
    if (ThreadedInIPackage == null) {
      ThreadedInIPackage = new ThreadedInIPackage(paramaI);
      ThreadedInIPackage.ExceptionInVPackage(paramString);
      ExceptionInVPackage(paramaI.c(), paramString, ThreadedInIPackage);
    }
    String[] arrayOfString = ThreadedInIPackage.ExceptionInVPackage();
    for (byte b = 0; b < arrayOfString.length; b++) {
      try {
        double d = b(arrayOfString[b], paramaI);
        ThreadedInIPackage.ExceptionInVPackage(arrayOfString[b], d);
      } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
        throw new ExceptionInAxPackage(ExceptionPrintstacktrace.getMessage());
      }
    }
    return ThreadedInIPackage.d();
  }

  public static double b(String paramString, aI paramaI) {
    if (paramString.indexOf("[") > 0) {
      String str1 = paramString.substring(0, paramString.indexOf("["));
      String str2 = paramString.substring(paramString.indexOf("["));
      str2 = X.c(str2, "[", "");
      String str3 = str2.substring(0, str2.indexOf("]"));
      int j = Integer.parseInt(str3);
      paramString = str1;
      int ThreadedInIPackage = 0;
      if (str2.indexOf("[") != -1) {
        String str = str2.substring(str2.indexOf("[") + 1, str2.lastIndexOf("]"));
        ThreadedInIPackage = Integer.parseInt(str);
      }
      aM aM1 = paramaI.c(paramString);
      if (aM1 != null) return aM1.i(paramaI.h())[j][ThreadedInIPackage];
      throw new ExceptionPrintstacktrace(
          "Variable '"
              + paramString
              + "' used in expression, but not defined as OutputChannel or Setting Parameter.");
    }
    aH aH = paramaI.ExceptionPrintstacktrace(paramString);
    if (aH != null) return aH.o();
    aM aM = paramaI.c(paramString);
    if (aM != null) return aM.j(paramaI.h());
    if ((c || ExceptionInVPackage(paramString)) && paramString.contains(".")) {
      String str = paramString.substring(0, paramString.indexOf("."));
      paramString = paramString.substring(paramString.indexOf(".") + 1, paramString.length());
      R r = T.ExceptionInVPackage().c(str);
      if (r != null) return b(paramString, r);
      if (cu.ExceptionInVPackage().e(paramString))
        return cu.ExceptionInVPackage().ExceptionPrintstacktrace(paramString);
    }
    throw new ExceptionPrintstacktrace(
        "Variable '"
            + paramString
            + "' used in expression, but not defined as OutputChannel or Setting Parameter in "
            + paramaI.c());
  }

  private static ThreadedInIPackage c(String paramString1, String paramString2) {
    return (ThreadedInIPackage) e.get(d(paramString1, paramString2));
  }

  private static String d(String paramString1, String paramString2) {
    return paramString2;
  }

  private static ThreadedInIPackage ExceptionInVPackage(
      String paramString1, String paramString2, ThreadedInIPackage paramk) {
    String str = d(paramString1, paramString2);
    return e.put(str, paramk);
  }

  public static void ExceptionInVPackage() {
    e.clear();
  }

  public static void ExceptionInVPackage(String paramString1, String paramString2) {
    R r;
    if (paramString1 == null || paramString1.isEmpty()) {
      r = T.ExceptionInVPackage().c();
    } else {
      r = T.ExceptionInVPackage().c(paramString1);
    }
    if (r == null) {
      if (paramString1 == null || paramString1.isEmpty())
        throw new ExceptionPrintstacktrace("No working configuration and no config name requested");
      throw new ExceptionPrintstacktrace("Configuration Name not found: " + paramString1);
    }
    aH aH = r.ExceptionPrintstacktrace(paramString2);
    if (aH == null) throw new ExceptionPrintstacktrace("OutputChannel not found: " + paramString2);
    String str = aH.ThreadedInIPackage();
    if (str != null && str.length() > 0) {
      b(r.c(), str);
      ThreadedInIPackage.ExceptionInVPackage().ExceptionInVPackage(r.c(), aH.aL());
    }
  }

  public static void b(String paramString1, String paramString2) {
    if (paramString1 == null || paramString1.isEmpty())
      try {
        paramString1 = T.ExceptionInVPackage().c().c();
      } catch (Exception exception) {
      }
    String str = d(paramString1, paramString2);
    ThreadedInIPackage ThreadedInIPackage = (ThreadedInIPackage) e.get(str);
    R r = T.ExceptionInVPackage().c(paramString1);
    if (ThreadedInIPackage != null) {
      String[] arrayOfString = ThreadedInIPackage.ExceptionInVPackage();
      if (arrayOfString != null && arrayOfString.length == 1) {
        aH aH = r.ExceptionPrintstacktrace(arrayOfString[0]);
        if (aH != null && aH.b().equals("formula")) {
          ThreadedInIPackage.ExceptionInVPackage()
              .ExceptionInVPackage(paramString1, aH.ThreadedInIPackage());
          b(paramString1, aH.ThreadedInIPackage());
        }
      }
    }
    e.remove(str);
    if (r != null) {
      aH aH = r.ExceptionPrintstacktrace(paramString2);
      if (aH != null && aH.b().equals("formula")) b(paramString1, aH.ThreadedInIPackage());
    }
  }

  public static void b() {
    b = System.currentTimeMillis();
    y.ExceptionInVPackage();
  }

  public static ArrayList ExceptionInVPackage(R paramR, ArrayList paramArrayList) {
    ArrayList arrayList = ExceptionInVPackage(paramArrayList);
    return ExceptionInVPackage(paramR, arrayList);
  }

  public static ArrayList ExceptionInVPackage(R paramR, List paramList) {
    ArrayList<aH> arrayList = new ArrayList();
    Iterator<Integer> iterator = paramList.iterator();
    while (iterator.hasNext()) {
      int j = ((Integer) iterator.next()).intValue();
      aH aH = ExceptionInVPackage(paramR, j);
      if (aH == null) aH = b(paramR, j);
      if (aH != null && !arrayList.contains(aH)) arrayList.add(aH);
    }
    return arrayList;
  }

  private static aH b(R paramR, int paramInt) {
    for (al al : paramR.f()) {
      if (al.ExceptionInVPackage() == paramInt) return al;
    }
    return null;
  }

  public static aH ExceptionInVPackage(R paramR, int paramInt) {
    aH aH = null;
    Iterator<aH> iterator = paramR.q();
    while (iterator.hasNext()) {
      aH aH1 = iterator.next();
      if (aH1.ExceptionInVPackage() <= paramInt
          && aH1.ExceptionInVPackage() + aH1.l() - 1 >= paramInt
          && (aH == null || aH.l() < aH1.l())) aH = aH1;
    }
    return aH;
  }

  public static ArrayList ExceptionInVPackage(ArrayList paramArrayList) {
    ArrayList<Integer> arrayList = new ArrayList();
    for (aH aH : paramArrayList) {
      if (!arrayList.contains(Integer.valueOf(aH.ExceptionInVPackage())))
        arrayList.add(Integer.valueOf(aH.ExceptionInVPackage()));
    }
    return arrayList;
  }

  public static String c(String paramString, aI paramaI, byte[] paramArrayOfbyte) {
    if (paramString.indexOf("table(") == -1) return paramString;
    String str1 = paramString.substring(0, paramString.indexOf("table("));
    int j = paramString.indexOf("(", paramString.indexOf("table")) + 1;
    int ThreadedInIPackage = paramString.indexOf(",", j);
    String str2 = paramString.substring(j, ThreadedInIPackage).trim();
    int m = paramString.indexOf(")", ThreadedInIPackage);
    String str3 = paramString.substring(ThreadedInIPackage + 1, m).trim();
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
      double d1 = f.ExceptionInVPackage(d);
      str1 = str1 + "" + d1;
    } catch (IOException iOException) {
      throw new ExceptionPrintstacktrace("Error loading inc Mapping File:" + str3, iOException);
    } catch (Exception exception) {
      throw new ExceptionPrintstacktrace(
          "Error parsing inc Mapping File:" + str3 + "\n\t" + exception.getMessage());
    }
    return str1 + str5;
  }

  public static String c(String paramString, aI paramaI) {
    return c(paramString, paramaI, null);
  }

  public static double ExceptionInVPackage(aI paramaI, String paramString) {
    try {
      return ExceptionInVPackage(paramString, paramaI);
    } catch (ExceptionInAxPackage u) {
      throw new ExceptionPrintstacktrace(
          "EcuOutputChannel::Error executing formula:"
              + paramString
              + " \nError:\n"
              + u.getMessage());
    }
  }

  public static String d(String paramString, aI paramaI, byte[] paramArrayOfbyte) {
    paramString = e(paramString, paramaI, paramArrayOfbyte);
    byte[] arrayOfByte = paramString.getBytes();
    int j;
    for (j = 0;
        arrayOfByte.length > j && ExceptionInVPackage.indexOf((char) arrayOfByte[j]) != -1;
        j++)
      ;
    for (int ThreadedInIPackage = j + 1;
        ThreadedInIPackage <= arrayOfByte.length;
        ThreadedInIPackage++) {
      boolean bool =
          (paramString.length() <= ThreadedInIPackage + 1
                  || ExceptionInVPackage.indexOf(paramString.charAt(ThreadedInIPackage + 1)) != -1)
              ? true
              : false;
      if ((ThreadedInIPackage == arrayOfByte.length && j < ThreadedInIPackage - 1)
          || (ThreadedInIPackage != arrayOfByte.length
              && ExceptionInVPackage.indexOf((char) arrayOfByte[ThreadedInIPackage]) != -1)) {
        String str = paramString.substring(j, ThreadedInIPackage).trim();
        if (str.length() > 1 && !b(str) && !c(str)) {
          String str1 = str;
          aH aH = paramaI.ExceptionPrintstacktrace(str1);
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
              D.c(
                  "couldn't get value for "
                      + str1
                      + " Filling with 0.0, formula:\n\t"
                      + paramString);
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
        j = ThreadedInIPackage + 1;
      }
    }
    return paramString;
  }

  public static String d(String paramString, aI paramaI) {
    paramString = i(paramString, paramaI);
    byte[] arrayOfByte = paramString.getBytes();
    int j;
    for (j = 0;
        arrayOfByte.length > j && ExceptionInVPackage.indexOf((char) arrayOfByte[j]) != -1;
        j++)
      ;
    for (int ThreadedInIPackage = j + 1;
        ThreadedInIPackage <= arrayOfByte.length;
        ThreadedInIPackage++) {
      if ((ThreadedInIPackage == arrayOfByte.length && j < ThreadedInIPackage - 1)
          || (ThreadedInIPackage != arrayOfByte.length
              && ExceptionInVPackage.indexOf((char) arrayOfByte[ThreadedInIPackage]) != -1)) {
        String str = paramString.substring(j, ThreadedInIPackage).trim();
        if (str.length() > 1 && !b(str) && !c(str)) {
          String str1 = str;
          aH aH = paramaI.ExceptionPrintstacktrace(str1);
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
              throw new ExceptionPrintstacktrace(
                  " Variable '" + str1 + "' is not defined in current configuration.");
            try {
              str2 = "" + aM.j(paramaI.h());
            } catch (Exception exception) {
              D.b("Could not get value for " + str1 + ", formula:\n\t" + paramString);
            }
          }
          paramString = X.c(paramString, str1, str2);
          return d(paramString, paramaI);
        }
        j = ThreadedInIPackage + 1;
      }
    }
    return paramString;
  }

  public static String ExceptionInVPackage(String paramString, R paramR) {
    int j;
    for (j = 0;
        paramString.length() > j && ExceptionInVPackage.indexOf(paramString.charAt(j)) != -1;
        j++)
      ;
    for (int ThreadedInIPackage = j + 1;
        ThreadedInIPackage <= paramString.length();
        ThreadedInIPackage++) {
      if ((ThreadedInIPackage == paramString.length() && j < ThreadedInIPackage - 1)
          || (ThreadedInIPackage <= paramString.length()
              && (ExceptionInVPackage.indexOf(paramString.charAt(ThreadedInIPackage - 1)) != -1
                  || ThreadedInIPackage == paramString.length()
                  || ExceptionInVPackage.indexOf(paramString.charAt(ThreadedInIPackage)) != -1))) {
        String str = paramString.substring(j, ThreadedInIPackage).trim();
        if (str.length() > 1 && !b(str) && !c(str)) {
          String str1 = str;
          aH aH = paramR.ExceptionPrintstacktrace(str1);
          String str2 = null;
          if (aH != null) {
            ac ac = ExceptionInVPackage(paramR, str1);
            if (ac == null)
              throw new ExceptionPrintstacktrace("No DataLogField for channel " + str1);
            try {
              str2 = "[" + ac.b() + "]";
            } catch (Exception exception) {
              D.c("ChannelUtil::convertToMlvFormula() Error getting value");
              exception.printStackTrace();
            }
          } else {
            aM aM = paramR.c(str1);
            if (aM == null)
              throw new ExceptionPrintstacktrace(
                  " Variable '" + str1 + "' is not defined in current configuration.");
            try {
              str2 = "" + aM.j(paramR.h());
            } catch (Exception exception) {
              D.b("Could not get value for " + str1 + ", formula:\n\t" + paramString);
            }
          }
          paramString = X.c(paramString, str1, str2);
          j = ThreadedInIPackage - str1.length() - str2.length();
          ThreadedInIPackage = j;
        } else {
          j = ThreadedInIPackage;
        }
      }
    }
    return paramString;
  }

  public static ac ExceptionInVPackage(R paramR, String paramString) {
    for (ac ac : paramR.ExceptionPrintstacktrace()) {
      if (ac.ExceptionInVPackage().equals(paramString)) return ac;
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
      paramString = ExceptionInVPackage(paramString, bool);
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
      paramString = ExceptionInVPackage(paramString, bool);
    }
    return paramString;
  }

  public static boolean ExceptionInVPackage(String paramString) {
    return (paramString != null
        && (paramString.equals("time")
            || paramString.equals("dataLogTime")
            || paramString.equals("GPS.gpsSpeedMPH")
            || paramString.contains("AppEvent.dataLogTime")
            || paramString.contains("AppEvent.dataLoggingActive")));
  }

  public static String[] e(String paramString, aI paramaI) {
    byte[] arrayOfByte = paramString.getBytes();
    ArrayList<String> arrayList = new ArrayList();
    ThreadedInIPackage ThreadedInIPackage = c(paramaI.c(), paramString);
    if (ThreadedInIPackage != null) {
      for (String str : ThreadedInIPackage.ExceptionInVPackage()) {
        if (paramaI.ExceptionPrintstacktrace(str) != null) arrayList.add(str);
      }
      String[] arrayOfString1 = new String[arrayList.size()];
      return arrayList.<String>toArray(arrayOfString1);
    }
    int j = 0;
    for (byte b = 1; b < arrayOfByte.length; b++) {
      if ((b == arrayOfByte.length && j < b - 1)
          || (b != arrayOfByte.length
              && ExceptionInVPackage.indexOf((char) arrayOfByte[b]) != -1)) {
        String str = paramString.substring(j, b).trim();
        if (str.length() > 1 && !b(str) && !c(str)) {
          String str1 = str;
          aH aH = paramaI.ExceptionPrintstacktrace(str1);
          if (aH != null) arrayList.add(str1);
          j = b + 1;
        } else {
          j = b + 1;
        }
      }
    }
    if (arrayList.isEmpty() && paramaI.ExceptionPrintstacktrace(paramString.trim()) != null)
      arrayList.add(paramString.trim());
    String[] arrayOfString = new String[arrayList.size()];
    return arrayList.<String>toArray(arrayOfString);
  }

  public static String[] f(String paramString, aI paramaI) {
    ThreadedInIPackage ThreadedInIPackage = c(paramaI.c(), paramString);
    if (ThreadedInIPackage == null) {
      if (paramString.contains("%INDEX%")) paramString = X.b(paramString, "%INDEX%", "0");
      ThreadedInIPackage = new ThreadedInIPackage(paramaI);
      ThreadedInIPackage.ExceptionInVPackage(paramString);
      ExceptionInVPackage(paramaI.c(), paramString, ThreadedInIPackage);
    }
    return ThreadedInIPackage.ExceptionInVPackage();
  }

  public static String[] ExceptionPrintstacktrace(String paramString, aI paramaI) {
    ArrayList<String> arrayList = new ArrayList();
    String[] arrayOfString = f(paramString, paramaI);
    for (byte b = 0; b < arrayOfString.length; b++) {
      if (!arrayList.contains(arrayOfString[b]))
        if (paramaI.ExceptionPrintstacktrace(arrayOfString[b]) != null) {
          aH aH = paramaI.ExceptionPrintstacktrace(arrayOfString[b]);
          if (aH.b().equals("formula")) {
            String[] arrayOfString1 = ExceptionPrintstacktrace(aH.ThreadedInIPackage(), paramaI);
            for (byte b1 = 0; b1 < arrayOfString1.length; b1++) arrayList.add(arrayOfString1[b1]);
          }
        } else {
          arrayList.add(arrayOfString[b]);
        }
    }
    return arrayList.<String>toArray(new String[arrayList.size()]);
  }

  public static String[] h(String paramString, aI paramaI) {
    try {
      String[] arrayOfString = ExceptionPrintstacktrace(paramString, paramaI);
      ArrayList<String> arrayList = new ArrayList();
      for (String str : arrayOfString) {
        if (paramaI.c(str) != null) arrayList.add(str);
      }
      return arrayList.<String>toArray(new String[arrayList.size()]);
    } catch (ExceptionInAxPackage u) {
      Logger.getLogger(i.class.getName()).log(Level.SEVERE, (String) null, (Throwable) u);
      return new String[0];
    }
  }

  public static void ExceptionInVPackage(String paramString, aM paramaM, aN paramaN) {
    ExceptionInVPackage(paramString, paramaM.G(), paramaN);
    ExceptionInVPackage(paramString, paramaM.F(), paramaN);
    ExceptionInVPackage(paramString, paramaM.w(), paramaN);
    ExceptionInVPackage(paramString, paramaM.K(), paramaN);
    ExceptionInVPackage(paramString, paramaM.M(), paramaN);
    ExceptionInVPackage(paramString, paramaM.u(), paramaN);
    ExceptionInVPackage(paramString, paramaM.t(), paramaN);
    aR.ExceptionInVPackage().ExceptionInVPackage(paramString, paramaM.aL(), paramaN);
  }

  public static void ExceptionInVPackage(String paramString, dj paramdj, aN paramaN) {
    if (paramdj instanceof bR) {
      bR bR = (bR) paramdj;
      String[] arrayOfString = bR.b();
      for (byte b = 0; b < arrayOfString.length; b++)
        aR.ExceptionInVPackage().ExceptionInVPackage(paramString, arrayOfString[b], paramaN);
    }
  }

  public static void ExceptionInVPackage(String paramString, db paramdb, cq paramcq, aN paramaN) {
    String[] arrayOfString = paramdb.b();
    R r = T.ExceptionInVPackage().c(paramString);
    for (byte b = 0; b < arrayOfString.length; b++) {
      if (r.c(arrayOfString[b]) != null) {
        aR.ExceptionInVPackage().ExceptionInVPackage(paramString, arrayOfString[b], paramaN);
      } else if (r.ExceptionPrintstacktrace(arrayOfString[b]) != null) {
        try {
          cu.ExceptionInVPackage().ExceptionInVPackage(paramString, arrayOfString[b], paramcq);
        } catch (ExceptionInVPackage ExceptionInVPackage) {
          Logger.getLogger(i.class.getName())
              .log(
                  Level.WARNING,
                  "Unable to subscribe Channel:  " + arrayOfString[b],
                  (Throwable) ExceptionInVPackage);
        }
      }
    }
  }

  public static void ExceptionInVPackage(R paramR, String paramString, aN paramaN) {
    if (paramString != null && !paramString.isEmpty()) {
      String[] arrayOfString = h(paramString, paramR);
      for (byte b = 0; b < arrayOfString.length; b++)
        aR.ExceptionInVPackage().ExceptionInVPackage(paramR.c(), arrayOfString[b], paramaN);
    }
  }

  public static void ExceptionInVPackage(String paramString1, String paramString2, cq paramcq) {
    R r = T.ExceptionInVPackage().c(paramString1);
    if (r == null) r = T.ExceptionInVPackage().c();
    if (paramString2 != null && !paramString2.isEmpty()) {
      String[] arrayOfString = e(paramString2, r);
      for (String str : arrayOfString) {
        try {
          cu.ExceptionInVPackage().ExceptionInVPackage(paramString1, str, paramcq);
        } catch (ExceptionInVPackage ExceptionInVPackage) {
          Logger.getLogger(i.class.getName())
              .log(
                  Level.WARNING,
                  "Unable to subscribe Channel from expression: " + paramString2,
                  (Throwable) ExceptionInVPackage);
        }
      }
    }
  }

  public static void ExceptionInVPackage(String paramString, db paramdb, aN paramaN) {
    if (paramdb != null) {
      String[] arrayOfString = paramdb.b();
      for (byte b = 0; arrayOfString != null && b < arrayOfString.length; b++) {
        String str = arrayOfString[b];
        int j = str.indexOf("[");
        if (j != -1) str = str.substring(0, j);
        aR.ExceptionInVPackage().ExceptionInVPackage(paramString, str, paramaN);
      }
    }
  }

  public static String ExceptionInVPackage(String paramString, boolean paramBoolean) {
    String str = "tempCvt";
    int j = paramString.indexOf(str);
    if (j != -1) {
      String str1 = paramString.substring(0, j);
      j += str.length();
      int ThreadedInIPackage = ExceptionInVPackage(paramString, j) + 1;
      String str2 = paramString.substring(j, ThreadedInIPackage);
      String str3 = paramString.substring(ThreadedInIPackage);
      if (paramBoolean) str2 = "(" + str2 + "-32)*5/9";
      paramString = str1 + str2 + str3;
    }
    return paramString;
  }

  public static int ExceptionInVPackage(String paramString, int paramInt) {
    byte b = 0;
    boolean bool = false;
    int j = -1;
    for (int ThreadedInIPackage = paramInt;
        ThreadedInIPackage < paramString.length() && (!bool || j == -1);
        ThreadedInIPackage++) {
      if (paramString.charAt(ThreadedInIPackage) == '(') {
        b++;
        bool = true;
      } else if (bool && paramString.charAt(ThreadedInIPackage) == ')') {
        b--;
      }
      if (b < 0)
        D.b(
            "Found Close Parenthesis before open starting from index: "
                + paramInt
                + ", in Expression:"
                + paramString);
      if (bool && b == 0) j = ThreadedInIPackage;
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

  public static void ExceptionInVPackage(
      String paramString1, String paramString2, String paramString3) {
    cq cq = ExceptionInVPackage(paramString1, paramString2, paramString3, false);
    if (cq != null) cu.ExceptionInVPackage().ExceptionInVPackage(cq);
    e(paramString2, paramString3);
  }

  public static void b(String paramString1, String paramString2, String paramString3) {
    if (paramString3 == null || paramString3.equals("")) return;
    cq cq = ExceptionInVPackage(paramString1, paramString2, paramString3, true);
    R r = T.ExceptionInVPackage().c(paramString2);
    if (r == null) throw new q("Ecuconfiguration not loadeed: " + paramString2);
    try {
      String[] arrayOfString = f(paramString3, r);
      for (byte b = 0; b < arrayOfString.length; b++) {
        if (r.ExceptionPrintstacktrace(arrayOfString[b]) != null) {
          try {
            cu.ExceptionInVPackage().ExceptionInVPackage(paramString2, arrayOfString[b], cq);
          } catch (ExceptionInVPackage ExceptionInVPackage) {
            Logger.getLogger(i.class.getName())
                .log(Level.SEVERE, (String) null, (Throwable) ExceptionInVPackage);
          }
        } else if (cu.ExceptionInVPackage().e(arrayOfString[b])) {
          cu.ExceptionInVPackage().ExceptionInVPackage(arrayOfString[b], cq);
        } else if (arrayOfString[b].contains("AppEvent.")) {
          String str = X.b(arrayOfString[b], "AppEvent.", "");
          if (cu.ExceptionInVPackage().e(str))
            cu.ExceptionInVPackage().ExceptionInVPackage(str, cq);
        }
      }
    } catch (ExceptionInAxPackage u) {
      u.printStackTrace();
    }
  }

  private static cq ExceptionInVPackage(
      String paramString1, String paramString2, String paramString3, boolean paramBoolean) {
    String str = paramString1 + paramString2 + paramString3;
    cq cq = (cq) f.get(str);
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
    return ExceptionInVPackage(paramString, (char[]) null);
  }

  public static boolean ExceptionInVPackage(String paramString, char[] paramArrayOfchar) {
    for (byte b = 0; b < ExceptionInVPackage.length(); b++) {
      if (!ExceptionInVPackage(ExceptionInVPackage.charAt(b), paramArrayOfchar)
          && paramString.indexOf(ExceptionInVPackage.charAt(b)) != -1) return true;
    }
    return false;
  }

  private static boolean ExceptionInVPackage(char paramChar, char[] paramArrayOfchar) {
    if (paramArrayOfchar == null) return false;
    for (char c : paramArrayOfchar) {
      if (c == paramChar) return true;
    }
    return false;
  }

  public static ArrayList ExceptionInVPackage(aI paramaI, aH paramaH) {
    ArrayList<aH> arrayList = new ArrayList();
    if (paramaH.b().equals("formula")) {
      String[] arrayOfString = e(paramaH.ThreadedInIPackage(), paramaI);
      if (arrayOfString != null)
        for (byte b = 0; b < arrayOfString.length; b++) {
          if (!arrayOfString[b].equals(paramaH.aL())) {
            aH aH1 = paramaI.ExceptionPrintstacktrace(arrayOfString[b]);
            ArrayList<aH> arrayList1 = ExceptionInVPackage(paramaI, aH1);
            if (arrayList1 != null)
              for (byte b1 = 0; b1 < arrayList1.size(); b1++) {
                if (!arrayList.contains(arrayList1.get(b1))) arrayList.add(arrayList1.get(b1));
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
