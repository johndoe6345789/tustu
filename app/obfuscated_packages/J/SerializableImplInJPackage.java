package J;

import G.cV;
import G.f;
import bH.c;
import bH.d;
import java.io.Serializable;

public class SerializableImplInJPackage implements cV, Serializable {
  f a = new f();
  
  d b = new d();
  
  public byte[] a(byte[] paramArrayOfbyte) {
    int i = paramArrayOfbyte.length;
    byte[] arrayOfByte1 = new byte[2];
    arrayOfByte1[0] = (byte)(i >> 8 & 0xFF);
    arrayOfByte1[1] = (byte)(i & 0xFF);
    this.b.reset();
    this.b.update(paramArrayOfbyte);
    byte[] arrayOfByte2 = this.a.a(4);
    arrayOfByte2 = c.a((int)this.b.getValue(), arrayOfByte2, true);
    byte[] arrayOfByte3 = this.a.a(arrayOfByte1.length + paramArrayOfbyte.length + arrayOfByte2.length);
    System.arraycopy(arrayOfByte1, 0, arrayOfByte3, 0, arrayOfByte1.length);
    System.arraycopy(paramArrayOfbyte, 0, arrayOfByte3, arrayOfByte1.length, paramArrayOfbyte.length);
    System.arraycopy(arrayOfByte2, 0, arrayOfByte3, arrayOfByte1.length + paramArrayOfbyte.length, arrayOfByte2.length);
    return arrayOfByte3;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/J/g.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */