package W;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class CompressingOutputStream extends OutputStream {
  OutputStream a;
  
  private String d = "";
  
  ByteArrayOutputStream b = new ByteArrayOutputStream();
  
  boolean c = false;
  
  public CompressingOutputStream(OutputStream paramOutputStream) {
    this.a = paramOutputStream;
  }
  
  public void write(int paramInt) {
    if (this.c)
      throw new IOException("Can not write to after flushed. Please write all data then do 1 flush at end."); 
    this.b.write(paramInt);
  }
  
  public void write(byte[] paramArrayOfbyte) {
    if (this.c)
      throw new IOException("Can not write to after flushed. Please write all data then do 1 flush at end."); 
    this.b.write(paramArrayOfbyte);
  }
  
  public void write(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    if (this.c)
      throw new IOException("Can not write to after flushed. Please write all data then do 1 flush at end."); 
    this.b.write(paramArrayOfbyte, paramInt1, paramInt2);
  }
  
  public void flush() {
    if (!this.c) {
      ak ak = new ak();
      byte[] arrayOfByte = ak.a(this.b.toByteArray(), this.d);
      this.a.write(arrayOfByte);
      this.a.flush();
      this.c = true;
    } 
  }
  
  public void close() {
    flush();
    this.a.close();
  }
  
  public void a(String paramString) {
    this.d = paramString;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/W/y.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */