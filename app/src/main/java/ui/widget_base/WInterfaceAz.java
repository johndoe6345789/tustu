package W;

public class WInterfaceAz {
  static byte a = 64;

  static byte b = 2;

  public static byte[] a(byte[] paramArrayOfbyte) {
    for (byte b = 0; b < paramArrayOfbyte.length; b++) {
      if ((paramArrayOfbyte[b] & a) == a) {
        paramArrayOfbyte[b] = (byte) (paramArrayOfbyte[b] - a);
      } else {
        paramArrayOfbyte[b] = (byte) (paramArrayOfbyte[b] + a);
      }
      if ((paramArrayOfbyte[b] & b) == b) {
        paramArrayOfbyte[b] = (byte) (paramArrayOfbyte[b] - b);
      } else {
        paramArrayOfbyte[b] = (byte) (paramArrayOfbyte[b] + b);
      }
    }
    return paramArrayOfbyte;
  }

  public static int a(int paramInt) {
    if ((paramInt & a) == a) {
      paramInt -= a;
    } else {
      paramInt += a;
    }
    if ((paramInt & b) == b) {
      paramInt = (byte) (paramInt - b);
    } else {
      paramInt = (byte) (paramInt + b);
    }
    return paramInt;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/W/az.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
