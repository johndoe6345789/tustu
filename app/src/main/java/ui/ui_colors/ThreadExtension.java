package A;

import java.util.List;

class ThreadExtension extends Thread {
  List a;

  ThreadExtension(j paramj, List paramList) {
    super("DeviceSearch");
    this.a = paramList;
    setDaemon(true);
  }

  public void run() {
    j.a(this.b, this.a);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/A/k.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
