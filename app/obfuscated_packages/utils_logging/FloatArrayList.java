package bH;

import V.h;
import java.util.StringTokenizer;

public class G {
  public static double g(String paramString) {
    if (paramString.indexOf("Math.") != -1)
      paramString = b(paramString); 
    int i = paramString.indexOf("||");
    int j = paramString.indexOf("&&");
    if (i != -1 || j != -1)
      paramString = d(paramString); 
    while (paramString.indexOf("(") != -1) {
      String str1 = paramString.substring(paramString.indexOf(")") + 1);
      String str2 = paramString.substring(paramString.lastIndexOf("(", paramString.indexOf(")")) + 1, paramString.indexOf(")"));
      String str3 = paramString.substring(0, paramString.lastIndexOf("(", paramString.indexOf(")")));
      paramString = str3 + g(str2) + str1;
    } 
    int k = paramString.indexOf("?");
    int m = paramString.indexOf(":");
    if (k > 0 && m > 0) {
      String str1 = paramString.substring(0, k);
      String str2 = paramString.substring(k + 1, m);
      String str3 = paramString.substring(m + 1);
      return i(str1) ? g(str2) : g(str3);
    } 
    return a(paramString);
  }
  
  private static double a(String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: astore_1
    //   2: aload_0
    //   3: ldc '!='
    //   5: ldc '$'
    //   7: invokestatic b : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   10: astore_0
    //   11: aload_0
    //   12: ldc '=='
    //   14: ldc '='
    //   16: invokestatic b : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   19: astore_0
    //   20: aload_0
    //   21: ldc '||'
    //   23: ldc '|'
    //   25: invokestatic b : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   28: astore_0
    //   29: aload_0
    //   30: ldc '&&'
    //   32: ldc '&'
    //   34: invokestatic b : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   37: astore_0
    //   38: aload_0
    //   39: ldc '>='
    //   41: ldc '#'
    //   43: invokestatic b : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   46: astore_0
    //   47: aload_0
    //   48: ldc '<='
    //   50: ldc '@'
    //   52: invokestatic b : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   55: astore_0
    //   56: new java/util/ArrayList
    //   59: dup
    //   60: invokespecial <init> : ()V
    //   63: astore_2
    //   64: dconst_0
    //   65: dstore_3
    //   66: aload_0
    //   67: bipush #43
    //   69: invokevirtual indexOf : (I)I
    //   72: iconst_m1
    //   73: if_icmpgt -> 236
    //   76: aload_0
    //   77: bipush #42
    //   79: invokevirtual indexOf : (I)I
    //   82: iconst_m1
    //   83: if_icmpgt -> 236
    //   86: aload_0
    //   87: bipush #45
    //   89: invokevirtual indexOf : (I)I
    //   92: iconst_m1
    //   93: if_icmpgt -> 236
    //   96: aload_0
    //   97: bipush #47
    //   99: invokevirtual indexOf : (I)I
    //   102: iconst_m1
    //   103: if_icmpgt -> 236
    //   106: aload_0
    //   107: bipush #38
    //   109: invokevirtual indexOf : (I)I
    //   112: iconst_m1
    //   113: if_icmpgt -> 236
    //   116: aload_0
    //   117: bipush #124
    //   119: invokevirtual indexOf : (I)I
    //   122: iconst_m1
    //   123: if_icmpgt -> 236
    //   126: aload_0
    //   127: bipush #94
    //   129: invokevirtual indexOf : (I)I
    //   132: iconst_m1
    //   133: if_icmpgt -> 236
    //   136: aload_0
    //   137: bipush #37
    //   139: invokevirtual indexOf : (I)I
    //   142: iconst_m1
    //   143: if_icmpgt -> 236
    //   146: aload_0
    //   147: bipush #60
    //   149: invokevirtual indexOf : (I)I
    //   152: iconst_m1
    //   153: if_icmpgt -> 236
    //   156: aload_0
    //   157: bipush #62
    //   159: invokevirtual indexOf : (I)I
    //   162: iconst_m1
    //   163: if_icmpgt -> 236
    //   166: aload_0
    //   167: ldc '='
    //   169: invokevirtual indexOf : (Ljava/lang/String;)I
    //   172: iconst_m1
    //   173: if_icmpgt -> 236
    //   176: aload_0
    //   177: ldc '$'
    //   179: invokevirtual indexOf : (Ljava/lang/String;)I
    //   182: iconst_m1
    //   183: if_icmpgt -> 236
    //   186: aload_0
    //   187: ldc '@'
    //   189: invokevirtual indexOf : (Ljava/lang/String;)I
    //   192: iconst_m1
    //   193: if_icmpgt -> 236
    //   196: aload_0
    //   197: ldc '#'
    //   199: invokevirtual indexOf : (Ljava/lang/String;)I
    //   202: iconst_m1
    //   203: if_icmpgt -> 236
    //   206: aload_0
    //   207: ldc '~'
    //   209: invokevirtual indexOf : (Ljava/lang/String;)I
    //   212: iconst_m1
    //   213: if_icmpgt -> 236
    //   216: aload_0
    //   217: ldc '`'
    //   219: invokevirtual indexOf : (Ljava/lang/String;)I
    //   222: iconst_m1
    //   223: if_icmpgt -> 236
    //   226: aload_0
    //   227: ldc '!'
    //   229: invokevirtual indexOf : (Ljava/lang/String;)I
    //   232: iconst_m1
    //   233: if_icmple -> 928
    //   236: aload_0
    //   237: ldc '+'
    //   239: invokevirtual indexOf : (Ljava/lang/String;)I
    //   242: istore #5
    //   244: aload_0
    //   245: ldc '-'
    //   247: invokevirtual indexOf : (Ljava/lang/String;)I
    //   250: istore #6
    //   252: aload_0
    //   253: ldc '/'
    //   255: invokevirtual indexOf : (Ljava/lang/String;)I
    //   258: istore #7
    //   260: aload_0
    //   261: ldc '*'
    //   263: invokevirtual indexOf : (Ljava/lang/String;)I
    //   266: istore #8
    //   268: aload_0
    //   269: ldc '^'
    //   271: invokevirtual indexOf : (Ljava/lang/String;)I
    //   274: istore #9
    //   276: aload_0
    //   277: ldc '%'
    //   279: invokevirtual indexOf : (Ljava/lang/String;)I
    //   282: istore #10
    //   284: aload_0
    //   285: ldc '&'
    //   287: invokevirtual indexOf : (Ljava/lang/String;)I
    //   290: istore #11
    //   292: aload_0
    //   293: ldc '|'
    //   295: invokevirtual indexOf : (Ljava/lang/String;)I
    //   298: istore #12
    //   300: aload_0
    //   301: ldc '>'
    //   303: invokevirtual indexOf : (Ljava/lang/String;)I
    //   306: istore #13
    //   308: aload_0
    //   309: ldc '<'
    //   311: invokevirtual indexOf : (Ljava/lang/String;)I
    //   314: istore #14
    //   316: aload_0
    //   317: ldc '='
    //   319: invokevirtual indexOf : (Ljava/lang/String;)I
    //   322: istore #15
    //   324: aload_0
    //   325: ldc '$'
    //   327: invokevirtual indexOf : (Ljava/lang/String;)I
    //   330: istore #16
    //   332: aload_0
    //   333: ldc '#'
    //   335: invokevirtual indexOf : (Ljava/lang/String;)I
    //   338: istore #17
    //   340: aload_0
    //   341: ldc '@'
    //   343: invokevirtual indexOf : (Ljava/lang/String;)I
    //   346: istore #18
    //   348: aload_0
    //   349: ldc '!'
    //   351: invokevirtual indexOf : (Ljava/lang/String;)I
    //   354: istore #19
    //   356: aload_0
    //   357: ldc '~'
    //   359: invokevirtual indexOf : (Ljava/lang/String;)I
    //   362: istore #20
    //   364: aload_0
    //   365: ldc '`'
    //   367: invokevirtual indexOf : (Ljava/lang/String;)I
    //   370: istore #21
    //   372: aload_0
    //   373: invokevirtual length : ()I
    //   376: istore #22
    //   378: iload #5
    //   380: iconst_m1
    //   381: if_icmpeq -> 396
    //   384: iload #5
    //   386: iload #22
    //   388: if_icmpge -> 396
    //   391: iload #5
    //   393: goto -> 398
    //   396: iload #22
    //   398: istore #22
    //   400: iload #6
    //   402: iconst_m1
    //   403: if_icmpeq -> 423
    //   406: iload #6
    //   408: iload #22
    //   410: if_icmpge -> 423
    //   413: iload #6
    //   415: ifle -> 423
    //   418: iload #6
    //   420: goto -> 425
    //   423: iload #22
    //   425: istore #22
    //   427: iload #7
    //   429: iconst_m1
    //   430: if_icmpeq -> 445
    //   433: iload #7
    //   435: iload #22
    //   437: if_icmpge -> 445
    //   440: iload #7
    //   442: goto -> 447
    //   445: iload #22
    //   447: istore #22
    //   449: iload #8
    //   451: iconst_m1
    //   452: if_icmpeq -> 467
    //   455: iload #8
    //   457: iload #22
    //   459: if_icmpge -> 467
    //   462: iload #8
    //   464: goto -> 469
    //   467: iload #22
    //   469: istore #22
    //   471: iload #9
    //   473: iconst_m1
    //   474: if_icmpeq -> 489
    //   477: iload #9
    //   479: iload #22
    //   481: if_icmpge -> 489
    //   484: iload #9
    //   486: goto -> 491
    //   489: iload #22
    //   491: istore #22
    //   493: iload #11
    //   495: iconst_m1
    //   496: if_icmpeq -> 511
    //   499: iload #11
    //   501: iload #22
    //   503: if_icmpge -> 511
    //   506: iload #11
    //   508: goto -> 513
    //   511: iload #22
    //   513: istore #22
    //   515: iload #12
    //   517: iconst_m1
    //   518: if_icmpeq -> 533
    //   521: iload #12
    //   523: iload #22
    //   525: if_icmpge -> 533
    //   528: iload #12
    //   530: goto -> 535
    //   533: iload #22
    //   535: istore #22
    //   537: iload #10
    //   539: iconst_m1
    //   540: if_icmpeq -> 555
    //   543: iload #10
    //   545: iload #22
    //   547: if_icmpge -> 555
    //   550: iload #10
    //   552: goto -> 557
    //   555: iload #22
    //   557: istore #22
    //   559: iload #14
    //   561: iconst_m1
    //   562: if_icmpeq -> 577
    //   565: iload #14
    //   567: iload #22
    //   569: if_icmpge -> 577
    //   572: iload #14
    //   574: goto -> 579
    //   577: iload #22
    //   579: istore #22
    //   581: iload #13
    //   583: iconst_m1
    //   584: if_icmpeq -> 599
    //   587: iload #13
    //   589: iload #22
    //   591: if_icmpge -> 599
    //   594: iload #13
    //   596: goto -> 601
    //   599: iload #22
    //   601: istore #22
    //   603: iload #15
    //   605: iconst_m1
    //   606: if_icmpeq -> 621
    //   609: iload #15
    //   611: iload #22
    //   613: if_icmpge -> 621
    //   616: iload #15
    //   618: goto -> 623
    //   621: iload #22
    //   623: istore #22
    //   625: iload #16
    //   627: iconst_m1
    //   628: if_icmpeq -> 643
    //   631: iload #16
    //   633: iload #22
    //   635: if_icmpge -> 643
    //   638: iload #16
    //   640: goto -> 645
    //   643: iload #22
    //   645: istore #22
    //   647: iload #17
    //   649: iconst_m1
    //   650: if_icmpeq -> 665
    //   653: iload #17
    //   655: iload #22
    //   657: if_icmpge -> 665
    //   660: iload #17
    //   662: goto -> 667
    //   665: iload #22
    //   667: istore #22
    //   669: iload #18
    //   671: iconst_m1
    //   672: if_icmpeq -> 687
    //   675: iload #18
    //   677: iload #22
    //   679: if_icmpge -> 687
    //   682: iload #18
    //   684: goto -> 689
    //   687: iload #22
    //   689: istore #22
    //   691: iload #19
    //   693: iconst_m1
    //   694: if_icmpeq -> 709
    //   697: iload #19
    //   699: iload #22
    //   701: if_icmpge -> 709
    //   704: iload #19
    //   706: goto -> 711
    //   709: iload #22
    //   711: istore #22
    //   713: iload #20
    //   715: iconst_m1
    //   716: if_icmpeq -> 731
    //   719: iload #20
    //   721: iload #22
    //   723: if_icmpge -> 731
    //   726: iload #20
    //   728: goto -> 733
    //   731: iload #22
    //   733: istore #22
    //   735: iload #21
    //   737: iconst_m1
    //   738: if_icmpeq -> 753
    //   741: iload #21
    //   743: iload #22
    //   745: if_icmpge -> 753
    //   748: iload #21
    //   750: goto -> 755
    //   753: iload #22
    //   755: istore #22
    //   757: iload #22
    //   759: iconst_m1
    //   760: if_icmpne -> 799
    //   763: new V/h
    //   766: dup
    //   767: new java/lang/StringBuilder
    //   770: dup
    //   771: invokespecial <init> : ()V
    //   774: ldc 'Invalid formula,'
    //   776: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   779: aload_1
    //   780: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   783: ldc ' \\noperator not found in section '
    //   785: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   788: aload_0
    //   789: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   792: invokevirtual toString : ()Ljava/lang/String;
    //   795: invokespecial <init> : (Ljava/lang/String;)V
    //   798: athrow
    //   799: iload #5
    //   801: ifeq -> 844
    //   804: iload #8
    //   806: ifeq -> 844
    //   809: iload #7
    //   811: ifeq -> 844
    //   814: iload #9
    //   816: ifeq -> 844
    //   819: iload #10
    //   821: ifeq -> 844
    //   824: iload #11
    //   826: ifeq -> 844
    //   829: iload #12
    //   831: ifeq -> 844
    //   834: iload #20
    //   836: ifeq -> 844
    //   839: iload #21
    //   841: ifne -> 871
    //   844: new V/h
    //   847: dup
    //   848: new java/lang/StringBuilder
    //   851: dup
    //   852: invokespecial <init> : ()V
    //   855: ldc 'Formula error, 2 operators without value.\\n'
    //   857: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   860: aload_1
    //   861: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   864: invokevirtual toString : ()Ljava/lang/String;
    //   867: invokespecial <init> : (Ljava/lang/String;)V
    //   870: athrow
    //   871: aload_2
    //   872: aload_0
    //   873: iconst_0
    //   874: iload #22
    //   876: invokevirtual substring : (II)Ljava/lang/String;
    //   879: invokevirtual add : (Ljava/lang/Object;)Z
    //   882: pop
    //   883: aload_0
    //   884: invokevirtual length : ()I
    //   887: iload #22
    //   889: if_icmple -> 922
    //   892: aload_2
    //   893: aload_0
    //   894: iload #22
    //   896: iload #22
    //   898: iconst_1
    //   899: iadd
    //   900: invokevirtual substring : (II)Ljava/lang/String;
    //   903: invokevirtual add : (Ljava/lang/Object;)Z
    //   906: pop
    //   907: aload_0
    //   908: iload #22
    //   910: iconst_1
    //   911: iadd
    //   912: invokevirtual substring : (I)Ljava/lang/String;
    //   915: invokevirtual trim : ()Ljava/lang/String;
    //   918: astore_0
    //   919: goto -> 925
    //   922: ldc ''
    //   924: astore_0
    //   925: goto -> 66
    //   928: aload_2
    //   929: aload_0
    //   930: invokevirtual add : (Ljava/lang/Object;)Z
    //   933: pop
    //   934: aconst_null
    //   935: astore #5
    //   937: dconst_0
    //   938: dstore #6
    //   940: iconst_0
    //   941: istore #8
    //   943: iload #8
    //   945: aload_2
    //   946: invokevirtual size : ()I
    //   949: if_icmpge -> 1757
    //   952: iload #8
    //   954: ifne -> 1063
    //   957: aload_2
    //   958: iload #8
    //   960: invokevirtual get : (I)Ljava/lang/Object;
    //   963: ifnull -> 999
    //   966: aload_2
    //   967: iload #8
    //   969: invokevirtual get : (I)Ljava/lang/Object;
    //   972: checkcast java/lang/String
    //   975: invokevirtual trim : ()Ljava/lang/String;
    //   978: ldc ''
    //   980: invokevirtual equals : (Ljava/lang/Object;)Z
    //   983: ifne -> 999
    //   986: aload_2
    //   987: iload #8
    //   989: invokevirtual get : (I)Ljava/lang/Object;
    //   992: checkcast java/lang/String
    //   995: invokestatic k : (Ljava/lang/String;)D
    //   998: dstore_3
    //   999: goto -> 1751
    //   1002: astore #9
    //   1004: aload #9
    //   1006: invokevirtual printStackTrace : ()V
    //   1009: new V/h
    //   1012: dup
    //   1013: new java/lang/StringBuilder
    //   1016: dup
    //   1017: invokespecial <init> : ()V
    //   1020: ldc 'Invalid Formula value '
    //   1022: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1025: aload_2
    //   1026: iload #8
    //   1028: invokevirtual get : (I)Ljava/lang/Object;
    //   1031: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   1034: ldc ', Generated Exception '
    //   1036: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1039: aload #9
    //   1041: invokevirtual getMessage : ()Ljava/lang/String;
    //   1044: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1047: ldc ', Original formula:'
    //   1049: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1052: aload_1
    //   1053: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1056: invokevirtual toString : ()Ljava/lang/String;
    //   1059: invokespecial <init> : (Ljava/lang/String;)V
    //   1062: athrow
    //   1063: iload #8
    //   1065: iconst_2
    //   1066: irem
    //   1067: ifeq -> 1084
    //   1070: aload_2
    //   1071: iload #8
    //   1073: invokevirtual get : (I)Ljava/lang/Object;
    //   1076: checkcast java/lang/String
    //   1079: astore #5
    //   1081: goto -> 1751
    //   1084: aload_2
    //   1085: iload #8
    //   1087: invokevirtual get : (I)Ljava/lang/Object;
    //   1090: checkcast java/lang/String
    //   1093: invokestatic k : (Ljava/lang/String;)D
    //   1096: dstore #6
    //   1098: goto -> 1271
    //   1101: astore #9
    //   1103: aload_2
    //   1104: iload #8
    //   1106: invokevirtual get : (I)Ljava/lang/Object;
    //   1109: checkcast java/lang/String
    //   1112: astore #10
    //   1114: aload #10
    //   1116: ldc 'E'
    //   1118: invokevirtual endsWith : (Ljava/lang/String;)Z
    //   1121: ifeq -> 1216
    //   1124: aload_2
    //   1125: invokevirtual size : ()I
    //   1128: iconst_3
    //   1129: if_icmple -> 1216
    //   1132: aload #10
    //   1134: iconst_0
    //   1135: aload #10
    //   1137: invokevirtual length : ()I
    //   1140: iconst_1
    //   1141: isub
    //   1142: invokevirtual substring : (II)Ljava/lang/String;
    //   1145: astore #10
    //   1147: iinc #8, 1
    //   1150: aload_2
    //   1151: iload #8
    //   1153: invokevirtual get : (I)Ljava/lang/Object;
    //   1156: checkcast java/lang/String
    //   1159: astore #11
    //   1161: iinc #8, 1
    //   1164: aload_2
    //   1165: iload #8
    //   1167: invokevirtual get : (I)Ljava/lang/Object;
    //   1170: checkcast java/lang/String
    //   1173: invokestatic parseDouble : (Ljava/lang/String;)D
    //   1176: dstore #12
    //   1178: aload #11
    //   1180: ldc '-'
    //   1182: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1185: ifeq -> 1196
    //   1188: dload #12
    //   1190: ldc2_w -1.0
    //   1193: dmul
    //   1194: dstore #12
    //   1196: aload #10
    //   1198: invokestatic parseDouble : (Ljava/lang/String;)D
    //   1201: dstore #14
    //   1203: dload #14
    //   1205: ldc2_w 10.0
    //   1208: dload #12
    //   1210: invokestatic pow : (DD)D
    //   1213: dmul
    //   1214: dstore #6
    //   1216: goto -> 1271
    //   1219: astore #10
    //   1221: new java/lang/StringBuilder
    //   1224: dup
    //   1225: invokespecial <init> : ()V
    //   1228: ldc 'Failed to get value for:'
    //   1230: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1233: aload_2
    //   1234: iload #8
    //   1236: invokevirtual get : (I)Ljava/lang/Object;
    //   1239: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   1242: ldc ', in formula:'
    //   1244: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1247: aload_0
    //   1248: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1251: invokevirtual toString : ()Ljava/lang/String;
    //   1254: astore #11
    //   1256: aload #11
    //   1258: invokestatic b : (Ljava/lang/String;)V
    //   1261: new V/h
    //   1264: dup
    //   1265: aload #11
    //   1267: invokespecial <init> : (Ljava/lang/String;)V
    //   1270: athrow
    //   1271: aload #5
    //   1273: ifnull -> 1294
    //   1276: aload #5
    //   1278: ldc '+'
    //   1280: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1283: ifeq -> 1294
    //   1286: dload_3
    //   1287: dload #6
    //   1289: dadd
    //   1290: dstore_3
    //   1291: goto -> 1751
    //   1294: aload #5
    //   1296: ifnull -> 1317
    //   1299: aload #5
    //   1301: ldc '*'
    //   1303: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1306: ifeq -> 1317
    //   1309: dload_3
    //   1310: dload #6
    //   1312: dmul
    //   1313: dstore_3
    //   1314: goto -> 1751
    //   1317: aload #5
    //   1319: ifnull -> 1340
    //   1322: aload #5
    //   1324: ldc '/'
    //   1326: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1329: ifeq -> 1340
    //   1332: dload_3
    //   1333: dload #6
    //   1335: ddiv
    //   1336: dstore_3
    //   1337: goto -> 1751
    //   1340: aload #5
    //   1342: ifnull -> 1363
    //   1345: aload #5
    //   1347: ldc '-'
    //   1349: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1352: ifeq -> 1363
    //   1355: dload_3
    //   1356: dload #6
    //   1358: dsub
    //   1359: dstore_3
    //   1360: goto -> 1751
    //   1363: aload #5
    //   1365: ifnull -> 1388
    //   1368: aload #5
    //   1370: ldc '^'
    //   1372: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1375: ifeq -> 1388
    //   1378: dload_3
    //   1379: dload #6
    //   1381: invokestatic pow : (DD)D
    //   1384: dstore_3
    //   1385: goto -> 1751
    //   1388: aload #5
    //   1390: ifnull -> 1411
    //   1393: aload #5
    //   1395: ldc '%'
    //   1397: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1400: ifeq -> 1411
    //   1403: dload_3
    //   1404: dload #6
    //   1406: drem
    //   1407: dstore_3
    //   1408: goto -> 1751
    //   1411: aload #5
    //   1413: ifnull -> 1437
    //   1416: aload #5
    //   1418: ldc '&'
    //   1420: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1423: ifeq -> 1437
    //   1426: dload_3
    //   1427: d2i
    //   1428: dload #6
    //   1430: d2i
    //   1431: iand
    //   1432: i2d
    //   1433: dstore_3
    //   1434: goto -> 1751
    //   1437: aload #5
    //   1439: ifnull -> 1463
    //   1442: aload #5
    //   1444: ldc '|'
    //   1446: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1449: ifeq -> 1463
    //   1452: dload_3
    //   1453: d2i
    //   1454: dload #6
    //   1456: d2i
    //   1457: ior
    //   1458: i2d
    //   1459: dstore_3
    //   1460: goto -> 1751
    //   1463: aload #5
    //   1465: ifnull -> 1500
    //   1468: aload #5
    //   1470: ldc '~'
    //   1472: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1475: ifeq -> 1500
    //   1478: dload_3
    //   1479: dconst_0
    //   1480: dcmpl
    //   1481: ifeq -> 1495
    //   1484: dload #6
    //   1486: dconst_0
    //   1487: dcmpl
    //   1488: ifeq -> 1495
    //   1491: dconst_1
    //   1492: goto -> 1496
    //   1495: dconst_0
    //   1496: dstore_3
    //   1497: goto -> 1751
    //   1500: aload #5
    //   1502: ifnull -> 1537
    //   1505: aload #5
    //   1507: ldc '`'
    //   1509: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1512: ifeq -> 1537
    //   1515: dload_3
    //   1516: dconst_0
    //   1517: dcmpl
    //   1518: ifne -> 1528
    //   1521: dload #6
    //   1523: dconst_0
    //   1524: dcmpl
    //   1525: ifeq -> 1532
    //   1528: dconst_1
    //   1529: goto -> 1533
    //   1532: dconst_0
    //   1533: dstore_3
    //   1534: goto -> 1751
    //   1537: aload #5
    //   1539: ifnull -> 1568
    //   1542: aload #5
    //   1544: ldc '>'
    //   1546: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1549: ifeq -> 1568
    //   1552: dload_3
    //   1553: dload #6
    //   1555: dcmpl
    //   1556: ifle -> 1563
    //   1559: dconst_1
    //   1560: goto -> 1564
    //   1563: dconst_0
    //   1564: dstore_3
    //   1565: goto -> 1751
    //   1568: aload #5
    //   1570: ifnull -> 1599
    //   1573: aload #5
    //   1575: ldc '<'
    //   1577: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1580: ifeq -> 1599
    //   1583: dload_3
    //   1584: dload #6
    //   1586: dcmpg
    //   1587: ifge -> 1594
    //   1590: dconst_1
    //   1591: goto -> 1595
    //   1594: dconst_0
    //   1595: dstore_3
    //   1596: goto -> 1751
    //   1599: aload #5
    //   1601: ifnull -> 1630
    //   1604: aload #5
    //   1606: ldc '='
    //   1608: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1611: ifeq -> 1630
    //   1614: dload_3
    //   1615: dload #6
    //   1617: dcmpl
    //   1618: ifne -> 1625
    //   1621: dconst_1
    //   1622: goto -> 1626
    //   1625: dconst_0
    //   1626: dstore_3
    //   1627: goto -> 1751
    //   1630: aload #5
    //   1632: ifnull -> 1661
    //   1635: aload #5
    //   1637: ldc '$'
    //   1639: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1642: ifeq -> 1661
    //   1645: dload_3
    //   1646: dload #6
    //   1648: dcmpl
    //   1649: ifeq -> 1656
    //   1652: dconst_1
    //   1653: goto -> 1657
    //   1656: dconst_0
    //   1657: dstore_3
    //   1658: goto -> 1751
    //   1661: aload #5
    //   1663: ifnull -> 1692
    //   1666: aload #5
    //   1668: ldc '#'
    //   1670: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1673: ifeq -> 1692
    //   1676: dload_3
    //   1677: dload #6
    //   1679: dcmpl
    //   1680: iflt -> 1687
    //   1683: dconst_1
    //   1684: goto -> 1688
    //   1687: dconst_0
    //   1688: dstore_3
    //   1689: goto -> 1751
    //   1692: aload #5
    //   1694: ifnull -> 1723
    //   1697: aload #5
    //   1699: ldc '@'
    //   1701: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1704: ifeq -> 1723
    //   1707: dload_3
    //   1708: dload #6
    //   1710: dcmpg
    //   1711: ifgt -> 1718
    //   1714: dconst_1
    //   1715: goto -> 1719
    //   1718: dconst_0
    //   1719: dstore_3
    //   1720: goto -> 1751
    //   1723: aload #5
    //   1725: ifnull -> 1751
    //   1728: aload #5
    //   1730: ldc '!'
    //   1732: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1735: ifeq -> 1751
    //   1738: dload #6
    //   1740: dconst_0
    //   1741: dcmpl
    //   1742: ifne -> 1749
    //   1745: dconst_1
    //   1746: goto -> 1750
    //   1749: dconst_0
    //   1750: dstore_3
    //   1751: iinc #8, 1
    //   1754: goto -> 943
    //   1757: dload_3
    //   1758: dreturn
    // Exception table:
    //   from	to	target	type
    //   957	999	1002	java/lang/Exception
    //   1084	1098	1101	java/lang/Exception
    //   1103	1216	1219	java/lang/Exception
  }
  
  public static boolean h(String paramString) {
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
        double d1 = g(paramString.substring(0, i).trim());
        double d2 = g(paramString.substring(i + 2).trim());
        if (paramString.indexOf("==") != -1)
          return (d1 == d2); 
        if (paramString.indexOf("!=") != -1)
          return (d1 != d2); 
        if (paramString.indexOf("<=") != -1)
          return (d1 <= d2); 
        if (paramString.indexOf(">=") != -1)
          return (d1 >= d2); 
      } catch (Exception exception) {
        throw new h("Unable to resolve condition for expression: " + paramString);
      } 
    } else {
      i = paramString.indexOf("&");
      i = (i > 0) ? i : paramString.indexOf(">");
      i = (i > 0) ? i : paramString.indexOf("<");
      i = (i > 0) ? i : paramString.indexOf("=");
      if (i > 0) {
        double d1 = g(paramString.substring(0, i).trim());
        double d2 = g(paramString.substring(i + 1).trim());
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
        if (j(paramString))
          return (g(paramString) != 0.0D); 
        double d = 0.0D;
        try {
          boolean bool = (paramString.indexOf("!") != -1) ? true : false;
          String str = X.b(paramString.substring(0, paramString.length()).trim(), "!", "");
          d = k(str);
          return bool ? ((d <= 0.0D)) : ((d > 0.0D));
        } catch (Exception exception) {
          throw new h("Error evaluating condition:" + paramString + ", false returned");
        } 
      } 
    } 
    return false;
  }
  
  public static boolean i(String paramString) {
    String str = paramString;
    if (str.indexOf("Math.") != -1)
      str = b(str); 
    while (str.indexOf("(") != -1) {
      String str1 = str.substring(str.indexOf(")") + 1);
      String str2 = str.substring(str.lastIndexOf("(", str.indexOf(")")) + 1, str.indexOf(")"));
      String str3 = str.substring(0, str.lastIndexOf("(", str.indexOf(")")));
      str2 = i(str2) + "";
      str = str3 + str2 + str1;
    } 
    paramString = str;
    int i = paramString.indexOf("&&");
    if (i > 0) {
      StringTokenizer stringTokenizer = new StringTokenizer(paramString, "&&");
      while (stringTokenizer.hasMoreTokens()) {
        if (!i(stringTokenizer.nextToken()))
          return false; 
      } 
      return true;
    } 
    i = paramString.indexOf("||");
    if (i > 0) {
      StringTokenizer stringTokenizer = new StringTokenizer(paramString, "||");
      while (stringTokenizer.hasMoreTokens()) {
        if (i(stringTokenizer.nextToken()))
          return true; 
      } 
      return false;
    } 
    return h(paramString);
  }
  
  public static boolean j(String paramString) {
    String str = "+&|-*/";
    for (byte b = 0; b < str.length(); b++) {
      if (paramString.indexOf(str.charAt(b)) > 1)
        return true; 
    } 
    return false;
  }
  
  public static double k(String paramString) {
    if (paramString.indexOf("0x") != -1) {
      paramString = X.b(paramString, "0x", "").trim();
      paramString = Integer.valueOf(paramString, 16).toString();
    } else if (paramString.indexOf("0b") != -1) {
      paramString = X.b(paramString, "0b", "").trim();
      paramString = Integer.valueOf(paramString, 2).toString();
    } 
    return Double.parseDouble(paramString);
  }
  
  private static String b(String paramString) {
    while (paramString.indexOf("Math.") != -1) {
      String str1 = paramString.substring(0, paramString.indexOf("Math."));
      int i = paramString.indexOf("Math.");
      int j = a(paramString, i);
      String str2 = paramString.substring(i, j);
      String str3 = paramString.substring(j);
      paramString = str1 + c(str2) + str3;
    } 
    return paramString;
  }
  
  public static boolean l(String paramString) {
    try {
      double d = k(paramString);
      return true;
    } catch (Exception exception) {
      return false;
    } 
  }
  
  private static double c(String paramString) {
    if (paramString.indexOf("(") == -1)
      for (int i = paramString.length() - 1; i > 0; i--) {
        if (!l(paramString.charAt(i) + "")) {
          paramString = paramString.substring(0, i + 1) + "(" + paramString.substring(i + 1) + ")";
          break;
        } 
      }  
    String str = paramString.substring(paramString.indexOf('.') + 1, paramString.indexOf('('));
    double d = g(paramString.substring(paramString.indexOf('('), paramString.length()));
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
    throw new h("Unsupported Math function " + str);
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
  
  private static String d(String paramString) {
    paramString = a(paramString, "||");
    paramString = a(paramString, "&&");
    paramString = X.b(paramString, "||", "`");
    return X.b(paramString, "&&", "~");
  }
  
  private static String a(String paramString1, String paramString2) {
    for (int i = paramString1.indexOf(paramString2); i != -1; i = paramString1.indexOf(paramString2, i + paramString2.length() + 1)) {
      if (i == -1)
        return paramString1; 
      String str1 = paramString1.substring(0, i).trim();
      String str2 = paramString1.substring(i + paramString2.length(), paramString1.length()).trim();
      int j = str1.lastIndexOf("(", i);
      int k = str1.lastIndexOf(")", i);
      if (k > j)
        j = -1; 
      if (j == -1) {
        str1 = "(" + str1 + ")";
      } else {
        String str = str1.substring(0, j) + "(" + str1.substring(j) + ")";
        str1 = str;
      } 
      int m = str2.indexOf(")", i);
      int n = str2.indexOf("(", i);
      if (n > -1 && n < m)
        m = -1; 
      if (m == -1) {
        str2 = "(" + str2 + ")";
      } else {
        String str = "(" + str2.substring(0, m) + ")" + str2.substring(m);
        str2 = str;
      } 
      paramString1 = str1 + paramString2 + str2;
    } 
    return paramString1;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bH/G.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */