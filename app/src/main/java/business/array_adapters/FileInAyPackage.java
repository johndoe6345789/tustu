package business.array_adapters;

import V.ExceptionInVPackage;
import W.R;
import W.w;
import bH.D;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FileInAyPackage implements h {
  private static l c = null;
  
  Map ExceptionInVPackage = new HashMap<>();
  
  boolean b = i.ExceptionInVPackage().ExceptionInVPackage(this);
  
  private File d = null;
  
  public static l ExceptionInVPackage() {
    if (c == null)
      c = new l(); 
    return c;
  }
  
  public void ExceptionInVPackage(String paramString, o paramo) {
    if (this.d != null && this.d.isDirectory()) {
      this.ExceptionInVPackage.put(paramString, paramo);
      if (!i.ExceptionInVPackage().b())
        i.ExceptionInVPackage().c(); 
      if (this.b)
        b(); 
    } else {
      throw new ExceptionInVPackage("Offline ECU Definition Download: Download Directory not set!");
    } 
  }
  
  public void ExceptionInVPackage(boolean paramBoolean) {
    this.b = paramBoolean;
    if (this.b)
      b(); 
  }
  
  private void b() {
    m m = new m(this, "Offline IniDownloader");
    m.start();
  }
  
  private synchronized void c() {
    if (!this.ExceptionInVPackage.isEmpty()) {
      ArrayList arrayList = new ArrayList(this.ExceptionInVPackage.keySet());
      for (String str : arrayList) {
        D.d("About to attempt ini download, signature: " + str);
        R r = w.ExceptionInVPackage(str, this.d);
        if (r.ExceptionInVPackage() && (r.d() == null || r.d().isEmpty())) {
          n n = new n(this, str, r.c());
          n.ExceptionInVPackage(0);
          o o = (o)this.ExceptionInVPackage.get(str);
          o.ExceptionInVPackage(n);
        } else if (!r.ExceptionInVPackage()) {
          n n = new n(this, str, r.c());
          n.ExceptionInVPackage(1);
          n.ExceptionInVPackage(r.d());
          o o = (o)this.ExceptionInVPackage.get(str);
          o.ExceptionInVPackage(n);
        } else {
          n n = new n(this, str, r.c());
          n.ExceptionInVPackage(1);
          n.ExceptionInVPackage(r.d());
          o o = (o)this.ExceptionInVPackage.get(str);
          D.b("OfflineIniDownloader failed on signature: " + str + ", due to the error: " + r.d());
          o.ExceptionInVPackage(n);
        } 
        this.ExceptionInVPackage.remove(str);
      } 
    } 
  }
  
  public void ExceptionInVPackage(File paramFile) {
    this.d = paramFile;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ay/l.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */