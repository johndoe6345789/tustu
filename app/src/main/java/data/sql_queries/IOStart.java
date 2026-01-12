package aI;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

class IOStart extends Thread implements h {
  OutputStream a = null;

  int b = 0;

  IOStart(e parame, File paramFile) {
    super("UncompessedSdWriter");
    setDaemon(true);
    this.a = e.a(parame, paramFile);
  }

  public void a(byte[] paramArrayOfbyte) {
    this.b += paramArrayOfbyte.length;
    this.a.write(paramArrayOfbyte);
  }

  public void start() {}

  public void a() {
    try {
      this.a.close();
    } catch (IOException iOException) {
      Logger.getLogger(e.class.getName()).log(Level.SEVERE, (String) null, iOException);
    }
  }

  public int b() {
    return this.b;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aI/i.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
