package ac;

import W.n;

public class y {
  public static void a(n paramn, String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual g : ()Ljava/lang/String;
    //   4: astore_2
    //   5: aload_0
    //   6: invokevirtual h : ()Z
    //   9: ifeq -> 35
    //   12: aload_2
    //   13: ldc 'NEW_INFO_PROVIDER,[FooterData]'
    //   15: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   18: ifeq -> 35
    //   21: aload_2
    //   22: iconst_0
    //   23: aload_2
    //   24: ldc 'NEW_INFO_PROVIDER,[FooterData]'
    //   26: invokevirtual indexOf : (Ljava/lang/String;)I
    //   29: iconst_1
    //   30: isub
    //   31: invokevirtual substring : (II)Ljava/lang/String;
    //   34: astore_2
    //   35: aload_0
    //   36: invokevirtual h : ()Z
    //   39: ifeq -> 145
    //   42: new java/lang/StringBuilder
    //   45: dup
    //   46: aload_2
    //   47: invokespecial <init> : (Ljava/lang/String;)V
    //   50: astore_3
    //   51: aload_3
    //   52: ldc '\\n'
    //   54: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   57: ldc 'NEW_INFO_PROVIDER'
    //   59: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   62: ldc ',[FooterData],Type:'
    //   64: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   67: ldc 'Properties'
    //   69: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   72: ldc '\\n'
    //   74: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   77: pop
    //   78: aload_0
    //   79: invokevirtual i : ()Ljava/util/Collection;
    //   82: invokeinterface iterator : ()Ljava/util/Iterator;
    //   87: astore #4
    //   89: aload #4
    //   91: invokeinterface hasNext : ()Z
    //   96: ifeq -> 140
    //   99: aload #4
    //   101: invokeinterface next : ()Ljava/lang/Object;
    //   106: checkcast java/lang/String
    //   109: astore #5
    //   111: aload_3
    //   112: aload #5
    //   114: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   117: ldc '='
    //   119: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   122: aload_0
    //   123: aload #5
    //   125: invokevirtual f : (Ljava/lang/String;)Ljava/lang/String;
    //   128: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   131: ldc '\\n'
    //   133: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   136: pop
    //   137: goto -> 89
    //   140: aload_3
    //   141: invokevirtual toString : ()Ljava/lang/String;
    //   144: astore_2
    //   145: aconst_null
    //   146: astore_3
    //   147: new java/io/File
    //   150: dup
    //   151: aload_1
    //   152: invokespecial <init> : (Ljava/lang/String;)V
    //   155: astore #4
    //   157: new java/io/FileInputStream
    //   160: dup
    //   161: aload #4
    //   163: invokespecial <init> : (Ljava/io/File;)V
    //   166: astore_3
    //   167: new java/io/BufferedInputStream
    //   170: dup
    //   171: aload_3
    //   172: invokespecial <init> : (Ljava/io/InputStream;)V
    //   175: astore #5
    //   177: bipush #20
    //   179: newarray byte
    //   181: astore #6
    //   183: aload #5
    //   185: aload #6
    //   187: invokevirtual read : ([B)I
    //   190: istore #7
    //   192: iload #7
    //   194: aload #6
    //   196: arraylength
    //   197: if_icmpeq -> 210
    //   200: new java/io/IOException
    //   203: dup
    //   204: ldc 'Read incomplete header, file not valid?'
    //   206: invokespecial <init> : (Ljava/lang/String;)V
    //   209: athrow
    //   210: aload #6
    //   212: iconst_0
    //   213: baload
    //   214: bipush #77
    //   216: if_icmpne -> 255
    //   219: aload #6
    //   221: iconst_1
    //   222: baload
    //   223: bipush #76
    //   225: if_icmpne -> 255
    //   228: aload #6
    //   230: iconst_2
    //   231: baload
    //   232: bipush #86
    //   234: if_icmpne -> 255
    //   237: aload #6
    //   239: iconst_3
    //   240: baload
    //   241: bipush #76
    //   243: if_icmpne -> 255
    //   246: aload #6
    //   248: iconst_4
    //   249: baload
    //   250: bipush #71
    //   252: if_icmpeq -> 265
    //   255: new java/io/IOException
    //   258: dup
    //   259: ldc 'Not a valid .mlg file'
    //   261: invokespecial <init> : (Ljava/lang/String;)V
    //   264: athrow
    //   265: aload #6
    //   267: bipush #6
    //   269: iconst_2
    //   270: iconst_1
    //   271: iconst_0
    //   272: invokestatic a : ([BIIZZ)I
    //   275: istore #8
    //   277: iload #8
    //   279: iconst_3
    //   280: if_icmple -> 325
    //   283: new V/a
    //   286: dup
    //   287: new java/lang/StringBuilder
    //   290: dup
    //   291: invokespecial <init> : ()V
    //   294: ldc 'File Format Version: '
    //   296: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   299: iload #8
    //   301: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   304: ldc '\\nMaximum supported Format Version: '
    //   306: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   309: iconst_3
    //   310: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   313: ldc '\\nYou likely need a newer version of this application to load this file.'
    //   315: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   318: invokevirtual toString : ()Ljava/lang/String;
    //   321: invokespecial <init> : (Ljava/lang/String;)V
    //   324: athrow
    //   325: iload #8
    //   327: iconst_1
    //   328: if_icmpne -> 358
    //   331: aload #6
    //   333: bipush #12
    //   335: iconst_2
    //   336: iconst_1
    //   337: iconst_0
    //   338: invokestatic a : ([BIIZZ)I
    //   341: istore #9
    //   343: aload #6
    //   345: bipush #14
    //   347: iconst_4
    //   348: iconst_1
    //   349: iconst_0
    //   350: invokestatic b : ([BIIZZ)J
    //   353: lstore #10
    //   355: goto -> 382
    //   358: aload #6
    //   360: bipush #12
    //   362: iconst_4
    //   363: iconst_1
    //   364: iconst_0
    //   365: invokestatic a : ([BIIZZ)I
    //   368: istore #9
    //   370: aload #6
    //   372: bipush #16
    //   374: iconst_4
    //   375: iconst_1
    //   376: iconst_0
    //   377: invokestatic b : ([BIIZZ)J
    //   380: lstore #10
    //   382: aload #6
    //   384: bipush #8
    //   386: iconst_4
    //   387: iconst_1
    //   388: iconst_0
    //   389: invokestatic b : ([BIIZZ)J
    //   392: ldc2_w 1000
    //   395: lmul
    //   396: lstore #12
    //   398: lload #10
    //   400: l2i
    //   401: aload #6
    //   403: arraylength
    //   404: isub
    //   405: newarray byte
    //   407: astore #14
    //   409: iconst_0
    //   410: istore #7
    //   412: iload #7
    //   414: aload #5
    //   416: aload #14
    //   418: iload #7
    //   420: aload #14
    //   422: arraylength
    //   423: iload #7
    //   425: isub
    //   426: invokevirtual read : ([BII)I
    //   429: iadd
    //   430: istore #7
    //   432: iload #7
    //   434: aload #14
    //   436: arraylength
    //   437: if_icmplt -> 412
    //   440: aload #6
    //   442: arraylength
    //   443: aload #14
    //   445: arraylength
    //   446: iadd
    //   447: newarray byte
    //   449: astore #15
    //   451: aload #6
    //   453: iconst_0
    //   454: aload #15
    //   456: iconst_0
    //   457: aload #6
    //   459: arraylength
    //   460: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   463: aload #14
    //   465: iconst_0
    //   466: aload #15
    //   468: aload #6
    //   470: arraylength
    //   471: aload #14
    //   473: arraylength
    //   474: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   477: iload #9
    //   479: ifle -> 500
    //   482: aload #15
    //   484: iload #9
    //   486: lload #10
    //   488: l2i
    //   489: iload #9
    //   491: isub
    //   492: invokestatic a : ([BII)Ljava/lang/String;
    //   495: astore #16
    //   497: goto -> 509
    //   500: ldc ''
    //   502: astore #16
    //   504: lload #10
    //   506: l2i
    //   507: istore #9
    //   509: aload_2
    //   510: invokevirtual length : ()I
    //   513: ifle -> 562
    //   516: aload_2
    //   517: invokevirtual getBytes : ()[B
    //   520: astore #18
    //   522: aload #18
    //   524: arraylength
    //   525: iconst_1
    //   526: iadd
    //   527: newarray byte
    //   529: astore #17
    //   531: aload #18
    //   533: iconst_0
    //   534: aload #17
    //   536: iconst_0
    //   537: aload #18
    //   539: arraylength
    //   540: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   543: aload #17
    //   545: aload #18
    //   547: arraylength
    //   548: iconst_0
    //   549: bastore
    //   550: iload #9
    //   552: aload #17
    //   554: arraylength
    //   555: iadd
    //   556: i2l
    //   557: lstore #10
    //   559: goto -> 581
    //   562: iconst_0
    //   563: istore #9
    //   565: lload #10
    //   567: aload #16
    //   569: invokevirtual length : ()I
    //   572: i2l
    //   573: lsub
    //   574: lstore #10
    //   576: iconst_0
    //   577: newarray byte
    //   579: astore #17
    //   581: iload #8
    //   583: iconst_1
    //   584: if_icmpne -> 615
    //   587: aload #15
    //   589: iload #9
    //   591: bipush #12
    //   593: iconst_2
    //   594: iconst_1
    //   595: invokestatic a : ([BIIIZ)[B
    //   598: pop
    //   599: aload #15
    //   601: lload #10
    //   603: l2i
    //   604: bipush #14
    //   606: iconst_4
    //   607: iconst_1
    //   608: invokestatic a : ([BIIIZ)[B
    //   611: pop
    //   612: goto -> 640
    //   615: aload #15
    //   617: iload #9
    //   619: bipush #12
    //   621: iconst_4
    //   622: iconst_1
    //   623: invokestatic a : ([BIIIZ)[B
    //   626: pop
    //   627: aload #15
    //   629: lload #10
    //   631: l2i
    //   632: bipush #16
    //   634: iconst_4
    //   635: iconst_1
    //   636: invokestatic a : ([BIIIZ)[B
    //   639: pop
    //   640: new java/io/File
    //   643: dup
    //   644: new java/lang/StringBuilder
    //   647: dup
    //   648: invokespecial <init> : ()V
    //   651: aload_1
    //   652: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   655: ldc '.tmp'
    //   657: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   660: invokevirtual toString : ()Ljava/lang/String;
    //   663: invokespecial <init> : (Ljava/lang/String;)V
    //   666: astore #18
    //   668: new java/io/FileOutputStream
    //   671: dup
    //   672: aload #18
    //   674: invokespecial <init> : (Ljava/io/File;)V
    //   677: astore #19
    //   679: new java/io/BufferedOutputStream
    //   682: dup
    //   683: aload #19
    //   685: invokespecial <init> : (Ljava/io/OutputStream;)V
    //   688: astore #20
    //   690: aload #20
    //   692: aload #15
    //   694: iconst_0
    //   695: iload #9
    //   697: invokevirtual write : ([BII)V
    //   700: aload #20
    //   702: aload #17
    //   704: invokevirtual write : ([B)V
    //   707: sipush #1024
    //   710: newarray byte
    //   712: astore #21
    //   714: aload #5
    //   716: aload #21
    //   718: invokevirtual read : ([B)I
    //   721: istore #7
    //   723: iload #7
    //   725: ifle -> 738
    //   728: aload #20
    //   730: aload #21
    //   732: iconst_0
    //   733: iload #7
    //   735: invokevirtual write : ([BII)V
    //   738: iload #7
    //   740: iconst_m1
    //   741: if_icmpne -> 714
    //   744: aload #20
    //   746: invokevirtual flush : ()V
    //   749: aload #20
    //   751: invokevirtual close : ()V
    //   754: aload #5
    //   756: invokevirtual close : ()V
    //   759: goto -> 792
    //   762: astore #21
    //   764: goto -> 792
    //   767: astore #22
    //   769: aload #20
    //   771: invokevirtual flush : ()V
    //   774: aload #20
    //   776: invokevirtual close : ()V
    //   779: aload #5
    //   781: invokevirtual close : ()V
    //   784: goto -> 789
    //   787: astore #23
    //   789: aload #22
    //   791: athrow
    //   792: aload #4
    //   794: invokevirtual delete : ()Z
    //   797: pop
    //   798: aload #18
    //   800: aload #4
    //   802: invokevirtual renameTo : (Ljava/io/File;)Z
    //   805: pop
    //   806: aload_3
    //   807: ifnull -> 874
    //   810: aload_3
    //   811: invokevirtual close : ()V
    //   814: goto -> 874
    //   817: astore #5
    //   819: ldc ac/y
    //   821: invokevirtual getName : ()Ljava/lang/String;
    //   824: invokestatic getLogger : (Ljava/lang/String;)Ljava/util/logging/Logger;
    //   827: getstatic java/util/logging/Level.SEVERE : Ljava/util/logging/Level;
    //   830: aconst_null
    //   831: aload #5
    //   833: invokevirtual log : (Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   836: goto -> 874
    //   839: astore #24
    //   841: aload_3
    //   842: ifnull -> 871
    //   845: aload_3
    //   846: invokevirtual close : ()V
    //   849: goto -> 871
    //   852: astore #25
    //   854: ldc ac/y
    //   856: invokevirtual getName : ()Ljava/lang/String;
    //   859: invokestatic getLogger : (Ljava/lang/String;)Ljava/util/logging/Logger;
    //   862: getstatic java/util/logging/Level.SEVERE : Ljava/util/logging/Level;
    //   865: aconst_null
    //   866: aload #25
    //   868: invokevirtual log : (Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   871: aload #24
    //   873: athrow
    //   874: return
    // Exception table:
    //   from	to	target	type
    //   157	806	839	finally
    //   690	744	767	finally
    //   744	759	762	java/io/IOException
    //   767	769	767	finally
    //   769	784	787	java/io/IOException
    //   810	814	817	java/io/IOException
    //   839	841	839	finally
    //   845	849	852	java/io/IOException
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ac/y.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */