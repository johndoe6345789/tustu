package W;

import java.io.File;
import java.io.FileOutputStream;

public class FileOutputStreamExtension extends FileOutputStream {
  public FileOutputStreamExtension(File paramFile) {
    super(paramFile);
  }
  
  public void write(int paramInt) {
    paramInt = az.a(paramInt);
    super.write(paramInt);
  }
  
  public void write(byte[] paramArrayOfbyte) {
    az.a(paramArrayOfbyte);
    super.write(paramArrayOfbyte);
  }
  
  public void write(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    az.a(paramArrayOfbyte);
    super.write(paramArrayOfbyte, paramInt1, paramInt2);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/W/ay.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */