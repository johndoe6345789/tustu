package aZ;

import bH.c;

public class AzInterfaceIndia {
  private String d = "";
  
  private String e = "";
  
  private double f = 1.0D;
  
  private float g = 0.0F;
  
  private int h = 0;
  
  public static byte a = 3;
  
  public static byte b = 4;
  
  public static byte c = 5;
  
  private int i = b;
  
  public void a(int[] paramArrayOfint) {
    int[] arrayOfInt1 = new int[15];
    byte b = 0;
    System.arraycopy(paramArrayOfint, b, arrayOfInt1, 0, arrayOfInt1.length);
    b += true;
    this.d = b(arrayOfInt1);
    int[] arrayOfInt2 = new int[6];
    System.arraycopy(paramArrayOfint, b, arrayOfInt2, 0, arrayOfInt2.length);
    b += true;
    this.e = b(arrayOfInt2);
    this.i = paramArrayOfint[b++];
    int[] arrayOfInt3 = new int[4];
    System.arraycopy(paramArrayOfint, b, arrayOfInt3, 0, arrayOfInt3.length);
    b += 4;
    byte[] arrayOfByte1 = c.a(arrayOfInt3);
    int j = arrayOfByte1[0] << 24 | (arrayOfByte1[1] & 0xFF) << 16 | (arrayOfByte1[2] & 0xFF) << 8 | arrayOfByte1[3] & 0xFF;
    this.f = Float.intBitsToFloat(j);
    int[] arrayOfInt4 = new int[4];
    System.arraycopy(paramArrayOfint, b, arrayOfInt4, 0, arrayOfInt4.length);
    b += 4;
    byte[] arrayOfByte2 = c.a(arrayOfInt4);
    j = arrayOfByte2[0] << 24 | (arrayOfByte2[1] & 0xFF) << 16 | (arrayOfByte2[2] & 0xFF) << 8 | arrayOfByte2[3] & 0xFF;
    this.g = Float.intBitsToFloat(j);
    this.h = paramArrayOfint[b];
  }
  
  public double a(byte[] paramArrayOfbyte) {
    if (paramArrayOfbyte == null || (paramArrayOfbyte.length != 4 && paramArrayOfbyte.length != 8))
      throw new h("Expected 4 bytes, found: " + ((paramArrayOfbyte == null) ? "0" : Integer.valueOf(paramArrayOfbyte.length))); 
    if (this.i == c) {
      long l = (0xFF & paramArrayOfbyte[0]) << 56L | (0xFF & paramArrayOfbyte[1]) << 48L | (0xFF & paramArrayOfbyte[2]) << 40L | (0xFF & paramArrayOfbyte[3]) << 32L | (0xFF & paramArrayOfbyte[4]) << 24L | (0xFF & paramArrayOfbyte[5]) << 16L | (0xFF & paramArrayOfbyte[6]) << 8L | (0xFF & paramArrayOfbyte[7]);
      return (l + this.g) * this.f;
    } 
    int j = paramArrayOfbyte[0] << 24 | (paramArrayOfbyte[1] & 0xFF) << 16 | (paramArrayOfbyte[2] & 0xFF) << 8 | paramArrayOfbyte[3] & 0xFF;
    return (j + this.g) * this.f;
  }
  
  private String b(int[] paramArrayOfint) {
    byte[] arrayOfByte = c.a(paramArrayOfint);
    arrayOfByte = c.c(arrayOfByte);
    return new String(arrayOfByte);
  }
  
  public String a() {
    return this.d;
  }
  
  public String b() {
    return this.e;
  }
  
  public int c() {
    return this.h;
  }
  
  public int d() {
    return this.i;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aZ/i.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */