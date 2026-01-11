package G;

import bH.D;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

class ThreadExtensionUsingHashMap extends Thread {
  private final HashMap b = new HashMap<>();
  
  private final Map c = Collections.synchronizedMap(new HashMap<>());
  
  private final Map d = new HashMap<>();
  
  private ThreadExtensionUsingHashMap(cu paramcu) {
    super("OutputChannel Publisher");
    setDaemon(true);
  }
  
  public synchronized void run() {
    while (true) {
      try {
        String[] arrayOfString = (String[])this.c.keySet().toArray((Object[])new String[this.c.keySet().size()]);
        for (byte b = 0; b < arrayOfString.length; b++) {
          String str = arrayOfString[b];
          byte[] arrayOfByte = (byte[])this.c.get(str);
          this.c.remove(str);
          cu.a(this.a, str, arrayOfByte);
        } 
        a();
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
      try {
        wait();
      } catch (InterruptedException interruptedException) {
        interruptedException.printStackTrace();
      } 
    } 
  }
  
  private byte[] a(String paramString, int paramInt) {
    byte[] arrayOfByte = (byte[])this.b.get(paramString);
    if (arrayOfByte == null || arrayOfByte.length != paramInt) {
      arrayOfByte = new byte[paramInt];
      this.b.put(paramString, arrayOfByte);
    } 
    return arrayOfByte;
  }
  
  public synchronized void a(String paramString, byte[] paramArrayOfbyte) {
    byte[] arrayOfByte = a(paramString, paramArrayOfbyte.length);
    System.arraycopy(paramArrayOfbyte, 0, arrayOfByte, 0, paramArrayOfbyte.length);
    this.c.put(paramString, arrayOfByte);
    if (this.c.size() > 4) {
      D.d("OutputChannelPublisher back log, resting 20");
      try {
        Thread.sleep(20L);
      } catch (InterruptedException interruptedException) {
        Logger.getLogger(cu.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
      } 
    } 
    notify();
  }
  
  private void a() {
    synchronized (this.d) {
      for (String str : this.d.keySet()) {
        double d = ((Double)this.d.get(str)).doubleValue();
        cu.a(this.a, str, d);
      } 
      this.d.clear();
    } 
  }
  
  public void a(String paramString, double paramDouble) {
    synchronized (this.d) {
      this.d.put(paramString, Double.valueOf(paramDouble));
    } 
    if (T.a().c() == null || !T.a().c().R())
      a(); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/cw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */