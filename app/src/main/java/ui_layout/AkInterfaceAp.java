package ak;

import bH.c;

class AkInterfaceAp implements as {
  int a;
  
  int b;
  
  int c;
  
  public AkInterfaceAp(ao paramao, int paramInt1, int paramInt2, int paramInt3) {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = 1 << paramInt3;
  }
  
  public float a(byte[] paramArrayOfbyte) {
    int i = c.a(paramArrayOfbyte, this.a, this.b, true, true);
    return ((i & this.c) != 0) ? 1.0F : 0.0F;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ak/ap.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */