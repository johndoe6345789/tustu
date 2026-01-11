package bN;

import G.J;
import J.JInterfaceJuliet;
import bH.BrInterfaceCharlie;
import bR.ExceptionInBrPackage;
import bR.BrInterfaceCharlie;
import bR.BrInterfaceDelta;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BnInterfaceRomeo {
  s ExceptionInBrPackage = null;
  
  k b;
  
  OutputStream BrInterfaceCharlie;
  
  List BrInterfaceDelta = new ArrayList();
  
  List e = new ArrayList();
  
  private final Object g = new Object();
  
  private final Object h = new Object();
  
  private int i = 0;
  
  private int JInterfaceJuliet = 0;
  
  private boolean k = false;
  
  String f = " Slave TX:\n";
  
  private boolean l = false;
  
  private JInterfaceJuliet m = null;
  
  public BnInterfaceRomeo(OutputStream paramOutputStream, k paramk) {
    this.BrInterfaceCharlie = paramOutputStream;
    this.b = paramk;
  }
  
  public int ExceptionInBrPackage(List paramList) {
    int i = -1;
    for (t t : paramList) {
      BrInterfaceCharlie BrInterfaceCharlie = BrInterfaceDelta.ExceptionInBrPackage().ExceptionInBrPackage(this.b);
      i = e();
      BrInterfaceCharlie.ExceptionInBrPackage().b(i);
      BrInterfaceCharlie.ExceptionInBrPackage(t.BrInterfaceDelta());
      this.BrInterfaceDelta.add(BrInterfaceCharlie);
    } 
    synchronized (this.g) {
      this.g.notifyAll();
    } 
    f();
    return i;
  }
  
  public int ExceptionInBrPackage(t paramt) {
    BrInterfaceCharlie BrInterfaceCharlie = BrInterfaceDelta.ExceptionInBrPackage().ExceptionInBrPackage(this.b);
    int i = e();
    BrInterfaceCharlie.ExceptionInBrPackage().b(i);
    BrInterfaceCharlie.ExceptionInBrPackage(paramt.BrInterfaceDelta());
    this.BrInterfaceDelta.add(BrInterfaceCharlie);
    synchronized (this.g) {
      this.g.notifyAll();
    } 
    f();
    return i;
  }
  
  private int e() {
    return (int)(this.i++ % Math.pow(2.0D, (this.b.BrInterfaceDelta() * 8)));
  }
  
  private void f() {
    if (this.ExceptionInBrPackage == null || !this.ExceptionInBrPackage.isAlive())
      ExceptionInBrPackage(); 
  }
  
  public void ExceptionInBrPackage() {
    if (this.ExceptionInBrPackage != null)
      this.ExceptionInBrPackage.ExceptionInBrPackage = false; 
    this.ExceptionInBrPackage = new s(this);
    this.ExceptionInBrPackage.start();
  }
  
  private void g() {
    while (!this.BrInterfaceDelta.isEmpty()) {
      BrInterfaceCharlie BrInterfaceCharlie = this.BrInterfaceDelta.remove(0);
      try {
        ExceptionInBrPackage(BrInterfaceCharlie);
        b(BrInterfaceCharlie);
      } catch (o o) {
        ExceptionInBrPackage(o, BrInterfaceCharlie);
      } 
      BrInterfaceDelta.ExceptionInBrPackage().ExceptionInBrPackage(this.b, BrInterfaceCharlie);
    } 
  }
  
  private void ExceptionInBrPackage(BrInterfaceCharlie paramc) {
    paramc.i();
    paramc.e();
    paramc.f();
    try {
      this.BrInterfaceCharlie.write(paramc.h());
      this.BrInterfaceCharlie.flush();
      if (this.m != null)
        if (h.ExceptionInBrPackage(paramc)) {
          this.m.e();
        } else {
          this.m.JInterfaceJuliet();
        }  
      if (h())
        ExceptionInBrPackage(paramc.h()); 
      if (this.k && h.ExceptionInBrPackage(paramc) && paramc.b().e())
        this.JInterfaceJuliet++; 
    } catch (ExceptionInBrPackage ExceptionInBrPackage) {
      throw new o("Failed to get Message bytes, size mismatch: " + ExceptionInBrPackage.getMessage());
    } finally {}
  }
  
  private boolean h() {
    return (J.I() || this.l);
  }
  
  private void ExceptionInBrPackage(byte[] paramArrayOfbyte) {
    System.out.println(k.v() + this.f + BrInterfaceCharlie.BrInterfaceDelta(paramArrayOfbyte));
  }
  
  public void ExceptionInBrPackage(g paramg) {
    this.e.add(paramg);
  }
  
  public void b(g paramg) {
    this.e.remove(paramg);
  }
  
  private void ExceptionInBrPackage(IOException paramIOException) {
    for (g g : this.e)
      g.b(paramIOException); 
  }
  
  private void ExceptionInBrPackage(o paramo, BrInterfaceCharlie paramc) {
    for (g g : this.e)
      g.ExceptionInBrPackage(paramo, paramc); 
  }
  
  private void b(BrInterfaceCharlie paramc) {
    for (g g : this.e)
      g.ExceptionInBrPackage(paramc); 
  }
  
  private void ExceptionInBrPackage(int paramInt) {
    try {
      synchronized (this.g) {
        this.g.wait(paramInt);
      } 
    } catch (InterruptedException interruptedException) {
      Logger.getLogger(p.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
    } 
  }
  
  public void b() {
    this.JInterfaceJuliet = 0;
    synchronized (this.h) {
      this.h.notifyAll();
    } 
  }
  
  public void BrInterfaceCharlie() {
    if (this.ExceptionInBrPackage != null)
      this.ExceptionInBrPackage.ExceptionInBrPackage = false; 
  }
  
  public void ExceptionInBrPackage(boolean paramBoolean) {
    this.k = paramBoolean;
    if (paramBoolean) {
      this.f = ": Master TX:\n";
    } else {
      this.f = ": Slave TX:\n";
    } 
  }
  
  public k BrInterfaceDelta() {
    return this.b;
  }
  
  public void ExceptionInBrPackage(JInterfaceJuliet paramj) {
    this.m = paramj;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bN/r.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */