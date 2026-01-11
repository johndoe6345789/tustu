package ay;

import V.a;
import W.R;
import W.w;
import bH.D;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class l implements h {
  private static l c = null;
  
  Map a = new HashMap<>();
  
  boolean b = i.a().a(this);
  
  private File d = null;
  
  public static l a() {
    if (c == null)
      c = new l(); 
    return c;
  }
  
  public void a(String paramString, o paramo) {
    if (this.d != null && this.d.isDirectory()) {
      this.a.put(paramString, paramo);
      if (!i.a().b())
        i.a().c(); 
      if (this.b)
        b(); 
    } else {
      throw new a("Offline ECU Definition Download: Download Directory not set!");
    } 
  }
  
  public void a(boolean paramBoolean) {
    this.b = paramBoolean;
    if (this.b)
      b(); 
  }
  
  private void b() {
    m m = new m(this, "Offline IniDownloader");
    m.start();
  }
  
  private synchronized void c() {
    if (!this.a.isEmpty()) {
      ArrayList arrayList = new ArrayList(this.a.keySet());
      for (String str : arrayList) {
        D.d("About to attempt ini download, signature: " + str);
        R r = w.a(str, this.d);
        if (r.a() && (r.d() == null || r.d().isEmpty())) {
          n n = new n(this, str, r.c());
          n.a(0);
          o o = (o)this.a.get(str);
          o.a(n);
        } else if (!r.a()) {
          n n = new n(this, str, r.c());
          n.a(1);
          n.a(r.d());
          o o = (o)this.a.get(str);
          o.a(n);
        } else {
          n n = new n(this, str, r.c());
          n.a(1);
          n.a(r.d());
          o o = (o)this.a.get(str);
          D.b("OfflineIniDownloader failed on signature: " + str + ", due to the error: " + r.d());
          o.a(n);
        } 
        this.a.remove(str);
      } 
    } 
  }
  
  public void a(File paramFile) {
    this.d = paramFile;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ay/l.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */