package A;

import G.F;
import G.bT;
import G.l;
import V.b;
import V.d;
import ae.o;
import bH.J;
import bH.c;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class m extends t {
  bT a = null;
  
  l b = null;
  
  b c = null;
  
  n d = null;
  
  private String al = "ECU";
  
  public m(F paramF) {
    super(paramF);
  }
  
  public void f() {
    if (this.d != null && this.d.isAlive()) {
      this.d.a = false;
      this.d.interrupt();
    } 
    this.d = new n(this);
    this.d.start();
  }
  
  public void g() {
    if (this.d != null && this.d.isAlive())
      this.d.a = false; 
  }
  
  public bT a(f paramf, List paramList) {
    this.a = null;
    this.b = null;
    this.c = null;
    char c = '憨';
    if (!J.a())
      c = '憨'; 
    long l1 = System.currentTimeMillis();
    n.a(this.d, paramf, paramList);
    do {
      try {
        Thread.sleep(20L);
      } catch (InterruptedException interruptedException) {
        Logger.getLogger(m.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
      } 
    } while (this.b == null && this.c == null && this.a == null && System.currentTimeMillis() - l1 < c && this.d.d);
    if (this.b == null && this.c == null && System.currentTimeMillis() - l1 > (c - 1)) {
      this.b = new l("Timeout trying to connect to: " + paramf.n());
      f();
    } 
    if (this.b != null)
      throw this.b; 
    if (this.c != null)
      throw this.c; 
    return this.a;
  }
  
  private synchronized bT b(f paramf, List paramList) {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: aconst_null
    //   3: astore #4
    //   5: aload_0
    //   6: aload_1
    //   7: invokevirtual a : (LA/f;)V
    //   10: invokestatic currentTimeMillis : ()J
    //   13: lstore #5
    //   15: invokestatic currentTimeMillis : ()J
    //   18: lload #5
    //   20: lsub
    //   21: ldc2_w 15000
    //   24: lcmp
    //   25: ifle -> 47
    //   28: aload_1
    //   29: invokeinterface k : ()I
    //   34: ifeq -> 47
    //   37: aload_0
    //   38: ldc2_w 100
    //   41: invokevirtual wait : (J)V
    //   44: goto -> 15
    //   47: aload_0
    //   48: invokespecial h : ()V
    //   51: new java/lang/StringBuilder
    //   54: dup
    //   55: invokespecial <init> : ()V
    //   58: ldc '!!!!!! Time to Connect = '
    //   60: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   63: invokestatic currentTimeMillis : ()J
    //   66: lload #5
    //   68: lsub
    //   69: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   72: invokevirtual toString : ()Ljava/lang/String;
    //   75: invokestatic c : (Ljava/lang/String;)V
    //   78: aload_0
    //   79: ldc2_w 1500
    //   82: invokevirtual wait : (J)V
    //   85: goto -> 107
    //   88: astore #7
    //   90: ldc A/m
    //   92: invokevirtual getName : ()Ljava/lang/String;
    //   95: invokestatic getLogger : (Ljava/lang/String;)Ljava/util/logging/Logger;
    //   98: getstatic java/util/logging/Level.SEVERE : Ljava/util/logging/Level;
    //   101: aconst_null
    //   102: aload #7
    //   104: invokevirtual log : (Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   107: aload_2
    //   108: invokeinterface iterator : ()Ljava/util/Iterator;
    //   113: astore #7
    //   115: aload #7
    //   117: invokeinterface hasNext : ()Z
    //   122: ifeq -> 1137
    //   125: aload #7
    //   127: invokeinterface next : ()Ljava/lang/Object;
    //   132: checkcast [B
    //   135: astore #8
    //   137: aconst_null
    //   138: astore #9
    //   140: new java/lang/StringBuilder
    //   143: dup
    //   144: invokespecial <init> : ()V
    //   147: ldc 'Calling '
    //   149: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   152: aload_1
    //   153: invokeinterface n : ()Ljava/lang/String;
    //   158: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   161: ldc ' Command: '
    //   163: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   166: aload #8
    //   168: invokestatic d : ([B)Ljava/lang/String;
    //   171: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   174: invokevirtual toString : ()Ljava/lang/String;
    //   177: invokestatic c : (Ljava/lang/String;)V
    //   180: aload_0
    //   181: aload #8
    //   183: ldc2_w 40
    //   186: ldc2_w 600
    //   189: iconst_m1
    //   190: aconst_null
    //   191: invokespecial a : ([BJJILG/m;)[B
    //   194: astore #9
    //   196: goto -> 273
    //   199: astore #10
    //   201: aload #7
    //   203: invokeinterface hasNext : ()Z
    //   208: ifne -> 246
    //   211: new java/lang/StringBuilder
    //   214: dup
    //   215: invokespecial <init> : ()V
    //   218: ldc 'Timeout on port: '
    //   220: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   223: aload_1
    //   224: invokeinterface n : ()Ljava/lang/String;
    //   229: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   232: ldc ', completed this port query'
    //   234: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   237: invokevirtual toString : ()Ljava/lang/String;
    //   240: invokestatic d : (Ljava/lang/String;)V
    //   243: aload #10
    //   245: athrow
    //   246: new java/lang/StringBuilder
    //   249: dup
    //   250: invokespecial <init> : ()V
    //   253: ldc 'Timeout on port: '
    //   255: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   258: aload_1
    //   259: invokeinterface n : ()Ljava/lang/String;
    //   264: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   267: invokevirtual toString : ()Ljava/lang/String;
    //   270: invokestatic d : (Ljava/lang/String;)V
    //   273: aload #9
    //   275: ifnull -> 278
    //   278: aload #9
    //   280: ifnull -> 115
    //   283: aload #9
    //   285: arraylength
    //   286: ifne -> 292
    //   289: goto -> 115
    //   292: aload #9
    //   294: astore #10
    //   296: aload #10
    //   298: aload #8
    //   300: invokestatic c : ([B[B)Z
    //   303: ifeq -> 321
    //   306: ldc 'Echo back of query command. Assuming nothing found.'
    //   308: invokestatic d : (Ljava/lang/String;)V
    //   311: new G/l
    //   314: dup
    //   315: ldc 'Echo back of query command. Assuming nothing found.'
    //   317: invokespecial <init> : (Ljava/lang/String;)V
    //   320: athrow
    //   321: aload #10
    //   323: arraylength
    //   324: iconst_3
    //   325: if_icmplt -> 482
    //   328: aload #10
    //   330: iconst_0
    //   331: baload
    //   332: sipush #224
    //   335: iand
    //   336: sipush #224
    //   339: if_icmpne -> 482
    //   342: aload #10
    //   344: iconst_1
    //   345: baload
    //   346: sipush #240
    //   349: iand
    //   350: ifne -> 482
    //   353: aload #10
    //   355: iconst_2
    //   356: baload
    //   357: bipush #62
    //   359: if_icmpne -> 482
    //   362: ldc 'Found Controller with no firmware loaded'
    //   364: invokestatic c : (Ljava/lang/String;)V
    //   367: new G/bT
    //   370: dup
    //   371: invokespecial <init> : ()V
    //   374: astore_3
    //   375: aload_3
    //   376: aload #10
    //   378: invokevirtual a : ([B)V
    //   381: aload_0
    //   382: invokespecial s : ()I
    //   385: istore #12
    //   387: aload_0
    //   388: iload #12
    //   390: invokevirtual b : (I)Lae/m;
    //   393: invokevirtual a : ()Ljava/lang/String;
    //   396: astore #11
    //   398: aload #11
    //   400: getstatic ae/o.u : Ljava/lang/String;
    //   403: invokevirtual equals : (Ljava/lang/Object;)Z
    //   406: ifeq -> 415
    //   409: aload_0
    //   410: getfield al : Ljava/lang/String;
    //   413: astore #11
    //   415: iload #12
    //   417: invokestatic a : (I)Lae/m;
    //   420: astore #13
    //   422: aload #13
    //   424: ifnull -> 444
    //   427: aload #13
    //   429: invokevirtual b : ()I
    //   432: getstatic ae/o.v : I
    //   435: if_icmpeq -> 444
    //   438: aload_3
    //   439: aload #13
    //   441: invokevirtual a : (Lae/m;)V
    //   444: goto -> 455
    //   447: astore #12
    //   449: aload_0
    //   450: getfield al : Ljava/lang/String;
    //   453: astore #11
    //   455: aload_3
    //   456: new java/lang/StringBuilder
    //   459: dup
    //   460: invokespecial <init> : ()V
    //   463: aload #11
    //   465: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   468: ldc ' Bootload / No Firmware.'
    //   470: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   473: invokevirtual toString : ()Ljava/lang/String;
    //   476: invokevirtual b : (Ljava/lang/String;)V
    //   479: goto -> 1100
    //   482: aload #10
    //   484: arraylength
    //   485: iconst_1
    //   486: if_icmpne -> 500
    //   489: aload #10
    //   491: iconst_0
    //   492: baload
    //   493: iconst_1
    //   494: if_icmpge -> 500
    //   497: goto -> 1100
    //   500: aload #10
    //   502: arraylength
    //   503: iconst_3
    //   504: if_icmpne -> 639
    //   507: aload #10
    //   509: iconst_0
    //   510: baload
    //   511: iconst_1
    //   512: if_icmpne -> 639
    //   515: new java/lang/String
    //   518: dup
    //   519: aload #10
    //   521: invokespecial <init> : ([B)V
    //   524: astore #11
    //   526: aload #11
    //   528: invokestatic k : (Ljava/lang/String;)Ljava/lang/String;
    //   531: astore #11
    //   533: new java/lang/StringBuilder
    //   536: dup
    //   537: invokespecial <init> : ()V
    //   540: ldc 'found signature:'
    //   542: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   545: aload #11
    //   547: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   550: ldc ', using queryCommand:'
    //   552: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   555: new java/lang/String
    //   558: dup
    //   559: aload #8
    //   561: invokespecial <init> : ([B)V
    //   564: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   567: invokevirtual toString : ()Ljava/lang/String;
    //   570: invokestatic c : (Ljava/lang/String;)V
    //   573: new G/bT
    //   576: dup
    //   577: invokespecial <init> : ()V
    //   580: astore_3
    //   581: iconst_1
    //   582: newarray byte
    //   584: astore #12
    //   586: aload #12
    //   588: iconst_0
    //   589: aload #10
    //   591: iconst_1
    //   592: baload
    //   593: bastore
    //   594: aload_3
    //   595: aload #12
    //   597: invokevirtual a : ([B)V
    //   600: new java/lang/StringBuilder
    //   603: dup
    //   604: invokespecial <init> : ()V
    //   607: ldc 'BigStuff3 Firmware: '
    //   609: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   612: aload #10
    //   614: iconst_1
    //   615: baload
    //   616: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   619: invokevirtual toString : ()Ljava/lang/String;
    //   622: astore #13
    //   624: aload_3
    //   625: aload #13
    //   627: invokevirtual b : (Ljava/lang/String;)V
    //   630: aload_3
    //   631: invokevirtual b : ()Ljava/lang/String;
    //   634: astore #4
    //   636: goto -> 1100
    //   639: new java/lang/String
    //   642: dup
    //   643: aload #10
    //   645: invokespecial <init> : ([B)V
    //   648: astore #11
    //   650: aload #11
    //   652: invokestatic k : (Ljava/lang/String;)Ljava/lang/String;
    //   655: astore #11
    //   657: new java/lang/StringBuilder
    //   660: dup
    //   661: invokespecial <init> : ()V
    //   664: ldc 'found signature:'
    //   666: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   669: aload #11
    //   671: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   674: ldc ', using queryCommand:'
    //   676: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   679: new java/lang/String
    //   682: dup
    //   683: aload #8
    //   685: invokespecial <init> : ([B)V
    //   688: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   691: invokevirtual toString : ()Ljava/lang/String;
    //   694: invokestatic c : (Ljava/lang/String;)V
    //   697: new G/bT
    //   700: dup
    //   701: invokespecial <init> : ()V
    //   704: astore_3
    //   705: aload_3
    //   706: aload #10
    //   708: invokevirtual a : ([B)V
    //   711: aload_3
    //   712: invokevirtual b : ()Ljava/lang/String;
    //   715: astore #4
    //   717: aload #4
    //   719: ldc '$GP'
    //   721: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   724: ifeq -> 747
    //   727: ldc 'Looks like a GPS Dongle.'
    //   729: invokestatic d : (Ljava/lang/String;)V
    //   732: aload_3
    //   733: ldc 'GPS Packet'
    //   735: invokevirtual a : (Ljava/lang/String;)V
    //   738: aload_3
    //   739: ldc 'GPS Dongle'
    //   741: invokevirtual b : (Ljava/lang/String;)V
    //   744: goto -> 1100
    //   747: invokestatic a : ()LG/aU;
    //   750: aload_3
    //   751: invokevirtual a : (LG/bT;)[B
    //   754: astore #12
    //   756: aload_0
    //   757: aload #12
    //   759: ldc2_w 250
    //   762: ldc2_w 550
    //   765: iconst_m1
    //   766: aconst_null
    //   767: invokespecial a : ([BJJILG/m;)[B
    //   770: astore #13
    //   772: aload #13
    //   774: ifnull -> 811
    //   777: aload #13
    //   779: arraylength
    //   780: ifle -> 811
    //   783: aload #13
    //   785: astore #14
    //   787: aload #14
    //   789: invokestatic c : ([B)[B
    //   792: astore #14
    //   794: new java/lang/String
    //   797: dup
    //   798: aload #14
    //   800: invokespecial <init> : ([B)V
    //   803: astore #15
    //   805: aload_3
    //   806: aload #15
    //   808: invokevirtual b : (Ljava/lang/String;)V
    //   811: aload_3
    //   812: aload_3
    //   813: invokestatic b : (LG/bT;)Lae/m;
    //   816: invokevirtual a : (Lae/m;)V
    //   819: goto -> 832
    //   822: astore #13
    //   824: aload_3
    //   825: aload_3
    //   826: invokevirtual b : ()Ljava/lang/String;
    //   829: invokevirtual b : (Ljava/lang/String;)V
    //   832: invokestatic a : ()LG/aU;
    //   835: aload_3
    //   836: invokevirtual b : (LG/bT;)[B
    //   839: astore #13
    //   841: aload #13
    //   843: ifnull -> 1100
    //   846: aload_0
    //   847: invokevirtual e : ()LG/F;
    //   850: invokevirtual G : ()Z
    //   853: istore #14
    //   855: aload_0
    //   856: invokevirtual e : ()LG/F;
    //   859: new J/f
    //   862: dup
    //   863: invokespecial <init> : ()V
    //   866: invokevirtual a : (LG/cR;)V
    //   869: aload_0
    //   870: invokevirtual e : ()LG/F;
    //   873: new J/g
    //   876: dup
    //   877: invokespecial <init> : ()V
    //   880: invokevirtual a : (LG/cV;)V
    //   883: aload_0
    //   884: invokevirtual e : ()LG/F;
    //   887: iconst_1
    //   888: invokevirtual d : (Z)V
    //   891: aload_0
    //   892: aload #13
    //   894: ldc2_w 250
    //   897: ldc2_w 550
    //   900: iconst_m1
    //   901: aconst_null
    //   902: invokespecial b : ([BJJILG/m;)[B
    //   905: astore #15
    //   907: aload #15
    //   909: ifnull -> 986
    //   912: aload #15
    //   914: arraylength
    //   915: ifle -> 986
    //   918: aload #15
    //   920: iconst_0
    //   921: aload #15
    //   923: arraylength
    //   924: iconst_1
    //   925: iconst_0
    //   926: invokestatic a : ([BIIZZ)I
    //   929: istore #16
    //   931: iload #16
    //   933: invokestatic a : (I)Lae/m;
    //   936: astore #17
    //   938: aload #17
    //   940: invokevirtual b : ()I
    //   943: getstatic ae/o.v : I
    //   946: if_icmpeq -> 958
    //   949: aload_3
    //   950: aload #17
    //   952: invokevirtual a : (Lae/m;)V
    //   955: goto -> 986
    //   958: new java/lang/StringBuilder
    //   961: dup
    //   962: invokespecial <init> : ()V
    //   965: ldc 'Unknown monitor version: '
    //   967: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   970: iload #16
    //   972: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   975: ldc ', relying on signature.'
    //   977: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   980: invokevirtual toString : ()Ljava/lang/String;
    //   983: invokestatic b : (Ljava/lang/String;)V
    //   986: aload_0
    //   987: invokevirtual e : ()LG/F;
    //   990: aconst_null
    //   991: invokevirtual a : (LG/cR;)V
    //   994: aload_0
    //   995: invokevirtual e : ()LG/F;
    //   998: aconst_null
    //   999: invokevirtual a : (LG/cV;)V
    //   1002: aload_0
    //   1003: invokevirtual e : ()LG/F;
    //   1006: iload #14
    //   1008: invokevirtual d : (Z)V
    //   1011: goto -> 1100
    //   1014: astore #15
    //   1016: new java/lang/StringBuilder
    //   1019: dup
    //   1020: invokespecial <init> : ()V
    //   1023: ldc 'No response to Monitor Version Command: '
    //   1025: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1028: aload #13
    //   1030: invokestatic d : ([B)Ljava/lang/String;
    //   1033: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1036: invokevirtual toString : ()Ljava/lang/String;
    //   1039: invokestatic c : (Ljava/lang/String;)V
    //   1042: aload_0
    //   1043: invokevirtual e : ()LG/F;
    //   1046: aconst_null
    //   1047: invokevirtual a : (LG/cR;)V
    //   1050: aload_0
    //   1051: invokevirtual e : ()LG/F;
    //   1054: aconst_null
    //   1055: invokevirtual a : (LG/cV;)V
    //   1058: aload_0
    //   1059: invokevirtual e : ()LG/F;
    //   1062: iload #14
    //   1064: invokevirtual d : (Z)V
    //   1067: goto -> 1100
    //   1070: astore #18
    //   1072: aload_0
    //   1073: invokevirtual e : ()LG/F;
    //   1076: aconst_null
    //   1077: invokevirtual a : (LG/cR;)V
    //   1080: aload_0
    //   1081: invokevirtual e : ()LG/F;
    //   1084: aconst_null
    //   1085: invokevirtual a : (LG/cV;)V
    //   1088: aload_0
    //   1089: invokevirtual e : ()LG/F;
    //   1092: iload #14
    //   1094: invokevirtual d : (Z)V
    //   1097: aload #18
    //   1099: athrow
    //   1100: aload_3
    //   1101: ifnull -> 1134
    //   1104: new java/lang/StringBuilder
    //   1107: dup
    //   1108: invokespecial <init> : ()V
    //   1111: ldc 'Found Device, discontinue search on '
    //   1113: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1116: aload_1
    //   1117: invokeinterface n : ()Ljava/lang/String;
    //   1122: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1125: invokevirtual toString : ()Ljava/lang/String;
    //   1128: invokestatic d : (Ljava/lang/String;)V
    //   1131: goto -> 1137
    //   1134: goto -> 115
    //   1137: aload_1
    //   1138: invokeinterface g : ()V
    //   1143: invokestatic currentTimeMillis : ()J
    //   1146: lstore #5
    //   1148: invokestatic currentTimeMillis : ()J
    //   1151: lload #5
    //   1153: lsub
    //   1154: ldc2_w 15000
    //   1157: lcmp
    //   1158: ifle -> 1202
    //   1161: aload_1
    //   1162: invokeinterface k : ()I
    //   1167: ifeq -> 1202
    //   1170: aload_0
    //   1171: ldc2_w 100
    //   1174: invokevirtual wait : (J)V
    //   1177: goto -> 1148
    //   1180: astore #7
    //   1182: ldc A/m
    //   1184: invokevirtual getName : ()Ljava/lang/String;
    //   1187: invokestatic getLogger : (Ljava/lang/String;)Ljava/util/logging/Logger;
    //   1190: getstatic java/util/logging/Level.SEVERE : Ljava/util/logging/Level;
    //   1193: aconst_null
    //   1194: aload #7
    //   1196: invokevirtual log : (Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   1199: goto -> 1148
    //   1202: goto -> 1661
    //   1205: astore #5
    //   1207: new java/lang/StringBuilder
    //   1210: dup
    //   1211: invokespecial <init> : ()V
    //   1214: ldc 'IOException trying to communicate with: '
    //   1216: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1219: aload_1
    //   1220: invokeinterface n : ()Ljava/lang/String;
    //   1225: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1228: invokevirtual toString : ()Ljava/lang/String;
    //   1231: invokestatic d : (Ljava/lang/String;)V
    //   1234: aload_0
    //   1235: new G/l
    //   1238: dup
    //   1239: new java/lang/StringBuilder
    //   1242: dup
    //   1243: invokespecial <init> : ()V
    //   1246: ldc 'IOException trying to communicate with: '
    //   1248: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1251: aload_1
    //   1252: invokeinterface n : ()Ljava/lang/String;
    //   1257: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1260: invokevirtual toString : ()Ljava/lang/String;
    //   1263: invokespecial <init> : (Ljava/lang/String;)V
    //   1266: putfield b : LG/l;
    //   1269: aload_1
    //   1270: invokeinterface g : ()V
    //   1275: invokestatic currentTimeMillis : ()J
    //   1278: lstore #5
    //   1280: invokestatic currentTimeMillis : ()J
    //   1283: lload #5
    //   1285: lsub
    //   1286: ldc2_w 15000
    //   1289: lcmp
    //   1290: ifle -> 1334
    //   1293: aload_1
    //   1294: invokeinterface k : ()I
    //   1299: ifeq -> 1334
    //   1302: aload_0
    //   1303: ldc2_w 100
    //   1306: invokevirtual wait : (J)V
    //   1309: goto -> 1280
    //   1312: astore #7
    //   1314: ldc A/m
    //   1316: invokevirtual getName : ()Ljava/lang/String;
    //   1319: invokestatic getLogger : (Ljava/lang/String;)Ljava/util/logging/Logger;
    //   1322: getstatic java/util/logging/Level.SEVERE : Ljava/util/logging/Level;
    //   1325: aconst_null
    //   1326: aload #7
    //   1328: invokevirtual log : (Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   1331: goto -> 1280
    //   1334: goto -> 1661
    //   1337: astore #5
    //   1339: new java/lang/StringBuilder
    //   1342: dup
    //   1343: invokespecial <init> : ()V
    //   1346: ldc 'Timeout on: '
    //   1348: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1351: aload_1
    //   1352: invokeinterface n : ()Ljava/lang/String;
    //   1357: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1360: invokevirtual toString : ()Ljava/lang/String;
    //   1363: invokestatic d : (Ljava/lang/String;)V
    //   1366: aload_0
    //   1367: aload #5
    //   1369: putfield c : LV/b;
    //   1372: aload_1
    //   1373: invokeinterface g : ()V
    //   1378: invokestatic currentTimeMillis : ()J
    //   1381: lstore #5
    //   1383: invokestatic currentTimeMillis : ()J
    //   1386: lload #5
    //   1388: lsub
    //   1389: ldc2_w 15000
    //   1392: lcmp
    //   1393: ifle -> 1437
    //   1396: aload_1
    //   1397: invokeinterface k : ()I
    //   1402: ifeq -> 1437
    //   1405: aload_0
    //   1406: ldc2_w 100
    //   1409: invokevirtual wait : (J)V
    //   1412: goto -> 1383
    //   1415: astore #7
    //   1417: ldc A/m
    //   1419: invokevirtual getName : ()Ljava/lang/String;
    //   1422: invokestatic getLogger : (Ljava/lang/String;)Ljava/util/logging/Logger;
    //   1425: getstatic java/util/logging/Level.SEVERE : Ljava/util/logging/Level;
    //   1428: aconst_null
    //   1429: aload #7
    //   1431: invokevirtual log : (Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   1434: goto -> 1383
    //   1437: goto -> 1661
    //   1440: astore #5
    //   1442: aload_0
    //   1443: aload #5
    //   1445: putfield b : LG/l;
    //   1448: aload_1
    //   1449: invokeinterface g : ()V
    //   1454: invokestatic currentTimeMillis : ()J
    //   1457: lstore #5
    //   1459: invokestatic currentTimeMillis : ()J
    //   1462: lload #5
    //   1464: lsub
    //   1465: ldc2_w 15000
    //   1468: lcmp
    //   1469: ifle -> 1513
    //   1472: aload_1
    //   1473: invokeinterface k : ()I
    //   1478: ifeq -> 1513
    //   1481: aload_0
    //   1482: ldc2_w 100
    //   1485: invokevirtual wait : (J)V
    //   1488: goto -> 1459
    //   1491: astore #7
    //   1493: ldc A/m
    //   1495: invokevirtual getName : ()Ljava/lang/String;
    //   1498: invokestatic getLogger : (Ljava/lang/String;)Ljava/util/logging/Logger;
    //   1501: getstatic java/util/logging/Level.SEVERE : Ljava/util/logging/Level;
    //   1504: aconst_null
    //   1505: aload #7
    //   1507: invokevirtual log : (Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   1510: goto -> 1459
    //   1513: goto -> 1661
    //   1516: astore #5
    //   1518: aload #5
    //   1520: invokevirtual printStackTrace : ()V
    //   1523: aload_1
    //   1524: invokeinterface g : ()V
    //   1529: invokestatic currentTimeMillis : ()J
    //   1532: lstore #5
    //   1534: invokestatic currentTimeMillis : ()J
    //   1537: lload #5
    //   1539: lsub
    //   1540: ldc2_w 15000
    //   1543: lcmp
    //   1544: ifle -> 1588
    //   1547: aload_1
    //   1548: invokeinterface k : ()I
    //   1553: ifeq -> 1588
    //   1556: aload_0
    //   1557: ldc2_w 100
    //   1560: invokevirtual wait : (J)V
    //   1563: goto -> 1534
    //   1566: astore #7
    //   1568: ldc A/m
    //   1570: invokevirtual getName : ()Ljava/lang/String;
    //   1573: invokestatic getLogger : (Ljava/lang/String;)Ljava/util/logging/Logger;
    //   1576: getstatic java/util/logging/Level.SEVERE : Ljava/util/logging/Level;
    //   1579: aconst_null
    //   1580: aload #7
    //   1582: invokevirtual log : (Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   1585: goto -> 1534
    //   1588: goto -> 1661
    //   1591: astore #19
    //   1593: aload_1
    //   1594: invokeinterface g : ()V
    //   1599: invokestatic currentTimeMillis : ()J
    //   1602: lstore #20
    //   1604: invokestatic currentTimeMillis : ()J
    //   1607: lload #20
    //   1609: lsub
    //   1610: ldc2_w 15000
    //   1613: lcmp
    //   1614: ifle -> 1658
    //   1617: aload_1
    //   1618: invokeinterface k : ()I
    //   1623: ifeq -> 1658
    //   1626: aload_0
    //   1627: ldc2_w 100
    //   1630: invokevirtual wait : (J)V
    //   1633: goto -> 1604
    //   1636: astore #22
    //   1638: ldc A/m
    //   1640: invokevirtual getName : ()Ljava/lang/String;
    //   1643: invokestatic getLogger : (Ljava/lang/String;)Ljava/util/logging/Logger;
    //   1646: getstatic java/util/logging/Level.SEVERE : Ljava/util/logging/Level;
    //   1649: aconst_null
    //   1650: aload #22
    //   1652: invokevirtual log : (Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   1655: goto -> 1604
    //   1658: aload #19
    //   1660: athrow
    //   1661: aload_0
    //   1662: aload_3
    //   1663: putfield a : LG/bT;
    //   1666: aload_0
    //   1667: getfield d : LA/n;
    //   1670: invokestatic a : (LA/n;)V
    //   1673: aload_3
    //   1674: areturn
    // Exception table:
    //   from	to	target	type
    //   10	1137	1205	java/io/IOException
    //   10	1137	1337	V/b
    //   10	1137	1440	G/l
    //   10	1137	1516	java/lang/Exception
    //   10	1137	1591	finally
    //   78	85	88	java/lang/InterruptedException
    //   140	196	199	V/b
    //   381	444	447	java/lang/Exception
    //   756	819	822	V/b
    //   855	986	1014	java/lang/Exception
    //   855	986	1070	finally
    //   1014	1042	1070	finally
    //   1070	1072	1070	finally
    //   1170	1177	1180	java/lang/InterruptedException
    //   1205	1269	1591	finally
    //   1302	1309	1312	java/lang/InterruptedException
    //   1337	1372	1591	finally
    //   1405	1412	1415	java/lang/InterruptedException
    //   1440	1448	1591	finally
    //   1481	1488	1491	java/lang/InterruptedException
    //   1516	1523	1591	finally
    //   1556	1563	1566	java/lang/InterruptedException
    //   1591	1593	1591	finally
    //   1626	1633	1636	java/lang/InterruptedException
  }
  
  public void a(String paramString) {
    this.al = paramString;
  }
  
  private int s() {
    byte[] arrayOfByte = new byte[1];
    arrayOfByte[0] = -73;
    try {
      byte[] arrayOfByte1 = a(arrayOfByte, 450L, 350L, 6, null);
      return (arrayOfByte1 == null || arrayOfByte1[0] != -36) ? -1 : c.a(arrayOfByte1, 1, 2, true, false);
    } catch (IOException iOException) {
      Logger.getLogger(m.class.getName()).log(Level.SEVERE, (String)null, iOException);
    } catch (b b1) {
      Logger.getLogger(m.class.getName()).log(Level.SEVERE, (String)null, (Throwable)b1);
    } catch (d d) {
      Logger.getLogger(m.class.getName()).log(Level.SEVERE, (String)null, (Throwable)d);
    } 
    return -1;
  }
  
  public ae.m b(int paramInt) {
    return o.a(paramInt);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/A/m.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */