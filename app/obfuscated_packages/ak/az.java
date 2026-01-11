package ak;

import V.ExceptionInVPackage;
import V.VInterfaceFoxtrot;
import W.T;
import bH.D;
import bH.X;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class az extends S {
  float[] ExceptionInVPackage = null;
  
  float b = 0.0F;
  
  public az() {
    super(",", false);
  }
  
  public Iterator b() {
    try {
      String str = h();
      d d = null;
      List list = m(str);
      for (aA aA : list) {
        String str1 = aA.ExceptionInVPackage();
        d = new d();
        if (str1.equals("Interval")) {
          str1 = "Time";
          d.ExceptionInVPackage(0.001F);
          d.ExceptionInVPackage(3);
        } 
        d.ExceptionInVPackage(str1);
        d.b(aA.b());
        d.c(aA.c());
        d.d(aA.d());
        this.g.add(d);
      } 
    } catch (VInterfaceFoxtrot VInterfaceFoxtrot) {
      Logger.getLogger(g.class.getName()).log(Level.SEVERE, (String)null, (Throwable)VInterfaceFoxtrot);
    } catch (Exception exception) {
      D.ExceptionInVPackage("Failed to get units from this row:\n");
      Logger.getLogger(g.class.getName()).log(Level.SEVERE, (String)null, exception);
    } 
    this.ExceptionInVPackage = new float[this.g.size()];
    for (byte b = 0; b < this.ExceptionInVPackage.length; b++)
      this.ExceptionInVPackage[b] = Float.NaN; 
    ArrayList<T> arrayList = new ArrayList();
    Iterator<T> iterator = this.g.iterator();
    while (iterator.hasNext())
      arrayList.add(iterator.next()); 
    return arrayList.iterator();
  }
  
  public float[] c() {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual l : ()Ljava/lang/String;
    //   4: astore_1
    //   5: goto -> 86
    //   8: astore_2
    //   9: ldc ak/az
    //   11: invokevirtual getName : ()Ljava/lang/String;
    //   14: invokestatic getLogger : (Ljava/lang/String;)Ljava/util/logging/Logger;
    //   17: getstatic java/util/logging/Level.WARNING : Ljava/util/logging/Level;
    //   20: new java/lang/StringBuilder
    //   23: dup
    //   24: invokespecial <init> : ()V
    //   27: ldc 'IO Error reading row from file on row '
    //   29: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   32: aload_0
    //   33: getfield p : I
    //   36: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   39: ldc '.'
    //   41: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   44: invokevirtual toString : ()Ljava/lang/String;
    //   47: aload_2
    //   48: invokevirtual log : (Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   51: new V/ExceptionInVPackage
    //   54: dup
    //   55: new java/lang/StringBuilder
    //   58: dup
    //   59: invokespecial <init> : ()V
    //   62: ldc 'IO Error reading row from file on row '
    //   64: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   67: aload_0
    //   68: getfield p : I
    //   71: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   74: ldc '.'
    //   76: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   79: invokevirtual toString : ()Ljava/lang/String;
    //   82: invokespecial <init> : (Ljava/lang/String;)V
    //   85: athrow
    //   86: aload_1
    //   87: invokevirtual isEmpty : ()Z
    //   90: ifne -> 0
    //   93: aload_1
    //   94: aload_0
    //   95: invokevirtual r : ()Ljava/lang/String;
    //   98: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   101: ifne -> 0
    //   104: iconst_0
    //   105: istore #4
    //   107: iload #4
    //   109: ifeq -> 200
    //   112: aload_0
    //   113: invokevirtual l : ()Ljava/lang/String;
    //   116: astore_1
    //   117: goto -> 200
    //   120: astore #5
    //   122: ldc ak/az
    //   124: invokevirtual getName : ()Ljava/lang/String;
    //   127: invokestatic getLogger : (Ljava/lang/String;)Ljava/util/logging/Logger;
    //   130: getstatic java/util/logging/Level.WARNING : Ljava/util/logging/Level;
    //   133: new java/lang/StringBuilder
    //   136: dup
    //   137: invokespecial <init> : ()V
    //   140: ldc 'IO Error reading row from file on row '
    //   142: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   145: aload_0
    //   146: getfield p : I
    //   149: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   152: ldc '.'
    //   154: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   157: invokevirtual toString : ()Ljava/lang/String;
    //   160: aload #5
    //   162: invokevirtual log : (Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   165: new V/ExceptionInVPackage
    //   168: dup
    //   169: new java/lang/StringBuilder
    //   172: dup
    //   173: invokespecial <init> : ()V
    //   176: ldc 'IO Error reading row from file on row '
    //   178: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   181: aload_0
    //   182: getfield p : I
    //   185: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   188: ldc '.'
    //   190: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   193: invokevirtual toString : ()Ljava/lang/String;
    //   196: invokespecial <init> : (Ljava/lang/String;)V
    //   199: athrow
    //   200: new ak/aE
    //   203: dup
    //   204: aload_1
    //   205: aload_0
    //   206: invokevirtual r : ()Ljava/lang/String;
    //   209: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;)V
    //   212: astore_2
    //   213: aload_2
    //   214: iconst_0
    //   215: invokevirtual ExceptionInVPackage : (I)Ljava/lang/String;
    //   218: invokestatic parseFloat : (Ljava/lang/String;)F
    //   221: fstore_3
    //   222: iconst_1
    //   223: istore #4
    //   225: fload_3
    //   226: aload_0
    //   227: getfield b : F
    //   230: fcmpg
    //   231: ifle -> 107
    //   234: aload_0
    //   235: fload_3
    //   236: putfield b : F
    //   239: iconst_0
    //   240: istore #5
    //   242: iload #5
    //   244: aload_2
    //   245: invokevirtual c : ()I
    //   248: if_icmpge -> 301
    //   251: aload_2
    //   252: iload #5
    //   254: invokevirtual ExceptionInVPackage : (I)Ljava/lang/String;
    //   257: astore #6
    //   259: aload #6
    //   261: invokevirtual isEmpty : ()Z
    //   264: ifne -> 295
    //   267: fconst_0
    //   268: fstore #7
    //   270: aload #6
    //   272: invokestatic parseFloat : (Ljava/lang/String;)F
    //   275: fstore #7
    //   277: goto -> 286
    //   280: astore #8
    //   282: ldc NaN
    //   284: fstore #7
    //   286: aload_0
    //   287: getfield ExceptionInVPackage : [F
    //   290: iload #5
    //   292: fload #7
    //   294: fastore
    //   295: iinc #5, 1
    //   298: goto -> 242
    //   301: aload_0
    //   302: getfield ExceptionInVPackage : [F
    //   305: areturn
    // Exception table:
    //   from	to	target	type
    //   0	5	8	java/io/IOException
    //   112	117	120	java/io/IOException
    //   270	277	280	java/lang/NumberFormatException
  }
  
  protected int b(String paramString) {
    return 1;
  }
  
  private List m(String paramString) {
    ArrayList<aA> arrayList = new ArrayList();
    aE aE = new aE(paramString, ",");
    while (aE.ExceptionInVPackage()) {
      String str = aE.b();
      aA aA = n(str);
      arrayList.add(aA);
    } 
    return arrayList;
  }
  
  private aA n(String paramString) {
    aE aE = new aE(paramString, "|");
    aA aA = null;
    try {
      String str = X.i(aE.b());
      aA = new aA(this, str);
    } catch (Exception exception) {
      throw new ExceptionInVPackage("Invalid Header data for Race Capture log: " + paramString);
    } 
    try {
      String str = X.i(aE.b());
      aA.ExceptionInVPackage(str);
    } catch (Exception exception) {}
    try {
      float VInterfaceFoxtrot = Float.parseFloat(aE.b());
      aA.ExceptionInVPackage(VInterfaceFoxtrot);
    } catch (Exception exception) {}
    try {
      float VInterfaceFoxtrot = Float.parseFloat(aE.b());
      if (VInterfaceFoxtrot > aA.c())
        aA.b(VInterfaceFoxtrot); 
    } catch (Exception exception) {}
    return aA;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ak/az.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */