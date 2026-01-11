package aW;

import A.AInterfaceRomeo;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.swing.JPanel;

public class AwInterfaceOscar extends JPanel implements p {
  HashMap a = new HashMap<>();
  
  List b = new ArrayList();
  
  a c;
  
  public AwInterfaceOscar(a parama) {
    setLayout(new GridLayout(0, 1));
    this.c = parama;
  }
  
  public void a(List<AInterfaceRomeo> paramList) {
    a();
    for (byte b = 0; b < paramList.size(); b++) {
      e e = new e(this.c, paramList.get(b));
      e.a(this);
      add(e);
      this.a.put(((AInterfaceRomeo)paramList.get(b)).c(), e);
    } 
  }
  
  public void a() {
    this.a.clear();
    removeAll();
  }
  
  public Object a(String paramString) {
    e e = (e)this.a.get(paramString);
    return (e != null) ? e.a() : null;
  }
  
  public boolean a(String paramString, Object paramObject) {
    e e = (e)this.a.get(paramString);
    if (e != null) {
      e.a(paramObject);
      return true;
    } 
    return false;
  }
  
  public void a(p paramp) {
    this.b.add(paramp);
  }
  
  private void b(String paramString1, String paramString2) {
    for (p p1 : this.b)
      p1.a(paramString1, paramString2); 
  }
  
  public boolean b() {
    boolean bool = true;
    for (e e : this.a.values()) {
      if (!e.d()) {
        bool = false;
        e.b();
      } 
    } 
    return bool;
  }
  
  public void a(String paramString1, String paramString2) {
    b(paramString1, paramString2);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aW/o.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */