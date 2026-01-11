package W;

import V.a;
import ak.S;
import ak.g;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DataLogReaderFactory {
  private static DataLogReaderFactory a = null;
  
  private Map b = new HashMap<>();
  
  private LogPreferences c = null;
  
  public static DataLogReaderFactory a() {
    if (a == null)
      a = new DataLogReaderFactory();
    return a;
  }
  
  public void a(String paramString, Class<?> paramClass) {
    this.b.put(paramString, paramClass);
  }
  
  private String c() {
    return (b() == null) ? "\t" : b().b();
  }
  
  private boolean d() {
    return (b() == null) ? true : b().a();
  }
  
  public V a(String paramString) {
    if (this.b.get(paramString) != null) {
      Class<V> clazz = (Class)this.b.get(paramString);
      if (clazz.equals(S.class))
        return (V)new S(c(), d()); 
      try {
        return clazz.newInstance();
      } catch (InstantiationException instantiationException) {
        Logger.getLogger(W.class.getName()).log(Level.SEVERE, (String)null, instantiationException);
      } catch (IllegalAccessException illegalAccessException) {
        Logger.getLogger(W.class.getName()).log(Level.SEVERE, (String)null, illegalAccessException);
      } 
    } 
    if (paramString.equals(X.a))
      return (V)new g(c(), d()); 
    throw new a("Unknown File Type!\nThis file format likely requires MegaLogViewer HD.");
  }
  
  public V a(File paramFile) {
    try {
      String str = X.a(paramFile);
      V v = a(str);
      if (!v.a(paramFile.getAbsolutePath())) {
        try {
          v.a();
        } catch (Exception exception) {}
        return null;
      } 
      return v;
    } catch (FileNotFoundException fileNotFoundException) {
      throw new a(fileNotFoundException.getMessage());
    } 
  }
  
  public void a(p paramp) {
    this.c = paramp;
  }
  
  public p b() {
    return this.c;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/W/W.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */