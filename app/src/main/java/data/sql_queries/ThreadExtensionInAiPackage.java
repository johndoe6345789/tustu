package aI;

import bH.D;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

class ThreadExtensionInAiPackage extends Thread {
  h a;

  int b;

  int c;

  long d;

  public void g(e parame, h paramh, int paramInt1, int paramInt2, long paramLong) {
    super("ratioEntry");
    setDaemon(true);
    this.a = paramh;
    this.b = paramInt1;
    this.c = paramInt2;
    this.d = paramLong;
  }

  void a() {
    try {
      int i = this.a.b();
      this.e.c += this.c;
      int j = i - this.e.d;
      float f1 = i / this.e.c;
      float f2 = j / this.c;
      if (e.a(this.e)) {
        D.c(
            "Read Dir Block: "
                + this.b
                + ", compressed size:"
                + this.c
                + "bytes, uncompressed size "
                + j
                + "bytes, Compression Ratio: "
                + f2
                + ", Overall Compression Ratio:"
                + f1);
      } else {
        D.c("Read Dir Block: " + this.b + ", data read: " + j + "bytes");
      }
      if (this.e.b != null) this.e.b.a(i, this.d);
      this.e.d = i;
    } catch (IOException iOException) {
      Logger.getLogger(e.class.getName()).log(Level.SEVERE, (String) null, iOException);
    }
  }

  public void run() {
    try {
      Thread.sleep(20L);
    } catch (InterruptedException interruptedException) {
      Logger.getLogger(e.class.getName()).log(Level.SEVERE, (String) null, interruptedException);
    }
    a();
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aI/g.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
