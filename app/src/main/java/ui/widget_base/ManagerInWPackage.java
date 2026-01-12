package W;

import V.ExceptionInVPackage;
import bH.D;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;

public class ManagerInWPackage {
  ArrayList ExceptionInVPackage = new ArrayList();

  String b = "";

  public ArrayList ExceptionInVPackage(File paramFile, int paramInt) {
    FileInputStream fileInputStream;
    if (paramFile == null || !paramFile.exists()) throw new ExceptionInVPackage("File Not Found!");
    this.b = "";
    ArrayList<n> arrayList = new ArrayList();
    try {
      fileInputStream = new FileInputStream(paramFile);
    } catch (FileNotFoundException fileNotFoundException) {
      throw new ExceptionInVPackage("File Not Found!\n" + paramFile.getAbsolutePath());
    }
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
    String str = "";
    try {
      bufferedReader.mark(1000);
      str = ExceptionInVPackage(bufferedReader);
      if (str == null || str.isEmpty()) bufferedReader.reset();
    } catch (IOException iOException) {
      D.c("Failed to get FirmwareIdentifier from file.");
    }
    try {
      this.b = b(bufferedReader);
    } catch (IOException iOException) {
      D.c("Failed to get FirmwareIdentifier from file.");
    }
    long l = paramFile.length();
    ArrayList arrayList1 = null;
    try {
      arrayList1 = c(bufferedReader);
    } catch (IOException iOException) {
      throw new ExceptionInVPackage(
          "Error Reading Trigger Log File, could not read header rows.\n"
              + paramFile.getAbsolutePath());
    } catch (Exception exception) {
      throw new ExceptionInVPackage(
          "Invalid File Format!\nError Opening Trigger Log File, could not parse header rows in:\n"
              + paramFile.getAbsolutePath());
    }
    byte b = 0;
    try {
      n n = ExceptionInVPackage(arrayList1, bufferedReader);
      n.c(str);
      n.d(this.b);
      b++;
      arrayList.add(n);
      ExceptionInVPackage(arrayList, l);
      while (n != null) {
        n = ExceptionInVPackage(arrayList1, bufferedReader);
        if (++b > paramInt) break;
        n.c(str);
        arrayList.add(n);
        if (!ExceptionInVPackage(l - fileInputStream.available())) break;
      }
    } catch (aD aD) {

    } catch (IOException iOException) {
      throw new ExceptionInVPackage(
          "Error Reading Trigger Log File\n" + paramFile.getAbsolutePath());
    } catch (Exception exception) {
      throw new ExceptionInVPackage(
          "Invalid File Format!\n"
              + "Error Reading Trigger Log File, could not understand header rows.\n"
              + paramFile.getAbsolutePath());
    }
    ExceptionInVPackage(arrayList);
    return arrayList;
  }

  public void b(File paramFile, int paramInt) {
    aE aE = new aE(this, paramFile, paramInt);
    aE.start();
  }

  private void ExceptionInVPackage(ArrayList paramArrayList, long paramLong) {
    Iterator<Y> iterator = this.ExceptionInVPackage.iterator();
    while (iterator.hasNext()) {
      try {
        ((Y) iterator.next()).ExceptionInVPackage(paramArrayList, paramLong);
      } catch (Exception exception) {
        D.ExceptionInVPackage(
            "Exception cause by ExceptionInVPackage LogLoadListener, this was caught and handled"
                + " but should be corrected in the implementation.");
        exception.printStackTrace();
      }
    }
  }

  private boolean ExceptionInVPackage(long paramLong) {
    boolean bool = true;
    Iterator<Y> iterator = this.ExceptionInVPackage.iterator();
    while (iterator.hasNext()) {
      try {
        if (!((Y) iterator.next()).ExceptionInVPackage(paramLong)) bool = false;
      } catch (Exception exception) {
        D.ExceptionInVPackage(
            "Exception cause by ExceptionInVPackage LogLoadListener, this was caught and handled"
                + " but should be corrected in the implementation.");
        exception.printStackTrace();
      }
    }
    return bool;
  }

  private void ExceptionInVPackage(ArrayList paramArrayList) {
    Iterator<Y> iterator = this.ExceptionInVPackage.iterator();
    while (iterator.hasNext()) {
      try {
        ((Y) iterator.next()).ExceptionInVPackage(paramArrayList);
      } catch (Exception exception) {
        D.ExceptionInVPackage(
            "Exception cause by ExceptionInVPackage LogLoadListener, this was caught and handled"
                + " but should be corrected in the implementation.");
        exception.printStackTrace();
      }
    }
  }

  private void ExceptionInVPackage(ExceptionInVPackage parama) {
    Iterator<Y> iterator = this.ExceptionInVPackage.iterator();
    while (iterator.hasNext()) {
      try {
        ((Y) iterator.next()).ExceptionInVPackage(parama);
      } catch (Exception exception) {
        D.ExceptionInVPackage(
            "Exception cause by ExceptionInVPackage LogLoadListener, this was caught and handled"
                + " but should be corrected in the implementation.");
        exception.printStackTrace();
      }
    }
  }

  public void ExceptionInVPackage(Y paramY) {
    this.ExceptionInVPackage.add(paramY);
  }

  private String ExceptionInVPackage(BufferedReader paramBufferedReader) {
    String str = paramBufferedReader.readLine();
    if (!str.startsWith("#")) {
      paramBufferedReader.reset();
      return "";
    }
    return str.startsWith("#Firmware:") ? str.substring(10).trim() : "";
  }

  private String b(BufferedReader paramBufferedReader) {
    paramBufferedReader.mark(2000);
    String str = paramBufferedReader.readLine();
    StringBuilder stringBuilder = new StringBuilder();
    while (true) {
      if (str.startsWith("Header:") || str.startsWith("\"")) {
        if (str.startsWith("Header:")) str = str.substring(8);
        if (stringBuilder.length() > 0) stringBuilder.append("\n");
        stringBuilder.append(str);
        paramBufferedReader.mark(1000);
        str = paramBufferedReader.readLine();
        continue;
      }
      paramBufferedReader.reset();
      return stringBuilder.toString();
    }
  }

  private ArrayList c(BufferedReader paramBufferedReader) {
    // Byte code:
    //   0: new java/util/ArrayList
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_2
    //   8: aload_1
    //   9: invokevirtual readLine : ()Ljava/lang/String;
    //   12: astore_3
    //   13: aload_3
    //   14: invokevirtual length : ()I
    //   17: ifeq -> 38
    //   20: aload_3
    //   21: ldc '#'
    //   23: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   26: ifne -> 38
    //   29: aload_3
    //   30: ldc 'Header:'
    //   32: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   35: ifeq -> 67
    //   38: aload_3
    //   39: ldc 'Header:'
    //   41: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   44: ifeq -> 59
    //   47: aload_0
    //   48: aload_3
    //   49: ldc 'Header:'
    //   51: ldc ''
    //   53: invokestatic b :
    // (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   56: putfield b : Ljava/lang/String;
    //   59: aload_1
    //   60: invokevirtual readLine : ()Ljava/lang/String;
    //   63: astore_3
    //   64: goto -> 13
    //   67: new java/util/StringTokenizer
    //   70: dup
    //   71: aload_3
    //   72: ldc ','
    //   74: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;)V
    //   77: astore #4
    //   79: aload #4
    //   81: invokevirtual hasMoreTokens : ()Z
    //   84: ifeq -> 117
    //   87: new W/aC
    //   90: dup
    //   91: aload_0
    //   92: invokespecial <init> : (LW/aB;)V
    //   95: astore #5
    //   97: aload #5
    //   99: aload #4
    //   101: invokevirtual nextToken : ()Ljava/lang/String;
    //   104: invokevirtual ExceptionInVPackage : (Ljava/lang/String;)V
    //   107: aload_2
    //   108: aload #5
    //   110: invokevirtual add : (Ljava/lang/Object;)Z
    //   113: pop
    //   114: goto -> 79
    //   117: iconst_0
    //   118: istore #4
    //   120: aload_1
    //   121: invokevirtual readLine : ()Ljava/lang/String;
    //   124: astore_3
    //   125: new java/util/StringTokenizer
    //   128: dup
    //   129: aload_3
    //   130: ldc ','
    //   132: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;)V
    //   135: astore #5
    //   137: aload #5
    //   139: invokevirtual hasMoreTokens : ()Z
    //   142: ifeq -> 187
    //   145: aload_2
    //   146: iload #4
    //   148: invokevirtual get : (I)Ljava/lang/Object;
    //   151: checkcast W/aC
    //   154: astore #6
    //   156: aload #5
    //   158: invokevirtual nextToken : ()Ljava/lang/String;
    //   161: astore #7
    //   163: aload #7
    //   165: ldc '"'
    //   167: ldc ''
    //   169: invokestatic b :
    // (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   172: astore #7
    //   174: aload #6
    //   176: aload #7
    //   178: invokevirtual b : (Ljava/lang/String;)V
    //   181: iinc #4, 1
    //   184: goto -> 137
    //   187: goto -> 219
    //   190: astore #4
    //   192: new V/ExceptionInVPackage
    //   195: dup
    //   196: new java/lang/StringBuilder
    //   199: dup
    //   200: invokespecial <init> : ()V
    //   203: ldc 'Invalid Header Row:\\n'
    //   205: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   208: aload_3
    //   209: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   212: invokevirtual toString : ()Ljava/lang/String;
    //   215: invokespecial <init> : (Ljava/lang/String;)V
    //   218: athrow
    //   219: aload_2
    //   220: areturn
    // Exception table:
    //   from	to	target	type
    //   67	187	190	java/lang/Exception
  }

  private n ExceptionInVPackage(ArrayList paramArrayList, BufferedReader paramBufferedReader) {
    n n = new n();
    if (this.b != null && !this.b.equals("")) n.d(this.b);
    Iterator<aC> iterator = paramArrayList.iterator();
    while (iterator.hasNext()) {
      j j = new j();
      aC aC = iterator.next();
      j.ExceptionInVPackage(aC.ExceptionInVPackage());
      j.e(aC.b());
      n.ExceptionInVPackage(j);
    }
    byte b = 0;
    String str = paramBufferedReader.readLine();
    if (str == null) throw new aD(this);
    while (str != null && !str.startsWith("MARK") && str.length() > 0) {
      b = 0;
      StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
      while (stringTokenizer.hasMoreTokens()) {
        j j = (j) n.get(b);
        j.b(stringTokenizer.nextToken());
        b++;
      }
      str = paramBufferedReader.readLine();
      if (str == null) throw new aD(this);
    }
    return n;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/W/aB.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
