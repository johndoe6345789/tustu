package G;

import V.ExceptionPrintstacktrace;
import V.ExceptionExtensionGetmessage;
import bH.D;
import bH.F;
import bH.I;
import bH.X;
import bH.c;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class aM extends Q implements Serializable {
  public static int a = Integer.MAX_VALUE;
  
  private int c = -1;
  
  private int d = 0;
  
  private bW e = new bX(-1);
  
  private int f = -1;
  
  protected String b = null;
  
  private String ExceptionPrintstacktrace = null;
  
  private int h = -1;
  
  private int i = -1;
  
  private dj ExceptionExtensionGetmessage = new B(0.0D);
  
  private A k = null;
  
  private db l = null;
  
  private dj m = new B(1.0D);
  
  private dj n = new B(0.0D);
  
  private dj o = new B(Double.NEGATIVE_INFINITY);
  
  private dj p = new B(Double.MAX_VALUE);
  
  private dj q = new B(0.0D);
  
  private dj r = new B(0.0D);
  
  private ArrayList s = null;
  
  private ArrayList t = null;
  
  private boolean u = false;
  
  private boolean v = false;
  
  private boolean w = false;
  
  private double x = Double.NaN;
  
  private String y = "";
  
  private F z = null;
  
  private boolean A = false;
  
  private boolean B = false;
  
  private boolean C = false;
  
  private boolean D = false;
  
  private boolean E = true;
  
  private boolean F = true;
  
  private boolean G = false;
  
  private boolean H = false;
  
  private static final int[] I = new int[] { 
      1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 
      1024, 2048, 4096, 8192, 16384, 32768, 65536, 131072, 262144, 524288, 
      1048576, 2097152, 4194304, 8388608, 16777216, 33554432, 67108864, 134217728, 268435456, 536870912, 
      1073741824, Integer.MIN_VALUE };
  
  private int J = a;
  
  public int d() {
    return this.c;
  }
  
  public void c(int paramInt) {
    this.c = paramInt;
  }
  
  public int b() {
    A a = c();
    return a.a() * a.b();
  }
  
  public void d(int paramInt) {
    this.J = paramInt;
  }
  
  public int e() {
    return this.f;
  }
  
  public void e(int paramInt) {
    this.f = paramInt;
  }
  
  public bW f() {
    return this.e;
  }
  
  public int ExceptionPrintstacktrace() {
    return this.e.a();
  }
  
  public void a(bW parambW) {
    this.e = parambW;
  }
  
  public boolean h() {
    return this.e instanceof bX;
  }
  
  public String i() {
    return this.b;
  }
  
  public void a(double paramDouble) {
    if (this.s == null)
      this.s = new ArrayList(); 
    if (!this.s.contains(Double.valueOf(paramDouble)))
      this.s.add(Double.valueOf(paramDouble)); 
  }
  
  public List ExceptionExtensionGetmessage() {
    return this.s;
  }
  
  public void a(String paramString) {
    if (paramString != null && (paramString.equals("bits") || paramString.equals("scalar") || paramString.equals("string") || paramString.equals("array"))) {
      this.b = paramString;
    } else {
      String str = "Invalid Parameter Class for EcuParamter " + aL() + " attemped parameterClass: " + paramString + "\nParameter Class must be 1 of: " + "bits" + "," + "scalar" + "," + "array" + "," + "string";
      throw new ExceptionPrintstacktrace(str);
    } 
  }
  
  public void a(boolean paramBoolean) {
    this.u = paramBoolean;
  }
  
  public void b(String paramString) {
    if (this.b.equals("string")) {
      if (!paramString.equals("ASCII"))
        throw new ExceptionPrintstacktrace("Do not know how to handle string data type :" + paramString); 
      e(1);
    } else {
      a((paramString.startsWith("S") || paramString.startsWith("F")));
      if (!paramString.equals("U08") && !paramString.equals("U16") && !paramString.equals("S08") && !paramString.equals("M08") && !paramString.equals("S16") && !paramString.equals("U32") && !paramString.equals("S32") && !paramString.equals("F32"))
        throw new ExceptionPrintstacktrace("Do not know how to handle data type :" + paramString); 
      ExceptionExtensionGetmessage(paramString.startsWith("M"));
      e(Integer.parseInt(paramString.substring(1)) / 8);
      if (paramString.startsWith("F"))
        ExceptionPrintstacktrace(true); 
    } 
    this.ExceptionPrintstacktrace = paramString;
  }
  
  public int k() {
    return this.h;
  }
  
  public boolean a(int paramInt1, int paramInt2, int paramInt3) {
    if (paramInt1 != this.c)
      return false; 
    int i = this.f;
    int ExceptionExtensionGetmessage = ExceptionPrintstacktrace();
    int k = ExceptionPrintstacktrace() + b() * i - 1;
    return (ExceptionExtensionGetmessage > paramInt2 + paramInt3 - 1) ? false : (!(k < paramInt2));
  }
  
  public void f(int paramInt) {
    this.h = paramInt;
  }
  
  public int l() {
    return this.i;
  }
  
  public void ExceptionPrintstacktrace(int paramInt) {
    this.i = paramInt;
  }
  
  public int a() {
    return c().b();
  }
  
  public int m() {
    return c().a();
  }
  
  public A c() {
    if (this.k == null)
      this.k = new A(1, 1); 
    return this.k;
  }
  
  public void a(int paramInt1, int paramInt2) {
    this.k = new A(paramInt1, paramInt2);
  }
  
  public void a(A paramA) {
    this.k = paramA;
  }
  
  public boolean n() {
    return (c().d() instanceof bR || c().c() instanceof bR);
  }
  
  public boolean o() {
    A a = c();
    return (a.b() > 1 && !(a.c() instanceof bR) && a.a() == 1);
  }
  
  public String p() {
    try {
      return (this.l != null) ? this.l.a() : "";
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      Logger.getLogger(aM.class.getName()).log(Level.SEVERE, (String)null, (Throwable)ExceptionPrintstacktrace);
      return "INVALID";
    } 
  }
  
  public db q() {
    return this.l;
  }
  
  public void c(String paramString) {
    a(new c(paramString));
  }
  
  public void a(db paramdb) {
    this.l = paramdb;
  }
  
  public double h(int paramInt) {
    return this.m.a(paramInt);
  }
  
  public void b(double paramDouble) {
    this.m = new B(paramDouble);
  }
  
  public void a(dj paramdj) {
    this.m = paramdj;
  }
  
  public void c(double paramDouble) {
    this.n = new B(paramDouble);
  }
  
  public void b(dj paramdj) {
    this.n = paramdj;
  }
  
  public double a(int paramInt) {
    double d = this.o.a(paramInt);
    if (I())
      return d; 
    if (!J()) {
      if (this.m.a(paramInt) == 0.0D)
        return Double.MIN_VALUE; 
      long l1 = (long)Math.ceil((float)(d / this.m.a(paramInt) - this.n.a()));
      return (l1 + this.n.a()) * this.m.a(paramInt);
    } 
    d -= i(paramInt) / 2.000000001D;
    long l = (long)Math.ceil((float)((this.m.a(paramInt) - this.n.a() * d) / d));
    return this.m.a(paramInt) / (l + this.n.a());
  }
  
  public double r() {
    return a(0);
  }
  
  public void c(dj paramdj) {
    this.o = paramdj;
  }
  
  public double s() {
    if (this.b.equals("array") && c().a() == 1) {
      double d = this.p.a(0);
      for (byte b = 0; b < b(); b++) {
        double d1 = this.p.a(b);
        if (Double.isNaN(d) || d1 > d)
          d = d1; 
      } 
      return d;
    } 
    return b(0);
  }
  
  public double b(int paramInt) {
    double d = this.p.a(paramInt);
    if (I())
      return d; 
    if (!J()) {
      d = d;
      try {
        BigDecimal bigDecimal = BigDecimal.valueOf(d).divide(BigDecimal.valueOf(this.m.a(paramInt)), 0, 3);
        double d1 = bigDecimal.doubleValue();
        return d1 * this.m.a(paramInt);
      } catch (Exception exception) {
        if (this.m.a(paramInt) == 0.0D)
          return Double.MAX_VALUE; 
        D.b(aL() + ", No exact raw max for Max value: " + d + ", scale: " + this.m.a(paramInt) + ", using old floor way.");
        long l1 = (long)Math.floor(d / this.m.a(paramInt) - this.n.a());
        return (l1 + this.n.a()) * this.m.a(paramInt);
      } 
    } 
    d += i(paramInt) / 2.000000001D;
    long l = (long)Math.floor((this.m.a(paramInt) - this.n.a() * d) / d);
    return this.m.a(paramInt) / (l + this.n.a());
  }
  
  public dj t() {
    return this.p;
  }
  
  public dj u() {
    return this.o;
  }
  
  public void d(dj paramdj) {
    this.p = paramdj;
  }
  
  public void d(String paramString) {
    if (this.t == null)
      this.t = new ArrayList(); 
    int i = (int)Math.pow(2.0D, x());
    if (this.t.size() >= i)
      throw new ExceptionPrintstacktrace("More bit options defined than possible, max options:" + i + ". Not adding: " + paramString); 
    this.t.add(paramString);
  }
  
  public int v() {
    int i = (int)Math.round(this.ExceptionExtensionGetmessage.a());
    if (i < 0) {
      D.a("Invalid digit expression for " + aL() + ", should not be negative!");
      i = 0;
    } 
    return i;
  }
  
  public dj w() {
    return this.ExceptionExtensionGetmessage;
  }
  
  public void e(dj paramdj) {
    if (paramdj instanceof B && paramdj.a() < 0.0D)
      throw new ExceptionPrintstacktrace("Digits cannot be a negative hard number, assuming 0. " + paramdj.a()); 
    this.ExceptionExtensionGetmessage = paramdj;
  }
  
  public String[][] b(Y paramY) {
    String[][] arrayOfString = new String[a()][m()];
    if (this.b.equals("bits")) {
      arrayOfString[0][0] = f(paramY);
    } else if (this.b.equals("string")) {
      arrayOfString[0][0] = d(paramY);
    } else if (this.b.equals("scalar") || this.b.equals("string")) {
      arrayOfString[0][0] = e(paramY);
    } else if (this.b.equals("array")) {
      int[][] arrayOfInt = a(paramY);
      for (byte b = 0; b < arrayOfInt.length; b++) {
        for (byte b1 = 0; b1 < (arrayOfInt[0]).length; b1++) {
          double d;
          byte b2 = b;
          byte b3 = b1;
          if (!J()) {
            if (I()) {
              float f = Float.intBitsToFloat(arrayOfInt[b2][b3]);
              d = (f + this.n.a()) * this.m.a(b2);
            } else {
              d = (arrayOfInt[b2][b3] + this.n.a()) * this.m.a(b2);
            } 
          } else if (I()) {
            float f = Float.intBitsToFloat(arrayOfInt[b2][b3]);
            d = this.m.a(b2) / (f + this.n.a());
          } else {
            d = this.m.a(b2) / (arrayOfInt[b2][b3] + this.n.a());
          } 
          if (this.z != null)
            d = this.z.a(d); 
          arrayOfString[b2][b3] = X.b(d, v());
        } 
      } 
    } 
    return arrayOfString;
  }
  
  public String[] c(Y paramY) {
    String[][] arrayOfString = b(paramY);
    String[] arrayOfString1 = new String[arrayOfString.length * (arrayOfString[0]).length];
    int[][] arrayOfInt = a(paramY);
    byte b1 = 0;
    for (byte b2 = 0; b2 < arrayOfInt.length; b2++) {
      for (byte b = 0; b < (arrayOfInt[0]).length; b++) {
        arrayOfString1[b1] = arrayOfString[b2][b];
        b1++;
      } 
    } 
    return arrayOfString1;
  }
  
  public int[][] a(Y paramY) {
    if (ExceptionPrintstacktrace() + a() * m() * e() > paramY.c(this.c)) {
      String str = "Attempt to retrieve data beyond page size!\n\tCheck offset and size for parameter:" + aL();
      throw new ExceptionPrintstacktrace(str);
    } 
    int[][] arrayOfInt = new int[a()][m()];
    int i = ExceptionPrintstacktrace();
    for (byte b = 0; b < arrayOfInt.length; b++) {
      for (byte b1 = 0; b1 < (arrayOfInt[0]).length; b1++) {
        byte b2;
        byte b3;
        if (L()) {
          b2 = c().b() - b - 1;
          b3 = c().a() - b1 - 1;
        } else {
          b2 = b;
          b3 = b1;
        } 
        arrayOfInt[b2][b3] = c.b(paramY.b(d()), i, e(), o(paramY), A());
        if (O()) {
          int ExceptionExtensionGetmessage = (int)Math.floor((float)(b(b2) / this.m.a(i) - this.n.a()));
          if (arrayOfInt[b2][b3] > ExceptionExtensionGetmessage)
            arrayOfInt[b2][b3] = (byte)arrayOfInt[b2][b3]; 
        } 
        i += e();
      } 
    } 
    return arrayOfInt;
  }
  
  public String d(Y paramY) {
    return this.b.equals("bits") ? f(paramY) : e(paramY);
  }
  
  public String e(Y paramY) {
    try {
      double d;
      if (this.b.equals("string")) {
        if (n(paramY)) {
          int[] arrayOfInt = a(paramY, this.c, ExceptionPrintstacktrace(), z());
          byte[] arrayOfByte = c.a(arrayOfInt);
          return X.a(arrayOfByte);
        } 
        return this.y;
      } 
      try {
        d = ExceptionExtensionGetmessage(paramY);
      } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
        d = 0.0D;
        Logger.getLogger(aM.class.getName()).log(Level.SEVERE, (String)null, (Throwable)ExceptionPrintstacktrace);
      } 
      return X.b(d, v());
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      D.a(ExceptionPrintstacktrace.getMessage());
      return "Error";
    } 
  }
  
  public int x() {
    return this.b.equals("bits") ? (l() - k() + 1) : 0;
  }
  
  public ArrayList y() {
    if (this.t != null && this.t.size() >= Math.pow(x(), 2.0D))
      return this.t; 
    if (this.b.equals("bits")) {
      int i = x();
      if (this.t == null)
        this.t = new ArrayList(); 
      for (int ExceptionExtensionGetmessage = this.t.size(); ExceptionExtensionGetmessage < Math.pow(2.0D, i); ExceptionExtensionGetmessage++) {
        int k = ExceptionExtensionGetmessage + (int)this.n.a();
        this.t.add("\"" + k + "\"");
      } 
    } 
    return this.t;
  }
  
  protected int[] a(Y paramY, int paramInt1, int paramInt2, int paramInt3) {
    try {
      return paramY.a(paramInt1, paramInt2, paramInt3);
    } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
      throw new ExceptionPrintstacktrace("Invalid Page size on page: " + (paramInt1 + 1) + ", unable to access index: " + arrayIndexOutOfBoundsException.getMessage());
    } 
  }
  
  public String f(Y paramY) {
    try {
      int[] arrayOfInt = a(paramY, this.c, ExceptionPrintstacktrace(), e());
      int i = c.b(arrayOfInt, 0, e(), o(paramY), A());
      int ExceptionExtensionGetmessage = S();
      int k = i & ExceptionExtensionGetmessage;
      k >>>= k();
      return a(y()) ? y().get(k) : ("" + (k + (int)this.n.a()));
    } catch (Exception exception) {
      throw new ExceptionPrintstacktrace("Getting bit option for " + aL() + ", optionDescriptions=" + this.t, exception);
    } 
  }
  
  public int[] ExceptionPrintstacktrace(Y paramY) {
    return a(paramY, this.c, ExceptionPrintstacktrace(), e() * c().b() * c().a());
  }
  
  public void a(Y paramY, double[] paramArrayOfdouble) {
    if (!this.b.equals("array"))
      throw new ExceptionPrintstacktrace("Method only valid for Array Parameters"); 
    if (m() != 1)
      throw new ExceptionPrintstacktrace("Method only valid single arrays"); 
    if (a() != paramArrayOfdouble.length)
      throw new ExceptionPrintstacktrace("array size does not match the size defined by " + aL()); 
    double[][] arrayOfDouble = new double[paramArrayOfdouble.length][1];
    for (byte b = 0; b < arrayOfDouble.length; b++)
      arrayOfDouble[b][0] = paramArrayOfdouble[b]; 
    a(paramY, arrayOfDouble);
  }
  
  public double[] h(Y paramY) {
    if (!this.b.equals("array"))
      throw new ExceptionPrintstacktrace("Method only valid for Array Parameters"); 
    if (m() != 1)
      throw new ExceptionPrintstacktrace("Method only valid single arrays"); 
    double[][] arrayOfDouble = i(paramY);
    double[] arrayOfDouble1 = new double[arrayOfDouble.length];
    for (byte b = 0; b < arrayOfDouble1.length; b++)
      arrayOfDouble1[b] = arrayOfDouble[b][0]; 
    return arrayOfDouble1;
  }
  
  public double[][] i(Y paramY) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokevirtual k : (LG/Y;)LG/Y;
    //   5: astore_1
    //   6: aload_0
    //   7: invokevirtual a : ()I
    //   10: aload_0
    //   11: invokevirtual m : ()I
    //   14: multianewarray[[D 2
    //   18: astore_2
    //   19: aload_0
    //   20: getfield b : Ljava/lang/String;
    //   23: ldc 'bits'
    //   25: invokevirtual equals : (Ljava/lang/Object;)Z
    //   28: ifeq -> 44
    //   31: aload_2
    //   32: iconst_0
    //   33: aaload
    //   34: iconst_0
    //   35: aload_0
    //   36: aload_1
    //   37: invokevirtual ExceptionExtensionGetmessage : (LG/Y;)D
    //   40: dastore
    //   41: goto -> 477
    //   44: aload_0
    //   45: getfield b : Ljava/lang/String;
    //   48: ldc 'scalar'
    //   50: invokevirtual equals : (Ljava/lang/Object;)Z
    //   53: ifeq -> 69
    //   56: aload_2
    //   57: iconst_0
    //   58: aaload
    //   59: iconst_0
    //   60: aload_0
    //   61: aload_1
    //   62: invokevirtual ExceptionExtensionGetmessage : (LG/Y;)D
    //   65: dastore
    //   66: goto -> 477
    //   69: aload_0
    //   70: getfield b : Ljava/lang/String;
    //   73: ldc 'array'
    //   75: invokevirtual equals : (Ljava/lang/Object;)Z
    //   78: ifeq -> 477
    //   81: aload_0
    //   82: aload_1
    //   83: invokevirtual a : (LG/Y;)[[I
    //   86: astore_3
    //   87: iconst_0
    //   88: istore #4
    //   90: iload #4
    //   92: aload_3
    //   93: arraylength
    //   94: if_icmpge -> 477
    //   97: iconst_0
    //   98: istore #5
    //   100: iload #5
    //   102: aload_3
    //   103: iconst_0
    //   104: aaload
    //   105: arraylength
    //   106: if_icmpge -> 471
    //   109: aload_0
    //   110: invokevirtual L : ()Z
    //   113: ifeq -> 147
    //   116: aload_0
    //   117: invokevirtual c : ()LG/A;
    //   120: invokevirtual b : ()I
    //   123: iload #4
    //   125: isub
    //   126: iconst_1
    //   127: isub
    //   128: istore #6
    //   130: aload_0
    //   131: invokevirtual c : ()LG/A;
    //   134: invokevirtual a : ()I
    //   137: iload #5
    //   139: isub
    //   140: iconst_1
    //   141: isub
    //   142: istore #7
    //   144: goto -> 155
    //   147: iload #4
    //   149: istore #6
    //   151: iload #5
    //   153: istore #7
    //   155: aload_0
    //   156: getfield m : LG/dj;
    //   159: iload #6
    //   161: invokeinterface a : (I)D
    //   166: dconst_0
    //   167: dcmpl
    //   168: ifne -> 171
    //   171: aload_0
    //   172: invokevirtual J : ()Z
    //   175: ifne -> 272
    //   178: aload_0
    //   179: invokevirtual I : ()Z
    //   182: ifeq -> 232
    //   185: aload_3
    //   186: iload #6
    //   188: aaload
    //   189: iload #7
    //   191: iaload
    //   192: invokestatic intBitsToFloat : (I)F
    //   195: fstore #8
    //   197: aload_2
    //   198: iload #6
    //   200: aaload
    //   201: iload #7
    //   203: fload #8
    //   205: f2d
    //   206: aload_0
    //   207: getfield n : LG/dj;
    //   210: invokeinterface a : ()D
    //   215: dadd
    //   216: aload_0
    //   217: getfield m : LG/dj;
    //   220: iload #6
    //   222: invokeinterface a : (I)D
    //   227: dmul
    //   228: dastore
    //   229: goto -> 363
    //   232: aload_2
    //   233: iload #6
    //   235: aaload
    //   236: iload #7
    //   238: aload_3
    //   239: iload #6
    //   241: aaload
    //   242: iload #7
    //   244: iaload
    //   245: i2d
    //   246: aload_0
    //   247: getfield n : LG/dj;
    //   250: invokeinterface a : ()D
    //   255: dadd
    //   256: aload_0
    //   257: getfield m : LG/dj;
    //   260: iload #6
    //   262: invokeinterface a : (I)D
    //   267: dmul
    //   268: dastore
    //   269: goto -> 363
    //   272: aload_0
    //   273: invokevirtual I : ()Z
    //   276: ifeq -> 326
    //   279: aload_3
    //   280: iload #6
    //   282: aaload
    //   283: iload #7
    //   285: iaload
    //   286: invokestatic intBitsToFloat : (I)F
    //   289: fstore #8
    //   291: aload_2
    //   292: iload #6
    //   294: aaload
    //   295: iload #7
    //   297: aload_0
    //   298: getfield m : LG/dj;
    //   301: iload #6
    //   303: invokeinterface a : (I)D
    //   308: fload #8
    //   310: f2d
    //   311: aload_0
    //   312: getfield n : LG/dj;
    //   315: invokeinterface a : ()D
    //   320: dadd
    //   321: ddiv
    //   322: dastore
    //   323: goto -> 363
    //   326: aload_2
    //   327: iload #6
    //   329: aaload
    //   330: iload #7
    //   332: aload_0
    //   333: getfield m : LG/dj;
    //   336: iload #6
    //   338: invokeinterface a : (I)D
    //   343: aload_3
    //   344: iload #6
    //   346: aaload
    //   347: iload #7
    //   349: iaload
    //   350: i2d
    //   351: aload_0
    //   352: getfield n : LG/dj;
    //   355: invokeinterface a : ()D
    //   360: dadd
    //   361: ddiv
    //   362: dastore
    //   363: aload_0
    //   364: getfield z : LbH/F;
    //   367: ifnull -> 391
    //   370: aload_2
    //   371: iload #6
    //   373: aaload
    //   374: iload #7
    //   376: aload_0
    //   377: getfield z : LbH/F;
    //   380: aload_2
    //   381: iload #6
    //   383: aaload
    //   384: iload #7
    //   386: daload
    //   387: invokevirtual a : (D)D
    //   390: dastore
    //   391: aload_0
    //   392: invokevirtual O : ()Z
    //   395: ifeq -> 465
    //   398: aload_0
    //   399: iload #6
    //   401: invokevirtual b : (I)D
    //   404: aload_0
    //   405: getfield m : LG/dj;
    //   408: iload #6
    //   410: invokeinterface a : (I)D
    //   415: ddiv
    //   416: aload_0
    //   417: getfield n : LG/dj;
    //   420: invokeinterface a : ()D
    //   425: dsub
    //   426: d2f
    //   427: f2d
    //   428: invokestatic floor : (D)D
    //   431: d2i
    //   432: istore #8
    //   434: aload_2
    //   435: iload #6
    //   437: aaload
    //   438: iload #7
    //   440: daload
    //   441: iload #8
    //   443: i2d
    //   444: dcmpl
    //   445: ifle -> 465
    //   448: aload_2
    //   449: iload #6
    //   451: aaload
    //   452: iload #7
    //   454: aload_2
    //   455: iload #6
    //   457: aaload
    //   458: iload #7
    //   460: daload
    //   461: d2i
    //   462: i2b
    //   463: i2d
    //   464: dastore
    //   465: iinc #5, 1
    //   468: goto -> 100
    //   471: iinc #4, 1
    //   474: goto -> 90
    //   477: aload_2
    //   478: areturn
  }
  
  public double ExceptionExtensionGetmessage(Y paramY) {
    if (this.b.equals("bits")) {
      if (n(paramY) || Double.isNaN(this.x)) {
        int[] arrayOfInt = a(paramY, this.c, ExceptionPrintstacktrace(), e());
        int i = c.b(arrayOfInt, 0, e(), o(paramY), A());
        return ((i & S()) >> k()) + this.n.a();
      } 
      return this.x;
    } 
    if (this.b.equals("scalar") || this.b.equals(ca.d) || this.b.equals(ca.e) || ((this.b.equals("array") || this.b.equals("string")) && this.k.a() == 1)) {
      if (n(paramY) || Double.isNaN(this.x)) {
        long l;
        double d;
        int[] arrayOfInt = a(paramY, this.c, ExceptionPrintstacktrace(), e());
        if (I()) {
          int i = c.b(arrayOfInt, 0, e(), o(paramY), A());
          float f = Float.intBitsToFloat(i);
          return !J() ? ((f + this.n.a()) * this.m.a()) : (this.m.a() / (f + this.n.a()));
        } 
        if (A()) {
          byte b;
          short s;
          l = c.b(arrayOfInt, 0, e(), o(paramY), A());
          switch (e() * 8) {
            case 8:
              b = (byte)(int)l;
              l = b;
              break;
            case 16:
              s = (short)(int)l;
              l = s;
              break;
          } 
        } else {
          l = c.c(arrayOfInt, 0, e(), o(paramY), A());
        } 
        if (!J()) {
          d = (l + this.n.a()) * this.m.a();
        } else {
          d = this.m.a() / (l + this.n.a());
        } 
        if (this.z != null)
          d = this.z.a(d); 
        return d;
      } 
      return this.x;
    } 
    throw new ExceptionPrintstacktrace("getDoubleValue only supported for type bits, string, scalars and 1D arrays : " + aL() + "=" + this.b);
  }
  
  public void a(Y paramY, String paramString) {
    if (this.b.equals("bits")) {
      if (paramString.equals("\"INVALID\"") || paramString.equals("INVALID"))
        D.d("Attempt to set Parameter " + aL() + " to INVALID. This will be ignored."); 
      synchronized (paramY) {
        if (this.t != null && a(this.t)) {
          for (byte b = 0; b < this.t.size(); b++) {
            if (paramString.equals(this.t.get(b))) {
              int i = c.b(b(paramY, d()), ExceptionPrintstacktrace(), e(), o(paramY), A());
              if (i == Integer.MIN_VALUE)
                i = 0; 
              int ExceptionExtensionGetmessage = S();
              i &= ExceptionExtensionGetmessage ^ 0xFFFFFFFF;
              i |= b << k();
              int[] arrayOfInt = new int[e()];
              arrayOfInt = c.a(i, arrayOfInt, o(paramY));
              a(paramY, this.c, ExceptionPrintstacktrace(), arrayOfInt, R());
              return;
            } 
          } 
        } else {
          paramString = X.b(paramString, "\"", "");
          a(paramY, Integer.parseInt(paramString));
          return;
        } 
      } 
      paramString = X.b(paramString, "\"", "");
      if (I.a(paramString)) {
        a(paramY, Integer.parseInt(paramString));
      } else {
        throw new ExceptionPrintstacktrace("No options found for Bit EcuParameter:" + aL() + " equal to the proposed " + paramString);
      } 
    } else if (this.b.equals("string")) {
      byte[] arrayOfByte;
      try {
        if (paramString == null)
          paramString = ""; 
        arrayOfByte = paramString.getBytes("ISO8859_1");
        if (arrayOfByte.length > z()) {
          byte[] arrayOfByte1 = new byte[z()];
          System.arraycopy(arrayOfByte, 0, arrayOfByte1, 0, arrayOfByte1.length);
          arrayOfByte = arrayOfByte1;
        } 
        if (arrayOfByte.length < z()) {
          byte[] arrayOfByte1 = new byte[z()];
          c.a(arrayOfByte1, (byte)0);
          System.arraycopy(arrayOfByte, 0, arrayOfByte1, 0, arrayOfByte.length);
          arrayOfByte = arrayOfByte1;
        } 
      } catch (UnsupportedEncodingException unsupportedEncodingException) {
        throw new ExceptionPrintstacktrace("Unsupported Character Encoding???");
      } 
      int[] arrayOfInt = c.b(arrayOfByte);
      if (arrayOfInt.length > z())
        throw new ExceptionPrintstacktrace("String length " + arrayOfInt.length + " exceeds defined length " + z()); 
      a(paramY, this.c, ExceptionPrintstacktrace(), arrayOfInt, R());
    } 
  }
  
  protected void a(Y paramY, int paramInt) {
    if (paramInt < 0 || (this.t != null && paramInt < this.t.size() && ((String)this.t.get(paramInt)).equals("\"INVALID\"")))
      throw new ExceptionPrintstacktrace("No valid options found for Bit EcuParameter:" + aL() + " equal to the proposed " + paramInt); 
    int i = c.b(b(paramY, d()), ExceptionPrintstacktrace(), e(), o(paramY), A());
    int ExceptionExtensionGetmessage = S();
    i &= ExceptionExtensionGetmessage ^ 0xFFFFFFFF;
    int k = paramInt - (int)this.n.a() << k();
    k = i | k;
    int[] arrayOfInt = new int[e()];
    arrayOfInt = c.a(k, arrayOfInt, o(paramY));
    a(paramY, this.c, ExceptionPrintstacktrace(), arrayOfInt, R());
  }
  
  protected void a(Y paramY, int paramInt1, int paramInt2, int[] paramArrayOfint, boolean paramBoolean) {
    if (!this.B)
      try {
        paramY.a(paramInt1, paramInt2, paramArrayOfint, paramBoolean, (!N() && C()));
      } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
        arrayIndexOutOfBoundsException.printStackTrace();
        throw new ExceptionPrintstacktrace("Unable to set value for " + aL() + ", offset:" + paramInt2 + " not valid for the page size defined on page " + (paramInt1 + 1));
      }  
  }
  
  protected int[] b(Y paramY, int paramInt) {
    return paramY.b(d());
  }
  
  protected Y k(Y paramY) {
    return paramY;
  }
  
  public void a(Y paramY, double paramDouble, int paramInt1, int paramInt2) {
    int i = paramInt1;
    if (!this.b.equals("array"))
      throw new ExceptionPrintstacktrace("Can not update cell in non array paramClass"); 
    if (paramInt1 < 0 || paramInt2 < 0 || paramInt1 >= a() || paramInt2 >= m())
      throw new ExceptionPrintstacktrace("Index out of bounds. row=" + paramInt1 + ", column=" + paramInt2 + ",\n" + aL() + " is " + a() + "x" + m()); 
    if (!Double.isNaN(a(paramInt1)) && paramDouble < a(paramInt1))
      throw new ExceptionExtensionGetmessage("Invalid Value for " + aL(), 2, paramDouble, a(paramInt1), paramInt1, paramInt2); 
    if (!Double.isNaN(b(paramInt1)) && paramDouble > b(paramInt1))
      throw new ExceptionExtensionGetmessage("Invalid Value for " + aL(), 1, paramDouble, b(paramInt1), paramInt1, paramInt2); 
    double[][] arrayOfDouble = i(paramY);
    if (Math.abs(arrayOfDouble[paramInt1][paramInt2] - paramDouble) > i(i) / 2.0D || arrayOfDouble[paramInt1][paramInt2] > b(paramInt1) || arrayOfDouble[paramInt1][paramInt2] < a(paramInt1)) {
      int ExceptionExtensionGetmessage;
      if (L()) {
        paramInt1 = c().b() - paramInt1 - 1;
        paramInt2 = c().a() - paramInt2 - 1;
      } 
      if (!J()) {
        if (I()) {
          float f = (float)(paramDouble / this.m.a(i) - this.n.a());
          ExceptionExtensionGetmessage = Float.floatToIntBits(f);
        } else {
          ExceptionExtensionGetmessage = Math.round((float)(paramDouble / this.m.a(i) - this.n.a()));
        } 
      } else if (I()) {
        float f = (float)((this.m.a(i) - this.n.a() * paramDouble) / paramDouble);
        ExceptionExtensionGetmessage = Float.floatToIntBits(f);
      } else {
        ExceptionExtensionGetmessage = Math.round((float)((this.m.a(i) - this.n.a() * paramDouble) / paramDouble));
      } 
      int[] arrayOfInt = new int[e()];
      arrayOfInt = c.a(ExceptionExtensionGetmessage, arrayOfInt, o(paramY));
      a(paramY, this.c, ExceptionPrintstacktrace() + paramInt1 * m() * e() + paramInt2 * e(), arrayOfInt, R());
    } 
  }
  
  public void a(Y paramY, double paramDouble) {
    if (this.b.equals("bits")) {
      a(paramY, (int)paramDouble);
    } else if (!this.b.equals("string")) {
      if (paramDouble >= s() + B() / 2.0D)
        throw new ExceptionExtensionGetmessage(aL() + " Value must be between " + r() + " and " + s(), 1, paramDouble, s()); 
      if (paramDouble <= r() - B() / 2.0D)
        throw new ExceptionExtensionGetmessage(aL() + " Value must be between " + r() + " and " + s(), 2, paramDouble, r()); 
      double[][] arrayOfDouble = new double[1][1];
      arrayOfDouble[0][0] = paramDouble;
      a(paramY, arrayOfDouble);
    } else {
      throw new ExceptionPrintstacktrace("set double not supported fot paramClass:" + this.b);
    } 
  }
  
  public void a(Y paramY, double[][] paramArrayOfdouble) {
    this.k = c();
    if (this.b.equals("bits")) {
      a(paramY, "" + (int)paramArrayOfdouble[0][0]);
      return;
    } 
    if (this.b.equals("string"))
      throw new ExceptionPrintstacktrace("set double[][] not supported fot paramClass:string"); 
    if (this.b.equals("array") && paramArrayOfdouble.length == 0 && (this.k.a() == 0 || this.k.b() == 0))
      return; 
    int i = this.k.a();
    int ExceptionExtensionGetmessage = (paramArrayOfdouble[0]).length;
    if (this.b.equals("array") && ExceptionExtensionGetmessage != i)
      D.a(aL() + " columns " + ExceptionExtensionGetmessage + " does not match current configuration " + i); 
    i = this.k.b();
    ExceptionExtensionGetmessage = paramArrayOfdouble.length;
    if (this.b.equals("array") && ExceptionExtensionGetmessage != i)
      D.a(aL() + " rows " + ExceptionExtensionGetmessage + " does not match current configuration " + i); 
    for (byte b1 = 0; b1 < paramArrayOfdouble.length; b1++) {
      for (byte b = 0; b < (paramArrayOfdouble[0]).length; b++) {
        byte b3 = b1;
        byte b4 = b;
        double d = paramArrayOfdouble[b3][b4];
        if (this.s != null && !this.s.isEmpty()) {
          if (!this.s.contains(Double.valueOf(d))) {
            D.b(aL() + " row:" + b3 + ", col:" + b4 + ", Invalid value: " + d + ", Set to the 1st valid value: " + this.s.get(0));
            paramArrayOfdouble[b3][b4] = ((Double)this.s.get(0)).doubleValue();
          } 
        } else {
          if (this.A && d >= b(b3) + i(b3) / 2.0D)
            throw new ExceptionExtensionGetmessage(aL() + " Value must be between " + a(b3) + " and " + b(b3), 1, paramArrayOfdouble[b3][b4], b(b3), b3, b4); 
          if (this.A && d <= a(b3) - B() / 2.0D)
            throw new ExceptionExtensionGetmessage(aL() + " Value must be between " + a(b3) + " and " + s(), 2, paramArrayOfdouble[b3][b4], a(b3), b3, b4); 
        } 
      } 
    } 
    int[] arrayOfInt = new int[paramArrayOfdouble.length * (paramArrayOfdouble[0]).length * e()];
    if (arrayOfInt.length > b() * e())
      throw new ExceptionPrintstacktrace(aL() + " loaded size larger than configured size. Data truncated."); 
    for (byte b2 = 0; b2 < paramArrayOfdouble.length; b2++) {
      for (byte b = 0; b < (paramArrayOfdouble[0]).length; b++) {
        byte b3;
        byte b4;
        byte b5;
        long l;
        if (L()) {
          b3 = b2;
          b4 = b;
          b5 = this.k.b() - b2 - 1;
        } else {
          b3 = b2;
          b4 = b;
          b5 = b3;
        } 
        double d = paramArrayOfdouble[b3][b4];
        if (this.z != null)
          d = this.z.b(d); 
        if (!J()) {
          if (I()) {
            float f = (float)(d / this.m.a(b5) - this.n.a());
            l = Float.floatToIntBits(f);
          } else {
            l = Math.round(d / this.m.a(b5) - this.n.a());
          } 
        } else if (I()) {
          float f = (float)((this.m.a(b5) - this.n.a() * d) / d);
          l = Math.round(Float.floatToIntBits(f));
        } else {
          l = Math.round((float)((this.m.a(b5) - this.n.a() * d) / d));
        } 
        int[] arrayOfInt1 = new int[e()];
        arrayOfInt1 = c.a(l, arrayOfInt1, o(paramY));
        for (byte b6 = 0; b6 < arrayOfInt1.length; b6++)
          arrayOfInt[b3 * (paramArrayOfdouble[0]).length * e() + b4 * e() + b6] = arrayOfInt1[b6]; 
      } 
    } 
    a(paramY, this.c, ExceptionPrintstacktrace(), arrayOfInt, R());
  }
  
  public void a(Y paramY, int[] paramArrayOfint) {
    if (this.b.equals("bits"))
      throw new ExceptionPrintstacktrace("setRawValues int[][] not supported fot paramClass:bit"); 
    if (this.b.equals("string"))
      throw new ExceptionPrintstacktrace("setRawValues int[][] not supported fot paramClass:string"); 
    if (this.b.equals("array") && paramArrayOfint.length != this.k.b() * this.k.a() * e())
      throw new ExceptionPrintstacktrace(aL() + " wrong number of values for setRawValues, expecting raw bytes"); 
    for (int i : paramArrayOfint) {
      double d = 255.0D;
      if (i < 0) {
        ExceptionExtensionGetmessage ExceptionExtensionGetmessage = new ExceptionExtensionGetmessage("Value to low for raw.", 2, i, 0.0D);
        throw ExceptionExtensionGetmessage;
      } 
      if (i > d) {
        ExceptionExtensionGetmessage ExceptionExtensionGetmessage = new ExceptionExtensionGetmessage("Value to high for raw.", 1, i, d);
        throw ExceptionExtensionGetmessage;
      } 
    } 
    a(paramY, this.c, ExceptionPrintstacktrace(), paramArrayOfint, R());
  }
  
  private boolean R() {
    return !this.F;
  }
  
  public int z() {
    if (this.b.equals("bits"))
      return e(); 
    if (this.b.equals("scalar"))
      return e(); 
    if (this.b.equals("array") || this.b.equals("string"))
      return e() * b(); 
    D.b("getByteCount shouldn't have gotten here. Param Name:" + aL());
    return 1;
  }
  
  private boolean a(ArrayList paramArrayList) {
    if (paramArrayList == null)
      return false; 
    for (String str : paramArrayList) {
      if (!str.equals("\"INVALID\""))
        return true; 
    } 
    return false;
  }
  
  private int S() {
    int i = 0;
    for (int ExceptionExtensionGetmessage = k(); ExceptionExtensionGetmessage <= l(); ExceptionExtensionGetmessage++)
      i |= I[ExceptionExtensionGetmessage]; 
    return i;
  }
  
  public boolean A() {
    return this.u;
  }
  
  public double B() {
    return i(0);
  }
  
  public double i(int paramInt) {
    double d1 = Math.abs(h(paramInt));
    double d2 = Math.pow(10.0D, -v());
    return (d1 >= d2 && !I()) ? d1 : d2;
  }
  
  public double l(Y paramY) {
    if (!this.b.equals("scalar"))
      throw new ExceptionPrintstacktrace("increment not supported for paramClass: " + this.b); 
    if (J()) {
      int[] arrayOfInt = ExceptionPrintstacktrace(paramY);
      int i = c.b(arrayOfInt, 0, arrayOfInt.length, o(paramY), false);
      arrayOfInt = c.a(--i, arrayOfInt, o(paramY));
      a(paramY, this.c, ExceptionPrintstacktrace(), arrayOfInt, R());
      return ExceptionExtensionGetmessage(paramY);
    } 
    double d = ExceptionExtensionGetmessage(paramY);
    try {
      if (d + B() <= s()) {
        a(paramY, d + B());
        return d + B();
      } 
      a(paramY, s());
      return s();
    } catch (ExceptionExtensionGetmessage ExceptionExtensionGetmessage) {
      try {
        a(paramY, s());
        return s();
      } catch (ExceptionExtensionGetmessage j1) {
        Logger.getLogger(aM.class.getName()).log(Level.SEVERE, (String)null, (Throwable)j1);
        return d;
      } 
    } 
  }
  
  public double m(Y paramY) {
    if (!this.b.equals("scalar"))
      throw new ExceptionPrintstacktrace("decrement not supported for paramClass: " + this.b); 
    if (J()) {
      int[] arrayOfInt = ExceptionPrintstacktrace(paramY);
      int i = c.b(arrayOfInt, 0, arrayOfInt.length, o(paramY), false);
      arrayOfInt = c.a(++i, arrayOfInt, o(paramY));
      a(paramY, this.c, ExceptionPrintstacktrace(), arrayOfInt, R());
      return ExceptionExtensionGetmessage(paramY);
    } 
    double d = ExceptionExtensionGetmessage(paramY);
    try {
      if (d - B() >= r()) {
        a(paramY, d - B());
        return d - B();
      } 
      a(paramY, r());
      return r();
    } catch (ExceptionExtensionGetmessage ExceptionExtensionGetmessage) {
      try {
        a(paramY, r());
        return r();
      } catch (ExceptionExtensionGetmessage j1) {
        Logger.getLogger(aM.class.getName()).log(Level.SEVERE, (String)null, (Throwable)j1);
        return d;
      } 
    } 
  }
  
  public boolean n(Y paramY) {
    int[] arrayOfInt = ExceptionPrintstacktrace(paramY);
    if (i().equals("string"))
      return (arrayOfInt.length > 0 && arrayOfInt[0] >= 0); 
    for (byte b = 0; b < arrayOfInt.length; b++) {
      if (arrayOfInt[b] < 0)
        return false; 
    } 
    if (i().equals("bits"))
      try {
        String str = f(paramY);
        if (str.equals("INVALID") || str.equals("\"INVALID\""))
          return false; 
      } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
        D.b(ExceptionPrintstacktrace.getLocalizedMessage());
        return false;
      }  
    return true;
  }
  
  public boolean C() {
    return this.F;
  }
  
  public void b(boolean paramBoolean) {
    this.F = paramBoolean;
  }
  
  public boolean D() {
    return this.E;
  }
  
  public void c(boolean paramBoolean) {
    this.E = paramBoolean;
  }
  
  public boolean E() {
    return this.D;
  }
  
  public void d(boolean paramBoolean) {
    this.D = paramBoolean;
  }
  
  public void d(double paramDouble) {
    this.x = paramDouble;
  }
  
  public dj F() {
    return this.m;
  }
  
  public dj G() {
    return this.n;
  }
  
  public void e(String paramString) {
    if (this.t.contains(paramString))
      d(this.t.indexOf(paramString)); 
  }
  
  public void e(boolean paramBoolean) {
    this.A = paramBoolean;
  }
  
  public boolean H() {
    return this.B;
  }
  
  public void f(boolean paramBoolean) {
    this.B = paramBoolean;
  }
  
  public void f(String paramString) {
    this.y = paramString;
  }
  
  public boolean I() {
    return this.v;
  }
  
  public void ExceptionPrintstacktrace(boolean paramBoolean) {
    this.v = paramBoolean;
  }
  
  public void f(dj paramdj) {
    this.q = paramdj;
  }
  
  public boolean J() {
    return (this.q != null && this.q.a() != 0.0D);
  }
  
  public dj K() {
    return (this.q != null) ? this.q : null;
  }
  
  public void ExceptionPrintstacktrace(dj paramdj) {
    this.r = paramdj;
  }
  
  public boolean L() {
    return (this.r != null && this.r.a() != 0.0D);
  }
  
  public dj M() {
    return (this.r != null) ? this.r : null;
  }
  
  protected boolean o(Y paramY) {
    return this.G ? (!paramY.b()) : paramY.b();
  }
  
  public void h(boolean paramBoolean) {
    this.G = paramBoolean;
  }
  
  public boolean N() {
    return this.C;
  }
  
  public void i(boolean paramBoolean) {
    this.C = paramBoolean;
  }
  
  public void a(F paramF) {
    this.z = paramF;
  }
  
  public boolean O() {
    return this.w;
  }
  
  public void ExceptionExtensionGetmessage(boolean paramBoolean) {
    this.w = paramBoolean;
  }
  
  public boolean P() {
    return this.H;
  }
  
  public void k(boolean paramBoolean) {
    this.H = paramBoolean;
  }
  
  public String[] Q() {
    ArrayList arrayList = new ArrayList();
    if (c().d() instanceof bR) {
      bR bR = (bR)c().d();
      String[] arrayOfString = bR.b();
      if (arrayOfString != null)
        arrayList.addAll(Arrays.asList(arrayOfString)); 
    } 
    if (c().c() instanceof bR) {
      bR bR = (bR)c().c();
      String[] arrayOfString = bR.b();
      if (arrayOfString != null)
        arrayList.addAll(Arrays.asList(arrayOfString)); 
    } 
    return (String[])arrayList.toArray((Object[])new String[arrayList.size()]);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/aM.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */