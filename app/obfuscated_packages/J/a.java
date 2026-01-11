package J;

import G.cR;
import G.f;
import bH.D;
import bH.c;
import java.io.Serializable;

public class a implements cR, Serializable {
  f a = new f();
  
  int b = 2;
  
  int c = 1;
  
  int d = 1;
  
  i e = new i();
  
  public static int f = 1;
  
  public boolean a(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    if (!b(paramArrayOfbyte1, paramArrayOfbyte2)) {
      D.c("Invalid Header data recieved: " + c.d(paramArrayOfbyte2));
      return false;
    } 
    int j = 0;
    for (byte b = 0; b < paramArrayOfbyte2.length - 1; b++)
      j += paramArrayOfbyte2[b]; 
    return ((j & 0xFF) == c.a(paramArrayOfbyte2[paramArrayOfbyte2.length - 1]));
  }
  
  public boolean b(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    return (paramArrayOfbyte1 != null && paramArrayOfbyte1.length > 0) ? ((256 - c.a(paramArrayOfbyte1[0]) == c.a(paramArrayOfbyte2[0]))) : true;
  }
  
  public byte[] a(byte[] paramArrayOfbyte) {
    if (paramArrayOfbyte.length - this.b >= 0) {
      byte[] arrayOfByte = this.a.a(paramArrayOfbyte.length - this.b);
      System.arraycopy(paramArrayOfbyte, 1, arrayOfByte, 0, arrayOfByte.length);
      return arrayOfByte;
    } 
    D.c("Invalid envelope size. Minimum: " + this.b + ", actual: " + paramArrayOfbyte.length);
    return new byte[0];
  }
  
  public boolean b(byte[] paramArrayOfbyte) {
    return false;
  }
  
  public String c(byte[] paramArrayOfbyte) {
    return "";
  }
  
  public int d(byte[] paramArrayOfbyte) {
    return paramArrayOfbyte[0];
  }
  
  public int a() {
    return this.b;
  }
  
  public int b() {
    return this.c;
  }
  
  public String c() {
    return null;
  }
  
  public int a(byte[] paramArrayOfbyte, int paramInt) {
    return (paramInt >= 0) ? (paramInt + this.d) : -1;
  }
  
  public h d() {
    return this.e;
  }
  
  public boolean a(int paramInt) {
    return true;
  }
  
  public void e() {}
  
  public boolean b(int paramInt) {
    return false;
  }
  
  public boolean c(int paramInt) {
    return false;
  }
  
  public void a(boolean paramBoolean) {}
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/J/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */