package ac;

public abstract class s {
  public static byte a = 0;
  
  public static byte b = 1;
  
  public static byte c = 2;
  
  public static byte d = 3;
  
  public static byte e = 4;
  
  public static byte f = 5;
  
  public static byte g = 6;
  
  public static byte h = 7;
  
  protected byte[] i = new byte[15];
  
  private byte[] j = new byte[6];
  
  private byte k = f;
  
  private byte[] l = new byte[4];
  
  private byte[] m = new byte[4];
  
  private byte n = 0;
  
  private float o = 1.0F;
  
  private float p = 0.0F;
  
  public void a(String paramString) {
    a(paramString, this.i);
  }
  
  public byte[] d() {
    return this.i;
  }
  
  public void b(String paramString) {
    a(paramString, this.j);
  }
  
  public byte[] e() {
    return this.j;
  }
  
  public void a(byte paramByte) {
    this.k = paramByte;
  }
  
  public byte f() {
    return this.k;
  }
  
  public void a(float paramFloat) {
    this.o = paramFloat;
    this.l = a(paramFloat, this.l);
  }
  
  public double g() {
    return this.o;
  }
  
  public void b(float paramFloat) {
    this.p = paramFloat;
    this.m = a(paramFloat, this.m);
  }
  
  public double h() {
    return this.p;
  }
  
  public void b(byte paramByte) {
    this.n = paramByte;
  }
  
  public byte i() {
    return this.n;
  }
  
  private byte[] a(byte[] paramArrayOfbyte) {
    for (byte b = 0; b < paramArrayOfbyte.length; b++)
      paramArrayOfbyte[b] = 0; 
    return paramArrayOfbyte;
  }
  
  private byte[] a(String paramString, byte[] paramArrayOfbyte) {
    paramArrayOfbyte = a(paramArrayOfbyte);
    for (byte b = 0; b < paramArrayOfbyte.length && b < paramString.length(); b++)
      paramArrayOfbyte[b] = (byte)paramString.charAt(b); 
    return paramArrayOfbyte;
  }
  
  private byte[] a(float paramFloat, byte[] paramArrayOfbyte) {
    int i = Float.floatToIntBits(paramFloat);
    return a(i, paramArrayOfbyte, true);
  }
  
  public static byte[] a(int paramInt, byte[] paramArrayOfbyte, boolean paramBoolean) {
    int i = 2147483392;
    boolean bool = false;
    if (paramInt < 0) {
      paramInt = (paramInt ^ 0xFFFFFFFF) + 0;
      bool = true;
    } 
    for (byte b = 0; b < paramArrayOfbyte.length; b++) {
      if (paramBoolean) {
        paramArrayOfbyte[paramArrayOfbyte.length - b - 1] = (byte)(paramInt & (i ^ 0xFFFFFFFF));
        if (bool)
          paramArrayOfbyte[paramArrayOfbyte.length - b - 1] = (byte)(255 - paramArrayOfbyte[paramArrayOfbyte.length - b - 1]); 
      } else {
        paramArrayOfbyte[b] = (byte)(paramInt & (i ^ 0xFFFFFFFF));
        if (bool)
          paramArrayOfbyte[b] = (byte)(255 - paramArrayOfbyte[b]); 
      } 
      paramInt >>= 8;
    } 
    return paramArrayOfbyte;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ac/s.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */