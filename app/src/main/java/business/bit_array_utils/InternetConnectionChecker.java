package business.bit_array_utils;

import java.util.ArrayList;

class V extends Thread {
  long a = 0L;

  U b = null;

  public V(U paramU1, U paramU2, long paramLong) {
    super("SpeedTest");
    this.b = paramU2;
    this.a = paramLong;
    setDaemon(true);
  }

  public void run() {
    try {
      ArrayList<String> arrayList = new ArrayList();
      for (byte b = 0; System.currentTimeMillis() - this.a < this.c.d; b++)
        arrayList.add("Value" + (b * Math.random()));
      this.b.a(arrayList.size());
    } catch (Exception exception) {
      exception.printStackTrace();
    }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bH/V.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
