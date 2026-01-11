package business.bit_array_utils;

public class g {
  int a = 65535;
  
  final int b = 4129;
  
  public void a(byte[] paramArrayOfbyte) {
    for (byte b : paramArrayOfbyte) {
      for (byte b1 = 0; b1 < 8; b1++) {
        boolean bool1 = ((b >> 7 - b1 & 0x1) == 1) ? true : false;
        boolean bool2 = ((this.a >> 15 & 0x1) == 1) ? true : false;
        this.a <<= 1;
        if ((bool2 ^ bool1) != 0)
          this.a ^= 0x1021; 
      } 
    } 
  }
  
  public void a() {
    this.a = 65535;
  }
  
  public int b() {
    return this.a & 0xFFFF;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bH/g.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */