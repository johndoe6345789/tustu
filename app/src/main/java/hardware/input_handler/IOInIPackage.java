package hardware.input_handler;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import r.ThreadedFile;

public class IOInIPackage {
  private static i a = null;

  public static i a() {
    if (a == null) a = new i();
    return a;
  }

  public synchronized boolean a(String paramString1, String paramString2) {
    g.a().a(true);
    try {
      return b(paramString1, paramString2);
    } finally {
      g.a().a(false);
    }
  }

  private synchronized boolean b(String paramString1, String paramString2) {
    File file = new File(ThreadedFile.z(), "MLV.pipe");
    if (file.exists()) {
      String str = paramString1 + "=" + paramString2;
      FileOutputStream fileOutputStream = null;
      long l = -1L;
      try {
        fileOutputStream = new FileOutputStream(file);
        fileOutputStream.write(str.getBytes());
      } catch (FileNotFoundException fileNotFoundException) {
        Logger.getLogger(i.class.getName())
            .log(
                Level.WARNING,
                "MLV Pipe File not found, but it was there..",
                fileNotFoundException);
        return false;
      } catch (IOException iOException) {
        Logger.getLogger(i.class.getName())
            .log(Level.WARNING, "Unable to write to MLV Pipe File", iOException);
        return false;
      } finally {
        if (fileOutputStream != null)
          try {
            fileOutputStream.close();
            l = file.lastModified();
          } catch (Exception exception) {
          }
      }
      if (l > 0L) {
        long l1 = System.currentTimeMillis() + g.a + 10L;
        do {
          try {
            Thread.sleep(50L);
          } catch (InterruptedException interruptedException) {
            Logger.getLogger(i.class.getName())
                .log(Level.SEVERE, (String) null, interruptedException);
          }
        } while (file.exists() && l == file.lastModified() && System.currentTimeMillis() < l1);
        if (file.exists() && l == file.lastModified()) {
          file.delete();
          return false;
        }
        return true;
      }
      return false;
    }
    return false;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/i/i.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
