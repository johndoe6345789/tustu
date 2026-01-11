package aP;

import aE.d;
import com.efiAnalytics.ui.eh;
import com.efiAnalytics.ui.fp;
import java.awt.Component;
import javax.swing.DefaultListModel;

class as implements eh {
  as(aq paramaq) {}
  
  public void a(DefaultListModel paramDefaultListModel) {
    d d = new d();
    d.a("CAN" + ((this.a.a.a()).length + 1));
    d.b("My CAN Controller");
    this.a.a.a(d);
    this.a.a.b(d);
    this.a.d.a(d);
    this.a.d.a(true);
    fp.a((Component)this.a.d, true);
  }
  
  public boolean a(Object paramObject, int paramInt) {
    this.a.d.validate();
    return true;
  }
  
  public boolean a(Object paramObject, int paramInt1, int paramInt2) {
    return true;
  }
  
  public void a(Object paramObject) {
    this.a.d.a((d)paramObject);
    this.a.d.setEnabled(true);
    if (this.a.getParent() != null)
      this.a.getParent().validate(); 
    this.a.d.a(false);
  }
  
  public void b(Object paramObject) {
    this.a.d.setEnabled(false);
    this.a.d.a();
    this.a.d.c();
    this.a.d.validate();
    if (this.a.getParent() != null)
      this.a.getParent().validate(); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/as.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */