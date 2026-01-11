package z;

import G.F;
import G.J;
import G.l;
import G.m;
import G.o;
import V.b;
import bH.D;
import bH.X;
import bH.c;
import gnu.io.CommDriver;
import gnu.io.CommPortIdentifier;
import gnu.io.PortInUseException;
import gnu.io.RXTXCommDriver;
import gnu.io.SerialPort;
import gnu.io.SerialPortEvent;
import gnu.io.SerialPortEventListener;
import gnu.io.UnsupportedCommOperationException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TooManyListenersException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class e extends J implements SerialPortEventListener {
  n a;
  
  SerialPort b;
  
  public static RXTXCommDriver c = new RXTXCommDriver();
  
  static HashMap d = new HashMap<>();
  
  f e;
  
  g f;
  
  private boolean o;
  
  boolean g;
  
  boolean h;
  
  int i;
  
  String j;
  
  long k;
  
  int l;
  
  int m;
  
  boolean n;
  
  public static void a() {
    c.initialize();
  }
  
  public boolean b() {
    return (this.e != null && this.e.a());
  }
  
  public void c() {
    try {
      long l = System.currentTimeMillis();
      D.c("goOffline Starting, Time:" + (System.currentTimeMillis() - l));
      F f1 = e();
      try {
        d(f1);
      } catch (b b) {
        Logger.getLogger(e.class.getName()).log(Level.SEVERE, (String)null, (Throwable)b);
      } 
      D.d("Deactivated Turbo Baud, goOffline");
      if (q()) {
        a(e());
        a(250L);
      } 
      D.c("goOffline about to stopProcessing, Time:" + (System.currentTimeMillis() - l));
      if (this.e != null)
        this.e.b(); 
      f f2 = this.e;
      this.e = null;
      boolean bool = this.F;
      u();
      if (bool) {
        A();
        D.c("goOffline Notified offline, Time:" + (System.currentTimeMillis() - l));
      } 
      h();
      D.c("goOffline closed port, Time:" + (System.currentTimeMillis() - l));
      if (!Thread.currentThread().equals(f2) && (this.f == null || !Thread.currentThread().equals(this.f)))
        for (byte b = 0; f2 != null && f2.isAlive() && b < 100; b++) {
          try {
            Thread.sleep(50L);
          } catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
          } 
        }  
      D.c("goOffline comm thread stopped, Time:" + (System.currentTimeMillis() - l));
      v();
      try {
        j(e().u());
      } catch (Exception exception) {}
    } finally {
      this.F = false;
      Q();
    } 
  }
  
  public void d() {
    if (g() == null || g().length() < 1) {
      D.d("no Comm port set, so not going online.");
      return;
    } 
    if (q())
      return; 
    boolean bool = false;
    if (this.e != null)
      this.e.b(); 
    try {
      a(e().r() + "");
      a(e().u(), e().s());
      D.c("Monitoring " + e().s() + " @ " + e().r() + " baud for controllers.");
    } catch (PortInUseException portInUseException) {
      String str = "Serial Port " + e().s() + " is in use by " + portInUseException.currentOwner + "\n\nWould you like to go offline?";
      throw new l(str);
    } catch (NullPointerException nullPointerException) {
      throw new l("Failed to open current port.");
    } catch (Exception exception) {
      D.c("Error opeing port, ignoring and monitoring anyway.");
      bool = true;
    } 
    this.e = new f(this);
    this.e.start();
    D.c("Started new CommThread for " + e().u());
    if (bool)
      throw new l(e().s() + " is not currently a valid port."); 
    P();
  }
  
  private void P() {
    if (!this.W) {
      if (this.f != null)
        this.f.a(); 
      this.f = new g(this, this);
      this.f.start();
      D.d("Started Comms Watchdog");
    } 
  }
  
  private void Q() {
    if (this.f != null) {
      this.f.a();
      this.f = null;
      D.d("Stopped Comms Watchdog");
    } 
  }
  
  public F e() {
    return this.A.get(0);
  }
  
  public void a(String paramString) {
    this.a.b(paramString);
  }
  
  public String f() {
    return (this.b != null) ? (this.b.getBaudRate() + "") : (e().r() + "");
  }
  
  public String g() {
    return (this.b != null) ? this.b.getName() : e().s();
  }
  
  protected void h() {
    D.c("currentPort == null:" + ((this.b == null) ? 1 : 0));
    if (this.b != null) {
      String str = X.b(this.b.getName(), "//./", "");
      d.remove(str);
      new h(this, this.b);
      this.b = null;
    } 
  }
  
  protected o a(m paramm) {
    o o = new o();
    if (paramm.s() == null || paramm.t() == null) {
      String str = "testPort: uninitialized parameters, port =" + paramm.s() + ", baud=" + paramm.t();
      D.a(str);
      o.a(3);
      o.a(str);
    } else {
      String str = null;
      try {
        str = a(paramm.s(), paramm.t(), e().p().d());
      } catch (l l) {}
      this.g = true;
      try {
        if (str != null && b(str.getBytes())) {
          o.a(1);
          o.a(str);
        } else {
          o.a(3);
          o.a("Device Unavailable");
        } 
      } catch (Exception exception) {
      
      } finally {
        this.g = false;
      } 
    } 
    return o;
  }
  
  protected String a(String paramString1, String paramString2, byte[] paramArrayOfbyte) {
    String str = null;
    long l = System.currentTimeMillis();
    try {
      this.g = true;
      a(200L);
      a(paramString2);
      a("TunerStudiotest", paramString1);
      str = a(paramArrayOfbyte, 400L);
      if (str.length() == 1)
        str = str.getBytes()[0] + ""; 
    } catch (PortInUseException portInUseException) {
      throw new l("Com Port " + paramString1 + ", in use by " + portInUseException.currentOwner);
    } catch (l l1) {
      throw l1;
    } catch (Exception exception) {
      if (this.b != null) {
        D.a("Exception reading port:" + this.b.getName() + ", @" + this.b.getBaudRate() + " Baud. Error Message:\n" + exception.getMessage());
      } else {
        D.d("Port " + paramString1 + " Not found.");
      } 
      return null;
    } finally {
      h();
      a(e().r() + "");
      D.c((System.currentTimeMillis() - l) + "ms. - Reset Port");
      try {
        if (e().u() != null && !e().u().equals("") && e().s() != null && !e().s().equals("")) {
          a(e().u(), e().s());
          D.c((System.currentTimeMillis() - l) + "ms. - ReOpened Port");
        } 
      } catch (l l1) {
        D.c("Could not open port");
      } catch (PortInUseException portInUseException) {
        D.c("Port In Use By:" + portInUseException.currentOwner);
      } 
      this.g = false;
    } 
    return str;
  }
  
  protected String a(byte[] paramArrayOfbyte) {
    return c.d(paramArrayOfbyte);
  }
  
  public void a(boolean paramBoolean) {
    if (this.f == null) {
      if (!I() && !paramBoolean) {
        D.d("Comms Watchdog is inactive, staring.");
        P();
      } 
      return;
    } 
    if (!this.f.b())
      this.Q = System.currentTimeMillis(); 
    if (this.f.b() && paramBoolean)
      D.d("Comms Watchdog is active"); 
    this.f.a(paramBoolean);
  }
  
  protected void a(long paramLong) {
    if (paramLong <= 0L)
      return; 
    try {
      if (this.W)
        D.c("sleep:" + paramLong); 
      Thread.sleep(paramLong);
    } catch (Exception exception) {}
  }
  
  protected synchronized byte[] a(byte[] paramArrayOfbyte, long paramLong1, long paramLong2, int paramInt, m paramm) {
    return super.a(paramArrayOfbyte, paramLong1, paramLong2, paramInt, paramm);
  }
  
  protected byte[] a(byte[] paramArrayOfbyte, long paramLong1, long paramLong2, int paramInt, m paramm, InputStream paramInputStream) {
    // Byte code:
    //   0: invokestatic nanoTime : ()J
    //   3: lstore #9
    //   5: aload_0
    //   6: getfield W : Z
    //   9: ifeq -> 70
    //   12: new java/lang/StringBuilder
    //   15: dup
    //   16: invokespecial <init> : ()V
    //   19: ldc 'read Called: readDelay='
    //   21: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   24: lload_2
    //   25: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   28: ldc ', readTimeout='
    //   30: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   33: lload #4
    //   35: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   38: ldc ', expectedBytes='
    //   40: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   43: iload #6
    //   45: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   48: ldc ', time since last read complete='
    //   50: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   53: invokestatic currentTimeMillis : ()J
    //   56: aload_0
    //   57: getfield k : J
    //   60: lsub
    //   61: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   64: invokevirtual toString : ()Ljava/lang/String;
    //   67: invokestatic c : (Ljava/lang/String;)V
    //   70: aload_1
    //   71: ifnull -> 177
    //   74: aload_0
    //   75: invokevirtual e : ()LG/F;
    //   78: invokevirtual k : ()I
    //   81: istore #11
    //   83: iload #11
    //   85: bipush #6
    //   87: if_icmpge -> 94
    //   90: bipush #6
    //   92: istore #11
    //   94: iconst_2
    //   95: aload_1
    //   96: arraylength
    //   97: iload #11
    //   99: imul
    //   100: imul
    //   101: i2l
    //   102: ldc2_w 2
    //   105: lload #4
    //   107: lconst_0
    //   108: lcmp
    //   109: iflt -> 117
    //   112: lload #4
    //   114: goto -> 120
    //   117: ldc2_w 400
    //   120: lmul
    //   121: ladd
    //   122: lstore #12
    //   124: lload #12
    //   126: ldc2_w 400
    //   129: lcmp
    //   130: ifge -> 138
    //   133: ldc2_w 400
    //   136: lstore #12
    //   138: aload_0
    //   139: invokestatic currentTimeMillis : ()J
    //   142: lload #12
    //   144: ladd
    //   145: putfield R : J
    //   148: invokestatic I : ()Z
    //   151: ifeq -> 177
    //   154: new java/lang/StringBuilder
    //   157: dup
    //   158: invokespecial <init> : ()V
    //   161: ldc 'commThreadExpectedReturnTime set to ms from now: '
    //   163: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   166: lload #12
    //   168: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   171: invokevirtual toString : ()Ljava/lang/String;
    //   174: invokestatic c : (Ljava/lang/String;)V
    //   177: aload_0
    //   178: getfield j : Ljava/lang/String;
    //   181: ifnull -> 200
    //   184: aload_0
    //   185: getfield j : Ljava/lang/String;
    //   188: invokestatic currentThread : ()Ljava/lang/Thread;
    //   191: invokevirtual getName : ()Ljava/lang/String;
    //   194: invokevirtual equals : (Ljava/lang/Object;)Z
    //   197: ifne -> 249
    //   200: new java/lang/StringBuilder
    //   203: dup
    //   204: invokespecial <init> : ()V
    //   207: ldc 'Comm Read Thread Change! Old Thread:'
    //   209: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   212: aload_0
    //   213: getfield j : Ljava/lang/String;
    //   216: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   219: ldc ', new Thread:'
    //   221: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   224: invokestatic currentThread : ()Ljava/lang/Thread;
    //   227: invokevirtual getName : ()Ljava/lang/String;
    //   230: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   233: invokevirtual toString : ()Ljava/lang/String;
    //   236: invokestatic c : (Ljava/lang/String;)V
    //   239: aload_0
    //   240: invokestatic currentThread : ()Ljava/lang/Thread;
    //   243: invokevirtual getName : ()Ljava/lang/String;
    //   246: putfield j : Ljava/lang/String;
    //   249: sipush #512
    //   252: istore #11
    //   254: iload #6
    //   256: ifle -> 278
    //   259: iload #6
    //   261: sipush #2048
    //   264: if_icmple -> 273
    //   267: sipush #2048
    //   270: goto -> 280
    //   273: iload #6
    //   275: goto -> 280
    //   278: iload #11
    //   280: istore #11
    //   282: aload_0
    //   283: invokevirtual j : ()Ljava/io/OutputStream;
    //   286: astore #12
    //   288: aload #8
    //   290: ifnonnull -> 299
    //   293: aload_0
    //   294: invokevirtual i : ()Ljava/io/InputStream;
    //   297: astore #8
    //   299: aconst_null
    //   300: astore #13
    //   302: invokestatic currentTimeMillis : ()J
    //   305: lstore #14
    //   307: aload_1
    //   308: ifnull -> 1137
    //   311: aload #8
    //   313: invokevirtual available : ()I
    //   316: ifle -> 666
    //   319: getstatic java/lang/System.out : Ljava/io/PrintStream;
    //   322: ldc 'Purging orphaned bytes: \\n'
    //   324: invokevirtual print : (Ljava/lang/String;)V
    //   327: aload_0
    //   328: ldc2_w 40
    //   331: invokevirtual a : (J)V
    //   334: new java/util/ArrayList
    //   337: dup
    //   338: invokespecial <init> : ()V
    //   341: astore #16
    //   343: ldc ''
    //   345: astore #17
    //   347: aload #8
    //   349: invokevirtual available : ()I
    //   352: ifle -> 481
    //   355: aload #8
    //   357: invokevirtual read : ()I
    //   360: istore #18
    //   362: getstatic java/lang/System.out : Ljava/io/PrintStream;
    //   365: new java/lang/StringBuilder
    //   368: dup
    //   369: invokespecial <init> : ()V
    //   372: ldc '0x'
    //   374: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   377: iload #18
    //   379: invokestatic toHexString : (I)Ljava/lang/String;
    //   382: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   385: ldc ' '
    //   387: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   390: invokevirtual toString : ()Ljava/lang/String;
    //   393: invokevirtual print : (Ljava/lang/String;)V
    //   396: iload #18
    //   398: invokestatic a : (I)Z
    //   401: ifeq -> 440
    //   404: new java/lang/StringBuilder
    //   407: dup
    //   408: invokespecial <init> : ()V
    //   411: aload #17
    //   413: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   416: ldc '  '
    //   418: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   421: iload #18
    //   423: i2c
    //   424: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   427: ldc '  '
    //   429: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   432: invokevirtual toString : ()Ljava/lang/String;
    //   435: astore #17
    //   437: goto -> 462
    //   440: new java/lang/StringBuilder
    //   443: dup
    //   444: invokespecial <init> : ()V
    //   447: aload #17
    //   449: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   452: ldc '  .  '
    //   454: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   457: invokevirtual toString : ()Ljava/lang/String;
    //   460: astore #17
    //   462: aload #16
    //   464: new java/lang/Byte
    //   467: dup
    //   468: iload #18
    //   470: i2b
    //   471: invokespecial <init> : (B)V
    //   474: invokevirtual add : (Ljava/lang/Object;)Z
    //   477: pop
    //   478: goto -> 347
    //   481: getstatic java/lang/System.out : Ljava/io/PrintStream;
    //   484: aload #17
    //   486: invokevirtual println : (Ljava/lang/String;)V
    //   489: getstatic java/lang/System.out : Ljava/io/PrintStream;
    //   492: ldc '\\n'
    //   494: invokevirtual print : (Ljava/lang/String;)V
    //   497: getstatic java/lang/System.out : Ljava/io/PrintStream;
    //   500: aload #17
    //   502: invokevirtual println : (Ljava/lang/String;)V
    //   505: aload #16
    //   507: invokevirtual size : ()I
    //   510: ifle -> 544
    //   513: new java/lang/StringBuilder
    //   516: dup
    //   517: invokespecial <init> : ()V
    //   520: ldc 'Cleared '
    //   522: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   525: aload #16
    //   527: invokevirtual size : ()I
    //   530: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   533: ldc ' orphans'
    //   535: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   538: invokevirtual toString : ()Ljava/lang/String;
    //   541: invokestatic c : (Ljava/lang/String;)V
    //   544: aload_0
    //   545: aload #16
    //   547: invokevirtual a : (Ljava/util/ArrayList;)Z
    //   550: ifne -> 666
    //   553: iload #6
    //   555: aload_0
    //   556: getfield A : Ljava/util/ArrayList;
    //   559: aload_0
    //   560: getfield A : Ljava/util/ArrayList;
    //   563: invokevirtual size : ()I
    //   566: iconst_1
    //   567: isub
    //   568: invokevirtual get : (I)Ljava/lang/Object;
    //   571: checkcast G/F
    //   574: invokevirtual n : ()I
    //   577: if_icmpne -> 666
    //   580: aload_0
    //   581: invokevirtual e : ()LG/F;
    //   584: aload_0
    //   585: invokevirtual e : ()LG/F;
    //   588: invokevirtual t : ()I
    //   591: iconst_5
    //   592: iadd
    //   593: invokevirtual q : (I)V
    //   596: aload_0
    //   597: invokevirtual l : ()V
    //   600: aload_0
    //   601: getfield l : I
    //   604: aload_0
    //   605: invokevirtual e : ()LG/F;
    //   608: invokevirtual t : ()I
    //   611: if_icmple -> 666
    //   614: aload_0
    //   615: invokevirtual e : ()LG/F;
    //   618: invokevirtual t : ()I
    //   621: bipush #70
    //   623: if_icmpge -> 666
    //   626: new java/lang/StringBuilder
    //   629: dup
    //   630: invokespecial <init> : ()V
    //   633: ldc 'Increasing ochDelay because of orphans to:'
    //   635: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   638: aload_0
    //   639: getfield l : I
    //   642: iconst_5
    //   643: isub
    //   644: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   647: invokevirtual toString : ()Ljava/lang/String;
    //   650: invokestatic c : (Ljava/lang/String;)V
    //   653: aload_0
    //   654: invokevirtual e : ()LG/F;
    //   657: aload_0
    //   658: getfield l : I
    //   661: iconst_5
    //   662: isub
    //   663: invokevirtual q : (I)V
    //   666: aload_0
    //   667: getfield W : Z
    //   670: ifeq -> 710
    //   673: new java/lang/StringBuilder
    //   676: dup
    //   677: invokespecial <init> : ()V
    //   680: ldc 'Check 1:'
    //   682: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   685: invokestatic nanoTime : ()J
    //   688: lload #9
    //   690: lsub
    //   691: l2d
    //   692: ldc2_w 1000000.0
    //   695: ddiv
    //   696: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   699: ldc 'ms.'
    //   701: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   704: invokevirtual toString : ()Ljava/lang/String;
    //   707: invokestatic c : (Ljava/lang/String;)V
    //   710: aload_0
    //   711: getfield F : Z
    //   714: ifeq -> 725
    //   717: aload_0
    //   718: aload_0
    //   719: invokevirtual L : ()Ljava/lang/String;
    //   722: invokevirtual i : (Ljava/lang/String;)V
    //   725: aload_0
    //   726: getfield W : Z
    //   729: ifeq -> 769
    //   732: new java/lang/StringBuilder
    //   735: dup
    //   736: invokespecial <init> : ()V
    //   739: ldc 'Check 2  notify write:'
    //   741: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   744: invokestatic nanoTime : ()J
    //   747: lload #9
    //   749: lsub
    //   750: l2d
    //   751: ldc2_w 1000000.0
    //   754: ddiv
    //   755: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   758: ldc 'ms.'
    //   760: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   763: invokevirtual toString : ()Ljava/lang/String;
    //   766: invokestatic c : (Ljava/lang/String;)V
    //   769: aload_0
    //   770: invokevirtual e : ()LG/F;
    //   773: invokevirtual j : ()Z
    //   776: istore #16
    //   778: iload #16
    //   780: ifeq -> 799
    //   783: aload #12
    //   785: aload_1
    //   786: invokevirtual write : ([B)V
    //   789: aload_0
    //   790: invokestatic currentTimeMillis : ()J
    //   793: putfield Q : J
    //   796: goto -> 881
    //   799: iconst_0
    //   800: istore #17
    //   802: iload #17
    //   804: aload_1
    //   805: arraylength
    //   806: if_icmpge -> 881
    //   809: aload #12
    //   811: aload_1
    //   812: iload #17
    //   814: baload
    //   815: invokevirtual write : (I)V
    //   818: aload_0
    //   819: invokestatic currentTimeMillis : ()J
    //   822: putfield Q : J
    //   825: aload #7
    //   827: ifnull -> 854
    //   830: iload #17
    //   832: aload_1
    //   833: arraylength
    //   834: bipush #99
    //   836: idiv
    //   837: irem
    //   838: ifne -> 854
    //   841: aload_0
    //   842: aload #7
    //   844: iload #17
    //   846: i2d
    //   847: aload_1
    //   848: arraylength
    //   849: i2d
    //   850: ddiv
    //   851: invokevirtual a : (LG/m;D)V
    //   854: iload #17
    //   856: aload_1
    //   857: arraylength
    //   858: iconst_1
    //   859: isub
    //   860: if_icmpge -> 875
    //   863: aload_0
    //   864: aload_0
    //   865: invokevirtual e : ()LG/F;
    //   868: invokevirtual k : ()I
    //   871: i2l
    //   872: invokevirtual a : (J)V
    //   875: iinc #17, 1
    //   878: goto -> 802
    //   881: aload_0
    //   882: ldc 'SENT'
    //   884: aload_1
    //   885: invokevirtual c : (Ljava/lang/String;[B)V
    //   888: invokestatic currentTimeMillis : ()J
    //   891: lstore #14
    //   893: aload_0
    //   894: getfield W : Z
    //   897: ifeq -> 947
    //   900: new java/lang/StringBuilder
    //   903: dup
    //   904: invokespecial <init> : ()V
    //   907: ldc 'Check 3 wrote bytes, writeBlock='
    //   909: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   912: iload #16
    //   914: invokevirtual append : (Z)Ljava/lang/StringBuilder;
    //   917: ldc ' about to flush out buffer:'
    //   919: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   922: invokestatic nanoTime : ()J
    //   925: lload #9
    //   927: lsub
    //   928: l2d
    //   929: ldc2_w 1000000.0
    //   932: ddiv
    //   933: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   936: ldc 'ms.'
    //   938: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   941: invokevirtual toString : ()Ljava/lang/String;
    //   944: invokestatic c : (Ljava/lang/String;)V
    //   947: aload #12
    //   949: invokevirtual flush : ()V
    //   952: aload_0
    //   953: ldc2_w 9223372036854775807
    //   956: putfield R : J
    //   959: lload_2
    //   960: ldc2_w -1
    //   963: lcmp
    //   964: ifne -> 977
    //   967: aload_0
    //   968: aload_0
    //   969: invokevirtual L : ()Ljava/lang/String;
    //   972: invokevirtual j : (Ljava/lang/String;)V
    //   975: aconst_null
    //   976: areturn
    //   977: aload_0
    //   978: getfield W : Z
    //   981: ifeq -> 1021
    //   984: new java/lang/StringBuilder
    //   987: dup
    //   988: invokespecial <init> : ()V
    //   991: ldc 'Check 4 out buffer flushed: '
    //   993: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   996: invokestatic nanoTime : ()J
    //   999: lload #9
    //   1001: lsub
    //   1002: l2d
    //   1003: ldc2_w 1000000.0
    //   1006: ddiv
    //   1007: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   1010: ldc 'ms.'
    //   1012: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1015: invokevirtual toString : ()Ljava/lang/String;
    //   1018: invokestatic c : (Ljava/lang/String;)V
    //   1021: aload_0
    //   1022: getfield F : Z
    //   1025: ifeq -> 1036
    //   1028: aload_0
    //   1029: aload_0
    //   1030: invokevirtual L : ()Ljava/lang/String;
    //   1033: invokevirtual k : (Ljava/lang/String;)V
    //   1036: aload_0
    //   1037: lload_2
    //   1038: invokevirtual a : (J)V
    //   1041: aload_0
    //   1042: getfield W : Z
    //   1045: ifeq -> 1085
    //   1048: new java/lang/StringBuilder
    //   1051: dup
    //   1052: invokespecial <init> : ()V
    //   1055: ldc 'Check 4.1 past sleep readDelay: '
    //   1057: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1060: invokestatic nanoTime : ()J
    //   1063: lload #9
    //   1065: lsub
    //   1066: l2d
    //   1067: ldc2_w 1000000.0
    //   1070: ddiv
    //   1071: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   1074: ldc 'ms.'
    //   1076: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1079: invokevirtual toString : ()Ljava/lang/String;
    //   1082: invokestatic c : (Ljava/lang/String;)V
    //   1085: aload_0
    //   1086: aload_0
    //   1087: invokevirtual L : ()Ljava/lang/String;
    //   1090: invokevirtual j : (Ljava/lang/String;)V
    //   1093: aload_0
    //   1094: getfield W : Z
    //   1097: ifeq -> 1137
    //   1100: new java/lang/StringBuilder
    //   1103: dup
    //   1104: invokespecial <init> : ()V
    //   1107: ldc 'Check 4.2 Notified Write end.: '
    //   1109: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1112: invokestatic nanoTime : ()J
    //   1115: lload #9
    //   1117: lsub
    //   1118: l2d
    //   1119: ldc2_w 1000000.0
    //   1122: ddiv
    //   1123: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   1126: ldc 'ms.'
    //   1128: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1131: invokevirtual toString : ()Ljava/lang/String;
    //   1134: invokestatic c : (Ljava/lang/String;)V
    //   1137: aload_0
    //   1138: getfield W : Z
    //   1141: ifeq -> 1181
    //   1144: new java/lang/StringBuilder
    //   1147: dup
    //   1148: invokespecial <init> : ()V
    //   1151: ldc 'Check 5:'
    //   1153: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1156: invokestatic nanoTime : ()J
    //   1159: lload #9
    //   1161: lsub
    //   1162: l2d
    //   1163: ldc2_w 1000000.0
    //   1166: ddiv
    //   1167: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   1170: ldc 'ms.'
    //   1172: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1175: invokevirtual toString : ()Ljava/lang/String;
    //   1178: invokestatic c : (Ljava/lang/String;)V
    //   1181: iload #11
    //   1183: newarray byte
    //   1185: astore #16
    //   1187: invokestatic currentTimeMillis : ()J
    //   1190: lstore #17
    //   1192: invokestatic currentTimeMillis : ()J
    //   1195: lload #4
    //   1197: ladd
    //   1198: lstore #19
    //   1200: aload #8
    //   1202: invokevirtual available : ()I
    //   1205: ifne -> 1232
    //   1208: invokestatic currentTimeMillis : ()J
    //   1211: lload #19
    //   1213: lconst_1
    //   1214: lsub
    //   1215: lcmp
    //   1216: ifge -> 1232
    //   1219: aload_0
    //   1220: lload #19
    //   1222: invokestatic currentTimeMillis : ()J
    //   1225: lsub
    //   1226: invokevirtual b : (J)V
    //   1229: goto -> 1200
    //   1232: aload #8
    //   1234: invokevirtual available : ()I
    //   1237: ifne -> 1385
    //   1240: aload_1
    //   1241: ifnull -> 1321
    //   1244: new java/lang/StringBuilder
    //   1247: dup
    //   1248: invokespecial <init> : ()V
    //   1251: ldc 'Read timeout for send command: '
    //   1253: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1256: aload_0
    //   1257: aload_1
    //   1258: invokevirtual a : ([B)Ljava/lang/String;
    //   1261: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1264: ldc '\\nExpected '
    //   1266: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1269: iload #6
    //   1271: ifle -> 1282
    //   1274: iload #6
    //   1276: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1279: goto -> 1284
    //   1282: ldc 'Unspecified'
    //   1284: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   1287: ldc ' bytes, still no response after '
    //   1289: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1292: invokestatic currentTimeMillis : ()J
    //   1295: lload #14
    //   1297: lsub
    //   1298: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   1301: ldc 'ms.'
    //   1303: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1306: invokevirtual toString : ()Ljava/lang/String;
    //   1309: astore #21
    //   1311: aload_0
    //   1312: ldc 'Timed out on read'
    //   1314: aload_1
    //   1315: invokevirtual c : (Ljava/lang/String;[B)V
    //   1318: goto -> 1375
    //   1321: new java/lang/StringBuilder
    //   1324: dup
    //   1325: invokespecial <init> : ()V
    //   1328: ldc 'Underrun\\nExpected '
    //   1330: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1333: iload #6
    //   1335: ifle -> 1346
    //   1338: iload #6
    //   1340: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1343: goto -> 1348
    //   1346: ldc 'Unspecified'
    //   1348: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   1351: ldc ' bytes, still no response after '
    //   1353: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1356: invokestatic currentTimeMillis : ()J
    //   1359: lload #14
    //   1361: lsub
    //   1362: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   1365: ldc 'ms.'
    //   1367: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1370: invokevirtual toString : ()Ljava/lang/String;
    //   1373: astore #21
    //   1375: new V/b
    //   1378: dup
    //   1379: aload #21
    //   1381: invokespecial <init> : (Ljava/lang/String;)V
    //   1384: athrow
    //   1385: aload_0
    //   1386: getfield W : Z
    //   1389: ifeq -> 1452
    //   1392: new java/lang/StringBuilder
    //   1395: dup
    //   1396: invokespecial <init> : ()V
    //   1399: ldc 'Check 6, start read of '
    //   1401: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1404: iload #6
    //   1406: ifle -> 1417
    //   1409: iload #6
    //   1411: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1414: goto -> 1419
    //   1417: ldc 'Unspecified'
    //   1419: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   1422: ldc ' bytes: '
    //   1424: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1427: invokestatic nanoTime : ()J
    //   1430: lload #9
    //   1432: lsub
    //   1433: l2d
    //   1434: ldc2_w 1000000.0
    //   1437: ddiv
    //   1438: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   1441: ldc 'ms.'
    //   1443: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1446: invokevirtual toString : ()Ljava/lang/String;
    //   1449: invokestatic c : (Ljava/lang/String;)V
    //   1452: iconst_0
    //   1453: istore #21
    //   1455: iload #6
    //   1457: ifge -> 1754
    //   1460: aload #8
    //   1462: invokevirtual read : ()I
    //   1465: istore #22
    //   1467: iload #22
    //   1469: iconst_m1
    //   1470: if_icmpeq -> 1751
    //   1473: iload #6
    //   1475: iflt -> 1485
    //   1478: iload #21
    //   1480: iload #6
    //   1482: if_icmpge -> 1751
    //   1485: iload #21
    //   1487: aload #16
    //   1489: arraylength
    //   1490: if_icmpne -> 1519
    //   1493: aload #16
    //   1495: astore #23
    //   1497: aload #23
    //   1499: arraylength
    //   1500: iload #11
    //   1502: iadd
    //   1503: newarray byte
    //   1505: astore #16
    //   1507: aload #23
    //   1509: iconst_0
    //   1510: aload #16
    //   1512: iconst_0
    //   1513: aload #23
    //   1515: arraylength
    //   1516: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   1519: aload #16
    //   1521: iload #21
    //   1523: iload #22
    //   1525: i2b
    //   1526: bastore
    //   1527: iinc #21, 1
    //   1530: invokestatic currentTimeMillis : ()J
    //   1533: lstore #17
    //   1535: aload_0
    //   1536: lload #17
    //   1538: putfield Q : J
    //   1541: aload #8
    //   1543: invokevirtual available : ()I
    //   1546: ifne -> 1727
    //   1549: iload #21
    //   1551: iload #6
    //   1553: iconst_1
    //   1554: isub
    //   1555: if_icmpge -> 1727
    //   1558: aload_0
    //   1559: lload #4
    //   1561: invokevirtual b : (J)V
    //   1564: aload #8
    //   1566: invokevirtual available : ()I
    //   1569: ifne -> 1541
    //   1572: new java/lang/StringBuilder
    //   1575: dup
    //   1576: invokespecial <init> : ()V
    //   1579: ldc 'break wait after '
    //   1581: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1584: invokestatic currentTimeMillis : ()J
    //   1587: lload #14
    //   1589: lsub
    //   1590: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   1593: ldc 'ms, '
    //   1595: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1598: iload #21
    //   1600: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   1603: ldc ' bytes read, expected:'
    //   1605: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1608: iload #6
    //   1610: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   1613: invokevirtual toString : ()Ljava/lang/String;
    //   1616: astore #23
    //   1618: new java/util/ArrayList
    //   1621: dup
    //   1622: invokespecial <init> : ()V
    //   1625: astore #24
    //   1627: iconst_0
    //   1628: istore #25
    //   1630: iload #25
    //   1632: iload #21
    //   1634: if_icmpge -> 1657
    //   1637: aload #24
    //   1639: aload #16
    //   1641: iload #25
    //   1643: baload
    //   1644: invokestatic valueOf : (B)Ljava/lang/Byte;
    //   1647: invokevirtual add : (Ljava/lang/Object;)Z
    //   1650: pop
    //   1651: iinc #25, 1
    //   1654: goto -> 1630
    //   1657: aload_0
    //   1658: aload #24
    //   1660: invokevirtual a : (Ljava/util/ArrayList;)Z
    //   1663: pop
    //   1664: aload #23
    //   1666: invokestatic c : (Ljava/lang/String;)V
    //   1669: iload #21
    //   1671: newarray int
    //   1673: astore #25
    //   1675: aload #16
    //   1677: iconst_0
    //   1678: aload #25
    //   1680: iconst_0
    //   1681: iload #21
    //   1683: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   1686: aload_0
    //   1687: new java/lang/StringBuilder
    //   1690: dup
    //   1691: invokespecial <init> : ()V
    //   1694: ldc 'Expected '
    //   1696: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1699: iload #6
    //   1701: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   1704: ldc ' bytes, Received'
    //   1706: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1709: invokevirtual toString : ()Ljava/lang/String;
    //   1712: aload #25
    //   1714: invokevirtual a : (Ljava/lang/String;[I)V
    //   1717: new V/b
    //   1720: dup
    //   1721: aload #23
    //   1723: invokespecial <init> : (Ljava/lang/String;)V
    //   1726: athrow
    //   1727: aload #8
    //   1729: invokevirtual available : ()I
    //   1732: ifle -> 1745
    //   1735: aload #8
    //   1737: invokevirtual read : ()I
    //   1740: istore #22
    //   1742: goto -> 1467
    //   1745: iconst_m1
    //   1746: istore #22
    //   1748: goto -> 1467
    //   1751: goto -> 2269
    //   1754: iload #6
    //   1756: newarray byte
    //   1758: astore #22
    //   1760: iconst_0
    //   1761: istore #23
    //   1763: invokestatic currentTimeMillis : ()J
    //   1766: lstore #24
    //   1768: iload #6
    //   1770: iload #23
    //   1772: isub
    //   1773: aload #16
    //   1775: arraylength
    //   1776: if_icmple -> 1812
    //   1779: aload #8
    //   1781: aload #16
    //   1783: iconst_0
    //   1784: aload #16
    //   1786: arraylength
    //   1787: invokevirtual read : ([BII)I
    //   1790: istore #26
    //   1792: iload #26
    //   1794: ifle -> 1828
    //   1797: aload #16
    //   1799: iconst_0
    //   1800: aload #22
    //   1802: iload #23
    //   1804: iload #26
    //   1806: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   1809: goto -> 1828
    //   1812: aload #8
    //   1814: aload #22
    //   1816: iload #23
    //   1818: iload #6
    //   1820: iload #23
    //   1822: isub
    //   1823: invokevirtual read : ([BII)I
    //   1826: istore #26
    //   1828: aload_0
    //   1829: getfield W : Z
    //   1832: ifeq -> 1882
    //   1835: new java/lang/StringBuilder
    //   1838: dup
    //   1839: invokespecial <init> : ()V
    //   1842: ldc 'read:'
    //   1844: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1847: iload #26
    //   1849: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   1852: ldc ' bytes  '
    //   1854: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1857: invokestatic nanoTime : ()J
    //   1860: lload #9
    //   1862: lsub
    //   1863: l2d
    //   1864: ldc2_w 1000000.0
    //   1867: ddiv
    //   1868: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   1871: ldc 'ms.'
    //   1873: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1876: invokevirtual toString : ()Ljava/lang/String;
    //   1879: invokestatic c : (Ljava/lang/String;)V
    //   1882: iload #26
    //   1884: ifle -> 1906
    //   1887: iload #23
    //   1889: iload #26
    //   1891: iadd
    //   1892: istore #23
    //   1894: aload_0
    //   1895: invokestatic currentTimeMillis : ()J
    //   1898: putfield Q : J
    //   1901: invokestatic currentTimeMillis : ()J
    //   1904: lstore #24
    //   1906: iload #26
    //   1908: ifgt -> 1923
    //   1911: invokestatic currentTimeMillis : ()J
    //   1914: lload #24
    //   1916: lsub
    //   1917: lload #4
    //   1919: lcmp
    //   1920: ifgt -> 1939
    //   1923: invokestatic currentTimeMillis : ()J
    //   1926: lload #24
    //   1928: lsub
    //   1929: lload #4
    //   1931: ldc2_w 2
    //   1934: lmul
    //   1935: lcmp
    //   1936: ifle -> 2103
    //   1939: new java/lang/StringBuilder
    //   1942: dup
    //   1943: invokespecial <init> : ()V
    //   1946: ldc 'break wait after '
    //   1948: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1951: invokestatic currentTimeMillis : ()J
    //   1954: lload #24
    //   1956: lsub
    //   1957: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   1960: ldc ' ms, '
    //   1962: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1965: iload #23
    //   1967: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   1970: ldc ' bytes read, expected:'
    //   1972: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1975: iload #6
    //   1977: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   1980: invokevirtual toString : ()Ljava/lang/String;
    //   1983: astore #27
    //   1985: aload #27
    //   1987: invokestatic c : (Ljava/lang/String;)V
    //   1990: iload #23
    //   1992: newarray int
    //   1994: astore #28
    //   1996: aload #22
    //   1998: invokestatic b : ([B)[I
    //   2001: iconst_0
    //   2002: aload #28
    //   2004: iconst_0
    //   2005: aload #28
    //   2007: arraylength
    //   2008: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   2011: aload_0
    //   2012: new java/lang/StringBuilder
    //   2015: dup
    //   2016: invokespecial <init> : ()V
    //   2019: ldc 'Expected '
    //   2021: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2024: iload #6
    //   2026: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   2029: ldc ' bytes, Received'
    //   2031: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2034: invokevirtual toString : ()Ljava/lang/String;
    //   2037: aload #28
    //   2039: invokevirtual a : (Ljava/lang/String;[I)V
    //   2042: new java/util/ArrayList
    //   2045: dup
    //   2046: invokespecial <init> : ()V
    //   2049: astore #29
    //   2051: iconst_0
    //   2052: istore #30
    //   2054: iload #30
    //   2056: aload #28
    //   2058: arraylength
    //   2059: if_icmpge -> 2082
    //   2062: aload #29
    //   2064: aload #22
    //   2066: iload #30
    //   2068: baload
    //   2069: invokestatic valueOf : (B)Ljava/lang/Byte;
    //   2072: invokevirtual add : (Ljava/lang/Object;)Z
    //   2075: pop
    //   2076: iinc #30, 1
    //   2079: goto -> 2054
    //   2082: aload_1
    //   2083: ifnull -> 2093
    //   2086: aload_0
    //   2087: aload #29
    //   2089: invokevirtual a : (Ljava/util/ArrayList;)Z
    //   2092: pop
    //   2093: new V/b
    //   2096: dup
    //   2097: aload #27
    //   2099: invokespecial <init> : (Ljava/lang/String;)V
    //   2102: athrow
    //   2103: iload #23
    //   2105: iload #6
    //   2107: if_icmpge -> 2204
    //   2110: aload_0
    //   2111: getfield W : Z
    //   2114: ifeq -> 2187
    //   2117: new java/lang/StringBuilder
    //   2120: dup
    //   2121: invokespecial <init> : ()V
    //   2124: ldc 'Check 6.2: need '
    //   2126: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2129: iload #6
    //   2131: iload #23
    //   2133: isub
    //   2134: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   2137: ldc ' sleeping '
    //   2139: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2142: iconst_1
    //   2143: iload #6
    //   2145: iload #23
    //   2147: isub
    //   2148: aload_0
    //   2149: getfield m : I
    //   2152: idiv
    //   2153: iadd
    //   2154: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   2157: ldc 'ms to fill buffer: '
    //   2159: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2162: invokestatic nanoTime : ()J
    //   2165: lload #9
    //   2167: lsub
    //   2168: l2d
    //   2169: ldc2_w 1000000.0
    //   2172: ddiv
    //   2173: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   2176: ldc 'ms.'
    //   2178: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2181: invokevirtual toString : ()Ljava/lang/String;
    //   2184: invokestatic c : (Ljava/lang/String;)V
    //   2187: aload_0
    //   2188: iconst_1
    //   2189: iload #6
    //   2191: iload #23
    //   2193: isub
    //   2194: aload_0
    //   2195: getfield m : I
    //   2198: idiv
    //   2199: iadd
    //   2200: i2l
    //   2201: invokevirtual a : (J)V
    //   2204: iload #23
    //   2206: iload #6
    //   2208: if_icmplt -> 1768
    //   2211: aload_0
    //   2212: getfield W : Z
    //   2215: ifeq -> 2265
    //   2218: new java/lang/StringBuilder
    //   2221: dup
    //   2222: invokespecial <init> : ()V
    //   2225: ldc 'Check 6.3:read all '
    //   2227: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2230: iload #6
    //   2232: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   2235: ldc 'bytes '
    //   2237: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2240: invokestatic nanoTime : ()J
    //   2243: lload #9
    //   2245: lsub
    //   2246: l2d
    //   2247: ldc2_w 1000000.0
    //   2250: ddiv
    //   2251: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   2254: ldc 'ms.'
    //   2256: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2259: invokevirtual toString : ()Ljava/lang/String;
    //   2262: invokestatic c : (Ljava/lang/String;)V
    //   2265: aload #22
    //   2267: astore #16
    //   2269: aload_0
    //   2270: iconst_0
    //   2271: putfield h : Z
    //   2274: aload_0
    //   2275: invokestatic currentTimeMillis : ()J
    //   2278: putfield Q : J
    //   2281: iload #6
    //   2283: ifgt -> 2307
    //   2286: iload #21
    //   2288: newarray byte
    //   2290: astore #13
    //   2292: aload #16
    //   2294: iconst_0
    //   2295: aload #13
    //   2297: iconst_0
    //   2298: aload #13
    //   2300: arraylength
    //   2301: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   2304: goto -> 2311
    //   2307: aload #16
    //   2309: astore #13
    //   2311: aload_0
    //   2312: getfield W : Z
    //   2315: ifeq -> 2355
    //   2318: new java/lang/StringBuilder
    //   2321: dup
    //   2322: invokespecial <init> : ()V
    //   2325: ldc 'Check 7, Done reading:'
    //   2327: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2330: invokestatic nanoTime : ()J
    //   2333: lload #9
    //   2335: lsub
    //   2336: l2d
    //   2337: ldc2_w 1000000.0
    //   2340: ddiv
    //   2341: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   2344: ldc 'ms.'
    //   2346: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2349: invokevirtual toString : ()Ljava/lang/String;
    //   2352: invokestatic c : (Ljava/lang/String;)V
    //   2355: aload_0
    //   2356: ldc 'Received'
    //   2358: aload #13
    //   2360: invokevirtual c : (Ljava/lang/String;[B)V
    //   2363: aload_0
    //   2364: aload_0
    //   2365: invokevirtual L : ()Ljava/lang/String;
    //   2368: invokevirtual l : (Ljava/lang/String;)V
    //   2371: aload_0
    //   2372: getfield W : Z
    //   2375: ifeq -> 2415
    //   2378: new java/lang/StringBuilder
    //   2381: dup
    //   2382: invokespecial <init> : ()V
    //   2385: ldc 'Check 8, Notify app components:'
    //   2387: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2390: invokestatic nanoTime : ()J
    //   2393: lload #9
    //   2395: lsub
    //   2396: l2d
    //   2397: ldc2_w 1000000.0
    //   2400: ddiv
    //   2401: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   2404: ldc 'ms.'
    //   2406: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2409: invokevirtual toString : ()Ljava/lang/String;
    //   2412: invokestatic c : (Ljava/lang/String;)V
    //   2415: aload_0
    //   2416: invokestatic currentTimeMillis : ()J
    //   2419: putfield k : J
    //   2422: aload #13
    //   2424: areturn
  }
  
  protected InputStream i() {
    return this.b.getInputStream();
  }
  
  protected OutputStream j() {
    return this.b.getOutputStream();
  }
  
  protected boolean k() {
    return this.E;
  }
  
  public void l() {
    try {
      m();
    } catch (Exception exception) {
      Logger.getLogger(e.class.getName()).log(Level.SEVERE, (String)null, exception);
    } 
  }
  
  protected void a(String paramString1, String paramString2) {
    boolean bool = I();
    paramString2 = paramString2.trim();
    D.d("Opening port: " + paramString2);
    try {
      long l = System.currentTimeMillis();
      this.b = (SerialPort)d.get(paramString2);
      if (this.b == null) {
        CommPortIdentifier.addPortName(paramString2, 1, (CommDriver)c);
        if (bool)
          D.c((System.currentTimeMillis() - l) + "ms. - added Port"); 
        this.b = (SerialPort)c.getCommPort(paramString2, 1);
        d.put(paramString2, this.b);
        if (bool)
          D.c((System.currentTimeMillis() - l) + "ms. - 1st got port"); 
        this.b.addEventListener(this);
        this.b.notifyOnDataAvailable(true);
      } 
      if (bool)
        D.c((System.currentTimeMillis() - l) + "ms. - got port"); 
      m();
      if (bool)
        D.c((System.currentTimeMillis() - l) + "ms. - setParameters"); 
    } catch (TooManyListenersException tooManyListenersException) {
      D.c("Failed to add as serial listener");
    } catch (Exception exception) {
      d.remove(paramString2);
      if (I())
        D.c("Unable to open port: " + paramString2 + "\nPlease check your Communications Settings. "); 
      throw new l("Unable to open port: " + paramString2 + "\nPlease check your Communications Settings. ");
    } 
  }
  
  protected void m() {
    if (this.b == null) {
      D.b("currentPort is null, can not setConnectionParameters");
      return;
    } 
    int i = this.b.getBaudRate();
    int j = this.b.getDataBits();
    int k = this.b.getStopBits();
    int m = this.b.getParity();
    int i1 = this.b.getFlowControlMode();
    this.b.setRTS(false);
    this.b.setDTR(false);
    this.b.setInputBufferSize(this.i);
    this.b.setOutputBufferSize(this.i);
    try {
      this.b.setSerialPortParams(this.a.b(), this.a.f(), this.a.g(), this.a.h());
      this.b.enableReceiveTimeout(5);
      this.m = 12 * this.a.b() / 115200;
    } catch (UnsupportedCommOperationException unsupportedCommOperationException) {
      this.a.a(i);
      this.a.b(j);
      this.a.c(k);
      this.a.d(m);
      throw new m("Unsupported parameter");
    } 
    try {
      this.b.setFlowControlMode(this.a.d() | this.a.e());
    } catch (UnsupportedCommOperationException unsupportedCommOperationException) {
      throw new m("Unsupported flow control");
    } 
  }
  
  public synchronized void serialEvent(SerialPortEvent paramSerialPortEvent) {
    if (paramSerialPortEvent.getEventType() == 1) {
      this.h = true;
      notify();
    } 
  }
  
  protected synchronized void b(long paramLong) {
    this.h = false;
    long l = System.currentTimeMillis() + paramLong;
    for (byte b = 0; !this.h && System.currentTimeMillis() < l; b++) {
      try {
        wait(paramLong);
      } catch (InterruptedException interruptedException) {
        Logger.getLogger(e.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
      } 
    } 
  }
  
  public void b(boolean paramBoolean) {
    this.o = paramBoolean;
  }
  
  public String n() {
    return "MegaSquirtRs232CommManager";
  }
  
  protected void o() {
    if (this.b == null) {
      if (I())
        D.d("Had to open port " + e().s() + " from the comm thread"); 
      c = new RXTXCommDriver();
      D.c("re-initializing driver in loop");
      c.initialize();
      a(1000L);
      a(e().u(), e().s());
      a(500L);
    } 
  }
  
  protected boolean p() {
    return true;
  }
  
  protected synchronized boolean a(int paramInt) {
    String str = f();
    a(paramInt + "");
    try {
      m();
    } catch (m m) {
      Logger.getLogger(e.class.getName()).log(Level.SEVERE, (String)null, m);
      a(str);
      try {
        m();
      } catch (m m1) {
        Logger.getLogger(e.class.getName()).log(Level.SEVERE, (String)null, m1);
      } 
      return false;
    } 
    return true;
  }
  
  public boolean a(Thread paramThread) {
    return (paramThread != null && this.e != null && paramThread.equals(this.e));
  }
  
  private void R() {
    String str = System.getProperty("os.name");
    boolean bool = (str != null && str.startsWith("Linux")) ? true : false;
    if (bool)
      try {
        String str1 = e().s();
        str1 = str1.replace("/dev/", "");
        String str2 = "/var/lock/LCK.." + str1;
        a(500L);
        Process process = Runtime.getRuntime().exec("/bin/chmod 777 " + str2);
        process.waitFor();
        D.c("chmod lock file exit code:" + process.exitValue());
        a(250L);
        process = Runtime.getRuntime().exec("/bin/rm " + str2);
        process.waitFor();
        D.d("Failed to open port, deleted Lock file, exit code: " + process.exitValue() + ":" + str2);
      } catch (InterruptedException interruptedException) {
        Logger.getLogger(e.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
      } catch (IOException iOException) {
        Logger.getLogger(e.class.getName()).log(Level.SEVERE, (String)null, iOException);
      }  
  }
  
  public boolean q() {
    return (this.F && this.e != null && !this.e.a());
  }
  
  public boolean r() {
    return (this.e != null && !this.e.a());
  }
  
  protected void a(SerialPort paramSerialPort) {
    try {
      String str = X.b(this.b.getName(), "//./", "");
      d.remove(str);
      D.d("Removed Port from cache");
      try {
        paramSerialPort.getOutputStream().flush();
      } catch (IOException iOException) {
      
      } finally {
        paramSerialPort.close();
        D.d("Successfully Closed Port");
      } 
    } catch (Exception exception) {
      D.c("can not close Port: " + paramSerialPort + ", message: " + exception.getMessage());
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/z/e.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */