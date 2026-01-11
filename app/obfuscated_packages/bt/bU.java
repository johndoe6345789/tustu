package bt;

import G.R;
import G.Y;
import G.aM;
import G.aN;
import G.aR;
import G.bh;
import G.bv;
import G.i;
import V.a;
import V.g;
import V.j;
import bF.B;
import bF.b;
import bF.x;
import bF.y;
import bH.D;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

class bU implements aN, B {
  R a;
  
  aM b;
  
  List c = new ArrayList();
  
  y d;
  
  long e = System.currentTimeMillis();
  
  int f = 3000;
  
  bV g = null;
  
  boolean h = false;
  
  bU(bQ parambQ, R paramR, y paramy, String paramString) {
    this.a = paramR;
    this.d = paramy;
    bv bv = paramR.e().c(paramString);
    if (bv != null && !(bv instanceof bh))
      throw new a(paramString + " not defined as a 1DTable"); 
    bh bh = (bh)bv;
    if (bh.b() > 0) {
      this.b = paramR.c(bh.d(0));
      aR.a().a(paramR.c(), this.b.aL(), this);
      i.a(paramR.c(), this.b, this);
    } 
    for (byte b = 0; b < bh.a(); b++) {
      aM aM1 = paramR.c(bh.b(b));
      aR.a().a(paramR.c(), aM1.aL(), this);
      this.c.add(aM1);
      i.a(paramR.c(), aM1, this);
    } 
    paramy.a(this);
    paramy.a(bh.i());
  }
  
  public void a() {
    aR.a().a(this);
    this.d.b(this);
  }
  
  private void b(String paramString) {
    if (this.g == null) {
      this.g = new bV(this);
      bV.a(this.g, paramString);
      this.g.start();
    } else {
      bV.a(this.g, paramString);
    } 
  }
  
  public void a(String paramString1, String paramString2) {
    b(paramString2);
  }
  
  public void a(String paramString) {
    synchronized (this) {
      this.h = true;
      if (this.b != null && paramString.equals(this.b.aL())) {
        if (this.d.g()) {
          try {
            double[][] arrayOfDouble = this.b.i(this.a.h());
            for (byte b = 0; b < arrayOfDouble.length; b++) {
              try {
                if (this.d.f()) {
                  this.d.setValueAt(Double.valueOf(arrayOfDouble[b][0]), b, 0);
                } else {
                  this.d.setValueAt(Double.valueOf(arrayOfDouble[b][0]), 0, b);
                } 
              } catch (Exception exception) {
                Logger.getLogger(bQ.class.getName()).log(Level.SEVERE, (String)null, exception);
              } 
            } 
          } catch (g g) {
            Logger.getLogger(bQ.class.getName()).log(Level.SEVERE, (String)null, (Throwable)g);
          } 
        } else if (this.d.h()) {
          try {
            double[][] arrayOfDouble = this.b.i(this.a.h());
            int i = this.d.a() - 1;
            for (byte b = 0; b < arrayOfDouble.length; b++) {
              try {
                if (this.d.f()) {
                  this.d.setValueAt(Double.valueOf(arrayOfDouble[b][0]), b, i);
                } else {
                  this.d.setValueAt(Double.valueOf(arrayOfDouble[b][0]), i, b);
                } 
              } catch (Exception exception) {
                Logger.getLogger(bQ.class.getName()).log(Level.SEVERE, (String)null, exception);
              } 
            } 
          } catch (g g) {
            Logger.getLogger(bQ.class.getName()).log(Level.SEVERE, (String)null, (Throwable)g);
          } 
        } else {
          try {
            x x = this.d.c();
            if (x instanceof b) {
              b b = (b)x;
              String[] arrayOfString = this.b.c(this.a.h());
              for (byte b1 = 0; b1 < arrayOfString.length; b1++)
                b.a(b1, arrayOfString[b1]); 
            } 
          } catch (g g) {
            Logger.getLogger(bQ.class.getName()).log(Level.SEVERE, (String)null, (Throwable)g);
          } 
        } 
      } else {
        for (byte b = 0; b < this.c.size(); b++) {
          if (((aM)this.c.get(b)).aL().equals(paramString))
            try {
              double[][] arrayOfDouble = ((aM)this.c.get(b)).i(this.a.h());
              for (byte b1 = 0; b1 < arrayOfDouble.length; b1++) {
                try {
                  boolean bool = this.d.g() ? (b + 1) : b;
                  if (this.d.f()) {
                    this.d.a(Double.valueOf(arrayOfDouble[b1][0]), b1, bool);
                  } else {
                    this.d.a(Double.valueOf(arrayOfDouble[b1][0]), bool, b1);
                  } 
                } catch (Exception exception) {
                  Logger.getLogger(bQ.class.getName()).log(Level.SEVERE, (String)null, exception);
                } 
              } 
            } catch (g g) {
              Logger.getLogger(bQ.class.getName()).log(Level.SEVERE, (String)null, (Throwable)g);
            }  
        } 
      } 
      this.h = false;
    } 
  }
  
  public void a(int paramInt1, int paramInt2, double paramDouble) {
    synchronized (this) {
      if (!this.h) {
        aM aM1;
        if (this.d.g() && paramInt1 == 0) {
          aM1 = this.b;
        } else if (this.d.h() && paramInt1 == this.d.a() - 1) {
          aM1 = this.b;
        } else if (this.d.g()) {
          aM1 = this.c.get(--paramInt1);
        } else {
          aM1 = this.c.get(paramInt1);
        } 
        try {
          if (paramDouble != Y.j) {
            aM1.a(this.a.h(), paramDouble, paramInt2, 0);
            double d = aM1.i(this.a.h())[paramInt2][0];
            if (this.d.g() && !aM1.aL().equals(this.b.aL()))
              paramInt1++; 
            if (this.d.f()) {
              this.d.a(Double.valueOf(d), paramInt2, paramInt1);
            } else {
              this.d.a(Double.valueOf(d), paramInt1, paramInt2);
            } 
          } 
        } catch (g g) {
          Logger.getLogger(bQ.class.getName()).log(Level.SEVERE, (String)null, (Throwable)g);
        } catch (j j) {
          if (this.d.g() && !aM1.aL().equals(this.b.aL()))
            paramInt1++; 
          if (j.a() == 1) {
            D.c("Param: " + aM1.aL() + " value: " + paramDouble + " exceeds maximum: " + j.c());
            if (this.d.f()) {
              this.d.setValueAt(Double.valueOf(j.c()), paramInt2, paramInt1);
            } else {
              this.d.setValueAt(Double.valueOf(j.c()), paramInt1, paramInt2);
            } 
          } else if (j.a() == 2) {
            D.c("Param: " + aM1.aL() + " value: " + paramDouble + " below minimum: " + j.c());
            if (this.d.f()) {
              this.d.setValueAt(Double.valueOf(j.c()), paramInt2, paramInt1);
            } else {
              this.d.setValueAt(Double.valueOf(j.c()), paramInt1, paramInt2);
            } 
          } 
        } 
      } 
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/bU.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */