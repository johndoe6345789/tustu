package aP;

import A.f;
import A.v;
import B.b;
import B.i;
import G.R;
import G.T;
import G.r;
import V.a;
import W.ab;
import aE.a;
import aV.w;
import bH.t;
import bQ.j;
import bQ.l;
import com.efiAnalytics.apps.ts.dashboard.Z;
import com.efiAnalytics.apps.ts.dashboard.aa;
import java.io.File;
import java.util.Map;
import r.a;
import r.i;
import r.j;
import s.a;
import v.c;
import z.c;

public class ie {
  private boolean a = false;
  
  private static boolean b = true;
  
  public a a(String paramString) {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: new G/R
    //   5: dup
    //   6: invokespecial <init> : ()V
    //   9: astore_3
    //   10: invokestatic a : ()LG/T;
    //   13: astore #4
    //   15: invokestatic a : ()LG/h;
    //   18: invokevirtual b : ()V
    //   21: new aE/a
    //   24: dup
    //   25: invokespecial <init> : ()V
    //   28: astore #5
    //   30: aload #5
    //   32: invokestatic a : ()Lr/i;
    //   35: ldc 'poij fe07r32;lkjrew09345rv'
    //   37: invokevirtual a : (Ljava/lang/String;)Z
    //   40: invokevirtual e : (Z)V
    //   43: aload_3
    //   44: aload_1
    //   45: invokevirtual q : (Ljava/lang/String;)V
    //   48: aload #5
    //   50: aload_1
    //   51: invokevirtual a : (Ljava/lang/String;)LaE/a;
    //   54: pop
    //   55: aload #5
    //   57: new java/io/File
    //   60: dup
    //   61: aload_1
    //   62: invokespecial <init> : (Ljava/lang/String;)V
    //   65: invokevirtual getName : ()Ljava/lang/String;
    //   68: invokevirtual i : (Ljava/lang/String;)V
    //   71: invokestatic a : ()LI/k;
    //   74: new W/ao
    //   77: dup
    //   78: aload #5
    //   80: invokespecial <init> : (LaE/a;)V
    //   83: invokevirtual a : (LW/am;)V
    //   86: aload_3
    //   87: aload #5
    //   89: invokevirtual u : ()Ljava/lang/String;
    //   92: invokevirtual a : (Ljava/lang/String;)V
    //   95: invokestatic a : ()LG/h;
    //   98: aload_3
    //   99: invokevirtual a : (LG/aI;)V
    //   102: aload_3
    //   103: invokestatic a : ()Ls/a;
    //   106: invokevirtual a : (Ljava/util/Map;)V
    //   109: invokestatic a : ()Lr/a;
    //   112: getstatic r/a.bq : Ljava/lang/String;
    //   115: getstatic r/a.br : Z
    //   118: invokevirtual c : (Ljava/lang/String;Z)Z
    //   121: ifeq -> 143
    //   124: invokestatic a : ()Lr/a;
    //   127: getstatic r/a.bs : Ljava/lang/String;
    //   130: getstatic r/a.bt : Z
    //   133: invokevirtual c : (Ljava/lang/String;Z)Z
    //   136: ifeq -> 143
    //   139: iconst_1
    //   140: goto -> 144
    //   143: iconst_0
    //   144: istore #6
    //   146: new bH/aa
    //   149: dup
    //   150: invokespecial <init> : ()V
    //   153: astore #7
    //   155: aload #7
    //   157: invokevirtual a : ()V
    //   160: iconst_2
    //   161: anewarray java/lang/String
    //   164: dup
    //   165: iconst_0
    //   166: ldc 'baudRate'
    //   168: aastore
    //   169: dup
    //   170: iconst_1
    //   171: ldc 'commPort'
    //   173: aastore
    //   174: astore #8
    //   176: iconst_2
    //   177: anewarray java/lang/String
    //   180: dup
    //   181: iconst_0
    //   182: ldc 'CommSettingBaud Rate'
    //   184: aastore
    //   185: dup
    //   186: iconst_1
    //   187: ldc 'CommSettingCom Port'
    //   189: aastore
    //   190: astore #9
    //   192: iconst_0
    //   193: istore #10
    //   195: iload #10
    //   197: aload #8
    //   199: arraylength
    //   200: if_icmpge -> 256
    //   203: aload #5
    //   205: aload #9
    //   207: iload #10
    //   209: aaload
    //   210: invokevirtual getProperty : (Ljava/lang/String;)Ljava/lang/String;
    //   213: ifnonnull -> 250
    //   216: aload #5
    //   218: aload #8
    //   220: iload #10
    //   222: aaload
    //   223: invokevirtual getProperty : (Ljava/lang/String;)Ljava/lang/String;
    //   226: ifnull -> 250
    //   229: aload #5
    //   231: aload #9
    //   233: iload #10
    //   235: aaload
    //   236: aload #5
    //   238: aload #8
    //   240: iload #10
    //   242: aaload
    //   243: invokevirtual getProperty : (Ljava/lang/String;)Ljava/lang/String;
    //   246: invokevirtual setProperty : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
    //   249: pop
    //   250: iinc #10, 1
    //   253: goto -> 195
    //   256: iconst_1
    //   257: anewarray java/io/File
    //   260: astore #10
    //   262: aload #10
    //   264: iconst_0
    //   265: aload #5
    //   267: invokevirtual j : ()Ljava/io/File;
    //   270: aastore
    //   271: aload #10
    //   273: iconst_0
    //   274: aaload
    //   275: invokestatic a : (Ljava/io/File;)Ljava/lang/String;
    //   278: astore #11
    //   280: invokestatic a : ()Lr/i;
    //   283: ldc '432;LK;LKFS'
    //   285: invokevirtual a : (Ljava/lang/String;)Z
    //   288: ifne -> 301
    //   291: aload #11
    //   293: ldc 'MS1/Extra format 029y3'
    //   295: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   298: ifeq -> 554
    //   301: aload #5
    //   303: invokevirtual R : ()Ljava/lang/String;
    //   306: astore #12
    //   308: getstatic r/a.a : Ljava/lang/String;
    //   311: aload #12
    //   313: invokevirtual equals : (Ljava/lang/Object;)Z
    //   316: ifeq -> 330
    //   319: invokestatic a : ()Lr/i;
    //   322: ldc '432;LK;LKFS'
    //   324: invokevirtual a : (Ljava/lang/String;)Z
    //   327: ifeq -> 554
    //   330: new bH/aa
    //   333: dup
    //   334: invokespecial <init> : ()V
    //   337: astore #13
    //   339: aload #13
    //   341: invokevirtual a : ()V
    //   344: aload #11
    //   346: invokestatic e : (Ljava/lang/String;)Ljava/io/File;
    //   349: astore #14
    //   351: aload #14
    //   353: ifnull -> 520
    //   356: aload #10
    //   358: iconst_0
    //   359: aaload
    //   360: invokestatic c : (Ljava/io/File;)D
    //   363: dstore #15
    //   365: aload #14
    //   367: invokestatic c : (Ljava/io/File;)D
    //   370: dstore #17
    //   372: dload #17
    //   374: dload #15
    //   376: dcmpl
    //   377: ifle -> 494
    //   380: new java/lang/StringBuilder
    //   383: dup
    //   384: invokespecial <init> : ()V
    //   387: ldc 'Updating project ecu def from version: '
    //   389: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   392: dload #15
    //   394: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   397: ldc ' to version: '
    //   399: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   402: dload #17
    //   404: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   407: ldc ' from installer.'
    //   409: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   412: invokevirtual toString : ()Ljava/lang/String;
    //   415: invokestatic d : (Ljava/lang/String;)V
    //   418: new java/io/File
    //   421: dup
    //   422: aload #10
    //   424: iconst_0
    //   425: aaload
    //   426: invokevirtual getParentFile : ()Ljava/io/File;
    //   429: new java/lang/StringBuilder
    //   432: dup
    //   433: invokespecial <init> : ()V
    //   436: aload #10
    //   438: iconst_0
    //   439: aaload
    //   440: invokevirtual getName : ()Ljava/lang/String;
    //   443: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   446: ldc '.bak'
    //   448: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   451: invokevirtual toString : ()Ljava/lang/String;
    //   454: invokespecial <init> : (Ljava/io/File;Ljava/lang/String;)V
    //   457: astore #19
    //   459: aload #19
    //   461: invokevirtual exists : ()Z
    //   464: ifeq -> 473
    //   467: aload #19
    //   469: invokevirtual delete : ()Z
    //   472: pop
    //   473: aload #10
    //   475: iconst_0
    //   476: aaload
    //   477: aload #19
    //   479: invokestatic b : (Ljava/io/File;Ljava/io/File;)V
    //   482: aload #14
    //   484: aload #10
    //   486: iconst_0
    //   487: aaload
    //   488: invokestatic b : (Ljava/io/File;Ljava/io/File;)V
    //   491: goto -> 520
    //   494: invokestatic a : ()Lr/i;
    //   497: ldc '432;LK;LKFS'
    //   499: invokevirtual a : (Ljava/lang/String;)Z
    //   502: ifeq -> 520
    //   505: ldc 'Checking Server for newer iniVersion.'
    //   507: invokestatic d : (Ljava/lang/String;)V
    //   510: aload #11
    //   512: dload #17
    //   514: invokestatic c : ()Ljava/io/File;
    //   517: invokestatic a : (Ljava/lang/String;DLjava/io/File;)V
    //   520: aload #5
    //   522: getstatic r/a.a : Ljava/lang/String;
    //   525: invokevirtual x : (Ljava/lang/String;)V
    //   528: new java/lang/StringBuilder
    //   531: dup
    //   532: invokespecial <init> : ()V
    //   535: ldc 'ECU def update check time: '
    //   537: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   540: aload #13
    //   542: invokevirtual d : ()F
    //   545: invokevirtual append : (F)Ljava/lang/StringBuilder;
    //   548: invokevirtual toString : ()Ljava/lang/String;
    //   551: invokestatic c : (Ljava/lang/String;)V
    //   554: invokestatic a : ()LX/c;
    //   557: aload #5
    //   559: invokevirtual j : ()Ljava/io/File;
    //   562: invokestatic b : (Ljava/io/File;)Z
    //   565: invokevirtual a : (Z)V
    //   568: aload #5
    //   570: invokevirtual z : ()[Ljava/lang/String;
    //   573: astore #12
    //   575: aload #12
    //   577: ifnonnull -> 590
    //   580: new V/e
    //   583: dup
    //   584: ldc 'Project Corrupt, no configuration options found.'
    //   586: invokespecial <init> : (Ljava/lang/String;)V
    //   589: athrow
    //   590: iconst_0
    //   591: istore #13
    //   593: aconst_null
    //   594: astore #14
    //   596: aload_0
    //   597: invokevirtual a : ()Z
    //   600: ifeq -> 904
    //   603: new java/lang/StringBuilder
    //   606: dup
    //   607: invokespecial <init> : ()V
    //   610: astore #15
    //   612: aload #15
    //   614: aload #5
    //   616: invokevirtual u : ()Ljava/lang/String;
    //   619: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   622: ldc '_'
    //   624: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   627: pop
    //   628: aload #15
    //   630: aload #11
    //   632: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   635: pop
    //   636: aload #12
    //   638: astore #16
    //   640: aload #16
    //   642: arraylength
    //   643: istore #17
    //   645: iconst_0
    //   646: istore #18
    //   648: iload #18
    //   650: iload #17
    //   652: if_icmpge -> 681
    //   655: aload #16
    //   657: iload #18
    //   659: aaload
    //   660: astore #19
    //   662: aload #15
    //   664: ldc '_'
    //   666: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   669: aload #19
    //   671: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   674: pop
    //   675: iinc #18, 1
    //   678: goto -> 648
    //   681: aload #15
    //   683: aload #5
    //   685: invokevirtual j : ()Ljava/io/File;
    //   688: invokevirtual lastModified : ()J
    //   691: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   694: pop
    //   695: aload #15
    //   697: iload #6
    //   699: invokevirtual append : (Z)Ljava/lang/StringBuilder;
    //   702: ldc '_'
    //   704: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   707: pop
    //   708: aload #15
    //   710: aload #5
    //   712: invokevirtual j : ()Ljava/io/File;
    //   715: invokevirtual length : ()J
    //   718: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   721: pop
    //   722: new bH/aa
    //   725: dup
    //   726: invokespecial <init> : ()V
    //   729: astore #16
    //   731: aload #16
    //   733: invokevirtual a : ()V
    //   736: aload #15
    //   738: invokevirtual toString : ()Ljava/lang/String;
    //   741: astore #14
    //   743: invokestatic a : ()LX/c;
    //   746: aload #14
    //   748: aload #5
    //   750: invokevirtual j : ()Ljava/io/File;
    //   753: invokevirtual getParentFile : ()Ljava/io/File;
    //   756: invokevirtual a : (Ljava/lang/String;Ljava/io/File;)Ljava/lang/Object;
    //   759: astore #17
    //   761: aload #17
    //   763: ifnonnull -> 774
    //   766: ldc 'failed to load cached config definition, will load ini. Error: Matching Config not found in cache'
    //   768: invokestatic d : (Ljava/lang/String;)V
    //   771: goto -> 842
    //   774: aload_3
    //   775: aload #17
    //   777: checkcast G/ae
    //   780: invokevirtual a : (LG/ae;)V
    //   783: aload_3
    //   784: aload_1
    //   785: invokevirtual q : (Ljava/lang/String;)V
    //   788: aload_3
    //   789: aload #5
    //   791: invokevirtual u : ()Ljava/lang/String;
    //   794: invokevirtual a : (Ljava/lang/String;)V
    //   797: aload_3
    //   798: invokestatic a : ()Ls/a;
    //   801: invokevirtual a : (Ljava/util/Map;)V
    //   804: aload_3
    //   805: invokevirtual j : ()V
    //   808: iconst_1
    //   809: istore #13
    //   811: goto -> 842
    //   814: astore #18
    //   816: new java/lang/StringBuilder
    //   819: dup
    //   820: invokespecial <init> : ()V
    //   823: ldc 'failed to load cached config, will load ini. Error: '
    //   825: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   828: aload #18
    //   830: invokevirtual getLocalizedMessage : ()Ljava/lang/String;
    //   833: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   836: invokevirtual toString : ()Ljava/lang/String;
    //   839: invokestatic d : (Ljava/lang/String;)V
    //   842: goto -> 904
    //   845: astore #15
    //   847: new java/lang/StringBuilder
    //   850: dup
    //   851: invokespecial <init> : ()V
    //   854: ldc 'failed to load cached config, will load ini. Error: '
    //   856: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   859: aload #15
    //   861: invokevirtual getLocalizedMessage : ()Ljava/lang/String;
    //   864: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   867: invokevirtual toString : ()Ljava/lang/String;
    //   870: invokestatic d : (Ljava/lang/String;)V
    //   873: goto -> 904
    //   876: astore #15
    //   878: new java/lang/StringBuilder
    //   881: dup
    //   882: invokespecial <init> : ()V
    //   885: ldc 'failed to load cached config, will load ini. Error: '
    //   887: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   890: aload #15
    //   892: invokevirtual getLocalizedMessage : ()Ljava/lang/String;
    //   895: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   898: invokevirtual toString : ()Ljava/lang/String;
    //   901: invokestatic d : (Ljava/lang/String;)V
    //   904: iload #13
    //   906: ifne -> 1302
    //   909: aload #5
    //   911: invokevirtual v : ()Ljava/lang/String;
    //   914: astore #15
    //   916: aload #15
    //   918: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   921: ldc '.ini'
    //   923: invokevirtual indexOf : (Ljava/lang/String;)I
    //   926: ifgt -> 942
    //   929: aload #15
    //   931: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   934: ldc '.ecu'
    //   936: invokevirtual endsWith : (Ljava/lang/String;)Z
    //   939: ifeq -> 1183
    //   942: invokestatic a : ()LW/v;
    //   945: aload #10
    //   947: invokevirtual a : ([Ljava/io/File;)[LG/s;
    //   950: pop
    //   951: iconst_0
    //   952: istore #16
    //   954: iload #16
    //   956: aload #12
    //   958: arraylength
    //   959: if_icmpge -> 1011
    //   962: invokestatic a : ()LW/v;
    //   965: aload #12
    //   967: iload #16
    //   969: aaload
    //   970: invokevirtual c : (Ljava/lang/String;)LG/r;
    //   973: astore #17
    //   975: aload #17
    //   977: ifnull -> 989
    //   980: aload_3
    //   981: aload #17
    //   983: invokevirtual a : (LG/r;)V
    //   986: goto -> 1005
    //   989: aload_3
    //   990: new G/r
    //   993: dup
    //   994: aload #12
    //   996: iload #16
    //   998: aaload
    //   999: invokespecial <init> : (Ljava/lang/String;)V
    //   1002: invokevirtual a : (LG/r;)V
    //   1005: iinc #16, 1
    //   1008: goto -> 954
    //   1011: new W/ab
    //   1014: dup
    //   1015: invokespecial <init> : ()V
    //   1018: astore #16
    //   1020: aload #16
    //   1022: invokestatic b : ()Z
    //   1025: invokevirtual a : (Z)V
    //   1028: invokestatic a : ()Lr/i;
    //   1031: ldc 'HF-05[P54;'FD'
    //   1033: invokevirtual a : (Ljava/lang/String;)Z
    //   1036: ifne -> 1059
    //   1039: aload_3
    //   1040: ldc 'tsCanId'
    //   1042: invokevirtual c : (Ljava/lang/String;)LG/aM;
    //   1045: ifnonnull -> 1059
    //   1048: aload #16
    //   1050: aload_3
    //   1051: getstatic r/j.G : Ljava/lang/String;
    //   1054: iconst_0
    //   1055: invokevirtual a : (LG/R;Ljava/lang/String;Z)LG/R;
    //   1058: astore_3
    //   1059: goto -> 1108
    //   1062: astore #17
    //   1064: aload #17
    //   1066: invokevirtual printStackTrace : ()V
    //   1069: new java/lang/StringBuilder
    //   1072: dup
    //   1073: invokespecial <init> : ()V
    //   1076: ldc 'Unable to load PcVariables to '
    //   1078: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1081: aload_3
    //   1082: invokevirtual c : ()Ljava/lang/String;
    //   1085: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1088: ldc '\\n'
    //   1090: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1093: aload #17
    //   1095: invokevirtual getMessage : ()Ljava/lang/String;
    //   1098: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1101: invokevirtual toString : ()Ljava/lang/String;
    //   1104: aconst_null
    //   1105: invokestatic d : (Ljava/lang/String;Ljava/awt/Component;)V
    //   1108: aload #16
    //   1110: aload_3
    //   1111: aload #15
    //   1113: iconst_1
    //   1114: iload #6
    //   1116: invokevirtual a : (LG/R;Ljava/lang/String;ZZ)LG/R;
    //   1119: astore_3
    //   1120: invokestatic a : ()LI/p;
    //   1123: aload_3
    //   1124: invokevirtual a : (LG/R;)V
    //   1127: goto -> 1163
    //   1130: astore #17
    //   1132: new java/lang/StringBuilder
    //   1135: dup
    //   1136: invokespecial <init> : ()V
    //   1139: ldc 'Failed to load Supplemental ECU Definition for Main Controller. Message:'
    //   1141: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1144: aload #17
    //   1146: invokevirtual getLocalizedMessage : ()Ljava/lang/String;
    //   1149: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1152: invokevirtual toString : ()Ljava/lang/String;
    //   1155: invokestatic b : (Ljava/lang/String;)V
    //   1158: aload #17
    //   1160: invokevirtual printStackTrace : ()V
    //   1163: aload_3
    //   1164: invokestatic a : (LG/R;)V
    //   1167: goto -> 1180
    //   1170: astore #17
    //   1172: aload #17
    //   1174: invokevirtual printStackTrace : ()V
    //   1177: aload #17
    //   1179: athrow
    //   1180: goto -> 1211
    //   1183: new V/a
    //   1186: dup
    //   1187: new java/lang/StringBuilder
    //   1190: dup
    //   1191: invokespecial <init> : ()V
    //   1194: ldc 'Unidentified ecu configuration file extension for:\\n'
    //   1196: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1199: aload #15
    //   1201: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1204: invokevirtual toString : ()Ljava/lang/String;
    //   1207: invokespecial <init> : (Ljava/lang/String;)V
    //   1210: athrow
    //   1211: aload_0
    //   1212: invokevirtual a : ()Z
    //   1215: ifeq -> 1302
    //   1218: aload #14
    //   1220: ifnull -> 1302
    //   1223: aload_3
    //   1224: invokevirtual ab : ()LG/ae;
    //   1227: astore #16
    //   1229: invokestatic a : ()LX/c;
    //   1232: aload #5
    //   1234: invokevirtual j : ()Ljava/io/File;
    //   1237: invokevirtual getParentFile : ()Ljava/io/File;
    //   1240: invokevirtual a : (Ljava/io/File;)V
    //   1243: invokestatic a : ()LX/c;
    //   1246: aload #16
    //   1248: aload #14
    //   1250: aload #5
    //   1252: invokevirtual j : ()Ljava/io/File;
    //   1255: invokevirtual getParentFile : ()Ljava/io/File;
    //   1258: invokevirtual a : (Ljava/lang/Object;Ljava/lang/String;Ljava/io/File;)V
    //   1261: goto -> 1302
    //   1264: astore #17
    //   1266: ldc aP/ie
    //   1268: invokevirtual getName : ()Ljava/lang/String;
    //   1271: invokestatic getLogger : (Ljava/lang/String;)Ljava/util/logging/Logger;
    //   1274: getstatic java/util/logging/Level.SEVERE : Ljava/util/logging/Level;
    //   1277: new java/lang/StringBuilder
    //   1280: dup
    //   1281: invokespecial <init> : ()V
    //   1284: ldc 'Failed to Cache Config. cacheKey='
    //   1286: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1289: aload #14
    //   1291: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1294: invokevirtual toString : ()Ljava/lang/String;
    //   1297: aload #17
    //   1299: invokevirtual log : (Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   1302: new java/lang/StringBuilder
    //   1305: dup
    //   1306: invokespecial <init> : ()V
    //   1309: ldc 'Time to load primary config: '
    //   1311: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1314: aload #7
    //   1316: invokevirtual d : ()F
    //   1319: invokevirtual append : (F)Ljava/lang/StringBuilder;
    //   1322: ldc 'ms. used cached config: '
    //   1324: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1327: iload #13
    //   1329: invokevirtual append : (Z)Ljava/lang/StringBuilder;
    //   1332: invokevirtual toString : ()Ljava/lang/String;
    //   1335: invokestatic d : (Ljava/lang/String;)V
    //   1338: aload #5
    //   1340: invokevirtual d : ()Ljava/lang/String;
    //   1343: ifnull -> 1419
    //   1346: aload #5
    //   1348: invokevirtual d : ()Ljava/lang/String;
    //   1351: ldc ''
    //   1353: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1356: ifne -> 1419
    //   1359: invokestatic a : ()LG/cL;
    //   1362: aload #5
    //   1364: invokevirtual d : ()Ljava/lang/String;
    //   1367: invokevirtual b : (Ljava/lang/String;)LG/cR;
    //   1370: astore #15
    //   1372: aload_3
    //   1373: invokevirtual O : ()LG/F;
    //   1376: aload #15
    //   1378: invokevirtual a : (LG/cR;)V
    //   1381: invokestatic a : ()LG/cL;
    //   1384: aload #5
    //   1386: invokevirtual d : ()Ljava/lang/String;
    //   1389: invokevirtual a : (Ljava/lang/String;)LG/cV;
    //   1392: astore #16
    //   1394: aload_3
    //   1395: invokevirtual O : ()LG/F;
    //   1398: aload #16
    //   1400: invokevirtual a : (LG/cV;)V
    //   1403: aload #16
    //   1405: ifnull -> 1416
    //   1408: aload_3
    //   1409: invokevirtual O : ()LG/F;
    //   1412: iconst_1
    //   1413: invokevirtual d : (Z)V
    //   1416: goto -> 1475
    //   1419: getstatic r/a.b : Ljava/lang/String;
    //   1422: getstatic r/a.as : Ljava/lang/String;
    //   1425: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1428: ifeq -> 1475
    //   1431: new J/a
    //   1434: dup
    //   1435: invokespecial <init> : ()V
    //   1438: astore #15
    //   1440: aload_3
    //   1441: invokevirtual O : ()LG/F;
    //   1444: aload #15
    //   1446: invokevirtual a : (LG/cR;)V
    //   1449: new J/b
    //   1452: dup
    //   1453: invokespecial <init> : ()V
    //   1456: astore #16
    //   1458: aload_3
    //   1459: invokevirtual O : ()LG/F;
    //   1462: aload #16
    //   1464: invokevirtual a : (LG/cV;)V
    //   1467: aload_3
    //   1468: invokevirtual O : ()LG/F;
    //   1471: iconst_1
    //   1472: invokevirtual d : (Z)V
    //   1475: aload #5
    //   1477: aload_3
    //   1478: invokevirtual c : ()Ljava/lang/String;
    //   1481: invokevirtual d : (Ljava/lang/String;)Ljava/io/File;
    //   1484: astore #15
    //   1486: aload #15
    //   1488: invokevirtual exists : ()Z
    //   1491: ifeq -> 1563
    //   1494: new W/aa
    //   1497: dup
    //   1498: invokespecial <init> : ()V
    //   1501: astore #16
    //   1503: aload #16
    //   1505: aload_3
    //   1506: aload #15
    //   1508: invokevirtual getAbsolutePath : ()Ljava/lang/String;
    //   1511: invokevirtual a : (LG/R;Ljava/lang/String;)V
    //   1514: goto -> 1563
    //   1517: astore #17
    //   1519: new java/lang/StringBuilder
    //   1522: dup
    //   1523: invokespecial <init> : ()V
    //   1526: aload #15
    //   1528: invokevirtual getName : ()Ljava/lang/String;
    //   1531: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1534: ldc ' either missing or invalid for '
    //   1536: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1539: aload_3
    //   1540: invokevirtual c : ()Ljava/lang/String;
    //   1543: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1546: invokevirtual toString : ()Ljava/lang/String;
    //   1549: invokestatic d : (Ljava/lang/String;)V
    //   1552: aload #15
    //   1554: invokevirtual delete : ()Z
    //   1557: pop
    //   1558: aload #17
    //   1560: invokevirtual printStackTrace : ()V
    //   1563: aload_3
    //   1564: invokevirtual O : ()LG/F;
    //   1567: invokevirtual x : ()I
    //   1570: istore #16
    //   1572: aload #5
    //   1574: iload #16
    //   1576: invokevirtual b : (I)I
    //   1579: istore #16
    //   1581: aload_3
    //   1582: ldc 'tsCanId'
    //   1584: invokevirtual c : (Ljava/lang/String;)LG/aM;
    //   1587: astore #17
    //   1589: iload #16
    //   1591: iflt -> 1633
    //   1594: aload #17
    //   1596: ifnull -> 1633
    //   1599: aload #17
    //   1601: aload_3
    //   1602: invokevirtual p : ()LG/Y;
    //   1605: iload #16
    //   1607: i2d
    //   1608: invokevirtual a : (LG/Y;D)V
    //   1611: goto -> 1633
    //   1614: astore #18
    //   1616: ldc aP/ie
    //   1618: invokevirtual getName : ()Ljava/lang/String;
    //   1621: invokestatic getLogger : (Ljava/lang/String;)Ljava/util/logging/Logger;
    //   1624: getstatic java/util/logging/Level.SEVERE : Ljava/util/logging/Level;
    //   1627: aconst_null
    //   1628: aload #18
    //   1630: invokevirtual log : (Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   1633: aload_3
    //   1634: invokevirtual O : ()LG/F;
    //   1637: iload #16
    //   1639: invokevirtual r : (I)V
    //   1642: goto -> 1691
    //   1645: astore #15
    //   1647: aload #15
    //   1649: invokevirtual printStackTrace : ()V
    //   1652: new java/lang/StringBuilder
    //   1655: dup
    //   1656: invokespecial <init> : ()V
    //   1659: ldc 'Unable to load PcVariables to '
    //   1661: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1664: aload_3
    //   1665: invokevirtual c : ()Ljava/lang/String;
    //   1668: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1671: ldc '\\n'
    //   1673: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1676: aload #15
    //   1678: invokevirtual getMessage : ()Ljava/lang/String;
    //   1681: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1684: invokevirtual toString : ()Ljava/lang/String;
    //   1687: aconst_null
    //   1688: invokestatic d : (Ljava/lang/String;Ljava/awt/Component;)V
    //   1691: aload_3
    //   1692: invokevirtual O : ()LG/F;
    //   1695: aload #5
    //   1697: invokevirtual r : ()Z
    //   1700: invokevirtual b : (Z)V
    //   1703: aload_3
    //   1704: invokevirtual O : ()LG/F;
    //   1707: aload #5
    //   1709: aload_3
    //   1710: invokevirtual c : ()Ljava/lang/String;
    //   1713: invokevirtual m : (Ljava/lang/String;)Ljava/lang/String;
    //   1716: invokevirtual j : (Ljava/lang/String;)V
    //   1719: goto -> 1733
    //   1722: astore #15
    //   1724: aload_3
    //   1725: invokevirtual O : ()LG/F;
    //   1728: ldc 115200
    //   1730: invokevirtual p : (I)V
    //   1733: aload_3
    //   1734: invokevirtual O : ()LG/F;
    //   1737: aload #5
    //   1739: aload_3
    //   1740: invokevirtual c : ()Ljava/lang/String;
    //   1743: invokevirtual n : (Ljava/lang/String;)Ljava/lang/String;
    //   1746: invokevirtual k : (Ljava/lang/String;)V
    //   1749: aload_3
    //   1750: invokevirtual O : ()LG/F;
    //   1753: aload #5
    //   1755: aload_3
    //   1756: invokevirtual c : ()Ljava/lang/String;
    //   1759: invokevirtual n : (Ljava/lang/String;)Ljava/lang/String;
    //   1762: invokevirtual k : (Ljava/lang/String;)V
    //   1765: goto -> 1770
    //   1768: astore #15
    //   1770: aload #5
    //   1772: aload_3
    //   1773: invokevirtual O : ()LG/F;
    //   1776: invokevirtual as : ()I
    //   1779: invokevirtual c : (I)I
    //   1782: istore #15
    //   1784: invokestatic a : ()Lr/i;
    //   1787: ldc ' 98 98  0gep9gds09kfg09'
    //   1789: invokevirtual a : (Ljava/lang/String;)Z
    //   1792: ifne -> 1806
    //   1795: iload #15
    //   1797: bipush #15
    //   1799: if_icmple -> 1806
    //   1802: bipush #15
    //   1804: istore #15
    //   1806: aload_3
    //   1807: iload #15
    //   1809: invokevirtual c : (I)V
    //   1812: goto -> 1828
    //   1815: astore #15
    //   1817: aload_3
    //   1818: bipush #15
    //   1820: invokevirtual c : (I)V
    //   1823: ldc 'Unable to set Data Rate, using default 15/sec'
    //   1825: invokestatic d : (Ljava/lang/String;)V
    //   1828: invokestatic a : ()Lbs/C;
    //   1831: aload_3
    //   1832: invokevirtual a : (LG/R;)Ljava/util/ArrayList;
    //   1835: astore #15
    //   1837: goto -> 1850
    //   1840: astore #15
    //   1842: ldc 'Unable to get Wue Analyze Supported Curves.'
    //   1844: aload #15
    //   1846: aload_0
    //   1847: invokestatic a : (Ljava/lang/String;Ljava/lang/Exception;Ljava/lang/Object;)V
    //   1850: aload_3
    //   1851: aload #5
    //   1853: aload_3
    //   1854: invokevirtual c : ()Ljava/lang/String;
    //   1857: invokevirtual r : (Ljava/lang/String;)Ljava/lang/String;
    //   1860: invokevirtual D : (Ljava/lang/String;)V
    //   1863: aload #5
    //   1865: aload_3
    //   1866: invokevirtual a : (LG/R;)V
    //   1869: aload #5
    //   1871: invokevirtual C : ()Ljava/lang/String;
    //   1874: astore #15
    //   1876: aload #15
    //   1878: ifnonnull -> 1886
    //   1881: getstatic r/a.ba : Ljava/lang/String;
    //   1884: astore #15
    //   1886: new java/io/File
    //   1889: dup
    //   1890: aload_1
    //   1891: invokespecial <init> : (Ljava/lang/String;)V
    //   1894: invokestatic d : (Ljava/io/File;)LB/i;
    //   1897: astore #16
    //   1899: aload #16
    //   1901: ifnonnull -> 1904
    //   1904: aload #16
    //   1906: ifnull -> 1939
    //   1909: aload #16
    //   1911: invokevirtual e : ()Ljava/lang/String;
    //   1914: ifnull -> 1939
    //   1917: aload #16
    //   1919: invokevirtual e : ()Ljava/lang/String;
    //   1922: invokevirtual isEmpty : ()Z
    //   1925: ifne -> 1939
    //   1928: invokestatic c : ()LB/b;
    //   1931: aload #16
    //   1933: invokevirtual a : (LB/i;)V
    //   1936: goto -> 1946
    //   1939: invokestatic c : ()LB/b;
    //   1942: aconst_null
    //   1943: invokevirtual a : (LB/i;)V
    //   1946: aload_3
    //   1947: invokestatic a : ()Lz/c;
    //   1950: aload_3
    //   1951: aload #15
    //   1953: invokestatic c : ()LA/i;
    //   1956: aload #16
    //   1958: aconst_null
    //   1959: invokevirtual a : (LG/R;Ljava/lang/String;LA/i;LB/i;Ljava/lang/String;)LG/J;
    //   1962: invokevirtual c : (LG/J;)LG/J;
    //   1965: pop
    //   1966: goto -> 2133
    //   1969: astore #17
    //   1971: ldc 'Unable to load Communication Driver.'
    //   1973: invokestatic a : ()LaP/dd;
    //   1976: invokevirtual c : ()Ljavax/swing/JFrame;
    //   1979: invokestatic d : (Ljava/lang/String;Ljava/awt/Component;)V
    //   1982: new java/lang/StringBuilder
    //   1985: dup
    //   1986: invokespecial <init> : ()V
    //   1989: ldc 'Unable to load Communication Driver: '
    //   1991: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1994: aload #15
    //   1996: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1999: invokevirtual toString : ()Ljava/lang/String;
    //   2002: invokestatic a : (Ljava/lang/String;)V
    //   2005: aload #17
    //   2007: invokestatic a : (Ljava/lang/Exception;)V
    //   2010: aload_3
    //   2011: invokestatic a : ()Lz/c;
    //   2014: aload_3
    //   2015: invokestatic c : ()LA/i;
    //   2018: invokeinterface b : ()LA/q;
    //   2023: invokevirtual a : ()Ljava/lang/String;
    //   2026: invokestatic c : ()LA/i;
    //   2029: aload #16
    //   2031: aconst_null
    //   2032: invokevirtual a : (LG/R;Ljava/lang/String;LA/i;LB/i;Ljava/lang/String;)LG/J;
    //   2035: invokevirtual c : (LG/J;)LG/J;
    //   2038: pop
    //   2039: goto -> 2100
    //   2042: astore #18
    //   2044: new java/lang/StringBuilder
    //   2047: dup
    //   2048: invokespecial <init> : ()V
    //   2051: ldc 'Unable to load Communication Driver again: '
    //   2053: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2056: aload #15
    //   2058: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2061: invokevirtual toString : ()Ljava/lang/String;
    //   2064: invokestatic a : (Ljava/lang/String;)V
    //   2067: goto -> 2100
    //   2070: astore #18
    //   2072: new java/lang/StringBuilder
    //   2075: dup
    //   2076: invokespecial <init> : ()V
    //   2079: ldc 'Unable to load Communication Driver: '
    //   2081: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2084: aload #15
    //   2086: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2089: invokevirtual toString : ()Ljava/lang/String;
    //   2092: invokestatic a : (Ljava/lang/String;)V
    //   2095: aload #18
    //   2097: invokevirtual printStackTrace : ()V
    //   2100: goto -> 2133
    //   2103: astore #17
    //   2105: new java/lang/StringBuilder
    //   2108: dup
    //   2109: invokespecial <init> : ()V
    //   2112: ldc 'Unable to load Communication Driver: '
    //   2114: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2117: aload #15
    //   2119: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2122: invokevirtual toString : ()Ljava/lang/String;
    //   2125: invokestatic a : (Ljava/lang/String;)V
    //   2128: aload #17
    //   2130: invokevirtual printStackTrace : ()V
    //   2133: iload_2
    //   2134: ifeq -> 2147
    //   2137: aload_3
    //   2138: invokevirtual C : ()LG/J;
    //   2141: instanceof bQ/l
    //   2144: ifne -> 2932
    //   2147: aload #5
    //   2149: invokevirtual I : ()Ljava/util/Iterator;
    //   2152: astore #17
    //   2154: aload #17
    //   2156: invokeinterface hasNext : ()Z
    //   2161: ifeq -> 2932
    //   2164: aload #17
    //   2166: invokeinterface next : ()Ljava/lang/Object;
    //   2171: checkcast aE/d
    //   2174: astore #18
    //   2176: new W/ab
    //   2179: dup
    //   2180: invokespecial <init> : ()V
    //   2183: astore #19
    //   2185: aload #19
    //   2187: invokestatic b : ()Z
    //   2190: invokevirtual a : (Z)V
    //   2193: aload #18
    //   2195: aload #5
    //   2197: invokevirtual a : (LaE/a;)Ljava/lang/String;
    //   2200: astore #20
    //   2202: new G/R
    //   2205: dup
    //   2206: invokespecial <init> : ()V
    //   2209: astore #21
    //   2211: aload #21
    //   2213: aload_1
    //   2214: invokevirtual q : (Ljava/lang/String;)V
    //   2217: aload #21
    //   2219: aload #18
    //   2221: invokevirtual a : ()Ljava/lang/String;
    //   2224: invokevirtual a : (Ljava/lang/String;)V
    //   2227: aload #18
    //   2229: invokevirtual d : ()[Ljava/lang/String;
    //   2232: astore #12
    //   2234: new G/F
    //   2237: dup
    //   2238: invokespecial <init> : ()V
    //   2241: astore #22
    //   2243: aload #22
    //   2245: aload #21
    //   2247: invokevirtual a : (LG/aI;)V
    //   2250: aload #21
    //   2252: aload #22
    //   2254: invokevirtual a : (LG/F;)V
    //   2257: iconst_0
    //   2258: istore #23
    //   2260: iload #23
    //   2262: aload #12
    //   2264: arraylength
    //   2265: if_icmpge -> 2291
    //   2268: aload #21
    //   2270: new G/r
    //   2273: dup
    //   2274: aload #12
    //   2276: iload #23
    //   2278: aaload
    //   2279: invokespecial <init> : (Ljava/lang/String;)V
    //   2282: invokevirtual a : (LG/r;)V
    //   2285: iinc #23, 1
    //   2288: goto -> 2260
    //   2291: aload #21
    //   2293: ldc 'tsCanId'
    //   2295: invokevirtual c : (Ljava/lang/String;)LG/aM;
    //   2298: ifnonnull -> 2316
    //   2301: aload #19
    //   2303: aload #21
    //   2305: getstatic r/j.G : Ljava/lang/String;
    //   2308: iconst_0
    //   2309: iload #6
    //   2311: invokevirtual a : (LG/R;Ljava/lang/String;ZZ)LG/R;
    //   2314: astore #21
    //   2316: aload #21
    //   2318: invokevirtual O : ()LG/F;
    //   2321: aload #18
    //   2323: invokevirtual e : ()I
    //   2326: invokevirtual r : (I)V
    //   2329: aload #19
    //   2331: aload #21
    //   2333: aload #20
    //   2335: iconst_1
    //   2336: iload #6
    //   2338: invokevirtual a : (LG/R;Ljava/lang/String;ZZ)LG/R;
    //   2341: astore #21
    //   2343: invokestatic a : ()LI/p;
    //   2346: aload #21
    //   2348: invokevirtual a : (LG/R;)V
    //   2351: goto -> 2400
    //   2354: astore #23
    //   2356: new java/lang/StringBuilder
    //   2359: dup
    //   2360: invokespecial <init> : ()V
    //   2363: ldc 'Failed to load Supplemental ECU Definition for Controller '
    //   2365: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2368: aload #21
    //   2370: invokevirtual c : ()Ljava/lang/String;
    //   2373: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2376: ldc '. Message:'
    //   2378: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2381: aload #23
    //   2383: invokevirtual getLocalizedMessage : ()Ljava/lang/String;
    //   2386: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2389: invokevirtual toString : ()Ljava/lang/String;
    //   2392: invokestatic b : (Ljava/lang/String;)V
    //   2395: aload #23
    //   2397: invokevirtual printStackTrace : ()V
    //   2400: aload #21
    //   2402: invokestatic a : ()Ls/a;
    //   2405: invokevirtual a : (Ljava/util/Map;)V
    //   2408: aload #5
    //   2410: aload #21
    //   2412: invokevirtual c : ()Ljava/lang/String;
    //   2415: invokevirtual k : (Ljava/lang/String;)Ljava/lang/String;
    //   2418: astore #23
    //   2420: new java/io/File
    //   2423: dup
    //   2424: aload #23
    //   2426: invokespecial <init> : (Ljava/lang/String;)V
    //   2429: invokevirtual exists : ()Z
    //   2432: ifeq -> 2469
    //   2435: aload #19
    //   2437: iconst_1
    //   2438: invokevirtual b : (Z)V
    //   2441: aload #19
    //   2443: aload #21
    //   2445: aload #5
    //   2447: aload #21
    //   2449: invokevirtual c : ()Ljava/lang/String;
    //   2452: invokevirtual k : (Ljava/lang/String;)Ljava/lang/String;
    //   2455: iconst_1
    //   2456: iload #6
    //   2458: invokevirtual a : (LG/R;Ljava/lang/String;ZZ)LG/R;
    //   2461: astore #21
    //   2463: aload #19
    //   2465: iconst_0
    //   2466: invokevirtual b : (Z)V
    //   2469: aload #21
    //   2471: invokestatic a : (LG/R;)V
    //   2474: goto -> 2497
    //   2477: astore #23
    //   2479: aload #23
    //   2481: invokevirtual printStackTrace : ()V
    //   2484: new V/a
    //   2487: dup
    //   2488: aload #23
    //   2490: invokevirtual getMessage : ()Ljava/lang/String;
    //   2493: invokespecial <init> : (Ljava/lang/String;)V
    //   2496: athrow
    //   2497: iload_2
    //   2498: ifeq -> 2523
    //   2501: aload_3
    //   2502: invokevirtual C : ()LG/J;
    //   2505: instanceof bQ/l
    //   2508: ifne -> 2523
    //   2511: aload #21
    //   2513: invokevirtual O : ()LG/F;
    //   2516: iconst_1
    //   2517: invokevirtual n : (Z)V
    //   2520: goto -> 2678
    //   2523: aload_3
    //   2524: invokevirtual C : ()LG/J;
    //   2527: instanceof bQ/l
    //   2530: ifeq -> 2665
    //   2533: aload #21
    //   2535: invokestatic a : ()Lz/c;
    //   2538: aload #21
    //   2540: aload #15
    //   2542: invokestatic c : ()LA/i;
    //   2545: aload #16
    //   2547: aload #21
    //   2549: invokevirtual c : ()Ljava/lang/String;
    //   2552: invokevirtual a : (LG/R;Ljava/lang/String;LA/i;LB/i;Ljava/lang/String;)LG/J;
    //   2555: invokevirtual c : (LG/J;)LG/J;
    //   2558: pop
    //   2559: goto -> 2678
    //   2562: astore #23
    //   2564: ldc 'Unable to load Communication Driver for CAN Device.'
    //   2566: invokestatic a : ()LaP/dd;
    //   2569: invokevirtual c : ()Ljavax/swing/JFrame;
    //   2572: invokestatic d : (Ljava/lang/String;Ljava/awt/Component;)V
    //   2575: new java/lang/StringBuilder
    //   2578: dup
    //   2579: invokespecial <init> : ()V
    //   2582: ldc 'Unable to load Communication Driver '
    //   2584: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2587: aload #15
    //   2589: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2592: ldc ' for CAN Device: '
    //   2594: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2597: aload #21
    //   2599: invokevirtual c : ()Ljava/lang/String;
    //   2602: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2605: invokevirtual toString : ()Ljava/lang/String;
    //   2608: invokestatic a : (Ljava/lang/String;)V
    //   2611: aload #23
    //   2613: invokestatic a : (Ljava/lang/Exception;)V
    //   2616: goto -> 2678
    //   2619: astore #23
    //   2621: new java/lang/StringBuilder
    //   2624: dup
    //   2625: invokespecial <init> : ()V
    //   2628: ldc 'Unable to load Communication Driver '
    //   2630: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2633: aload #15
    //   2635: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2638: ldc ' for CAN Device: '
    //   2640: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2643: aload #21
    //   2645: invokevirtual c : ()Ljava/lang/String;
    //   2648: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2651: invokevirtual toString : ()Ljava/lang/String;
    //   2654: invokestatic a : (Ljava/lang/String;)V
    //   2657: aload #23
    //   2659: invokevirtual printStackTrace : ()V
    //   2662: goto -> 2678
    //   2665: aload_3
    //   2666: invokevirtual C : ()LG/J;
    //   2669: astore #23
    //   2671: aload #21
    //   2673: aload #23
    //   2675: invokevirtual a : (LG/J;)V
    //   2678: aload #21
    //   2680: invokevirtual O : ()LG/F;
    //   2683: iconst_1
    //   2684: invokevirtual b : (Z)V
    //   2687: aload #21
    //   2689: invokevirtual O : ()LG/F;
    //   2692: aload #18
    //   2694: invokevirtual f : ()Z
    //   2697: invokevirtual c : (Z)V
    //   2700: aload #5
    //   2702: aload #21
    //   2704: invokevirtual c : ()Ljava/lang/String;
    //   2707: invokevirtual d : (Ljava/lang/String;)Ljava/io/File;
    //   2710: astore #23
    //   2712: aload #23
    //   2714: invokevirtual exists : ()Z
    //   2717: ifeq -> 2790
    //   2720: new W/aa
    //   2723: dup
    //   2724: invokespecial <init> : ()V
    //   2727: astore #24
    //   2729: aload #24
    //   2731: aload #21
    //   2733: aload #23
    //   2735: invokevirtual getAbsolutePath : ()Ljava/lang/String;
    //   2738: invokevirtual a : (LG/R;Ljava/lang/String;)V
    //   2741: goto -> 2790
    //   2744: astore #25
    //   2746: new java/lang/StringBuilder
    //   2749: dup
    //   2750: invokespecial <init> : ()V
    //   2753: aload #23
    //   2755: invokevirtual getName : ()Ljava/lang/String;
    //   2758: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2761: ldc ' either missing or invalid for '
    //   2763: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2766: aload_3
    //   2767: invokevirtual c : ()Ljava/lang/String;
    //   2770: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2773: invokevirtual toString : ()Ljava/lang/String;
    //   2776: invokestatic d : (Ljava/lang/String;)V
    //   2779: aload #25
    //   2781: invokevirtual printStackTrace : ()V
    //   2784: aload #23
    //   2786: invokevirtual delete : ()Z
    //   2789: pop
    //   2790: aload #4
    //   2792: aload #21
    //   2794: invokevirtual a : (LG/R;)V
    //   2797: aload #5
    //   2799: aload #21
    //   2801: invokevirtual a : (LG/R;)V
    //   2804: aload #18
    //   2806: invokevirtual e : ()I
    //   2809: istore #24
    //   2811: aload #21
    //   2813: ldc 'tsCanId'
    //   2815: invokevirtual c : (Ljava/lang/String;)LG/aM;
    //   2818: astore #25
    //   2820: aload #25
    //   2822: ifnull -> 2886
    //   2825: aload #25
    //   2827: aload #21
    //   2829: invokevirtual p : ()LG/Y;
    //   2832: iload #24
    //   2834: i2d
    //   2835: invokevirtual a : (LG/Y;D)V
    //   2838: goto -> 2860
    //   2841: astore #26
    //   2843: ldc aP/ie
    //   2845: invokevirtual getName : ()Ljava/lang/String;
    //   2848: invokestatic getLogger : (Ljava/lang/String;)Ljava/util/logging/Logger;
    //   2851: getstatic java/util/logging/Level.SEVERE : Ljava/util/logging/Level;
    //   2854: aconst_null
    //   2855: aload #26
    //   2857: invokevirtual log : (Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   2860: invokestatic a : ()LG/aR;
    //   2863: aload #18
    //   2865: invokevirtual a : ()Ljava/lang/String;
    //   2868: aload #25
    //   2870: invokevirtual aL : ()Ljava/lang/String;
    //   2873: new aP/if
    //   2876: dup
    //   2877: aload_0
    //   2878: aload #18
    //   2880: invokespecial <init> : (LaP/ie;LaE/d;)V
    //   2883: invokevirtual a : (Ljava/lang/String;Ljava/lang/String;LG/aN;)V
    //   2886: aload #21
    //   2888: invokevirtual O : ()LG/F;
    //   2891: iload #24
    //   2893: invokevirtual r : (I)V
    //   2896: aload #21
    //   2898: aload #18
    //   2900: invokevirtual h : ()Ljava/lang/String;
    //   2903: invokevirtual D : (Ljava/lang/String;)V
    //   2906: goto -> 2929
    //   2909: astore #19
    //   2911: aload #19
    //   2913: invokevirtual printStackTrace : ()V
    //   2916: new V/a
    //   2919: dup
    //   2920: aload #19
    //   2922: invokevirtual getMessage : ()Ljava/lang/String;
    //   2925: invokespecial <init> : (Ljava/lang/String;)V
    //   2928: athrow
    //   2929: goto -> 2154
    //   2932: aload #5
    //   2934: invokevirtual x : ()Ljava/lang/String;
    //   2937: astore #17
    //   2939: new java/io/File
    //   2942: dup
    //   2943: aload #17
    //   2945: invokespecial <init> : (Ljava/lang/String;)V
    //   2948: invokevirtual exists : ()Z
    //   2951: ifeq -> 2998
    //   2954: new W/ab
    //   2957: dup
    //   2958: invokespecial <init> : ()V
    //   2961: astore #18
    //   2963: aload #18
    //   2965: invokestatic b : ()Z
    //   2968: invokevirtual a : (Z)V
    //   2971: aload #18
    //   2973: iconst_1
    //   2974: invokevirtual b : (Z)V
    //   2977: aload #18
    //   2979: aload_3
    //   2980: aload #5
    //   2982: invokevirtual x : ()Ljava/lang/String;
    //   2985: iconst_1
    //   2986: iload #6
    //   2988: invokevirtual a : (LG/R;Ljava/lang/String;ZZ)LG/R;
    //   2991: astore_3
    //   2992: aload #18
    //   2994: iconst_0
    //   2995: invokevirtual b : (Z)V
    //   2998: goto -> 3008
    //   3001: astore #17
    //   3003: aload #17
    //   3005: invokevirtual printStackTrace : ()V
    //   3008: new aP/Z
    //   3011: dup
    //   3012: aload #5
    //   3014: invokespecial <init> : (LaE/a;)V
    //   3017: astore #17
    //   3019: aload #4
    //   3021: aload_3
    //   3022: invokevirtual a : (LG/R;)V
    //   3025: aload_3
    //   3026: ldc 'tsCanId'
    //   3028: invokevirtual c : (Ljava/lang/String;)LG/aM;
    //   3031: ifnull -> 3070
    //   3034: invokestatic a : ()LG/aR;
    //   3037: aload_3
    //   3038: invokevirtual c : ()Ljava/lang/String;
    //   3041: ldc 'tsCanId'
    //   3043: aload #17
    //   3045: invokevirtual a : (Ljava/lang/String;Ljava/lang/String;LG/aN;)V
    //   3048: goto -> 3070
    //   3051: astore #18
    //   3053: ldc aP/f
    //   3055: invokevirtual getName : ()Ljava/lang/String;
    //   3058: invokestatic getLogger : (Ljava/lang/String;)Ljava/util/logging/Logger;
    //   3061: getstatic java/util/logging/Level.SEVERE : Ljava/util/logging/Level;
    //   3064: aconst_null
    //   3065: aload #18
    //   3067: invokevirtual log : (Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   3070: aload #5
    //   3072: areturn
    // Exception table:
    //   from	to	target	type
    //   603	842	845	java/io/IOException
    //   603	842	876	java/lang/ClassNotFoundException
    //   774	811	814	java/lang/Exception
    //   1028	1059	1062	V/g
    //   1108	1167	1170	V/g
    //   1120	1127	1130	V/g
    //   1229	1261	1264	java/lang/Exception
    //   1475	1642	1645	java/lang/Exception
    //   1503	1514	1517	java/lang/Exception
    //   1599	1611	1614	java/lang/Exception
    //   1703	1719	1722	java/lang/Exception
    //   1749	1765	1768	java/lang/Exception
    //   1770	1812	1815	java/lang/NumberFormatException
    //   1828	1837	1840	V/g
    //   1946	1966	1969	java/lang/Exception
    //   1946	1966	2103	java/lang/Error
    //   2010	2039	2042	java/lang/Exception
    //   2010	2039	2070	java/lang/Error
    //   2176	2906	2909	V/g
    //   2343	2351	2354	V/g
    //   2408	2474	2477	V/g
    //   2533	2559	2562	java/lang/Exception
    //   2533	2559	2619	java/lang/Error
    //   2729	2741	2744	java/lang/Exception
    //   2825	2838	2841	java/lang/Exception
    //   2932	2998	3001	java/lang/Exception
    //   3034	3048	3051	V/a
  }
  
  public a a(String paramString, File paramFile, r[] paramArrayOfr) {
    a a = new a();
    a.h(j.u() + "Temp");
    a.i("Temp");
    R r1 = new R();
    r1.a(a.u());
    r1.a((Map)a.a());
    if (paramArrayOfr != null) {
      for (byte b = 0; b < paramArrayOfr.length; b++)
        r1.a(paramArrayOfr[b]); 
      a.a(paramArrayOfr);
    } 
    ab ab = new ab();
    ab.a(b());
    try {
      r1.q(a.t());
      r1 = ab.a(r1, paramFile.getCanonicalPath());
      r1.c(c.a().a(r1, a.ba, w.c(), null, null));
      r1.O().b(a.r());
    } catch (Exception exception) {
      exception.printStackTrace();
      throw new a("Error loading Configuration based on \n" + paramFile.getAbsolutePath(), exception);
    } 
    a.a();
    a.l(paramFile.getName());
    t.a(paramFile, a.j());
    a.p("Temporary Project for viewing " + a.cw + " files");
    a.a(paramArrayOfr);
    Z z = (new aa()).a(r1, "FrontPage", 2, 4);
    z.b(paramString);
    if (!a.U()) {
      c c = new c(j.G());
      c.a(a.l().getAbsolutePath(), z);
      a.o(a.n());
    } else {
      a.e();
    } 
    a.b();
    return a;
  }
  
  public a a(String paramString1, String paramString2, File paramFile, r[] paramArrayOfr) {
    a a = new a();
    a.e(i.a().a("poij fe07r32;lkjrew09345rv"));
    String str1 = j.u() + paramString1;
    a.h(str1);
    a.i(paramString1);
    R r1 = new R();
    r1.a(a.u());
    r1.a((Map)a.a());
    if (paramArrayOfr != null) {
      for (byte b = 0; b < paramArrayOfr.length; b++)
        r1.a(paramArrayOfr[b]); 
      a.a(paramArrayOfr);
    } 
    ab ab = new ab();
    i i = j.d(new File(str1));
    try {
      r1.q(a.t());
      r1 = ab.a(r1, paramFile.getCanonicalPath());
      r1.c(c.a().a(r1, a.ba, w.c(), i, null));
      T.a().a(r1);
      r1.O().b(a.r());
    } catch (Exception exception) {
      exception.printStackTrace();
      throw new a("Error loading Configuration based on \n" + paramFile.getAbsolutePath(), exception);
    } 
    a.a();
    a.l(paramFile.getName());
    String str2 = paramFile.getName().toLowerCase().endsWith(".ecu") ? "mainController.ecu" : "mainController.ini";
    a.l(str2);
    t.a(paramFile, a.j());
    String str3 = "Project " + paramString1;
    if (b.c().d() != null && !b.c().d().e().isEmpty()) {
      str3 = str3 + "\nfor serial Number: " + b.c().d().e();
      a.c(paramString1, l.a);
    } 
    a.p(str3);
    a.a(paramArrayOfr);
    Z z = (new aa()).a(r1, "FrontPage", 2, 4);
    z.b(paramString2);
    c c = new c(j.G());
    if (!a.l().exists())
      c.a(a.l().getAbsolutePath(), z); 
    a.o(a.n());
    if (r1.C() instanceof l) {
      f f = ((l)r1.C()).a();
      j.a().a(paramString1, f.h());
      j.a().a(paramString1, f);
      v.a().a(paramString1, f.h());
      v.a().a(paramString1, f);
    } 
    if (a.U())
      a.e(); 
    a.b();
    return a;
  }
  
  public boolean a() {
    return this.a;
  }
  
  public static boolean b() {
    return b;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/ie.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */