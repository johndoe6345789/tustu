package ak;

import V.ExceptionInVPackage;
import W.ah;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AkComponentBravo extends g {
  float ExceptionInVPackage = 20.0F;
  
  float b = 0.0F;
  
  public AkComponentBravo() {
    super("\",\"", false);
  }
  
  protected int b(String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: aload_0
    //   2: aload_1
    //   3: invokevirtual c : (Ljava/lang/String;)Ljava/lang/String;
    //   6: invokevirtual l : (Ljava/lang/String;)V
    //   9: ldc ''
    //   11: astore_2
    //   12: ldc ''
    //   14: astore_3
    //   15: ldc ''
    //   17: astore #4
    //   19: ldc ''
    //   21: astore #5
    //   23: ldc ''
    //   25: astore #6
    //   27: iconst_0
    //   28: istore #7
    //   30: aconst_null
    //   31: astore #8
    //   33: aload_0
    //   34: new java/io/File
    //   37: dup
    //   38: aload_1
    //   39: invokespecial <init> : (Ljava/lang/String;)V
    //   42: putfield h : Ljava/io/File;
    //   45: new java/io/FileInputStream
    //   48: dup
    //   49: aload_0
    //   50: getfield h : Ljava/io/File;
    //   53: invokespecial <init> : (Ljava/io/File;)V
    //   56: astore #9
    //   58: iconst_2
    //   59: newarray byte
    //   61: astore #10
    //   63: aload #9
    //   65: aload #10
    //   67: invokevirtual read : ([B)I
    //   70: pop
    //   71: aload #10
    //   73: iconst_0
    //   74: baload
    //   75: iconst_m1
    //   76: if_icmpne -> 122
    //   79: aload #10
    //   81: iconst_1
    //   82: baload
    //   83: bipush #-2
    //   85: if_icmpne -> 122
    //   88: aload_0
    //   89: ldc 'UTF-16LE'
    //   91: putfield j : Ljava/lang/String;
    //   94: new java/lang/StringBuilder
    //   97: dup
    //   98: invokespecial <init> : ()V
    //   101: aload_0
    //   102: getfield j : Ljava/lang/String;
    //   105: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   108: ldc ' detected.'
    //   110: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   113: invokevirtual toString : ()Ljava/lang/String;
    //   116: invokestatic c : (Ljava/lang/String;)V
    //   119: goto -> 270
    //   122: aload #10
    //   124: iconst_0
    //   125: baload
    //   126: bipush #-2
    //   128: if_icmpne -> 173
    //   131: aload #10
    //   133: iconst_1
    //   134: baload
    //   135: iconst_m1
    //   136: if_icmpne -> 173
    //   139: aload_0
    //   140: ldc 'UTF-16BE'
    //   142: putfield j : Ljava/lang/String;
    //   145: new java/lang/StringBuilder
    //   148: dup
    //   149: invokespecial <init> : ()V
    //   152: aload_0
    //   153: getfield j : Ljava/lang/String;
    //   156: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   159: ldc ' detected.'
    //   161: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   164: invokevirtual toString : ()Ljava/lang/String;
    //   167: invokestatic c : (Ljava/lang/String;)V
    //   170: goto -> 270
    //   173: aload #10
    //   175: iconst_0
    //   176: baload
    //   177: bipush #-17
    //   179: if_icmpne -> 247
    //   182: aload #10
    //   184: iconst_1
    //   185: baload
    //   186: bipush #-69
    //   188: if_icmpne -> 247
    //   191: iconst_1
    //   192: newarray byte
    //   194: astore #10
    //   196: aload #9
    //   198: aload #10
    //   200: invokevirtual read : ([B)I
    //   203: pop
    //   204: aload_0
    //   205: ldc 'UTF-8'
    //   207: putfield j : Ljava/lang/String;
    //   210: aload #10
    //   212: iconst_0
    //   213: baload
    //   214: bipush #-65
    //   216: if_icmpne -> 270
    //   219: new java/lang/StringBuilder
    //   222: dup
    //   223: invokespecial <init> : ()V
    //   226: aload_0
    //   227: getfield j : Ljava/lang/String;
    //   230: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   233: ldc ' detected.'
    //   235: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   238: invokevirtual toString : ()Ljava/lang/String;
    //   241: invokestatic c : (Ljava/lang/String;)V
    //   244: goto -> 270
    //   247: aload #9
    //   249: invokevirtual close : ()V
    //   252: goto -> 257
    //   255: astore #11
    //   257: new java/io/FileInputStream
    //   260: dup
    //   261: aload_0
    //   262: getfield h : Ljava/io/File;
    //   265: invokespecial <init> : (Ljava/io/File;)V
    //   268: astore #9
    //   270: new W/ah
    //   273: dup
    //   274: new java/io/InputStreamReader
    //   277: dup
    //   278: aload #9
    //   280: aload_0
    //   281: getfield j : Ljava/lang/String;
    //   284: invokespecial <init> : (Ljava/io/InputStream;Ljava/lang/String;)V
    //   287: invokespecial <init> : (Ljava/io/Reader;)V
    //   290: astore #8
    //   292: aload #8
    //   294: invokevirtual ExceptionInVPackage : ()Ljava/lang/String;
    //   297: astore_2
    //   298: aload_2
    //   299: ifnonnull -> 343
    //   302: iload #7
    //   304: iconst_1
    //   305: isub
    //   306: istore #11
    //   308: aload #8
    //   310: ifnull -> 340
    //   313: aload #8
    //   315: invokevirtual close : ()V
    //   318: goto -> 340
    //   321: astore #12
    //   323: ldc ak/g
    //   325: invokevirtual getName : ()Ljava/lang/String;
    //   328: invokestatic getLogger : (Ljava/lang/String;)Ljava/util/logging/Logger;
    //   331: getstatic java/util/logging/Level.SEVERE : Ljava/util/logging/Level;
    //   334: aconst_null
    //   335: aload #12
    //   337: invokevirtual log : (Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   340: iload #11
    //   342: ireturn
    //   343: iload #7
    //   345: ifeq -> 356
    //   348: aload_0
    //   349: aload_2
    //   350: invokevirtual b_ : (Ljava/lang/String;)Z
    //   353: ifne -> 599
    //   356: aload_2
    //   357: ifnonnull -> 401
    //   360: iload #7
    //   362: iconst_1
    //   363: isub
    //   364: istore #11
    //   366: aload #8
    //   368: ifnull -> 398
    //   371: aload #8
    //   373: invokevirtual close : ()V
    //   376: goto -> 398
    //   379: astore #12
    //   381: ldc ak/g
    //   383: invokevirtual getName : ()Ljava/lang/String;
    //   386: invokestatic getLogger : (Ljava/lang/String;)Ljava/util/logging/Logger;
    //   389: getstatic java/util/logging/Level.SEVERE : Ljava/util/logging/Level;
    //   392: aconst_null
    //   393: aload #12
    //   395: invokevirtual log : (Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   398: iload #11
    //   400: ireturn
    //   401: aload_2
    //   402: ldc 'MARK'
    //   404: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   407: ifne -> 426
    //   410: aload #5
    //   412: astore #6
    //   414: aload #4
    //   416: astore #5
    //   418: aload_3
    //   419: astore #4
    //   421: aload_2
    //   422: astore_3
    //   423: iinc #7, 1
    //   426: aload_2
    //   427: ldc 'Sample Rate'
    //   429: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   432: ifeq -> 478
    //   435: aload_2
    //   436: ldc ','
    //   438: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   441: ifeq -> 478
    //   444: aload_2
    //   445: aload_2
    //   446: ldc ','
    //   448: invokevirtual indexOf : (Ljava/lang/String;)I
    //   451: iconst_2
    //   452: iadd
    //   453: invokevirtual substring : (I)Ljava/lang/String;
    //   456: astore #11
    //   458: aload #11
    //   460: ldc '"'
    //   462: ldc ''
    //   464: invokestatic b : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   467: astore #11
    //   469: aload_0
    //   470: aload #11
    //   472: invokestatic parseFloat : (Ljava/lang/String;)F
    //   475: putfield ExceptionInVPackage : F
    //   478: aload #8
    //   480: invokevirtual ExceptionInVPackage : ()Ljava/lang/String;
    //   483: astore_2
    //   484: aload_2
    //   485: ifnull -> 517
    //   488: aload_2
    //   489: invokevirtual length : ()I
    //   492: iconst_2
    //   493: if_icmple -> 517
    //   496: aload_2
    //   497: ldc '",'
    //   499: invokevirtual endsWith : (Ljava/lang/String;)Z
    //   502: ifeq -> 517
    //   505: aload_2
    //   506: iconst_0
    //   507: aload_2
    //   508: invokevirtual length : ()I
    //   511: iconst_2
    //   512: isub
    //   513: invokevirtual substring : (II)Ljava/lang/String;
    //   516: astore_2
    //   517: aload_2
    //   518: ifnull -> 343
    //   521: aload_2
    //   522: invokevirtual length : ()I
    //   525: iconst_2
    //   526: if_icmple -> 343
    //   529: aload_2
    //   530: ldc ','
    //   532: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   535: ifeq -> 343
    //   538: aload_2
    //   539: ldc '","'
    //   541: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   544: ifeq -> 576
    //   547: aload_0
    //   548: ldc '","'
    //   550: invokevirtual l : (Ljava/lang/String;)V
    //   553: new java/lang/StringBuilder
    //   556: dup
    //   557: invokespecial <init> : ()V
    //   560: ldc '"0"'
    //   562: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   565: aload_2
    //   566: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   569: invokevirtual toString : ()Ljava/lang/String;
    //   572: astore_2
    //   573: goto -> 343
    //   576: new java/lang/StringBuilder
    //   579: dup
    //   580: invokespecial <init> : ()V
    //   583: ldc '0'
    //   585: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   588: aload_2
    //   589: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   592: invokevirtual toString : ()Ljava/lang/String;
    //   595: astore_2
    //   596: goto -> 343
    //   599: aload_0
    //   600: getfield u : Z
    //   603: ifeq -> 615
    //   606: aload_0
    //   607: aload_0
    //   608: aload_2
    //   609: invokevirtual h : (Ljava/lang/String;)Ljava/lang/String;
    //   612: invokevirtual l : (Ljava/lang/String;)V
    //   615: aload_0
    //   616: aload_2
    //   617: aload_0
    //   618: invokevirtual r : ()Ljava/lang/String;
    //   621: invokevirtual d : (Ljava/lang/String;Ljava/lang/String;)I
    //   624: istore #11
    //   626: iload #7
    //   628: iconst_4
    //   629: if_icmplt -> 712
    //   632: iload #11
    //   634: iconst_5
    //   635: if_icmple -> 712
    //   638: aload_0
    //   639: aload #6
    //   641: aload_0
    //   642: invokevirtual r : ()Ljava/lang/String;
    //   645: invokevirtual d : (Ljava/lang/String;Ljava/lang/String;)I
    //   648: iload #11
    //   650: isub
    //   651: invokestatic abs : (I)I
    //   654: iconst_2
    //   655: if_icmpge -> 712
    //   658: aload_0
    //   659: aload #6
    //   661: aload_0
    //   662: invokevirtual r : ()Ljava/lang/String;
    //   665: invokevirtual b : (Ljava/lang/String;Ljava/lang/String;)Z
    //   668: ifeq -> 712
    //   671: iload #7
    //   673: iconst_4
    //   674: isub
    //   675: istore #12
    //   677: aload #8
    //   679: ifnull -> 709
    //   682: aload #8
    //   684: invokevirtual close : ()V
    //   687: goto -> 709
    //   690: astore #13
    //   692: ldc ak/g
    //   694: invokevirtual getName : ()Ljava/lang/String;
    //   697: invokestatic getLogger : (Ljava/lang/String;)Ljava/util/logging/Logger;
    //   700: getstatic java/util/logging/Level.SEVERE : Ljava/util/logging/Level;
    //   703: aconst_null
    //   704: aload #13
    //   706: invokevirtual log : (Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   709: iload #12
    //   711: ireturn
    //   712: iload #7
    //   714: iconst_3
    //   715: if_icmplt -> 798
    //   718: iload #11
    //   720: iconst_5
    //   721: if_icmple -> 798
    //   724: aload_0
    //   725: aload #5
    //   727: aload_0
    //   728: invokevirtual r : ()Ljava/lang/String;
    //   731: invokevirtual d : (Ljava/lang/String;Ljava/lang/String;)I
    //   734: iload #11
    //   736: isub
    //   737: invokestatic abs : (I)I
    //   740: iconst_2
    //   741: if_icmpge -> 798
    //   744: aload_0
    //   745: aload #5
    //   747: aload_0
    //   748: invokevirtual r : ()Ljava/lang/String;
    //   751: invokevirtual b : (Ljava/lang/String;Ljava/lang/String;)Z
    //   754: ifeq -> 798
    //   757: iload #7
    //   759: iconst_3
    //   760: isub
    //   761: istore #12
    //   763: aload #8
    //   765: ifnull -> 795
    //   768: aload #8
    //   770: invokevirtual close : ()V
    //   773: goto -> 795
    //   776: astore #13
    //   778: ldc ak/g
    //   780: invokevirtual getName : ()Ljava/lang/String;
    //   783: invokestatic getLogger : (Ljava/lang/String;)Ljava/util/logging/Logger;
    //   786: getstatic java/util/logging/Level.SEVERE : Ljava/util/logging/Level;
    //   789: aconst_null
    //   790: aload #13
    //   792: invokevirtual log : (Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   795: iload #12
    //   797: ireturn
    //   798: iload #11
    //   800: iconst_5
    //   801: if_icmple -> 878
    //   804: aload_0
    //   805: aload #4
    //   807: aload_0
    //   808: invokevirtual r : ()Ljava/lang/String;
    //   811: invokevirtual d : (Ljava/lang/String;Ljava/lang/String;)I
    //   814: iload #11
    //   816: isub
    //   817: invokestatic abs : (I)I
    //   820: iconst_2
    //   821: if_icmpge -> 878
    //   824: aload_0
    //   825: aload #4
    //   827: aload_0
    //   828: invokevirtual r : ()Ljava/lang/String;
    //   831: invokevirtual b : (Ljava/lang/String;Ljava/lang/String;)Z
    //   834: ifeq -> 878
    //   837: iload #7
    //   839: iconst_2
    //   840: isub
    //   841: istore #12
    //   843: aload #8
    //   845: ifnull -> 875
    //   848: aload #8
    //   850: invokevirtual close : ()V
    //   853: goto -> 875
    //   856: astore #13
    //   858: ldc ak/g
    //   860: invokevirtual getName : ()Ljava/lang/String;
    //   863: invokestatic getLogger : (Ljava/lang/String;)Ljava/util/logging/Logger;
    //   866: getstatic java/util/logging/Level.SEVERE : Ljava/util/logging/Level;
    //   869: aconst_null
    //   870: aload #13
    //   872: invokevirtual log : (Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   875: iload #12
    //   877: ireturn
    //   878: iload #7
    //   880: iconst_1
    //   881: isub
    //   882: istore #12
    //   884: aload #8
    //   886: ifnull -> 916
    //   889: aload #8
    //   891: invokevirtual close : ()V
    //   894: goto -> 916
    //   897: astore #13
    //   899: ldc ak/g
    //   901: invokevirtual getName : ()Ljava/lang/String;
    //   904: invokestatic getLogger : (Ljava/lang/String;)Ljava/util/logging/Logger;
    //   907: getstatic java/util/logging/Level.SEVERE : Ljava/util/logging/Level;
    //   910: aconst_null
    //   911: aload #13
    //   913: invokevirtual log : (Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   916: iload #12
    //   918: ireturn
    //   919: astore #9
    //   921: new V/ExceptionInVPackage
    //   924: dup
    //   925: new java/lang/StringBuilder
    //   928: dup
    //   929: invokespecial <init> : ()V
    //   932: ldc 'Unable to open file for reading:\\n'
    //   934: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   937: aload_1
    //   938: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   941: invokevirtual toString : ()Ljava/lang/String;
    //   944: invokespecial <init> : (Ljava/lang/String;)V
    //   947: athrow
    //   948: astore #9
    //   950: new V/ExceptionInVPackage
    //   953: dup
    //   954: new java/lang/StringBuilder
    //   957: dup
    //   958: invokespecial <init> : ()V
    //   961: ldc 'Unable to read from file:\\n'
    //   963: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   966: aload_1
    //   967: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   970: invokevirtual toString : ()Ljava/lang/String;
    //   973: invokespecial <init> : (Ljava/lang/String;)V
    //   976: athrow
    //   977: astore #14
    //   979: aload #8
    //   981: ifnull -> 1011
    //   984: aload #8
    //   986: invokevirtual close : ()V
    //   989: goto -> 1011
    //   992: astore #15
    //   994: ldc ak/g
    //   996: invokevirtual getName : ()Ljava/lang/String;
    //   999: invokestatic getLogger : (Ljava/lang/String;)Ljava/util/logging/Logger;
    //   1002: getstatic java/util/logging/Level.SEVERE : Ljava/util/logging/Level;
    //   1005: aconst_null
    //   1006: aload #15
    //   1008: invokevirtual log : (Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   1011: aload #14
    //   1013: athrow
    // Exception table:
    //   from	to	target	type
    //   33	308	919	java/io/FileNotFoundException
    //   33	308	948	java/io/IOException
    //   33	308	977	finally
    //   247	252	255	java/lang/Exception
    //   313	318	321	java/io/IOException
    //   343	366	919	java/io/FileNotFoundException
    //   343	366	948	java/io/IOException
    //   343	366	977	finally
    //   371	376	379	java/io/IOException
    //   401	677	919	java/io/FileNotFoundException
    //   401	677	948	java/io/IOException
    //   401	677	977	finally
    //   682	687	690	java/io/IOException
    //   712	763	919	java/io/FileNotFoundException
    //   712	763	948	java/io/IOException
    //   712	763	977	finally
    //   768	773	776	java/io/IOException
    //   798	843	919	java/io/FileNotFoundException
    //   798	843	948	java/io/IOException
    //   798	843	977	finally
    //   848	853	856	java/io/IOException
    //   878	884	919	java/io/FileNotFoundException
    //   878	884	948	java/io/IOException
    //   878	884	977	finally
    //   889	894	897	java/io/IOException
    //   919	979	977	finally
    //   984	989	992	java/io/IOException
  }
  
  protected String c(String paramString) {
    boolean bool = false;
    ah ah = null;
    try {
      this.h = new File(paramString);
      FileInputStream fileInputStream = new FileInputStream(this.h);
      byte[] arrayOfByte = new byte[2];
      fileInputStream.read(arrayOfByte);
      ah = new ah(new InputStreamReader(fileInputStream, this.j));
      for (byte b1 = 0; b1 < 30; b1++)
        ah.ExceptionInVPackage(); 
      String str = ah.ExceptionInVPackage();
      if (str == null)
        return ","; 
      if (str.contains("\",\""))
        return "\",\""; 
      return ",";
    } catch (FileNotFoundException fileNotFoundException) {
      throw new ExceptionInVPackage("Unable to open file for reading:\n" + paramString);
    } catch (IOException iOException) {
      throw new ExceptionInVPackage("Unable to read from file:\n" + paramString);
    } finally {
      if (ah != null)
        try {
          ah.close();
        } catch (IOException iOException) {
          Logger.getLogger(g.class.getName()).log(Level.SEVERE, (String)null, iOException);
        }  
    } 
  }
  
  protected String l() {
    String str = super.l();
    if (str != null && str.startsWith(",")) {
      this.b = this.p * 1.0F / this.ExceptionInVPackage;
      if (r().equals(",")) {
        str = this.b + str;
      } else {
        str = "\"" + this.b + "\"" + str;
      } 
    } 
    return str;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ak/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */