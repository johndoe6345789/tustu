package W;

import bH.D;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileChangeMonitor extends Thread {
  private static FileChangeMonitor a = null;
  
  private List b = Collections.synchronizedList(new ArrayList());
  
  private C() {
    super("File Change monitor");
    setDaemon(true);
  }
  
  public static C a() {
    if (a == null) {
      a = new C();
      a.start();
    } 
    return a;
  }
  
  public void a(File paramFile) {
    ae ae = new ae(paramFile);
    this.b.add(ae);
  }
  
  public boolean a(File paramFile, B paramB) {
    ae ae = f(paramFile);
    boolean bool = false;
    if (ae == null) {
      a(paramFile);
      ae = f(paramFile);
      bool = true;
    } 
    ae.a(paramB);
    return bool;
  }
  
  public void b(File paramFile) {
    ae ae = f(paramFile);
    if (ae != null) {
      ae.h();
      this.b.remove(ae);
    } 
  }
  
  public void c(File paramFile) {
    ae ae = f(paramFile);
    if (ae != null) {
      ae.c();
    } else {
      D.d("file:" + paramFile.getName() + " is not Monitored, cannot pause Monitoring of it.");
    } 
  }
  
  public void d(File paramFile) {
    ae ae = f(paramFile);
    if (ae != null) {
      ae.d();
    } else {
      D.d("file:" + paramFile.getName() + " is not Monitored, cannot unpause Monitoring of it.");
    } 
  }
  
  public void e(File paramFile) {
    boolean bool = g(paramFile);
    if (!bool)
      D.d("file:" + paramFile.getName() + " is not Monitored, cannot stop Monitoring it."); 
  }
  
  private ae f(File paramFile) {
    for (ae ae : this.b) {
      if (ae.g().equals(paramFile))
        return ae; 
    } 
    return null;
  }
  
  private boolean g(File paramFile) {
    Iterator<ae> iterator = this.b.iterator();
    while (iterator.hasNext()) {
      ae ae = iterator.next();
      if (ae.g().equals(paramFile)) {
        iterator.remove();
        return true;
      } 
    } 
    return false;
  }
  
  private synchronized void a(int paramInt) {
    try {
      wait(paramInt);
    } catch (InterruptedException interruptedException) {
      Logger.getLogger(C.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
    } 
  }
  
  public void run() {
    while (true) {
      a(1000);
      for (ae ae : this.b) {
        if (ae.e()) {
          ae.f();
          ae.b();
        } 
      } 
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/W/C.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */