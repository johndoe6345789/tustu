package L;

import bH.F;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class IncFileCacheManager {
  private Map d = Collections.synchronizedMap(new HashMap<>());
  
  Long a = Long.valueOf(0L);
  
  static int b = 300;
  
  long c = System.currentTimeMillis();
  
  private static V e = null;
  
  private long f = 86400000L;
  
  public static V a() {
    if (e == null)
      e = new V(); 
    return e;
  }
  
  public Long a(String paramString1, String paramString2) {
    if (System.currentTimeMillis() - this.c > this.f) {
      this.c = System.currentTimeMillis();
      F.c();
    } 
    try {
      F f = F.b(paramString1, paramString2);
      if (f.a()) {
        Long long_2 = this.a;
        this.a = Long.valueOf(this.a.longValue() + 1L);
        Long long_1 = long_2;
        W w = new W(this, paramString1, paramString2);
        this.d.put(long_1, w);
        if (this.d.size() > b)
          b(); 
        return long_1;
      } 
      throw new FileNotFoundException("File Not Found: " + paramString2 + " in working Dir:" + paramString1);
    } catch (IOException iOException) {
      Logger.getLogger(V.class.getName()).log(Level.SEVERE, (String)null, iOException);
      throw new FileNotFoundException("File Not Found: " + paramString2 + " in working Dir:" + paramString1);
    } 
  }
  
  private void b() {
    Long long_ = Long.valueOf(Long.MAX_VALUE);
    Long[] arrayOfLong = (Long[])this.d.keySet().toArray((Object[])new Long[this.d.size()]);
    for (byte b = 0; b < arrayOfLong.length; b++) {
      if (arrayOfLong[b].longValue() < long_.longValue())
        long_ = arrayOfLong[b]; 
    } 
    this.d.remove(long_);
  }
  
  public F a(Long paramLong) {
    W w = (W)this.d.get(paramLong);
    if (w == null)
      return null; 
    try {
      return F.b(w.a, w.b);
    } catch (IOException iOException) {
      Logger.getLogger(V.class.getName()).log(Level.SEVERE, (String)null, iOException);
      throw new FileNotFoundException("File Not Found: " + w.a + " in working Dir:" + w.b);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/L/V.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */