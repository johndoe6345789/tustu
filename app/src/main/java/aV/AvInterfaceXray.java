package aV;

import A.AInterfaceRomeo;
import G.ManagerUsingArrayList;
import I.IInterfaceHotel;
import aK.Writer;
import aK.AkInterfaceDelta;
import aK.AkInterfaceGolf;
import AInterfaceRomeo.Writer;

public class AvInterfaceXray {
  public static String Writer = "GPS";
  
  private static x b = null;
  
  private Writer c = null;
  
  private AkInterfaceDelta AkInterfaceDelta = null;
  
  private boolean e = false;
  
  public static x Writer() {
    if (b == null)
      b = new x(); 
    return b;
  }
  
  public Writer b() {
    if (this.c == null)
      this.c = Writer.b(); 
    return this.c;
  }
  
  public boolean c() {
    return Writer.Writer().c(Writer.aY, false);
  }
  
  public void Writer(boolean paramBoolean) {
    Writer.Writer().b(Writer.aY, Boolean.toString(paramBoolean));
  }
  
  public void AkInterfaceDelta() {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual b : ()LaK/Writer;
    //   4: astore_1
    //   5: aload_1
    //   6: invokevirtual AkInterfaceGolf : ()Z
    //   9: ifeq -> 16
    //   12: aload_1
    //   13: invokevirtual f : ()V
    //   16: invokestatic c : ()LaV/f;
    //   19: invokevirtual Writer : ()Ljava/util/List;
    //   22: astore_2
    //   23: aload_0
    //   24: getstatic aV/x.Writer : Ljava/lang/String;
    //   27: invokevirtual Writer : (Ljava/lang/String;)Ljava/lang/String;
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
    //   70: invokevirtual Writer : ()Ljava/lang/String;
    //   73: aload_3
    //   74: invokevirtual equals : (Ljava/lang/Object;)Z
    //   77: ifeq -> 137
    //   80: aload #6
    //   82: getstatic aV/x.Writer : Ljava/lang/String;
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
    //   176: checkcast A/AInterfaceRomeo
    //   179: astore #6
    //   181: aload #6
    //   183: invokeinterface Writer : ()I
    //   188: iconst_5
    //   189: if_icmpeq -> 277
    //   192: aload_0
    //   193: getstatic aV/x.Writer : Ljava/lang/String;
    //   196: aload #6
    //   198: invokevirtual Writer : (Ljava/lang/String;LA/AInterfaceRomeo;)Ljava/lang/Object;
    //   201: astore #7
    //   203: aload #7
    //   205: ifnull -> 249
    //   208: aload #4
    //   210: aload #6
    //   212: invokeinterface c : ()Ljava/lang/String;
    //   217: aload #7
    //   219: invokeinterface Writer : (Ljava/lang/String;Ljava/lang/Object;)V
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
    //   294: invokeinterface IInterfaceHotel : ()Ljava/lang/String;
    //   299: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   302: invokevirtual toString : ()Ljava/lang/String;
    //   305: invokestatic AkInterfaceDelta : (Ljava/lang/String;)V
    //   308: aload_1
    //   309: aload #4
    //   311: invokevirtual Writer : (LA/f;)V
    //   314: invokestatic Writer : ()LI/c;
    //   317: iconst_1
    //   318: invokevirtual Writer : (Z)V
    //   321: invokestatic Writer : ()LI/AkInterfaceDelta;
    //   324: invokevirtual AkInterfaceDelta : ()V
    //   327: aload_1
    //   328: aload_0
    //   329: invokevirtual AkInterfaceGolf : ()LaK/AkInterfaceDelta;
    //   332: invokevirtual Writer : (LaK/AkInterfaceGolf;)V
    //   335: aload_0
    //   336: invokespecial i : ()V
    //   339: aload_1
    //   340: invokevirtual AkInterfaceDelta : ()V
    //   343: aload_0
    //   344: iconst_1
    //   345: putfield e : Z
    //   348: goto -> 356
    //   351: ldc 'GPS not initialized, missing critical configuration parameters.'
    //   353: invokestatic AkInterfaceDelta : (Ljava/lang/String;)V
    //   356: return
    // Exception table:
    //   from	to	target	type
    //   80	90	93	java/lang/InstantiationException
    //   80	90	115	java/lang/IllegalAccessException
    //   208	224	227	A/s
  }
  
  public void e() {
    Writer a1 = b();
    if (a1 != null && this.e) {
      a1.f();
      a1.b((AkInterfaceGolf)AkInterfaceGolf());
      if (a1.Writer() != null)
        try {
          a1.Writer().AkInterfaceGolf();
        } catch (Exception exception) {} 
      this.e = false;
    } 
  }
  
  private void i() {
    ManagerUsingArrayList.Writer().Writer(IInterfaceHotel.c, new y(this));
    ManagerUsingArrayList.Writer().Writer(IInterfaceHotel.Writer, new z(this));
    ManagerUsingArrayList.Writer().Writer(IInterfaceHotel.b, new A(this));
  }
  
  private String b(String paramString, AInterfaceRomeo paramr) {
    return paramString + "_" + paramr.c();
  }
  
  public void Writer(String paramString1, String paramString2) {
    String str = paramString1 + "_ControllerInterface";
    Writer.Writer().b(str, paramString2);
  }
  
  public String Writer(String paramString) {
    String str = paramString + "_ControllerInterface";
    return Writer.Writer().c(str, null);
  }
  
  public void Writer(String paramString, AInterfaceRomeo paramr, Object paramObject) {
    String str = b(paramString, paramr);
    Writer.Writer().b(str, paramObject.toString());
  }
  
  public Object Writer(String paramString, AInterfaceRomeo paramr) {
    if (paramr.Writer() == 2 || paramr.Writer() == 3) {
      String str1 = b(paramString, paramr);
      int i = Writer.Writer().c(str1, -2147483648);
      return (i == Integer.MIN_VALUE) ? null : Integer.valueOf(i);
    } 
    String str = b(paramString, paramr);
    return Writer.Writer().c(str, null);
  }
  
  public void f() {
    e();
  }
  
  public AkInterfaceDelta AkInterfaceGolf() {
    if (this.AkInterfaceDelta == null)
      this.AkInterfaceDelta = new AkInterfaceDelta(); 
    return this.AkInterfaceDelta;
  }
  
  public boolean IInterfaceHotel() {
    return this.e;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aV/x.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */