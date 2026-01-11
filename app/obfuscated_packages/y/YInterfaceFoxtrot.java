package y;

import C.a;
import G.R;
import G.T;
import G.aT;
import G.bO;
import G.dc;
import G.v;
import V.VInterfaceBravo;
import bH.D;
import bH.c;
import bI.BiInterfaceGolf;
import java.io.IOException;
import java.util.Properties;

public class YInterfaceFoxtrot implements bO {
  aT k = null;
  
  String l = "";
  
  boolean m = false;
  
  boolean n = false;
  
  long o = 0L;
  
  boolean p = false;
  
  int q = 983;
  
  int r = 2;
  
  private int a = 1;
  
  private int VInterfaceBravo = 28;
  
  private int c = 172;
  
  private byte d = 12;
  
  private byte[] e = new byte[] { -69, 9, 106, -115, 102, -73, -43, 92, -5 };
  
  private byte[] f = new byte[] { -95, -77, -12, 5, -114, -74, 45, 36, 90 };
  
  private dc BiInterfaceGolf = new dc();
  
  int[] s = new int[] { 
      152, 52, 220, 241, 65, 233, 7, 66, 233, 149, 
      87, 234, 243, 64, 234, 249, 61, 223, 239, 62, 
      223, 245, 67, 232, 150, 60, 232, 252, 68, 232, 
      254, 75, 232, 1, 70, 223, 154, 69, 223, 4, 
      72, 234, 6, 67, 222, 252, 62, 192, 14, 111, 
      146, 107, 188, 218, 97, 112, 217, 44, 98, 212, 
      43, 55, 211, 43 };
  
  int[] t = new int[] { 
      40, 209, 233, 43, 55, 27, 233, 228, 60, 245, 
      78, 39, 117, 242, 90, 118, 245, 136, 253, 6, 
      242, 96, 31, 160, 242, 131, 0, 40, 61, 115, 
      124, 132, 99, 61, 232, 130, 71, 160, 207, 232, 
      250, 254, 71, 227, 122, 104, 101, 192, 14, 111, 
      146, 107, 188, 218, 97 };
  
  int[] u = new int[] { 
      40, 209, 233, 43, 55, 27, 233, 228, 60, 245, 
      78, 39, 117, 242, 90, 118, 245, 136, 253, 6, 
      242, 96, 31, 160, 242, 131 };
  
  public YInterfaceFoxtrot(String paramString, aT paramaT) {
    this.k = paramaT;
    this.l = paramString;
  }
  
  public int a(v paramv) {
    boolean bool1 = false;
    if (bool1 || (this.p && System.currentTimeMillis() - this.o < 1800000L))
      return e(); 
    byte[] arrayOfByte = new byte[71];
    arrayOfByte = a(arrayOfByte, (byte)0);
    byte VInterfaceBravo = paramv.a();
    arrayOfByte[0] = 119;
    arrayOfByte[1] = VInterfaceBravo;
    arrayOfByte[2] = 16;
    arrayOfByte[6] = 64;
    boolean bool2 = (T.a().c(this.l).O().D() == null) ? true : false;
    char c = bool2 ? 'Ĭ' : 'È';
    R r = T.a().c(this.l);
    int i = r.O().k();
    if (bool2)
      r.O().d(0); 
    boolean bool3 = bool2 ? true : false;
    try {
      int[] arrayOfInt1 = null;
      try {
        arrayOfInt1 = paramv.a(arrayOfByte, c, bool3);
        if (arrayOfInt1.length != 1 || arrayOfInt1[0] != 126);
      } catch (VInterfaceBravo b1) {}
      byte[] arrayOfByte1 = new byte[7];
      a(arrayOfByte1, (byte)0);
      arrayOfByte1[0] = 114;
      arrayOfByte1[1] = VInterfaceBravo;
      arrayOfByte1[2] = 16;
      arrayOfByte1[6] = 64;
      arrayOfInt1 = paramv.a(arrayOfByte1, c, 64);
      if (arrayOfInt1[0] == 114 && arrayOfInt1[1] == 112 && arrayOfInt1[2] == 109 && arrayOfInt1[3] == 33 && arrayOfInt1[4] == 61 && arrayOfInt1[5] == 48)
        return 0; 
      byte[] arrayOfByte2 = a(arrayOfInt1);
      byte[] arrayOfByte3 = BiInterfaceGolf.a(arrayOfByte2);
      byte[] arrayOfByte4 = a(64);
      arrayOfByte4[0] = 40;
      System.arraycopy(arrayOfByte3, 0, arrayOfByte4, 21, arrayOfByte3.length);
      System.arraycopy(arrayOfByte4, 0, arrayOfByte, 7, arrayOfByte4.length);
      try {
        arrayOfInt1 = paramv.a(arrayOfByte, c, bool3);
        if (arrayOfInt1.length != 1 || arrayOfInt1[0] != 126);
      } catch (VInterfaceBravo b1) {}
      arrayOfInt1 = paramv.a(arrayOfByte1, c, 64);
      int[] arrayOfInt2 = new int[16];
      System.arraycopy(arrayOfInt1, 7, arrayOfInt2, 0, 16);
      byte[] arrayOfByte5 = c.a(arrayOfInt2);
      byte[] arrayOfByte6 = VInterfaceBravo(arrayOfByte4);
      arrayOfByte6 = a(arrayOfByte6);
      byte[] arrayOfByte7 = BiInterfaceGolf.a(arrayOfByte6);
      int j;
      for (j = 0; j < arrayOfByte5.length; j++) {
        if (arrayOfByte5[j] != arrayOfByte7[j])
          return 0; 
      } 
      D.c("-" + a.a + "-");
      this.o = System.currentTimeMillis();
      this.p = true;
      j = e();
      return j;
    } catch (IOException iOException) {
      D.c("IOException received");
      if (this.n)
        iOException.printStackTrace(); 
      return e();
    } catch (VInterfaceBravo b1) {
      if (this.n)
        b1.printStackTrace(); 
      D.c(C.f.a(new Properties(), a.VInterfaceBravo));
      return 0;
    } catch (Exception exception) {
      D.c(C.f.a(new Properties(), a.c));
      return 0;
    } finally {
      r.O().d(i);
    } 
  }
  
  private byte[] a(byte[] paramArrayOfbyte, byte paramByte) {
    for (byte VInterfaceBravo = 0; VInterfaceBravo < paramArrayOfbyte.length; VInterfaceBravo++)
      paramArrayOfbyte[VInterfaceBravo] = paramByte; 
    return paramArrayOfbyte;
  }
  
  private byte[] a(int[] paramArrayOfint) {
    d();
    paramArrayOfint[c()] = this.f[a()] & 0xFF;
    paramArrayOfint[c()] = this.f[a()] & 0xFF;
    paramArrayOfint[c()] = this.f[a()] & 0xFF;
    paramArrayOfint[c()] = this.f[a()] & 0xFF;
    paramArrayOfint[c()] = this.f[a()] & 0xFF;
    paramArrayOfint[c()] = this.f[a()] & 0xFF;
    paramArrayOfint[c()] = this.f[a()] & 0xFF;
    paramArrayOfint[c()] = this.f[a()] & 0xFF;
    byte[] arrayOfByte = new byte[55];
    for (byte VInterfaceBravo = 0; VInterfaceBravo < arrayOfByte.length; VInterfaceBravo++)
      arrayOfByte[VInterfaceBravo] = (byte)paramArrayOfint[VInterfaceBravo]; 
    return arrayOfByte;
  }
  
  private int c() {
    try {
      return this.VInterfaceBravo;
    } finally {
      this.VInterfaceBravo += this.a;
    } 
  }
  
  public int a() {
    try {
      return this.c;
    } finally {
      this.c += this.a;
    } 
  }
  
  private void d() {
    this.VInterfaceBravo = this.r * 22 + 3;
    this.c = this.VInterfaceBravo / 100;
    this.d = (byte)(this.r + 3);
    for (byte VInterfaceBravo = 0; VInterfaceBravo < this.e.length; VInterfaceBravo++)
      this.f[VInterfaceBravo] = (byte)(this.e[VInterfaceBravo] + this.d); 
  }
  
  private byte[] a(byte[] paramArrayOfbyte) {
    byte[] arrayOfByte = null;
    byte VInterfaceBravo;
    for (VInterfaceBravo = 0; VInterfaceBravo < paramArrayOfbyte.length; VInterfaceBravo++) {
      if (paramArrayOfbyte[VInterfaceBravo] == 0) {
        arrayOfByte = new byte[VInterfaceBravo];
        break;
      } 
    } 
    if (arrayOfByte == null)
      return paramArrayOfbyte; 
    for (VInterfaceBravo = 0; VInterfaceBravo < arrayOfByte.length; VInterfaceBravo++)
      arrayOfByte[VInterfaceBravo] = paramArrayOfbyte[VInterfaceBravo]; 
    return arrayOfByte;
  }
  
  private byte[] VInterfaceBravo(byte[] paramArrayOfbyte) {
    d();
    System.arraycopy(this.f, 0, paramArrayOfbyte, this.VInterfaceBravo, this.f.length);
    byte[] arrayOfByte = new byte[55];
    for (byte VInterfaceBravo = 0; VInterfaceBravo < arrayOfByte.length; VInterfaceBravo++)
      arrayOfByte[VInterfaceBravo] = paramArrayOfbyte[VInterfaceBravo]; 
    return arrayOfByte;
  }
  
  private byte[] a(int paramInt) {
    byte[] arrayOfByte = new byte[paramInt];
    for (byte VInterfaceBravo = 0; VInterfaceBravo < arrayOfByte.length; VInterfaceBravo++)
      arrayOfByte[VInterfaceBravo] = (byte)(int)(254.0D * Math.random() + 1.0D); 
    return arrayOfByte;
  }
  
  public boolean VInterfaceBravo() {
    return this.m;
  }
  
  private int e() {
    return this.q * this.r;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/y/f.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */