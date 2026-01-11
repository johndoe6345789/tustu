package aK;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class IOInAkPackage {
  InputStream a;
  
  List b = new ArrayList();
  
  public IOInAkPackage(InputStream paramInputStream) {
    this.a = paramInputStream;
  }
  
  public String a() {
    if (this.b.isEmpty())
      b(); 
    return this.b.remove(0);
  }
  
  private void b() {
    StringBuilder stringBuilder = new StringBuilder();
    boolean bool = false;
    long l = System.currentTimeMillis() + 10000L;
    while (true) {
      int i = this.a.read();
      if (i >= 0) {
        char c = (char)i;
        if (c == '\n') {
          bool = true;
        } else if (c != '\r') {
          stringBuilder.append(c);
          l = System.currentTimeMillis() + 10000L;
        } 
      } else {
        try {
          Thread.sleep(20L);
        } catch (InterruptedException interruptedException) {
          Logger.getLogger(h.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
        } 
      } 
      if (System.currentTimeMillis() > l)
        throw new IOException("Timeout reading NEMA line."); 
      if (bool) {
        this.b.add(stringBuilder.toString());
        return;
      } 
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aK/h.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */