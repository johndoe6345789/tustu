package business.binary_transformers;

import java.util.ArrayList;
import java.util.List;

class BtInterfaceBv extends Thread {
  boolean a = true;

  long b = 250L;

  final List c = new ArrayList();

  bV(bU parambU) {
    super("ValThrottle 1D");
    setDaemon(true);
  }

  public void run() {
    try {
      while (this.a) {
        this.a = false;
        Thread.sleep(this.b);
      }
      this.d.g = null;
      for (String str : this.c) this.d.a(str);
    } catch (InterruptedException interruptedException) {
      interruptedException.printStackTrace();
    }
  }

  private void a(String paramString) {
    if (!this.c.contains(paramString)) this.c.add(paramString);
    a();
  }

  private void a() {
    this.a = true;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/bV.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
