package business.batch_importers.bI_components;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FilterInputStreamExtension extends FilterInputStream {
  private boolean a;
  
  private int b;
  
  private byte[] c;
  
  private int d;
  
  private int e;
  
  private int f;
  
  private boolean g;
  
  private int h;
  
  private byte[] i;
  
  public FilterInputStreamExtension(InputStream paramInputStream, int paramInt) {
    super(paramInputStream);
    this.h = paramInt;
    this.g = ((paramInt & 0x8) > 0);
    this.a = ((paramInt & 0x1) > 0);
    this.d = this.a ? 4 : 3;
    this.c = new byte[this.d];
    this.b = -1;
    this.f = 0;
    this.i = a.a(paramInt);
  }
  
  public int read() {
    if (this.b < 0)
      if (this.a) {
        byte[] arrayOfByte = new byte[3];
        byte b1 = 0;
        byte b2 = 0;
        while (b2 < 3) {
          int i = this.in.read();
          if (i >= 0) {
            arrayOfByte[b2] = (byte)i;
            b1++;
            b2++;
          } 
        } 
        if (b1 > 0) {
          a.a(arrayOfByte, 0, b1, this.c, 0, this.h);
          this.b = 0;
          this.e = 4;
        } else {
          return -1;
        } 
      } else {
        byte[] arrayOfByte = new byte[4];
        byte b1 = 0;
        for (b1 = 0; b1 < 4; b1++) {
          int i = 0;
          do {
            i = this.in.read();
          } while (i >= 0 && this.i[i & 0x7F] <= -5);
          if (i < 0)
            break; 
          arrayOfByte[b1] = (byte)i;
        } 
        if (b1 == 4) {
          this.e = a.a(arrayOfByte, 0, this.c, 0, this.h);
          this.b = 0;
        } else {
          if (b1 == 0)
            return -1; 
          throw new IOException("Improperly padded Base64 input.");
        } 
      }  
    if (this.b >= 0) {
      if (this.b >= this.e)
        return -1; 
      if (this.a && this.g && this.f >= 76) {
        this.f = 0;
        return 10;
      } 
      this.f++;
      byte b1 = this.c[this.b++];
      if (this.b >= this.d)
        this.b = -1; 
      return b1 & 0xFF;
    } 
    throw new IOException("Error in Base64 code reading stream.");
  }
  
  public int read(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    byte b1;
    for (b1 = 0; b1 < paramInt2; b1++) {
      int i = read();
      if (i >= 0) {
        paramArrayOfbyte[paramInt1 + b1] = (byte)i;
      } else {
        if (b1 == 0)
          return -1; 
        break;
      } 
    } 
    return b1;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bI/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */