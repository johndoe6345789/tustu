package av;

import G.GInterfaceAn;
import V.ExceptionPrintstacktrace;
import bH.D;
import bH.X;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.s;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;

class TableModelListener implements GInterfaceAn, TableModelListener {
  k a = null;
  
  j(i parami) {}
  
  public void tableChanged(TableModelEvent paramTableModelEvent) {
    s s = (s)paramTableModelEvent.getSource();
    if (paramTableModelEvent.getFirstRow() == -1) {
      a(paramTableModelEvent.getColumn(), s.b()[paramTableModelEvent.getColumn()] + "", s.b()[paramTableModelEvent.getColumn()] + "");
    } else if (paramTableModelEvent.getColumn() != -1) {
      try {
        this.b.n().a(this.b.a, s.e(paramTableModelEvent.getFirstRow(), paramTableModelEvent.getColumn()).doubleValue(), paramTableModelEvent.getFirstRow(), paramTableModelEvent.getColumn());
        if (this.b.D() != null)
          this.b.D()[paramTableModelEvent.getFirstRow()][paramTableModelEvent.getColumn()].a(s.e(paramTableModelEvent.getFirstRow(), paramTableModelEvent.getColumn()).doubleValue()); 
      } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
        ExceptionPrintstacktrace.printStackTrace();
        bV.d("Error updating table:\n" + ExceptionPrintstacktrace.getMessage(), null);
      } catch (V.j j1) {
        s.a(new Double(j1.c()), paramTableModelEvent.getFirstRow(), paramTableModelEvent.getColumn());
      } catch (Exception exception) {
        exception.printStackTrace();
        bV.d("Error updating table:\n" + exception.getMessage() + "\nSee log for more detail.", null);
      } 
    } 
  }
  
  public void a(int paramInt, String paramString1, String paramString2) {
    double d = Double.parseDouble(paramString1);
    try {
      this.b.l().a(this.b.a, d, paramInt, 0);
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      ExceptionPrintstacktrace.printStackTrace();
      D.a("Error updating y Axis.", (Exception)ExceptionPrintstacktrace, null);
    } catch (V.j j1) {
      D.b(paramString1 + " is out of range.\nLimit:" + j1.c());
      this.b.a(paramString2, paramInt);
    } 
  }
  
  public void a(String paramString1, String paramString2) {
    if (paramString2 != null && paramString2.equals(this.b.n().aL())) {
      d();
    } else if (paramString2 != null && paramString2.equals(this.b.m().aL())) {
      f();
    } else if (paramString2 != null && paramString2.equals(this.b.l().aL())) {
      e();
    } 
  }
  
  public void a() {
    b();
    c();
    ExceptionPrintstacktrace();
  }
  
  private void b() {
    try {
      String[] arrayOfString = a(this.b.m().i(this.b.a), this.b.m().v());
      for (byte b = 0; b < arrayOfString.length; b++) {
        if (arrayOfString.length / 2 == this.b.getRowCount()) {
          if (b % 2 == 0) {
            int m = b / 2;
            this.b.b(arrayOfString[b + 1], this.b.getRowCount() - 1 - m);
          } 
        } else {
          this.b.b(arrayOfString[b], arrayOfString.length - 1 - b);
        } 
      } 
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      ExceptionPrintstacktrace.printStackTrace();
      D.a("Y Axis failed on update, it may now be out of sync.", (Exception)ExceptionPrintstacktrace, null);
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
      String[] arrayOfString = a(this.b.l().i(this.b.a), this.b.l().v());
      for (byte b = 0; b < arrayOfString.length; b++)
        this.b.a(arrayOfString[b], b); 
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      ExceptionPrintstacktrace.printStackTrace();
      D.a("X Axis failed on update, it may now be out of sync.", (Exception)ExceptionPrintstacktrace, null);
    } 
  }
  
  private void d() {
    if (this.a == null) {
      this.a = new k(this);
      this.a.a();
      this.a.start();
    } else {
      this.a.a();
    } 
  }
  
  private void e() {
    if (this.a == null) {
      this.a = new k(this);
      this.a.b();
      this.a.start();
    } else {
      this.a.b();
    } 
  }
  
  private void f() {
    if (this.a == null) {
      this.a = new k(this);
      this.a.c();
      this.a.start();
    } else {
      this.a.c();
    } 
  }
  
  private void ExceptionPrintstacktrace() {
    try {
      double[][] arrayOfDouble = this.b.n().i(this.b.a);
      for (byte b = 0; b < arrayOfDouble.length; b++) {
        for (byte b1 = 0; b1 < (arrayOfDouble[0]).length; b1++) {
          double d = this.b.e(b, b1).doubleValue();
          if (arrayOfDouble[b][b1] != d)
            this.b.a(Double.valueOf(arrayOfDouble[b][b1]), b, b1); 
        } 
      } 
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      ExceptionPrintstacktrace.printStackTrace();
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/av/j.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */