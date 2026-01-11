package ak;

import M.KalmanFilterUsingMatrix;
import V.ExceptionInVPackage;
import W.T;
import bH.D;
import bH.ae;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class IOKalmanFilter extends g {
  File ExceptionInVPackage = null;
  
  d b = null;
  
  boolean H = false;
  
  int I = -1;
  
  float J = -1.0F;
  
  float K = 0.0F;
  
  int L = -1;
  
  int M = 0;
  
  private KalmanFilterUsingMatrix N;

  public IOKalmanFilter() {
    super("\t", false);
    double d1 = 50.0D;
    double d2 = 3.0D;
    double d3 = 5000.0D;
    this.N = KalmanFilterUsingMatrix.create(0.0D, 0.0D, d1, Math.pow(d2, 2.0D) / 2.0D, Math.pow(d3, 2.0D));
  }
  
  public boolean ExceptionInVPackage(String paramString) {
    FileInputStream fileInputStream = null;
    this.t = true;
    try {
      File file = new File(paramString);
      fileInputStream = new FileInputStream(file);
      byte[] arrayOfByte = new byte[2];
      fileInputStream.read(arrayOfByte);
      try {
        fileInputStream.close();
      } catch (Exception exception) {}
      if (arrayOfByte[0] == 80 && arrayOfByte[1] == 75) {
        ArrayList<File> arrayList = ae.ExceptionInVPackage(file, file.getParentFile(), "maxxecu-log;compressed-maxxecu-log");
        if (arrayList.size() > 0) {
          paramString = ((File)arrayList.get(0)).getAbsolutePath();
          this.ExceptionInVPackage = arrayList.get(0);
        } else {
          throw new ExceptionInVPackage("Unable to open file:\n" + paramString);
        } 
      } 
    } catch (FileNotFoundException fileNotFoundException) {
      throw new ExceptionInVPackage("Unable to open file for reading:\n" + fileNotFoundException.getLocalizedMessage());
    } catch (IOException iOException) {
      throw new ExceptionInVPackage("Unable to read from file:\n" + paramString);
    } 
    return super.ExceptionInVPackage(paramString);
  }
  
  public Iterator b() {
    ArrayList<T> arrayList = new ArrayList();
    byte b = 0;
    Iterator<T> iterator = super.b();
    while (iterator.hasNext()) {
      T t = iterator.next();
      arrayList.add(t);
      if (t instanceof d) {
        d d1 = (d)t;
        d1.b("");
      } 
      if (this.I < 0 && (t.ExceptionInVPackage().equals("ECU on time") || t.ExceptionInVPackage().equals("Log Timestamp"))) {
        this.I = b;
        this.H = t.ExceptionInVPackage().equals("Log Timestamp");
        D.c("ECU on time index: " + this.I);
      } 
      b++;
    } 
    if (this.I >= 0) {
      this.b = new d();
      this.b.ExceptionInVPackage("Time");
      this.b.b("s");
      this.b.ExceptionInVPackage(3);
      arrayList.add(this.b);
    } 
    return arrayList.iterator();
  }
  
  public float[] c() {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial c : ()[F
    //   4: astore_1
    //   5: aload_0
    //   6: getfield b : Lak/d;
    //   9: ifnull -> 337
    //   12: aload_0
    //   13: getfield H : Z
    //   16: ifeq -> 70
    //   19: aload_1
    //   20: aload_0
    //   21: getfield I : I
    //   24: faload
    //   25: ldc 1000.0
    //   27: fdiv
    //   28: fstore_2
    //   29: aload_0
    //   30: getfield J : F
    //   33: ldc -1.0
    //   35: fcmpl
    //   36: ifne -> 47
    //   39: aload_0
    //   40: fload_2
    //   41: putfield J : F
    //   44: goto -> 57
    //   47: aload_0
    //   48: aload_0
    //   49: getfield J : F
    //   52: fload_2
    //   53: fadd
    //   54: putfield J : F
    //   57: aload_1
    //   58: aload_1
    //   59: arraylength
    //   60: iconst_1
    //   61: isub
    //   62: aload_0
    //   63: getfield J : F
    //   66: fastore
    //   67: goto -> 337
    //   70: aload_1
    //   71: aload_0
    //   72: getfield I : I
    //   75: faload
    //   76: fstore_2
    //   77: fload_2
    //   78: f2d
    //   79: ldc2_w 15.25
    //   82: dcmpl
    //   83: iflt -> 86
    //   86: aload_0
    //   87: getfield J : F
    //   90: fload_2
    //   91: fcmpl
    //   92: ifne -> 105
    //   95: aload_0
    //   96: getfield J : F
    //   99: ldc -1.0
    //   101: fcmpl
    //   102: ifne -> 224
    //   105: aload_0
    //   106: getfield J : F
    //   109: ldc -1.0
    //   111: fcmpl
    //   112: ifne -> 182
    //   115: aload_0
    //   116: getfield N : LM/ExceptionInVPackage;
    //   119: new ExceptionInVPackage/b
    //   122: dup
    //   123: iconst_4
    //   124: anewarray [D
    //   127: dup
    //   128: iconst_0
    //   129: iconst_1
    //   130: newarray double
    //   132: dup
    //   133: iconst_0
    //   134: fload_2
    //   135: f2d
    //   136: dastore
    //   137: aastore
    //   138: dup
    //   139: iconst_1
    //   140: iconst_1
    //   141: newarray double
    //   143: dup
    //   144: iconst_0
    //   145: dconst_0
    //   146: dastore
    //   147: aastore
    //   148: dup
    //   149: iconst_2
    //   150: iconst_1
    //   151: newarray double
    //   153: dup
    //   154: iconst_0
    //   155: dconst_0
    //   156: dastore
    //   157: aastore
    //   158: dup
    //   159: iconst_3
    //   160: iconst_1
    //   161: newarray double
    //   163: dup
    //   164: iconst_0
    //   165: dconst_0
    //   166: dastore
    //   167: aastore
    //   168: invokespecial <init> : ([[D)V
    //   171: invokevirtual i : (La/b;)V
    //   174: aload_0
    //   175: fconst_0
    //   176: putfield K : F
    //   179: goto -> 192
    //   182: aload_0
    //   183: fload_2
    //   184: aload_0
    //   185: getfield J : F
    //   188: fsub
    //   189: putfield K : F
    //   192: aload_0
    //   193: fload_2
    //   194: putfield J : F
    //   197: aload_0
    //   198: getfield L : I
    //   201: iflt -> 214
    //   204: aload_0
    //   205: aload_0
    //   206: getfield L : I
    //   209: iconst_1
    //   210: iadd
    //   211: putfield M : I
    //   214: aload_0
    //   215: iconst_0
    //   216: putfield L : I
    //   219: fconst_0
    //   220: fstore_3
    //   221: goto -> 262
    //   224: aload_0
    //   225: dup
    //   226: getfield L : I
    //   229: iconst_1
    //   230: iadd
    //   231: putfield L : I
    //   234: aload_0
    //   235: getfield M : I
    //   238: ifle -> 260
    //   241: aload_0
    //   242: getfield K : F
    //   245: aload_0
    //   246: getfield L : I
    //   249: i2f
    //   250: aload_0
    //   251: getfield M : I
    //   254: i2f
    //   255: fdiv
    //   256: fmul
    //   257: goto -> 261
    //   260: fconst_0
    //   261: fstore_3
    //   262: fload_2
    //   263: fload_3
    //   264: fadd
    //   265: fstore #4
    //   267: aload_0
    //   268: getfield N : LM/ExceptionInVPackage;
    //   271: invokevirtual ExceptionInVPackage : ()V
    //   274: aload_0
    //   275: getfield N : LM/ExceptionInVPackage;
    //   278: new ExceptionInVPackage/b
    //   281: dup
    //   282: iconst_2
    //   283: anewarray [D
    //   286: dup
    //   287: iconst_0
    //   288: iconst_1
    //   289: newarray double
    //   291: dup
    //   292: iconst_0
    //   293: fload #4
    //   295: f2d
    //   296: dastore
    //   297: aastore
    //   298: dup
    //   299: iconst_1
    //   300: iconst_1
    //   301: newarray double
    //   303: dup
    //   304: iconst_0
    //   305: aload_0
    //   306: getfield J : F
    //   309: f2d
    //   310: dastore
    //   311: aastore
    //   312: invokespecial <init> : ([[D)V
    //   315: invokevirtual ExceptionInVPackage : (La/b;)V
    //   318: aload_1
    //   319: aload_1
    //   320: arraylength
    //   321: iconst_1
    //   322: isub
    //   323: aload_0
    //   324: getfield N : LM/ExceptionInVPackage;
    //   327: invokevirtual b : ()La/b;
    //   330: iconst_0
    //   331: iconst_0
    //   332: invokevirtual ExceptionInVPackage : (II)D
    //   335: d2f
    //   336: fastore
    //   337: aload_1
    //   338: areturn
  }
  
  public void ExceptionInVPackage() {
    super.ExceptionInVPackage();
    if (this.ExceptionInVPackage != null)
      this.ExceptionInVPackage.delete(); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ak/X.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */