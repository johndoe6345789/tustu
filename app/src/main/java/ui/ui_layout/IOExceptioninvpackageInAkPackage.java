package ak;

import V.ExceptionInVPackage;
import W.ManagerUsingReader;
import W.T;
import bH.X;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Pattern;

public class IOExceptioninvpackageInAkPackage extends g {
  public IOExceptioninvpackageInAkPackage() {
    super(";", false);
  }

  public boolean ExceptionInVPackage(String paramString) {
    int i = b(paramString);
    if (i > 0) this.w = ExceptionInVPackage(paramString, i);
    FileInputStream fileInputStream = null;
    try {
      this.h = new File(paramString);
      fileInputStream = new FileInputStream(this.h);
      this.j = "UTF-8";
      this.e = new ManagerUsingReader(new InputStreamReader(fileInputStream, this.j));
      String str = null;
      for (byte b = 0; b <= i; b++) {
        str = this.n;
        this.n = this.e.ExceptionInVPackage();
      }
      this.t = true;
      return true;
    } catch (FileNotFoundException fileNotFoundException) {
      throw new ExceptionInVPackage("Unable to open file for reading:\n" + paramString);
    } catch (IOException iOException) {
      throw new ExceptionInVPackage("Unable to read from file:\n" + paramString);
    }
  }

  public Iterator b() {
    String str = null;
    try {
      str = l();
    } catch (IOException iOException) {
      iOException.printStackTrace();
      throw new ExceptionInVPackage("IO Error reading header rows from file.");
    }
    byte b = 0;
    while (!str.trim().isEmpty()) {
      if (str.startsWith("'''") || str.startsWith("';")) {
        if (str.startsWith("';")) str = str.substring(2).trim();
        String[] arrayOfString = str.split(Pattern.quote(r()));
        d d = new d();
        for (byte b1 = 0; b1 < arrayOfString.length && b1 <= 1; b1++) {
          if (b1 == 0) {
            if (arrayOfString[b1].startsWith("'''")) {
              d.ExceptionInVPackage("Time");
              d.ExceptionInVPackage(3);
              d.ExceptionInVPackage(0.001F);
              d.b("s");
            } else {
              d.ExceptionInVPackage(X.i(arrayOfString[b1]));
            }
            String str1 = d.ExceptionInVPackage();
            for (byte b2 = 0; b2 < 100 && i(str1); b2++) str1 = d.ExceptionInVPackage() + b2;
            d.ExceptionInVPackage(str1);
            d d1 = ExceptionInVPackage(d);
            if (d1 != null) {
              this.g.add(d1);
              b++;
            }
          } else if (b1 == 1 && !d.ExceptionInVPackage().equals("Time")) {
            d.b(X.i(arrayOfString[b1]));
          }
        }
      }
      try {
        str = l();
        if (!str.startsWith("'")) {
          ExceptionInVPackage(true);
          break;
        }
      } catch (IOException iOException) {
        iOException.printStackTrace();
        throw new ExceptionInVPackage("IO Error reading header rows from file.");
      }
    }
    ArrayList<T> arrayList = new ArrayList();
    Iterator<T> iterator = this.g.iterator();
    while (iterator.hasNext()) arrayList.add(iterator.next());
    return arrayList.iterator();
  }

  protected int b(String paramString) {
    // Byte code:
    //   0: ldc ''
    //   2: astore_2
    //   3: iconst_0
    //   4: istore_3
    //   5: aconst_null
    //   6: astore #4
    //   8: aload_0
    //   9: new java/io/File
    //   12: dup
    //   13: aload_1
    //   14: invokespecial <init> : (Ljava/lang/String;)V
    //   17: putfield h : Ljava/io/File;
    //   20: new java/io/FileInputStream
    //   23: dup
    //   24: aload_0
    //   25: getfield h : Ljava/io/File;
    //   28: invokespecial <init> : (Ljava/io/File;)V
    //   31: astore #5
    //   33: new W/ManagerUsingReader
    //   36: dup
    //   37: new java/io/InputStreamReader
    //   40: dup
    //   41: aload #5
    //   43: invokespecial <init> : (Ljava/io/InputStream;)V
    //   46: invokespecial <init> : (Ljava/io/Reader;)V
    //   49: astore #4
    //   51: aload #4
    //   53: invokevirtual ExceptionInVPackage : ()Ljava/lang/String;
    //   56: astore_2
    //   57: iload_3
    //   58: ifeq -> 70
    //   61: aload_2
    //   62: ldc '''''
    //   64: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   67: ifne -> 82
    //   70: iinc #3, 1
    //   73: aload #4
    //   75: invokevirtual ExceptionInVPackage : ()Ljava/lang/String;
    //   78: astore_2
    //   79: goto -> 57
    //   82: aload #4
    //   84: ifnull -> 212
    //   87: aload #4
    //   89: invokevirtual close : ()V
    //   92: goto -> 212
    //   95: astore #5
    //   97: ldc ak/g
    //   99: invokevirtual getName : ()Ljava/lang/String;
    //   102: invokestatic getLogger : (Ljava/lang/String;)Ljava/util/logging/Logger;
    //   105: getstatic java/util/logging/Level.SEVERE : Ljava/util/logging/Level;
    //   108: aconst_null
    //   109: aload #5
    //   111: invokevirtual log :
    // (Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   114: goto -> 212
    //   117: astore #5
    //   119: new V/ExceptionInVPackage
    //   122: dup
    //   123: new java/lang/StringBuilder
    //   126: dup
    //   127: invokespecial <init> : ()V
    //   130: ldc 'Unable to open file for reading:\\n'
    //   132: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   135: aload_1
    //   136: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   139: invokevirtual toString : ()Ljava/lang/String;
    //   142: invokespecial <init> : (Ljava/lang/String;)V
    //   145: athrow
    //   146: astore #5
    //   148: new V/ExceptionInVPackage
    //   151: dup
    //   152: new java/lang/StringBuilder
    //   155: dup
    //   156: invokespecial <init> : ()V
    //   159: ldc 'Unable to read from file:\\n'
    //   161: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   164: aload_1
    //   165: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   168: invokevirtual toString : ()Ljava/lang/String;
    //   171: invokespecial <init> : (Ljava/lang/String;)V
    //   174: athrow
    //   175: astore #6
    //   177: aload #4
    //   179: ifnull -> 209
    //   182: aload #4
    //   184: invokevirtual close : ()V
    //   187: goto -> 209
    //   190: astore #7
    //   192: ldc ak/g
    //   194: invokevirtual getName : ()Ljava/lang/String;
    //   197: invokestatic getLogger : (Ljava/lang/String;)Ljava/util/logging/Logger;
    //   200: getstatic java/util/logging/Level.SEVERE : Ljava/util/logging/Level;
    //   203: aconst_null
    //   204: aload #7
    //   206: invokevirtual log :
    // (Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   209: aload #6
    //   211: athrow
    //   212: iload_3
    //   213: ireturn
    // Exception table:
    //   from	to	target	type
    //   8	82	117	java/io/FileNotFoundException
    //   8	82	146	java/io/IOException
    //   8	82	175	finally
    //   87	92	95	java/io/IOException
    //   117	177	175	finally
    //   182	187	190	java/io/IOException
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ak/aD.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
