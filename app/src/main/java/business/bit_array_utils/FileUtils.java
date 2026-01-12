package business.bit_array_utils;

import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLDecoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class t {
  public static boolean a(String paramString) {
    if (paramString == null || paramString.isEmpty()) return false;
    try {
      File file = new File(System.getProperty("user.home") + File.separator + paramString);
      file.createNewFile();
      file.delete();
      return true;
    } catch (Exception exception) {
      return false;
    }
  }

  public static void a(String paramString1, String paramString2) {
    File file1 = new File(paramString1);
    File file2 = new File(paramString2);
    if (!file1.equals(file2)) a(file1, file2);
  }

  public static boolean a(String paramString, long paramLong) {
    long l = System.currentTimeMillis();
    File file = new File(paramString, "test123abc~~");
    FileOutputStream fileOutputStream = null;
    try {
      fileOutputStream = new FileOutputStream(file);
      byte b;
      for (b = 0; b < paramLong; b++) fileOutputStream.write(b % 255);
      b = 1;
      return b;
    } catch (FileNotFoundException fileNotFoundException) {
      return false;
    } catch (IOException iOException) {
      return false;
    } finally {
      if (fileOutputStream != null)
        try {
          fileOutputStream.close();
        } catch (IOException iOException) {
        }
      file.delete();
    }
  }

  public static void a(File paramFile1, File paramFile2) {
    a(paramFile1, paramFile2, true);
  }

  public static void a(File paramFile1, File paramFile2, boolean paramBoolean) {
    a(paramFile1, paramFile2, null, paramBoolean);
  }

  public static void a(
      File paramFile1, File paramFile2, FileFilter paramFileFilter, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual isDirectory : ()Z
    //   4: ifeq -> 90
    //   7: aload_1
    //   8: invokevirtual exists : ()Z
    //   11: ifeq -> 29
    //   14: iload_3
    //   15: ifne -> 25
    //   18: aload_1
    //   19: invokevirtual isDirectory : ()Z
    //   22: ifne -> 29
    //   25: aload_1
    //   26: invokestatic b : (Ljava/io/File;)V
    //   29: aload_1
    //   30: invokevirtual mkdirs : ()Z
    //   33: pop
    //   34: aload_0
    //   35: invokevirtual listFiles : ()[Ljava/io/File;
    //   38: astore #4
    //   40: iconst_0
    //   41: istore #5
    //   43: iload #5
    //   45: aload #4
    //   47: arraylength
    //   48: if_icmpge -> 87
    //   51: new java/io/File
    //   54: dup
    //   55: aload_1
    //   56: aload #4
    //   58: iload #5
    //   60: aaload
    //   61: invokevirtual getName : ()Ljava/lang/String;
    //   64: invokespecial <init> : (Ljava/io/File;Ljava/lang/String;)V
    //   67: astore #6
    //   69: aload #4
    //   71: iload #5
    //   73: aaload
    //   74: aload #6
    //   76: aload_2
    //   77: iload_3
    //   78: invokestatic a : (Ljava/io/File;Ljava/io/File;Ljava/io/FileFilter;Z)V
    //   81: iinc #5, 1
    //   84: goto -> 43
    //   87: goto -> 462
    //   90: aload_1
    //   91: invokevirtual exists : ()Z
    //   94: ifeq -> 104
    //   97: aload_1
    //   98: invokevirtual delete : ()Z
    //   101: ifne -> 104
    //   104: aload_2
    //   105: ifnull -> 118
    //   108: aload_2
    //   109: aload_0
    //   110: invokeinterface accept : (Ljava/io/File;)Z
    //   115: ifeq -> 462
    //   118: aload_1
    //   119: invokevirtual createNewFile : ()Z
    //   122: pop
    //   123: goto -> 176
    //   126: astore #4
    //   128: aload #4
    //   130: invokevirtual printStackTrace : ()V
    //   133: new V/a
    //   136: dup
    //   137: new java/lang/StringBuilder
    //   140: dup
    //   141: invokespecial <init> : ()V
    //   144: ldc 'Failed to create file:\\n'
    //   146: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   149: aload_1
    //   150: invokevirtual getAbsolutePath : ()Ljava/lang/String;
    //   153: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   156: ldc '\\nReason:\\n'
    //   158: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   161: aload #4
    //   163: invokevirtual getMessage : ()Ljava/lang/String;
    //   166: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   169: invokevirtual toString : ()Ljava/lang/String;
    //   172: invokespecial <init> : (Ljava/lang/String;)V
    //   175: athrow
    //   176: aconst_null
    //   177: astore #4
    //   179: aconst_null
    //   180: astore #5
    //   182: new java/io/FileInputStream
    //   185: dup
    //   186: aload_0
    //   187: invokespecial <init> : (Ljava/io/File;)V
    //   190: astore #6
    //   192: new java/io/BufferedInputStream
    //   195: dup
    //   196: aload #6
    //   198: invokespecial <init> : (Ljava/io/InputStream;)V
    //   201: astore #4
    //   203: new java/io/FileOutputStream
    //   206: dup
    //   207: aload_1
    //   208: invokespecial <init> : (Ljava/io/File;)V
    //   211: astore #7
    //   213: new java/io/BufferedOutputStream
    //   216: dup
    //   217: aload #7
    //   219: invokespecial <init> : (Ljava/io/OutputStream;)V
    //   222: astore #5
    //   224: aload #4
    //   226: invokevirtual read : ()I
    //   229: istore #8
    //   231: iload #8
    //   233: iconst_m1
    //   234: if_icmpeq -> 254
    //   237: aload #5
    //   239: iload #8
    //   241: invokevirtual write : (I)V
    //   244: aload #4
    //   246: invokevirtual read : ()I
    //   249: istore #8
    //   251: goto -> 231
    //   254: aload #4
    //   256: ifnull -> 286
    //   259: aload #4
    //   261: invokevirtual close : ()V
    //   264: goto -> 286
    //   267: astore #6
    //   269: ldc bH/t
    //   271: invokevirtual getName : ()Ljava/lang/String;
    //   274: invokestatic getLogger : (Ljava/lang/String;)Ljava/util/logging/Logger;
    //   277: getstatic java/util/logging/Level.SEVERE : Ljava/util/logging/Level;
    //   280: aconst_null
    //   281: aload #6
    //   283: invokevirtual log :
    // (Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   286: aload #5
    //   288: ifnull -> 462
    //   291: aload #5
    //   293: invokevirtual flush : ()V
    //   296: aload #5
    //   298: invokevirtual close : ()V
    //   301: goto -> 462
    //   304: astore #6
    //   306: ldc bH/t
    //   308: invokevirtual getName : ()Ljava/lang/String;
    //   311: invokestatic getLogger : (Ljava/lang/String;)Ljava/util/logging/Logger;
    //   314: getstatic java/util/logging/Level.SEVERE : Ljava/util/logging/Level;
    //   317: aconst_null
    //   318: aload #6
    //   320: invokevirtual log :
    // (Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   323: goto -> 462
    //   326: astore #6
    //   328: aload #6
    //   330: invokevirtual printStackTrace : ()V
    //   333: new V/a
    //   336: dup
    //   337: new java/lang/StringBuilder
    //   340: dup
    //   341: invokespecial <init> : ()V
    //   344: ldc 'Error copying file:\\n'
    //   346: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   349: aload_0
    //   350: invokevirtual getAbsolutePath : ()Ljava/lang/String;
    //   353: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   356: ldc '\\nto:\\n'
    //   358: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   361: aload_1
    //   362: invokevirtual getAbsolutePath : ()Ljava/lang/String;
    //   365: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   368: ldc '\\nError:'
    //   370: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   373: aload #6
    //   375: invokevirtual getMessage : ()Ljava/lang/String;
    //   378: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   381: invokevirtual toString : ()Ljava/lang/String;
    //   384: invokespecial <init> : (Ljava/lang/String;)V
    //   387: athrow
    //   388: astore #9
    //   390: aload #4
    //   392: ifnull -> 422
    //   395: aload #4
    //   397: invokevirtual close : ()V
    //   400: goto -> 422
    //   403: astore #10
    //   405: ldc bH/t
    //   407: invokevirtual getName : ()Ljava/lang/String;
    //   410: invokestatic getLogger : (Ljava/lang/String;)Ljava/util/logging/Logger;
    //   413: getstatic java/util/logging/Level.SEVERE : Ljava/util/logging/Level;
    //   416: aconst_null
    //   417: aload #10
    //   419: invokevirtual log :
    // (Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   422: aload #5
    //   424: ifnull -> 459
    //   427: aload #5
    //   429: invokevirtual flush : ()V
    //   432: aload #5
    //   434: invokevirtual close : ()V
    //   437: goto -> 459
    //   440: astore #10
    //   442: ldc bH/t
    //   444: invokevirtual getName : ()Ljava/lang/String;
    //   447: invokestatic getLogger : (Ljava/lang/String;)Ljava/util/logging/Logger;
    //   450: getstatic java/util/logging/Level.SEVERE : Ljava/util/logging/Level;
    //   453: aconst_null
    //   454: aload #10
    //   456: invokevirtual log :
    // (Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   459: aload #9
    //   461: athrow
    //   462: return
    // Exception table:
    //   from	to	target	type
    //   118	123	126	java/io/IOException
    //   182	254	326	java/lang/Exception
    //   182	254	388	finally
    //   259	264	267	java/io/IOException
    //   291	301	304	java/io/IOException
    //   326	390	388	finally
    //   395	400	403	java/io/IOException
    //   427	437	440	java/io/IOException
  }

  public static void b(File paramFile1, File paramFile2) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual getName : ()Ljava/lang/String;
    //   4: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   7: ldc '.ecu'
    //   9: invokevirtual endsWith : (Ljava/lang/String;)Z
    //   12: istore_2
    //   13: aload_1
    //   14: invokevirtual getName : ()Ljava/lang/String;
    //   17: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   20: ldc '.ecu'
    //   22: invokevirtual endsWith : (Ljava/lang/String;)Z
    //   25: ifne -> 35
    //   28: aload_0
    //   29: invokestatic b : (Ljava/io/File;)Z
    //   32: ifeq -> 39
    //   35: iconst_1
    //   36: goto -> 40
    //   39: iconst_0
    //   40: istore_3
    //   41: aload_1
    //   42: invokevirtual exists : ()Z
    //   45: ifeq -> 55
    //   48: aload_1
    //   49: invokevirtual delete : ()Z
    //   52: ifne -> 55
    //   55: aload_1
    //   56: invokevirtual createNewFile : ()Z
    //   59: pop
    //   60: goto -> 113
    //   63: astore #4
    //   65: aload #4
    //   67: invokevirtual printStackTrace : ()V
    //   70: new V/a
    //   73: dup
    //   74: new java/lang/StringBuilder
    //   77: dup
    //   78: invokespecial <init> : ()V
    //   81: ldc 'Failed to create file:\\n'
    //   83: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   86: aload_1
    //   87: invokevirtual getAbsolutePath : ()Ljava/lang/String;
    //   90: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   93: ldc '\\nReason:\\n'
    //   95: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   98: aload #4
    //   100: invokevirtual getMessage : ()Ljava/lang/String;
    //   103: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   106: invokevirtual toString : ()Ljava/lang/String;
    //   109: invokespecial <init> : (Ljava/lang/String;)V
    //   112: athrow
    //   113: aconst_null
    //   114: astore #4
    //   116: aconst_null
    //   117: astore #5
    //   119: iload_3
    //   120: ifeq -> 281
    //   123: new W/ak
    //   126: dup
    //   127: invokespecial <init> : ()V
    //   130: astore #7
    //   132: aload_0
    //   133: invokestatic b : (Ljava/io/File;)Z
    //   136: ifeq -> 147
    //   139: aload_0
    //   140: aload_1
    //   141: invokestatic a : (Ljava/io/File;Ljava/io/File;)V
    //   144: goto -> 278
    //   147: iload_2
    //   148: ifeq -> 270
    //   151: new java/io/BufferedInputStream
    //   154: dup
    //   155: new W/ax
    //   158: dup
    //   159: aload_0
    //   160: invokespecial <init> : (Ljava/io/File;)V
    //   163: invokespecial <init> : (Ljava/io/InputStream;)V
    //   166: astore #8
    //   168: aload_0
    //   169: invokevirtual length : ()J
    //   172: l2i
    //   173: newarray byte
    //   175: astore #9
    //   177: iconst_0
    //   178: istore #10
    //   180: aload #8
    //   182: aload #9
    //   184: iload #10
    //   186: aload #9
    //   188: arraylength
    //   189: iload #10
    //   191: isub
    //   192: invokevirtual read : ([BII)I
    //   195: istore #11
    //   197: iload #11
    //   199: ifle -> 209
    //   202: iload #10
    //   204: iload #11
    //   206: iadd
    //   207: istore #10
    //   209: iload #11
    //   211: ifge -> 180
    //   214: aload #8
    //   216: invokevirtual close : ()V
    //   219: goto -> 242
    //   222: astore #11
    //   224: goto -> 242
    //   227: astore #12
    //   229: aload #8
    //   231: invokevirtual close : ()V
    //   234: goto -> 239
    //   237: astore #13
    //   239: aload #12
    //   241: athrow
    //   242: aload_0
    //   243: invokestatic a : (Ljava/io/File;)Ljava/lang/String;
    //   246: astore #11
    //   248: aload_0
    //   249: invokestatic c : (Ljava/io/File;)D
    //   252: dstore #12
    //   254: aload #7
    //   256: aload #9
    //   258: aload_1
    //   259: aconst_null
    //   260: aload #11
    //   262: dload #12
    //   264: invokevirtual a : ([BLjava/io/File;Ljava/lang/String;Ljava/lang/String;D)V
    //   267: goto -> 278
    //   270: aload #7
    //   272: aload_0
    //   273: aload_1
    //   274: aconst_null
    //   275: invokevirtual a : (Ljava/io/File;Ljava/io/File;Ljava/lang/String;)V
    //   278: goto -> 338
    //   281: aload_0
    //   282: invokestatic a : (Ljava/io/File;)Ljava/io/BufferedReader;
    //   285: astore #4
    //   287: new java/io/FileOutputStream
    //   290: dup
    //   291: aload_1
    //   292: invokespecial <init> : (Ljava/io/File;)V
    //   295: astore #6
    //   297: new java/io/BufferedOutputStream
    //   300: dup
    //   301: aload #6
    //   303: invokespecial <init> : (Ljava/io/OutputStream;)V
    //   306: astore #5
    //   308: aload #4
    //   310: invokevirtual read : ()I
    //   313: istore #7
    //   315: iload #7
    //   317: iconst_m1
    //   318: if_icmpeq -> 338
    //   321: aload #5
    //   323: iload #7
    //   325: invokevirtual write : (I)V
    //   328: aload #4
    //   330: invokevirtual read : ()I
    //   333: istore #7
    //   335: goto -> 315
    //   338: aload #4
    //   340: ifnull -> 370
    //   343: aload #4
    //   345: invokevirtual close : ()V
    //   348: goto -> 370
    //   351: astore #6
    //   353: ldc bH/t
    //   355: invokevirtual getName : ()Ljava/lang/String;
    //   358: invokestatic getLogger : (Ljava/lang/String;)Ljava/util/logging/Logger;
    //   361: getstatic java/util/logging/Level.SEVERE : Ljava/util/logging/Level;
    //   364: aconst_null
    //   365: aload #6
    //   367: invokevirtual log :
    // (Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   370: aload #5
    //   372: ifnull -> 536
    //   375: aload #5
    //   377: invokevirtual close : ()V
    //   380: goto -> 536
    //   383: astore #6
    //   385: ldc bH/t
    //   387: invokevirtual getName : ()Ljava/lang/String;
    //   390: invokestatic getLogger : (Ljava/lang/String;)Ljava/util/logging/Logger;
    //   393: getstatic java/util/logging/Level.SEVERE : Ljava/util/logging/Level;
    //   396: aconst_null
    //   397: aload #6
    //   399: invokevirtual log :
    // (Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   402: goto -> 536
    //   405: astore #6
    //   407: aload #6
    //   409: invokevirtual printStackTrace : ()V
    //   412: new V/a
    //   415: dup
    //   416: new java/lang/StringBuilder
    //   419: dup
    //   420: invokespecial <init> : ()V
    //   423: ldc 'Error copying file:\\n'
    //   425: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   428: aload_0
    //   429: invokevirtual getAbsolutePath : ()Ljava/lang/String;
    //   432: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   435: ldc '\\nto:\\n'
    //   437: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   440: aload_1
    //   441: invokevirtual getAbsolutePath : ()Ljava/lang/String;
    //   444: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   447: ldc '\\nError:'
    //   449: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   452: aload #6
    //   454: invokevirtual getMessage : ()Ljava/lang/String;
    //   457: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   460: invokevirtual toString : ()Ljava/lang/String;
    //   463: invokespecial <init> : (Ljava/lang/String;)V
    //   466: athrow
    //   467: astore #14
    //   469: aload #4
    //   471: ifnull -> 501
    //   474: aload #4
    //   476: invokevirtual close : ()V
    //   479: goto -> 501
    //   482: astore #15
    //   484: ldc bH/t
    //   486: invokevirtual getName : ()Ljava/lang/String;
    //   489: invokestatic getLogger : (Ljava/lang/String;)Ljava/util/logging/Logger;
    //   492: getstatic java/util/logging/Level.SEVERE : Ljava/util/logging/Level;
    //   495: aconst_null
    //   496: aload #15
    //   498: invokevirtual log :
    // (Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   501: aload #5
    //   503: ifnull -> 533
    //   506: aload #5
    //   508: invokevirtual close : ()V
    //   511: goto -> 533
    //   514: astore #15
    //   516: ldc bH/t
    //   518: invokevirtual getName : ()Ljava/lang/String;
    //   521: invokestatic getLogger : (Ljava/lang/String;)Ljava/util/logging/Logger;
    //   524: getstatic java/util/logging/Level.SEVERE : Ljava/util/logging/Level;
    //   527: aconst_null
    //   528: aload #15
    //   530: invokevirtual log :
    // (Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   533: aload #14
    //   535: athrow
    //   536: return
    // Exception table:
    //   from	to	target	type
    //   55	60	63	java/io/IOException
    //   119	338	405	java/lang/Exception
    //   119	338	467	finally
    //   180	214	227	finally
    //   214	219	222	java/io/IOException
    //   227	229	227	finally
    //   229	234	237	java/io/IOException
    //   343	348	351	java/io/IOException
    //   375	380	383	java/io/IOException
    //   405	469	467	finally
    //   474	479	482	java/io/IOException
    //   506	511	514	java/io/IOException
  }

  public static boolean a(File paramFile) {
    File[] arrayOfFile = File.listRoots();
    for (byte b = 0; b < arrayOfFile.length; b++) {
      if (paramFile.equals(arrayOfFile[b])) return true;
    }
    return false;
  }

  public static String b(String paramString) {
    if (paramString != null && paramString.indexOf(File.separatorChar) != -1)
      paramString = paramString.substring(paramString.lastIndexOf(File.separatorChar) + 1);
    return paramString;
  }

  public static void b(File paramFile) {
    if (paramFile.isDirectory()) {
      File[] arrayOfFile = paramFile.listFiles();
      for (byte b = 0; b < arrayOfFile.length; b++) b(arrayOfFile[b]);
      D.c("Delete Results " + paramFile.getName() + " " + paramFile.delete());
    } else if (paramFile.isFile()) {
      D.c("Delete Results " + paramFile.getName() + " " + paramFile.delete());
      return;
    }
  }

  public static String a(byte[] paramArrayOfbyte) {
    MessageDigest messageDigest;
    try {
      messageDigest = MessageDigest.getInstance("MD5");
      messageDigest.reset();
    } catch (NoSuchAlgorithmException noSuchAlgorithmException) {
      noSuchAlgorithmException.printStackTrace();
      return null;
    }
    byte[] arrayOfByte = messageDigest.digest(paramArrayOfbyte);
    StringBuilder stringBuilder = new StringBuilder();
    for (byte b = 0; b < arrayOfByte.length; b++)
      stringBuilder.append(Integer.toString((arrayOfByte[b] & 0xFF) + 256, 16).substring(1));
    return stringBuilder.toString();
  }

  public static String c(File paramFile) {
    byte[] arrayOfByte = d(paramFile);
    StringBuilder stringBuilder = new StringBuilder();
    for (byte b = 0; b < arrayOfByte.length; b++)
      stringBuilder.append(Integer.toString((arrayOfByte[b] & 0xFF) + 256, 16).substring(1));
    return stringBuilder.toString();
  }

  public static byte[] d(File paramFile) {
    FileInputStream fileInputStream = new FileInputStream(paramFile);
    return a(fileInputStream);
  }

  public static byte[] a(InputStream paramInputStream) {
    // Byte code:
    //   0: ldc 'MD5'
    //   2: invokestatic getInstance : (Ljava/lang/String;)Ljava/security/MessageDigest;
    //   5: astore_1
    //   6: aload_1
    //   7: invokevirtual reset : ()V
    //   10: goto -> 20
    //   13: astore_2
    //   14: aload_2
    //   15: invokevirtual printStackTrace : ()V
    //   18: aconst_null
    //   19: areturn
    //   20: new java/security/DigestInputStream
    //   23: dup
    //   24: aload_0
    //   25: aload_1
    //   26: invokespecial <init> : (Ljava/io/InputStream;Ljava/security/MessageDigest;)V
    //   29: astore_0
    //   30: sipush #512
    //   33: newarray byte
    //   35: astore_2
    //   36: aload_0
    //   37: aload_2
    //   38: invokevirtual read : ([B)I
    //   41: istore_3
    //   42: iload_3
    //   43: ifge -> 36
    //   46: aload_0
    //   47: invokevirtual close : ()V
    //   50: goto -> 71
    //   53: astore_2
    //   54: goto -> 71
    //   57: astore #4
    //   59: aload_0
    //   60: invokevirtual close : ()V
    //   63: goto -> 68
    //   66: astore #5
    //   68: aload #4
    //   70: athrow
    //   71: aload_1
    //   72: invokevirtual digest : ()[B
    //   75: areturn
    // Exception table:
    //   from	to	target	type
    //   0	10	13	java/security/NoSuchAlgorithmException
    //   20	46	57	finally
    //   46	50	53	java/io/IOException
    //   57	59	57	finally
    //   59	63	66	java/io/IOException
  }

  public static boolean a(URL paramURL) {
    if (paramURL != null && paramURL.getProtocol().equals("file")) {
      File file = b(paramURL);
      return (file != null && file.exists());
    }
    return true;
  }

  public static File b(URL paramURL) {
    if (paramURL != null && paramURL.getProtocol().equals("file")) {
      String str = "";
      if (paramURL.getHost() != null && paramURL.getHost().length() > 0)
        str = str + paramURL.getHost() + ":";
      try {
        str = str + URLDecoder.decode(paramURL.getFile(), "UTF-8");
      } catch (UnsupportedEncodingException unsupportedEncodingException) {
        Logger.getLogger(t.class.getName())
            .log(Level.SEVERE, (String) null, unsupportedEncodingException);
      }
      return new File(str);
    }
    return null;
  }

  public static boolean a(File paramFile, byte[] paramArrayOfbyte) {
    FileInputStream fileInputStream = new FileInputStream(paramFile);
    try {
      byte[] arrayOfByte = new byte[paramArrayOfbyte.length];
      fileInputStream.read(arrayOfByte);
      byte b;
      for (b = 0; b < arrayOfByte.length; b++) {
        if (arrayOfByte[b] != paramArrayOfbyte[b]) return false;
      }
      b = 1;
      return b;
    } catch (IOException iOException) {
      Logger.getLogger(t.class.getName()).log(Level.WARNING, "File not readable.", iOException);
      return false;
    } finally {
      try {
        fileInputStream.close();
      } catch (Exception exception) {
      }
    }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bH/t.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
