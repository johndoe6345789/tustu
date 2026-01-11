package bl;

import G.R;
import G.ExceptionprintstacktraceInGPackage;
import G.CloneableImpl;
import G.CloneableImplInGPackage;
import G.GComponentBq;
import G.ArrayListExceptionprintstacktraceInGPackage;
import bH.D;
import bt.ExceptionUsingComponent;
import bt.ExceptionEqualsinaipackage;
import com.efiAnalytics.plugin.ecu.servers.UiSettingServer;
import com.efiAnalytics.ui.bc;
import java.awt.Component;
import java.awt.Container;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JComponent;

public class ManagerGetuicomponent implements UiSettingServer {
  R a = null;
  
  List b = null;
  
  List c = null;
  
  List d = null;
  
  public ManagerGetuicomponent(R paramR) {
    this.a = paramR;
  }
  
  public JComponent getUiComponent(String paramString) {
    if (this.a.c(paramString) != null) {
      GComponentBq GComponentBq = ExceptionprintstacktraceInGPackage.d(this.a, paramString);
      if (GComponentBq != null)
        return (JComponent)new ExceptionUsingComponent(this.a, GComponentBq); 
    } 
    if (this.a.e().c(paramString) != null) {
      ArrayListExceptionprintstacktraceInGPackage ArrayListExceptionprintstacktraceInGPackage = this.a.e().c(paramString);
      return (JComponent)new ExceptionEqualsinaipackage(this.a, ArrayListExceptionprintstacktraceInGPackage);
    } 
    D.d("UiSettingServer:: UiComponent not found in Configuration: " + this.a.c());
    return null;
  }
  
  public void disposeUiComponent(Component paramComponent) {
    a(paramComponent);
  }
  
  private void a(Component paramComponent) {
    if (paramComponent instanceof bc)
      ((bc)paramComponent).close(); 
    if (paramComponent instanceof Container) {
      Container container = (Container)paramComponent;
      for (byte b = 0; b < container.getComponentCount(); b++)
        a(container.getComponent(b)); 
    } 
  }
  
  public List getUiPanelNames() {
    if (this.b == null) {
      this.b = new ArrayList();
      Iterator<ArrayListExceptionprintstacktraceInGPackage> iterator = this.a.e().d();
      while (iterator.hasNext()) {
        ArrayListExceptionprintstacktraceInGPackage ArrayListExceptionprintstacktraceInGPackage = iterator.next();
        if (!(ArrayListExceptionprintstacktraceInGPackage instanceof CloneableImpl) && !(ArrayListExceptionprintstacktraceInGPackage instanceof CloneableImplInGPackage))
          this.b.add(ArrayListExceptionprintstacktraceInGPackage.aL()); 
      } 
    } 
    return this.b;
  }
  
  public List getUiCurves() {
    if (this.d == null) {
      this.d = new ArrayList();
      Iterator<ArrayListExceptionprintstacktraceInGPackage> iterator = this.a.e().d();
      while (iterator.hasNext()) {
        ArrayListExceptionprintstacktraceInGPackage ArrayListExceptionprintstacktraceInGPackage = iterator.next();
        if (ArrayListExceptionprintstacktraceInGPackage instanceof CloneableImplInGPackage)
          this.d.add(g.a((CloneableImplInGPackage)ArrayListExceptionprintstacktraceInGPackage)); 
      } 
    } 
    return this.d;
  }
  
  public List getUiTable() {
    if (this.c == null) {
      this.c = new ArrayList();
      Iterator<CloneableImpl> iterator = this.a.n();
      while (iterator.hasNext())
        this.c.add(q.a(iterator.next())); 
    } 
    return this.c;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bl/e.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */