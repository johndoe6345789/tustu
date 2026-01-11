package J;

import G.GInterfaceCv;
import G.f;
import java.io.Serializable;

public class ChecksumEncoder implements GInterfaceCv, Serializable {
  f a = new f();
  
  public byte[] a(byte[] paramArrayOfbyte) {
    if (paramArrayOfbyte.length == 1)
      return paramArrayOfbyte; 
    int i = 0;
    for (byte b1 = 0; b1 < paramArrayOfbyte.length; b1++)
      i += paramArrayOfbyte[b1]; 
    i &= 0xFF;
    byte[] arrayOfByte = this.a.a(paramArrayOfbyte.length + 1);
    System.arraycopy(paramArrayOfbyte, 0, arrayOfByte, 0, paramArrayOfbyte.length);
    arrayOfByte[arrayOfByte.length - 1] = (byte)i;
    return arrayOfByte;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/J/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */