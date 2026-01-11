package ae;

import A.IO;
import A.AInterfaceGolf;
import G.J;
import G.AeInterfaceMikeTostring;
import G.GInterfaceCr;
import G.GInterfaceCv;
import G.IO;
import bH.X;
import bH.c;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class IOInAePackage implements AInterfaceGolf {
  private IO d = null;
  
  private AeInterfaceMikeTostring e = null;
  
  q a = null;
  
  IO b = new IO();
  
  long c = System.currentTimeMillis();
  
  public byte[] a(byte[] paramArrayOfbyte, int paramInt) {
    paramArrayOfbyte = a(paramArrayOfbyte);
    paramInt = (b() == null) ? paramInt : (paramInt + b().a());
    byte[] arrayOfByte = b(paramArrayOfbyte, paramInt);
    if (arrayOfByte != null && arrayOfByte.length > 0)
      arrayOfByte = a(paramArrayOfbyte, arrayOfByte); 
    return arrayOfByte;
  }
  
  public byte[] b(byte[] paramArrayOfbyte, int paramInt) {
    return a(paramArrayOfbyte, paramInt, 250);
  }
  
  public byte[] a(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    byte[] arrayOfByte = (paramInt1 > 0) ? this.b.b(paramInt1) : this.b.b(1024);
    paramInt2 += a().o();
    byte b = 0;
    long l = 0L;
    InputStream inputStream = a().i();
    if (inputStream.available() > 0) {
      StringBuffer stringBuffer = new StringBuffer();
      stringBuffer.append("Purging orphan bytes:\n");
      while (inputStream.available() > 0)
        stringBuffer.append("0x").append(Integer.toString(inputStream.read(), 16).toUpperCase()).append(" "); 
      a(stringBuffer.toString());
    } 
    if (J.I())
      a("TX", paramArrayOfbyte); 
    boolean bool = true;
    if (bool) {
      a().j().write(paramArrayOfbyte);
      a().j().flush();
    } else {
      OutputStream outputStream = a().j();
      for (byte b1 = 0; b1 < paramArrayOfbyte.length; b1++) {
        outputStream.write(paramArrayOfbyte[b1]);
        a(2);
        outputStream.flush();
      } 
    } 
    if (paramInt1 > 0)
      a(1); 
    l = System.currentTimeMillis();
    while (b < paramInt1) {
      if (inputStream.available() > 0) {
        arrayOfByte[b++] = (byte)inputStream.read();
      } else {
        try {
          Thread.sleep(3L);
        } catch (InterruptedException interruptedException) {
          Logger.getLogger(p.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
        } 
      } 
      long l1 = System.currentTimeMillis() - l;
      if (l1 > paramInt2 && b < paramInt1) {
        a("READ Timout after " + l1 + "ms. Bytes Read:" + b + " bytes, Expected:" + paramInt1 + " Raw buffer:\n" + c.d(arrayOfByte));
        if (b > 0) {
          byte[] arrayOfByte1 = this.b.b(b);
          System.arraycopy(arrayOfByte1, 0, arrayOfByte, 0, arrayOfByte1.length);
          arrayOfByte = arrayOfByte1;
          break;
        } 
        arrayOfByte = new byte[0];
        break;
      } 
    } 
    if (b > 0 && arrayOfByte.length != b) {
      byte[] arrayOfByte1 = new byte[b];
      System.arraycopy(arrayOfByte, 0, arrayOfByte1, 0, arrayOfByte1.length);
      arrayOfByte = arrayOfByte1;
    } else if (b == 0) {
      arrayOfByte = new byte[0];
    } 
    if (J.I() && paramInt1 > 0)
      a("RX", arrayOfByte); 
    return arrayOfByte;
  }
  
  private byte[] a(byte[] paramArrayOfbyte) {
    if (this.a.b(this.e) == null)
      return paramArrayOfbyte; 
    GInterfaceCv GInterfaceCv = this.a.b(this.e);
    return GInterfaceCv.a(paramArrayOfbyte);
  }
  
  private void a(String paramString, byte[] paramArrayOfbyte) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(paramString).append(": ");
    for (byte b : paramArrayOfbyte)
      stringBuilder.append(X.a(Integer.toHexString(0xFF & b), '0', 2)).append(" "); 
    System.out.println(stringBuilder.toString());
  }
  
  private void a(String paramString) {
    double d = (System.currentTimeMillis() - this.c) / 1000.0D;
    System.out.println("Time: " + d + ", " + paramString);
  }
  
  private byte[] a(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    if (this.a.a(this.e) == null)
      return paramArrayOfbyte2; 
    GInterfaceCr GInterfaceCr = this.a.a(this.e);
    if (GInterfaceCr.a(paramArrayOfbyte1, paramArrayOfbyte2))
      return GInterfaceCr.a(paramArrayOfbyte2); 
    String str = GInterfaceCr.c();
    v v = new v(str);
    v.a(GInterfaceCr.b(GInterfaceCr.d(paramArrayOfbyte2)));
    throw v;
  }
  
  private GInterfaceCr b() {
    return (this.a.a(this.e) == null) ? null : this.a.a(this.e);
  }
  
  public IO a() {
    return this.d;
  }
  
  public void a(IO paramf) {
    this.d = paramf;
  }
  
  public void a(q paramq) {
    this.a = paramq;
  }
  
  private void a(int paramInt) {
    try {
      Thread.sleep(paramInt);
    } catch (InterruptedException interruptedException) {
      Logger.getLogger(p.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ae/p.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */