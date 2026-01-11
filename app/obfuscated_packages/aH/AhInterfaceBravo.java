package aH;

import G.F;
import G.R;
import G.dc;
import G.m;
import G.o;
import bH.D;
import bH.X;
import bH.c;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AhInterfaceBravo {
  private static b c = null;
  
  private final Object d = new Object();
  
  private boolean e = false;
  
  List a = null;
  
  List b = new ArrayList();
  
  public static b a() {
    if (c == null)
      c = new b(); 
    return c;
  }
  
  public void a(d paramd) {
    this.b.add(paramd);
  }
  
  public void b(d paramd) {
    this.b.add(paramd);
  }
  
  private void a(List paramList) {
    for (d d : this.b)
      d.a(paramList); 
  }
  
  public void a(R paramR) {
    if (!this.e && paramR.b()) {
      c c = new c(this, paramR);
      c.start();
    } 
  }
  
  public List b(R paramR) {
    if (!this.e) {
      this.e = true;
      this.a = c(paramR);
      this.e = false;
      a(this.a);
      c();
    } else {
      b();
    } 
    return this.a;
  }
  
  private void b() {
    if (this.e)
      synchronized (this.d) {
        if (this.e)
          try {
            this.d.wait(10000L);
          } catch (InterruptedException interruptedException) {
            Logger.getLogger(b.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
          }  
      }  
  }
  
  private void c() {
    synchronized (this.d) {
      this.d.notifyAll();
    } 
  }
  
  private List c(R paramR) {
    ArrayList<a> arrayList = new ArrayList();
    if (paramR.R()) {
      dc dc = new dc();
      for (byte b1 = 0; b1 <= 14; b1++) {
        if (b1 != paramR.O().x()) {
          a a = new a();
          a.a(b1);
          int[] arrayOfInt = c.b(F.d("r\\0\\x0f\\x00\\x00\\x00\\x14", b1));
          m m = m.a(paramR.O(), arrayOfInt);
          m.a(150);
          m.b(20);
          m.i(10);
          m.b(true);
          m.c(false);
          m.v("Query Signature CAN ID " + b1);
          if (b1 == 11);
          o o = dc.a(paramR, m, 500);
          if (o.a() == 1) {
            String str = X.a(o.g());
            a.b(str);
            a.a(true);
            int[] arrayOfInt1 = c.b(F.d("r\\0\\x0e\\x00\\x00\\x00\\x3c", b1));
            m m1 = m.a(paramR.O(), arrayOfInt1);
            m1.a(240);
            m1.b(arrayOfInt1[arrayOfInt1.length - 1]);
            m1.i(30);
            m1.b(true);
            m1.c(false);
            m1.v("Query Info CAN ID " + b1);
            o = dc.a(paramR, m1, 500);
            if (o.a() == 1) {
              String str1 = X.a(o.g());
              a.a(str1);
            } 
          } else {
            D.c("CAN ID: " + b1 + ", " + o.c());
            a.a("Not Detected");
            a.a(false);
          } 
          if (b1 == 12);
          arrayList.add(a);
        } 
      } 
    } else if (paramR.C() instanceof bQ.l) {
      for (byte b1 = 0; b1 <= 14; b1++) {
        if (b1 != paramR.O().x()) {
          a a = new a();
          a.a(b1);
          a.a("Unsupported on Dash Echo");
          a.a(false);
        } 
      } 
    } else {
      for (byte b1 = 0; b1 <= 14; b1++) {
        if (b1 != paramR.O().x()) {
          a a = new a();
          a.a(b1);
          a.a(false);
        } 
      } 
    } 
    return arrayList;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aH/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */