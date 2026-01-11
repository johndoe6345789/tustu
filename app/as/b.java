package as;

import ay.c;
import bD.r;
import com.efiAnalytics.remotefileaccess.RemoteFileAccess;
import com.efiAnalytics.remotefileaccess.http.FileAccessPreferences;
import com.efiAnalytics.remotefileaccess.http.HttpFileAccess;
import com.efiAnalytics.ui.bc;
import h.h;
import h.i;
import java.awt.Component;
import java.awt.GridLayout;
import java.io.File;
import java.util.Set;
import javax.swing.JPanel;

public class b extends JPanel implements bc {
  HttpFileAccess a;
  
  r b;
  
  private c c;
  
  private a d = null;
  
  private static FileAccessPreferences e = null;
  
  public static FileAccessPreferences a() {
    return e;
  }
  
  public static void a(FileAccessPreferences paramFileAccessPreferences) {
    e = paramFileAccessPreferences;
  }
  
  public b(c paramc) {
    this.c = paramc;
    File file = new File(i.e("lastFileDir", h.d()));
    this.a = new HttpFileAccess(paramc.c(), a(paramc), file);
    this.b = new r((RemoteFileAccess)this.a, new e(this));
    setLayout(new GridLayout(1, 1));
    add((Component)this.b);
    this.a.addFileDownloadProgressListener(new c(this));
    if (e == null) {
      this.a.setFileAccessPreferences(new f(this));
    } else {
      this.a.setFileAccessPreferences(e);
    } 
  }
  
  private int a(c paramc) {
    Set set = paramc.b();
    for (String str : set) {
      if (str.equalsIgnoreCase("port"))
        return Integer.parseInt(paramc.a(str)); 
    } 
    return 80;
  }
  
  public void close() {
    this.b.close();
  }
  
  public c b() {
    return this.c;
  }
  
  public void a(a parama) {
    this.d = parama;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/as/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */