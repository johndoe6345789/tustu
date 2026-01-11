package aP;

import aE.CloneableImpl;
import com.efiAnalytics.ui.eh;
import com.efiAnalytics.ui.fp;
import java.awt.Component;
import javax.swing.DefaultListModel;

class as implements eh {
  as(aq paramaq) {}
  
  public void a(DefaultListModel paramDefaultListModel) {
    CloneableImpl CloneableImpl = new CloneableImpl();
    CloneableImpl.a("CAN" + ((this.a.a.a()).length + 1));
    CloneableImpl.b("My CAN Controller");
    this.a.a.a(CloneableImpl);
    this.a.a.b(CloneableImpl);
    this.a.CloneableImpl.a(CloneableImpl);
    this.a.CloneableImpl.a(true);
    fp.a((Component)this.a.CloneableImpl, true);
  }
  
  public boolean a(Object paramObject, int paramInt) {
    this.a.CloneableImpl.validate();
    return true;
  }
  
  public boolean a(Object paramObject, int paramInt1, int paramInt2) {
    return true;
  }
  
  public void a(Object paramObject) {
    this.a.CloneableImpl.a((CloneableImpl)paramObject);
    this.a.CloneableImpl.setEnabled(true);
    if (this.a.getParent() != null)
      this.a.getParent().validate(); 
    this.a.CloneableImpl.a(false);
  }
  
  public void b(Object paramObject) {
    this.a.CloneableImpl.setEnabled(false);
    this.a.CloneableImpl.a();
    this.a.CloneableImpl.c();
    this.a.CloneableImpl.validate();
    if (this.a.getParent() != null)
      this.a.getParent().validate(); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/as.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */