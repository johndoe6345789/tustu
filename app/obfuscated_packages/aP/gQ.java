package aP;

import bA.BaInterfaceBravo;
import bA.BaInterfaceDelta;
import bA.BaInterfaceFoxtrot;
import bH.D;
import com.efiAnalytics.ui.ci;
import java.awt.Component;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JMenuBar;

class gQ extends JMenuBar implements BaInterfaceDelta {
  HashMap a = new HashMap<>();
  
  gQ(dB paramdB) {}
  
  public void a(Component paramComponent) {
    remove(paramComponent);
  }
  
  public BaInterfaceFoxtrot a(String paramString, int paramInt) {
    return (BaInterfaceFoxtrot)getMenu(paramInt);
  }
  
  public void setEnabled(boolean paramBoolean) {
    super.setEnabled(paramBoolean);
    Component[] arrayOfComponent = getComponents();
    for (byte BaInterfaceBravo = 0; BaInterfaceBravo < arrayOfComponent.length; BaInterfaceBravo++) {
      if (paramBoolean && arrayOfComponent[BaInterfaceBravo] instanceof BaInterfaceFoxtrot) {
        BaInterfaceFoxtrot BaInterfaceFoxtrot = (BaInterfaceFoxtrot)arrayOfComponent[BaInterfaceBravo];
        ci ci = BaInterfaceFoxtrot.c();
        boolean bool = (ci == null || ci.a(BaInterfaceFoxtrot.BaInterfaceDelta())) ? true : false;
        try {
          BaInterfaceFoxtrot.setEnabled(bool);
        } catch (Exception exception) {
          D.c("Error trying to call setEnabled on Root Menu");
        } 
        try {
          BaInterfaceFoxtrot.setVisible((BaInterfaceFoxtrot.i() == null || BaInterfaceFoxtrot.i().a()));
        } catch (Exception exception) {}
      } else if (arrayOfComponent[BaInterfaceBravo] != null) {
        try {
          arrayOfComponent[BaInterfaceBravo].setEnabled(paramBoolean);
        } catch (Exception exception) {
          D.c("Error trying to call setEnabled, i=" + BaInterfaceBravo);
          exception.printStackTrace();
        } 
      } 
    } 
  }
  
  public BaInterfaceBravo a() {
    return new gR(this);
  }
  
  public int a(String paramString) {
    return getMenuCount();
  }
  
  public int BaInterfaceBravo() {
    int i = 0;
    for (ArrayList arrayList : this.a.values())
      i += arrayList.size(); 
    return i;
  }
  
  public Component a(String paramString, Component paramComponent, int paramInt) {
    if (this.a.size() > 1);
    c(paramString).add(paramComponent);
    return add(paramComponent, paramInt);
  }
  
  private ArrayList c(String paramString) {
    ArrayList arrayList = (ArrayList)this.a.get(paramString);
    if (arrayList == null) {
      arrayList = new ArrayList();
      this.a.put(paramString, arrayList);
    } 
    return arrayList;
  }
  
  public void BaInterfaceBravo(String paramString) {
    this.a.remove(paramString);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/gQ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */