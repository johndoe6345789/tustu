package linear_algebra;

import java.io.Serializable;

public class MatrixInverter implements Serializable {
  private double[][] a;

  private int b;

  private int c;

  private int d;

  private int[] e;

  public MatrixInverter(Matrix paramb) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: aload_1
    //   6: invokevirtual c : ()[[D
    //   9: putfield a : [[D
    //   12: aload_0
    //   13: aload_1
    //   14: invokevirtual d : ()I
    //   17: putfield b : I
    //   20: aload_0
    //   21: aload_1
    //   22: invokevirtual e : ()I
    //   25: putfield c : I
    //   28: aload_0
    //   29: aload_0
    //   30: getfield b : I
    //   33: newarray int
    //   35: putfield e : [I
    //   38: iconst_0
    //   39: istore_2
    //   40: iload_2
    //   41: aload_0
    //   42: getfield b : I
    //   45: if_icmpge -> 61
    //   48: aload_0
    //   49: getfield e : [I
    //   52: iload_2
    //   53: iload_2
    //   54: iastore
    //   55: iinc #2, 1
    //   58: goto -> 40
    //   61: aload_0
    //   62: iconst_1
    //   63: putfield d : I
    //   66: aload_0
    //   67: getfield b : I
    //   70: newarray double
    //   72: astore_3
    //   73: iconst_0
    //   74: istore #4
    //   76: iload #4
    //   78: aload_0
    //   79: getfield c : I
    //   82: if_icmpge -> 444
    //   85: iconst_0
    //   86: istore #5
    //   88: iload #5
    //   90: aload_0
    //   91: getfield b : I
    //   94: if_icmpge -> 117
    //   97: aload_3
    //   98: iload #5
    //   100: aload_0
    //   101: getfield a : [[D
    //   104: iload #5
    //   106: aaload
    //   107: iload #4
    //   109: daload
    //   110: dastore
    //   111: iinc #5, 1
    //   114: goto -> 88
    //   117: iconst_0
    //   118: istore #5
    //   120: iload #5
    //   122: aload_0
    //   123: getfield b : I
    //   126: if_icmpge -> 199
    //   129: aload_0
    //   130: getfield a : [[D
    //   133: iload #5
    //   135: aaload
    //   136: astore_2
    //   137: iload #5
    //   139: iload #4
    //   141: invokestatic min : (II)I
    //   144: istore #6
    //   146: dconst_0
    //   147: dstore #7
    //   149: iconst_0
    //   150: istore #9
    //   152: iload #9
    //   154: iload #6
    //   156: if_icmpge -> 179
    //   159: dload #7
    //   161: aload_2
    //   162: iload #9
    //   164: daload
    //   165: aload_3
    //   166: iload #9
    //   168: daload
    //   169: dmul
    //   170: dadd
    //   171: dstore #7
    //   173: iinc #9, 1
    //   176: goto -> 152
    //   179: aload_2
    //   180: iload #4
    //   182: aload_3
    //   183: iload #5
    //   185: dup2
    //   186: daload
    //   187: dload #7
    //   189: dsub
    //   190: dup2_x2
    //   191: dastore
    //   192: dastore
    //   193: iinc #5, 1
    //   196: goto -> 120
    //   199: iload #4
    //   201: istore #5
    //   203: iload #4
    //   205: iconst_1
    //   206: iadd
    //   207: istore #6
    //   209: iload #6
    //   211: aload_0
    //   212: getfield b : I
    //   215: if_icmpge -> 246
    //   218: aload_3
    //   219: iload #6
    //   221: daload
    //   222: invokestatic abs : (D)D
    //   225: aload_3
    //   226: iload #5
    //   228: daload
    //   229: invokestatic abs : (D)D
    //   232: dcmpl
    //   233: ifle -> 240
    //   236: iload #6
    //   238: istore #5
    //   240: iinc #6, 1
    //   243: goto -> 209
    //   246: iload #5
    //   248: iload #4
    //   250: if_icmpeq -> 356
    //   253: iconst_0
    //   254: istore #6
    //   256: iload #6
    //   258: aload_0
    //   259: getfield c : I
    //   262: if_icmpge -> 315
    //   265: aload_0
    //   266: getfield a : [[D
    //   269: iload #5
    //   271: aaload
    //   272: iload #6
    //   274: daload
    //   275: dstore #7
    //   277: aload_0
    //   278: getfield a : [[D
    //   281: iload #5
    //   283: aaload
    //   284: iload #6
    //   286: aload_0
    //   287: getfield a : [[D
    //   290: iload #4
    //   292: aaload
    //   293: iload #6
    //   295: daload
    //   296: dastore
    //   297: aload_0
    //   298: getfield a : [[D
    //   301: iload #4
    //   303: aaload
    //   304: iload #6
    //   306: dload #7
    //   308: dastore
    //   309: iinc #6, 1
    //   312: goto -> 256
    //   315: aload_0
    //   316: getfield e : [I
    //   319: iload #5
    //   321: iaload
    //   322: istore #6
    //   324: aload_0
    //   325: getfield e : [I
    //   328: iload #5
    //   330: aload_0
    //   331: getfield e : [I
    //   334: iload #4
    //   336: iaload
    //   337: iastore
    //   338: aload_0
    //   339: getfield e : [I
    //   342: iload #4
    //   344: iload #6
    //   346: iastore
    //   347: aload_0
    //   348: aload_0
    //   349: getfield d : I
    //   352: ineg
    //   353: putfield d : I
    //   356: iload #4
    //   358: aload_0
    //   359: getfield b : I
    //   362: if_icmpge -> 369
    //   365: iconst_1
    //   366: goto -> 370
    //   369: iconst_0
    //   370: aload_0
    //   371: getfield a : [[D
    //   374: iload #4
    //   376: aaload
    //   377: iload #4
    //   379: daload
    //   380: dconst_0
    //   381: dcmpl
    //   382: ifeq -> 389
    //   385: iconst_1
    //   386: goto -> 390
    //   389: iconst_0
    //   390: iand
    //   391: ifeq -> 438
    //   394: iload #4
    //   396: iconst_1
    //   397: iadd
    //   398: istore #6
    //   400: iload #6
    //   402: aload_0
    //   403: getfield b : I
    //   406: if_icmpge -> 438
    //   409: aload_0
    //   410: getfield a : [[D
    //   413: iload #6
    //   415: aaload
    //   416: iload #4
    //   418: dup2
    //   419: daload
    //   420: aload_0
    //   421: getfield a : [[D
    //   424: iload #4
    //   426: aaload
    //   427: iload #4
    //   429: daload
    //   430: ddiv
    //   431: dastore
    //   432: iinc #6, 1
    //   435: goto -> 400
    //   438: iinc #4, 1
    //   441: goto -> 76
    //   444: return
  }

  public boolean a() {
    for (byte b = 0; b < this.c; b++) {
      if (this.a[b][b] == 0.0D) return false;
    }
    return true;
  }

  public Matrix a(Matrix paramb) {
    if (paramb.d() != this.b)
      throw new IllegalArgumentException("Matrix row dimensions must agree.");
    if (!a()) throw new RuntimeException("Matrix is singular.");
    int i = paramb.e();
    Matrix b1 = paramb.a(this.e, 0, i - 1);
    double[][] arrayOfDouble = b1.b();
    int j;
    for (j = 0; j < this.c; j++) {
      for (int k = j + 1; k < this.c; k++) {
        for (byte b2 = 0; b2 < i; b2++)
          arrayOfDouble[k][b2] = arrayOfDouble[k][b2] - arrayOfDouble[j][b2] * this.a[k][j];
      }
    }
    for (j = this.c - 1; j >= 0; j--) {
      byte b2;
      for (b2 = 0; b2 < i; b2++) arrayOfDouble[j][b2] = arrayOfDouble[j][b2] / this.a[j][j];
      for (b2 = 0; b2 < j; b2++) {
        for (byte b3 = 0; b3 < i; b3++)
          arrayOfDouble[b2][b3] = arrayOfDouble[b2][b3] - arrayOfDouble[j][b3] * this.a[b2][j];
      }
    }
    return b1;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/a/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
