package ak;

public class AkInterfaceHotel extends g {
  public AkInterfaceHotel() {
    super("\t", false);
  }
  
  protected int b(String paramString) {
    // Byte code:
    //   0: ldc ''
    //   2: astore_2
    //   3: ldc ''
    //   5: astore_3
    //   6: iconst_m1
    //   7: istore #4
    //   9: aconst_null
    //   10: astore #5
    //   12: aload_0
    //   13: new java/io/File
    //   16: dup
    //   17: aload_1
    //   18: invokespecial <init> : (Ljava/lang/String;)V
    //   21: putfield h : Ljava/io/File;
    //   24: new java/io/FileInputStream
    //   27: dup
    //   28: aload_0
    //   29: getfield h : Ljava/io/File;
    //   32: invokespecial <init> : (Ljava/io/File;)V
    //   35: astore #6
    //   37: new java/io/BufferedReader
    //   40: dup
    //   41: new java/io/InputStreamReader
    //   44: dup
    //   45: aload #6
    //   47: invokespecial <init> : (Ljava/io/InputStream;)V
    //   50: invokespecial <init> : (Ljava/io/Reader;)V
    //   53: astore #5
    //   55: aload #5
    //   57: invokevirtual readLine : ()Ljava/lang/String;
    //   60: astore_3
    //   61: aload_3
    //   62: ifnonnull -> 106
    //   65: iload #4
    //   67: iconst_1
    //   68: isub
    //   69: istore #7
    //   71: aload #5
    //   73: ifnull -> 103
    //   76: aload #5
    //   78: invokevirtual close : ()V
    //   81: goto -> 103
    //   84: astore #8
    //   86: ldc ak/g
    //   88: invokevirtual getName : ()Ljava/lang/String;
    //   91: invokestatic getLogger : (Ljava/lang/String;)Ljava/util/logging/Logger;
    //   94: getstatic java/util/logging/Level.SEVERE : Ljava/util/logging/Level;
    //   97: aconst_null
    //   98: aload #8
    //   100: invokevirtual log : (Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   103: iload #7
    //   105: ireturn
    //   106: iinc #4, 1
    //   109: aload_0
    //   110: aload_3
    //   111: invokevirtual b_ : (Ljava/lang/String;)Z
    //   114: ifeq -> 129
    //   117: aload_2
    //   118: ldc 'Frame'
    //   120: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   123: ifeq -> 129
    //   126: goto -> 134
    //   129: aload_3
    //   130: astore_2
    //   131: goto -> 55
    //   134: aload #5
    //   136: ifnull -> 264
    //   139: aload #5
    //   141: invokevirtual close : ()V
    //   144: goto -> 264
    //   147: astore #6
    //   149: ldc ak/g
    //   151: invokevirtual getName : ()Ljava/lang/String;
    //   154: invokestatic getLogger : (Ljava/lang/String;)Ljava/util/logging/Logger;
    //   157: getstatic java/util/logging/Level.SEVERE : Ljava/util/logging/Level;
    //   160: aconst_null
    //   161: aload #6
    //   163: invokevirtual log : (Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   166: goto -> 264
    //   169: astore #6
    //   171: new V/a
    //   174: dup
    //   175: new java/lang/StringBuilder
    //   178: dup
    //   179: invokespecial <init> : ()V
    //   182: ldc 'Unable to open file for reading:\\n'
    //   184: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   187: aload_1
    //   188: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   191: invokevirtual toString : ()Ljava/lang/String;
    //   194: invokespecial <init> : (Ljava/lang/String;)V
    //   197: athrow
    //   198: astore #6
    //   200: new V/a
    //   203: dup
    //   204: new java/lang/StringBuilder
    //   207: dup
    //   208: invokespecial <init> : ()V
    //   211: ldc 'Unable to read from file:\\n'
    //   213: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   216: aload_1
    //   217: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   220: invokevirtual toString : ()Ljava/lang/String;
    //   223: invokespecial <init> : (Ljava/lang/String;)V
    //   226: athrow
    //   227: astore #9
    //   229: aload #5
    //   231: ifnull -> 261
    //   234: aload #5
    //   236: invokevirtual close : ()V
    //   239: goto -> 261
    //   242: astore #10
    //   244: ldc ak/g
    //   246: invokevirtual getName : ()Ljava/lang/String;
    //   249: invokestatic getLogger : (Ljava/lang/String;)Ljava/util/logging/Logger;
    //   252: getstatic java/util/logging/Level.SEVERE : Ljava/util/logging/Level;
    //   255: aconst_null
    //   256: aload #10
    //   258: invokevirtual log : (Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   261: aload #9
    //   263: athrow
    //   264: iload #4
    //   266: iconst_1
    //   267: isub
    //   268: ireturn
    // Exception table:
    //   from	to	target	type
    //   12	71	169	java/io/FileNotFoundException
    //   12	71	198	java/io/IOException
    //   12	71	227	finally
    //   76	81	84	java/io/IOException
    //   106	134	169	java/io/FileNotFoundException
    //   106	134	198	java/io/IOException
    //   106	134	227	finally
    //   139	144	147	java/io/IOException
    //   169	229	227	finally
    //   234	239	242	java/io/IOException
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ak/H.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */