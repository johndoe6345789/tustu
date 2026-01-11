package aV;

import A.r;
import G.cu;
import I.h;
import aK.a;
import aK.d;
import aK.g;
import r.a;

public class x {
  public static String a = "GPS";
  
  private static x b = null;
  
  private a c = null;
  
  private d d = null;
  
  private boolean e = false;
  
  public static x a() {
    if (b == null)
      b = new x(); 
    return b;
  }
  
  public a b() {
    if (this.c == null)
      this.c = a.b(); 
    return this.c;
  }
  
  public boolean c() {
    return a.a().c(a.aY, false);
  }
  
  public void a(boolean paramBoolean) {
    a.a().b(a.aY, Boolean.toString(paramBoolean));
  }
  
  public void d() {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual b : ()LaK/a;
    //   4: astore_1
    //   5: aload_1
    //   6: invokevirtual g : ()Z
    //   9: ifeq -> 16
    //   12: aload_1
    //   13: invokevirtual f : ()V
    //   16: invokestatic c : ()LaV/f;
    //   19: invokevirtual a : ()Ljava/util/List;
    //   22: astore_2
    //   23: aload_0
    //   24: getstatic aV/x.a : Ljava/lang/String;
    //   27: invokevirtual a : (Ljava/lang/String;)Ljava/lang/String;
    //   30: astore_3
    //   31: aconst_null
    //   32: astore #4
    //   34: aload_2
    //   35: invokeinterface iterator : ()Ljava/util/Iterator;
    //   40: astore #5
    //   42: aload #5
    //   44: invokeinterface hasNext : ()Z
    //   49: ifeq -> 140
    //   52: aload #5
    //   54: invokeinterface next : ()Ljava/lang/Object;
    //   59: checkcast A/q
    //   62: astore #6
    //   64: aload_3
    //   65: ifnull -> 137
    //   68: aload #6
    //   70: invokevirtual a : ()Ljava/lang/String;
    //   73: aload_3
    //   74: invokevirtual equals : (Ljava/lang/Object;)Z
    //   77: ifeq -> 137
    //   80: aload #6
    //   82: getstatic aV/x.a : Ljava/lang/String;
    //   85: invokevirtual c : (Ljava/lang/String;)LA/f;
    //   88: astore #4
    //   90: goto -> 140
    //   93: astore #7
    //   95: ldc aV/x
    //   97: invokevirtual getName : ()Ljava/lang/String;
    //   100: invokestatic getLogger : (Ljava/lang/String;)Ljava/util/logging/Logger;
    //   103: getstatic java/util/logging/Level.SEVERE : Ljava/util/logging/Level;
    //   106: aconst_null
    //   107: aload #7
    //   109: invokevirtual log : (Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   112: goto -> 140
    //   115: astore #7
    //   117: ldc aV/x
    //   119: invokevirtual getName : ()Ljava/lang/String;
    //   122: invokestatic getLogger : (Ljava/lang/String;)Ljava/util/logging/Logger;
    //   125: getstatic java/util/logging/Level.SEVERE : Ljava/util/logging/Level;
    //   128: aconst_null
    //   129: aload #7
    //   131: invokevirtual log : (Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   134: goto -> 140
    //   137: goto -> 42
    //   140: aload #4
    //   142: ifnull -> 351
    //   145: aload #4
    //   147: invokeinterface l : ()Ljava/util/List;
    //   152: invokeinterface iterator : ()Ljava/util/Iterator;
    //   157: astore #5
    //   159: aload #5
    //   161: invokeinterface hasNext : ()Z
    //   166: ifeq -> 280
    //   169: aload #5
    //   171: invokeinterface next : ()Ljava/lang/Object;
    //   176: checkcast A/r
    //   179: astore #6
    //   181: aload #6
    //   183: invokeinterface a : ()I
    //   188: iconst_5
    //   189: if_icmpeq -> 277
    //   192: aload_0
    //   193: getstatic aV/x.a : Ljava/lang/String;
    //   196: aload #6
    //   198: invokevirtual a : (Ljava/lang/String;LA/r;)Ljava/lang/Object;
    //   201: astore #7
    //   203: aload #7
    //   205: ifnull -> 249
    //   208: aload #4
    //   210: aload #6
    //   212: invokeinterface c : ()Ljava/lang/String;
    //   217: aload #7
    //   219: invokeinterface a : (Ljava/lang/String;Ljava/lang/Object;)V
    //   224: goto -> 277
    //   227: astore #8
    //   229: ldc aV/x
    //   231: invokevirtual getName : ()Ljava/lang/String;
    //   234: invokestatic getLogger : (Ljava/lang/String;)Ljava/util/logging/Logger;
    //   237: getstatic java/util/logging/Level.SEVERE : Ljava/util/logging/Level;
    //   240: aconst_null
    //   241: aload #8
    //   243: invokevirtual log : (Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   246: goto -> 277
    //   249: new java/lang/StringBuilder
    //   252: dup
    //   253: invokespecial <init> : ()V
    //   256: ldc 'No values set for GPS setting: '
    //   258: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   261: aload #6
    //   263: invokeinterface c : ()Ljava/lang/String;
    //   268: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   271: invokevirtual toString : ()Ljava/lang/String;
    //   274: invokestatic b : (Ljava/lang/String;)V
    //   277: goto -> 159
    //   280: new java/lang/StringBuilder
    //   283: dup
    //   284: invokespecial <init> : ()V
    //   287: ldc 'Initializing GPS Interface: '
    //   289: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   292: aload #4
    //   294: invokeinterface h : ()Ljava/lang/String;
    //   299: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   302: invokevirtual toString : ()Ljava/lang/String;
    //   305: invokestatic d : (Ljava/lang/String;)V
    //   308: aload_1
    //   309: aload #4
    //   311: invokevirtual a : (LA/f;)V
    //   314: invokestatic a : ()LI/c;
    //   317: iconst_1
    //   318: invokevirtual a : (Z)V
    //   321: invokestatic a : ()LI/d;
    //   324: invokevirtual d : ()V
    //   327: aload_1
    //   328: aload_0
    //   329: invokevirtual g : ()LaK/d;
    //   332: invokevirtual a : (LaK/g;)V
    //   335: aload_0
    //   336: invokespecial i : ()V
    //   339: aload_1
    //   340: invokevirtual d : ()V
    //   343: aload_0
    //   344: iconst_1
    //   345: putfield e : Z
    //   348: goto -> 356
    //   351: ldc 'GPS not initialized, missing critical configuration parameters.'
    //   353: invokestatic d : (Ljava/lang/String;)V
    //   356: return
    // Exception table:
    //   from	to	target	type
    //   80	90	93	java/lang/InstantiationException
    //   80	90	115	java/lang/IllegalAccessException
    //   208	224	227	A/s
  }
  
  public void e() {
    a a1 = b();
    if (a1 != null && this.e) {
      a1.f();
      a1.b((g)g());
      if (a1.a() != null)
        try {
          a1.a().g();
        } catch (Exception exception) {} 
      this.e = false;
    } 
  }
  
  private void i() {
    cu.a().a(h.c, new y(this));
    cu.a().a(h.a, new z(this));
    cu.a().a(h.b, new A(this));
  }
  
  private String b(String paramString, r paramr) {
    return paramString + "_" + paramr.c();
  }
  
  public void a(String paramString1, String paramString2) {
    String str = paramString1 + "_ControllerInterface";
    a.a().b(str, paramString2);
  }
  
  public String a(String paramString) {
    String str = paramString + "_ControllerInterface";
    return a.a().c(str, null);
  }
  
  public void a(String paramString, r paramr, Object paramObject) {
    String str = b(paramString, paramr);
    a.a().b(str, paramObject.toString());
  }
  
  public Object a(String paramString, r paramr) {
    if (paramr.a() == 2 || paramr.a() == 3) {
      String str1 = b(paramString, paramr);
      int i = a.a().c(str1, -2147483648);
      return (i == Integer.MIN_VALUE) ? null : Integer.valueOf(i);
    } 
    String str = b(paramString, paramr);
    return a.a().c(str, null);
  }
  
  public void f() {
    e();
  }
  
  public d g() {
    if (this.d == null)
      this.d = new d(); 
    return this.d;
  }
  
  public boolean h() {
    return this.e;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aV/x.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */