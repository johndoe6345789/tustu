package aP;

import G.R;
import G.ab;
import K.b;
import V.a;
import W.z;
import bH.D;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

public class O extends Thread {
  ArrayList a = new ArrayList();
  
  int b = 0;
  
  String[] c = new String[] { "", "" };
  
  R d = null;
  
  boolean e = false;
  
  boolean f = true;
  
  int g = 1000;
  
  long h = System.currentTimeMillis();
  
  public O(R paramR) {
    super("AutomatedMsqLoadTest");
    this.d = paramR;
    setDaemon(true);
    paramR.C().a(new P(this));
  }
  
  public void a(Q paramQ) {
    this.a.add(paramQ);
  }
  
  private void a(int paramInt) {
    Iterator<Q> iterator = this.a.iterator();
    while (iterator.hasNext())
      ((Q)iterator.next()).a(paramInt, this.b); 
  }
  
  public void a(File paramFile) {
    this.c[0] = paramFile.getAbsolutePath();
  }
  
  public void b(File paramFile) {
    this.c[1] = paramFile.getAbsolutePath();
  }
  
  public boolean a() {
    if (this.c[0] == null || !(new File(this.c[0])).exists())
      throw new a("File 1 is not a valid file."); 
    if (this.c[1] == null || !(new File(this.c[1])).exists())
      throw new a("File 2 is not a valid file."); 
    String str1 = z.a(new File(this.c[0]));
    String str2 = z.a(new File(this.c[1]));
    if (str1 == null || str1.equals(""))
      throw new a("No signature found in file 1."); 
    if (str2 == null || str2.equals(""))
      throw new a("No signature found in file 2."); 
    return true;
  }
  
  public void b() {
    this.e = true;
    D.d("msqTester Asked to stop.");
  }
  
  public void run() {
    byte b = 0;
    boolean bool = this.d.O().v();
    this.d.O().b(true);
    while (!this.e) {
      if (this.f) {
        this.f = false;
        this.h = System.currentTimeMillis();
        String str = this.c[b % this.c.length];
        b b1 = new b();
        this.d.p().a((ab)b1);
        f.a().a(dd.a().c(), this.d, str);
        this.b = b1.a();
        this.d.p().b((ab)b1);
        if (this.b == 0) {
          this.f = true;
        } else {
          D.d("!!!!!!!!!!!! Loaded file " + b);
        } 
        b++;
      } 
      try {
        Thread.sleep(this.g);
      } catch (InterruptedException interruptedException) {
        Logger.getLogger(O.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
      } 
    } 
    this.d.O().b(bool);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/O.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */