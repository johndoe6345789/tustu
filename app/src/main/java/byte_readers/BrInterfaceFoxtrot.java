package br;

import V.ExceptionInVPackage;
import aP.ThreadedJFrameIsoptimizeddrawingenabled;
import bH.D;
import java.util.ArrayList;
import java.util.List;
import javax.swing.SwingUtilities;

public class BrInterfaceFoxtrot {
  private static f b = null;
  
  List ExceptionInVPackage = new ArrayList();
  
  public static f ExceptionInVPackage() {
    if (b == null)
      b = new f(); 
    return b;
  }
  
  public void ExceptionInVPackage(al paramal) {
    this.ExceptionInVPackage.add(paramal);
  }
  
  public void b() {
    this.ExceptionInVPackage.clear();
  }
  
  public List c() {
    ArrayList<String> arrayList = new ArrayList();
    for (al al : this.ExceptionInVPackage) {
      if (al instanceof s) {
        s s = (s)al;
        arrayList.add(s.e());
      } 
    } 
    return arrayList;
  }
  
  public synchronized void ExceptionInVPackage(String paramString) {
    if (ThreadedJFrameIsoptimizeddrawingenabled.ExceptionInVPackage().o() == null)
      throw new ExceptionInVPackage("VE Analyze Tabs unavailable."); 
    ThreadedJFrameIsoptimizeddrawingenabled.ExceptionInVPackage().o().ExceptionInVPackage();
    for (al al : this.ExceptionInVPackage) {
      if (al instanceof s) {
        s s = (s)al;
        if (s.e().equals(paramString)) {
          s.ExceptionInVPackage(!s.ExceptionInVPackage());
          return;
        } 
      } 
    } 
    D.b("Could not toggle AutoTune as table not found for table: " + paramString);
  }
  
  public synchronized void ExceptionInVPackage(int paramInt) {
    if (ThreadedJFrameIsoptimizeddrawingenabled.ExceptionInVPackage().o() == null)
      throw new ExceptionInVPackage("VE Analyze Tabs unavailable."); 
    if (SwingUtilities.isEventDispatchThread()) {
      ThreadedJFrameIsoptimizeddrawingenabled.ExceptionInVPackage().o().ExceptionInVPackage();
      try {
        ((al)this.ExceptionInVPackage.get(paramInt)).ExceptionInVPackage(true);
      } catch (Exception exception) {
        throw new ExceptionInVPackage("Failed to start AutoTune for table index: " + paramInt + "\nError: " + exception.getLocalizedMessage());
      } 
    } else {
      g g = new g(this, paramInt);
      SwingUtilities.invokeLater(g);
    } 
  }
  
  public synchronized void b(int paramInt) {
    if (ThreadedJFrameIsoptimizeddrawingenabled.ExceptionInVPackage().o() == null)
      throw new ExceptionInVPackage("VE Analyze Tabs unavailable."); 
    if (SwingUtilities.isEventDispatchThread()) {
      ThreadedJFrameIsoptimizeddrawingenabled.ExceptionInVPackage().o().ExceptionInVPackage();
      try {
        ((al)this.ExceptionInVPackage.get(paramInt)).ExceptionInVPackage(false);
      } catch (Exception exception) {
        throw new ExceptionInVPackage("Failed to stop AutoTune for table index: " + paramInt + "\nError: " + exception.getLocalizedMessage());
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