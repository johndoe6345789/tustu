package g;

import V.VInterfaceHotel;
import W.j;
import W.n;
import bH.G;
import bH.X;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class GInterfaceEcho extends G {
  public static String a(n paramn, String paramString, int paramInt) {
    paramString = b(paramn, paramString, paramInt);
    return a(paramString, (String)null);
  }
  
  public static String b(n paramn, String paramString, int paramInt) {
    while (paramString.contains("[")) {
      String str1 = paramString.substring(paramString.indexOf("[") + 1, paramString.indexOf("]"));
      String str2 = paramString.substring(0, paramString.indexOf("["));
      String str3 = paramString.substring(paramString.indexOf("]") + 1);
      float f = a((ArrayList)paramn, str1, paramInt + 1);
      if (str1.startsWith("Lambda") && f > 2.0F) {
        paramString = str2 + '\002' + str3;
        continue;
      } 
      paramString = str2 + f + str3;
    } 
    return paramString;
  }
  
  public static float a(ArrayList paramArrayList, String paramString, int paramInt) {
    int i = 1;
    int j = paramString.indexOf("-");
    if (j > 0) {
      String str = paramString.substring(j + 1);
      paramString = paramString.substring(0, j);
      i += Integer.parseInt(str);
    } else if (paramString.indexOf("+") > 0) {
      j = paramString.indexOf("+");
      String str = paramString.substring(j + 1);
      paramString = paramString.substring(0, j);
      i -= Integer.parseInt(str);
    } 
    for (j j1 : paramArrayList) {
      if (j1.a().equals(paramString)) {
        if (paramInt - i < 0)
          return j1.c(0); 
        if (paramInt - i > j1.i() - 1)
          return j1.c(j1.i() - 1); 
        if (paramInt - i >= 0)
          return j1.c(paramInt - i); 
      } 
    } 
    return 0.0F;
  }
  
  public static double a(String paramString) {
    int i = paramString.indexOf("?");
    int j = paramString.indexOf(":");
    if (i > 0 && j > 0) {
      String str1 = paramString.substring(0, i);
      String str2 = paramString.substring(i + 1, j);
      String str3 = paramString.substring(j + 1);
      return c(str1) ? a(str2) : a(str3);
    } 
    String str = paramString;
    if (str.indexOf("Math.") != -1)
      str = n(str); 
    while (str.indexOf("(") != -1) {
      String str1 = str.substring(str.indexOf(")") + 1);
      String str2 = str.substring(str.lastIndexOf("(", str.indexOf(")")) + 1, str.indexOf(")"));
      String str3 = str.substring(0, str.lastIndexOf("(", str.indexOf(")")));
      str = str3 + m(str2) + str1;
    } 
    return m(str);
  }
  
  private static double m(String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: astore_1
    //   2: new java/util/ArrayList
    //   5: dup
    //   6: invokespecial <init> : ()V
    //   9: astore_2
    //   10: dconst_0
    //   11: dstore_3
    //   12: aload_0
    //   13: bipush #43
    //   15: invokevirtual indexOf : (I)I
    //   18: iconst_m1
    //   19: if_icmpgt -> 82
    //   22: aload_0
    //   23: bipush #42
    //   25: invokevirtual indexOf : (I)I
    //   28: iconst_m1
    //   29: if_icmpgt -> 82
    //   32: aload_0
    //   33: bipush #45
    //   35: invokevirtual indexOf : (I)I
    //   38: iconst_m1
    //   39: if_icmpgt -> 82
    //   42: aload_0
    //   43: bipush #47
    //   45: invokevirtual indexOf : (I)I
    //   48: iconst_m1
    //   49: if_icmpgt -> 82
    //   52: aload_0
    //   53: bipush #38
    //   55: invokevirtual indexOf : (I)I
    //   58: iconst_m1
    //   59: if_icmpgt -> 82
    //   62: aload_0
    //   63: bipush #124
    //   65: invokevirtual indexOf : (I)I
    //   68: iconst_m1
    //   69: if_icmpgt -> 82
    //   72: aload_0
    //   73: bipush #94
    //   75: invokevirtual indexOf : (I)I
    //   78: iconst_m1
    //   79: if_icmple -> 501
    //   82: aload_0
    //   83: ldc '+'
    //   85: invokevirtual indexOf : (Ljava/lang/String;)I
    //   88: istore #5
    //   90: aload_0
    //   91: ldc '-'
    //   93: invokevirtual indexOf : (Ljava/lang/String;)I
    //   96: istore #6
    //   98: aload_0
    //   99: ldc '/'
    //   101: invokevirtual indexOf : (Ljava/lang/String;)I
    //   104: istore #7
    //   106: aload_0
    //   107: ldc '*'
    //   109: invokevirtual indexOf : (Ljava/lang/String;)I
    //   112: istore #8
    //   114: aload_0
    //   115: ldc '^'
    //   117: invokevirtual indexOf : (Ljava/lang/String;)I
    //   120: istore #9
    //   122: aload_0
    //   123: ldc '%'
    //   125: invokevirtual indexOf : (Ljava/lang/String;)I
    //   128: istore #10
    //   130: aload_0
    //   131: ldc '&'
    //   133: invokevirtual indexOf : (Ljava/lang/String;)I
    //   136: istore #11
    //   138: aload_0
    //   139: ldc '|'
    //   141: invokevirtual indexOf : (Ljava/lang/String;)I
    //   144: istore #12
    //   146: aload_0
    //   147: invokevirtual length : ()I
    //   150: iconst_1
    //   151: isub
    //   152: istore #13
    //   154: iload #5
    //   156: iconst_m1
    //   157: if_icmpeq -> 172
    //   160: iload #5
    //   162: iload #13
    //   164: if_icmpge -> 172
    //   167: iload #5
    //   169: goto -> 174
    //   172: iload #13
    //   174: istore #13
    //   176: iload #6
    //   178: iconst_m1
    //   179: if_icmpeq -> 194
    //   182: iload #6
    //   184: iload #13
    //   186: if_icmpge -> 194
    //   189: iload #6
    //   191: goto -> 196
    //   194: iload #13
    //   196: istore #13
    //   198: iload #7
    //   200: iconst_m1
    //   201: if_icmpeq -> 216
    //   204: iload #7
    //   206: iload #13
    //   208: if_icmpge -> 216
    //   211: iload #7
    //   213: goto -> 218
    //   216: iload #13
    //   218: istore #13
    //   220: iload #8
    //   222: iconst_m1
    //   223: if_icmpeq -> 238
    //   226: iload #8
    //   228: iload #13
    //   230: if_icmpge -> 238
    //   233: iload #8
    //   235: goto -> 240
    //   238: iload #13
    //   240: istore #13
    //   242: iload #9
    //   244: iconst_m1
    //   245: if_icmpeq -> 260
    //   248: iload #9
    //   250: iload #13
    //   252: if_icmpge -> 260
    //   255: iload #9
    //   257: goto -> 262
    //   260: iload #13
    //   262: istore #13
    //   264: iload #11
    //   266: iconst_m1
    //   267: if_icmpeq -> 282
    //   270: iload #11
    //   272: iload #13
    //   274: if_icmpge -> 282
    //   277: iload #11
    //   279: goto -> 284
    //   282: iload #13
    //   284: istore #13
    //   286: iload #12
    //   288: iconst_m1
    //   289: if_icmpeq -> 304
    //   292: iload #12
    //   294: iload #13
    //   296: if_icmpge -> 304
    //   299: iload #12
    //   301: goto -> 306
    //   304: iload #13
    //   306: istore #13
    //   308: iload #10
    //   310: iconst_m1
    //   311: if_icmpeq -> 326
    //   314: iload #10
    //   316: iload #13
    //   318: if_icmpge -> 326
    //   321: iload #10
    //   323: goto -> 328
    //   326: iload #13
    //   328: istore #13
    //   330: iload #6
    //   332: ifne -> 358
    //   335: new java/lang/StringBuilder
    //   338: dup
    //   339: invokespecial <init> : ()V
    //   342: ldc '0'
    //   344: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   347: aload_0
    //   348: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   351: invokevirtual toString : ()Ljava/lang/String;
    //   354: astore_0
    //   355: iconst_1
    //   356: istore #13
    //   358: iload #13
    //   360: iconst_m1
    //   361: if_icmpne -> 400
    //   364: new V/VInterfaceHotel
    //   367: dup
    //   368: new java/lang/StringBuilder
    //   371: dup
    //   372: invokespecial <init> : ()V
    //   375: ldc 'Invalid formula,'
    //   377: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   380: aload_1
    //   381: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   384: ldc ' \\noperator not found in section '
    //   386: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   389: aload_0
    //   390: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   393: invokevirtual toString : ()Ljava/lang/String;
    //   396: invokespecial <init> : (Ljava/lang/String;)V
    //   399: athrow
    //   400: iload #5
    //   402: ifeq -> 435
    //   405: iload #8
    //   407: ifeq -> 435
    //   410: iload #7
    //   412: ifeq -> 435
    //   415: iload #9
    //   417: ifeq -> 435
    //   420: iload #10
    //   422: ifeq -> 435
    //   425: iload #11
    //   427: ifeq -> 435
    //   430: iload #12
    //   432: ifne -> 462
    //   435: new V/VInterfaceHotel
    //   438: dup
    //   439: new java/lang/StringBuilder
    //   442: dup
    //   443: invokespecial <init> : ()V
    //   446: ldc 'Formula error, 2 operators without value.\\n'
    //   448: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   451: aload_1
    //   452: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   455: invokevirtual toString : ()Ljava/lang/String;
    //   458: invokespecial <init> : (Ljava/lang/String;)V
    //   461: athrow
    //   462: aload_2
    //   463: aload_0
    //   464: iconst_0
    //   465: iload #13
    //   467: invokevirtual substring : (II)Ljava/lang/String;
    //   470: invokevirtual add : (Ljava/lang/Object;)Z
    //   473: pop
    //   474: aload_2
    //   475: aload_0
    //   476: iload #13
    //   478: iload #13
    //   480: iconst_1
    //   481: iadd
    //   482: invokevirtual substring : (II)Ljava/lang/String;
    //   485: invokevirtual add : (Ljava/lang/Object;)Z
    //   488: pop
    //   489: aload_0
    //   490: iload #13
    //   492: iconst_1
    //   493: iadd
    //   494: invokevirtual substring : (I)Ljava/lang/String;
    //   497: astore_0
    //   498: goto -> 12
    //   501: aload_2
    //   502: aload_0
    //   503: invokevirtual add : (Ljava/lang/Object;)Z
    //   506: pop
    //   507: aconst_null
    //   508: astore #5
    //   510: dconst_0
    //   511: dstore #6
    //   513: iconst_0
    //   514: istore #8
    //   516: iload #8
    //   518: aload_2
    //   519: invokevirtual size : ()I
    //   522: if_icmpge -> 862
    //   525: iload #8
    //   527: ifne -> 627
    //   530: aload_2
    //   531: iload #8
    //   533: invokevirtual get : (I)Ljava/lang/Object;
    //   536: ifnull -> 572
    //   539: aload_2
    //   540: iload #8
    //   542: invokevirtual get : (I)Ljava/lang/Object;
    //   545: checkcast java/lang/String
    //   548: invokevirtual trim : ()Ljava/lang/String;
    //   551: ldc ''
    //   553: invokevirtual equals : (Ljava/lang/Object;)Z
    //   556: ifne -> 572
    //   559: aload_2
    //   560: iload #8
    //   562: invokevirtual get : (I)Ljava/lang/Object;
    //   565: checkcast java/lang/String
    //   568: invokestatic e : (Ljava/lang/String;)D
    //   571: dstore_3
    //   572: goto -> 856
    //   575: astore #9
    //   577: aload #9
    //   579: invokevirtual printStackTrace : ()V
    //   582: new V/VInterfaceHotel
    //   585: dup
    //   586: new java/lang/StringBuilder
    //   589: dup
    //   590: invokespecial <init> : ()V
    //   593: ldc 'Invalid Formula value '
    //   595: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   598: aload_2
    //   599: iload #8
    //   601: invokevirtual get : (I)Ljava/lang/Object;
    //   604: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   607: ldc ', Generated Exception '
    //   609: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   612: aload #9
    //   614: invokevirtual getMessage : ()Ljava/lang/String;
    //   617: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   620: invokevirtual toString : ()Ljava/lang/String;
    //   623: invokespecial <init> : (Ljava/lang/String;)V
    //   626: athrow
    //   627: iload #8
    //   629: iconst_2
    //   630: irem
    //   631: ifeq -> 648
    //   634: aload_2
    //   635: iload #8
    //   637: invokevirtual get : (I)Ljava/lang/Object;
    //   640: checkcast java/lang/String
    //   643: astore #5
    //   645: goto -> 856
    //   648: aload_2
    //   649: iload #8
    //   651: invokevirtual get : (I)Ljava/lang/Object;
    //   654: checkcast java/lang/String
    //   657: invokestatic e : (Ljava/lang/String;)D
    //   660: dstore #6
    //   662: goto -> 667
    //   665: astore #9
    //   667: aload #5
    //   669: ifnull -> 690
    //   672: aload #5
    //   674: ldc '+'
    //   676: invokevirtual equals : (Ljava/lang/Object;)Z
    //   679: ifeq -> 690
    //   682: dload_3
    //   683: dload #6
    //   685: dadd
    //   686: dstore_3
    //   687: goto -> 856
    //   690: aload #5
    //   692: ifnull -> 713
    //   695: aload #5
    //   697: ldc '*'
    //   699: invokevirtual equals : (Ljava/lang/Object;)Z
    //   702: ifeq -> 713
    //   705: dload_3
    //   706: dload #6
    //   708: dmul
    //   709: dstore_3
    //   710: goto -> 856
    //   713: aload #5
    //   715: ifnull -> 736
    //   718: aload #5
    //   720: ldc '/'
    //   722: invokevirtual equals : (Ljava/lang/Object;)Z
    //   725: ifeq -> 736
    //   728: dload_3
    //   729: dload #6
    //   731: ddiv
    //   732: dstore_3
    //   733: goto -> 856
    //   736: aload #5
    //   738: ifnull -> 759
    //   741: aload #5
    //   743: ldc '-'
    //   745: invokevirtual equals : (Ljava/lang/Object;)Z
    //   748: ifeq -> 759
    //   751: dload_3
    //   752: dload #6
    //   754: dsub
    //   755: dstore_3
    //   756: goto -> 856
    //   759: aload #5
    //   761: ifnull -> 784
    //   764: aload #5
    //   766: ldc '^'
    //   768: invokevirtual equals : (Ljava/lang/Object;)Z
    //   771: ifeq -> 784
    //   774: dload_3
    //   775: dload #6
    //   777: invokestatic pow : (DD)D
    //   780: dstore_3
    //   781: goto -> 856
    //   784: aload #5
    //   786: ifnull -> 807
    //   789: aload #5
    //   791: ldc '%'
    //   793: invokevirtual equals : (Ljava/lang/Object;)Z
    //   796: ifeq -> 807
    //   799: dload_3
    //   800: dload #6
    //   802: drem
    //   803: dstore_3
    //   804: goto -> 856
    //   807: aload #5
    //   809: ifnull -> 833
    //   812: aload #5
    //   814: ldc '&'
    //   816: invokevirtual equals : (Ljava/lang/Object;)Z
    //   819: ifeq -> 833
    //   822: dload_3
    //   823: d2i
    //   824: dload #6
    //   826: d2i
    //   827: iand
    //   828: i2d
    //   829: dstore_3
    //   830: goto -> 856
    //   833: aload #5
    //   835: ifnull -> 856
    //   838: aload #5
    //   840: ldc '|'
    //   842: invokevirtual equals : (Ljava/lang/Object;)Z
    //   845: ifeq -> 856
    //   848: dload_3
    //   849: d2i
    //   850: dload #6
    //   852: d2i
    //   853: ior
    //   854: i2d
    //   855: dstore_3
    //   856: iinc #8, 1
    //   859: goto -> 516
    //   862: dload_3
    //   863: dreturn
    // Exception table:
    //   from	to	target	type
    //   530	572	575	java/lang/Exception
    //   648	662	665	java/lang/Exception
  }
  
  public static boolean b(String paramString) {
    if (paramString.indexOf("true") != -1 || paramString.indexOf("false") != -1) {
      paramString = X.b(paramString, "true", "1");
      paramString = X.b(paramString, "false", "0");
    } 
    int i = paramString.indexOf("==");
    i = (i > 0) ? i : paramString.indexOf("!=");
    i = (i > 0) ? i : paramString.indexOf("<=");
    i = (i > 0) ? i : paramString.indexOf(">=");
    if (i > 0) {
      try {
        double d1 = a(paramString.substring(0, i).trim());
        double d2 = a(paramString.substring(i + 2).trim());
        if (paramString.indexOf("==") != -1)
          return (d1 == d2); 
        if (paramString.indexOf("!=") != -1)
          return (d1 != d2); 
        if (paramString.indexOf("<=") != -1)
          return (d1 <= d2); 
        if (paramString.indexOf(">=") != -1)
          return (d1 >= d2); 
      } catch (Exception exception) {
        throw new VInterfaceHotel("Unable to resolve condition for expression: " + paramString);
      } 
    } else {
      i = paramString.indexOf("&");
      i = (i > 0) ? i : paramString.indexOf(">");
      i = (i > 0) ? i : paramString.indexOf("<");
      i = (i > 0) ? i : paramString.indexOf("=");
      if (i > 0) {
        double d1 = a(paramString.substring(0, i).trim());
        double d2 = a(paramString.substring(i + 1).trim());
        if (paramString.indexOf("&") > 0) {
          int j = (int)((d1 <= d2) ? d1 : d2);
          return (j == 0) ? false : ((((int)d1 & (int)d2) == j));
        } 
        if (paramString.indexOf("=") > 0)
          return (d1 == d2); 
        if (paramString.indexOf("<") > 0)
          return (d1 < d2); 
        if (paramString.indexOf(">") > 0)
          return (d1 > d2); 
      } else {
        if (d(paramString))
          return (a(paramString) != 0.0D); 
        double d = 0.0D;
        try {
          boolean bool = (paramString.indexOf("!") != -1) ? true : false;
          String str = X.b(paramString.substring(0, paramString.length()).trim(), "!", "");
          d = e(str);
          return bool ? ((d <= 0.0D)) : ((d > 0.0D));
        } catch (Exception exception) {
          throw new VInterfaceHotel("Error evaluating condition:" + paramString + ", false returned");
        } 
      } 
    } 
    return false;
  }
  
  public static boolean c(String paramString) {
    String str = paramString;
    if (str.indexOf("Math.") != -1)
      str = n(str); 
    while (str.indexOf("(") != -1) {
      String str1 = str.substring(str.indexOf(")") + 1);
      String str2 = str.substring(str.lastIndexOf("(", str.indexOf(")")) + 1, str.indexOf(")"));
      String str3 = str.substring(0, str.lastIndexOf("(", str.indexOf(")")));
      str2 = c(str2) + "";
      str = str3 + str2 + str1;
    } 
    paramString = str;
    int i = paramString.indexOf("&&");
    if (i > 0) {
      StringTokenizer stringTokenizer = new StringTokenizer(paramString, "&&");
      while (stringTokenizer.hasMoreTokens()) {
        if (!c(stringTokenizer.nextToken()))
          return false; 
      } 
      return true;
    } 
    i = paramString.indexOf("||");
    if (i > 0) {
      StringTokenizer stringTokenizer = new StringTokenizer(paramString, "||");
      while (stringTokenizer.hasMoreTokens()) {
        if (c(stringTokenizer.nextToken()))
          return true; 
      } 
      return false;
    } 
    return b(paramString);
  }
  
  public static boolean d(String paramString) {
    String str = "+&|-*/";
    for (byte b = 0; b < str.length(); b++) {
      if (paramString.indexOf(str.charAt(b)) > 1)
        return true; 
    } 
    return false;
  }
  
  public static double e(String paramString) {
    if (paramString.indexOf("0x") != -1) {
      paramString = X.b(paramString, "0x", "");
      paramString = Integer.valueOf(paramString, 16).toString();
    } else if (paramString.indexOf("0b") != -1) {
      paramString = X.b(paramString, "0b", "");
      paramString = Integer.valueOf(paramString, 2).toString();
    } 
    return Double.parseDouble(paramString);
  }
  
  public static String a(String paramString1, String paramString2) {
    String str = "" + a(paramString1);
    int i = str.indexOf('.');
    if (i != -1 && str.length() - i > 3)
      str = str.substring(0, i + 4); 
    return str;
  }
  
  private static String n(String paramString) {
    while (paramString.indexOf("Math.") != -1) {
      String str1 = paramString.substring(0, paramString.indexOf("Math."));
      int i = paramString.indexOf("Math.");
      int j = a(paramString, i);
      String str2 = paramString.substring(i, j);
      String str3 = paramString.substring(j);
      paramString = str1 + o(str2) + str3;
    } 
    return paramString;
  }
  
  public static boolean f(String paramString) {
    try {
      double d = e(paramString);
      return true;
    } catch (Exception exception) {
      return false;
    } 
  }
  
  private static double o(String paramString) {
    if (paramString.indexOf("(") == -1)
      for (int i = paramString.length() - 1; i > 0; i--) {
        if (!f(paramString.charAt(i) + "")) {
          paramString = paramString.substring(0, i + 1) + "(" + paramString.substring(i + 1) + ")";
          break;
        } 
      }  
    String str = paramString.substring(paramString.indexOf('.') + 1, paramString.indexOf('('));
    double d = a(paramString.substring(paramString.indexOf('('), paramString.length()));
    if (str.equals("log"))
      return (d < 0.0D) ? 0.0D : Math.log(d); 
    if (str.equals("sin"))
      return Math.sin(d); 
    if (str.equals("cos"))
      return Math.cos(d); 
    if (str.equals("tan"))
      return Math.tan(d); 
    if (str.equals("atan"))
      return Math.atan(d); 
    if (str.equals("asin"))
      return Math.asin(d); 
    if (str.equals("acos"))
      return Math.asin(d); 
    if (str.equals("abs"))
      return Math.abs(d); 
    if (str.equals("sqrt"))
      return Math.sqrt(d); 
    throw new VInterfaceHotel("Unsupported Math function " + str);
  }
  
  private static int a(String paramString, int paramInt) {
    byte b1 = 0;
    byte b2 = 0;
    int i;
    for (i = paramInt; i < paramString.length() && (!b1 || b1 != b2); i++) {
      if (paramString.charAt(i) == '(')
        b1++; 
      if (paramString.charAt(i) == ')')
        b2++; 
    } 
    return i;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/g/e.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */