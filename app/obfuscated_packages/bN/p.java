package bN;

import G.J;
import G.f;
import J.j;
import bH.D;
import bH.c;
import bR.a;
import bR.c;
import bR.d;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class p {
  InputStream a;
  
  k b;
  
  f c = new f();
  
  final List d = new CopyOnWriteArrayList();
  
  q e = null;
  
  int f = -1;
  
  public static int g = 0;
  
  public static int h = 1;
  
  public static int i = 2;
  
  int j = g;
  
  String k = "RX:";
  
  public boolean l = false;
  
  byte[] m = null;
  
  f n = new f();
  
  private long q = 0L;
  
  private long r = 0L;
  
  final Object o = new Object();
  
  private boolean s = false;
  
  private j t = null;
  
  int p = 0;
  
  public p(InputStream paramInputStream, k paramk) {
    this.a = paramInputStream;
    this.b = paramk;
  }
  
  public void a(f paramf) {
    this.d.add(paramf);
  }
  
  public void b(f paramf) {
    this.d.remove(paramf);
  }
  
  private void a(IOException paramIOException) {
    ArrayList arrayList = new ArrayList();
    synchronized (this.d) {
      if (!this.d.isEmpty())
        arrayList.addAll(this.d); 
    } 
    for (f f1 : arrayList)
      f1.a(paramIOException); 
  }
  
  private void a(t paramt) {
    if (this.r > 0L && System.currentTimeMillis() - this.r > 1200L)
      D.c("Time since last packet (ms): " + (System.currentTimeMillis() - this.r)); 
    this.r = System.currentTimeMillis();
    for (f f1 : this.d)
      f1.a(paramt); 
  }
  
  private void a(int paramInt, String paramString) {
    for (f f1 : this.d)
      f1.a(paramInt, paramString); 
  }
  
  private void d() {
    for (f f1 : this.d)
      f1.a(); 
  }
  
  private void e() {
    for (f f1 : this.d)
      f1.b(); 
  }
  
  private void a(byte[] paramArrayOfbyte, int paramInt) {
    if (f())
      D.c("Adding back to prebuffer from offset: \n" + c.a(paramArrayOfbyte, 16, paramInt, paramArrayOfbyte.length - paramInt)); 
    if (this.m == null || this.m.length == 0) {
      this.m = this.n.b(paramArrayOfbyte.length - paramInt);
      System.arraycopy(paramArrayOfbyte, paramInt, this.m, 0, paramArrayOfbyte.length - paramInt);
    } else {
      byte[] arrayOfByte = this.n.b(this.m.length + paramArrayOfbyte.length - paramInt);
      System.arraycopy(paramArrayOfbyte, paramInt, arrayOfByte, 0, paramArrayOfbyte.length - paramInt);
      System.arraycopy(this.m, 0, arrayOfByte, paramArrayOfbyte.length - paramInt, this.m.length);
      this.n.a(this.m);
      this.m = arrayOfByte;
    } 
  }
  
  private boolean f() {
    return (J.I() || this.s);
  }
  
  public long a() {
    return this.q;
  }
  
  private int a(byte[] paramArrayOfbyte) {
    // Byte code:
    //   0: invokestatic currentTimeMillis : ()J
    //   3: aload_0
    //   4: getfield b : LbN/k;
    //   7: invokevirtual h : ()I
    //   10: i2l
    //   11: ladd
    //   12: lstore_2
    //   13: iconst_0
    //   14: istore #4
    //   16: aload_0
    //   17: getfield m : [B
    //   20: ifnull -> 143
    //   23: aload_0
    //   24: getfield m : [B
    //   27: arraylength
    //   28: ifle -> 143
    //   31: aload_0
    //   32: getfield m : [B
    //   35: arraylength
    //   36: aload_1
    //   37: arraylength
    //   38: invokestatic min : (II)I
    //   41: istore #4
    //   43: aload_0
    //   44: getfield m : [B
    //   47: iconst_0
    //   48: aload_1
    //   49: iconst_0
    //   50: iload #4
    //   52: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   55: aload_0
    //   56: getfield m : [B
    //   59: arraylength
    //   60: iload #4
    //   62: if_icmple -> 117
    //   65: aload_0
    //   66: getfield n : LG/f;
    //   69: aload_0
    //   70: getfield m : [B
    //   73: arraylength
    //   74: iload #4
    //   76: isub
    //   77: invokevirtual b : (I)[B
    //   80: astore #5
    //   82: aload_0
    //   83: getfield m : [B
    //   86: iload #4
    //   88: aload #5
    //   90: iconst_0
    //   91: aload #5
    //   93: arraylength
    //   94: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   97: aload_0
    //   98: getfield n : LG/f;
    //   101: aload_0
    //   102: getfield m : [B
    //   105: invokevirtual a : ([B)V
    //   108: aload_0
    //   109: aload #5
    //   111: putfield m : [B
    //   114: goto -> 133
    //   117: aload_0
    //   118: getfield n : LG/f;
    //   121: aload_0
    //   122: getfield m : [B
    //   125: invokevirtual a : ([B)V
    //   128: aload_0
    //   129: aconst_null
    //   130: putfield m : [B
    //   133: iload #4
    //   135: aload_1
    //   136: arraylength
    //   137: if_icmpne -> 143
    //   140: iload #4
    //   142: ireturn
    //   143: iload #4
    //   145: istore #5
    //   147: invokestatic currentTimeMillis : ()J
    //   150: lstore #6
    //   152: aload_0
    //   153: getfield a : Ljava/io/InputStream;
    //   156: aload_1
    //   157: iload #4
    //   159: aload_1
    //   160: arraylength
    //   161: iload #4
    //   163: isub
    //   164: invokevirtual read : ([BII)I
    //   167: istore #8
    //   169: iload #8
    //   171: iconst_m1
    //   172: if_icmpne -> 190
    //   175: ldc 'Connection Closed, ending....'
    //   177: invokestatic c : (Ljava/lang/String;)V
    //   180: new java/io/IOException
    //   183: dup
    //   184: ldc 'Connection Closed'
    //   186: invokespecial <init> : (Ljava/lang/String;)V
    //   189: athrow
    //   190: iload #8
    //   192: ifle -> 202
    //   195: aload_0
    //   196: invokestatic currentTimeMillis : ()J
    //   199: putfield q : J
    //   202: iload #4
    //   204: iload #8
    //   206: iadd
    //   207: istore #4
    //   209: iload #4
    //   211: aload_1
    //   212: arraylength
    //   213: if_icmplt -> 229
    //   216: invokestatic currentTimeMillis : ()J
    //   219: lload #6
    //   221: lsub
    //   222: ldc2_w 2000
    //   225: lcmp
    //   226: ifle -> 276
    //   229: new java/lang/StringBuilder
    //   232: dup
    //   233: invokespecial <init> : ()V
    //   236: ldc 'Looping for reads. Got '
    //   238: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   241: iload #8
    //   243: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   246: ldc ' in '
    //   248: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   251: invokestatic currentTimeMillis : ()J
    //   254: lload #6
    //   256: lsub
    //   257: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   260: ldc 'ms, total: '
    //   262: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   265: iload #4
    //   267: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   270: invokevirtual toString : ()Ljava/lang/String;
    //   273: invokestatic c : (Ljava/lang/String;)V
    //   276: iload #8
    //   278: ifne -> 281
    //   281: iload #4
    //   283: aload_1
    //   284: arraylength
    //   285: if_icmpge -> 296
    //   288: lload_2
    //   289: invokestatic currentTimeMillis : ()J
    //   292: lcmp
    //   293: ifgt -> 152
    //   296: iload #4
    //   298: ifne -> 303
    //   301: iconst_0
    //   302: ireturn
    //   303: iload #4
    //   305: iflt -> 343
    //   308: iload #4
    //   310: aload_1
    //   311: arraylength
    //   312: if_icmpge -> 343
    //   315: new java/lang/StringBuilder
    //   318: dup
    //   319: invokespecial <init> : ()V
    //   322: ldc 'Read Timeout after reading '
    //   324: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   327: iload #4
    //   329: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   332: ldc ' bytes.'
    //   334: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   337: invokevirtual toString : ()Ljava/lang/String;
    //   340: invokestatic b : (Ljava/lang/String;)V
    //   343: aload_0
    //   344: invokespecial f : ()Z
    //   347: ifeq -> 385
    //   350: iload #4
    //   352: iload #5
    //   354: isub
    //   355: ifle -> 385
    //   358: iload #4
    //   360: iload #5
    //   362: isub
    //   363: newarray byte
    //   365: astore #8
    //   367: aload_1
    //   368: iload #5
    //   370: aload #8
    //   372: iconst_0
    //   373: aload #8
    //   375: arraylength
    //   376: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   379: aload_0
    //   380: aload #8
    //   382: invokespecial b : ([B)V
    //   385: iload #4
    //   387: ireturn
  }
  
  private void b(byte[] paramArrayOfbyte) {
    System.out.println(k.v() + this.k + c.d(paramArrayOfbyte));
  }
  
  public void b() {
    this.l = true;
    synchronized (this.o) {
      try {
        this.o.wait(500L);
      } catch (InterruptedException interruptedException) {
        Logger.getLogger(p.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
      } 
    } 
  }
  
  private void g() {
    if (this.m != null) {
      this.n.a(this.m);
      this.m = null;
    } 
    byte[] arrayOfByte = this.c.b(14001);
    try {
      int m;
      long l = System.currentTimeMillis() + 200L;
      int i = 0;
      do {
        m = this.a.read(arrayOfByte, i, arrayOfByte.length - i);
        if (m == -1) {
          D.c("Connection Closed, ending...");
          throw new IOException("Connection Closed");
        } 
        i += m;
        if (m == 0)
          a(0, 200); 
        if (f()) {
          D.c("Cleared " + i + " orphans from buffer.\n" + c.a(arrayOfByte, 16, 0, i));
        } else {
          D.c("Cleared " + i + " orphans from buffer.");
        } 
      } while (m > 0 && i < arrayOfByte.length && l > System.currentTimeMillis());
      if (i > 0)
        D.d("Cleared Input Buffer of bytes: " + i); 
    } catch (Exception exception) {
      throw new IOException("Failed to read: " + exception.getMessage());
    } finally {
      this.c.a(arrayOfByte);
    } 
  }
  
  private c a(c paramc, boolean paramBoolean) {
    int i = paramc.a().a();
    byte[] arrayOfByte1 = this.c.b(i);
    byte[] arrayOfByte2 = null;
    byte[] arrayOfByte3 = null;
    try {
      int m = a(arrayOfByte1);
      if (m < arrayOfByte1.length)
        throw new c(); 
      d();
      paramc.a().a(arrayOfByte1);
      int n = (int)((this.f + 1) % Math.pow(2.0D, (8 * i / 2)));
      int i1 = paramc.a().b();
      if (this.f > -1 && n != paramc.a().c()) {
        if (!paramBoolean)
          D.b("unexpected Counter Missing packets? Expected: x" + Integer.toHexString(this.f + 1) + ", found: x" + Integer.toHexString(paramc.a().c())); 
        if (!paramBoolean && this.t != null) {
          int i2 = (this.p == 0 && (paramc.a().c() == 0 || n < 10) && (i1 <= this.b.i() || i1 <= this.b.j())) ? 0 : (Math.max(paramc.a().c(), n) - Math.min(paramc.a().c(), n));
          if (paramc.a().c() < 127 && n > Math.pow(2.0D, (8 * i / 2)) - 127.0D)
            i2 = (int)(Math.pow(2.0D, (8 * i / 2)) + paramc.a().c() - n); 
          if (!paramBoolean) {
            D.c("missing: " + i2 + ", message.getHeader().getCounter()=" + paramc.a().c() + ", nextCounter=" + n);
            this.t.a(i2);
            this.t.l();
          } 
        } 
        if (i1 > this.b.i() && i1 > this.b.j()) {
          if (!paramBoolean)
            D.a("Invalid len, larger than MAX_CTO and MAX DTO. LEN=" + i1); 
          byte[] arrayOfByte = new byte[arrayOfByte1.length];
          System.arraycopy(arrayOfByte1, 0, arrayOfByte, 0, arrayOfByte1.length);
          throw new e(arrayOfByte);
        } 
        paramc.a(false);
        this.p++;
      } else {
        this.p = 0;
      } 
      this.f = paramc.a().c();
      arrayOfByte2 = this.c.b(i1 + paramc.c().a());
      m = a(arrayOfByte2);
      if (m < arrayOfByte2.length) {
        D.b("inbound Packet under-run! Read: " + m + ", expected: " + arrayOfByte2.length);
        b(50, "Under-run: " + m + " of " + arrayOfByte2.length);
        throw new c();
      } 
      arrayOfByte3 = new byte[arrayOfByte2.length - paramc.c().a()];
      System.arraycopy(arrayOfByte2, 0, arrayOfByte3, 0, arrayOfByte3.length);
      paramc.a(arrayOfByte3);
      paramc.c().a(arrayOfByte2, paramc.b().b());
      return paramc;
    } catch (o o) {
      throw new e(arrayOfByte3);
    } catch (IOException iOException) {
      throw iOException;
    } finally {
      this.c.a(arrayOfByte1);
      if (arrayOfByte2 != null)
        this.c.a(arrayOfByte2); 
      e();
    } 
  }
  
  private synchronized void h() {
    if (this.b.b() == 2 || this.b.b() == 1) {
      c c = d.a().a(this.b);
      try {
        c = a(c, false);
      } catch (c c1) {
        b(new byte[0]);
        return;
      } catch (e e) {
        D.c("Invalid data read, does not look like a message: " + c.d(e.a()));
        byte[] arrayOfByte1 = e.a();
        byte b1 = 0;
        ArrayList<Byte> arrayList = new ArrayList();
        byte[] arrayOfByte2 = new byte[0];
        byte b2 = 0;
        int i = 0;
        char c1 = 'ל';
        if (this.t != null)
          this.t.o(); 
        do {
          try {
            if (arrayOfByte1.length > 0)
              arrayList.add(Byte.valueOf(arrayOfByte1[0])); 
            if (arrayOfByte1.length > 1)
              a(arrayOfByte1, 1); 
            c = a(c, true);
            if (!c.d()) {
              D.c("Got what looked to be a message, but it failed CRC.");
              try {
                throw new e(c.h());
              } catch (a a) {
                Logger.getLogger(p.class.getName()).log(Level.WARNING, "This shouldn't happen?", (Throwable)a);
              } 
            } 
            D.c("Found what looks like a good message.");
            if (!b1) {
              i = this.f;
              D.c("Set 1st good message counter to: 0x" + Integer.toHexString(i));
            } 
            try {
              byte[] arrayOfByte3 = new byte[arrayOfByte2.length + (c.h()).length];
              System.arraycopy(arrayOfByte2, 0, arrayOfByte3, 0, arrayOfByte2.length);
              byte[] arrayOfByte4 = c.h();
              System.arraycopy(arrayOfByte4, 0, arrayOfByte3, arrayOfByte2.length, arrayOfByte4.length);
              arrayOfByte2 = arrayOfByte3;
              b1++;
              arrayOfByte1 = new byte[0];
            } catch (a a) {
              D.c("SizeMisMatch, marking bad.");
            } 
          } catch (c c2) {
            a(arrayList);
            return;
          } catch (e e1) {
            b1 = 0;
            if (arrayOfByte2.length > 0) {
              arrayOfByte1 = arrayOfByte2;
              arrayOfByte2 = new byte[0];
            } 
            byte[] arrayOfByte = e1.a();
            if (arrayOfByte != null && arrayOfByte.length > 0) {
              byte[] arrayOfByte3 = new byte[arrayOfByte.length + arrayOfByte1.length];
              System.arraycopy(arrayOfByte1, 0, arrayOfByte3, 0, arrayOfByte1.length);
              System.arraycopy(arrayOfByte, 0, arrayOfByte3, arrayOfByte1.length, arrayOfByte3.length);
              arrayOfByte1 = arrayOfByte3;
            } 
            if (arrayOfByte1.length > 1)
              arrayList.add(Byte.valueOf(arrayOfByte1[0])); 
          } 
        } while (b1 < 6 && b2++ < c1);
        if (b2 >= c1)
          throw new IOException("Failed to resync data stream after lost packet bytes."); 
        D.d("Resync'd. Lost Bytes: " + b2 + ", Good bytes added back: " + arrayOfByte2.length);
        a(arrayOfByte2, 0);
        this.f = i - 1;
        D.c("Reset counter to: 0x" + Integer.toHexString(this.f));
        try {
          c = a(c, false);
        } catch (c c2) {
          D.c("Error in resync data, there should be bytes in the pre-buffer.");
          return;
        } catch (e e1) {
          D.c("Error in resync data, pre-buffer should contain a valid message.");
          return;
        } 
      } catch (IOException iOException) {
        throw iOException;
      } catch (Exception exception) {
        D.a("Unhandled Exception reading message. Resync? " + exception.getLocalizedMessage());
        exception.printStackTrace();
        a(20, 0);
        return;
      } 
      if (!c.d()) {
        if (this.t != null)
          this.t.m(); 
        if (c.b() instanceof l) {
          D.b("Message failed CrC! " + c.b());
          b(50, "CRC Failure");
        } else {
          D.b("DTO Message failed CrC! Ignoring.");
        } 
      } else if (!c.j() && c.b() instanceof l) {
        D.a("Unexpected counter on CTO Response Message! Setting status to error.");
        ((l)c.b()).a(254);
        a(c.b());
      } else {
        a(c.b());
      } 
    } else {
      D.b("Unsupported Transport!!!! Ignoring all incoming messages.");
    } 
  }
  
  public void a(int paramInt) {
    if (this.e != null)
      this.e.a = false; 
    this.j = paramInt;
    if (paramInt == h) {
      this.k = ": Slave RX:\n";
    } else if (paramInt == i) {
      this.k = ": Master RX:\n";
      try {
        this.l = (this.a.available() > 0);
      } catch (IOException iOException) {
        Logger.getLogger(p.class.getName()).log(Level.INFO, "input.available() problem", iOException);
        this.l = true;
      } 
    } else {
      this.k = ": RX:\n";
    } 
    long l = System.currentTimeMillis();
    this.e = new q(this);
    this.e.start();
    synchronized (this.o) {
      while (this.l) {
        try {
          this.o.wait(100L);
        } catch (InterruptedException interruptedException) {
          Logger.getLogger(p.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
        } 
      } 
    } 
    D.c("Cleared Orphans: " + (System.currentTimeMillis() - l));
  }
  
  private void a(int paramInt1, int paramInt2) {
    try {
      Thread.sleep(paramInt1, paramInt2);
    } catch (InterruptedException interruptedException) {
      Logger.getLogger(p.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
    } 
  }
  
  private void b(int paramInt, String paramString) {
    a(paramInt, paramString);
  }
  
  public void c() {
    if (this.e != null)
      this.e.a = false; 
  }
  
  private void a(List paramList) {
    if (paramList.size() > 0) {
      D.c("Unexpected data received, byte count " + paramList.size() + ":");
      byte[] arrayOfByte = c.a((Byte[])paramList.toArray((Object[])new Byte[paramList.size()]));
      System.out.println(k.v() + ":" + c.d(arrayOfByte));
    } 
  }
  
  public void a(j paramj) {
    this.t = paramj;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bN/p.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */