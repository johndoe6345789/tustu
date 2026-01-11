package bl;

import G.R;
import G.bM;
import G.be;
import G.bm;
import G.bq;
import G.bv;
import bH.D;
import bt.aV;
import bt.bh;
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
      bq bq = bM.d(this.a, paramString);
      if (bq != null)
        return (JComponent)new aV(this.a, bq); 
    } 
    if (this.a.e().c(paramString) != null) {
      bv bv = this.a.e().c(paramString);
      return (JComponent)new bh(this.a, bv);
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
      Iterator<bv> iterator = this.a.e().d();
      while (iterator.hasNext()) {
        bv bv = iterator.next();
        if (!(bv instanceof be) && !(bv instanceof bm))
          this.b.add(bv.aL()); 
      } 
    } 
    return this.b;
  }
  
  public List getUiCurves() {
    if (this.d == null) {
      this.d = new ArrayList();
      Iterator<bv> iterator = this.a.e().d();
      while (iterator.hasNext()) {
        bv bv = iterator.next();
        if (bv instanceof bm)
          this.d.add(g.a((bm)bv)); 
      } 
    } 
    return this.d;
  }
  
  public List getUiTable() {
    if (this.c == null) {
      this.c = new ArrayList();
      Iterator<be> iterator = this.a.n();
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