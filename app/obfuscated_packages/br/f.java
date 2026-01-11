package br;

import V.a;
import aP.dd;
import bH.D;
import java.util.ArrayList;
import java.util.List;
import javax.swing.SwingUtilities;

public class f {
  private static f b = null;
  
  List a = new ArrayList();
  
  public static f a() {
    if (b == null)
      b = new f(); 
    return b;
  }
  
  public void a(al paramal) {
    this.a.add(paramal);
  }
  
  public void b() {
    this.a.clear();
  }
  
  public List c() {
    ArrayList<String> arrayList = new ArrayList();
    for (al al : this.a) {
      if (al instanceof s) {
        s s = (s)al;
        arrayList.add(s.e());
      } 
    } 
    return arrayList;
  }
  
  public synchronized void a(String paramString) {
    if (dd.a().o() == null)
      throw new a("VE Analyze Tabs unavailable."); 
    dd.a().o().a();
    for (al al : this.a) {
      if (al instanceof s) {
        s s = (s)al;
        if (s.e().equals(paramString)) {
          s.a(!s.a());
          return;
        } 
      } 
    } 
    D.b("Could not toggle AutoTune as table not found for table: " + paramString);
  }
  
  public synchronized void a(int paramInt) {
    if (dd.a().o() == null)
      throw new a("VE Analyze Tabs unavailable."); 
    if (SwingUtilities.isEventDispatchThread()) {
      dd.a().o().a();
      try {
        ((al)this.a.get(paramInt)).a(true);
      } catch (Exception exception) {
        throw new a("Failed to start AutoTune for table index: " + paramInt + "\nError: " + exception.getLocalizedMessage());
      } 
    } else {
      g g = new g(this, paramInt);
      SwingUtilities.invokeLater(g);
    } 
  }
  
  public synchronized void b(int paramInt) {
    if (dd.a().o() == null)
      throw new a("VE Analyze Tabs unavailable."); 
    if (SwingUtilities.isEventDispatchThread()) {
      dd.a().o().a();
      try {
        ((al)this.a.get(paramInt)).a(false);
      } catch (Exception exception) {
        throw new a("Failed to stop AutoTune for table index: " + paramInt + "\nError: " + exception.getLocalizedMessage());
      } 
    } else {
      h h = new h(this, paramInt);
      SwingUtilities.invokeLater(h);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/br/f.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */