package aP;

import bA.b;
import bA.d;
import bA.f;
import bH.D;
import com.efiAnalytics.ui.ci;
import java.awt.Component;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JMenuBar;

class gQ extends JMenuBar implements d {
  HashMap a = new HashMap<>();
  
  gQ(dB paramdB) {}
  
  public void a(Component paramComponent) {
    remove(paramComponent);
  }
  
  public f a(String paramString, int paramInt) {
    return (f)getMenu(paramInt);
  }
  
  public void setEnabled(boolean paramBoolean) {
    super.setEnabled(paramBoolean);
    Component[] arrayOfComponent = getComponents();
    for (byte b = 0; b < arrayOfComponent.length; b++) {
      if (paramBoolean && arrayOfComponent[b] instanceof f) {
        f f = (f)arrayOfComponent[b];
        ci ci = f.c();
        boolean bool = (ci == null || ci.a(f.d())) ? true : false;
        try {
          f.setEnabled(bool);
        } catch (Exception exception) {
          D.c("Error trying to call setEnabled on Root Menu");
        } 
        try {
          f.setVisible((f.i() == null || f.i().a()));
        } catch (Exception exception) {}
      } else if (arrayOfComponent[b] != null) {
        try {
          arrayOfComponent[b].setEnabled(paramBoolean);
        } catch (Exception exception) {
          D.c("Error trying to call setEnabled, i=" + b);
          exception.printStackTrace();
        } 
      } 
    } 
  }
  
  public b a() {
    return new gR(this);
  }
  
  public int a(String paramString) {
    return getMenuCount();
  }
  
  public int b() {
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
  
  public void b(String paramString) {
    this.a.remove(paramString);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/gQ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */