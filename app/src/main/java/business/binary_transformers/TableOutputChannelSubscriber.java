package bt;

import G.R;
import G.CloneableImplUsingArrayList;
import G.GComponentCq;
import G.ManagerUsingArrayList;
import V.ExceptionInVPackage;
import bF.TableModelListenerUsingArrayList;
import bH.D;

public class TableOutputChannelSubscriber implements GComponentCq, bP {
  double ExceptionInVPackage = Double.NaN;
  
  T b;
  
  TableModelListenerUsingArrayList c;
  
  R TableModelListenerUsingArrayList;
  
  CloneableImplUsingArrayList e;
  
  public F(R paramR, CloneableImplUsingArrayList parambh, T paramT) {
    this.TableModelListenerUsingArrayList = paramR;
    this.e = parambh;
    this.b = paramT;
    this.c = paramT.b;
  }
  
  public void setCurrentOutputChannelValue(String paramString, double paramDouble) {
    if (!this.b.isEnabled())
      return; 
    this.c.ExceptionInVPackage(paramDouble);
    this.b.c();
  }
  
  public void ExceptionInVPackage() {
    if (this.e.TableModelListenerUsingArrayList() != null)
      try {
        ManagerUsingArrayList.ExceptionInVPackage().ExceptionInVPackage(this.TableModelListenerUsingArrayList.c(), this.e.TableModelListenerUsingArrayList(), this);
      } catch (ExceptionInVPackage ExceptionInVPackage) {
        D.ExceptionInVPackage("Unable to subscribe x or y axis for hightlights.", (Exception)ExceptionInVPackage, this);
      }  
  }
  
  public void b() {
    ManagerUsingArrayList.ExceptionInVPackage().ExceptionInVPackage(this);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/F.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */