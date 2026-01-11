package T;

import G.R;
import G.T;
import G.Y;
import G.cu;
import bH.D;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

class c extends Thread {
  Map a = new HashMap<>();
  
  Object b = new Object();
  
  long c = Long.MAX_VALUE;
  
  int d = 250;
  
  c(a parama) {
    super("Cal Monitor");
  }
  
  public void run() {
    while (true) {
      while (this.c <= System.currentTimeMillis()) {
        for (String str : this.a.keySet()) {
          if (a(str)) {
            ArrayList arrayList = new ArrayList(a.a(this.e, str));
            List list = b(str);
            for (e e : arrayList) {
              if (a(list, e)) {
                cu.a().a(e.a(), 1.0D);
                continue;
              } 
              cu.a().a(e.a(), 0.0D);
            } 
            list.clear();
          } 
        } 
        this.c = Long.MAX_VALUE;
      } 
      synchronized (this.b) {
        try {
          this.b.wait(this.c - System.currentTimeMillis());
        } catch (InterruptedException interruptedException) {
          Logger.getLogger(a.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
        } 
      } 
    } 
  }
  
  private boolean a(String paramString) {
    return (b(paramString).size() > 0);
  }
  
  private boolean a(List paramList, e parame) {
    if (!paramList.isEmpty()) {
      R r = T.a().c(parame.a);
      if (r != null) {
        Y y = r.h();
        for (byte b = 0; b < paramList.size(); b++) {
          if (!parame.a(y)) {
            D.d(parame.a() + " Does not match. $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
            return false;
          } 
        } 
      } 
    } 
    D.d(parame.a() + " matches. $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    return true;
  }
  
  private void a(d paramd) {
    b(paramd.a).add(paramd);
    this.c = System.currentTimeMillis() + this.d;
    synchronized (this.b) {
      this.b.notify();
    } 
  }
  
  private synchronized List b(String paramString) {
    List list = (List)this.a.get(paramString);
    if (list == null) {
      list = new ArrayList();
      this.a.put(paramString, list);
    } 
    return list;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/T/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */