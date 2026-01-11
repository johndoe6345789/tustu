package bQ;

import A.AInterfaceEcho;
import G.F;
import G.aV;
import G.n;
import J.JInterfaceJuliet;
import V.VInterfaceBravo;
import bH.D;
import bH.c;
import bN.BnInterfaceKilo;
import bN.IOInBnPackage;
import bN.BnInterfaceRomeo;
import bN.BnInterfaceTango;
import com.efiAnalytics.xcp.master.responseProcessors.VInterfaceBravo;
import com.efiAnalytics.xcp.master.responseProcessors.c;
import com.efiAnalytics.xcp.master.responseProcessors.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BqInterfaceFoxtrot implements AInterfaceEcho {
  BnInterfaceRomeo a = null;
  
  IOInBnPackage VInterfaceBravo = null;
  
  BnInterfaceKilo c;
  
  private F BnInterfaceKilo = null;
  
  h d = new h(this);
  
  g AInterfaceEcho = new g(this);
  
  ArrayList f = new ArrayList();
  
  A.f g = null;
  
  private final List l = new CopyOnWriteArrayList();
  
  List h = new ArrayList();
  
  final Object i = new Object();
  
  Map JInterfaceJuliet = new HashMap<>();
  
  private int m = 0;
  
  private VInterfaceBravo n = null;
  
  private final c o = new c();
  
  private JInterfaceJuliet IOInBnPackage = null;
  
  protected BqInterfaceFoxtrot(BnInterfaceKilo paramk) {
    this.c = paramk;
    this.JInterfaceJuliet.put(Integer.valueOf(252), new m());
    this.JInterfaceJuliet.put(Integer.valueOf(253), this.o);
  }
  
  public void f() {
    a((this.BnInterfaceKilo != null) ? this.BnInterfaceKilo.u() : null);
  }
  
  public void g() {
    VInterfaceBravo((this.BnInterfaceKilo != null) ? this.BnInterfaceKilo.u() : null);
  }
  
  public void a(aV paramaV) {
    this.f.add(paramaV);
  }
  
  private void a(String paramString) {
    for (aV aV : this.f)
      aV.VInterfaceBravo(paramString); 
  }
  
  private void VInterfaceBravo(String paramString) {
    for (aV aV : this.f)
      aV.c(paramString); 
  }
  
  private void c(String paramString) {
    for (aV aV : this.f)
      aV.d(paramString); 
  }
  
  private void d(String paramString) {
    for (aV aV : this.f)
      aV.AInterfaceEcho(paramString); 
  }
  
  public void a(BnInterfaceKilo paramk) {
    f();
    this.a.a(paramk.a());
    g();
  }
  
  public y VInterfaceBravo(BnInterfaceKilo paramk) {
    f();
    y y = new y();
    BnInterfaceTango BnInterfaceTango = paramk.a();
    y.a(paramk);
    if (paramk.VInterfaceBravo() == 0) {
      c(BnInterfaceTango, 0);
      y.a(1);
    } else {
      List list = c(BnInterfaceTango, paramk.VInterfaceBravo());
      if (list != null) {
        y.a(list);
        if (!VInterfaceBravo(list) && list.size() == paramk.VInterfaceBravo()) {
          y.a(1);
        } else {
          y.a(3);
        } 
        y.a(list);
      } else {
        y.a("No Response within the timeout period");
        y.a(3);
      } 
    } 
    g();
    return y;
  }
  
  public BnInterfaceTango a(BnInterfaceTango paramt) {
    return a(paramt, this.c.q());
  }
  
  public BnInterfaceTango a(BnInterfaceTango paramt, int paramInt) {
    this.h.clear();
    a(paramt, this.h, 1, null, paramInt);
    return this.h.isEmpty() ? null : this.h.get(0);
  }
  
  public BnInterfaceTango VInterfaceBravo(BnInterfaceTango paramt, int paramInt) {
    BnInterfaceTango t1 = null;
    byte b1 = 0;
    do {
      if (b1)
        if (t1 != null) {
          D.c("Packet failed! " + b1 + " of " + paramInt + ", response: " + c.d(t1.d()));
        } else {
          D.c("Packet failed! " + b1 + " of " + paramInt + ", response: " + null);
        }  
      b1++;
      try {
        this.h.clear();
        a(paramt, this.h, 1, null, this.c.q());
      } catch (VInterfaceBravo b2) {
        if (b1 >= paramInt)
          throw b2; 
        try {
          D.c("Waiting for retry: " + this.c.q());
          Thread.sleep(this.c.q());
        } catch (InterruptedException interruptedException) {
          Logger.getLogger(f.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
        } 
      } 
      if (this.h.isEmpty()) {
        t1 = null;
      } else {
        t1 = this.h.get(0);
      } 
    } while ((t1 == null || t1.a() != 255) && b1 < paramInt);
    return t1;
  }
  
  public List c(BnInterfaceTango paramt, int paramInt) {
    ArrayList arrayList = new ArrayList();
    return a(paramt, arrayList, paramInt, null, this.c.q());
  }
  
  public List a(BnInterfaceTango paramt, List paramList, int paramInt1, n paramn, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual f : ()V
    //   4: aload_0
    //   5: getfield a : LbN/BnInterfaceRomeo;
    //   8: aload_1
    //   9: invokevirtual a : (LbN/BnInterfaceTango;)I
    //   12: pop
    //   13: iload_3
    //   14: ifne -> 23
    //   17: aload_0
    //   18: invokevirtual g : ()V
    //   21: aload_2
    //   22: areturn
    //   23: aload #4
    //   25: ifnull -> 35
    //   28: aload #4
    //   30: invokeinterface AInterfaceEcho : ()V
    //   35: iconst_0
    //   36: istore #6
    //   38: invokestatic currentTimeMillis : ()J
    //   41: iload #5
    //   43: i2l
    //   44: ladd
    //   45: lstore #7
    //   47: aload_0
    //   48: getfield i : Ljava/lang/Object;
    //   51: dup
    //   52: astore #9
    //   54: monitorenter
    //   55: aload_0
    //   56: getfield i : Ljava/lang/Object;
    //   59: iload #5
    //   61: i2l
    //   62: invokevirtual wait : (J)V
    //   65: aload #9
    //   67: monitorexit
    //   68: goto -> 79
    //   71: astore #10
    //   73: aload #9
    //   75: monitorexit
    //   76: aload #10
    //   78: athrow
    //   79: goto -> 101
    //   82: astore #9
    //   84: ldc bQ/f
    //   86: invokevirtual getName : ()Ljava/lang/String;
    //   89: invokestatic getLogger : (Ljava/lang/String;)Ljava/util/logging/Logger;
    //   92: getstatic java/util/logging/Level.SEVERE : Ljava/util/logging/Level;
    //   95: aconst_null
    //   96: aload #9
    //   98: invokevirtual log : (Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   101: iinc #6, 1
    //   104: aload #4
    //   106: ifnull -> 127
    //   109: iload #6
    //   111: i2f
    //   112: iload_3
    //   113: i2f
    //   114: fdiv
    //   115: fstore #9
    //   117: aload #4
    //   119: fload #9
    //   121: f2d
    //   122: invokeinterface a : (D)V
    //   127: invokestatic currentTimeMillis : ()J
    //   130: lload #7
    //   132: lcmp
    //   133: ifge -> 153
    //   136: aload_0
    //   137: getfield l : Ljava/util/List;
    //   140: invokeinterface size : ()I
    //   145: iload_3
    //   146: if_icmplt -> 38
    //   149: iload_3
    //   150: ifle -> 38
    //   153: aload_0
    //   154: aload_0
    //   155: getfield l : Ljava/util/List;
    //   158: invokespecial VInterfaceBravo : (Ljava/util/List;)Z
    //   161: ifne -> 164
    //   164: aload_0
    //   165: getfield l : Ljava/util/List;
    //   168: invokeinterface isEmpty : ()Z
    //   173: ifeq -> 236
    //   176: aload_0
    //   177: dup
    //   178: getfield m : I
    //   181: iconst_1
    //   182: iadd
    //   183: putfield m : I
    //   186: aload_0
    //   187: getfield m : I
    //   190: iconst_3
    //   191: if_icmple -> 194
    //   194: aload_0
    //   195: getfield IOInBnPackage : LJ/JInterfaceJuliet;
    //   198: ifnull -> 208
    //   201: aload_0
    //   202: getfield IOInBnPackage : LJ/JInterfaceJuliet;
    //   205: invokevirtual g : ()V
    //   208: new V/VInterfaceBravo
    //   211: dup
    //   212: new java/lang/StringBuilder
    //   215: dup
    //   216: invokespecial <init> : ()V
    //   219: ldc 'Timeout on non-interleaved message response. Timeout set to: '
    //   221: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   224: iload #5
    //   226: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   229: invokevirtual toString : ()Ljava/lang/String;
    //   232: invokespecial <init> : (Ljava/lang/String;)V
    //   235: athrow
    //   236: aload_0
    //   237: iconst_0
    //   238: putfield m : I
    //   241: aload_0
    //   242: getfield l : Ljava/util/List;
    //   245: invokeinterface size : ()I
    //   250: iload_3
    //   251: if_icmpne -> 277
    //   254: aload_2
    //   255: aload_0
    //   256: getfield l : Ljava/util/List;
    //   259: invokeinterface addAll : (Ljava/util/Collection;)Z
    //   264: pop
    //   265: aload_0
    //   266: getfield l : Ljava/util/List;
    //   269: invokeinterface clear : ()V
    //   274: goto -> 473
    //   277: aload_0
    //   278: getfield l : Ljava/util/List;
    //   281: invokeinterface size : ()I
    //   286: iload_3
    //   287: if_icmpge -> 325
    //   290: aload_0
    //   291: getfield IOInBnPackage : LJ/JInterfaceJuliet;
    //   294: invokevirtual g : ()V
    //   297: new V/VInterfaceBravo
    //   300: dup
    //   301: new java/lang/StringBuilder
    //   304: dup
    //   305: invokespecial <init> : ()V
    //   308: ldc 'Did not receive all response packets within timeout. Timeout set to: '
    //   310: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   313: iload #5
    //   315: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   318: invokevirtual toString : ()Ljava/lang/String;
    //   321: invokespecial <init> : (Ljava/lang/String;)V
    //   324: athrow
    //   325: iconst_0
    //   326: istore #9
    //   328: iload #9
    //   330: iload_3
    //   331: if_icmpge -> 360
    //   334: aload_2
    //   335: aload_0
    //   336: getfield l : Ljava/util/List;
    //   339: iconst_0
    //   340: invokeinterface remove : (I)Ljava/lang/Object;
    //   345: checkcast bN/BnInterfaceTango
    //   348: invokeinterface add : (Ljava/lang/Object;)Z
    //   353: pop
    //   354: iinc #9, 1
    //   357: goto -> 328
    //   360: ldc 'Extra packet(s) Received!'
    //   362: astore #9
    //   364: aload_0
    //   365: getfield l : Ljava/util/List;
    //   368: dup
    //   369: astore #10
    //   371: monitorenter
    //   372: aload_0
    //   373: getfield l : Ljava/util/List;
    //   376: invokeinterface iterator : ()Ljava/util/Iterator;
    //   381: astore #11
    //   383: aload #11
    //   385: invokeinterface hasNext : ()Z
    //   390: ifeq -> 445
    //   393: aload #11
    //   395: invokeinterface next : ()Ljava/lang/Object;
    //   400: checkcast bN/BnInterfaceTango
    //   403: astore #12
    //   405: new java/lang/StringBuilder
    //   408: dup
    //   409: invokespecial <init> : ()V
    //   412: aload #9
    //   414: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   417: ldc '\\nMSG:\\n'
    //   419: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   422: aload #12
    //   424: invokeinterface d : ()[B
    //   429: bipush #16
    //   431: invokestatic a : ([BI)Ljava/lang/String;
    //   434: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   437: invokevirtual toString : ()Ljava/lang/String;
    //   440: astore #9
    //   442: goto -> 383
    //   445: aload #9
    //   447: invokestatic VInterfaceBravo : (Ljava/lang/String;)V
    //   450: aload_0
    //   451: getfield l : Ljava/util/List;
    //   454: invokeinterface clear : ()V
    //   459: aload #10
    //   461: monitorexit
    //   462: goto -> 473
    //   465: astore #13
    //   467: aload #10
    //   469: monitorexit
    //   470: aload #13
    //   472: athrow
    //   473: aload #4
    //   475: ifnull -> 486
    //   478: aload #4
    //   480: dconst_1
    //   481: invokeinterface a : (D)V
    //   486: aload_0
    //   487: invokevirtual g : ()V
    //   490: aload_2
    //   491: areturn
    // Exception table:
    //   from	to	target	type
    //   47	79	82	java/lang/InterruptedException
    //   55	68	71	finally
    //   71	76	71	finally
    //   372	462	465	finally
    //   465	470	465	finally
  }
  
  private boolean VInterfaceBravo(List paramList) {
    synchronized (paramList) {
      for (BnInterfaceTango BnInterfaceTango : paramList) {
        if (BnInterfaceTango.a() == 254)
          return true; 
      } 
    } 
    return false;
  }
  
  public BnInterfaceTango a(List<BnInterfaceTango> paramList) {
    f();
    int i = -1;
    for (byte b1 = 0; b1 < paramList.size(); b1++) {
      BnInterfaceTango t1 = paramList.get(b1);
      if (b1 > 0 && this.c.BnInterfaceKilo() > 0) {
        int m = this.c.BnInterfaceKilo() * 100000;
        try {
          Thread.sleep((m / 1000000), m % 1000000);
        } catch (Exception exception) {
          Logger.getLogger(f.class.getName()).log(Level.SEVERE, "MIN_ST Failed.", exception);
        } 
      } 
      i = this.a.a(t1);
    } 
    Object object = l();
    synchronized (object) {
      try {
        object.wait(this.c.q());
      } catch (InterruptedException interruptedException) {
        Logger.getLogger(f.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
      } 
    } 
    if (this.l.isEmpty()) {
      this.m++;
      if (this.m > 2)
        this.g.g(); 
      g();
      this.IOInBnPackage.g();
      throw new VInterfaceBravo("Timeout on non-interleaved message response. Timeout set to: " + this.c.q());
    } 
    this.m = 0;
    BnInterfaceTango BnInterfaceTango = this.l.remove(0);
    if (!this.l.isEmpty()) {
      String str = "Extra packets Received!";
      for (BnInterfaceTango t1 : this.l)
        str = str + "\nMSG:\n" + c.a(t1.d(), 16); 
      D.VInterfaceBravo(str);
      this.l.clear();
    } 
    g();
    return BnInterfaceTango;
  }
  
  private Object l() {
    return this.i;
  }
  
  protected void a(A.f paramf) {
    this.g = paramf;
  }
  
  protected void h() {
    if (this.VInterfaceBravo != null) {
      this.VInterfaceBravo.VInterfaceBravo(this.AInterfaceEcho);
      this.VInterfaceBravo.c();
    } 
    if (this.a != null)
      this.a.c(); 
    this.a = null;
    this.VInterfaceBravo = null;
  }
  
  public void a() {
    g();
    h();
  }
  
  public void VInterfaceBravo() {}
  
  public void c() {
    try {
      AInterfaceEcho();
      this.VInterfaceBravo = new IOInBnPackage(this.g.i(), this.c);
      this.VInterfaceBravo.a(IOInBnPackage.i);
      this.VInterfaceBravo.a(this.AInterfaceEcho);
      this.VInterfaceBravo.a(this.IOInBnPackage);
      this.a = new BnInterfaceRomeo(this.g.JInterfaceJuliet(), this.c);
      this.a.a(true);
      this.a.a(this.IOInBnPackage);
    } catch (Exception exception) {
      D.d("Error getting Streams from connection. Disconnect issued.");
      this.g.g();
    } 
  }
  
  public void d() {}
  
  public void AInterfaceEcho() {
    if (this.VInterfaceBravo != null) {
      this.VInterfaceBravo.VInterfaceBravo(this.AInterfaceEcho);
      this.VInterfaceBravo.c();
    } 
    if (this.a != null)
      this.a.c(); 
  }
  
  public void a(F paramF) {
    this.BnInterfaceKilo = paramF;
  }
  
  public void i() {
    this.VInterfaceBravo.VInterfaceBravo();
  }
  
  public void a(VInterfaceBravo paramb) {
    this.n = paramb;
  }
  
  public c JInterfaceJuliet() {
    return this.o;
  }
  
  public long BnInterfaceKilo() {
    return (this.VInterfaceBravo == null) ? 0L : this.VInterfaceBravo.a();
  }
  
  public void a(JInterfaceJuliet paramj) {
    this.IOInBnPackage = paramj;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bQ/f.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */