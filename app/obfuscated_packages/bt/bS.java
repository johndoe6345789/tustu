package bt;

import G.R;
import G.aM;
import G.aN;
import G.aR;
import G.be;
import G.i;
import V.g;
import V.j;
import bH.D;
import bH.X;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.s;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;

class bS implements aN, TableModelListener {
  R a = null;
  
  aM b = null;
  
  aM c = null;
  
  aM d = null;
  
  s e = null;
  
  bT f = null;
  
  long g = System.currentTimeMillis();
  
  int h = 3000;
  
  public bS(bQ parambQ, R paramR, s params, String paramString) {
    this.e = params;
    this.a = paramR;
    be be = (be)paramR.e().c(paramString);
    this.b = paramR.c(be.a());
    this.c = paramR.c(be.b());
    this.d = paramR.c(be.c());
    aR.a().a(paramR.c(), this.b.aL(), this);
    aR.a().a(paramR.c(), this.c.aL(), this);
    aR.a().a(paramR.c(), this.d.aL(), this);
    i.a(paramR.c(), this.c, this);
    i.a(paramR.c(), this.d, this);
    i.a(paramR.c(), this.b, this);
  }
  
  public void a() {
    aR.a().a(this);
    this.e.removeTableModelListener(this);
  }
  
  public void tableChanged(TableModelEvent paramTableModelEvent) {
    s s1 = (s)paramTableModelEvent.getSource();
    if (paramTableModelEvent.getFirstRow() == -1 && paramTableModelEvent.getColumn() < this.b.b()) {
      try {
        double d = this.b.a(this.a.p())[paramTableModelEvent.getColumn()][0];
        a(paramTableModelEvent.getColumn(), s1.b()[paramTableModelEvent.getColumn()] + "", d + "");
      } catch (g g) {
        Logger.getLogger(bQ.class.getName()).log(Level.SEVERE, (String)null, (Throwable)g);
      } 
    } else if (paramTableModelEvent.getColumn() == -1) {
      try {
        if (this.e.getRowCount() != this.c.a() / 2) {
          double d = this.c.a(this.a.p())[paramTableModelEvent.getFirstRow()][0];
          b(paramTableModelEvent.getFirstRow(), s1.a()[paramTableModelEvent.getFirstRow()] + "", d + "");
        } 
      } catch (g g) {
        Logger.getLogger(bQ.class.getName()).log(Level.SEVERE, (String)null, (Throwable)g);
      } 
    } else {
      try {
        double d = s1.e(paramTableModelEvent.getFirstRow(), paramTableModelEvent.getColumn()).doubleValue();
        if (d > -2.14711111E8D) {
          this.d.a(this.a.p(), d, paramTableModelEvent.getFirstRow(), paramTableModelEvent.getColumn());
          if (this.e.D() != null)
            this.e.D()[paramTableModelEvent.getFirstRow()][paramTableModelEvent.getColumn()].a(d); 
        } 
      } catch (g g) {
        g.printStackTrace();
        bV.d("Error updating table:\n" + g.getMessage(), bV.c());
      } catch (j j) {
        s1.a(new Double(j.c()), paramTableModelEvent.getFirstRow(), paramTableModelEvent.getColumn());
      } catch (Exception exception) {
        exception.printStackTrace();
        bV.d("Error updating table:\n" + exception.getMessage() + "\nSee log for more detail.", bV.c());
      } 
    } 
  }
  
  public void a(int paramInt, String paramString1, String paramString2) {
    double d = Double.parseDouble(paramString1);
    try {
      this.b.a(this.a.p(), d, paramInt, 0);
    } catch (g g) {
      g.printStackTrace();
      D.a("Error updating y Axis.", (Exception)g, bV.c());
    } catch (j j) {
      if (System.currentTimeMillis() - this.h > this.g)
        if (j.d() == paramInt && j.a() == 1) {
          bV.d(this.i.a("The attempted value exceeds the set maximum for the X axis.") + " (" + this.b.aL() + ")\n" + this.i.a("Attempted Value") + ": " + j.b() + "\n" + this.i.a("Set Limit") + ": " + j.c(), bV.c());
          this.g = System.currentTimeMillis();
        } else if (j.d() == paramInt && j.a() == 2) {
          bV.d(this.i.a("The attempted value is below the set minimum for the X axis.") + " (" + this.b.aL() + ")\n" + this.i.a("Attempted Value") + ": " + j.b() + "\n" + this.i.a("Set Limit") + ": " + j.c(), bV.c());
          this.g = System.currentTimeMillis();
        }  
      D.b(paramString1 + " is out of range.\nLimit:" + j.c());
      double d1 = Double.parseDouble(paramString1);
      if (d1 > this.b.s()) {
        this.e.a(this.b.s() + "", paramInt);
      } else {
        this.e.a(this.b.r() + "", paramInt);
      } 
    } 
  }
  
  public void b(int paramInt, String paramString1, String paramString2) {
    if (this.e.getRowCount() != this.c.a() / 2) {
      double d = Double.parseDouble(paramString1);
      try {
        this.c.a(this.a.p(), d, this.c.b() - 1 - paramInt, 0);
      } catch (g g) {
        g.printStackTrace();
        D.a("Error updating y Axis.", (Exception)g, bV.c());
      } catch (j j) {
        if (System.currentTimeMillis() - this.h > this.g)
          if (j.d() == paramInt && j.a() == 1) {
            bV.d(this.i.a("The attempted value exceeds the set maximum for the Y axis.") + " (" + this.c.aL() + ")\n" + this.i.a("Attempted Value") + ": " + j.b() + "\n" + this.i.a("Set Limit") + ": " + j.c(), bV.c());
            this.g = System.currentTimeMillis();
          } else if (j.d() == paramInt && j.a() == 2) {
            bV.d(this.i.a("The attempted value is below the set minimum for the Y axis.") + " (" + this.c.aL() + ")\n" + this.i.a("Attempted Value") + ": " + j.b() + "\n" + this.i.a("Set Limit") + ": " + j.c(), bV.c());
            this.g = System.currentTimeMillis();
          }  
        D.b(paramString1 + " is out of range.\nLimit:" + j.c());
        double d1 = Double.parseDouble(paramString1);
        if (j.a() == 1) {
          this.e.b(j.c() + "", paramInt);
        } else {
          this.e.b(j.c() + "", paramInt);
        } 
      } 
    } 
  }
  
  public void a(String paramString1, String paramString2) {
    if (paramString2 != null && paramString2.equals(this.d.aL())) {
      d();
    } else if (paramString2 != null && paramString2.equals(this.c.aL())) {
      f();
    } else if (paramString2 != null && paramString2.equals(this.b.aL())) {
      e();
    } else {
      f();
      d();
      e();
    } 
  }
  
  private void b() {
    try {
      String[] arrayOfString = a(this.c.i(this.a.p()), this.c.v());
      if (this.e.getRowCount() == arrayOfString.length / 2) {
        this.e.d(arrayOfString);
        String[] arrayOfString1 = this.e.a();
        for (byte b1 = 0; b1 < arrayOfString1.length; b1++)
          this.e.a(Double.valueOf(Double.parseDouble(arrayOfString1[b1])), b1, -1); 
      } 
      for (byte b = 0; b < arrayOfString.length; b++) {
        if (this.e.getRowCount() == arrayOfString.length / 2) {
          if (b % 2 == 1);
        } else {
          this.e.b(arrayOfString[b], arrayOfString.length - 1 - b);
        } 
      } 
    } catch (g g) {
      g.printStackTrace();
      D.a("Y Axis failed on update, it may now be out of sync.", (Exception)g, null);
    } 
  }
  
  private String[] a(double[][] paramArrayOfdouble, int paramInt) {
    String[] arrayOfString = new String[paramArrayOfdouble.length];
    for (byte b = 0; b < paramArrayOfdouble.length; b++)
      arrayOfString[b] = "" + X.b(paramArrayOfdouble[b][0], paramInt); 
    return arrayOfString;
  }
  
  private void c() {
    try {
      String[] arrayOfString = a(this.b.i(this.a.p()), this.b.v());
      for (byte b = 0; b < arrayOfString.length; b++)
        this.e.a(arrayOfString[b], b); 
    } catch (g g) {
      g.printStackTrace();
      D.a("X Axis failed on update, it may now be out of sync.", (Exception)g, null);
    } 
  }
  
  private void d() {
    if (this.f == null) {
      this.f = new bT(this);
      this.f.a();
      this.f.start();
    } else {
      this.f.a();
    } 
  }
  
  private void e() {
    if (this.f == null) {
      this.f = new bT(this);
      this.f.b();
      this.f.start();
    } else {
      this.f.b();
    } 
  }
  
  private void f() {
    if (this.f == null) {
      this.f = new bT(this);
      this.f.c();
      this.f.start();
    } else {
      this.f.c();
    } 
  }
  
  private void g() {
    try {
      double[][] arrayOfDouble = this.d.i(this.a.p());
      for (byte b = 0; b < arrayOfDouble.length; b++) {
        for (byte b1 = 0; b1 < (arrayOfDouble[0]).length; b1++) {
          double d = this.e.e(b, b1).doubleValue();
          if (arrayOfDouble[b][b1] != d)
            this.e.a(Double.valueOf(arrayOfDouble[b][b1]), b, b1); 
        } 
      } 
    } catch (g g) {
      g.printStackTrace();
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/bS.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */