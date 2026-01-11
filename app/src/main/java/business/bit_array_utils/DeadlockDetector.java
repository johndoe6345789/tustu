package business.bit_array_utils;

import java.util.Map;

public class i {
  private static i d = null;
  
  boolean a = false;
  
  Runnable b = new j(this);
  
  k c;
  
  public void a() {
    if (this.c != null)
      k.a(this.c); 
    this.c = new k(this);
    this.c.start();
  }
  
  public static i b() {
    if (d == null)
      d = new i(); 
    return d;
  }
  
  private void c() {
    D.c("Swing Event Thread not heard from in 10 seconds, assuming dead lock. Printing all stacks");
    Map<Thread, StackTraceElement[]> map = Thread.getAllStackTraces();
    for (Thread thread : map.keySet()) {
      System.err.println("Thread " + thread.getName());
      StackTraceElement[] arrayOfStackTraceElement = map.get(thread);
      for (byte b = 0; b < arrayOfStackTraceElement.length; b++)
        System.err.println("\tat " + arrayOfStackTraceElement[b]); 
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bH/i.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */