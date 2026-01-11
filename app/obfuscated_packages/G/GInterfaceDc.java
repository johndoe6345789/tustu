package G;

import bH.D;
import bH.aa;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GInterfaceDc implements n {
  R a = null;
  
  double b = 0.0D;
  
  boolean c = false;
  
  aa d = null;
  
  final dd e = new dd(this);
  
  public o a(R paramR, m paramm, int paramInt) {
    if (this.c) {
      if (this.d == null) {
        this.d = new aa();
        this.d.a();
      } 
      D.c("SynchronousCommInstructionProcessor: Instruction entering '" + paramm.aL() + "' Time:" + this.d.d());
    } 
    this.a = paramR;
    this.e.a = null;
    paramm.b(this);
    if (paramR.R()) {
      if (this.c)
        D.c("SynchronousCommInstructionProcessor: Dispatch Instruction to Comm Manager Time:" + this.d.d()); 
      paramR.C().b(paramm);
      long l = System.currentTimeMillis();
      this.e.b = l;
      while (this.e.a == null) {
        if (this.e.a == null && System.currentTimeMillis() - this.e.b > paramInt) {
          this.e.a = new o();
          this.e.a.a(3);
          this.e.a.a("Timeout of " + paramInt + " ms. exceeded. time:" + (System.currentTimeMillis() - l));
          return this.e.a;
        } 
        try {
          if (this.c)
            D.c("SynchronousCommInstructionProcessor: Thread waiting for result:" + this.d.d()); 
          synchronized (this.e) {
            this.e.wait((paramInt + 1));
            this.e.notifyAll();
          } 
        } catch (InterruptedException interruptedException) {
          Logger.getLogger(dc.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
        } 
      } 
      if (this.c)
        D.c("SynchronousCommInstructionProcessor: returning result:" + this.d.d()); 
      return this.e.a;
    } 
    this.e.a = new o();
    this.e.a.a(2);
    this.e.a.a("Controller not online.");
    return this.e.a;
  }
  
  public void e() {}
  
  public void a(double paramDouble) {
    if (this.b != paramDouble)
      this.e.b = System.currentTimeMillis(); 
    this.b = paramDouble;
  }
  
  public void a(o paramo) {
    if (this.c)
      D.c("SynchronousCommInstructionProcessor: notified result complete:" + this.d.d()); 
    this.e.b = System.currentTimeMillis();
    this.e.a = paramo;
    synchronized (this.e) {
      this.e.notifyAll();
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/dc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */