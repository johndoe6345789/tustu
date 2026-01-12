package W;

import bH.D;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class FlushableBufferedOutputStream extends BufferedOutputStream {
  FileOutputStream a;

  public FlushableBufferedOutputStream(FileOutputStream paramFileOutputStream) {
    super(paramFileOutputStream);
    this.a = paramFileOutputStream;
  }

  public void close() {
    try {
      this.a.flush();
    } catch (Exception exception) {
    }
    try {
      this.a.close();
      D.d("FileOutputStream Closed.");
    } catch (Exception exception) {
    }
    super.close();
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/W/e.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
