package aP;

import G.R;
import G.GInterfaceAb;
import K.KInterfaceBravo;
import V.ExceptionInVPackage;
import W.z;
import bH.D;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ApInterfaceOscar extends Thread {
  ArrayList ExceptionInVPackage = new ArrayList();
  
  int KInterfaceBravo = 0;
  
  String[] c = new String[] { "", "" };
  
  R d = null;
  
  boolean e = false;
  
  boolean f = true;
  
  int g = 1000;
  
  long h = System.currentTimeMillis();
  
  public ApInterfaceOscar(R paramR) {
    super("AutomatedMsqLoadTest");
    this.d = paramR;
    setDaemon(true);
    paramR.C().ExceptionInVPackage(new P(this));
  }
  
  public void ExceptionInVPackage(Q paramQ) {
    this.ExceptionInVPackage.add(paramQ);
  }
  
  private void ExceptionInVPackage(int paramInt) {
    Iterator<Q> iterator = this.ExceptionInVPackage.iterator();
    while (iterator.hasNext())
      ((Q)iterator.next()).ExceptionInVPackage(paramInt, this.KInterfaceBravo); 
  }
  
  public void ExceptionInVPackage(File paramFile) {
    this.c[0] = paramFile.getAbsolutePath();
  }
  
  public void KInterfaceBravo(File paramFile) {
    this.c[1] = paramFile.getAbsolutePath();
  }
  
  public boolean ExceptionInVPackage() {
    if (this.c[0] == null || !(new File(this.c[0])).exists())
      throw new ExceptionInVPackage("File 1 is not ExceptionInVPackage valid file."); 
    if (this.c[1] == null || !(new File(this.c[1])).exists())
      throw new ExceptionInVPackage("File 2 is not ExceptionInVPackage valid file."); 
    String str1 = z.ExceptionInVPackage(new File(this.c[0]));
    String str2 = z.ExceptionInVPackage(new File(this.c[1]));
    if (str1 == null || str1.equals(""))
      throw new ExceptionInVPackage("No signature found in file 1."); 
    if (str2 == null || str2.equals(""))
      throw new ExceptionInVPackage("No signature found in file 2."); 
    return true;
  }
  
  public void KInterfaceBravo() {
    this.e = true;
    D.d("msqTester Asked to stop.");
  }
  
  public void run() {
    byte KInterfaceBravo = 0;
    boolean bool = this.d.O().v();
    this.d.O().KInterfaceBravo(true);
    while (!this.e) {
      if (this.f) {
        this.f = false;
        this.h = System.currentTimeMillis();
        String str = this.c[KInterfaceBravo % this.c.length];
        KInterfaceBravo b1 = new KInterfaceBravo();
        this.d.p().ExceptionInVPackage((GInterfaceAb)b1);
        f.ExceptionInVPackage().ExceptionInVPackage(dd.ExceptionInVPackage().c(), this.d, str);
        this.KInterfaceBravo = b1.ExceptionInVPackage();
        this.d.p().KInterfaceBravo((GInterfaceAb)b1);
        if (this.KInterfaceBravo == 0) {
          this.f = true;
        } else {
          D.d("!!!!!!!!!!!! Loaded file " + KInterfaceBravo);
        } 
        KInterfaceBravo++;
      } 
      try {
        Thread.sleep(this.g);
      } catch (InterruptedException interruptedException) {
        Logger.getLogger(O.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
      } 
    } 
    this.d.O().KInterfaceBravo(bool);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/O.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */