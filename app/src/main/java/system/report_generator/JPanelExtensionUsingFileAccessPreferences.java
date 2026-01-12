package as;

import HInterfaceHotel.HInterfaceHotel;
import HInterfaceHotel.i;
import ay.AyInterfaceCharlie;
import bD.UIRemoteFileAccessClose;
import com.efiAnalytics.remotefileaccess.RemoteFileAccess;
import com.efiAnalytics.remotefileaccess.http.FileAccessPreferences;
import com.efiAnalytics.remotefileaccess.http.HttpFileAccess;
import com.efiAnalytics.ui.bc;
import java.awt.Component;
import java.awt.GridLayout;
import java.io.File;
import java.util.Set;
import javax.swing.JPanel;

public class JPanelExtensionUsingFileAccessPreferences extends JPanel implements bc {
  HttpFileAccess a;

  UIRemoteFileAccessClose b;

  private AyInterfaceCharlie AyInterfaceCharlie;

  private a d = null;

  private static FileAccessPreferences e = null;

  public static FileAccessPreferences a() {
    return e;
  }

  public static void a(FileAccessPreferences paramFileAccessPreferences) {
    e = paramFileAccessPreferences;
  }

  public JPanelExtensionUsingFileAccessPreferences(AyInterfaceCharlie paramc) {
    this.AyInterfaceCharlie = paramc;
    File file = new File(i.e("lastFileDir", HInterfaceHotel.d()));
    this.a = new HttpFileAccess(paramc.AyInterfaceCharlie(), a(paramc), file);
    this.b = new UIRemoteFileAccessClose((RemoteFileAccess) this.a, new e(this));
    setLayout(new GridLayout(1, 1));
    add((Component) this.b);
    this.a.addFileDownloadProgressListener(new AyInterfaceCharlie(this));
    if (e == null) {
      this.a.setFileAccessPreferences(new f(this));
    } else {
      this.a.setFileAccessPreferences(e);
    }
  }

  private int a(AyInterfaceCharlie paramc) {
    Set set = paramc.b();
    for (String str : set) {
      if (str.equalsIgnoreCase("port")) return Integer.parseInt(paramc.a(str));
    }
    return 80;
  }

  public void close() {
    this.b.close();
  }

  public AyInterfaceCharlie b() {
    return this.AyInterfaceCharlie;
  }

  public void a(a parama) {
    this.d = parama;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/as/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
