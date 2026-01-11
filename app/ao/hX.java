package ao;

import G.r;
import V.a;
import V.g;
import V.h;
import W.aa;
import W.z;
import av.c;
import av.f;
import av.h;
import av.l;
import bH.D;
import h.b;
import h.i;
import java.io.File;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import r.j;

public class hX {
  public hW a(String paramString) {
    String str = paramString.toLowerCase();
    if (str.endsWith(".msq") || str.endsWith(".tune"))
      return b(paramString); 
    if (str.endsWith(".big"))
      return d(paramString); 
    if (str.endsWith(".bigtune")) {
      String str1 = z.a(paramString);
      return str1.startsWith("BigStuff Gen4") ? e(paramString) : d(paramString);
    } 
    if (str.endsWith(".map"))
      return f(paramString); 
    throw new a("Unknown file type:\n" + paramString);
  }
  
  public hW b(String paramString) {
    if (b.a().a("lkj094320/    q0-fmtg8vc")) {
      File file = c(paramString);
      if (file != null)
        try {
          l l = l.f();
          l.a(file, a(new File(paramString)));
          l.a(paramString);
          return (hW)l;
        } catch (h h) {
          D.a("Failed to load IniVeFile for iniFile:" + file.getAbsolutePath() + ", and tune file: " + paramString + "\nDoing it the old fashion way..");
        }  
    } 
    ca ca = new ca();
    try {
      String str = i.a("tableLoadList", "veBins1,veBins2,veBins3,advTable1,advTable2,afrBins1,afrBins2");
      StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
      while (stringTokenizer.hasMoreTokens())
        ca.a(stringTokenizer.nextToken()); 
      ca.i(paramString);
    } catch (h h) {
      System.out.println("Error Loading File: " + h.getLocalizedMessage());
      h.printStackTrace();
      a a = new a("Error Loading File.\n" + h.getMessage());
      a.a((Exception)h);
      throw a;
    } 
    return ca;
  }
  
  private r[] a(File paramFile) {
    aa aa = new aa();
    String[] arrayOfString = null;
    try {
      arrayOfString = aa.c(paramFile);
    } catch (g g) {
      D.a("Failed to retrieve settings, loading without.");
    } 
    r[] arrayOfR = null;
    if (arrayOfString != null) {
      arrayOfR = new r[arrayOfString.length];
      for (byte b = 0; b < arrayOfString.length; b++) {
        arrayOfR[b] = new r();
        arrayOfR[b].v(arrayOfString[b]);
      } 
    } 
    return arrayOfR;
  }
  
  private File c(String paramString) {
    String str = z.a(paramString);
    boolean bool = true;
    if (bool && str != null && !str.isEmpty())
      try {
        return j.a(bq.a().b(), str);
      } catch (a a) {
        Logger.getLogger(hX.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a);
        return null;
      }  
    return null;
  }
  
  private hW d(String paramString) {
    try {
      f f = f.f();
      f.a(paramString);
      return (hW)f;
    } catch (h h) {
      Logger.getLogger(hX.class.getName()).log(Level.SEVERE, (String)null, (Throwable)h);
      System.out.println("Error Loading BIG File.");
      h.printStackTrace();
      a a = new a(h.getMessage());
      a.a((Exception)h);
      throw a;
    } 
  }
  
  private hW e(String paramString) {
    try {
      c c = c.f();
      c.a(paramString);
      return (hW)c;
    } catch (h h) {
      Logger.getLogger(hX.class.getName()).log(Level.SEVERE, (String)null, (Throwable)h);
      System.out.println("Error Loading BIG File.");
      h.printStackTrace();
      a a = new a(h.getMessage());
      a.a((Exception)h);
      throw a;
    } 
  }
  
  private hW f(String paramString) {
    try {
      h h = h.f();
      h.a(paramString);
      return (hW)h;
    } catch (h h) {
      Logger.getLogger(hX.class.getName()).log(Level.SEVERE, (String)null, (Throwable)h);
      System.out.println("Error Loading DTA File.");
      h.printStackTrace();
      a a = new a(h.getMessage());
      a.a((Exception)h);
      throw a;
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/hX.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */