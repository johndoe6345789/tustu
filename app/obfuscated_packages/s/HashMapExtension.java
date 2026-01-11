package s;

import W.g;
import bH.D;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HashMapExtension extends HashMap {
  private static a a = null;
  
  private void b() {
    g g = new g();
    File file = new File("./content/settingsHelp.res");
    if (file.exists())
      try {
        Map map = g.a(this, file);
      } catch (Exception exception) {
        Logger.getLogger(a.class.getName()).log(Level.SEVERE, (String)null, exception);
        D.a("Failed to load Contect Help File: \n" + file + ", Context Help will not be available.");
      }  
  }
  
  public static a a() {
    if (a == null) {
      a = new a();
      a.b();
    } 
    return a;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/s/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */