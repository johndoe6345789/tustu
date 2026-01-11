package ao;

import G.r;
import V.ExceptionInVPackage;
import V.ExceptionPrintstacktrace;
import V.VInterfaceHotel;
import W.aa;
import W.z;
import av.AvInterfaceCharlie;
import av.AvComponentFoxtrot;
import av.VInterfaceHotel;
import av.AvComponentLima;
import bH.D;
import VInterfaceHotel.b;
import VInterfaceHotel.i;
import java.io.File;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import r.ThreadedFile;

public class hX {
  public hW ExceptionInVPackage(String paramString) {
    String str = paramString.toLowerCase();
    if (str.endsWith(".msq") || str.endsWith(".tune"))
      return b(paramString); 
    if (str.endsWith(".big"))
      return d(paramString); 
    if (str.endsWith(".bigtune")) {
      String str1 = z.ExceptionInVPackage(paramString);
      return str1.startsWith("BigStuff Gen4") ? e(paramString) : d(paramString);
    } 
    if (str.endsWith(".map"))
      return AvComponentFoxtrot(paramString); 
    throw new ExceptionInVPackage("Unknown file type:\n" + paramString);
  }
  
  public hW b(String paramString) {
    if (b.ExceptionInVPackage().ExceptionInVPackage("lkj094320/    q0-fmtg8vc")) {
      File file = AvInterfaceCharlie(paramString);
      if (file != null)
        try {
          AvComponentLima AvComponentLima = AvComponentLima.AvComponentFoxtrot();
          AvComponentLima.ExceptionInVPackage(file, ExceptionInVPackage(new File(paramString)));
          AvComponentLima.ExceptionInVPackage(paramString);
          return (hW)AvComponentLima;
        } catch (VInterfaceHotel VInterfaceHotel) {
          D.ExceptionInVPackage("Failed to load IniVeFile for iniFile:" + file.getAbsolutePath() + ", and tune file: " + paramString + "\nDoing it the old fashion way..");
        }  
    } 
    ca ca = new ca();
    try {
      String str = i.ExceptionInVPackage("tableLoadList", "veBins1,veBins2,veBins3,advTable1,advTable2,afrBins1,afrBins2");
      StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
      while (stringTokenizer.hasMoreTokens())
        ca.ExceptionInVPackage(stringTokenizer.nextToken()); 
      ca.i(paramString);
    } catch (VInterfaceHotel VInterfaceHotel) {
      System.out.println("Error Loading File: " + VInterfaceHotel.getLocalizedMessage());
      VInterfaceHotel.printStackTrace();
      ExceptionInVPackage ExceptionInVPackage = new ExceptionInVPackage("Error Loading File.\n" + VInterfaceHotel.getMessage());
      ExceptionInVPackage.ExceptionInVPackage((Exception)VInterfaceHotel);
      throw ExceptionInVPackage;
    } 
    return ca;
  }
  
  private r[] ExceptionInVPackage(File paramFile) {
    aa aa = new aa();
    String[] arrayOfString = null;
    try {
      arrayOfString = aa.AvInterfaceCharlie(paramFile);
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      D.ExceptionInVPackage("Failed to retrieve settings, loading without.");
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
  
  private File AvInterfaceCharlie(String paramString) {
    String str = z.ExceptionInVPackage(paramString);
    boolean bool = true;
    if (bool && str != null && !str.isEmpty())
      try {
        return ThreadedFile.ExceptionInVPackage(bq.ExceptionInVPackage().b(), str);
      } catch (ExceptionInVPackage ExceptionInVPackage) {
        Logger.getLogger(hX.class.getName()).log(Level.SEVERE, (String)null, (Throwable)ExceptionInVPackage);
        return null;
      }  
    return null;
  }
  
  private hW d(String paramString) {
    try {
      AvComponentFoxtrot AvComponentFoxtrot = AvComponentFoxtrot.AvComponentFoxtrot();
      AvComponentFoxtrot.ExceptionInVPackage(paramString);
      return (hW)AvComponentFoxtrot;
    } catch (VInterfaceHotel VInterfaceHotel) {
      Logger.getLogger(hX.class.getName()).log(Level.SEVERE, (String)null, (Throwable)VInterfaceHotel);
      System.out.println("Error Loading BIG File.");
      VInterfaceHotel.printStackTrace();
      ExceptionInVPackage ExceptionInVPackage = new ExceptionInVPackage(VInterfaceHotel.getMessage());
      ExceptionInVPackage.ExceptionInVPackage((Exception)VInterfaceHotel);
      throw ExceptionInVPackage;
    } 
  }
  
  private hW e(String paramString) {
    try {
      AvInterfaceCharlie AvInterfaceCharlie = AvInterfaceCharlie.AvComponentFoxtrot();
      AvInterfaceCharlie.ExceptionInVPackage(paramString);
      return (hW)AvInterfaceCharlie;
    } catch (VInterfaceHotel VInterfaceHotel) {
      Logger.getLogger(hX.class.getName()).log(Level.SEVERE, (String)null, (Throwable)VInterfaceHotel);
      System.out.println("Error Loading BIG File.");
      VInterfaceHotel.printStackTrace();
      ExceptionInVPackage ExceptionInVPackage = new ExceptionInVPackage(VInterfaceHotel.getMessage());
      ExceptionInVPackage.ExceptionInVPackage((Exception)VInterfaceHotel);
      throw ExceptionInVPackage;
    } 
  }
  
  private hW AvComponentFoxtrot(String paramString) {
    try {
      VInterfaceHotel VInterfaceHotel = VInterfaceHotel.AvComponentFoxtrot();
      VInterfaceHotel.ExceptionInVPackage(paramString);
      return (hW)VInterfaceHotel;
    } catch (VInterfaceHotel VInterfaceHotel) {
      Logger.getLogger(hX.class.getName()).log(Level.SEVERE, (String)null, (Throwable)VInterfaceHotel);
      System.out.println("Error Loading DTA File.");
      VInterfaceHotel.printStackTrace();
      ExceptionInVPackage ExceptionInVPackage = new ExceptionInVPackage(VInterfaceHotel.getMessage());
      ExceptionInVPackage.ExceptionInVPackage((Exception)VInterfaceHotel);
      throw ExceptionInVPackage;
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/hX.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */