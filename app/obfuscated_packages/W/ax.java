package W;

import java.io.File;
import java.io.FileInputStream;

public class ax extends FileInputStream {
  public ax(File paramFile) {
    super(paramFile);
  }
  
  public int read(byte[] paramArrayOfbyte) {
    int i = read(paramArrayOfbyte);
    a(paramArrayOfbyte);
    return i;
  }
  
  public int read(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    int i = super.read(paramArrayOfbyte, paramInt1, paramInt2);
    a(paramArrayOfbyte);
    return i;
  }
  
  public int read() {
    int i = super.read();
    az.a(i);
    return i;
  }
  
  private byte[] a(byte[] paramArrayOfbyte) {
    return az.a(paramArrayOfbyte);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/W/ax.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */