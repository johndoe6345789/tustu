package business.bit_array_utils;

import java.io.UnsupportedEncodingException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.StringTokenizer;

public class X {
  private static String a = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
  
  public static boolean a(String paramString1, String paramString2) {
    return ((((paramString1 == null) ? 1 : 0) ^ ((paramString2 == null) ? 1 : 0)) != 0) ? false : ((paramString1 == null) ? true : paramString1.equals(paramString2));
  }
  
  public static String a(String paramString) {
    String str = "";
    char[] arrayOfChar = paramString.toCharArray();
    for (byte b = 0; b < arrayOfChar.length; b++) {
      if (a.indexOf(arrayOfChar[b]) != -1)
        str = str + arrayOfChar[b]; 
    } 
    return str;
  }
  
  public static int b(String paramString1, String paramString2) {
    int i = paramString1.indexOf(paramString2);
    int j = i + paramString2.length();
    byte b = 0;
    while (i >= 0) {
      b++;
      if (j <= paramString1.length()) {
        i = paramString1.indexOf(paramString2, j);
        j = i + paramString2.length();
      } 
    } 
    return b;
  }
  
  public static int a(String paramString, char paramChar) {
    char[] arrayOfChar = paramString.toCharArray();
    boolean bool = false;
    for (byte b = 0; b < arrayOfChar.length; b++) {
      if (arrayOfChar[b] == '"')
        bool = !bool ? true : false; 
      if (!bool && arrayOfChar[b] == paramChar)
        return b; 
    } 
    return -1;
  }
  
  public static String b(String paramString) {
    paramString = b(paramString, "&gt;", ">");
    paramString = b(paramString, "&lt;", "<");
    paramString = b(paramString, "&quot;", "\"");
    return b(paramString, "&amp;", "&");
  }
  
  public static boolean c(String paramString) {
    return (paramString == null || paramString.trim().isEmpty());
  }
  
  public static String d(String paramString) {
    if (paramString.contains("<br>"))
      paramString = b(paramString, "\n", ""); 
    if (paramString.contains("  "))
      paramString = b(paramString, "  ", "&nbsp;"); 
    if (paramString.contains("<body>\n")) {
      paramString = paramString.substring(paramString.indexOf("<body>") + 7);
      if (paramString.contains("</body>"))
        paramString = paramString.substring(0, paramString.indexOf("</body>")); 
    } else if (paramString.contains("<body>")) {
      paramString = paramString.substring(paramString.indexOf("<body>") + 6);
      if (paramString.contains("</body>"))
        paramString = paramString.substring(0, paramString.indexOf("</body>")); 
    } else if (paramString.contains("</head>")) {
      paramString = paramString.substring(paramString.indexOf("</head>") + 7);
    } 
    if (paramString.endsWith("\n"))
      paramString = paramString.substring(0, paramString.length() - 1); 
    paramString = b(paramString, "<br>", "\n");
    return paramString.trim();
  }
  
  public static Object[] a(Object[] paramArrayOfObject) {
    for (byte b = 0; b < paramArrayOfObject.length; b++) {
      for (int i = b + 1; i < paramArrayOfObject.length; i++) {
        String str1 = (String)paramArrayOfObject[b];
        String str2 = (String)paramArrayOfObject[i];
        if (str1.toLowerCase().compareTo(str2.toLowerCase()) > 0) {
          paramArrayOfObject[b] = str2;
          paramArrayOfObject[i] = str1;
        } 
      } 
    } 
    return paramArrayOfObject;
  }
  
  public static String[] a(String[] paramArrayOfString) {
    for (byte b = 0; b < paramArrayOfString.length; b++) {
      for (int i = b + 1; i < paramArrayOfString.length; i++) {
        String str1 = paramArrayOfString[b];
        String str2 = paramArrayOfString[i];
        if (str1.toLowerCase().compareTo(str2.toLowerCase()) > 0) {
          paramArrayOfString[b] = str2;
          paramArrayOfString[i] = str1;
        } 
      } 
    } 
    return paramArrayOfString;
  }
  
  public static StringBuilder a(StringBuilder paramStringBuilder, String paramString1, String paramString2) {
    for (int i = paramStringBuilder.indexOf(paramString1); i >= 0; i = paramStringBuilder.indexOf(paramString1, i + paramString2.length()))
      paramStringBuilder = paramStringBuilder.replace(i, i + paramString1.length(), paramString2); 
    return paramStringBuilder;
  }
  
  public static String a(String paramString1, String paramString2, String paramString3) {
    for (int i = paramString1.toLowerCase().indexOf(paramString2.toLowerCase()); i >= 0; i = paramString1.toLowerCase().indexOf(paramString2.toLowerCase(), i + paramString3.length()))
      paramString1 = paramString1.substring(0, i) + paramString3 + paramString1.substring(i + paramString2.length()); 
    return paramString1;
  }
  
  public static String b(String paramString1, String paramString2, String paramString3) {
    for (int i = paramString1.indexOf(paramString2); i >= 0; i = paramString1.indexOf(paramString2, i + paramString3.length())) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(paramString1.substring(0, i));
      if (!paramString3.isEmpty())
        stringBuilder.append(paramString3); 
      stringBuilder.append(paramString1.substring(i + paramString2.length()));
      paramString1 = stringBuilder.toString();
    } 
    return paramString1;
  }
  
  public static String c(String paramString1, String paramString2, String paramString3) {
    int i = paramString1.indexOf(paramString2);
    return (i == -1) ? paramString1 : (paramString1.substring(0, i) + paramString3 + paramString1.substring(i + paramString2.length()));
  }
  
  public static String e(String paramString) {
    if (paramString != null) {
      paramString = b(paramString, "/", "");
      paramString = b(paramString, "-", "_");
      paramString = b(paramString, "+", "_");
      paramString = b(paramString, "*", "x");
      paramString = b(paramString, "%", "");
      paramString = b(paramString, "^", "");
      paramString = b(paramString, "|", "");
      paramString = b(paramString, "(", "_");
      paramString = b(paramString, ")", "_");
      paramString = b(paramString, "{", "");
      paramString = b(paramString, "}", "");
      paramString = b(paramString, "$", "");
      paramString = b(paramString, "&", "");
    } 
    return paramString;
  }
  
  public static boolean f(String paramString) {
    return (paramString != null) ? ((paramString.contains("/") || paramString.contains("-") || paramString.contains("+") || paramString.contains("*") || paramString.contains("%") || paramString.contains("^") || paramString.contains("|") || paramString.contains("(") || paramString.contains(")") || paramString.contains("{") || paramString.contains("}") || paramString.contains("$") || paramString.contains("&"))) : false;
  }
  
  public static String[] c(String paramString1, String paramString2) {
    StringTokenizer stringTokenizer = new StringTokenizer(paramString1 + paramString2, paramString2);
    ArrayList<String> arrayList = new ArrayList();
    while (stringTokenizer.hasMoreTokens()) {
      String str = stringTokenizer.nextToken();
      if (str.trim().startsWith("\""))
        while (str.length() > 1 && str.trim().indexOf('"', 1) == -1 && stringTokenizer.hasMoreTokens())
          str = str + paramString2 + stringTokenizer.nextToken();  
      if (str.trim().indexOf("table(") != -1)
        while (str.length() > 1 && str.trim().indexOf(')', 1) == -1 && stringTokenizer.hasMoreTokens())
          str = str + paramString2 + stringTokenizer.nextToken();  
      arrayList.add(str.trim());
    } 
    String[] arrayOfString = new String[arrayList.size()];
    for (byte b = 0; b < arrayOfString.length; b++)
      arrayOfString[b] = arrayList.get(b); 
    return arrayOfString;
  }
  
  public static int[] d(String paramString1, String paramString2) {
    StringTokenizer stringTokenizer = new StringTokenizer(paramString1, paramString2);
    int[] arrayOfInt = new int[stringTokenizer.countTokens()];
    int i = 0;
    for (byte b = 0; b < arrayOfInt.length; b++) {
      int j = paramString1.indexOf(paramString2, i);
      if (j == -1)
        j = paramString1.length(); 
      String str = paramString1.substring(i, j).trim();
      arrayOfInt[b] = g(str);
      i = j + 1;
    } 
    return arrayOfInt;
  }
  
  public static int g(String paramString) {
    byte b;
    paramString = paramString.trim();
    if (paramString.startsWith("0x")) {
      paramString = paramString.substring(2);
      b = 16;
    } else if (paramString.startsWith("x")) {
      paramString = paramString.substring(1);
      b = 16;
    } else {
      b = 10;
    } 
    return Integer.parseInt(paramString, b);
  }
  
  public static double[][] a(double[][] paramArrayOfdouble, String paramString) {
    return a(paramArrayOfdouble, paramString, false);
  }
  
  public static String h(String paramString) {
    StringBuilder stringBuilder = new StringBuilder();
    for (byte b = 0; b < paramString.length(); b++) {
      if (paramString.charAt(b) > '~' || paramString.charAt(b) < ' ') {
        stringBuilder.append('?');
      } else {
        stringBuilder.append(paramString.charAt(b));
      } 
    } 
    return stringBuilder.toString();
  }
  
  public static double[][] a(double[][] paramArrayOfdouble, String paramString, boolean paramBoolean) {
    if (paramString.indexOf("\n") == -1) {
      paramArrayOfdouble[0][0] = Double.parseDouble(paramString);
      return paramArrayOfdouble;
    } 
    StringTokenizer stringTokenizer = new StringTokenizer(paramString, "\n");
    for (byte b = 0; b < paramArrayOfdouble.length; b++) {
      String str = stringTokenizer.nextToken().replace(' ', '|');
      StringTokenizer stringTokenizer1 = new StringTokenizer(str, "|");
      int i = paramArrayOfdouble.length - 1 - b;
      for (byte b1 = 0; b1 < (paramArrayOfdouble[b]).length && stringTokenizer1.hasMoreTokens(); b1++) {
        String str1 = stringTokenizer1.nextToken();
        if (paramBoolean) {
          paramArrayOfdouble[i][b1] = Double.parseDouble(str1);
        } else {
          paramArrayOfdouble[b][b1] = Double.parseDouble(str1);
        } 
      } 
    } 
    return paramArrayOfdouble;
  }
  
  public static String a(String[][] paramArrayOfString) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("\n");
    for (byte b = 0; b < paramArrayOfString.length; b++) {
      stringBuilder.append("         ");
      for (byte b1 = 0; b1 < (paramArrayOfString[b]).length; b1++)
        stringBuilder.append(paramArrayOfString[b][b1]).append(" "); 
      stringBuilder.append("\n");
    } 
    stringBuilder.append("      ");
    return stringBuilder.toString();
  }
  
  public static String a(double paramDouble, int paramInt) {
    byte b;
    for (b = 0; Math.pow(10.0D, (paramInt - b)) > paramDouble && b != paramInt; b++);
    return b(paramDouble, b);
  }
  
  public static String a(double paramDouble) {
    return b(paramDouble, 1);
  }
  
  public static String b(double paramDouble, int paramInt) {
    DecimalFormat decimalFormat = (DecimalFormat)DecimalFormat.getInstance(Locale.US);
    decimalFormat.setGroupingUsed(false);
    if (paramInt < 0) {
      if (paramDouble < 10000.0D) {
        paramInt = 3 - (int)Math.log10(Math.abs(paramDouble));
      } else {
        paramInt = 0;
      } 
    } else {
      double d = Math.pow(10.0D, paramInt);
      long l = Math.round(paramDouble * d);
      paramDouble = l / d;
    } 
    decimalFormat.setMaximumFractionDigits(paramInt);
    decimalFormat.setMinimumFractionDigits(paramInt);
    return decimalFormat.format(paramDouble);
  }
  
  public static String a(String paramString, int paramInt) {
    if (paramInt <= 0)
      return (paramString.indexOf(".") == -1) ? paramString : paramString.substring(0, paramString.indexOf(".")); 
    if (paramString.indexOf(".") == -1 && paramInt > 0)
      paramString = paramString + ".0"; 
    if (paramString.length() - paramString.indexOf(".") > paramInt) {
      paramString = paramString.substring(0, paramString.indexOf(".") + paramInt + 1);
    } else {
      while (paramString.length() - paramString.indexOf(".") < paramInt + 1)
        paramString = paramString + "0"; 
    } 
    return paramString;
  }
  
  public static String b(double paramDouble) {
    return c(paramDouble, 1);
  }
  
  public static String c(double paramDouble, int paramInt) {
    double d = Math.pow(10.0D, paramInt);
    long l = Math.round(paramDouble * d);
    paramDouble = l / d;
    String str = Double.toString(paramDouble);
    return str.contains("E") ? b(paramDouble, paramInt) : a(str, paramInt);
  }
  
  public static String a(float paramFloat, int paramInt) {
    double d = Math.pow(10.0D, paramInt);
    int i = Math.round(paramFloat * (float)d);
    paramFloat = (float)(i / d);
    String str = Float.toString(paramFloat);
    return b(str, paramInt);
  }
  
  public static String b(String paramString, int paramInt) {
    if (paramInt <= 0)
      return (paramString.indexOf(".") == -1) ? paramString : paramString.substring(0, paramString.indexOf(".")); 
    if (paramString.indexOf(".") == -1 && paramInt > 0)
      paramString = paramString + ".0"; 
    if (paramString.length() - paramString.indexOf(".") > paramInt) {
      paramString = paramString.substring(0, paramString.indexOf(".") + paramInt + 1);
    } else {
      while (paramString.length() - paramString.indexOf(".") < paramInt + 1)
        paramString = paramString + "0"; 
    } 
    return paramString;
  }
  
  public static String a(String paramString, char paramChar, int paramInt) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(paramString);
    while (stringBuilder.length() < paramInt)
      stringBuilder.insert(0, paramChar); 
    return stringBuilder.toString();
  }
  
  public static String b(String paramString, char paramChar, int paramInt) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(paramString);
    while (stringBuilder.length() < paramInt)
      stringBuilder.append(paramChar); 
    return stringBuilder.toString();
  }
  
  public static String a() {
    return a(new Date());
  }
  
  public static String a(Date paramDate) {
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(paramDate);
    return calendar.get(1) + "-" + a((calendar.get(2) + 1) + "", '0', 2) + "-" + a(calendar.get(5) + "", '0', 2) + "_" + a(calendar.get(11) + "", '0', 2) + "." + a(calendar.get(12) + "", '0', 2) + "." + a(calendar.get(13) + "", '0', 2);
  }
  
  public static String a(long paramLong) {
    String str;
    double d = paramLong;
    DecimalFormat decimalFormat = (DecimalFormat)DecimalFormat.getInstance(Locale.US);
    decimalFormat.setGroupingUsed(true);
    if (d < 1024.0D) {
      decimalFormat.setMaximumFractionDigits(0);
      decimalFormat.setMinimumFractionDigits(0);
      str = decimalFormat.format(d) + " bytes";
    } else if (d < 1048576.0D) {
      d /= 1024.0D;
      decimalFormat.setMaximumFractionDigits(2);
      decimalFormat.setMinimumFractionDigits(1);
      str = decimalFormat.format(d) + " KB";
    } else if (d < 1.073741824E9D) {
      d /= 1048576.0D;
      decimalFormat.setMaximumFractionDigits(3);
      decimalFormat.setMinimumFractionDigits(2);
      str = decimalFormat.format(d) + " MB";
    } else {
      d /= 1.073741824E9D;
      decimalFormat.setMaximumFractionDigits(3);
      decimalFormat.setMinimumFractionDigits(2);
      str = decimalFormat.format(d) + " GB";
    } 
    return str;
  }
  
  public static int e(String paramString1, String paramString2) {
    byte b = 0;
    for (int i = 0; (i = paramString1.indexOf(paramString2, i)) != -1; i++)
      b++; 
    return b;
  }
  
  public static String a(String paramString1, int paramInt, String paramString2) {
    byte b1 = 0;
    byte b2 = 0;
    StringBuilder stringBuilder = new StringBuilder();
    for (byte b3 = 0; b3 < paramString1.length(); b3++) {
      if (b1 > paramInt && paramString1.charAt(b3) == ' ') {
        stringBuilder.append(paramString1.subSequence(b2, b3)).append(paramString2);
        b2 = b3;
        b1 = 0;
      } else if (paramString1.charAt(b3) == '\n') {
        b1 = 0;
      } else {
        b1++;
      } 
    } 
    stringBuilder.append(paramString1.subSequence(b2, paramString1.length()));
    return stringBuilder.toString();
  }
  
  public static StringBuilder a(StringBuilder paramStringBuilder, int paramInt, String paramString) {
    byte b = 0;
    for (int i = 0; i < paramStringBuilder.length(); i++) {
      if (b > paramInt && paramStringBuilder.charAt(i) == ' ') {
        paramStringBuilder.replace(i, i + 1, paramString);
        i += paramString.length();
        b = 0;
      } else if (paramStringBuilder.charAt(i) == '\n') {
        b = 0;
      } else {
        b++;
      } 
    } 
    return paramStringBuilder;
  }
  
  public static String i(String paramString) {
    if (paramString.length() > 0) {
      if (paramString.charAt(0) == '"')
        paramString = paramString.substring(1); 
      if (paramString.endsWith("\""))
        paramString = paramString.substring(0, paramString.length() - 1); 
    } 
    return paramString;
  }
  
  public static String[] j(String paramString) {
    boolean bool = false;
    int i = 0;
    ArrayList<String> arrayList = new ArrayList();
    for (byte b = 0; b < paramString.length(); b++) {
      if (paramString.charAt(b) == '"' || paramString.charAt(b) == '{' || paramString.charAt(b) == '}' || paramString.charAt(b) == '[' || paramString.charAt(b) == ']') {
        bool = !bool ? true : false;
      } else if (!bool && paramString.charAt(b) == '=') {
        arrayList.add(paramString.substring(i, b));
        while (b < paramString.length()) {
          if (paramString.charAt(b) != '=') {
            b--;
            break;
          } 
          b++;
        } 
        i = b + 1;
      } 
    } 
    if (i < paramString.length())
      arrayList.add(paramString.substring(i, paramString.length())); 
    return arrayList.<String>toArray(new String[arrayList.size()]);
  }
  
  public static String k(String paramString) {
    for (byte b = 0; b < paramString.length(); b++) {
      if (0 == (byte)paramString.charAt(b)) {
        paramString = paramString.substring(0, b);
        break;
      } 
    } 
    return paramString;
  }
  
  public static String a(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    for (byte b = 0; b < paramInt2; b++) {
      if (0 == paramArrayOfbyte[b + paramInt1] || b == paramInt2 - 1) {
        byte[] arrayOfByte = new byte[b];
        System.arraycopy(paramArrayOfbyte, paramInt1, arrayOfByte, 0, arrayOfByte.length);
        try {
          return new String(arrayOfByte, "UTF-8");
        } catch (UnsupportedEncodingException unsupportedEncodingException) {
          D.c("getNullTerminated String Encoder Error, returning non UTF-8 version");
          return new String(arrayOfByte);
        } 
      } 
    } 
    return "";
  }
  
  public static String a(byte[] paramArrayOfbyte) {
    for (byte b = 0; b < paramArrayOfbyte.length + 1; b++) {
      if (b == paramArrayOfbyte.length || 0 == paramArrayOfbyte[b]) {
        byte[] arrayOfByte = new byte[b];
        System.arraycopy(paramArrayOfbyte, 0, arrayOfByte, 0, arrayOfByte.length);
        try {
          return new String(arrayOfByte, "UTF-8");
        } catch (UnsupportedEncodingException unsupportedEncodingException) {
          D.c("getNullTerminated String Encoder Error, returning non UTF-8 version");
          return new String(arrayOfByte);
        } 
      } 
    } 
    return "";
  }
  
  public static boolean a(String[] paramArrayOfString, String paramString) {
    for (byte b = 0; b < paramArrayOfString.length; b++) {
      if (paramArrayOfString[b].equalsIgnoreCase(paramString))
        return true; 
    } 
    return false;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bH/X.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */