package br;

import G.GInterfaceAi;
import G.i;
import bH.D;
import bH.G;
import bH.X;
import com.efiAnalytics.ui.s;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;

class ListenerTablechanged implements TableModelListener {
  String a = null;
  
  s b = null;
  
  s c = null;
  
  public ListenerTablechanged(n paramn, String paramString, s params1, s params2) {
    this.a = paramString;
    this.b = params1;
    this.c = params2;
  }
  
  public void tableChanged(TableModelEvent paramTableModelEvent) {
    if (paramTableModelEvent.getFirstRow() != -1 && paramTableModelEvent.getColumn() != -1) {
      double d = this.c.e(paramTableModelEvent.getFirstRow(), paramTableModelEvent.getColumn()).doubleValue();
      int i = (int)Math.round(d * 255.0D / 5.0D);
      String str = X.b(this.a, "egoADC", i + "");
      try {
        str = i.c(str, (GInterfaceAi)this.d.d);
        double d1 = G.g(str);
        this.b.a(Double.valueOf(d1), paramTableModelEvent.getFirstRow(), paramTableModelEvent.getColumn());
        this.d.c.b();
      } catch (Exception exception) {
        D.c("Error updating VE Analyze target AFR table");
        exception.printStackTrace();
      } 
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/br/q.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */