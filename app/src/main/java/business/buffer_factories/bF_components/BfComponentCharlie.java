package business.buffer_factories.bF_components;

import G.B;
import G.GInterfaceDb;
import G.GInterfaceDj;
import c.CInterfaceEcho;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BfComponentCharlie implements C {
  private GInterfaceDb c = (GInterfaceDb)new G.c("");
  
  double[] a = new double[8];
  
  double[] b = new double[8];
  
  private GInterfaceDj d = (GInterfaceDj)new B(0.0D);
  
  private GInterfaceDj CInterfaceEcho = (GInterfaceDj)new B(Double.MIN_VALUE);
  
  private GInterfaceDj f = (GInterfaceDj)new B(Double.MAX_VALUE);
  
  private GInterfaceDj g = (GInterfaceDj)new B(1.0D);
  
  private CInterfaceEcho h = null;
  
  public BfComponentCharlie(int paramInt) {
    this.a = new double[paramInt];
    this.b = new double[paramInt];
  }
  
  public int a() {
    return this.a.length;
  }
  
  public String b() {
    try {
      return this.c.a();
    } catch (Exception exception) {
      return "";
    } 
  }
  
  public Double a(int paramInt) {
    try {
      return Double.valueOf(this.a[paramInt]);
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      return Double.valueOf(Double.NaN);
    } 
  }
  
  public void a(int paramInt, Double paramDouble) {
    this.a[paramInt] = paramDouble.doubleValue();
  }
  
  public int c() {
    return (int)this.d.a();
  }
  
  public double d() {
    try {
      double d = Double.MAX_VALUE;
      for (byte b = 0; b < this.a.length; b++) {
        if (this.a[b] < d)
          d = this.a[b]; 
      } 
      return d;
    } catch (Exception exception) {
      Logger.getLogger(c.class.getName()).log(Level.SEVERE, (String)null, exception);
      return 0.0D;
    } 
  }
  
  public double CInterfaceEcho() {
    try {
      double d = Double.MIN_VALUE;
      for (byte b = 0; b < this.a.length; b++) {
        if (this.a[b] > d)
          d = this.a[b]; 
      } 
      return d;
    } catch (Exception exception) {
      Logger.getLogger(c.class.getName()).log(Level.SEVERE, (String)null, exception);
      return 0.0D;
    } 
  }
  
  public boolean b(int paramInt) {
    return (this.b[paramInt] == this.a[paramInt]);
  }
  
  public void f() {
    for (byte b = 0; b < this.a.length; b++)
      this.b[b] = this.a[b]; 
  }
  
  public double c(int paramInt) {
    return this.b[paramInt];
  }
  
  public void a(GInterfaceDj paramdj) {
    this.d = paramdj;
  }
  
  public void b(GInterfaceDj paramdj) {
    this.CInterfaceEcho = paramdj;
  }
  
  public void c(GInterfaceDj paramdj) {
    this.f = paramdj;
  }
  
  public void a(GInterfaceDb paramdb) {
    this.c = paramdb;
  }
  
  public double d(int paramInt) {
    return this.g.a(paramInt);
  }
  
  public void d(GInterfaceDj paramdj) {
    this.g = paramdj;
  }
  
  public boolean g() {
    return (this.h != null) ? this.h.a() : true;
  }
  
  public void a(CInterfaceEcho parame) {
    this.h = parame;
  }
  
  public void b(int paramInt, Double paramDouble) {
    this.b[paramInt] = paramDouble.doubleValue();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bF/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */