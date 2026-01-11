package bI;

public class BiInterfaceGolf {
  private static final int[] a = new int[] { 
      7, 12, 17, 22, 5, 9, 14, 20, 4, 11, 
      16, 23, 6, 10, 15, 21 };
  
  private static final int[] b = new int[64];
  
  public static byte[] a(byte[] paramArrayOfbyte) {
    int i = paramArrayOfbyte.length;
    int j = (i + 8 >>> 6) + 1;
    int k = j << 6;
    byte[] arrayOfByte1 = new byte[k - i];
    arrayOfByte1[0] = Byte.MIN_VALUE;
    long l = i << 3L;
    int m;
    for (m = 0; m < 8; m++) {
      arrayOfByte1[arrayOfByte1.length - 8 + m] = (byte)(int)l;
      l >>>= 8L;
    } 
    m = 1732584193;
    int n = -271733879;
    int i1 = -1732584194;
    int i2 = 271733878;
    int[] arrayOfInt = new int[16];
    for (byte b1 = 0; b1 < j; b1++) {
      int i3 = b1 << 6;
      int i4 = 0;
      while (i4 < 64) {
        arrayOfInt[i4 >>> 2] = ((i3 < i) ? paramArrayOfbyte[i3] : arrayOfByte1[i3 - i]) << 24 | arrayOfInt[i4 >>> 2] >>> 8;
        i4++;
        i3++;
      } 
      i4 = m;
      int i5 = n;
      int i6 = i1;
      int i7 = i2;
      for (byte b = 0; b < 64; b++) {
        int i8 = b >>> 4;
        int i9 = 0;
        int i10 = b;
        switch (i8) {
          case 0:
            i9 = n & i1 | (n ^ 0xFFFFFFFF) & i2;
            break;
          case 1:
            i9 = n & i2 | i1 & (i2 ^ 0xFFFFFFFF);
            i10 = i10 * 5 + 1 & 0xF;
            break;
          case 2:
            i9 = n ^ i1 ^ i2;
            i10 = i10 * 3 + 5 & 0xF;
            break;
          case 3:
            i9 = i1 ^ (n | i2 ^ 0xFFFFFFFF);
            i10 = i10 * 7 & 0xF;
            break;
        } 
        int i11 = n + Integer.rotateLeft(m + i9 + arrayOfInt[i10] + b[b], a[i8 << 2 | b & 0x3]);
        m = i2;
        i2 = i1;
        i1 = n;
        n = i11;
      } 
      m += i4;
      n += i5;
      i1 += i6;
      i2 += i7;
    } 
    byte[] arrayOfByte2 = new byte[16];
    byte b2 = 0;
    for (byte b3 = 0; b3 < 4; b3++) {
      int i3 = (b3 == 0) ? m : ((b3 == 1) ? n : ((b3 == 2) ? i1 : i2));
      for (byte b = 0; b < 4; b++) {
        arrayOfByte2[b2++] = (byte)i3;
        i3 >>>= 8;
      } 
    } 
    return arrayOfByte2;
  }
  
  static {
    for (byte b = 0; b < 64; b++)
      b[b] = (int)(long)(4.294967296E9D * Math.abs(Math.sin((b + 1)))); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bI/g.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */