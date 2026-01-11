package ak;

import V.ExceptionInVPackage;
import W.T;
import bH.D;
import bH.X;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class aG extends g {
  public aG() {
    super("\t", false);
  }
  
  public Iterator b() {
    Iterator<T> iterator = super.b();
    ArrayList<T> arrayList = new ArrayList();
    while (iterator.hasNext()) {
      T t = iterator.next();
      if (t.ExceptionInVPackage().equals("RTime")) {
        d d = (d)t;
        d.ExceptionInVPackage("Time");
      } 
      if (t.ExceptionInVPackage().equals("Frame")) {
        d d = (d)t;
        d.ExceptionInVPackage(0);
      } 
      if (!t.ExceptionInVPackage().contains("Afr Adjustment Required") && (!t.ExceptionInVPackage().startsWith("Col") || t.ExceptionInVPackage().length() > 5) && !t.ExceptionInVPackage().trim().isEmpty())
        arrayList.add(t); 
    } 
    return arrayList.iterator();
  }
  
  public float[] c() {
    String str1 = null;
    try {
      if (this.t && this.p >= 500 && k())
        throw new ExceptionInVPackage("This Edition is limited to loading 500 rows of data. \nPlease Register to load large log files."); 
      str1 = l();
    } catch (IOException iOException) {
      iOException.printStackTrace();
      throw new ExceptionInVPackage("IO Error reading row from file on row " + this.p + ".");
    } 
    e(str1);
    if (str1.startsWith(r())) {
      String str = "0";
      if (this.i != null && this.i.length > 0)
        str = this.i[0] + ""; 
      str1 = str + str1;
    } 
    if (this.m == -1L)
      this.m = this.h.length() / (str1.length() + 3); 
    String str2 = r();
    aE aE = new aE(str1, str2);
    this.i = new float[aE.c()];
    for (byte b = 0; b < this.i.length; b++) {
      String str = null;
      try {
        str = aE.b().trim();
      } catch (Exception exception) {
        D.c("Error Parsing record:\n" + str1);
        str = "0";
        exception.printStackTrace();
      } 
      if (str.indexOf("[") != -1) {
        str = X.b(str, "[", "");
        str = X.b(str, "]", "");
        if (str.contains(" ")) {
          String[] arrayOfString = str.split("  ");
          try {
            this.i[b] = Float.parseFloat(arrayOfString[0]);
          } catch (NumberFormatException numberFormatException) {
            this.i[b] = Float.NaN;
          } 
          b++;
          str = arrayOfString[1];
        } 
      } else if ((str.contains("-") || str.contains("+") || str.contains("F") || str.contains("!")) && str.contains(" ")) {
        str = str.substring(str.lastIndexOf(" "), str.length());
      } 
      try {
        str = X.b(str, ",", ".");
        this.i[b] = Float.parseFloat(str);
      } catch (NumberFormatException numberFormatException) {
        this.i[b] = Float.NaN;
      } 
    } 
    return this.i;
  }
  
  protected void e(String paramString) {
    if (paramString.indexOf("Frame") > -1);
  }
  
  protected boolean b_(String paramString) {
    return (paramString != null && !paramString.startsWith("Frame") && !paramString.isEmpty());
  }
  
  protected int b(String paramString) {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: aconst_null
    //   3: astore_3
    //   4: aload_0
    //   5: new java/io/File
    //   8: dup
    //   9: aload_1
    //   10: invokespecial <init> : (Ljava/lang/String;)V
    //   13: putfield h : Ljava/io/File;
    //   16: new java/io/FileInputStream
    //   19: dup
    //   20: aload_0
    //   21: getfield h : Ljava/io/File;
    //   24: invokespecial <init> : (Ljava/io/File;)V
    //   27: astore #4
    //   29: new java/io/BufferedReader
    //   32: dup
    //   33: new java/io/InputStreamReader
    //   36: dup
    //   37: aload #4
    //   39: invokespecial <init> : (Ljava/io/InputStream;)V
    //   42: invokespecial <init> : (Ljava/io/Reader;)V
    //   45: astore_3
    //   46: aload_3
    //   47: invokevirtual readLine : ()Ljava/lang/String;
    //   50: invokevirtual trim : ()Ljava/lang/String;
    //   53: astore #5
    //   55: aload #5
    //   57: ifnonnull -> 98
    //   60: iload_2
    //   61: iconst_1
    //   62: isub
    //   63: istore #6
    //   65: aload_3
    //   66: ifnull -> 95
    //   69: aload_3
    //   70: invokevirtual close : ()V
    //   73: goto -> 95
    //   76: astore #7
    //   78: ldc ak/g
    //   80: invokevirtual getName : ()Ljava/lang/String;
    //   83: invokestatic getLogger : (Ljava/lang/String;)Ljava/util/logging/Logger;
    //   86: getstatic java/util/logging/Level.SEVERE : Ljava/util/logging/Level;
    //   89: aconst_null
    //   90: aload #7
    //   92: invokevirtual log : (Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   95: iload #6
    //   97: ireturn
    //   98: iload_2
    //   99: ifeq -> 112
    //   102: aload #5
    //   104: ldc 'Frame'
    //   106: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   109: ifne -> 216
    //   112: aload #5
    //   114: ifnonnull -> 155
    //   117: iload_2
    //   118: iconst_1
    //   119: isub
    //   120: istore #6
    //   122: aload_3
    //   123: ifnull -> 152
    //   126: aload_3
    //   127: invokevirtual close : ()V
    //   130: goto -> 152
    //   133: astore #7
    //   135: ldc ak/g
    //   137: invokevirtual getName : ()Ljava/lang/String;
    //   140: invokestatic getLogger : (Ljava/lang/String;)Ljava/util/logging/Logger;
    //   143: getstatic java/util/logging/Level.SEVERE : Ljava/util/logging/Level;
    //   146: aconst_null
    //   147: aload #7
    //   149: invokevirtual log : (Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   152: iload #6
    //   154: ireturn
    //   155: aload #5
    //   157: ldc 'Frame'
    //   159: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   162: ifeq -> 201
    //   165: iload_2
    //   166: istore #6
    //   168: aload_3
    //   169: ifnull -> 198
    //   172: aload_3
    //   173: invokevirtual close : ()V
    //   176: goto -> 198
    //   179: astore #7
    //   181: ldc ak/g
    //   183: invokevirtual getName : ()Ljava/lang/String;
    //   186: invokestatic getLogger : (Ljava/lang/String;)Ljava/util/logging/Logger;
    //   189: getstatic java/util/logging/Level.SEVERE : Ljava/util/logging/Level;
    //   192: aconst_null
    //   193: aload #7
    //   195: invokevirtual log : (Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   198: iload #6
    //   200: ireturn
    //   201: aload_3
    //   202: invokevirtual readLine : ()Ljava/lang/String;
    //   205: invokevirtual trim : ()Ljava/lang/String;
    //   208: astore #5
    //   210: iinc #2, 1
    //   213: goto -> 98
    //   216: iload_2
    //   217: istore #6
    //   219: aload_3
    //   220: ifnull -> 249
    //   223: aload_3
    //   224: invokevirtual close : ()V
    //   227: goto -> 249
    //   230: astore #7
    //   232: ldc ak/g
    //   234: invokevirtual getName : ()Ljava/lang/String;
    //   237: invokestatic getLogger : (Ljava/lang/String;)Ljava/util/logging/Logger;
    //   240: getstatic java/util/logging/Level.SEVERE : Ljava/util/logging/Level;
    //   243: aconst_null
    //   244: aload #7
    //   246: invokevirtual log : (Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   249: iload #6
    //   251: ireturn
    //   252: astore #4
    //   254: new V/ExceptionInVPackage
    //   257: dup
    //   258: new java/lang/StringBuilder
    //   261: dup
    //   262: invokespecial <init> : ()V
    //   265: ldc 'Unable to read from file:\\n'
    //   267: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   270: aload_1
    //   271: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   274: invokevirtual toString : ()Ljava/lang/String;
    //   277: invokespecial <init> : (Ljava/lang/String;)V
    //   280: athrow
    //   281: astore #4
    //   283: new V/ExceptionInVPackage
    //   286: dup
    //   287: new java/lang/StringBuilder
    //   290: dup
    //   291: invokespecial <init> : ()V
    //   294: ldc 'Unable to open file for reading:\\n'
    //   296: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   299: aload_1
    //   300: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   303: invokevirtual toString : ()Ljava/lang/String;
    //   306: invokespecial <init> : (Ljava/lang/String;)V
    //   309: athrow
    //   310: astore #4
    //   312: new V/ExceptionInVPackage
    //   315: dup
    //   316: new java/lang/StringBuilder
    //   319: dup
    //   320: invokespecial <init> : ()V
    //   323: ldc 'Unable to read from file:\\n'
    //   325: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   328: aload_1
    //   329: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   332: invokevirtual toString : ()Ljava/lang/String;
    //   335: invokespecial <init> : (Ljava/lang/String;)V
    //   338: athrow
    //   339: astore #8
    //   341: aload_3
    //   342: ifnull -> 371
    //   345: aload_3
    //   346: invokevirtual close : ()V
    //   349: goto -> 371
    //   352: astore #9
    //   354: ldc ak/g
    //   356: invokevirtual getName : ()Ljava/lang/String;
    //   359: invokestatic getLogger : (Ljava/lang/String;)Ljava/util/logging/Logger;
    //   362: getstatic java/util/logging/Level.SEVERE : Ljava/util/logging/Level;
    //   365: aconst_null
    //   366: aload #9
    //   368: invokevirtual log : (Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   371: aload #8
    //   373: athrow
    // Exception table:
    //   from	to	target	type
    //   4	65	252	java/lang/NullPointerException
    //   4	65	281	java/io/FileNotFoundException
    //   4	65	310	java/io/IOException
    //   4	65	339	finally
    //   69	73	76	java/io/IOException
    //   98	122	252	java/lang/NullPointerException
    //   98	122	281	java/io/FileNotFoundException
    //   98	122	310	java/io/IOException
    //   98	122	339	finally
    //   126	130	133	java/io/IOException
    //   155	168	252	java/lang/NullPointerException
    //   155	168	281	java/io/FileNotFoundException
    //   155	168	310	java/io/IOException
    //   155	168	339	finally
    //   172	176	179	java/io/IOException
    //   201	219	252	java/lang/NullPointerException
    //   201	219	281	java/io/FileNotFoundException
    //   201	219	310	java/io/IOException
    //   201	219	339	finally
    //   223	227	230	java/io/IOException
    //   252	341	339	finally
    //   345	349	352	java/io/IOException
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ak/aG.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */